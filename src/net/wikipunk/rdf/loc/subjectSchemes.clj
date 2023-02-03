(ns net.wikipunk.rdf.loc.subjectSchemes
  "http://id.loc.gov/vocabulary/subjectSchemes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/subjectSchemes.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.subjectSchemes"
                       "http://id.loc.gov/vocabulary/subjectSchemes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.subjectSchemes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/subjectSchemes/"}
  (:refer-clojure :exclude [test]))

(def aass
  "Published in \"A guide for establishing Asian American core collections\" (Berkeley, CA: Asian American Studies Library, University of California, Berkeley)"
  {:db/ident :loc.subjectSchemes/aass,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Asian American Studies Library subject headings",
   :madsrdf/code "aass",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published in \"A guide for establishing Asian American core collections\" (Berkeley, CA: Asian American Studies Library, University of California, Berkeley)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/aass,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published in \"A guide for establishing Asian American core collections\" (Berkeley, CA: Asian American Studies Library, University of California, Berkeley)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "aass",
   :skos/prefLabel "Asian American Studies Library subject headings"})

(def aat
  "Published by Getty Research Institute in Los Angeles, CA"
  {:db/ident :loc.subjectSchemes/aat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Art & architecture thesaurus",
   :madsrdf/code "aat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Getty Research Institute in Los Angeles, CA"},
   :madsrdf/editorialNote
   "http://www.getty.edu/research/tools/vocabularies/aat/index.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/aat,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Getty Research Institute in Los Angeles, CA"},
   :skos/editorial
   "http://www.getty.edu/research/tools/vocabularies/aat/index.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "aat",
   :skos/prefLabel "Art & architecture thesaurus"})

(def aatnor
  "Published by Directorate for ICT and Joint Services in Higher Education and Research in Norway"
  {:db/ident :loc.subjectSchemes/aatnor,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Art and architectural thesaurus terms translated into Norwegian",
   :madsrdf/code "aatnor",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Directorate for ICT and Joint Services in Higher Education and Research in Norway"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/aatnor,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Directorate for ICT and Joint Services in Higher Education and Research in Norway"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "aatnor",
   :skos/prefLabel
   "Art and architectural thesaurus terms translated into Norwegian"})

(def abne
  "Published by Biblioteca Nacional de España in Madrid"
  {:db/ident :loc.subjectSchemes/abne,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Autoridades de la Biblioteca Nacional de España",
   :madsrdf/code "abne",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Biblioteca Nacional de España in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/abne,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Biblioteca Nacional de España in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "abne",
   :skos/prefLabel "Autoridades de la Biblioteca Nacional de España"})

(def aedoml
  "Published by Asociación Española de Documentación Musical in Madrid"
  {:db/ident :loc.subjectSchemes/aedoml,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Listado de encabezamientos de materia de música",
   :madsrdf/code "aedoml",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Asociación Española de Documentación Musical in Madrid"},
   :madsrdf/editorialNote "https://www.aedom.org/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/aedoml,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Asociación Española de Documentación Musical in Madrid"},
   :skos/editorial "https://www.aedom.org/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "aedoml",
   :skos/prefLabel "Listado de encabezamientos de materia de música"})

(def afo
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/afo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AFO - Viikin kampuskirjaston ontologia",
   :madsrdf/code "afo",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/afo,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "afo",
   :skos/prefLabel "AFO - Viikin kampuskirjaston ontologia"})

(def afset
  "American Folklore Society ethnographic thesaurus"
  {:db/ident :loc.subjectSchemes/afset,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "American Folklore Society ethnographic thesaurus",
   :madsrdf/code "afset",
   :madsrdf/editorialNote
   "https://id.loc.gov/vocabulary/ethnographicTerms.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/afset,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://id.loc.gov/vocabulary/ethnographicTerms.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "afset",
   :skos/prefLabel "American Folklore Society ethnographic thesaurus"})

(def agrifors
  "Published by Helsingin Yliopisto in Helsinki"
  {:db/ident :loc.subjectSchemes/agrifors,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "AGRIFOREST-sanasto",
   :madsrdf/code "agrifors",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Helsingin Yliopisto in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/agrifors,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/agrifors,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Helsingin Yliopisto in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "agrifors",
   :skos/prefLabel "AGRIFOREST-sanasto"})

(def agrovoc
  "Published by APIMONDIA in Rome"
  {:db/ident :loc.subjectSchemes/agrovoc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AGROVOC multilingual agricultural thesaurus",
   :madsrdf/code "agrovoc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by APIMONDIA in Rome"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/agrovoc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by APIMONDIA in Rome"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "agrovoc",
   :skos/prefLabel "AGROVOC multilingual agricultural thesaurus"})

(def agrovocf
  "Published by APIMONDIA in Rome"
  {:db/ident :loc.subjectSchemes/agrovocf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AGROVOC thésaurus agricole multilingue",
   :madsrdf/code "agrovocf",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by APIMONDIA in Rome"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/agrovocf,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by APIMONDIA in Rome"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "agrovocf",
   :skos/prefLabel "AGROVOC thésaurus agricole multilingue"})

(def agrovocs
  "Published by APIMONDIA in Rome"
  {:db/ident :loc.subjectSchemes/agrovocs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AGROVOC tesauro agrícola multilingée",
   :madsrdf/code "agrovocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by APIMONDIA in Rome"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/agrovocs,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by APIMONDIA in Rome"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "agrovocs",
   :skos/prefLabel "AGROVOC tesauro agrícola multilingée"})

(def aiatsisl
  "Published by Australian Institute of Aboriginal and Torres Strait Islander Studies in Canberra"
  {:db/ident :loc.subjectSchemes/aiatsisl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AIATSIS language thesaurus",
   :madsrdf/code "aiatsisl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Australian Institute of Aboriginal and Torres Strait Islander Studies in Canberra"},
   :madsrdf/editorialNote "http://www1.aiatsis.gov.au/index.asp",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/aiatsisl,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Australian Institute of Aboriginal and Torres Strait Islander Studies in Canberra"},
   :skos/editorial "http://www1.aiatsis.gov.au/index.asp",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "aiatsisl",
   :skos/prefLabel "AIATSIS language thesaurus"})

(def aiatsisp
  "Published by Australian Institute of Aboriginal and Torres Strait Islander Studies in Canberra"
  {:db/ident :loc.subjectSchemes/aiatsisp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AIATSIS place thesaurus",
   :madsrdf/code "aiatsisp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Australian Institute of Aboriginal and Torres Strait Islander Studies in Canberra"},
   :madsrdf/editorialNote "http://www1.aiatsis.gov.au/index.asp",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/aiatsisp,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Australian Institute of Aboriginal and Torres Strait Islander Studies in Canberra"},
   :skos/editorial "http://www1.aiatsis.gov.au/index.asp",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "aiatsisp",
   :skos/prefLabel "AIATSIS place thesaurus"})

(def aiatsiss
  "Published by Australian Institute of Aboriginal and Torres Strait Islander Studies in Canberra"
  {:db/ident :loc.subjectSchemes/aiatsiss,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AIATSIS subject thesaurus",
   :madsrdf/code "aiatsiss",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Australian Institute of Aboriginal and Torres Strait Islander Studies in Canberra"},
   :madsrdf/editorialNote "http://www1.aiatsis.gov.au/index.asp",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/aiatsiss,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Australian Institute of Aboriginal and Torres Strait Islander Studies in Canberra"},
   :skos/editorial "http://www1.aiatsis.gov.au/index.asp",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "aiatsiss",
   :skos/prefLabel "AIATSIS subject thesaurus"})

(def aktp
  "Published by Papacharalampeios Dēmosia Kentrikē Vivliothēkē Naupaktou in Naupaktos"
  {:db/ident :loc.subjectSchemes/aktp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Alphavētikos Katalogos Thematikōn Perigrapheōn",
   :madsrdf/code "aktp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Papacharalampeios Dēmosia Kentrikē Vivliothēkē Naupaktou in Naupaktos"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/aktp,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Papacharalampeios Dēmosia Kentrikē Vivliothēkē Naupaktou in Naupaktos"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "aktp",
   :skos/prefLabel "Alphavētikos Katalogos Thematikōn Perigrapheōn"})

(def albt
  "Published by Arbetslivsbiblioteket in Stockholm"
  {:db/ident :loc.subjectSchemes/albt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Arbetslivsbibliotekets tesaurus",
   :madsrdf/code "albt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Arbetslivsbiblioteket in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/albt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Arbetslivsbiblioteket in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "albt",
   :skos/prefLabel "Arbetslivsbibliotekets tesaurus"})

(def allars
  "Published by BTJ Kirjastopalvelu in Helsingfors"
  {:db/ident :loc.subjectSchemes/allars,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Allärs: allmän tesaurus pä svenska",
   :madsrdf/code "allars",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by BTJ Kirjastopalvelu in Helsingfors"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/allars,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/allars,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by BTJ Kirjastopalvelu in Helsingfors"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "allars",
   :skos/prefLabel "Allärs: allmän tesaurus pä svenska"})

(def apaist
  "Published by National Library of Australia in Canberra"
  {:db/ident :loc.subjectSchemes/apaist,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "APAIS thesaurus: a list of subject terms used in the Australian Public Affairs Information Service",
   :madsrdf/code "apaist",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by National Library of Australia in Canberra"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/apaist,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Australia in Canberra"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "apaist",
   :skos/prefLabel
   "APAIS thesaurus: a list of subject terms used in the Australian Public Affairs Information Service"})

(def armarc
  "Lista ARMARC de encabezamientos de materia para bibliotecas mayores"
  {:db/ident :loc.subjectSchemes/armarc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Lista ARMARC de encabezamientos de materia para bibliotecas mayores",
   :madsrdf/code "armarc",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/armarc,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "armarc",
   :skos/prefLabel
   "Lista ARMARC de encabezamientos de materia para bibliotecas mayores"})

(def ascl
  "Published by ASC Leiden"
  {:db/ident :loc.subjectSchemes/ascl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "African Studies thesaurus",
   :madsrdf/code "ascl",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by ASC Leiden"},
   :madsrdf/editorialNote "http://thesaurus.ascleiden.nl/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ascl,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by ASC Leiden"},
   :skos/editorial "http://thesaurus.ascleiden.nl/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ascl",
   :skos/prefLabel "African Studies thesaurus"})

(def asft
  "Published by Cambridge Scientific Abstracts in Rome"
  {:db/ident :loc.subjectSchemes/asft,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Aquatic sciences and fisheries thesaurus",
   :madsrdf/code "asft",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Cambridge Scientific Abstracts in Rome"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/asft,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Cambridge Scientific Abstracts in Rome"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "asft",
   :skos/prefLabel "Aquatic sciences and fisheries thesaurus"})

(def ashlnl
  "Published by Lebanese National Library"
  {:db/ident :loc.subjectSchemes/ashlnl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Arabic subject headings of the Lebanese National Library (ASH) = Ru'ûs al-Mawdû'ât al-'Arabîyah lil-Maktabah al-Waṭanīyah al-Lubnānīyah",
   :madsrdf/code "ashlnl",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Lebanese National Library"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ashlnl,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Lebanese National Library"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ashlnl",
   :skos/prefLabel
   "Arabic subject headings of the Lebanese National Library (ASH) = Ru'ûs al-Mawdû'ât al-'Arabîyah lil-Maktabah al-Waṭanīyah al-Lubnānīyah"})

(def asrcrfcd
  "Published by Australian Bureau of Statistics in Canberra"
  {:db/ident :loc.subjectSchemes/asrcrfcd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Australian standard research classification: research fields, courses and disciplines (RFCD) classification",
   :madsrdf/code "asrcrfcd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Australian Bureau of Statistics in Canberra"},
   :madsrdf/editorialNote
   "http://www.abs.gov.au/ausstats/abs@.nsf/66f306f503e529a5ca25697e0017661f/955FFA4EB1B23847CA25697E0018FB14?opendocument",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/asrcrfcd,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Australian Bureau of Statistics in Canberra"},
   :skos/editorial
   "http://www.abs.gov.au/ausstats/abs@.nsf/66f306f503e529a5ca25697e0017661f/955FFA4EB1B23847CA25697E0018FB14?opendocument",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "asrcrfcd",
   :skos/prefLabel
   "Australian standard research classification: research fields, courses and disciplines (RFCD) classification"})

(def asrcseo
  "Published by Australian Bureau of Statistics in Canberra"
  {:db/ident :loc.subjectSchemes/asrcseo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Australian standard research classification: socio-economic objective (SEO) classification",
   :madsrdf/code "asrcseo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Australian Bureau of Statistics in Canberra"},
   :madsrdf/editorialNote
   "http://www.abs.gov.au/ausstats/abs@.nsf/66f306f503e529a5ca25697e0017661f/B0D91B900555CA72CA25697E0018FB68?opendocument",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/asrcseo,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Australian Bureau of Statistics in Canberra"},
   :skos/editorial
   "http://www.abs.gov.au/ausstats/abs@.nsf/66f306f503e529a5ca25697e0017661f/B0D91B900555CA72CA25697E0018FB68?opendocument",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "asrcseo",
   :skos/prefLabel
   "Australian standard research classification: socio-economic objective (SEO) classification"})

(def asrctoa
  "Published by Australian Bureau of Statistics in Canberra"
  {:db/ident :loc.subjectSchemes/asrctoa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Australian standard research classification: type of activity (TOA) classification",
   :madsrdf/code "asrctoa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Australian Bureau of Statistics in Canberra"},
   :madsrdf/editorialNote
   "http://www.abs.gov.au/ausstats/abs@.nsf/66f306f503e529a5ca25697e0017661f/B0D91B900555CA72CA25697E0018FB68?opendocument",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/asrctoa,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Australian Bureau of Statistics in Canberra"},
   :skos/editorial
   "http://www.abs.gov.au/ausstats/abs@.nsf/66f306f503e529a5ca25697e0017661f/B0D91B900555CA72CA25697E0018FB68?opendocument",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "asrctoa",
   :skos/prefLabel
   "Australian standard research classification: type of activity (TOA) classification"})

(def asth
  "Published by Anglo-Australian Observatory for the International Astronomical Union in Epping, N.S.W."
  {:db/ident :loc.subjectSchemes/asth,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Astronomy thesaurus",
   :madsrdf/code "asth",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Anglo-Australian Observatory for the International Astronomical Union in Epping, N.S.W."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/asth,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Anglo-Australian Observatory for the International Astronomical Union in Epping, N.S.W."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "asth",
   :skos/prefLabel "Astronomy thesaurus"})

(def ated
  "Published by Australian Council for Educational Research in Melbourne, Vic."
  {:db/ident :loc.subjectSchemes/ated,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Australian thesaurus of education descriptors (ATED)",
   :madsrdf/code "ated",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Australian Council for Educational Research in Melbourne, Vic."},
   :madsrdf/editorialNote
   "http://cunningham.acer.edu.au/multites2007/index.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ated,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Australian Council for Educational Research in Melbourne, Vic."},
   :skos/editorial "http://cunningham.acer.edu.au/multites2007/index.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ated",
   :skos/prefLabel "Australian thesaurus of education descriptors (ATED)"})

(def atg
  "Published by National Agricultural Library in Beltsville, MD"
  {:db/ident :loc.subjectSchemes/atg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Agricultural thesaurus and glossary",
   :madsrdf/code "atg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by National Agricultural Library in Beltsville, MD"},
   :madsrdf/editorialNote "https://agclass.nal.usda.gov/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/atg,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by National Agricultural Library in Beltsville, MD"},
   :skos/editorial "https://agclass.nal.usda.gov/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "atg",
   :skos/prefLabel "Agricultural thesaurus and glossary"})

(def atla
  "Published by American Theological Library Association in Evanston, IL"
  {:db/ident :loc.subjectSchemes/atla,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Religion indexes: thesaurus",
   :madsrdf/code "atla",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by American Theological Library Association in Evanston, IL"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/atla,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by American Theological Library Association in Evanston, IL"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "atla",
   :skos/prefLabel "Religion indexes: thesaurus"})

(def aucsh
  "Qâ'imat ru'ûs mawdû'ât al-fahras al-'Arabîyah al-mowahad = Arabic Union Catalog Subject Headings"
  {:db/ident :loc.subjectSchemes/aucsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Qâ'imat ru'ûs mawdû'ât al-fahras al-'Arabîyah al-mowahad = Arabic Union Catalog Subject Headings",
   :madsrdf/code "aucsh",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/aucsh,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "aucsh",
   :skos/prefLabel
   "Qâ'imat ru'ûs mawdû'ât al-fahras al-'Arabîyah al-mowahad = Arabic Union Catalog Subject Headings"})

(def ausext
  "Published by Libraries Australia"
  {:db/ident :loc.subjectSchemes/ausext,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Australian extension to LCSH",
   :madsrdf/code "ausext",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Libraries Australia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ausext,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Libraries Australia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ausext",
   :skos/prefLabel "Australian extension to LCSH"})

(def bare
  "[Published by the National Library of Norway, this list was formerly called BIBSYS authority register (BARE)]"
  {:db/ident :loc.subjectSchemes/bare,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Norwegian Authority File: Persons and Corporate Bodies",
   :madsrdf/code "bare",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "[Published by the National Library of Norway, this list was formerly called BIBSYS authority register (BARE)]"},
   :madsrdf/editorialNote "https://authority.bibsys.no/authority/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bare,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "[Published by the National Library of Norway, this list was formerly called BIBSYS authority register (BARE)]"},
   :skos/editorial "https://authority.bibsys.no/authority/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bare",
   :skos/prefLabel "Norwegian Authority File: Persons and Corporate Bodies"})

(def barn
  "Published by Svensk biblioteksförening on Stockholm"
  {:db/ident :loc.subjectSchemes/barn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Svenska ämnesord för barn",
   :madsrdf/code "barn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Svensk biblioteksförening on Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/barn,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Svensk biblioteksförening on Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "barn",
   :skos/prefLabel "Svenska ämnesord för barn"})

(def bdrc
  "Buddhist Digital Resource Center"
  {:db/ident :loc.subjectSchemes/bdrc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-06-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-06-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Buddhist Digital Resource Center",
   :madsrdf/code "bdrc",
   :madsrdf/editorialNote "https://www.bdrc.io/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-06-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-06-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bdrc,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.bdrc.io/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bdrc",
   :skos/prefLabel "Buddhist Digital Resource Center"})

(def bella
  "Published by BTJ Kirjastopalvelu in Helsingfors"
  {:db/ident :loc.subjectSchemes/bella,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Bella: specialtesaurus för skönlitteratur",
   :madsrdf/code "bella",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by BTJ Kirjastopalvelu in Helsingfors"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/bella,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/bella,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by BTJ Kirjastopalvelu in Helsingfors"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bella",
   :skos/prefLabel "Bella: specialtesaurus för skönlitteratur"})

(def bet
  "Publihsed by Leeds University Press in Leeds"
  {:db/ident :loc.subjectSchemes/bet,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "British education thesaurus",
   :madsrdf/code "bet",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Publihsed by Leeds University Press in Leeds"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bet,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Publihsed by Leeds University Press in Leeds"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bet",
   :skos/prefLabel "British education thesaurus"})

(def bhammf
  "Published by Institut national d'information scientifique et technique in Paris"
  {:db/ident :loc.subjectSchemes/bhammf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "BHA, Bibliographie d'histoire de l'art, mots-matière/français",
   :madsrdf/code "bhammf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Institut national d'information scientifique et technique in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bhammf,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Institut national d'information scientifique et technique in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bhammf",
   :skos/prefLabel
   "BHA, Bibliographie d'histoire de l'art, mots-matière/français"})

(def bhashe
  "Published by J. Paul Getty Trust in Santa Monica, CA and Centre national de recherche scientifique in Paris"
  {:db/ident :loc.subjectSchemes/bhashe,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "BHA, Bibliography of the history of art, subject headings/English",
   :madsrdf/code "bhashe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by J. Paul Getty Trust in Santa Monica, CA and Centre national de recherche scientifique in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bhashe,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by J. Paul Getty Trust in Santa Monica, CA and Centre national de recherche scientifique in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bhashe",
   :skos/prefLabel
   "BHA, Bibliography of the history of art, subject headings/English"})

(def bhb
  "Published by National Library of Israel"
  {:db/ident :loc.subjectSchemes/bhb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliography of the Hebrew book",
   :madsrdf/code "bhb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Israel"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bhb,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by National Library of Israel"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bhb",
   :skos/prefLabel "Bibliography of the Hebrew book"})

(def bib1814
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/bib1814,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "1814-bibliografi: emneord for 1814-bibliografi",
   :madsrdf/code "bib1814",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/editorialNote "https://www.nb.no/baser/1814/emneord.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/bib1814,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/bib1814,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/editorial "https://www.nb.no/baser/1814/emneord.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bib1814",
   :skos/prefLabel "1814-bibliografi: emneord for 1814-bibliografi"})

(def bibalex
  "Published by Bibliotheca Alexandrina in Alexandria, Egypt"
  {:db/ident :loc.subjectSchemes/bibalex,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Bibliotheca Alexandrina name and subject authority file",
   :madsrdf/code "bibalex",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bibliotheca Alexandrina in Alexandria, Egypt"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bibalex,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Bibliotheca Alexandrina in Alexandria, Egypt"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bibalex",
   :skos/prefLabel "Bibliotheca Alexandrina name and subject authority file"})

(def bibbi
  "Published by Biblioteksentralen in Oslo, Norway"
  {:db/ident :loc.subjectSchemes/bibbi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "BIBBI autoriteter",
   :madsrdf/code "bibbi",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Biblioteksentralen in Oslo, Norway"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bibbi,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Biblioteksentralen in Oslo, Norway"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bibbi",
   :skos/prefLabel "BIBBI autoriteter"})

(def biccbmc
  "Published by Book Industry Communication in London"
  {:db/ident :loc.subjectSchemes/biccbmc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "BIC children's books marketing classifications",
   :madsrdf/code "biccbmc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Book Industry Communication in London"},
   :madsrdf/editorialNote
   "https://www.bic.org.uk/8/Children's-Books-Marketing-Classifications/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/biccbmc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Book Industry Communication in London"},
   :skos/editorial
   "https://www.bic.org.uk/8/Children's-Books-Marketing-Classifications/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "biccbmc",
   :skos/prefLabel "BIC children's books marketing classifications"})

(def bicssc
  "Published by Book Industry Communication in London"
  {:db/ident :loc.subjectSchemes/bicssc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "BIC standard subject categories",
   :madsrdf/code "bicssc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Book Industry Communication in London"},
   :madsrdf/editorialNote "https://www.bic.org.uk/7/Subject-Categories/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bicssc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Book Industry Communication in London"},
   :skos/editorial "https://www.bic.org.uk/7/Subject-Categories/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bicssc",
   :skos/prefLabel "BIC standard subject categories"})

(def bidex
  "Published by California Spanish Language Data Base in Oakland"
  {:db/ident :loc.subjectSchemes/bidex,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Bilindex: a bilingual Spanish-English subject heading list",
   :madsrdf/code "bidex",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by California Spanish Language Data Base in Oakland"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bidex,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by California Spanish Language Data Base in Oakland"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bidex",
   :skos/prefLabel
   "Bilindex: a bilingual Spanish-English subject heading list"})

(def bisacmt
  "BISAC merchandising themes"
  {:db/ident :loc.subjectSchemes/bisacmt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "BISAC merchandising themes",
   :madsrdf/code "bisacmt",
   :madsrdf/editorialNote "https://bisg.org/page/BISACMerchandising",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bisacmt,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://bisg.org/page/BISACMerchandising",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bisacmt",
   :skos/prefLabel "BISAC merchandising themes"})

(def bisacrt
  "BISAC regional themes"
  {:db/ident :loc.subjectSchemes/bisacrt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "BISAC regional themes",
   :madsrdf/code "bisacrt",
   :madsrdf/editorialNote "https://bisg.org/page/BISACRegionalTheme",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bisacrt,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://bisg.org/page/BISACRegionalTheme",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bisacrt",
   :skos/prefLabel "BISAC regional themes"})

(def bisacsh
  "BISAC subject headings"
  {:db/ident :loc.subjectSchemes/bisacsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "BISAC subject headings",
   :madsrdf/code "bisacsh",
   :madsrdf/editorialNote "https://bisg.org/page/bisacedition",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bisacsh,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://bisg.org/page/bisacedition",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bisacsh",
   :skos/prefLabel "BISAC subject headings"})

(def bjornson
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/bjornson,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Bjornson: emneord for Bjornsonbibliografien",
   :madsrdf/code "bjornson",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/bjornson,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/bjornson,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bjornson",
   :skos/prefLabel "Bjornson: emneord for Bjornsonbibliografien"})

(def blcpss
  "COMPASS subject authority system"
  {:db/ident :loc.subjectSchemes/blcpss,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "COMPASS subject authority system",
   :madsrdf/code "blcpss",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/blcpss,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "blcpss",
   :skos/prefLabel "COMPASS subject authority system"})

(def blmlsh
  "Published by British Library in London"
  {:db/ident :loc.subjectSchemes/blmlsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "British Library - Map library subject headings",
   :madsrdf/code "blmlsh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by British Library in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/blmlsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by British Library in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "blmlsh",
   :skos/prefLabel "British Library - Map library subject headings"})

(def blnpn
  "Published by British Library in London"
  {:db/ident :loc.subjectSchemes/blnpn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "British Library newspaper place names",
   :madsrdf/code "blnpn",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by British Library in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/blnpn,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by British Library in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "blnpn",
   :skos/prefLabel "British Library newspaper place names"})

(def bokbas
  "Bokbasen"
  {:db/ident :loc.subjectSchemes/bokbas,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bokbasen",
   :madsrdf/code "bokbas",
   :madsrdf/editorialNote "http://www.boknett.no/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bokbas,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.boknett.no/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bokbas",
   :skos/prefLabel "Bokbasen"})

(def bt
  "Published by Kennedy Institute of Ethics, Georgetown Univ. in Washington, DC"
  {:db/ident :loc.subjectSchemes/bt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bioethics thesaurus",
   :madsrdf/code "bt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Kennedy Institute of Ethics, Georgetown Univ. in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/bt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Kennedy Institute of Ethics, Georgetown Univ. in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "bt",
   :skos/prefLabel "Bioethics thesaurus"})

(def btr
  "Published by OCLC in Leiden"
  {:db/ident :loc.subjectSchemes/btr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Brinkman onderwerp thesaurus",
   :madsrdf/code "btr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by OCLC in Leiden"},
   :madsrdf/editorialNote
   "http://support.oclc.org/ggc/richtlijnen/?id=12&n=nl&sec=k-520X",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/btr,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by OCLC in Leiden"},
   :skos/editorial
   "http://support.oclc.org/ggc/richtlijnen/?id=12&n=nl&sec=k-520X",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "btr",
   :skos/prefLabel "Brinkman onderwerp thesaurus"})

(def buscem
  "University Library of Santiago de Compostela headings in Galician"
  {:db/ident :loc.subjectSchemes/buscem,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "University Library of Santiago de Compostela headings in Galician",
   :madsrdf/code "buscem",
   :madsrdf/editorialNote "http://iacobus.usc.es/search*gag/j",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/buscem,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://iacobus.usc.es/search*gag/j",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "buscem",
   :skos/prefLabel
   "University Library of Santiago de Compostela headings in Galician"})

(def cabt
  "Published by Commonwealth Agricultural Bureaux in Slough {England]"
  {:db/ident :loc.subjectSchemes/cabt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CAB thesaurus",
   :madsrdf/code "cabt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Commonwealth Agricultural Bureaux in Slough {England]"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cabt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Commonwealth Agricultural Bureaux in Slough {England]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cabt",
   :skos/prefLabel "CAB thesaurus"})

(def cash
  "Published by Library and Archives Canada in Ontario, ON"
  {:db/ident :loc.subjectSchemes/cash,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Canadian subject headings",
   :madsrdf/code "cash",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Library and Archives Canada in Ontario, ON"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cash,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Library and Archives Canada in Ontario, ON"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cash",
   :skos/prefLabel "Canadian subject headings"})

(def cck
  "Published by OCLC in Leiden"
  {:db/ident :loc.subjectSchemes/cck,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Centrale catalogus kaarten",
   :madsrdf/code "cck",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by OCLC in Leiden"},
   :madsrdf/editorialNote
   "http://support.oclc.org/ggc/richtlijnen/?id=12&ln=nl&sec=k-559X",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cck,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by OCLC in Leiden"},
   :skos/editorial
   "http://support.oclc.org/ggc/richtlijnen/?id=12&ln=nl&sec=k-559X",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cck",
   :skos/prefLabel "Centrale catalogus kaarten"})

(def cckthema
  "Published by OCLC in Leiden"
  {:db/ident :loc.subjectSchemes/cckthema,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thematrefwoorden CCK",
   :madsrdf/code "cckthema",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by OCLC in Leiden"},
   :madsrdf/editorialNote
   "http://support.oclc.org/ggc/richtlijnen/?id=12&ln=nl&sec=k-558X",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cckthema,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by OCLC in Leiden"},
   :skos/editorial
   "http://support.oclc.org/ggc/richtlijnen/?id=12&ln=nl&sec=k-558X",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cckthema",
   :skos/prefLabel "Thematrefwoorden CCK"})

(def ccsa
  "Published by Bibliothèque nationale suisse in Berne"
  {:db/ident :loc.subjectSchemes/ccsa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Catalogue collectif suisse des affiches",
   :madsrdf/code "ccsa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bibliothèque nationale suisse in Berne"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ccsa,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Bibliothèque nationale suisse in Berne"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ccsa",
   :skos/prefLabel "Catalogue collectif suisse des affiches"})

(def cct
  "Published by Guo jia tu shu guan \"Zhongguo tu shu guan fen lei fa\" bian wei hui in Beijing"
  {:db/ident :loc.subjectSchemes/cct,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Zhong guo fen lei zhu ti ci biao (di er ban) = Chinese classified thesaurus",
   :madsrdf/code "cct",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Guo jia tu shu guan \"Zhongguo tu shu guan fen lei fa\" bian wei hui in Beijing"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cct,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Guo jia tu shu guan \"Zhongguo tu shu guan fen lei fa\" bian wei hui in Beijing"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cct",
   :skos/prefLabel
   "Zhong guo fen lei zhu ti ci biao (di er ban) = Chinese classified thesaurus"})

(def ccte
  "Published by Library and Archives Canada in Ottawa, ON"
  {:db/ident :loc.subjectSchemes/ccte,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Carto-Canadiana thesaurus - English",
   :madsrdf/code "ccte",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Library and Archives Canada in Ottawa, ON"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ccte,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Library and Archives Canada in Ottawa, ON"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ccte",
   :skos/prefLabel "Carto-Canadiana thesaurus - English"})

(def cctf
  "Published by Bibliothèque et Archives Canada in Ottawa, ON"
  {:db/ident :loc.subjectSchemes/cctf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Carto-Canadiana thésaurus - Français",
   :madsrdf/code "cctf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bibliothèque et Archives Canada in Ottawa, ON"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cctf,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Bibliothèque et Archives Canada in Ottawa, ON"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cctf",
   :skos/prefLabel "Carto-Canadiana thésaurus - Français"})

(def cdcng
  "Published by AFNOR in Paris-La Défense"
  {:db/ident :loc.subjectSchemes/cdcng,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Catalogage des documents cartographiques: forme et structure des vedettes noms géographiques - NF Z 44-081",
   :madsrdf/code "cdcng",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by AFNOR in Paris-La Défense"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cdcng,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by AFNOR in Paris-La Défense"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cdcng",
   :skos/prefLabel
   "Catalogage des documents cartographiques: forme et structure des vedettes noms géographiques - NF Z 44-081"})

(def ceeus
  "Published by National Institute of Standards and Technology in Gaithersburg, MD"
  {:db/ident :loc.subjectSchemes/ceeus,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Counties and equivalent entities of the United States its possessions, and associated areas",
   :madsrdf/code "ceeus",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Institute of Standards and Technology in Gaithersburg, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ceeus,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Institute of Standards and Technology in Gaithersburg, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ceeus",
   :skos/prefLabel
   "Counties and equivalent entities of the United States its possessions, and associated areas"})

(def cgndb
  "Published by Natural Resources Canada"
  {:db/ident :loc.subjectSchemes/cgndb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Canadian Geographical Names Database",
   :madsrdf/code "cgndb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Natural Resources Canada"},
   :madsrdf/editorialNote
   "https://www.nrcan.gc.ca/earth-sciences/geography/querying-canadian-geographical-names-database/canadian-geographical-names-database/19870",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cgndb,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Natural Resources Canada"},
   :skos/editorial
   "https://www.nrcan.gc.ca/earth-sciences/geography/querying-canadian-geographical-names-database/canadian-geographical-names-database/19870",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cgndb",
   :skos/prefLabel "Canadian Geographical Names Database"})

(def cgpa
  "Published by Congressional Research Service in Washington, DC"
  {:db/ident :loc.subjectSchemes/cgpa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-08-16T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-08-16T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Congress.gov Policy Areas",
   :madsrdf/code "cgpa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Congressional Research Service in Washington, DC"},
   :madsrdf/editorialNote
   "https://www.congress.gov/help/field-values/policy-area",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-08-16T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-08-16T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cgpa,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Congressional Research Service in Washington, DC"},
   :skos/editorial "https://www.congress.gov/help/field-values/policy-area",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cgpa",
   :skos/prefLabel "Congress.gov Policy Areas"})

(def chirosh
  "Chiropractic subject headings"
  {:db/ident :loc.subjectSchemes/chirosh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Chiropractic subject headings",
   :madsrdf/code "chirosh",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/chirosh,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "chirosh",
   :skos/prefLabel "Chiropractic subject headings"})

(def cht
  "Published by Chicano Studies Library Publications Unit, University of California, Berkeley in Berkeley"
  {:db/ident :loc.subjectSchemes/cht,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Chicano thesaurus for indexing Chicano materials in Chicano periodical index",
   :madsrdf/code "cht",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Chicano Studies Library Publications Unit, University of California, Berkeley in Berkeley"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cht,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Chicano Studies Library Publications Unit, University of California, Berkeley in Berkeley"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cht",
   :skos/prefLabel
   "Chicano thesaurus for indexing Chicano materials in Chicano periodical index"})

(def ciesiniv
  "Published by Consortium for International Earth Science Information Network in University Center, MI"
  {:db/ident :loc.subjectSchemes/ciesiniv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CIESIN indexing vocabulary",
   :madsrdf/code "ciesiniv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Consortium for International Earth Science Information Network in University Center, MI"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ciesiniv,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Consortium for International Earth Science Information Network in University Center, MI"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ciesiniv",
   :skos/prefLabel "CIESIN indexing vocabulary"})

(def cilla
  "Published by BTJ Kirjastopalvelu in Helsingfors"
  {:db/ident :loc.subjectSchemes/cilla,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Cilla: specialtesaurus för musik",
   :madsrdf/code "cilla",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by BTJ Kirjastopalvelu in Helsingfors"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/cilla,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/cilla,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by BTJ Kirjastopalvelu in Helsingfors"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cilla",
   :skos/prefLabel "Cilla: specialtesaurus för musik"})

(def collett
  "Published by Nasjonalbiblioteket in Oslo"
  {:db/ident :loc.subjectSchemes/collett,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Collett-bibliografi: litteratur av og om Camilla Collett",
   :madsrdf/code "collett",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Nasjonalbiblioteket in Oslo"},
   :madsrdf/editorialNote "https://www.nb.no/baser/collett/emneord.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/collett,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/collett,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Nasjonalbiblioteket in Oslo"},
   :skos/editorial "https://www.nb.no/baser/collett/emneord.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "collett",
   :skos/prefLabel "Collett-bibliografi: litteratur av og om Camilla Collett"})

(def conorsi
  "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"
  {:db/ident :loc.subjectSchemes/conorsi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CONOR.SI (name authority file)",
   :madsrdf/code "conorsi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/conorsi,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "conorsi",
   :skos/prefLabel "CONOR.SI (name authority file)"})

(def csahssa
  "Published by Cambridge Scientific Abstracts in Bethesda, MD"
  {:db/ident :loc.subjectSchemes/csahssa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Controlled vocabulary in Health and safety science abstracts",
   :madsrdf/code "csahssa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Cambridge Scientific Abstracts in Bethesda, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/csahssa,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Cambridge Scientific Abstracts in Bethesda, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "csahssa",
   :skos/prefLabel
   "Controlled vocabulary in Health and safety science abstracts"})

(def csalsct
  "Published by Cambridge Scientific Abstracts in Bethesda, MD"
  {:db/ident :loc.subjectSchemes/csalsct,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CSA life sciences collection thesaurus",
   :madsrdf/code "csalsct",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Cambridge Scientific Abstracts in Bethesda, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/csalsct,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Cambridge Scientific Abstracts in Bethesda, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "csalsct",
   :skos/prefLabel "CSA life sciences collection thesaurus"})

(def csapa
  "Published by Cambridge Scientific Abstracts in Bethesda, MD"
  {:db/ident :loc.subjectSchemes/csapa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Controlled vocabulary in Pollution abstracts",
   :madsrdf/code "csapa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Cambridge Scientific Abstracts in Bethesda, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/csapa,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Cambridge Scientific Abstracts in Bethesda, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "csapa",
   :skos/prefLabel "Controlled vocabulary in Pollution abstracts"})

(def csh
  "Published by Catholic Lib. Assoc. in Haverford, PA"
  {:db/ident :loc.subjectSchemes/csh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Kapsner, Oliver Leonard. Catholic subject headings",
   :madsrdf/code "csh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Catholic Lib. Assoc. in Haverford, PA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/csh,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Catholic Lib. Assoc. in Haverford, PA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "csh",
   :skos/prefLabel "Kapsner, Oliver Leonard. Catholic subject headings"})

(def csht
  "Published by National Central Library in Taipei"
  {:db/ident :loc.subjectSchemes/csht,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Chinese subject headings",
   :madsrdf/code "csht",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Central Library in Taipei"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/csht,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Central Library in Taipei"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "csht",
   :skos/prefLabel "Chinese subject headings"})

(def cstud
  "Published by Technische Universiteit Delft, Bibliotheek in Delft"
  {:db/ident :loc.subjectSchemes/cstud,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Classificatieschema's Bibliotheek TU Delft",
   :madsrdf/code "cstud",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Technische Universiteit Delft, Bibliotheek in Delft"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cstud,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Technische Universiteit Delft, Bibliotheek in Delft"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cstud",
   :skos/prefLabel "Classificatieschema's Bibliotheek TU Delft"})

(def cyac
  "Published by Library of Congress in Wahington, D.C."
  {:db/ident :loc.subjectSchemes/cyac,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Children's and Young Adults' Cataloging Program",
   :madsrdf/code "cyac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Library of Congress in Wahington, D.C."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/cyac,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Library of Congress in Wahington, D.C."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "cyac",
   :skos/prefLabel "Children's and Young Adults' Cataloging Program"})

(def czenas
  "Published by Národní knihovna Čseké republiky in Praha"
  {:db/ident :loc.subjectSchemes/czenas,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Soubor vĕcných autorit Národní knihovny ČR = CZENAS thesaurus: a list of subject terms used in the National Library of the Czech Republic",
   :madsrdf/code "czenas",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Národní knihovna Čseké republiky in Praha"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/czenas,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Národní knihovna Čseké republiky in Praha"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "czenas",
   :skos/prefLabel
   "Soubor vĕcných autorit Národní knihovny ČR = CZENAS thesaurus: a list of subject terms used in the National Library of the Czech Republic"})

(def czmesh
  "Czech MeSH"
  {:db/ident :loc.subjectSchemes/czmesh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Czech MeSH",
   :madsrdf/code "czmesh",
   :madsrdf/editorialNote "https://www.medvik.cz/bmc/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/czmesh,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.medvik.cz/bmc/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "czmesh",
   :skos/prefLabel "Czech MeSH"})

(def dbcsh
  "Published by Dansk BiblioteksCenter"
  {:db/ident :loc.subjectSchemes/dbcsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DBC Subject Headings",
   :madsrdf/code "dbcsh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Dansk BiblioteksCenter"},
   :madsrdf/editorialNote "https://metadata.dk/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dbcsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Dansk BiblioteksCenter"},
   :skos/editorial "https://metadata.dk/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dbcsh",
   :skos/prefLabel "DBC Subject Headings"})

(def dbn
  "Published by Biblioteka Narodowa in Warszawa"
  {:db/ident :loc.subjectSchemes/dbn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Deskryptory Biblioteki Narodowej = National Library of Poland descriptors",
   :madsrdf/code "dbn",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Biblioteka Narodowa in Warszawa"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dbn,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Biblioteka Narodowa in Warszawa"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dbn",
   :skos/prefLabel
   "Deskryptory Biblioteki Narodowej = National Library of Poland descriptors"})

(def dcs
  "Published by BIREME in São Paulo"
  {:db/ident :loc.subjectSchemes/dcs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descritores em ciências da saúde = Descriptores en ciencias de la salud = Health sciences descriptors",
   :madsrdf/code "dcs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by BIREME in São Paulo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dcs,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by BIREME in São Paulo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dcs",
   :skos/prefLabel
   "Descritores em ciências da saúde = Descriptores en ciencias de la salud = Health sciences descriptors"})

(def ddcri
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.subjectSchemes/ddcri,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dewey Decimal Classification relative index",
   :madsrdf/code "ddcri",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ddcri,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ddcri",
   :skos/prefLabel "Dewey Decimal Classification relative index"})

(def ddcrit
  "Published by Defense Documentation Center, Defense Logistics Agency in Alexandria, VA"
  {:db/ident :loc.subjectSchemes/ddcrit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "DDC retrieval and indexing terminology; posting terms with hierarchy and KWOC",
   :madsrdf/code "ddcrit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Defense Documentation Center, Defense Logistics Agency in Alexandria, VA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ddcrit,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Defense Documentation Center, Defense Logistics Agency in Alexandria, VA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ddcrit",
   :skos/prefLabel
   "DDC retrieval and indexing terminology; posting terms with hierarchy and KWOC"})

(def ddcut
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.subjectSchemes/ddcut,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dewey Decimal Classification user terms",
   :madsrdf/code "ddcut",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ddcut,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ddcut",
   :skos/prefLabel "Dewey Decimal Classification user terms"})

(def dhb-jdg
  "Deutsche Historische Bibliografie - Jahresberichte für deutsche Geschichte - Schlagwörter (Bibliography of German History - Annual Bibliography on German History - Subject Headings"
  {:db/ident :loc.subjectSchemes/dhb-jdg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Deutsche Historische Bibliografie - Jahresberichte für deutsche Geschichte - Schlagwörter (Bibliography of German History - Annual Bibliography on German History - Subject Headings",
   :madsrdf/code "dhb-jdg",
   :madsrdf/editorialNote "https://www.historicum.net/index.php?id=7247",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dhb-jdg,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.historicum.net/index.php?id=7247",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dhb-jdg",
   :skos/prefLabel
   "Deutsche Historische Bibliografie - Jahresberichte für deutsche Geschichte - Schlagwörter (Bibliography of German History - Annual Bibliography on German History - Subject Headings"})

(def dicgenam
  "Published by Junta de Estudios Históricos de Tres de Febrero in Buenos Aires"
  {:db/ident :loc.subjectSchemes/dicgenam,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Callegari, Horacio. Diccionario de gentilicios americanos",
   :madsrdf/code "dicgenam",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Junta de Estudios Históricos de Tres de Febrero in Buenos Aires"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dicgenam,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Junta de Estudios Históricos de Tres de Febrero in Buenos Aires"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dicgenam",
   :skos/prefLabel "Callegari, Horacio. Diccionario de gentilicios americanos"})

(def dicgenes
  "Published by Vision Net Ediciones in Madrid"
  {:db/ident :loc.subjectSchemes/dicgenes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Torre Aparicio, Tomás de la. Diccionario de gentilicios: toponimicos españoles",
   :madsrdf/code "dicgenes",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Vision Net Ediciones in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dicgenes,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Vision Net Ediciones in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dicgenes",
   :skos/prefLabel
   "Torre Aparicio, Tomás de la. Diccionario de gentilicios: toponimicos españoles"})

(def dicgentop
  "Published by ILTEC, Instituto de Linguística Teórica e Computacional in Lisbon?, Portugal"
  {:db/ident :loc.subjectSchemes/dicgentop,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dicionário de gentílicos e topónimos",
   :madsrdf/code "dicgentop",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by ILTEC, Instituto de Linguística Teórica e Computacional in Lisbon?, Portugal"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dicgentop,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by ILTEC, Instituto de Linguística Teórica e Computacional in Lisbon?, Portugal"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dicgentop",
   :skos/prefLabel "Dicionário de gentílicos e topónimos"})

(def dissao
  "Published by UNI/Data Courier Online in Louisvile, KY"
  {:db/ident :loc.subjectSchemes/dissao,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Dissertation abstracts online in Search tools: the guide to UNI/Data Courier Online",
   :madsrdf/code "dissao",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by UNI/Data Courier Online in Louisvile, KY"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dissao,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by UNI/Data Courier Online in Louisvile, KY"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dissao",
   :skos/prefLabel
   "Dissertation abstracts online in Search tools: the guide to UNI/Data Courier Online"})

(def dit
  "Published by Defense Intelligence Agency in Washington, DC"
  {:db/ident :loc.subjectSchemes/dit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Defense intelligence thesaurus",
   :madsrdf/code "dit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Defense Intelligence Agency in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dit,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Defense Intelligence Agency in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dit",
   :skos/prefLabel "Defense intelligence thesaurus"})

(def dltlt
  "Published by Blackwell in Oxford and Malden, Mass."
  {:db/ident :loc.subjectSchemes/dltlt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Cuddon, J. A. A dictionary of literary terms and literary theory",
   :madsrdf/code "dltlt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Blackwell in Oxford and Malden, Mass."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dltlt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Blackwell in Oxford and Malden, Mass."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dltlt",
   :skos/prefLabel
   "Cuddon, J. A. A dictionary of literary terms and literary theory"})

(def dltt
  "Published by Facts on File, Inc. in New Yprk, NY"
  {:db/ident :loc.subjectSchemes/dltt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Quinn, E. A dictionary of literary and thematic terms",
   :madsrdf/code "dltt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Facts on File, Inc. in New Yprk, NY"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dltt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Facts on File, Inc. in New Yprk, NY"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dltt",
   :skos/prefLabel "Quinn, E. A dictionary of literary and thematic terms"})

(def drama
  "Published by BTJ Kirjastopalvelu in Helsingfors"
  {:db/ident :loc.subjectSchemes/drama,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Drama: specialtesaurus för teater och dans",
   :madsrdf/code "drama",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by BTJ Kirjastopalvelu in Helsingfors"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/drama,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by BTJ Kirjastopalvelu in Helsingfors"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "drama",
   :skos/prefLabel "Drama: specialtesaurus för teater och dans"})

(def dtict
  "Published by DTIC in Fort Belvoir, VA"
  {:db/ident :loc.subjectSchemes/dtict,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Defense Technical Information Center thesaurus",
   :madsrdf/code "dtict",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by DTIC in Fort Belvoir, VA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dtict,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by DTIC in Fort Belvoir, VA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dtict",
   :skos/prefLabel "Defense Technical Information Center thesaurus"})

(def dugfr
  "Published by Linguatech éditeur Inc. in Montréa, Québec"
  {:db/ident :loc.subjectSchemes/dugfr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Dugas, Jean-Yves. Dictionnaire universel des gentilés en français",
   :madsrdf/code "dugfr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Linguatech éditeur Inc. in Montréa, Québec"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/dugfr,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Linguatech éditeur Inc. in Montréa, Québec"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "dugfr",
   :skos/prefLabel
   "Dugas, Jean-Yves. Dictionnaire universel des gentilés en français"})

(def ebfem
  "Published by Fundación Educativa Ana G. Mendez in Puerto Rico"
  {:db/ident :loc.subjectSchemes/ebfem,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Encabezamientos bilingües de la Fundación Educativa Ana G. Mendez",
   :madsrdf/code "ebfem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Fundación Educativa Ana G. Mendez in Puerto Rico"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ebfem,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Fundación Educativa Ana G. Mendez in Puerto Rico"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ebfem",
   :skos/prefLabel
   "Encabezamientos bilingües de la Fundación Educativa Ana G. Mendez"})

(def eclas
  "Published by European Communities, Office for Official Publications in Luxembourg"
  {:db/ident :loc.subjectSchemes/eclas,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ECLAS thesaurus",
   :madsrdf/code "eclas",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by European Communities, Office for Official Publications in Luxembourg"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/eclas,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by European Communities, Office for Official Publications in Luxembourg"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "eclas",
   :skos/prefLabel "ECLAS thesaurus"})

(def eet
  "European education thesaurus"
  {:db/ident :loc.subjectSchemes/eet,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "European education thesaurus",
   :madsrdf/code "eet",
   :madsrdf/editorialNote "https://vocabularyserver.com/tee/en/index.php",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/eet,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://vocabularyserver.com/tee/en/index.php",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "eet",
   :skos/prefLabel "European education thesaurus"})

(def eflch
  "E4Libraries category headings"
  {:db/ident :loc.subjectSchemes/eflch,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "E4Libraries category headings",
   :madsrdf/code "eflch",
   :madsrdf/editorialNote
   "https://www.bic.org.uk/51/E4libraries-Subject-Category-Headings/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/eflch,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.bic.org.uk/51/E4libraries-Subject-Category-Headings/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "eflch",
   :skos/prefLabel "E4Libraries category headings"})

(def eks
  "Published by Eduskunnan kirasto in Helsinki"
  {:db/ident :loc.subjectSchemes/eks,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Eduskunnan kirjaston asiasanasto",
   :madsrdf/code "eks",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Eduskunnan kirasto in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/eks,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Eduskunnan kirasto in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "eks",
   :skos/prefLabel "Eduskunnan kirjaston asiasanasto"})

(def embiaecid
  "Published by AECID in Madrid"
  {:db/ident :loc.subjectSchemes/embiaecid,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Encabezamientos de materia de la Biblioteca Islámica de la Biblioteca AECID",
   :madsrdf/code "embiaecid",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by AECID in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/embiaecid,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by AECID in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "embiaecid",
   :skos/prefLabel
   "Encabezamientos de materia de la Biblioteca Islámica de la Biblioteca AECID"})

(def embne
  "Published by Biblioteca Nacional de España in Madrid"
  {:db/ident :loc.subjectSchemes/embne,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Encabezamientos de materia de la Biblioteca Nacional de España",
   :madsrdf/code "embne",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Biblioteca Nacional de España in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/embne,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Biblioteca Nacional de España in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "embne",
   :skos/prefLabel
   "Encabezamientos de materia de la Biblioteca Nacional de España"})

(def embucm
  "Published by Universidad Complutense de Madrid in Madrid"
  {:db/ident :loc.subjectSchemes/embucm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Encabezamientos de materia de la Biblioteca Complutense",
   :madsrdf/code "embucm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Universidad Complutense de Madrid in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/embucm,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Universidad Complutense de Madrid in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "embucm",
   :skos/prefLabel "Encabezamientos de materia de la Biblioteca Complutense"})

(def embuz
  "Published by Universidad de Zaragoza in Zaragoza"
  {:db/ident :loc.subjectSchemes/embuz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Encabezamientos de materia de la Biblioteca de la Universidad de Zaragoza",
   :madsrdf/code "embuz",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Universidad de Zaragoza in Zaragoza"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/embuz,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Universidad de Zaragoza in Zaragoza"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "embuz",
   :skos/prefLabel
   "Encabezamientos de materia de la Biblioteca de la Universidad de Zaragoza"})

(def emnmus
  "Published by Norwegian Directorate for Public and School Libraries"
  {:db/ident :loc.subjectSchemes/emnmus,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Emneord for musikkdokument i EDB-kataloger",
   :madsrdf/code "emnmus",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Norwegian Directorate for Public and School Libraries"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/emnmus,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Norwegian Directorate for Public and School Libraries"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "emnmus",
   :skos/prefLabel "Emneord for musikkdokument i EDB-kataloger"})

(def ept
  "Published by Zavod Republike Slovenije za solstvo in Ljubljana"
  {:db/ident :loc.subjectSchemes/ept,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Evropski pedagoški tezaver = European education thesaurus (EET) : slovenska razlčica - izdelana po angleški različci",
   :madsrdf/code "ept",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Zavod Republike Slovenije za solstvo in Ljubljana"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ept,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Zavod Republike Slovenije za solstvo in Ljubljana"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ept",
   :skos/prefLabel
   "Evropski pedagoški tezaver = European education thesaurus (EET) : slovenska razlčica - izdelana po angleški različci"})

(def erfemn
  "Published by Nasjonalt senter for erfaringskompetanse innen psykisk helse"
  {:db/ident :loc.subjectSchemes/erfemn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Erfaringskompetanses emneord",
   :madsrdf/code "erfemn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Nasjonalt senter for erfaringskompetanse innen psykisk helse"},
   :madsrdf/editorialNote "https://erfaringskompetanse.no/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/erfemn,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Nasjonalt senter for erfaringskompetanse innen psykisk helse"},
   :skos/editorial "https://erfaringskompetanse.no/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "erfemn",
   :skos/prefLabel "Erfaringskompetanses emneord"})

(def ericd
  "Published by Educational Resources Information Center, National Institute of Education, U.S. Dept. of Education in Washin+H101gton"
  {:db/ident :loc.subjectSchemes/ericd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus of ERIC descriptors",
   :madsrdf/code "ericd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Educational Resources Information Center, National Institute of Education, U.S. Dept. of Education in Washin+H101gton"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ericd,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Educational Resources Information Center, National Institute of Education, U.S. Dept. of Education in Washin+H101gton"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ericd",
   :skos/prefLabel "Thesaurus of ERIC descriptors"})

(def est
  "Published by International Energy Agency, Energy Technology Data Exchange in [Paris]"
  {:db/ident :loc.subjectSchemes/est,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Energy subject thesaurus",
   :madsrdf/code "est",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by International Energy Agency, Energy Technology Data Exchange in [Paris]"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/est,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by International Energy Agency, Energy Technology Data Exchange in [Paris]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "est",
   :skos/prefLabel "Energy subject thesaurus"})

(def etiras
  "Published by FIV - The German Information Network for International Relations and Area Studies"
  {:db/ident :loc.subjectSchemes/etiras,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-09-21T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-09-21T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "European Thesaurus on International Relations and Area Studies",
   :madsrdf/code "etiras",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by FIV - The German Information Network for International Relations and Area Studies"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-09-21T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-09-21T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/etiras,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by FIV - The German Information Network for International Relations and Area Studies"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "etiras",
   :skos/prefLabel
   "European Thesaurus on International Relations and Area Studies"})

(def etuesh
  "Published by TOBB University of Economics and Technology"
  {:db/ident :loc.subjectSchemes/etuesh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "TOBB ETU English Subject Headings = TOBB ETÜ İngilizce Konu Başlıkları",
   :madsrdf/code "etuesh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by TOBB University of Economics and Technology"},
   :madsrdf/editorialNote
   "http://koha.etu.edu.tr/cgi-bin/koha/opac-authorities-home.pl",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/etuesh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by TOBB University of Economics and Technology"},
   :skos/editorial
   "http://koha.etu.edu.tr/cgi-bin/koha/opac-authorities-home.pl",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "etuesh",
   :skos/prefLabel
   "TOBB ETU English Subject Headings = TOBB ETÜ İngilizce Konu Başlıkları"})

(def etuturkob
  "Published by TOBB University of Economics and Technology"
  {:db/ident :loc.subjectSchemes/etuturkob,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "TOBB ETU Turkish Subject Headings = TOBB ETÜ Türkçe Konu Başlıkları",
   :madsrdf/code "etuturkob",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by TOBB University of Economics and Technology"},
   :madsrdf/editorialNote
   "http://koha.etu.edu.tr/cgi-bin/koha/opac-authorities-home.pl",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/etuturkob,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by TOBB University of Economics and Technology"},
   :skos/editorial
   "http://koha.etu.edu.tr/cgi-bin/koha/opac-authorities-home.pl",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "etuturkob",
   :skos/prefLabel
   "TOBB ETU Turkish Subject Headings = TOBB ETÜ Türkçe Konu Başlıkları"})

(def eum
  "Eesti uldine märksonastik"
  {:db/ident :loc.subjectSchemes/eum,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Eesti uldine märksonastik",
   :madsrdf/code "eum",
   :madsrdf/editorialNote "https://ems.elnet.ee/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/eum,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://ems.elnet.ee/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "eum",
   :skos/prefLabel "Eesti uldine märksonastik"})

(def eurovocen
  "Eurovoc thesaurus (English)"
  {:db/ident :loc.subjectSchemes/eurovocen,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Eurovoc thesaurus (English)",
   :madsrdf/code "eurovocen",
   :madsrdf/editorialNote "https://op.europa.eu/en/web/eu-vocabularies",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/eurovocen,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://op.europa.eu/en/web/eu-vocabularies",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "eurovocen",
   :skos/prefLabel "Eurovoc thesaurus (English)"})

(def eurovoces
  "Eurovoc thesaurus (Spanish)"
  {:db/ident :loc.subjectSchemes/eurovoces,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Eurovoc thesaurus (Spanish)",
   :madsrdf/code "eurovoces",
   :madsrdf/editorialNote "https://op.europa.eu/en/web/eu-vocabularies",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/eurovoces,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://op.europa.eu/en/web/eu-vocabularies",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "eurovoces",
   :skos/prefLabel "Eurovoc thesaurus (Spanish)"})

(def eurovocfr
  "Eurovoc thesaurus (French)"
  {:db/ident :loc.subjectSchemes/eurovocfr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Eurovoc thesaurus (French)",
   :madsrdf/code "eurovocfr",
   :madsrdf/editorialNote "https://op.europa.eu/en/web/eu-vocabularies",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/eurovocfr,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://op.europa.eu/en/web/eu-vocabularies",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "eurovocfr",
   :skos/prefLabel "Eurovoc thesaurus (French)"})

(def eurovocsl
  "Eurovoc thesaurus (Slovenian)"
  {:db/ident :loc.subjectSchemes/eurovocsl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Eurovoc thesaurus (Slovenian)",
   :madsrdf/code "eurovocsl",
   :madsrdf/editorialNote "https://op.europa.eu/en/web/eu-vocabularies",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/eurovocsl,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://op.europa.eu/en/web/eu-vocabularies",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "eurovocsl",
   :skos/prefLabel "Eurovoc thesaurus (Slovenian)"})

(def fast
  "Published by OCLC in Dublin, Ohio"
  {:db/ident :loc.subjectSchemes/fast,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Faceted application of subject terminology",
   :madsrdf/code "fast",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by OCLC in Dublin, Ohio"},
   :madsrdf/editorialNote "http://fast.oclc.org/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/fast,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by OCLC in Dublin, Ohio"},
   :skos/editorial "http://fast.oclc.org/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "fast",
   :skos/prefLabel "Faceted application of subject terminology"})

(def fes
  "Published by Friedrich-Ebert-Stiftung"
  {:db/ident :loc.subjectSchemes/fes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus der Bibliothek der FES / FES",
   :madsrdf/code "fes",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Friedrich-Ebert-Stiftung"},
   :madsrdf/editorialNote "https://library.fes.de/tematres/vocab/sobre.php",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/fes,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Friedrich-Ebert-Stiftung"},
   :skos/editorial "https://library.fes.de/tematres/vocab/sobre.php",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "fes",
   :skos/prefLabel "Thesaurus der Bibliothek der FES / FES"})

(def finmesh
  "FinMeSH"
  {:db/ident :loc.subjectSchemes/finmesh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "FinMeSH",
   :madsrdf/code "finmesh",
   :madsrdf/editorialNote "https://www.terkko.helsinki.fi/termix/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/finmesh,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.terkko.helsinki.fi/termix/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "finmesh",
   :skos/prefLabel "FinMeSH"})

(def fire
  "Published by Illinois Fire Service Institute in Champaign, IL"
  {:db/ident :loc.subjectSchemes/fire,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "FireTalk, IFSI thesaurus",
   :madsrdf/code "fire",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Illinois Fire Service Institute in Champaign, IL"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/fire,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Illinois Fire Service Institute in Champaign, IL"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "fire",
   :skos/prefLabel "FireTalk, IFSI thesaurus"})

(def flgeo
  "Published by University of Florida"
  {:db/ident :loc.subjectSchemes/flgeo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus of Florida place names",
   :madsrdf/code "flgeo",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by University of Florida"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/flgeo,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by University of Florida"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "flgeo",
   :skos/prefLabel "Thesaurus of Florida place names"})

(def fmesh
  "Published by Service information médicale automatisée de l'INSERM in Le Kremlin-Bicêtre, France"
  {:db/ident :loc.subjectSchemes/fmesh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Liste systématique et liste permutée des descripteurs français MeSH",
   :madsrdf/code "fmesh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Service information médicale automatisée de l'INSERM in Le Kremlin-Bicêtre, France"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/fmesh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Service information médicale automatisée de l'INSERM in Le Kremlin-Bicêtre, France"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "fmesh",
   :skos/prefLabel
   "Liste systématique et liste permutée des descripteurs français MeSH"})

(def fnhl
  "Published by Xwi7xwa Library, University of British Columbia"
  {:db/ident :loc.subjectSchemes/fnhl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "First Nations House of Learning subject headings",
   :madsrdf/code "fnhl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Xwi7xwa Library, University of British Columbia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/fnhl,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Xwi7xwa Library, University of British Columbia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "fnhl",
   :skos/prefLabel "First Nations House of Learning subject headings"})

(def francis
  "Published by Centre national de la recherche scientifique in Vandoeuvre"
  {:db/ident :loc.subjectSchemes/francis,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Base de donneés FRANCIS: plan de classement = FRANCIS database classification scheme",
   :madsrdf/code "francis",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Centre national de la recherche scientifique in Vandoeuvre"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/francis,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Centre national de la recherche scientifique in Vandoeuvre"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "francis",
   :skos/prefLabel
   "Base de donneés FRANCIS: plan de classement = FRANCIS database classification scheme"})

(def frst
  "Federal Reserve Subject Taxonomy"
  {:db/ident :loc.subjectSchemes/frst,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-11-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-11-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Federal Reserve Subject Taxonomy",
   :madsrdf/code "frst",
   :madsrdf/editorialNote "https://vp.multites.net/?k=frb",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-11-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-11-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/frst,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://vp.multites.net/?k=frb",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "frst",
   :skos/prefLabel "Federal Reserve Subject Taxonomy"})

(def fssh
  "Published by FamilySearch"
  {:db/ident :loc.subjectSchemes/fssh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "FamilySearch subject headings",
   :madsrdf/code "fssh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by FamilySearch"},
   :madsrdf/editorialNote "https://www.familysearch.org/en/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/fssh,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by FamilySearch"},
   :skos/editorial "https://www.familysearch.org/en/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "fssh",
   :skos/prefLabel "FamilySearch subject headings"})

(def galestne
  "Published by Gale Group in Farmington Hills, MI"
  {:db/ident :loc.subjectSchemes/galestne,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Gale Group subject thesaurus and named entity vocabulary",
   :madsrdf/code "galestne",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Gale Group in Farmington Hills, MI"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/galestne,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Gale Group in Farmington Hills, MI"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "galestne",
   :skos/prefLabel "Gale Group subject thesaurus and named entity vocabulary"})

(def gbd
  "Published by Universität Augsburg in Augsburg"
  {:db/ident :loc.subjectSchemes/gbd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus der Gnomon Bibliographischen Datenbank",
   :madsrdf/code "gbd",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Universität Augsburg in Augsburg"},
   :madsrdf/editorialNote "https://gbd.digital",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gbd,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Universität Augsburg in Augsburg"},
   :skos/editorial "https://gbd.digital",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gbd",
   :skos/prefLabel "Thesaurus der Gnomon Bibliographischen Datenbank"})

(def gccst
  "Published by Library and Archives Canada in Ottowa, ON"
  {:db/ident :loc.subjectSchemes/gccst,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Government of Canada core subject thesaurus",
   :madsrdf/code "gccst",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Library and Archives Canada in Ottowa, ON"},
   :madsrdf/editorialNote "https://canada.multites.net/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gccst,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Library and Archives Canada in Ottowa, ON"},
   :skos/editorial "https://canada.multites.net/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gccst",
   :skos/prefLabel "Government of Canada core subject thesaurus"})

(def gcipmedia
  "Published by GAMECIP (Game Metadata and Citation Project)"
  {:db/ident :loc.subjectSchemes/gcipmedia,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GAMECIP - computer game media formats",
   :madsrdf/code "gcipmedia",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by GAMECIP (Game Metadata and Citation Project)"},
   :madsrdf/editorialNote
   "http://metadataregistry.org/vocabulary/show/id/356.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gcipmedia,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by GAMECIP (Game Metadata and Citation Project)"},
   :skos/editorial "http://metadataregistry.org/vocabulary/show/id/356.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gcipmedia",
   :skos/prefLabel "GAMECIP - computer game media formats"})

(def gcipplatform
  "Published by GAMECIP (Game Metadata and Citation Project)"
  {:db/ident :loc.subjectSchemes/gcipplatform,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GAMECIP - computer game platforms",
   :madsrdf/code "gcipplatform",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by GAMECIP (Game Metadata and Citation Project)"},
   :madsrdf/editorialNote
   "http://metadataregistry.org/vocabulary/show/id/354.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gcipplatform,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by GAMECIP (Game Metadata and Citation Project)"},
   :skos/editorial "http://metadataregistry.org/vocabulary/show/id/354.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gcipplatform",
   :skos/prefLabel "GAMECIP - computer game platforms"})

(def gem
  "Published by ERIC Clearinghouse on Information & Technology, Gateway to Educational Materials in Syracuse, NY"
  {:db/ident :loc.subjectSchemes/gem,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GEM controlled vocabularies",
   :madsrdf/code "gem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by ERIC Clearinghouse on Information & Technology, Gateway to Educational Materials in Syracuse, NY"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gem,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by ERIC Clearinghouse on Information & Technology, Gateway to Educational Materials in Syracuse, NY"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gem",
   :skos/prefLabel "GEM controlled vocabularies"})

(def gemet
  "Published by European Environment Agency (EEA)"
  {:db/ident :loc.subjectSchemes/gemet,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GEMET thesaurus",
   :madsrdf/code "gemet",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by European Environment Agency (EEA)"},
   :madsrdf/editorialNote "https://www.eionet.europa.eu/gemet/en/about/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gemet,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by European Environment Agency (EEA)"},
   :skos/editorial "https://www.eionet.europa.eu/gemet/en/about/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gemet",
   :skos/prefLabel "GEMET thesaurus"})

(def geonet
  "Published by National Geospatial-Intelligence Agency"
  {:db/ident :loc.subjectSchemes/geonet,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Geographic Names Server (GNS)",
   :madsrdf/code "geonet",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by National Geospatial-Intelligence Agency"},
   :madsrdf/editorialNote
   "https://geonames.nga.mil/geonames/GNSHome/welcome.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/geonet,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Geospatial-Intelligence Agency"},
   :skos/editorial "https://geonames.nga.mil/geonames/GNSHome/welcome.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "geonet",
   :skos/prefLabel "Geographic Names Server (GNS)"})

(def georeft
  "Published by American Geological Institute in Alexandria, VA"
  {:db/ident :loc.subjectSchemes/georeft,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GeoRef thesaurus",
   :madsrdf/code "georeft",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by American Geological Institute in Alexandria, VA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/georeft,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by American Geological Institute in Alexandria, VA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "georeft",
   :skos/prefLabel "GeoRef thesaurus"})

(def gnd
  "Published by Deutsche Nationalbibliothek in Leipzig and Frankfurt"
  {:db/ident :loc.subjectSchemes/gnd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gemeinsame Normdatei",
   :madsrdf/code "gnd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Deutsche Nationalbibliothek in Leipzig and Frankfurt"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gnd,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Deutsche Nationalbibliothek in Leipzig and Frankfurt"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gnd",
   :skos/prefLabel "Gemeinsame Normdatei"})

(def gnis
  "Published by United States Geological Survey, Board on Geographic Names"
  {:db/ident :loc.subjectSchemes/gnis,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Geographic Names Information System (GNIS)",
   :madsrdf/code "gnis",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by United States Geological Survey, Board on Geographic Names"},
   :madsrdf/editorialNote
   "https://www.usgs.gov/core-science-systems/ngp/board-on-geographic-names",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gnis,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by United States Geological Survey, Board on Geographic Names"},
   :skos/editorial
   "https://www.usgs.gov/core-science-systems/ngp/board-on-geographic-names",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gnis",
   :skos/prefLabel "Geographic Names Information System (GNIS)"})

(def gpn
  "Gazetteer of planetary nomenclature"
  {:db/ident :loc.subjectSchemes/gpn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gazetteer of planetary nomenclature",
   :madsrdf/code "gpn",
   :madsrdf/editorialNote "https://planetarynames.wr.usgs.gov/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gpn,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://planetarynames.wr.usgs.gov/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gpn",
   :skos/prefLabel "Gazetteer of planetary nomenclature"})

(def gsso
  "Gender, sex, and sexual orientation (GSSO) ontology"
  {:db/ident :loc.subjectSchemes/gsso,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Gender, sex, and sexual orientation (GSSO) ontology",
   :madsrdf/code "gsso",
   :madsrdf/editorialNote "http://www.ontobee.org/ontology/GSSO",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gsso,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.ontobee.org/ontology/GSSO",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gsso",
   :skos/prefLabel "Gender, sex, and sexual orientation (GSSO) ontology"})

(def gst
  "Published by Michel in Princeton, NJ"
  {:db/ident :loc.subjectSchemes/gst,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Gay studies thesaurus: a controlled vocabulary for indexing and accessing materials of relevance to gay culture, history, politics and psychology",
   :madsrdf/code "gst",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Michel in Princeton, NJ"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gst,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Michel in Princeton, NJ"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gst",
   :skos/prefLabel
   "Gay studies thesaurus: a controlled vocabulary for indexing and accessing materials of relevance to gay culture, history, politics and psychology"})

(def gtt
  "Published by Koninklijke Bibliotheek in Den Haag"
  {:db/ident :loc.subjectSchemes/gtt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GOO-trefwoorden thesaurus",
   :madsrdf/code "gtt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Koninklijke Bibliotheek in Den Haag"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/gtt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Koninklijke Bibliotheek in Den Haag"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "gtt",
   :skos/prefLabel "GOO-trefwoorden thesaurus"})

(def habibe
  "Published by Patagos in [Poitiers, France]"
  {:db/ident :loc.subjectSchemes/habibe,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Habitants.be - Nom des habitants de Belgique",
   :madsrdf/code "habibe",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Patagos in [Poitiers, France]"},
   :madsrdf/editorialNote "http://www.habitants.be/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/habibe,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Patagos in [Poitiers, France]"},
   :skos/editorial "http://www.habitants.be/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "habibe",
   :skos/prefLabel "Habitants.be - Nom des habitants de Belgique"})

(def habich
  "Published by Patagos in [Poitiers, France]"
  {:db/ident :loc.subjectSchemes/habich,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Habitants.ch - Nom des habitants de Suisse",
   :madsrdf/code "habich",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Patagos in [Poitiers, France]"},
   :madsrdf/editorialNote "http://www.habitants.ch/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/habich,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Patagos in [Poitiers, France]"},
   :skos/editorial "http://www.habitants.ch/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "habich",
   :skos/prefLabel "Habitants.ch - Nom des habitants de Suisse"})

(def habifr
  "Published by Patagos in [Poitiers, France]"
  {:db/ident :loc.subjectSchemes/habifr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Habitants.fr",
   :madsrdf/code "habifr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Patagos in [Poitiers, France]"},
   :madsrdf/editorialNote "http://www.habitants.fr/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/habifr,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Patagos in [Poitiers, France]"},
   :skos/editorial "http://www.habitants.fr/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "habifr",
   :skos/prefLabel "Habitants.fr"})

(def habiit
  "Published by Patagos in [Poitiers, France]"
  {:db/ident :loc.subjectSchemes/habiit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Habitants.it - Nomi di abitanti d'Italia",
   :madsrdf/code "habiit",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Patagos in [Poitiers, France]"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/habiit,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Patagos in [Poitiers, France]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "habiit",
   :skos/prefLabel "Habitants.it - Nomi di abitanti d'Italia"})

(def hamsun
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/hamsun,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Hamsun: emneord for Hamsunbibliografien",
   :madsrdf/code "hamsun",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/hamsun,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/hamsun,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "hamsun",
   :skos/prefLabel "Hamsun: emneord for Hamsunbibliografien"})

(def hapi
  "Published by UCLC Latin America Center Pubs. in Los Angeles, CA"
  {:db/ident :loc.subjectSchemes/hapi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "HAPI thesaurus and name authority, 1970-2000",
   :madsrdf/code "hapi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by UCLC Latin America Center Pubs. in Los Angeles, CA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/hapi,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by UCLC Latin America Center Pubs. in Los Angeles, CA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "hapi",
   :skos/prefLabel "HAPI thesaurus and name authority, 1970-2000"})

(def helecon
  "Published by Helsingin Kauppakorkeakoulu in Helsinki"
  {:db/ident :loc.subjectSchemes/helecon,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Asiasanasto HELECON-tietikantoihin",
   :madsrdf/code "helecon",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Helsingin Kauppakorkeakoulu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/helecon,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/helecon,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Helsingin Kauppakorkeakoulu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "helecon",
   :skos/prefLabel "Asiasanasto HELECON-tietikantoihin"})

(def henn
  "Published by Hennepin Co. Library in Edina, MN"
  {:db/ident :loc.subjectSchemes/henn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Hennepin County Library cumulative authority list",
   :madsrdf/code "henn",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Hennepin Co. Library in Edina, MN"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/henn,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Hennepin Co. Library in Edina, MN"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "henn",
   :skos/prefLabel "Hennepin County Library cumulative authority list"})

(def hkcan
  "Published by JULAC in Hong Kong"
  {:db/ident :loc.subjectSchemes/hkcan,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Hong Kong Chinese authority file (Name) - HKCAN",
   :madsrdf/code "hkcan",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by JULAC in Hong Kong"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/hkcan,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by JULAC in Hong Kong"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "hkcan",
   :skos/prefLabel "Hong Kong Chinese authority file (Name) - HKCAN"})

(def hlasstg
  "Published by Library of Congress, Hispanic Division, Handbook of Latin American Studies section in Washington, DC"
  {:db/ident :loc.subjectSchemes/hlasstg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "HLAS subject term glossary",
   :madsrdf/code "hlasstg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Hispanic Division, Handbook of Latin American Studies section in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/hlasstg,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Hispanic Division, Handbook of Latin American Studies section in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "hlasstg",
   :skos/prefLabel "HLAS subject term glossary"})

(def hoidokki
  "Published by Sairaanhoitajien koulutussätiö in Helsinki"
  {:db/ident :loc.subjectSchemes/hoidokki,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Hoitotieteellinen asiasanasto",
   :madsrdf/code "hoidokki",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Sairaanhoitajien koulutussätiö in Helsinki"},
   :madsrdf/editorialNote "http://www.hoidokki.fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/hoidokki,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Sairaanhoitajien koulutussätiö in Helsinki"},
   :skos/editorial "http://www.hoidokki.fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "hoidokki",
   :skos/prefLabel "Hoitotieteellinen asiasanasto"})

(def homoit
  "Published by College of the Holy Cross in Worcester, Mass. [formerly Homosaurus: an international thesaurus of lesbian, gay, bisexual and transgender index terms]"
  {:db/ident :loc.subjectSchemes/homoit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Homosaurus: an international LGBTQ linked data vocabulary",
   :madsrdf/code "homoit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by College of the Holy Cross in Worcester, Mass. [formerly Homosaurus: an international thesaurus of lesbian, gay, bisexual and transgender index terms]"},
   :madsrdf/editorialNote "https://homosaurus.org/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/homoit,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by College of the Holy Cross in Worcester, Mass. [formerly Homosaurus: an international thesaurus of lesbian, gay, bisexual and transgender index terms]"},
   :skos/editorial "https://homosaurus.org/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "homoit",
   :skos/prefLabel "Homosaurus: an international LGBTQ linked data vocabulary"})

(def hrvmesh
  "Published by Zagreb: Medicinski fakultet Sveucilita u Zagrebu - Sredinja medicinska knjinica"
  {:db/ident :loc.subjectSchemes/hrvmesh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Croatian MeSH / Hrvatski MeSH",
   :madsrdf/code "hrvmesh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Zagreb: Medicinski fakultet Sveucilita u Zagrebu - Sredinja medicinska knjinica"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/hrvmesh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Zagreb: Medicinski fakultet Sveucilita u Zagrebu - Sredinja medicinska knjinica"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "hrvmesh",
   :skos/prefLabel "Croatian MeSH / Hrvatski MeSH"})

(def hrvmr
  "Published by Leksikografski zavod Miroslav Krleža in Zagreb"
  {:db/ident :loc.subjectSchemes/hrvmr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Hrvatski mjesni rječnik",
   :madsrdf/code "hrvmr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Leksikografski zavod Miroslav Krleža in Zagreb"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/hrvmr,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Leksikografski zavod Miroslav Krleža in Zagreb"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "hrvmr",
   :skos/prefLabel "Hrvatski mjesni rječnik"})

(def huc
  "Published by U.S. Geological Survey in Reston, VA"
  {:db/ident :loc.subjectSchemes/huc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "U.S. Geological Survey water-supply paper 2294: hydrologic basins unit codes",
   :madsrdf/code "huc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by U.S. Geological Survey in Reston, VA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/huc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by U.S. Geological Survey in Reston, VA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "huc",
   :skos/prefLabel
   "U.S. Geological Survey water-supply paper 2294: hydrologic basins unit codes"})

(def humord
  "Published by Universitetsbibliotekene i Oslo, Bergen og Tromsø in Norway"
  {:db/ident :loc.subjectSchemes/humord,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "HUMORD",
   :madsrdf/code "humord",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Universitetsbibliotekene i Oslo, Bergen og Tromsø in Norway"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/humord,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Universitetsbibliotekene i Oslo, Bergen og Tromsø in Norway"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "humord",
   :skos/prefLabel "HUMORD"})

(def ibsen
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/ibsen,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Ibsen: emneord for den internasjonale Ibsen-bibliografien",
   :madsrdf/code "ibsen",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/editorialNote
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ibsen,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/editorial
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ibsen",
   :skos/prefLabel "Ibsen: emneord for den internasjonale Ibsen-bibliografien"})

(def ica
  "Published by Princeton University in Princeton, NJ"
  {:db/ident :loc.subjectSchemes/ica,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Index of Christian art",
   :madsrdf/code "ica",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Princeton University in Princeton, NJ"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ica,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Princeton University in Princeton, NJ"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ica",
   :skos/prefLabel "Index of Christian art"})

(def iconauth
  "Published by Getty Research Institute"
  {:db/ident :loc.subjectSchemes/iconauth,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Iconography authority",
   :madsrdf/code "iconauth",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Getty Research Institute"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/iconauth,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Getty Research Institute"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "iconauth",
   :skos/prefLabel "Iconography authority"})

(def icpsr
  "Published by Inter-university Consortium for Political and Social Research in Ann Arbor, MI"
  {:db/ident :loc.subjectSchemes/icpsr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ICPSR controlled vocabulary system",
   :madsrdf/code "icpsr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Inter-university Consortium for Political and Social Research in Ann Arbor, MI"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/icpsr,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Inter-university Consortium for Political and Social Research in Ann Arbor, MI"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "icpsr",
   :skos/prefLabel "ICPSR controlled vocabulary system"})

(def idas
  "Published by Internationales Institut für Sozialgeschichte in Amsterdam"
  {:db/ident :loc.subjectSchemes/idas,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "ID-Archivschlüssel [Informationsdienst zur Verbreitung unterbliebener Nachrichten]",
   :madsrdf/code "idas",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Internationales Institut für Sozialgeschichte in Amsterdam"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/idas,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Internationales Institut für Sozialgeschichte in Amsterdam"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "idas",
   :skos/prefLabel
   "ID-Archivschlüssel [Informationsdienst zur Verbreitung unterbliebener Nachrichten]"})

(def idsbb
  "Published by Universitätsbibliothek in Basel and Bern"
  {:db/ident :loc.subjectSchemes/idsbb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus IDS Basel Bern",
   :madsrdf/code "idsbb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Universitätsbibliothek in Basel and Bern"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/idsbb,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Universitätsbibliothek in Basel and Bern"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "idsbb",
   :skos/prefLabel "Thesaurus IDS Basel Bern"})

(def idszbz
  "Published by Zentralbibliothek in Zürich"
  {:db/ident :loc.subjectSchemes/idszbz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus IDS Nebis Zentralbibliothek Zürich",
   :madsrdf/code "idszbz",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Zentralbibliothek in Zürich"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/idszbz,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Zentralbibliothek in Zürich"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "idszbz",
   :skos/prefLabel "Thesaurus IDS Nebis Zentralbibliothek Zürich"})

(def idszbzes
  "Published by Universität Zürich in Zürich"
  {:db/ident :loc.subjectSchemes/idszbzes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus IDS Nebis Bibliothek Englisches Seminar der Universität Zürich",
   :madsrdf/code "idszbzes",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Universität Zürich in Zürich"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/idszbzes,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Universität Zürich in Zürich"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "idszbzes",
   :skos/prefLabel
   "Thesaurus IDS Nebis Bibliothek Englisches Seminar der Universität Zürich"})

(def idszbzna
  "Published by Zentralbibliothek in Zürich"
  {:db/ident :loc.subjectSchemes/idszbzna,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus IDS Nebis Zentralbibliothek Zürich, Nordamerika-Bibliothek",
   :madsrdf/code "idszbzna",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Zentralbibliothek in Zürich"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/idszbzna,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Zentralbibliothek in Zürich"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "idszbzna",
   :skos/prefLabel
   "Thesaurus IDS Nebis Zentralbibliothek Zürich, Nordamerika-Bibliothek"})

(def idszbzzg
  "Published by Zentralbibliothek in Zürich"
  {:db/ident :loc.subjectSchemes/idszbzzg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus IDS Nebis Zentralbibliothek Zürich, Graphische Sammlung",
   :madsrdf/code "idszbzzg",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Zentralbibliothek in Zürich"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/idszbzzg,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Zentralbibliothek in Zürich"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "idszbzzg",
   :skos/prefLabel
   "Thesaurus IDS Nebis Zentralbibliothek Zürich, Graphische Sammlung"})

(def idszbzzh
  "Published by Zentralbibliothek in Zürich"
  {:db/ident :loc.subjectSchemes/idszbzzh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus IDS Nebis Zentralbibliothek Zürich, Handschriftenabteilung",
   :madsrdf/code "idszbzzh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Zentralbibliothek in Zürich"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/idszbzzh,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Zentralbibliothek in Zürich"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "idszbzzh",
   :skos/prefLabel
   "Thesaurus IDS Nebis Zentralbibliothek Zürich, Handschriftenabteilung"})

(def idszbzzk
  "Published by Zentralbibliothek in Zürich"
  {:db/ident :loc.subjectSchemes/idszbzzk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus IDS Nebis Zentralbibliothek Zürich, Kartensammlung",
   :madsrdf/code "idszbzzk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Zentralbibliothek in Zürich"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/idszbzzk,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Zentralbibliothek in Zürich"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "idszbzzk",
   :skos/prefLabel
   "Thesaurus IDS Nebis Zentralbibliothek Zürich, Kartensammlung"})

(def iescs
  "Published by International Energy Agency in Paris"
  {:db/ident :loc.subjectSchemes/iescs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "International energy subject categories and scope",
   :madsrdf/code "iescs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by International Energy Agency in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/iescs,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by International Energy Agency in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "iescs",
   :skos/prefLabel "International energy subject categories and scope"})

(def iest
  "Published by International Energy Agency, Energy Technology Data Exchange in Paris, France"
  {:db/ident :loc.subjectSchemes/iest,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "International energy: subject thesaurus",
   :madsrdf/code "iest",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by International Energy Agency, Energy Technology Data Exchange in Paris, France"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/iest,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by International Energy Agency, Energy Technology Data Exchange in Paris, France"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "iest",
   :skos/prefLabel "International energy: subject thesaurus"})

(def ilot
  "Published by International Labour Organization in Geneval, Switzerland"
  {:db/ident :loc.subjectSchemes/ilot,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2023-01-03T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2023-01-03T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ILO thesaurus",
   :madsrdf/code "ilot",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by International Labour Organization in Geneval, Switzerland"},
   :madsrdf/editorialNote "https://metadata.ilo.org/thesaurus.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2023-01-03T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2023-01-03T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ilot,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by International Labour Organization in Geneval, Switzerland"},
   :skos/editorial "https://metadata.ilo.org/thesaurus.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ilot",
   :skos/prefLabel "ILO thesaurus"})

(def ilpt
  "Published by H.W. Wilson in New York, NY"
  {:db/ident :loc.subjectSchemes/ilpt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Index to legal periodicals: thesaurus",
   :madsrdf/code "ilpt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by H.W. Wilson in New York, NY"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ilpt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by H.W. Wilson in New York, NY"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ilpt",
   :skos/prefLabel "Index to legal periodicals: thesaurus"})

(def inist
  "Published by International Atomic Energy Agency in Vienna"
  {:db/ident :loc.subjectSchemes/inist,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "INIS: thesaurus",
   :madsrdf/code "inist",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by International Atomic Energy Agency in Vienna"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/inist,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by International Atomic Energy Agency in Vienna"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "inist",
   :skos/prefLabel "INIS: thesaurus"})

(def inspect
  "Published by Institution of Electrical Engineers in London"
  {:db/ident :loc.subjectSchemes/inspect,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "INSPEC thesaurus",
   :madsrdf/code "inspect",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Institution of Electrical Engineers in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/inspect,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Institution of Electrical Engineers in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "inspect",
   :skos/prefLabel "INSPEC thesaurus"})

(def ipat
  "Published by American Society of Hospital Pharmacists in Bethesda, MD"
  {:db/ident :loc.subjectSchemes/ipat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "IPA thesaurus and frequency list",
   :madsrdf/code "ipat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by American Society of Hospital Pharmacists in Bethesda, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ipat,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by American Society of Hospital Pharmacists in Bethesda, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ipat",
   :skos/prefLabel "IPA thesaurus and frequency list"})

(def ipsp
  "Published by Defense Intelligence Agency in Washington, DC"
  {:db/ident :loc.subjectSchemes/ipsp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Defense intelligence production schedule",
   :madsrdf/code "ipsp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Defense Intelligence Agency in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ipsp,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Defense Intelligence Agency in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ipsp",
   :skos/prefLabel "Defense intelligence production schedule"})

(def iptcnc
  "Published by International Press Telecommunications Council"
  {:db/ident :loc.subjectSchemes/iptcnc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "IPTC NewsCodes",
   :madsrdf/code "iptcnc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by International Press Telecommunications Council"},
   :madsrdf/editorialNote "https://iptc.org/standards/newscodes/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/iptcnc,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by International Press Telecommunications Council"},
   :skos/editorial "https://iptc.org/standards/newscodes/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "iptcnc",
   :skos/prefLabel "IPTC NewsCodes"})

(def isis
  "Published by University of Chicago Press in Chicago, IL"
  {:db/ident :loc.subjectSchemes/isis,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Classification scheme in Isis",
   :madsrdf/code "isis",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by University of Chicago Press in Chicago, IL"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/isis,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by University of Chicago Press in Chicago, IL"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "isis",
   :skos/prefLabel "Classification scheme in Isis"})

(def itglit
  "Published by Thesaurus Committee, Gay and Lesbian Task Force, American Library Association in Chicago?"
  {:db/ident :loc.subjectSchemes/itglit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "International thesaurus of gay and lesbian index terms",
   :madsrdf/code "itglit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Thesaurus Committee, Gay and Lesbian Task Force, American Library Association in Chicago?"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/itglit,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Thesaurus Committee, Gay and Lesbian Task Force, American Library Association in Chicago?"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "itglit",
   :skos/prefLabel "International thesaurus of gay and lesbian index terms"})

(def itis
  "Published by United States Geological Survey"
  {:db/ident :loc.subjectSchemes/itis,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Integrated Taxonomic Information System (ITIS)",
   :madsrdf/code "itis",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by United States Geological Survey"},
   :madsrdf/editorialNote "https://www.itis.gov/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/itis,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by United States Geological Survey"},
   :skos/editorial "https://www.itis.gov/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "itis",
   :skos/prefLabel "Integrated Taxonomic Information System (ITIS)"})

(def itrt
  "Published by United Nations High Commissioner for Refugees in New York & Geneva"
  {:db/ident :loc.subjectSchemes/itrt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "International thesaurus of refugee terminology",
   :madsrdf/code "itrt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by United Nations High Commissioner for Refugees in New York & Geneva"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/itrt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by United Nations High Commissioner for Refugees in New York & Geneva"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "itrt",
   :skos/prefLabel "International thesaurus of refugee terminology"})

(def jhpb
  "Published by Biblioteka Narodowa in Warszawa"
  {:db/ident :loc.subjectSchemes/jhpb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Język haseł przedmiotowych Biblioteki Narodowej = National Library of Poland subject headings",
   :madsrdf/code "jhpb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Biblioteka Narodowa in Warszawa"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/jhpb,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Biblioteka Narodowa in Warszawa"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "jhpb",
   :skos/prefLabel
   "Język haseł przedmiotowych Biblioteki Narodowej = National Library of Poland subject headings"})

(def jhpk
  "Published by Stowarzyszenie Bibliotekarzy Polskich, Centrum Formatów i Kartotek Haseł Wzorcowych Biblioteki Uniwersyteckiej w Warszawie in Warszawa"
  {:db/ident :loc.subjectSchemes/jhpk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Język haseł przedmiotowych KABA",
   :madsrdf/code "jhpk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Stowarzyszenie Bibliotekarzy Polskich, Centrum Formatów i Kartotek Haseł Wzorcowych Biblioteki Uniwersyteckiej w Warszawie in Warszawa"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/jhpk,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/jhpk,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Stowarzyszenie Bibliotekarzy Polskich, Centrum Formatów i Kartotek Haseł Wzorcowych Biblioteki Uniwersyteckiej w Warszawie in Warszawa"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "jhpk",
   :skos/prefLabel "Język haseł przedmiotowych KABA"})

(def jlabsh
  "Published in Nihon Toshokan Kyôkai in Tokyo"
  {:db/ident :loc.subjectSchemes/jlabsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Kihon kenmei hyômokuhyô = [Japan Library Association] Basic subject headings",
   :madsrdf/code "jlabsh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published in Nihon Toshokan Kyôkai in Tokyo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/jlabsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published in Nihon Toshokan Kyôkai in Tokyo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "jlabsh",
   :skos/prefLabel
   "Kihon kenmei hyômokuhyô = [Japan Library Association] Basic subject headings"})

(def juho
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/juho,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "JUHO - Julkishallinnon ontologia",
   :madsrdf/code "juho",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/juho,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "juho",
   :skos/prefLabel "JUHO - Julkishallinnon ontologia"})

(def jupo
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/jupo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "JUPO - Julkisen hallinnon palveluontologia",
   :madsrdf/code "jupo",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/jupo,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "jupo",
   :skos/prefLabel "JUPO - Julkisen hallinnon palveluontologia"})

(def jurivoc
  "Published by Tribunal fédéral in Lausanne"
  {:db/ident :loc.subjectSchemes/jurivoc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "JURIVOC",
   :madsrdf/code "jurivoc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Tribunal fédéral in Lausanne"},
   :madsrdf/editorialNote
   "https://www.bger.ch/ext/jurivoc/live/fr/jurivoc/Jurivoc.jsp?interfaceLanguage=french",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/jurivoc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Tribunal fédéral in Lausanne"},
   :skos/editorial
   "https://www.bger.ch/ext/jurivoc/live/fr/jurivoc/Jurivoc.jsp?interfaceLanguage=french",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "jurivoc",
   :skos/prefLabel "JURIVOC"})

(def kaa
  "Published by Kasvatustieteiden tutkimuslaitos in Jyväskylä"
  {:db/ident :loc.subjectSchemes/kaa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Kasvatusalan asiasanasto",
   :madsrdf/code "kaa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Kasvatustieteiden tutkimuslaitos in Jyväskylä"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kaa,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Kasvatustieteiden tutkimuslaitos in Jyväskylä"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kaa",
   :skos/prefLabel "Kasvatusalan asiasanasto"})

(def kaba
  "Published by Stowarzyszenie Bibliotekarzy Polskich, Centrum Formatów i Kartotek Haseł Wzorcowych Biblioteki Uniwersyteckiej w Warszawie in Warszawa [Note: This source was previously assigned code \"jhpk\"]"
  {:db/ident :loc.subjectSchemes/kaba,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Język haseł przedmiotowych KABA = KABA subject headings",
   :madsrdf/code "kaba",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Stowarzyszenie Bibliotekarzy Polskich, Centrum Formatów i Kartotek Haseł Wzorcowych Biblioteki Uniwersyteckiej w Warszawie in Warszawa [Note: This source was previously assigned code \"jhpk\"]"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kaba,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Stowarzyszenie Bibliotekarzy Polskich, Centrum Formatów i Kartotek Haseł Wzorcowych Biblioteki Uniwersyteckiej w Warszawie in Warszawa [Note: This source was previously assigned code \"jhpk\"]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kaba",
   :skos/prefLabel "Język haseł przedmiotowych KABA = KABA subject headings"})

(def kao
  "Published by Göteborgs universitetsbibliotek, Kvinnohistoriska samlingarna in Göteborg"
  {:db/ident :loc.subjectSchemes/kao,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "KVINNSAM ämnesordsregister = KVINNSAM subject headings",
   :madsrdf/code "kao",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Göteborgs universitetsbibliotek, Kvinnohistoriska samlingarna in Göteborg"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kao,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Göteborgs universitetsbibliotek, Kvinnohistoriska samlingarna in Göteborg"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kao",
   :skos/prefLabel "KVINNSAM ämnesordsregister = KVINNSAM subject headings"})

(def kassu
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/kassu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Kassu - Kasvien suomenkieliset nimet",
   :madsrdf/code "kassu",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kassu,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kassu",
   :skos/prefLabel "Kassu - Kasvien suomenkieliset nimet"})

(def kauno
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/kauno,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "KAUNO - Kaunokki-ontologin",
   :madsrdf/code "kauno",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/kauno/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kauno,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/kauno/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kauno",
   :skos/prefLabel "KAUNO - Kaunokki-ontologin"})

(def kaunokki
  "Published by BTJ Kirjastopalvelu in Helsinki"
  {:db/ident :loc.subjectSchemes/kaunokki,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Kaunokki: kaunokirjallisuuden asiasanasto",
   :madsrdf/code "kaunokki",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by BTJ Kirjastopalvelu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kaunokki,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kaunokki,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by BTJ Kirjastopalvelu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kaunokki",
   :skos/prefLabel "Kaunokki: kaunokirjallisuuden asiasanasto"})

(def kdm
  "Published by Viên Thông Tin Khoa Hoc Và Ky Thuât Trung Uong in Hà Nôi"
  {:db/ident :loc.subjectSchemes/kdm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Khung dê muc hê thông thông tin khoa hoc và ky thuât quôc gia",
   :madsrdf/code "kdm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Viên Thông Tin Khoa Hoc Và Ky Thuât Trung Uong in Hà Nôi"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kdm,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Viên Thông Tin Khoa Hoc Và Ky Thuât Trung Uong in Hà Nôi"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kdm",
   :skos/prefLabel
   "Khung dê muc hê thông thông tin khoa hoc và ky thuât quôc gia"})

(def khib
  "Published by Kunst- og designhøgskolen i Bergen, Biblioteket in Bergen"
  {:db/ident :loc.subjectSchemes/khib,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Emneord, KHiB Biblioteket",
   :madsrdf/code "khib",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Kunst- og designhøgskolen i Bergen, Biblioteket in Bergen"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/khib,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Kunst- og designhøgskolen i Bergen, Biblioteket in Bergen"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "khib",
   :skos/prefLabel "Emneord, KHiB Biblioteket"})

(def kito
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/kito,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "KITO - Kirjallisuudentutkimuksen ontologia",
   :madsrdf/code "kito",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kito,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kito,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kito",
   :skos/prefLabel "KITO - Kirjallisuudentutkimuksen ontologia"})

(def kitu
  "Published by Suomalaisen Kirjallisuuden seura in Helsinki"
  {:db/ident :loc.subjectSchemes/kitu,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00T/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00T/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Kirjallisuudentutkimuksen asiasanasto",
   :madsrdf/code "kitu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Suomalaisen Kirjallisuuden seura in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kitu,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00T/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00T/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kitu,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Suomalaisen Kirjallisuuden seura in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kitu",
   :skos/prefLabel "Kirjallisuudentutkimuksen asiasanasto"})

(def kkts
  "Published by Dēmosia Kentrikē Vivliothēkē Levadeias in Livadeia"
  {:db/ident :loc.subjectSchemes/kkts,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Katalogos Kathierōmenōn Typōn Syllogikou Katalogou Demosion Vivliothekon",
   :madsrdf/code "kkts",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Dēmosia Kentrikē Vivliothēkē Levadeias in Livadeia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kkts,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Dēmosia Kentrikē Vivliothēkē Levadeias in Livadeia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kkts",
   :skos/prefLabel
   "Katalogos Kathierōmenōn Typōn Syllogikou Katalogou Demosion Vivliothekon"})

(def koko
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/koko,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "KOKO-ontologia",
   :madsrdf/code "koko",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/koko,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "koko",
   :skos/prefLabel "KOKO-ontologia"})

(def kssbar
  "Published by Bibliotekstjanst in Lund"
  {:db/ident :loc.subjectSchemes/kssbar,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Klassifikationssystem for svenska bibliotek. Ämnesordregister. Alfabetisk del",
   :madsrdf/code "kssbar",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Bibliotekstjanst in Lund"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kssbar,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Bibliotekstjanst in Lund"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kssbar",
   :skos/prefLabel
   "Klassifikationssystem for svenska bibliotek. Ämnesordregister. Alfabetisk del"})

(def kta
  "Published by BTJ Kirjastopalvelu in Helsinki"
  {:db/ident :loc.subjectSchemes/kta,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Kielitieteen asiasanasto",
   :madsrdf/code "kta",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by BTJ Kirjastopalvelu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kta,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by BTJ Kirjastopalvelu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kta",
   :skos/prefLabel "Kielitieteen asiasanasto"})

(def kto
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/kto,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "KTO - Kielitieteen ontologia",
   :madsrdf/code "kto",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kto,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kto",
   :skos/prefLabel "KTO - Kielitieteen ontologia"})

(def ktpt
  "Published by Tampereen yliopisto in Tampere"
  {:db/ident :loc.subjectSchemes/ktpt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Kirjasto- ja tietopalvelualan tesaurus",
   :madsrdf/code "ktpt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Tampereen yliopisto in Tampere"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ktpt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Tampereen yliopisto in Tampere"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ktpt",
   :skos/prefLabel "Kirjasto- ja tietopalvelualan tesaurus"})

(def ktta
  "Published by Kuopinon Käsi - ja taideteollisuusakatemia taito- ja tutkimuskeskus Taitemia in Kuopio"
  {:db/ident :loc.subjectSchemes/ktta,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Käsi - ja taideteollisuuden asiasanasto",
   :madsrdf/code "ktta",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Kuopinon Käsi - ja taideteollisuusakatemia taito- ja tutkimuskeskus Taitemia in Kuopio"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ktta,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Kuopinon Käsi - ja taideteollisuusakatemia taito- ja tutkimuskeskus Taitemia in Kuopio"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ktta",
   :skos/prefLabel "Käsi - ja taideteollisuuden asiasanasto"})

(def kubikat
  "kubikat"
  {:db/ident :loc.subjectSchemes/kubikat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "kubikat",
   :madsrdf/code "kubikat",
   :madsrdf/editorialNote "http://aleph.mpg.de/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kubikat,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://aleph.mpg.de/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kubikat",
   :skos/prefLabel "kubikat"})

(def kula
  "Published by Suomalaisen Kirjallisuuden seura in Helsinki"
  {:db/ident :loc.subjectSchemes/kula,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Kulttuurien tutkimuksen asiasanasto",
   :madsrdf/code "kula",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Suomalaisen Kirjallisuuden seura in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kula,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kula,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Suomalaisen Kirjallisuuden seura in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kula",
   :skos/prefLabel "Kulttuurien tutkimuksen asiasanasto"})

(def kulo
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/kulo,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "KULO - Kulttuurien tutkimuksen ontologia",
   :madsrdf/code "kulo",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kulo,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/kulo,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kulo",
   :skos/prefLabel "KULO - Kulttuurien tutkimuksen ontologia"})

(def kupu
  "Published by National Library of New Zealand in Wellington"
  {:db/ident :loc.subjectSchemes/kupu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "He puna kupu / Maori Wordnet",
   :madsrdf/code "kupu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by National Library of New Zealand in Wellington"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/kupu,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by National Library of New Zealand in Wellington"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "kupu",
   :skos/prefLabel "He puna kupu / Maori Wordnet"})

(def labloc
  "Published by Collins in New York"
  {:db/ident :loc.subjectSchemes/labloc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dickson, Paul. Labels for locals",
   :madsrdf/code "labloc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Collins in New York"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/labloc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Collins in New York"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "labloc",
   :skos/prefLabel "Dickson, Paul. Labels for locals"})

(def lacnaf
  "Published by Library and Archives Canada in Ottawa, ON"
  {:db/ident :loc.subjectSchemes/lacnaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Library and Archives Canada name authority file",
   :madsrdf/code "lacnaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Library and Archives Canada in Ottawa, ON"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lacnaf,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Library and Archives Canada in Ottawa, ON"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lacnaf",
   :skos/prefLabel "Library and Archives Canada name authority file"})

(def lapponica
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/lapponica,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lapponica",
   :madsrdf/code "lapponica",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lapponica,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lapponica",
   :skos/prefLabel "Lapponica"})

(def larpcal
  "Published by Universidade de São Paulo, Sistema Integrado de Bibliotecas in São Paulo"
  {:db/ident :loc.subjectSchemes/larpcal,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Lista de assuntos referente ao programa de cadastramento automatizado de livros da USP",
   :madsrdf/code "larpcal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Universidade de São Paulo, Sistema Integrado de Bibliotecas in São Paulo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/larpcal,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Universidade de São Paulo, Sistema Integrado de Bibliotecas in São Paulo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "larpcal",
   :skos/prefLabel
   "Lista de assuntos referente ao programa de cadastramento automatizado de livros da USP"})

(def lcac
  "Published by Library of Congress, Cataloging Distribution Service in Washington, DC"
  {:db/ident :loc.subjectSchemes/lcac,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel
   "Library of Congress Annotated Children's Cataloging Program subject headings",
   :madsrdf/code "lcac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Cataloging Distribution Service in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/lcac,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/lcac,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Cataloging Distribution Service in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lcac",
   :skos/prefLabel
   "Library of Congress Annotated Children's Cataloging Program subject headings"})

(def lcdgt
  "Published by Library of Congress, Policy and Standards Division in Washington, DC"
  {:db/ident :loc.subjectSchemes/lcdgt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Library of Congress demographic group term and code list",
   :madsrdf/code "lcdgt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Policy and Standards Division in Washington, DC"},
   :madsrdf/editorialNote "https://www.loc.gov/standards/valuelist/lcdgt.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lcdgt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Policy and Standards Division in Washington, DC"},
   :skos/editorial "https://www.loc.gov/standards/valuelist/lcdgt.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lcdgt",
   :skos/prefLabel "Library of Congress demographic group term and code list"})

(def lcsh
  "Published by Library of Congress, Cataloging Distribution Service in Washington, DC"
  {:db/ident :loc.subjectSchemes/lcsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Library of Congress subject headings",
   :madsrdf/code "lcsh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Cataloging Distribution Service in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lcsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Cataloging Distribution Service in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lcsh",
   :skos/prefLabel "Library of Congress subject headings"})

(def lcshac
  "Published by Library of Congress, Cataloging Distribution Service in Washington, DC"
  {:db/ident :loc.subjectSchemes/lcshac,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel
   "Children's subject headings in Library of Congress subject headings: supplementary vocabularies",
   :madsrdf/code "lcshac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Cataloging Distribution Service in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/lcshac,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/lcshac,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Cataloging Distribution Service in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lcshac",
   :skos/prefLabel
   "Children's subject headings in Library of Congress subject headings: supplementary vocabularies"})

(def lcstt
  "Published by National Central Library in Taipei"
  {:db/ident :loc.subjectSchemes/lcstt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "List of Chinese subject terms",
   :madsrdf/code "lcstt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Central Library in Taipei"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lcstt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Central Library in Taipei"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lcstt",
   :skos/prefLabel "List of Chinese subject terms"})

(def lctgm
  "Thesaurus for graphic materials: TGM I, Subject terms"
  {:db/ident :loc.subjectSchemes/lctgm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus for graphic materials: TGM I, Subject terms",
   :madsrdf/code "lctgm",
   :madsrdf/editorialNote "https://www.loc.gov/rr/print/tgm1/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lctgm,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.loc.gov/rr/print/tgm1/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lctgm",
   :skos/prefLabel "Thesaurus for graphic materials: TGM I, Subject terms"})

(def lemac
  "Published by Biblioteca de Catalunya, Servei de Normalització Bibliogràfica in Barcelona"
  {:db/ident :loc.subjectSchemes/lemac,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Llista d'encapçalaments de matèria en català",
   :madsrdf/code "lemac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Biblioteca de Catalunya, Servei de Normalització Bibliogràfica in Barcelona"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lemac,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Biblioteca de Catalunya, Servei de Normalització Bibliogràfica in Barcelona"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lemac",
   :skos/prefLabel "Llista d'encapçalaments de matèria en català"})

(def lemb
  "Published by Rojas Eberhard Editores, Ltda in Santafe de Bogotá"
  {:db/ident :loc.subjectSchemes/lemb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Lista de encabezamientos de materia para bibliotecas",
   :madsrdf/code "lemb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Rojas Eberhard Editores, Ltda in Santafe de Bogotá"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lemb,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Rojas Eberhard Editores, Ltda in Santafe de Bogotá"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lemb",
   :skos/prefLabel "Lista de encabezamientos de materia para bibliotecas"})

(def liito
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/liito,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "LIITO - Liiketoimintaontologia",
   :madsrdf/code "liito",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/liito,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/liito,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "liito",
   :skos/prefLabel "LIITO - Liiketoimintaontologia"})

(def liv
  "Published by Library of Congress, Congressional Research Service in Washington, DC"
  {:db/ident :loc.subjectSchemes/liv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Legislative indexing vocabulary",
   :madsrdf/code "liv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Congressional Research Service in Washington, DC"},
   :madsrdf/editorialNote
   "https://www.congress.gov/help/legislative-glossary#glossary_legislativeindexingvocabulary",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/liv,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Library of Congress, Congressional Research Service in Washington, DC"},
   :skos/editorial
   "https://www.congress.gov/help/legislative-glossary#glossary_legislativeindexingvocabulary",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "liv",
   :skos/prefLabel "Legislative indexing vocabulary"})

(def lnmmbr
  "Published by LNMMB in Vilnius"
  {:db/ident :loc.subjectSchemes/lnmmbr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Lietuvos nacionalines Martyno Mazvydo bibliotekos rubrikynas",
   :madsrdf/code "lnmmbr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by LNMMB in Vilnius"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lnmmbr,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by LNMMB in Vilnius"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lnmmbr",
   :skos/prefLabel
   "Lietuvos nacionalines Martyno Mazvydo bibliotekos rubrikynas"})

(def local
  "Locally assigned term"
  {:db/ident :loc.subjectSchemes/local,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Locally assigned term",
   :madsrdf/code "local",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/local,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "local",
   :skos/prefLabel "Locally assigned term"})

(def ltcsh
  "Published by Land Tenure Center Library, University of Wisconsin-Madison in Madison, WI"
  {:db/ident :loc.subjectSchemes/ltcsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Land Tenure Center Library list of subject headings",
   :madsrdf/code "ltcsh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Land Tenure Center Library, University of Wisconsin-Madison in Madison, WI"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ltcsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Land Tenure Center Library, University of Wisconsin-Madison in Madison, WI"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ltcsh",
   :skos/prefLabel "Land Tenure Center Library list of subject headings"})

(def lua
  "Published by Likkunnan ja kansanterveyden edustämissätiö in Jyvässkylä"
  {:db/ident :loc.subjectSchemes/lua,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Liikunnan ja urheilun asiasanasto",
   :madsrdf/code "lua",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Likkunnan ja kansanterveyden edustämissätiö in Jyvässkylä"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/lua,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Likkunnan ja kansanterveyden edustämissätiö in Jyvässkylä"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "lua",
   :skos/prefLabel "Liikunnan ja urheilun asiasanasto"})

(def maaq
  "Published by Maktabah al-Akâdîmîyah in Cairo"
  {:db/ident :loc.subjectSchemes/maaq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Madâkhil al-asmâ' al-'arabîyah al-qadîmah",
   :madsrdf/code "maaq",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Maktabah al-Akâdîmîyah in Cairo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/maaq,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Maktabah al-Akâdîmîyah in Cairo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "maaq",
   :skos/prefLabel "Madâkhil al-asmâ' al-'arabîyah al-qadîmah"})

(def maknaz
  "Expanded thesaurus (Maknaz) = al-Maknaz al-Muwassa'"
  {:db/ident :loc.subjectSchemes/maknaz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Expanded thesaurus (Maknaz) = al-Maknaz al-Muwassa'",
   :madsrdf/code "maknaz",
   :madsrdf/hasVariant {:madsrdf/variantLabel "al-Maknaz al-Muwassa'",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "al-Maknaz al-Muwassa'",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/maknaz,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "maknaz",
   :skos/prefLabel "Expanded thesaurus (Maknaz) = al-Maknaz al-Muwassa'",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "al-Maknaz al-Muwassa'"}})

(def maotao
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/maotao,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "MAO/TAO - Ontologi för museibranschen och Konstindustriella ontologin",
   :madsrdf/code "maotao",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/maotao,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "maotao",
   :skos/prefLabel
   "MAO/TAO - Ontologi för museibranschen och Konstindustriella ontologin"})

(def mar
  "Published by Finnish Maritime Administration in Helsinki"
  {:db/ident :loc.subjectSchemes/mar,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Merenkulun asiasanasto = MariTerm (Maritime technology)",
   :madsrdf/code "mar",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Finnish Maritime Administration in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/mar,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Finnish Maritime Administration in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "mar",
   :skos/prefLabel "Merenkulun asiasanasto = MariTerm (Maritime technology)"})

(def masa
  "Published by Museovirasto in Helsinki"
  {:db/ident :loc.subjectSchemes/masa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Museoalan asiasanasto",
   :madsrdf/code "masa",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Museovirasto in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/masa,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Museovirasto in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "masa",
   :skos/prefLabel "Museoalan asiasanasto"})

(def mech
  "Published by University of Ljubljana"
  {:db/ident :loc.subjectSchemes/mech,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Iskanje po zbirki MECH",
   :madsrdf/code "mech",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by University of Ljubljana"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/mech,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by University of Ljubljana"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "mech",
   :skos/prefLabel "Iskanje po zbirki MECH"})

(def mero
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/mero,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "MERO - Merenkulkualan ontologia",
   :madsrdf/code "mero",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/mero,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-12-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-28T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/mero,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "mero",
   :skos/prefLabel "MERO - Merenkulkualan ontologia"})

(def mesh
  "Published by National Library of Medicine in Bethesda, MD"
  {:db/ident :loc.subjectSchemes/mesh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Medical subject headings",
   :madsrdf/code "mesh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by National Library of Medicine in Bethesda, MD"},
   :madsrdf/editorialNote "https://www.nlm.nih.gov/mesh/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/mesh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by National Library of Medicine in Bethesda, MD"},
   :skos/editorial "https://www.nlm.nih.gov/mesh/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "mesh",
   :skos/prefLabel "Medical subject headings"})

(def minecost
  "Published by Spanish Ministry of Economic Affairs and Digital Transformation"
  {:db/ident :loc.subjectSchemes/minecost,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Tesauro de Economía de la Biblioteca Central de MINECO",
   :madsrdf/code "minecost",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Spanish Ministry of Economic Affairs and Digital Transformation"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/minecost,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Spanish Ministry of Economic Affairs and Digital Transformation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "minecost",
   :skos/prefLabel "Tesauro de Economía de la Biblioteca Central de MINECO"})

(def mipfesd
  "Published by Organisation for Economic Co-operation and Development in Paris"
  {:db/ident :loc.subjectSchemes/mipfesd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Macrothesaurus for information processing in the field of economic and social development",
   :madsrdf/code "mipfesd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Organisation for Economic Co-operation and Development in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/mipfesd,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Organisation for Economic Co-operation and Development in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "mipfesd",
   :skos/prefLabel
   "Macrothesaurus for information processing in the field of economic and social development"})

(def mmm
  "Published by International General in New York"
  {:db/ident :loc.subjectSchemes/mmm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Subject key in Marxism and the mass media",
   :madsrdf/code "mmm",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by International General in New York"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/mmm,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by International General in New York"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "mmm",
   :skos/prefLabel "Subject key in Marxism and the mass media"})

(def mpirdes
  "Published by Organización de Cooperación y Desarrollo Económicos in Paris"
  {:db/ident :loc.subjectSchemes/mpirdes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Macrothesaurus para el procesamiento de la información relativa al desarrollo económico y social",
   :madsrdf/code "mpirdes",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Organización de Cooperación y Desarrollo Económicos in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/mpirdes,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Organización de Cooperación y Desarrollo Económicos in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "mpirdes",
   :skos/prefLabel
   "Macrothesaurus para el procesamiento de la información relativa al desarrollo económico y social"})

(def msc
  "Published by American Mathematical Society in Providence, RI"
  {:db/ident :loc.subjectSchemes/msc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Mathematical subject classification",
   :madsrdf/code "msc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by American Mathematical Society in Providence, RI"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/msc,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by American Mathematical Society in Providence, RI"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "msc",
   :skos/prefLabel "Mathematical subject classification"})

(def msh
  "Trimboli, T., and Martyn S. Marianist subject headings"
  {:db/ident :loc.subjectSchemes/msh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Trimboli, T., and Martyn S. Marianist subject headings",
   :madsrdf/code "msh",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/msh,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "msh",
   :skos/prefLabel "Trimboli, T., and Martyn S. Marianist subject headings"})

(def mtirdes
  "Published by Organisation de coopération et développement économiques in Paris"
  {:db/ident :loc.subjectSchemes/mtirdes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Macrothésaurus pour le traitement de l'information relative au développement économique et social",
   :madsrdf/code "mtirdes",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Organisation de coopération et développement économiques in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/mtirdes,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Organisation de coopération et développement économiques in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "mtirdes",
   :skos/prefLabel
   "Macrothésaurus pour le traitement de l'information relative au développement économique et social"})

(def mts
  "Published by National Library of Finland in Helsinki"
  {:db/ident :loc.subjectSchemes/mts,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Metatietosanasto",
   :madsrdf/code "mts",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by National Library of Finland in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/mts/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/mts,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Finland in Helsinki"},
   :skos/editorial "http://finto.fi/mts/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "mts",
   :skos/prefLabel "Metatietosanasto"})

(def musa
  "Published by Kirjastopalvelu in Helsinki"
  {:db/ident :loc.subjectSchemes/musa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Musiikin asiasanasto: erikoissanasto",
   :madsrdf/code "musa",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kirjastopalvelu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/musa,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/musa,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kirjastopalvelu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "musa",
   :skos/prefLabel "Musiikin asiasanasto: erikoissanasto"})

(def muso
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/muso,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MUSO - Ontologi för musik",
   :madsrdf/code "muso",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/muso,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "muso",
   :skos/prefLabel "MUSO - Ontologi för musik"})

(def muzeukc
  "Published by Muze Europe Ltd in London"
  {:db/ident :loc.subjectSchemes/muzeukc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MuzeMusic UK classical music classification",
   :madsrdf/code "muzeukc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Muze Europe Ltd in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/muzeukc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Muze Europe Ltd in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "muzeukc",
   :skos/prefLabel "MuzeMusic UK classical music classification"})

(def muzeukn
  "Published by Muze Europe Ltd in London"
  {:db/ident :loc.subjectSchemes/muzeukn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "MuzeMusic UK non-classical music classification",
   :madsrdf/code "muzeukn",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Muze Europe Ltd in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/muzeukn,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Muze Europe Ltd in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "muzeukn",
   :skos/prefLabel "MuzeMusic UK non-classical music classification"})

(def muzvukci
  "Published by Muze Europe Ltd in London"
  {:db/ident :loc.subjectSchemes/muzvukci,
   :madsrdf/authoritativeLabel "MuzeVideo UK contributor index",
   :madsrdf/code "muzvukci",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Muze Europe Ltd in London"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Muze Europe Ltd in London"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "muzvukci",
   :skos/prefLabel "MuzeVideo UK contributor index"})

(def naf
  "Published by Library of Congress in Washington, DC"
  {:db/ident :loc.subjectSchemes/naf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NACO authority file",
   :madsrdf/code "naf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Library of Congress in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/naf,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Library of Congress in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "naf",
   :skos/prefLabel "NACO authority file"})

(def nal
  "Published by National Agricultural Library in Beltsville, MD"
  {:db/ident :loc.subjectSchemes/nal,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "National Agricultural Library subject headings",
   :madsrdf/code "nal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by National Agricultural Library in Beltsville, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nal,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by National Agricultural Library in Beltsville, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nal",
   :skos/prefLabel "National Agricultural Library subject headings"})

(def nalnaf
  "Published by National Agricultural Library in Beltsville, MD"
  {:db/ident :loc.subjectSchemes/nalnaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Agricultural Library name authority file",
   :madsrdf/code "nalnaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by National Agricultural Library in Beltsville, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nalnaf,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by National Agricultural Library in Beltsville, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nalnaf",
   :skos/prefLabel "National Agricultural Library name authority file"})

(def nasat
  "Published by NASA, Scientific and Technical Information Office in Washington, DC"
  {:db/ident :loc.subjectSchemes/nasat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NASA thesaurus",
   :madsrdf/code "nasat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by NASA, Scientific and Technical Information Office in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nasat,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by NASA, Scientific and Technical Information Office in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nasat",
   :skos/prefLabel "NASA thesaurus"})

(def nbdbt
  "Published by NBD Biblio in Zoetermeer"
  {:db/ident :loc.subjectSchemes/nbdbt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NBD Biblion Trefwoordenthesaurus",
   :madsrdf/code "nbdbt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by NBD Biblio in Zoetermeer"},
   :madsrdf/editorialNote
   "https://www.nbdbiblion.nl/product/abonnement-trefwoordenthesaurus",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nbdbt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by NBD Biblio in Zoetermeer"},
   :skos/editorial
   "https://www.nbdbiblion.nl/product/abonnement-trefwoordenthesaurus",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nbdbt",
   :skos/prefLabel "NBD Biblion Trefwoordenthesaurus"})

(def nbiemnfag
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/nbiemnfag,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NBIs emneordsliste for faglitteratur",
   :madsrdf/code "nbiemnfag",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/editorialNote
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nbiemnfag,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/editorial
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nbiemnfag",
   :skos/prefLabel "NBIs emneordsliste for faglitteratur"})

(def ncjt
  "Published by U.S. Dept. of Justice, Institute of Justice, National Criminal Justice Reference Service in Rockville, MD"
  {:db/ident :loc.subjectSchemes/ncjt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "National criminal justice thesaurus",
   :madsrdf/code "ncjt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by U.S. Dept. of Justice, Institute of Justice, National Criminal Justice Reference Service in Rockville, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ncjt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by U.S. Dept. of Justice, Institute of Justice, National Criminal Justice Reference Service in Rockville, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ncjt",
   :skos/prefLabel "National criminal justice thesaurus"})

(def ndlsh
  "Published by Kokuritsu Kokkai Toshokan in Tokyo; [former code for this source was \"ndllsh\"; replaced April, 2011]"
  {:db/ident :loc.subjectSchemes/ndlsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Koktsu Kokkai Toshokan kenmei hyômokuhyô = National Diet Library list of subject headings",
   :madsrdf/code "ndlsh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Kokuritsu Kokkai Toshokan in Tokyo; [former code for this source was \"ndllsh\"; replaced April, 2011]"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ndlsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Kokuritsu Kokkai Toshokan in Tokyo; [former code for this source was \"ndllsh\"; replaced April, 2011]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ndlsh",
   :skos/prefLabel
   "Koktsu Kokkai Toshokan kenmei hyômokuhyô = National Diet Library list of subject headings"})

(def netc
  "National Emergency Training Center thesaurus (NETC)"
  {:db/ident :loc.subjectSchemes/netc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Emergency Training Center thesaurus (NETC)",
   :madsrdf/code "netc",
   :madsrdf/editorialNote "https://apps.usfa.fema.gov/thesaurus/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/netc,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://apps.usfa.fema.gov/thesaurus/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "netc",
   :skos/prefLabel "National Emergency Training Center thesaurus (NETC)"})

(def nicem
  "Published by National Information Center for Educational Media in Albuquerque, NM"
  {:db/ident :loc.subjectSchemes/nicem,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "NICEM subject headings and classification system",
   :madsrdf/code "nicem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Information Center for Educational Media in Albuquerque, NM"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nicem,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Information Center for Educational Media in Albuquerque, NM"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nicem",
   :skos/prefLabel "NICEM subject headings and classification system"})

(def nimacsc
  "Published by National Imagery and Mapping Agency in Bethesda, MD"
  {:db/ident :loc.subjectSchemes/nimacsc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NIMA cartographic subject categories",
   :madsrdf/code "nimacsc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Imagery and Mapping Agency in Bethesda, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nimacsc,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Imagery and Mapping Agency in Bethesda, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nimacsc",
   :skos/prefLabel "NIMA cartographic subject categories"})

(def niodt
  "Published by NIOD Instituut voor Oorlogs-, Holocaust and Genocidestudies = Institute for War, Holocaust and Genocide Studies in Amsterdam, Netherlands"
  {:db/ident :loc.subjectSchemes/niodt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "WO2-thesaurus",
   :madsrdf/code "niodt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by NIOD Instituut voor Oorlogs-, Holocaust and Genocidestudies = Institute for War, Holocaust and Genocide Studies in Amsterdam, Netherlands"},
   :madsrdf/editorialNote "https://data.niod.nl/WO2_Thesaurus.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/niodt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by NIOD Instituut voor Oorlogs-, Holocaust and Genocidestudies = Institute for War, Holocaust and Genocide Studies in Amsterdam, Netherlands"},
   :skos/editorial "https://data.niod.nl/WO2_Thesaurus.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "niodt",
   :skos/prefLabel "WO2-thesaurus"})

(def nlgaf
  "Published by Ethnikē vivliothēkē tēs Hellados in Athēna"
  {:db/ident :loc.subjectSchemes/nlgaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Archeio Kathierōmenōn Epikephalidōn",
   :madsrdf/code "nlgaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Ethnikē vivliothēkē tēs Hellados in Athēna"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nlgaf,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Ethnikē vivliothēkē tēs Hellados in Athēna"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nlgaf",
   :skos/prefLabel "Archeio Kathierōmenōn Epikephalidōn"})

(def nlgkk
  "Published by Ethnikē vivliothēkē tēs Hellados in Athēna"
  {:db/ident :loc.subjectSchemes/nlgkk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Katalogos kathierōmenōn onomatōn physikōn prosōpōn",
   :madsrdf/code "nlgkk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Ethnikē vivliothēkē tēs Hellados in Athēna"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nlgkk,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Ethnikē vivliothēkē tēs Hellados in Athēna"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nlgkk",
   :skos/prefLabel "Katalogos kathierōmenōn onomatōn physikōn prosōpōn"})

(def nlgsh
  "Published by Ethnikē vivliothēkē tēs Hellados in Athēna"
  {:db/ident :loc.subjectSchemes/nlgsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Katalogos Hellēnikōn thematikōn epikephalidōn",
   :madsrdf/code "nlgsh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Ethnikē vivliothēkē tēs Hellados in Athēna"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nlgsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Ethnikē vivliothēkē tēs Hellados in Athēna"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nlgsh",
   :skos/prefLabel "Katalogos Hellēnikōn thematikōn epikephalidōn"})

(def nli
  "National Library of Israel authority file"
  {:db/ident :loc.subjectSchemes/nli,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "National Library of Israel authority file",
   :madsrdf/code "nli",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nli,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nli",
   :skos/prefLabel "National Library of Israel authority file"})

(def nlksh
  "Published by National Library of Korea in Seoul"
  {:db/ident :loc.subjectSchemes/nlksh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "National Library of Korea subject headings",
   :madsrdf/code "nlksh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Korea in Seoul"},
   :madsrdf/editorialNote
   "https://lod.nl.go.kr/home/ir/irbooks.jsp?type=skos:Concept",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nlksh,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Korea in Seoul"},
   :skos/editorial "https://lod.nl.go.kr/home/ir/irbooks.jsp?type=skos:Concept",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nlksh",
   :skos/prefLabel "National Library of Korea subject headings"})

(def nlmnaf
  "Published by National Library of Medicine in Bethesda, Maryland"
  {:db/ident :loc.subjectSchemes/nlmnaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Library of Medicine name authority file",
   :madsrdf/code "nlmnaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Library of Medicine in Bethesda, Maryland"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nlmnaf,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Library of Medicine in Bethesda, Maryland"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nlmnaf",
   :skos/prefLabel "National Library of Medicine name authority file"})

(def nmaict
  "National Museum of the American Indian culture thesaurus"
  {:db/ident :loc.subjectSchemes/nmaict,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Museum of the American Indian culture thesaurus",
   :madsrdf/code "nmaict",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nmaict,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nmaict",
   :skos/prefLabel "National Museum of the American Indian culture thesaurus"})

(def no-ubo-mr
  "Published by Norwegian Center for Human Rights, University of Oslo"
  {:db/ident :loc.subjectSchemes/no-ubo-mr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Menneskerettighets-tesaurus",
   :madsrdf/code "no-ubo-mr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Norwegian Center for Human Rights, University of Oslo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/no-ubo-mr,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Norwegian Center for Human Rights, University of Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "no-ubo-mr",
   :skos/prefLabel "Menneskerettighets-tesaurus"})

(def noraf
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/noraf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Norwegian authority file",
   :madsrdf/code "noraf",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/noraf,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "noraf",
   :skos/prefLabel "Norwegian authority file"})

(def noram
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/noram,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Noram: emneord for Norsk-amerikansk samling",
   :madsrdf/code "noram",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/noram,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/noram,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "noram",
   :skos/prefLabel "Noram: emneord for Norsk-amerikansk samling"})

(def norbok
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/norbok,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Norbok: emneord i Norsk bokfortegnelse (Norbok)",
   :madsrdf/code "norbok",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/norbok,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "norbok",
   :skos/prefLabel "Norbok: emneord i Norsk bokfortegnelse (Norbok)"})

(def normesh
  "Published by Norwegian Institute of Public Health in Oslo"
  {:db/ident :loc.subjectSchemes/normesh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Norwegian MeSH",
   :madsrdf/code "normesh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Norwegian Institute of Public Health in Oslo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/normesh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Norwegian Institute of Public Health in Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "normesh",
   :skos/prefLabel "Norwegian MeSH"})

(def norvok
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/norvok,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nasjonalbibliotekets emne- og sjangervokabular",
   :madsrdf/code "norvok",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/editorialNote
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/norvok,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/editorial
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "norvok",
   :skos/prefLabel "Nasjonalbibliotekets emne- og sjangervokabular"})

(def noubojur
  "Published by Universitetsbiblioteket i Oslo in Norway"
  {:db/ident :loc.subjectSchemes/noubojur,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus of law",
   :madsrdf/code "noubojur",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Universitetsbiblioteket i Oslo in Norway"},
   :madsrdf/editorialNote "https://app.uio.no/ub/ujur/l-skjema/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/noubojur,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Universitetsbiblioteket i Oslo in Norway"},
   :skos/editorial "https://app.uio.no/ub/ujur/l-skjema/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "noubojur",
   :skos/prefLabel "Thesaurus of law"})

(def noubomn
  "Published by Universitetsbiblioteket i Oslo in Norway"
  {:db/ident :loc.subjectSchemes/noubomn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "University of Oslo Library thesaurus of science (Realfagstermer)",
   :madsrdf/code "noubomn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Universitetsbiblioteket i Oslo in Norway"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/noubomn,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Universitetsbiblioteket i Oslo in Norway"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "noubomn",
   :skos/prefLabel
   "University of Oslo Library thesaurus of science (Realfagstermer)"})

(def nsbncf
  "Published by Biblioteca Nazionale Centrale di Firenze in Firenze"
  {:db/ident :loc.subjectSchemes/nsbncf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nuovo soggettario",
   :madsrdf/code "nsbncf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Biblioteca Nazionale Centrale di Firenze in Firenze"},
   :madsrdf/editorialNote "https://thes.bncf.firenze.sbn.it/thes-dati_eng.htm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nsbncf,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Biblioteca Nazionale Centrale di Firenze in Firenze"},
   :skos/editorial "https://thes.bncf.firenze.sbn.it/thes-dati_eng.htm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nsbncf",
   :skos/prefLabel "Nuovo soggettario"})

(def nskps
  "Published by Nacionalne i sveučilišne knjičnice u Zagrebu in Zagreb"
  {:db/ident :loc.subjectSchemes/nskps,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Priručnik za izradu predmetnog kataloga u Nacionalnoj i sveučilišnoj knjičnici u Zagrebu (Manual for NSK subject headings)",
   :madsrdf/code "nskps",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Nacionalne i sveučilišne knjičnice u Zagrebu in Zagreb"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nskps,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Nacionalne i sveučilišne knjičnice u Zagrebu in Zagreb"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nskps",
   :skos/prefLabel
   "Priručnik za izradu predmetnog kataloga u Nacionalnoj i sveučilišnoj knjičnici u Zagrebu (Manual for NSK subject headings)"})

(def nta
  "Published by Koninklijke Bibliotheek in Den Haag"
  {:db/ident :loc.subjectSchemes/nta,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nederlandse Thesaurus van Auteursnamen",
   :madsrdf/code "nta",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Koninklijke Bibliotheek in Den Haag"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nta,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Koninklijke Bibliotheek in Den Haag"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nta",
   :skos/prefLabel "Nederlandse Thesaurus van Auteursnamen"})

(def ntc
  "Published by Koninklijke Bibliotheek in Den Haag"
  {:db/ident :loc.subjectSchemes/ntc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Nederlandse Thesaurus voor Corporaties = Dutch corporations authority file",
   :madsrdf/code "ntc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Koninklijke Bibliotheek in Den Haag"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ntc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Koninklijke Bibliotheek in Den Haag"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ntc",
   :skos/prefLabel
   "Nederlandse Thesaurus voor Corporaties = Dutch corporations authority file"})

(def ntcpsc
  "Published by National Translations Center, Cataloging Distribution Service, Library of Congress in Washington, DC"
  {:db/ident :loc.subjectSchemes/ntcpsc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Translations Center primary subject classification in National Translations Center primary subject classification and secondary descriptors",
   :madsrdf/code "ntcpsc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Translations Center, Cataloging Distribution Service, Library of Congress in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ntcpsc,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Translations Center, Cataloging Distribution Service, Library of Congress in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ntcpsc",
   :skos/prefLabel
   "National Translations Center primary subject classification in National Translations Center primary subject classification and secondary descriptors"})

(def ntcsd
  "Published by National Translations Center, Cataloging Distribution Service, Library of Congress in Washington, DC"
  {:db/ident :loc.subjectSchemes/ntcsd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Translations Center secondary descriptor in National Translation Center primary subject classification and secondary descriptor",
   :madsrdf/code "ntcsd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Translations Center, Cataloging Distribution Service, Library of Congress in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ntcsd,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Translations Center, Cataloging Distribution Service, Library of Congress in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ntcsd",
   :skos/prefLabel
   "National Translations Center secondary descriptor in National Translation Center primary subject classification and secondary descriptor"})

(def ntids
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/ntids,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Norske tidsskrifter 1700-1820: emneord",
   :madsrdf/code "ntids",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/ntids,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/ntids,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ntids",
   :skos/prefLabel "Norske tidsskrifter 1700-1820: emneord"})

(def ntissc
  "Published by National Technical Information Service in Springfield, VA"
  {:db/ident :loc.subjectSchemes/ntissc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NTIS subject categories",
   :madsrdf/code "ntissc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Technical Information Service in Springfield, VA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ntissc,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Technical Information Service in Springfield, VA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ntissc",
   :skos/prefLabel "NTIS subject categories"})

(def nzggn
  "Published by New Zealand Geographic Board Ngā Pou Taunaha o Aotearoa (NZGB)"
  {:db/ident :loc.subjectSchemes/nzggn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "New Zealand gazetteer of official geographic names",
   :madsrdf/code "nzggn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by New Zealand Geographic Board Ngā Pou Taunaha o Aotearoa (NZGB)"},
   :madsrdf/editorialNote
   "https://www.linz.govt.nz/regulatory/place-names/find-place-name/new-zealand-gazetteer-place-names",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nzggn,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by New Zealand Geographic Board Ngā Pou Taunaha o Aotearoa (NZGB)"},
   :skos/editorial
   "https://www.linz.govt.nz/regulatory/place-names/find-place-name/new-zealand-gazetteer-place-names",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nzggn",
   :skos/prefLabel "New Zealand gazetteer of official geographic names"})

(def nznb
  "Published by National Library of New Zealand in Wellington"
  {:db/ident :loc.subjectSchemes/nznb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "New Zealand national bibliography",
   :madsrdf/code "nznb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by National Library of New Zealand in Wellington"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/nznb,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by National Library of New Zealand in Wellington"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "nznb",
   :skos/prefLabel "New Zealand national bibliography"})

(def odlt
  "Published by Oxford University Press in Oxford; New York"
  {:db/ident :loc.subjectSchemes/odlt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Baldick, C. The Oxford dictionary of literary terms",
   :madsrdf/code "odlt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Oxford University Press in Oxford; New York"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/odlt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Oxford University Press in Oxford; New York"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "odlt",
   :skos/prefLabel "Baldick, C. The Oxford dictionary of literary terms"})

(def ogst
  "Published by Oregon State Library and Oregon Information Resource Management Division (IRMD) in Oregon"
  {:db/ident :loc.subjectSchemes/ogst,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Oregon GILS subject tree",
   :madsrdf/code "ogst",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Oregon State Library and Oregon Information Resource Management Division (IRMD) in Oregon"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ogst,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Oregon State Library and Oregon Information Resource Management Division (IRMD) in Oregon"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ogst",
   :skos/prefLabel "Oregon GILS subject tree"})

(def opms
  "Published by Opetusministeriön in Helsinki"
  {:db/ident :loc.subjectSchemes/opms,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Opetusministeriön asiasanasto",
   :madsrdf/code "opms",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Opetusministeriön in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/opms,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Opetusministeriön in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "opms",
   :skos/prefLabel "Opetusministeriön asiasanasto"})

(def ordnok
  "Published by Directorate for Cultural Heritage in Norway"
  {:db/ident :loc.subjectSchemes/ordnok,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Ordnokkelen: tesaurus for kulturminnevern",
   :madsrdf/code "ordnok",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Directorate for Cultural Heritage in Norway"},
   :madsrdf/editorialNote "https://ordnokkelen.ra.no/multites/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ordnok,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Directorate for Cultural Heritage in Norway"},
   :skos/editorial "https://ordnokkelen.ra.no/multites/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ordnok",
   :skos/prefLabel "Ordnokkelen: tesaurus for kulturminnevern"})

(def pascal
  "Published by Centre national de la recherche scientifique in Vandoeuvre"
  {:db/ident :loc.subjectSchemes/pascal,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Base de donneés PASCAL: plan de classement = PASCAL database classification scheme",
   :madsrdf/code "pascal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Centre national de la recherche scientifique in Vandoeuvre"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pascal,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Centre national de la recherche scientifique in Vandoeuvre"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pascal",
   :skos/prefLabel
   "Base de donneés PASCAL: plan de classement = PASCAL database classification scheme"})

(def peakbag
  "Peakbagger.com"
  {:db/ident :loc.subjectSchemes/peakbag,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Peakbagger.com",
   :madsrdf/code "peakbag",
   :madsrdf/editorialNote "https://www.peakbagger.com/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/peakbag,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.peakbagger.com/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "peakbag",
   :skos/prefLabel "Peakbagger.com"})

(def pepp
  "Published by Princeton University Press in Princeton"
  {:db/ident :loc.subjectSchemes/pepp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Princeton encyclopedia of poetry and poetics",
   :madsrdf/code "pepp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Princeton University Press in Princeton"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pepp,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Princeton University Press in Princeton"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pepp",
   :skos/prefLabel "Princeton encyclopedia of poetry and poetics"})

(def peri
  "Published by Kirjastopalvelu in Helsinki"
  {:db/ident :loc.subjectSchemes/peri,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Perinnetieteiden asiasanasto",
   :madsrdf/code "peri",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kirjastopalvelu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/peri,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kirjastopalvelu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "peri",
   :skos/prefLabel "Perinnetieteiden asiasanasto"})

(def periodo
  "PeriodO: a gazetteer of period definitions for linking and visualizing data"
  {:db/ident :loc.subjectSchemes/periodo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "PeriodO: a gazetteer of period definitions for linking and visualizing data",
   :madsrdf/code "periodo",
   :madsrdf/editorialNote "https://perio.do",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/periodo,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://perio.do",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "periodo",
   :skos/prefLabel
   "PeriodO: a gazetteer of period definitions for linking and visualizing data"})

(def pha
  "Published by Kirjastopalvelu in Helsinki"
  {:db/ident :loc.subjectSchemes/pha,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Puolostushallinnon asiasanasto",
   :madsrdf/code "pha",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kirjastopalvelu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/pha,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/pha,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kirjastopalvelu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pha",
   :skos/prefLabel "Puolostushallinnon asiasanasto"})

(def pkk
  "Published by Maribor in Ljubljana"
  {:db/ident :loc.subjectSchemes/pkk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Predmetnik za katoliške knjižnice",
   :madsrdf/code "pkk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Maribor in Ljubljana"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pkk,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Maribor in Ljubljana"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pkk",
   :skos/prefLabel "Predmetnik za katoliške knjižnice"})

(def pldi
  "Published by Fiontar & Scoil na Gaeilge in Dublin, Ireland"
  {:db/ident :loc.subjectSchemes/pldi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Placenames database of Ireland",
   :madsrdf/code "pldi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Fiontar & Scoil na Gaeilge in Dublin, Ireland"},
   :madsrdf/editorialNote "https://www.logainm.ie/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pldi,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Fiontar & Scoil na Gaeilge in Dublin, Ireland"},
   :skos/editorial "https://www.logainm.ie/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pldi",
   :skos/prefLabel "Placenames database of Ireland"})

(def pleiades
  "Pleiades: a gazetteer of past places"
  {:db/ident :loc.subjectSchemes/pleiades,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Pleiades: a gazetteer of past places",
   :madsrdf/code "pleiades",
   :madsrdf/editorialNote "https://pleiades.stoa.org/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pleiades,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://pleiades.stoa.org/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pleiades",
   :skos/prefLabel "Pleiades: a gazetteer of past places"})

(def pmbok
  "Published by Project Management Institute in Newtown Square"
  {:db/ident :loc.subjectSchemes/pmbok,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Guide to the project management body of knowledge (PMBOK guide)",
   :madsrdf/code "pmbok",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Project Management Institute in Newtown Square"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pmbok,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Project Management Institute in Newtown Square"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pmbok",
   :skos/prefLabel
   "Guide to the project management body of knowledge (PMBOK guide)"})

(def pmcsg
  "Published by Project Management Institute in Newtown Square"
  {:db/ident :loc.subjectSchemes/pmcsg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Combined standards glossary",
   :madsrdf/code "pmcsg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Project Management Institute in Newtown Square"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pmcsg,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Project Management Institute in Newtown Square"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pmcsg",
   :skos/prefLabel "Combined standards glossary"})

(def pmont
  "Powerhouse Museum object name thesaurus"
  {:db/ident :loc.subjectSchemes/pmont,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Powerhouse Museum object name thesaurus",
   :madsrdf/code "pmont",
   :madsrdf/editorialNote
   "https://www.maas.museum/research/object-name-thesaurus/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pmont,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.maas.museum/research/object-name-thesaurus/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pmont",
   :skos/prefLabel "Powerhouse Museum object name thesaurus"})

(def pmt
  "Published by Project Management Institute in Newtown Square"
  {:db/ident :loc.subjectSchemes/pmt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Project management terminology",
   :madsrdf/code "pmt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Project Management Institute in Newtown Square"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pmt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Project Management Institute in Newtown Square"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pmt",
   :skos/prefLabel "Project management terminology"})

(def poliscit
  "Published by University Center for International Studies, University of Pittsburgh in Pittsburgh"
  {:db/ident :loc.subjectSchemes/poliscit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Political science thesaurus II",
   :madsrdf/code "poliscit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by University Center for International Studies, University of Pittsburgh in Pittsburgh"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/poliscit,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by University Center for International Studies, University of Pittsburgh in Pittsburgh"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "poliscit",
   :skos/prefLabel "Political science thesaurus II"})

(def popinte
  "Published by Population Information Network in Paris"
  {:db/ident :loc.subjectSchemes/popinte,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "POPIN thesaurus: population multilingual thesaurus",
   :madsrdf/code "popinte",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Population Information Network in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/popinte,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Population Information Network in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "popinte",
   :skos/prefLabel "POPIN thesaurus: population multilingual thesaurus"})

(def pplt
  "Published by the Peace Palace in Den Haag"
  {:db/ident :loc.subjectSchemes/pplt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Peace Palace thesaurus",
   :madsrdf/code "pplt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by the Peace Palace in Den Haag"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/pplt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by the Peace Palace in Den Haag"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "pplt",
   :skos/prefLabel "Peace Palace thesaurus"})

(def ppluk
  "Published by Patagos in [Poitiers, France]"
  {:db/ident :loc.subjectSchemes/ppluk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Peoplefrom.co.uk - Demonyms of the United Kingdom",
   :madsrdf/code "ppluk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Patagos in [Poitiers, France]"},
   :madsrdf/editorialNote "http://www.peoplefrom.co.uk/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ppluk,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Patagos in [Poitiers, France]"},
   :skos/editorial "http://www.peoplefrom.co.uk/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ppluk",
   :skos/prefLabel "Peoplefrom.co.uk - Demonyms of the United Kingdom"})

(def precis
  "Published by British Library in London"
  {:db/ident :loc.subjectSchemes/precis,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "PRECIS: a manual of concept analysis and subject indexing",
   :madsrdf/code "precis",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by British Library in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/precis,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by British Library in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "precis",
   :skos/prefLabel "PRECIS: a manual of concept analysis and subject indexing"})

(def prnpdi
  "Published by Le Robert in Paris"
  {:db/ident :loc.subjectSchemes/prnpdi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Le petit Robert des noms propres: dictionnaire illustré",
   :madsrdf/code "prnpdi",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Le Robert in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/prnpdi,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Le Robert in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "prnpdi",
   :skos/prefLabel "Le petit Robert des noms propres: dictionnaire illustré"})

(def proqsc
  "ProQuest subject categories"
  {:db/ident :loc.subjectSchemes/proqsc,
   :madsrdf/authoritativeLabel "ProQuest subject categories",
   :madsrdf/code "proqsc",
   :madsrdf/editorialNote
   "https://about.proquest.com/globalassets/proquest/files/pdf-files/subject-categories-academic.pdf",
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/editorial
   "https://about.proquest.com/globalassets/proquest/files/pdf-files/subject-categories-academic.pdf",
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "proqsc",
   :skos/prefLabel "ProQuest subject categories"})

(def prvt
  "Published by Patent- och Registreringsverket in Stockholm"
  {:db/ident :loc.subjectSchemes/prvt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Patent- och registreringsverkets tesaurus",
   :madsrdf/code "prvt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Patent- och Registreringsverket in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/prvt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Patent- och Registreringsverket in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "prvt",
   :skos/prefLabel "Patent- och registreringsverkets tesaurus"})

(def psychit
  "Published by American Psychological Association in Washington"
  {:db/ident :loc.subjectSchemes/psychit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus of psychological index terms",
   :madsrdf/code "psychit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by American Psychological Association in Washington"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/psychit,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by American Psychological Association in Washington"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "psychit",
   :skos/prefLabel "Thesaurus of psychological index terms"})

(def puho
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/puho,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "PUHO - Puolustushallinnon ontologia",
   :madsrdf/code "puho",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/puho,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/puho,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "puho",
   :skos/prefLabel "PUHO - Puolustushallinnon ontologia"})

(def qlit
  "Published by Göteborgs universitetsbibliotek, KvinnSam in Göteborg"
  {:db/ident :loc.subjectSchemes/qlit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-06-01T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-06-01T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Queer literature indexing thesaurus",
   :madsrdf/code "qlit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Göteborgs universitetsbibliotek, KvinnSam in Göteborg"},
   :madsrdf/editorialNote "https://queerlit.dh.gu.se/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-06-01T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-06-01T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/qlit,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Göteborgs universitetsbibliotek, KvinnSam in Göteborg"},
   :skos/editorial "https://queerlit.dh.gu.se/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "qlit",
   :skos/prefLabel "Queer literature indexing thesaurus"})

(def qlsp
  "Published by Queens Library in Queens, New York"
  {:db/ident :loc.subjectSchemes/qlsp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Queens Library Spanish language subject headings",
   :madsrdf/code "qlsp",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Queens Library in Queens, New York"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/qlsp,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Queens Library in Queens, New York"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "qlsp",
   :skos/prefLabel "Queens Library Spanish language subject headings"})

(def qnlsh
  "Published by Qatar National Library"
  {:db/ident :loc.subjectSchemes/qnlsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Qatar National Library subject headings",
   :madsrdf/code "qnlsh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Qatar National Library"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/qnlsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Qatar National Library"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "qnlsh",
   :skos/prefLabel "Qatar National Library subject headings"})

(def qrma
  "Published by Dhat al-Salasil in al-Kuwayt"
  {:db/ident :loc.subjectSchemes/qrma,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Qâ'imat ru'ûs al-mawdûât al-'Arabîyah = List of Arabic subject headings",
   :madsrdf/code "qrma",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Dhat al-Salasil in al-Kuwayt"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/qrma,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Dhat al-Salasil in al-Kuwayt"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "qrma",
   :skos/prefLabel
   "Qâ'imat ru'ûs al-mawdûât al-'Arabîyah = List of Arabic subject headings"})

(def qrmak
  "Published by Dâr Shurûq in al-Qâhirah"
  {:db/ident :loc.subjectSchemes/qrmak,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Qâ'imat ru'ûs al-mawdû'ât al-'Arabîyah al-qiyâsîyah al-maktabât wa-marâkaz al-ma'lûmât wa-qawâid al-bayânât",
   :madsrdf/code "qrmak",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Dâr Shurûq in al-Qâhirah"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/qrmak,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Dâr Shurûq in al-Qâhirah"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "qrmak",
   :skos/prefLabel
   "Qâ'imat ru'ûs al-mawdû'ât al-'Arabîyah al-qiyâsîyah al-maktabât wa-marâkaz al-ma'lûmât wa-qawâid al-bayânât"})

(def qtglit
  "Published by Homodok in Amsterdam"
  {:db/ident :loc.subjectSchemes/qtglit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Queer thesaurus: an international thesaurus of gay and lesbian index terms",
   :madsrdf/code "qtglit",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Homodok in Amsterdam"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/qtglit,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Homodok in Amsterdam"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "qtglit",
   :skos/prefLabel
   "Queer thesaurus: an international thesaurus of gay and lesbian index terms"})

(def quiding
  "Published by Norstedt in Stockholm"
  {:db/ident :loc.subjectSchemes/quiding,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Quiding, Nils Herman. Svenskt allmänt författningsregister för tiden från år 1522 till och med år 1862",
   :madsrdf/code "quiding",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Norstedt in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/quiding,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Norstedt in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "quiding",
   :skos/prefLabel
   "Quiding, Nils Herman. Svenskt allmänt författningsregister för tiden från år 1522 till och med år 1862"})

(def ram
  "Published by Bibliothèque nationale in Paris"
  {:db/ident :loc.subjectSchemes/ram,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "RAMEAU: répertoire d'autorité-matière encyclopédique et alphabétique unifié",
   :madsrdf/code "ram",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Bibliothèque nationale in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ram,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Bibliothèque nationale in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ram",
   :skos/prefLabel
   "RAMEAU: répertoire d'autorité-matière encyclopédique et alphabétique unifié"})

(def rasuqam
  "Published by Université du Québec Montréal, Services techniques des bibliothèques in Montréal"
  {:db/ident :loc.subjectSchemes/rasuqam,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Répertoire d'autorités-sujet de l'UQAM",
   :madsrdf/code "rasuqam",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Université du Québec Montréal, Services techniques des bibliothèques in Montréal"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rasuqam,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Université du Québec Montréal, Services techniques des bibliothèques in Montréal"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rasuqam",
   :skos/prefLabel "Répertoire d'autorités-sujet de l'UQAM"})

(def renib
  "Published by Biblioteca Nacional in Santiago de Chile"
  {:db/ident :loc.subjectSchemes/renib,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Renib [base de datos de autoridad]",
   :madsrdf/code "renib",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Biblioteca Nacional in Santiago de Chile"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/renib,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Biblioteca Nacional in Santiago de Chile"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "renib",
   :skos/prefLabel "Renib [base de datos de autoridad]"})

(def reo
  "Māori subject headings thesaurus - Ngā Ūpoko Tukutuku"
  {:db/ident :loc.subjectSchemes/reo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Māori subject headings thesaurus - Ngā Ūpoko Tukutuku",
   :madsrdf/code "reo",
   :madsrdf/editorialNote
   "https://natlib.govt.nz/librarians/nga-upoko-tukutuku",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/reo,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://natlib.govt.nz/librarians/nga-upoko-tukutuku",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "reo",
   :skos/prefLabel "Māori subject headings thesaurus - Ngā Ūpoko Tukutuku"})

(def rero
  "Published by Réseau des bibliothèques de Suisse occidentale in Martigny"
  {:db/ident :loc.subjectSchemes/rero,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Indexation matiéres RERO",
   :madsrdf/code "rero",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Réseau des bibliothèques de Suisse occidentale in Martigny"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rero,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Réseau des bibliothèques de Suisse occidentale in Martigny"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rero",
   :skos/prefLabel "Indexation matiéres RERO"})

(def rerovoc
  "Published by Réseau des bibliothèques de Suisse occidentale in Martigny"
  {:db/ident :loc.subjectSchemes/rerovoc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Indexation matiéres RERO autorités",
   :madsrdf/code "rerovoc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Réseau des bibliothèques de Suisse occidentale in Martigny"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rerovoc,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Réseau des bibliothèques de Suisse occidentale in Martigny"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rerovoc",
   :skos/prefLabel "Indexation matiéres RERO autorités"})

(def rma
  "Published by al-Riyad: 'Imadat Shu'un al-Maktabah Jam. al-Riyad in al-Riyad"
  {:db/ident :loc.subjectSchemes/rma,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Ru'us al-mawdu'at al-'Arabiyah",
   :madsrdf/code "rma",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by al-Riyad: 'Imadat Shu'un al-Maktabah Jam. al-Riyad in al-Riyad"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rma,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by al-Riyad: 'Imadat Shu'un al-Maktabah Jam. al-Riyad in al-Riyad"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rma",
   :skos/prefLabel "Ru'us al-mawdu'at al-'Arabiyah"})

(def root
  "Published by British Standards Institution in London"
  {:db/ident :loc.subjectSchemes/root,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "BSI ROOT thesaurus",
   :madsrdf/code "root",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by British Standards Institution in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/root,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by British Standards Institution in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "root",
   :skos/prefLabel "BSI ROOT thesaurus"})

(def rpe
  "Published by Institut nauchnoi informatsii po obshchestvennym naukam in Moskva"
  {:db/ident :loc.subjectSchemes/rpe,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Rubrikator po ekonomike = Rubricator on economics",
   :madsrdf/code "rpe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Institut nauchnoi informatsii po obshchestvennym naukam in Moskva"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rpe,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Institut nauchnoi informatsii po obshchestvennym naukam in Moskva"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rpe",
   :skos/prefLabel "Rubrikator po ekonomike = Rubricator on economics"})

(def rswk
  "Published by Deutsches Bibliotheksinstitut in Berlin"
  {:db/ident :loc.subjectSchemes/rswk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Regeln für den Schlagwortkatalog",
   :madsrdf/code "rswk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Deutsches Bibliotheksinstitut in Berlin"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rswk,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Deutsches Bibliotheksinstitut in Berlin"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rswk",
   :skos/prefLabel "Regeln für den Schlagwortkatalog"})

(def rswkaf
  "Alternativform zum Hauptschlagwort"
  {:db/ident :loc.subjectSchemes/rswkaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Alternativform zum Hauptschlagwort",
   :madsrdf/code "rswkaf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rswkaf,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rswkaf",
   :skos/prefLabel "Alternativform zum Hauptschlagwort"})

(def rugeo
  "Published by Rossiiska íà gosudarstvennaíà biblioteka in Moskva"
  {:db/ident :loc.subjectSchemes/rugeo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Natsional'nyi normativnyi fail geograficheskikh nazvanii Rossiiskoi Federatsii",
   :madsrdf/code "rugeo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Rossiiska íà gosudarstvennaíà biblioteka in Moskva"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rugeo,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Rossiiska íà gosudarstvennaíà biblioteka in Moskva"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rugeo",
   :skos/prefLabel
   "Natsional'nyi normativnyi fail geograficheskikh nazvanii Rossiiskoi Federatsii"})

(def rurkp
  "Published by Rossiiskaíà knizhnaíà palata in Moskva"
  {:db/ident :loc.subjectSchemes/rurkp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Predmetnye rubriki Rossiiskoi knizhnoi palaty",
   :madsrdf/code "rurkp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Rossiiskaíà knizhnaíà palata in Moskva"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rurkp,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Rossiiskaíà knizhnaíà palata in Moskva"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rurkp",
   :skos/prefLabel "Predmetnye rubriki Rossiiskoi knizhnoi palaty"})

(def rvm
  "Published by Bibliothèque de l'Université Laval in Québec, Québec"
  {:db/ident :loc.subjectSchemes/rvm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Répertoire de vedettes-matière",
   :madsrdf/code "rvm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque de l'Université Laval in Québec, Québec"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rvm,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque de l'Université Laval in Québec, Québec"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rvm",
   :skos/prefLabel "Répertoire de vedettes-matière"})

(def rvmfast
  "Published by Bibliothèque de l'Université Laval in Québec, Québec"
  {:db/ident :loc.subjectSchemes/rvmfast,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Répertoire de vedettes-matière: vocabulaire à facettes normalisé",
   :madsrdf/code "rvmfast",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque de l'Université Laval in Québec, Québec"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rvmfast,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque de l'Université Laval in Québec, Québec"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rvmfast",
   :skos/prefLabel
   "Répertoire de vedettes-matière: vocabulaire à facettes normalisé"})

(def rvmgd
  "Published by Bibliothèque de l'Université Laval in Québec, Québec"
  {:db/ident :loc.subjectSchemes/rvmgd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thésaurus des descripteurs de groupes démographiques de l'Université Laval",
   :madsrdf/code "rvmgd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque de l'Université Laval in Québec, Québec"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/rvmgd,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque de l'Université Laval in Québec, Québec"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "rvmgd",
   :skos/prefLabel
   "Thésaurus des descripteurs de groupes démographiques de l'Université Laval"})

(def samisk
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/samisk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Sámi bibliografia (Norga) = Samisk bibliografi (Norge) = Sami bibliography (Norway)",
   :madsrdf/code "samisk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/editorialNote
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/samisk,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/editorial
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "samisk",
   :skos/prefLabel
   "Sámi bibliografia (Norga) = Samisk bibliografi (Norge) = Sami bibliography (Norway)"})

(def sanb
  "South African national bibliography authority file"
  {:db/ident :loc.subjectSchemes/sanb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "South African national bibliography authority file",
   :madsrdf/code "sanb",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sanb,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sanb",
   :skos/prefLabel "South African national bibliography authority file"})

(def sao
  "Published by Kungliga Biblioteket, LIBRIS-avdelningen in Stockholm"
  {:db/ident :loc.subjectSchemes/sao,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Svenska ämnesord",
   :madsrdf/code "sao",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Kungliga Biblioteket, LIBRIS-avdelningen in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sao,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Kungliga Biblioteket, LIBRIS-avdelningen in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sao",
   :skos/prefLabel "Svenska ämnesord"})

(def sbiao
  "Published by Svenska barnboksinstitutet in Stockholm"
  {:db/ident :loc.subjectSchemes/sbiao,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Svenska barnboksinstitutets ämnesordslista",
   :madsrdf/code "sbiao",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Svenska barnboksinstitutet in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sbiao,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Svenska barnboksinstitutet in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sbiao",
   :skos/prefLabel "Svenska barnboksinstitutets ämnesordslista"})

(def sbt
  "Published by Sistema Bibliotecario Ticinese in Cantone Ticino, Svizzera"
  {:db/ident :loc.subjectSchemes/sbt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Soggettario sistema Bibliotecario Ticinese",
   :madsrdf/code "sbt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Sistema Bibliotecario Ticinese in Cantone Ticino, Svizzera"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sbt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Sistema Bibliotecario Ticinese in Cantone Ticino, Svizzera"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sbt",
   :skos/prefLabel "Soggettario sistema Bibliotecario Ticinese"})

(def scbi
  "Published by Biblioteca Nazionale Centrale di Firenze in Firenze"
  {:db/ident :loc.subjectSchemes/scbi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Soggettario per i cataloghi delle biblioteche italiane",
   :madsrdf/code "scbi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Biblioteca Nazionale Centrale di Firenze in Firenze"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/scbi,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Biblioteca Nazionale Centrale di Firenze in Firenze"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "scbi",
   :skos/prefLabel "Soggettario per i cataloghi delle biblioteche italiane"})

(def scgdst
  "Published by Defense Technical Information Center, Defense Logistics Agency in Fort Belvoir, VA"
  {:db/ident :loc.subjectSchemes/scgdst,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Subject categorization guide for defense science and technology",
   :madsrdf/code "scgdst",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Defense Technical Information Center, Defense Logistics Agency in Fort Belvoir, VA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/scgdst,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Defense Technical Information Center, Defense Logistics Agency in Fort Belvoir, VA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "scgdst",
   :skos/prefLabel
   "Subject categorization guide for defense science and technology"})

(def scisshl
  "Published by Curriculum Corp. in Carlton South, Vic."
  {:db/ident :loc.subjectSchemes/scisshl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "SCIS subject headings",
   :madsrdf/code "scisshl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Curriculum Corp. in Carlton South, Vic."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/scisshl,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Curriculum Corp. in Carlton South, Vic."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "scisshl",
   :skos/prefLabel "SCIS subject headings"})

(def scot
  "Published by Education Services Australia Ltd. In Melbourne, Vic."
  {:db/ident :loc.subjectSchemes/scot,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Schools online thesaurus (ScOT)",
   :madsrdf/code "scot",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Education Services Australia Ltd. In Melbourne, Vic."},
   :madsrdf/editorialNote "http://scot.curriculum.edu.au/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/scot,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Education Services Australia Ltd. In Melbourne, Vic."},
   :skos/editorial "http://scot.curriculum.edu.au/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "scot",
   :skos/prefLabel "Schools online thesaurus (ScOT)"})

(def sears
  "Published by H.W. Wilson in New York"
  {:db/ident :loc.subjectSchemes/sears,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Sears list of subject headings",
   :madsrdf/code "sears",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by H.W. Wilson in New York"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sears,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by H.W. Wilson in New York"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sears",
   :skos/prefLabel "Sears list of subject headings"})

(def sfit
  "Published by Svenska filminstitutet in Stockholm"
  {:db/ident :loc.subjectSchemes/sfit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Svenska filminstitutets tesaurus",
   :madsrdf/code "sfit",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Svenska filminstitutet in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sfit,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Svenska filminstitutet in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sfit",
   :skos/prefLabel "Svenska filminstitutets tesaurus"})

(def sgc
  "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"
  {:db/ident :loc.subjectSchemes/sgc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Splolšni geslovnik COBISS.SI = COBISS.SI general list of subject headings (Slovenian subject headings)+E316",
   :madsrdf/code "sgc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sgc,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sgc",
   :skos/prefLabel
   "Splolšni geslovnik COBISS.SI = COBISS.SI general list of subject headings (Slovenian subject headings)+E316"})

(def sgce
  "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"
  {:db/ident :loc.subjectSchemes/sgce,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Splošni geslovnik COBISS.SI = COBISS.SI general list of subject headings (English subject headings)",
   :madsrdf/code "sgce",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sgce,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sgce",
   :skos/prefLabel
   "Splošni geslovnik COBISS.SI = COBISS.SI general list of subject headings (English subject headings)"})

(def shbe
  "Published by Handelshögskolan i Stockholm in Stockholm"
  {:db/ident :loc.subjectSchemes/shbe,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Subject headings in business and economics",
   :madsrdf/code "shbe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Handelshögskolan i Stockholm in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/shbe,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Handelshögskolan i Stockholm in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "shbe",
   :skos/prefLabel "Subject headings in business and economics"})

(def she
  "Published by Engineering Index, Inc. in New York"
  {:db/ident :loc.subjectSchemes/she,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "SHE: subject headings for engineering",
   :madsrdf/code "she",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Engineering Index, Inc. in New York"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/she,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Engineering Index, Inc. in New York"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "she",
   :skos/prefLabel "SHE: subject headings for engineering"})

(def shsples
  "Published by Libraries Unlimited in Santa Barbara, Calif."
  {:db/ident :loc.subjectSchemes/shsples,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Subject headings for school and public libraries = Encabezamientos de materia para bibliotecas escolares y públicas",
   :madsrdf/code "shsples",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Libraries Unlimited in Santa Barbara, Calif."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/shsples,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Libraries Unlimited in Santa Barbara, Calif."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "shsples",
   :skos/prefLabel
   "Subject headings for school and public libraries = Encabezamientos de materia para bibliotecas escolares y públicas"})

(def sigle
  "Published by European Association for Grey Literature Exploitation in Dan Haag"
  {:db/ident :loc.subjectSchemes/sigle,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "SIGLE [System for information on grey literature in Europe] manual, Part 2, Subject category list",
   :madsrdf/code "sigle",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by European Association for Grey Literature Exploitation in Dan Haag"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sigle,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by European Association for Grey Literature Exploitation in Dan Haag"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sigle",
   :skos/prefLabel
   "SIGLE [System for information on grey literature in Europe] manual, Part 2, Subject category list"})

(def sipri
  "Published by Stockholm International Peace Research Institute in Stockholm"
  {:db/ident :loc.subjectSchemes/sipri,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "SIPRI library thesaurus",
   :madsrdf/code "sipri",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Stockholm International Peace Research Institute in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sipri,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Stockholm International Peace Research Institute in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sipri",
   :skos/prefLabel "SIPRI library thesaurus"})

(def sk
  "Published by Zhong guo gu ji shan ban shu zong mu bian ji ling dao xiao zu ban gong shi in Beijing"
  {:db/ident :loc.subjectSchemes/sk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Zhong guo gu ji shan ban shu zong mu fen lei biao [Si ku]",
   :madsrdf/code "sk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Zhong guo gu ji shan ban shu zong mu bian ji ling dao xiao zu ban gong shi in Beijing"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sk,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Zhong guo gu ji shan ban shu zong mu bian ji ling dao xiao zu ban gong shi in Beijing"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sk",
   :skos/prefLabel "Zhong guo gu ji shan ban shu zong mu fen lei biao [Si ku]"})

(def skbb
  "Published by Shanghai gu ji chu ban she in Shanghai and by Zhonghua shu ju in Beijing"
  {:db/ident :loc.subjectSchemes/skbb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Zhongguo gu ji zong mu",
   :madsrdf/code "skbb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Shanghai gu ji chu ban she in Shanghai and by Zhonghua shu ju in Beijing"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/skbb,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Shanghai gu ji chu ban she in Shanghai and by Zhonghua shu ju in Beijing"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "skbb",
   :skos/prefLabel "Zhongguo gu ji zong mu"})

(def skon
  "Published by Svensk biblioteksförening in Stockholm"
  {:db/ident :loc.subjectSchemes/skon,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Att indexera skönlitteratur: Ämnesordslista, vuxenlitteratur",
   :madsrdf/code "skon",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Svensk biblioteksförening in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/skon,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Svensk biblioteksförening in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "skon",
   :skos/prefLabel
   "Att indexera skönlitteratur: Ämnesordslista, vuxenlitteratur"})

(def slem
  "Published by H. W. Wilson in New York"
  {:db/ident :loc.subjectSchemes/slem,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Sears: lista de encabezamientos de materia",
   :madsrdf/code "slem",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by H. W. Wilson in New York"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/slem,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by H. W. Wilson in New York"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "slem",
   :skos/prefLabel "Sears: lista de encabezamientos de materia"})

(def smda
  "Published by Smithsonian Air & Space Museum in Washington, DC"
  {:db/ident :loc.subjectSchemes/smda,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Smithsonian National Air and Space Museum directory of airplanes",
   :madsrdf/code "smda",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Smithsonian Air & Space Museum in Washington, DC"},
   :madsrdf/editorialNote
   "https://siris-thesauri.si.edu/ipac20/ipac.jsp?profile=planes",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/smda,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Smithsonian Air & Space Museum in Washington, DC"},
   :skos/editorial
   "https://siris-thesauri.si.edu/ipac20/ipac.jsp?profile=planes",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "smda",
   :skos/prefLabel
   "Smithsonian National Air and Space Museum directory of airplanes"})

(def snt
  "Published by G.K. Hall in Boston"
  {:db/ident :loc.subjectSchemes/snt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Sexual nomenclature: a thesaurus",
   :madsrdf/code "snt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by G.K. Hall in Boston"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/snt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by G.K. Hall in Boston"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "snt",
   :skos/prefLabel "Sexual nomenclature: a thesaurus"})

(def socio
  "Published by CSA in Bethesda, Maryland"
  {:db/ident :loc.subjectSchemes/socio,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Sociological abstracts thesaurus",
   :madsrdf/code "socio",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by CSA in Bethesda, Maryland"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/socio,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by CSA in Bethesda, Maryland"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "socio",
   :skos/prefLabel "Sociological abstracts thesaurus"})

(def solstad
  "Published by National Library of Norway in Oslo"
  {:db/ident :loc.subjectSchemes/solstad,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Solstad: emneord for Solstadbibliografien",
   :madsrdf/code "solstad",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Library of Norway in Oslo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/solstad,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/solstad,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Norway in Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "solstad",
   :skos/prefLabel "Solstad: emneord for Solstadbibliografien"})

(def sosa
  "Published by BTJ Kirjastopalvelu in Helsinki"
  {:db/ident :loc.subjectSchemes/sosa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Sociaalialan asiasanasto",
   :madsrdf/code "sosa",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by BTJ Kirjastopalvelu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sosa,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by BTJ Kirjastopalvelu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sosa",
   :skos/prefLabel "Sociaalialan asiasanasto"})

(def soto
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/soto,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "SOTO - Sotatieteen ontologia",
   :madsrdf/code "soto",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/soto,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "soto",
   :skos/prefLabel "SOTO - Sotatieteen ontologia"})

(def spines
  "Published by UNESCO, ICYT in Madrid"
  {:db/ident :loc.subjectSchemes/spines,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Tesauro SPINES: un vocabulario controlado y estructurado para el tratamiento de información sobre ciencia y tecnología para el desarrollo",
   :madsrdf/code "spines",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by UNESCO, ICYT in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/spines,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by UNESCO, ICYT in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "spines",
   :skos/prefLabel
   "Tesauro SPINES: un vocabulario controlado y estructurado para el tratamiento de información sobre ciencia y tecnología para el desarrollo"})

(def ssg
  "Splošni slovenski geslovnik"
  {:db/ident :loc.subjectSchemes/ssg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Splošni slovenski geslovnik",
   :madsrdf/code "ssg",
   :madsrdf/editorialNote "https://sssg.nuk.uni-lj.si/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ssg,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://sssg.nuk.uni-lj.si/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ssg",
   :skos/prefLabel "Splošni slovenski geslovnik"})

(def stcv
  "Short Title Catalogus Vlaanderen = Short title catalogue Flanders"
  {:db/ident :loc.subjectSchemes/stcv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Short Title Catalogus Vlaanderen = Short title catalogue Flanders",
   :madsrdf/code "stcv",
   :madsrdf/editorialNote "http://www.stcv.be/en",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/stcv,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.stcv.be/en",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "stcv",
   :skos/prefLabel
   "Short Title Catalogus Vlaanderen = Short title catalogue Flanders"})

(def sthus
  "Published by U. S. Department of State, Office of the Historian"
  {:db/ident :loc.subjectSchemes/sthus,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Subject taxonomy of the history of U.S. foreign relations",
   :madsrdf/code "sthus",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by U. S. Department of State, Office of the Historian"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/sthus,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by U. S. Department of State, Office of the Historian"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "sthus",
   :skos/prefLabel "Subject taxonomy of the history of U.S. foreign relations"})

(def stw
  "Published by ZBW - Deutsche Zentralbibliothek fur Wirtschaftswissenschaften in Kiel"
  {:db/ident :loc.subjectSchemes/stw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Standard-Thesaurus Wirtschaft = STW thesaurus for economics",
   :madsrdf/code "stw",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by ZBW - Deutsche Zentralbibliothek fur Wirtschaftswissenschaften in Kiel"},
   :madsrdf/editorialNote "http://zbw.eu/stw/version/latest/about",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/stw,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by ZBW - Deutsche Zentralbibliothek fur Wirtschaftswissenschaften in Kiel"},
   :skos/editorial "http://zbw.eu/stw/version/latest/about",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "stw",
   :skos/prefLabel
   "Standard-Thesaurus Wirtschaft = STW thesaurus for economics"})

(def swd
  "Published by Die Deutsche Bibliothek in Frankfurt am Main"
  {:db/ident :loc.subjectSchemes/swd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Schlagwortnormdatei",
   :madsrdf/code "swd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Die Deutsche Bibliothek in Frankfurt am Main"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/swd,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Die Deutsche Bibliothek in Frankfurt am Main"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "swd",
   :skos/prefLabel "Schlagwortnormdatei"})

(def swemesh
  "Published by Karolinska Institutets Bibliotek in Stockholm"
  {:db/ident :loc.subjectSchemes/swemesh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Svenska MeSH = Swedish MeSH",
   :madsrdf/code "swemesh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Karolinska Institutets Bibliotek in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/swemesh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Karolinska Institutets Bibliotek in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "swemesh",
   :skos/prefLabel "Svenska MeSH = Swedish MeSH"})

(def taika
  "Published by Kirjastopalvelu in Helsinki"
  {:db/ident :loc.subjectSchemes/taika,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Taideteollisuuden asiasanasto",
   :madsrdf/code "taika",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kirjastopalvelu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/taika,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kirjastopalvelu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "taika",
   :skos/prefLabel "Taideteollisuuden asiasanasto"})

(def tasmas
  "Published by Ministerio de Asuntos Sociales de España in Madrid"
  {:db/ident :loc.subjectSchemes/tasmas,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Tesaurus de asuntos sociales del Ministerio de Asuntos Sociales de España",
   :madsrdf/code "tasmas",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Ministerio de Asuntos Sociales de España in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tasmas,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Ministerio de Asuntos Sociales de España in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tasmas",
   :skos/prefLabel
   "Tesaurus de asuntos sociales del Ministerio de Asuntos Sociales de España"})

(def taxhs
  "Published by Info. and Referral Fed. of LA County in El Monte, CA"
  {:db/ident :loc.subjectSchemes/taxhs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Taxonomy or human services: a conceptual framework with standardized terminology and definitions for the field",
   :madsrdf/code "taxhs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Info. and Referral Fed. of LA County in El Monte, CA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/taxhs,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Info. and Referral Fed. of LA County in El Monte, CA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "taxhs",
   :skos/prefLabel
   "Taxonomy or human services: a conceptual framework with standardized terminology and definitions for the field"})

(def tbjvp
  "Published by ITESO Universidad Jesuita de Guadalajara in Guadalajara"
  {:db/ident :loc.subjectSchemes/tbjvp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Tesauro de la Biblioteca Dr. Jorge Villalobos Padilla, S.J.",
   :madsrdf/code "tbjvp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by ITESO Universidad Jesuita de Guadalajara in Guadalajara"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tbjvp,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by ITESO Universidad Jesuita de Guadalajara in Guadalajara"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tbjvp",
   :skos/prefLabel
   "Tesauro de la Biblioteca Dr. Jorge Villalobos Padilla, S.J."})

(def tef
  "Tesauro especializado en filosofía, con enfoque de género by Marcia Ugarte Barquero"
  {:db/ident :loc.subjectSchemes/tef,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-06-01T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-06-01T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Tesauro especializado en filosofía, con enfoque de género by Marcia Ugarte Barquero",
   :madsrdf/code "tef",
   :madsrdf/editorialNote "https://www.vocabularyserver.com/genero/sobre.php",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-06-01T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-06-01T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tef,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.vocabularyserver.com/genero/sobre.php",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tef",
   :skos/prefLabel
   "Tesauro especializado en filosofía, con enfoque de género by Marcia Ugarte Barquero"})

(def tekord
  "Published by Universitetsbiblioteket i Trondheim in Norway"
  {:db/ident :loc.subjectSchemes/tekord,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "TEK-ord : UBiTs emneordliste for arkitektur, realfag, og teknolog",
   :madsrdf/code "tekord",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Universitetsbiblioteket i Trondheim in Norway"},
   :madsrdf/editorialNote
   "http://quijote.biblio.iteso.mx/catia/tesauro/default.htm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tekord,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Universitetsbiblioteket i Trondheim in Norway"},
   :skos/editorial "http://quijote.biblio.iteso.mx/catia/tesauro/default.htm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tekord",
   :skos/prefLabel
   "TEK-ord : UBiTs emneordliste for arkitektur, realfag, og teknolog"})

(def tero
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/tero,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "TERO - Terveyden ja hyvinvoinnin ontologia",
   :madsrdf/code "tero",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tero,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tero",
   :skos/prefLabel "TERO - Terveyden ja hyvinvoinnin ontologia"})

(def tesa
  "Published by National Agricultural Library in Beltsville, Maryland"
  {:db/ident :loc.subjectSchemes/tesa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Tesauro agrícola",
   :madsrdf/code "tesa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Agricultural Library in Beltsville, Maryland"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tesa,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Agricultural Library in Beltsville, Maryland"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tesa",
   :skos/prefLabel "Tesauro agrícola"})

(def tesbhaecid
  "Published by AECID in Madrid"
  {:db/ident :loc.subjectSchemes/tesbhaecid,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Tesauro de la Biblioteca Hispánica de la Biblioteca AECID",
   :madsrdf/code "tesbhaecid",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by AECID in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tesbhaecid,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by AECID in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tesbhaecid",
   :skos/prefLabel "Tesauro de la Biblioteca Hispánica de la Biblioteca AECID"})

(def test
  "Published by U.S. Dept. of Defense in Washington"
  {:db/ident :loc.subjectSchemes/test,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus of engineering and scientific terms",
   :madsrdf/code "test",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by U.S. Dept. of Defense in Washington"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/test,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by U.S. Dept. of Defense in Washington"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "test",
   :skos/prefLabel "Thesaurus of engineering and scientific terms"})

(def tgn
  "Published by Getty Research Institute in Los Angeles"
  {:db/ident :loc.subjectSchemes/tgn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Getty thesaurus of geographic names",
   :madsrdf/code "tgn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Getty Research Institute in Los Angeles"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tgn,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Getty Research Institute in Los Angeles"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tgn",
   :skos/prefLabel "Getty thesaurus of geographic names"})

(def tha
  "Published by Editorial Dunken in Buenos Aires"
  {:db/ident :loc.subjectSchemes/tha,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Barcala de Moyano, Graciela G., Cristina Voena. Tesauro de Historia Argentina",
   :madsrdf/code "tha",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Editorial Dunken in Buenos Aires"},
   :madsrdf/editorialNote
   "http://vocabularios.caicyt.gov.ar/historiaargentina/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tha,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Editorial Dunken in Buenos Aires"},
   :skos/editorial "http://vocabularios.caicyt.gov.ar/historiaargentina/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tha",
   :skos/prefLabel
   "Barcala de Moyano, Graciela G., Cristina Voena. Tesauro de Historia Argentina"})

(def thesoz
  "Published by GESIS - Leibniz Institute for the Social Sciences in Germany"
  {:db/ident :loc.subjectSchemes/thesoz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus for the social sciences",
   :madsrdf/code "thesoz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by GESIS - Leibniz Institute for the Social Sciences in Germany"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/thesoz,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by GESIS - Leibniz Institute for the Social Sciences in Germany"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "thesoz",
   :skos/prefLabel "Thesaurus for the social sciences"})

(def thia
  "Published by Italian National Childhood and Adolescence Documentation and Analysis Center"
  {:db/ident :loc.subjectSchemes/thia,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Th.I.A. - Thesaurus italiano infanzia e adolescenza = Th.I.A. - Italian thesaurus on childhood and adolescence",
   :madsrdf/code "thia",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Italian National Childhood and Adolescence Documentation and Analysis Center"},
   :madsrdf/editorialNote
   "https://www.minori.gov.it/en/minori/thia-italian-thesaurus-childhood-and-adolescence",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/thia,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Italian National Childhood and Adolescence Documentation and Analysis Center"},
   :skos/editorial
   "https://www.minori.gov.it/en/minori/thia-italian-thesaurus-childhood-and-adolescence",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "thia",
   :skos/prefLabel
   "Th.I.A. - Thesaurus italiano infanzia e adolescenza = Th.I.A. - Italian thesaurus on childhood and adolescence"})

(def thla
  "Published by Fondazione Benetton, Treviso, Italy"
  {:db/ident :loc.subjectSchemes/thla,
   :madsrdf/authoritativeLabel "ThLA – Thesaurus for landscape",
   :madsrdf/code "thla",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Fondazione Benetton, Treviso, Italy"},
   :madsrdf/editorialNote "https://www.fbsr.it/en/",
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Fondazione Benetton, Treviso, Italy"},
   :skos/editorial "https://www.fbsr.it/en/",
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "thla",
   :skos/prefLabel "ThLA – Thesaurus for landscape"})

(def tho
  "Published by Ethniko Kentro Tekmēriosēs in Athēna"
  {:db/ident :loc.subjectSchemes/tho,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesauros Hellēnikōn Oron",
   :madsrdf/code "tho",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Ethniko Kentro Tekmēriosēs in Athēna"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tho,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Ethniko Kentro Tekmēriosēs in Athēna"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tho",
   :skos/prefLabel "Thesauros Hellēnikōn Oron"})

(def thub
  "Published by Universitat de Barcelona, Centre de Recursos per a l'Aprenentatge i la Investigació, Procés Tècnic in Barcelona"
  {:db/ident :loc.subjectSchemes/thub,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus de la Universitat de Barcelona",
   :madsrdf/code "thub",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Universitat de Barcelona, Centre de Recursos per a l'Aprenentatge i la Investigació, Procés Tècnic in Barcelona"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/thub,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Universitat de Barcelona, Centre de Recursos per a l'Aprenentatge i la Investigació, Procés Tècnic in Barcelona"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "thub",
   :skos/prefLabel "Thesaurus de la Universitat de Barcelona"})

(def tips
  "Published by Instituto de estudios documentales sobre ciencia y tecnologia in Madrid"
  {:db/ident :loc.subjectSchemes/tips,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Tesauro ISOC de psicología",
   :madsrdf/code "tips",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Instituto de estudios documentales sobre ciencia y tecnologia in Madrid"},
   :madsrdf/editorialNote "http://digital.csic.es/handle/10261/35791",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tips,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Instituto de estudios documentales sobre ciencia y tecnologia in Madrid"},
   :skos/editorial "http://digital.csic.es/handle/10261/35791",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tips",
   :skos/prefLabel "Tesauro ISOC de psicología"})

(def tisa
  "Published by nstituto de estudios documentales sobre ciencia y tecnologia in Madrid"
  {:db/ident :loc.subjectSchemes/tisa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Villagrá Rubio, Angel. Tesauro ISOC de sociología autores",
   :madsrdf/code "tisa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by nstituto de estudios documentales sobre ciencia y tecnologia in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tisa,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by nstituto de estudios documentales sobre ciencia y tecnologia in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tisa",
   :skos/prefLabel "Villagrá Rubio, Angel. Tesauro ISOC de sociología autores"})

(def tlka
  "Published by Työväenliikkeen kirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/tlka,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Investigació, Procés Tècnicn kirjaston asiasanasto",
   :madsrdf/code "tlka",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Työväenliikkeen kirjasto in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tlka,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Työväenliikkeen kirjasto in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tlka",
   :skos/prefLabel "Investigació, Procés Tècnicn kirjaston asiasanasto"})

(def tlsh
  "Published by Northwestern University Library, Transportation Library in Evanston, Ill."
  {:db/ident :loc.subjectSchemes/tlsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Subject heading authority list",
   :madsrdf/code "tlsh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Northwestern University Library, Transportation Library in Evanston, Ill."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tlsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Northwestern University Library, Transportation Library in Evanston, Ill."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tlsh",
   :skos/prefLabel "Subject heading authority list"})

(def trfarn
  "Lokale trefwoorden de Bibliotheek Arnhem"
  {:db/ident :loc.subjectSchemes/trfarn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lokale trefwoorden de Bibliotheek Arnhem",
   :madsrdf/code "trfarn",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/trfarn,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "trfarn",
   :skos/prefLabel "Lokale trefwoorden de Bibliotheek Arnhem"})

(def trfbmb
  "Lokale trefwoorden Bibliotheek Midden-Brabant"
  {:db/ident :loc.subjectSchemes/trfbmb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lokale trefwoorden Bibliotheek Midden-Brabant",
   :madsrdf/code "trfbmb",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/trfbmb,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "trfbmb",
   :skos/prefLabel "Lokale trefwoorden Bibliotheek Midden-Brabant"})

(def trfdh
  "Lokale trefwoorden OB Den Haag"
  {:db/ident :loc.subjectSchemes/trfdh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lokale trefwoorden OB Den Haag",
   :madsrdf/code "trfdh",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/trfdh,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "trfdh",
   :skos/prefLabel "Lokale trefwoorden OB Den Haag"})

(def trfgr
  "Lokale trefwoorden Biblionet Groningen"
  {:db/ident :loc.subjectSchemes/trfgr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lokale trefwoorden Biblionet Groningen",
   :madsrdf/code "trfgr",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/trfgr,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "trfgr",
   :skos/prefLabel "Lokale trefwoorden Biblionet Groningen"})

(def trfoba
  "Published by Openbare Bibliotheek Amsterdam"
  {:db/ident :loc.subjectSchemes/trfoba,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lokale trefwoorden OBA",
   :madsrdf/code "trfoba",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Openbare Bibliotheek Amsterdam"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/trfoba,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Openbare Bibliotheek Amsterdam"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "trfoba",
   :skos/prefLabel "Lokale trefwoorden OBA"})

(def trfzb
  "Lokale trefwoorden Zeeuwse Bibliotheken"
  {:db/ident :loc.subjectSchemes/trfzb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lokale trefwoorden Zeeuwse Bibliotheken",
   :madsrdf/code "trfzb",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/trfzb,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "trfzb",
   :skos/prefLabel "Lokale trefwoorden Zeeuwse Bibliotheken"})

(def trt
  "Published by CDB Enterprises in Silver Spring, MD"
  {:db/ident :loc.subjectSchemes/trt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Transportation resource thesaurus",
   :madsrdf/code "trt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by CDB Enterprises in Silver Spring, MD"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/trt,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by CDB Enterprises in Silver Spring, MD"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "trt",
   :skos/prefLabel "Transportation resource thesaurus"})

(def trtsa
  "Published by BTJ Kirjastopalvelu in Helsinki"
  {:db/ident :loc.subjectSchemes/trtsa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Teatterin ja tanssin asiasanasto",
   :madsrdf/code "trtsa",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by BTJ Kirjastopalvelu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/trtsa,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by BTJ Kirjastopalvelu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "trtsa",
   :skos/prefLabel "Teatterin ja tanssin asiasanasto"})

(def tsaij
  "Published by Sistema Argentino de Información Jurídica"
  {:db/ident :loc.subjectSchemes/tsaij,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Tesauro SAIJ de derecho Argentino",
   :madsrdf/code "tsaij",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Sistema Argentino de Información Jurídica"},
   :madsrdf/editorialNote "http://admin.tcda.infojus.gov.ar/saij/index.php",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tsaij,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Sistema Argentino de Información Jurídica"},
   :skos/editorial "http://admin.tcda.infojus.gov.ar/saij/index.php",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tsaij",
   :skos/prefLabel "Tesauro SAIJ de derecho Argentino"})

(def tshd
  "Published by Cataloging Working Group of Thailand University Libraries"
  {:db/ident :loc.subjectSchemes/tshd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thai subject heading database: online Thai subject headings",
   :madsrdf/code "tshd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Cataloging Working Group of Thailand University Libraries"},
   :madsrdf/editorialNote "https://webhost2.car.chula.ac.th/thaiccweb/main.php",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tshd,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Cataloging Working Group of Thailand University Libraries"},
   :skos/editorial "https://webhost2.car.chula.ac.th/thaiccweb/main.php",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tshd",
   :skos/prefLabel
   "Thai subject heading database: online Thai subject headings"})

(def tsht
  "Published by Oryx Press in Phoeniz, AZ"
  {:db/ident :loc.subjectSchemes/tsht,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus of subject headings for television",
   :madsrdf/code "tsht",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Oryx Press in Phoeniz, AZ"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tsht,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Oryx Press in Phoeniz, AZ"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tsht",
   :skos/prefLabel "Thesaurus of subject headings for television"})

(def tsr
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/tsr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "TSR-ontologia",
   :madsrdf/code "tsr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tsr,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tsr",
   :skos/prefLabel "TSR-ontologia"})

(def ttka
  "Published by Helsingin yliopisto in Helsinki"
  {:db/ident :loc.subjectSchemes/ttka,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Teologisen tiedekunnan kirjaston asiasanasto",
   :madsrdf/code "ttka",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Helsingin yliopisto in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ttka,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Helsingin yliopisto in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ttka",
   :skos/prefLabel "Teologisen tiedekunnan kirjaston asiasanasto"})

(def ttll
  "Published by Nuevo Parhadigma in Santa Fe, Argentina"
  {:db/ident :loc.subjectSchemes/ttll,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Roggau, Zunilda. Tell. Tesauro de lengua y literatura",
   :madsrdf/code "ttll",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Nuevo Parhadigma in Santa Fe, Argentina"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ttll,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Nuevo Parhadigma in Santa Fe, Argentina"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ttll",
   :skos/prefLabel "Roggau, Zunilda. Tell. Tesauro de lengua y literatura"})

(def tucua
  "Published by Society of American Archivists in Chicago, IL"
  {:db/ident :loc.subjectSchemes/tucua,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus for use in college and university archives",
   :madsrdf/code "tucua",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Society of American Archivists in Chicago, IL"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/tucua,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Society of American Archivists in Chicago, IL"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "tucua",
   :skos/prefLabel "Thesaurus for use in college and university archives"})

(def udc
  "Published by British Standards Institution in London"
  {:db/ident :loc.subjectSchemes/udc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Universal decimal classification",
   :madsrdf/code "udc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by British Standards Institution in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/udc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by British Standards Institution in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "udc",
   :skos/prefLabel "Universal decimal classification"})

(def ukslc
  "Published by BIC in London"
  {:db/ident :loc.subjectSchemes/ukslc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "UK standard library categories",
   :madsrdf/code "ukslc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by BIC in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ukslc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by BIC in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ukslc",
   :skos/prefLabel "UK standard library categories"})

(def ulan
  "Published by Getty Research Institute in Los Angeles"
  {:db/ident :loc.subjectSchemes/ulan,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Union list of artist names",
   :madsrdf/code "ulan",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Getty Research Institute in Los Angeles"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/ulan,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Getty Research Institute in Los Angeles"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ulan",
   :skos/prefLabel "Union list of artist names"})

(def umitrist
  "Published by Research Information and Publications Center, University of Michigan, Transportation Research Instituteby Ann Arbor, MI"
  {:db/ident :loc.subjectSchemes/umitrist,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "University of Michigan Transportation Research Institute structured thesaurus",
   :madsrdf/code "umitrist",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Research Information and Publications Center, University of Michigan, Transportation Research Instituteby Ann Arbor, MI"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/umitrist,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Research Information and Publications Center, University of Michigan, Transportation Research Instituteby Ann Arbor, MI"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "umitrist",
   :skos/prefLabel
   "University of Michigan Transportation Research Institute structured thesaurus"})

(def unbisn
  "Published by Dag Hammarskjld Library, United Nations in New York and Chadwyck-Healey in London"
  {:db/ident :loc.subjectSchemes/unbisn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "UNBIS name authority list",
   :madsrdf/code "unbisn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Dag Hammarskjld Library, United Nations in New York and Chadwyck-Healey in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/unbisn,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Dag Hammarskjld Library, United Nations in New York and Chadwyck-Healey in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "unbisn",
   :skos/prefLabel "UNBIS name authority list"})

(def unbist
  "Published by Dag Hammarskjld Library, United Nations in New York, NY"
  {:db/ident :loc.subjectSchemes/unbist,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "UNBIS thesaurus",
   :madsrdf/code "unbist",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Dag Hammarskjld Library, United Nations in New York, NY"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/unbist,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Dag Hammarskjld Library, United Nations in New York, NY"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "unbist",
   :skos/prefLabel "UNBIS thesaurus"})

(def unescot
  "Published by UNESCO Publishing in Paris"
  {:db/ident :loc.subjectSchemes/unescot,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "UNESCO thesaurus = Thésaurus de l'UNESCO = Tesauro de la UNESCO",
   :madsrdf/code "unescot",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by UNESCO Publishing in Paris"},
   :madsrdf/editorialNote
   "http://vocabularies.unesco.org/browser/thesaurus/en/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/unescot,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by UNESCO Publishing in Paris"},
   :skos/editorial "http://vocabularies.unesco.org/browser/thesaurus/en/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "unescot",
   :skos/prefLabel
   "UNESCO thesaurus = Thésaurus de l'UNESCO = Tesauro de la UNESCO"})

(def unicefirc
  "Published by UNICEF- Innocenti Research Centre"
  {:db/ident :loc.subjectSchemes/unicefirc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "International children's rights thesaurus",
   :madsrdf/code "unicefirc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by UNICEF- Innocenti Research Centre"},
   :madsrdf/editorialNote
   "https://www.unicef-irc.org/publications/276-international-childrens-rights-thesaurus.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/unicefirc,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by UNICEF- Innocenti Research Centre"},
   :skos/editorial
   "https://www.unicef-irc.org/publications/276-international-childrens-rights-thesaurus.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "unicefirc",
   :skos/prefLabel "International children's rights thesaurus"})

(def usaidt
  "Published by U.S. Agency for International Development in Washington, DC"
  {:db/ident :loc.subjectSchemes/usaidt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "USAID thesaurus: keywords used to index documents included in the USAID Development Experience System",
   :madsrdf/code "usaidt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by U.S. Agency for International Development in Washington, DC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/usaidt,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by U.S. Agency for International Development in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "usaidt",
   :skos/prefLabel
   "USAID thesaurus: keywords used to index documents included in the USAID Development Experience System"})

(def valo
  "Published by Kansalliskirjasto in Helsinki"
  {:db/ident :loc.subjectSchemes/valo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "VALO - Fotografiska ontologin",
   :madsrdf/code "valo",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kansalliskirjasto in Helsinki"},
   :madsrdf/editorialNote "http://finto.fi/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/valo,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Kansalliskirjasto in Helsinki"},
   :skos/editorial "http://finto.fi/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "valo",
   :skos/prefLabel "VALO - Fotografiska ontologin"})

(def vcaadu
  "Published by Vitruvio Red de Bibliotecas de arquitectura, arte, diseño y urbanismo, Subcomisión de lenguaje in Buenos Aires"
  {:db/ident :loc.subjectSchemes/vcaadu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Vocabulario controlado de arquitectura, arte, diseño y urbanismo",
   :madsrdf/code "vcaadu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Vitruvio Red de Bibliotecas de arquitectura, arte, diseño y urbanismo, Subcomisión de lenguaje in Buenos Aires"},
   :madsrdf/editorialNote "https://vocabularyserver.com/vitruvio/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/vcaadu,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Vitruvio Red de Bibliotecas de arquitectura, arte, diseño y urbanismo, Subcomisión de lenguaje in Buenos Aires"},
   :skos/editorial "https://vocabularyserver.com/vitruvio/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "vcaadu",
   :skos/prefLabel
   "Vocabulario controlado de arquitectura, arte, diseño y urbanismo"})

(def vffyl
  "Published by Facultad de Filosofa y Letras de la Universidad de Buenos Aires in Buenos Aires"
  {:db/ident :loc.subjectSchemes/vffyl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Vocabulario de la Biblioteca Central de la FFyL",
   :madsrdf/code "vffyl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Facultad de Filosofa y Letras de la Universidad de Buenos Aires in Buenos Aires"},
   :madsrdf/editorialNote "https://www.vocabularyserver.com/filo/index.php",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/vffyl,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Facultad de Filosofa y Letras de la Universidad de Buenos Aires in Buenos Aires"},
   :skos/editorial "https://www.vocabularyserver.com/filo/index.php",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "vffyl",
   :skos/prefLabel "Vocabulario de la Biblioteca Central de la FFyL"})

(def vmj
  "Published by Services documentaires multimédia in Montréal, QC"
  {:db/ident :loc.subjectSchemes/vmj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Vedettes-matière jeunesse",
   :madsrdf/code "vmj",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Services documentaires multimédia in Montréal, QC"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/vmj,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Services documentaires multimédia in Montréal, QC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "vmj",
   :skos/prefLabel "Vedettes-matière jeunesse"})

(def waqaf
  "Published by Kuwait Awqaf Public Foundation in Kuwait"
  {:db/ident :loc.subjectSchemes/waqaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Maknas Uloom al Waqaf",
   :madsrdf/code "waqaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Kuwait Awqaf Public Foundation in Kuwait"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/waqaf,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Kuwait Awqaf Public Foundation in Kuwait"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "waqaf",
   :skos/prefLabel "Maknas Uloom al Waqaf"})

(def watrest
  "Published by U.S. Bureau of Reclamation in Washington"
  {:db/ident :loc.subjectSchemes/watrest,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus of water resources terms: a collection of water resources and related terms for use in indexing technical information",
   :madsrdf/code "watrest",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by U.S. Bureau of Reclamation in Washington"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/watrest,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by U.S. Bureau of Reclamation in Washington"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "watrest",
   :skos/prefLabel
   "Thesaurus of water resources terms: a collection of water resources and related terms for use in indexing technical information"})

(def wgst
  "Published by Washington State Library in Tumwater, WA"
  {:db/ident :loc.subjectSchemes/wgst,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Washington GILS subject tree",
   :madsrdf/code "wgst",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Washington State Library in Tumwater, WA"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/wgst,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Washington State Library in Tumwater, WA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "wgst",
   :skos/prefLabel "Washington GILS subject tree"})

(def wikidata
  "Wikidata"
  {:db/ident :loc.subjectSchemes/wikidata,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Wikidata",
   :madsrdf/code "wikidata",
   :madsrdf/editorialNote "https://wikidata.org",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/wikidata,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://wikidata.org",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "wikidata",
   :skos/prefLabel "Wikidata"})

(def wot
  "Published by Harper & Row in New York"
  {:db/ident :loc.subjectSchemes/wot,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Women's thesaurus",
   :madsrdf/code "wot",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Harper & Row in New York"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/wot,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Harper & Row in New York"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "wot",
   :skos/prefLabel "Women's thesaurus"})

(def wpicsh
  "Published by Western Psychiatric Institute and Clinic Library, University of Pittsburgh, School of Medicine in Pittsburgh"
  {:db/ident :loc.subjectSchemes/wpicsh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "WPIC Library thesaurus of subject headings",
   :madsrdf/code "wpicsh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Western Psychiatric Institute and Clinic Library, University of Pittsburgh, School of Medicine in Pittsburgh"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.subjectSchemes/wpicsh,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Western Psychiatric Institute and Clinic Library, University of Pittsburgh, School of Medicine in Pittsburgh"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "wpicsh",
   :skos/prefLabel "WPIC Library thesaurus of subject headings"})

(def ysa
  "Published by Kirjastopalvelu in Helsinki"
  {:db/ident :loc.subjectSchemes/ysa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Yleinen suomalainen asiasanasto",
   :madsrdf/code "ysa",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kirjastopalvelu in Helsinki"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 600-654 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.subjectSchemes/collection_subjectSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/subjectSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value
                       "http://www.loc.gov/mads/rdf/v1#DeprecatedAuthority"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/ysa,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-03-07T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-03-07T00:00:00/dlc",
     :cs/subjectOfChange :loc.subjectSchemes/ysa,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kirjastopalvelu in Helsinki"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 600-654 $2"},
   :skos/inScheme :loc.vocabulary/subjectSchemes,
   :skos/notation "ysa",
   :skos/prefLabel "Yleinen suomalainen asiasanasto",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value
                    "http://www.loc.gov/mads/rdf/v1#DeprecatedAuthority"}})

(def ^{:private true} subjectSchemes
  "Subject Schemes contains a list of subject schemes and assigns a URI to each scheme. The purpose of these properties is to permit users to associate controlled subjects with the appropriate subject scheme. These schemes are general subject heading and thesauri, such as the Library of Congress Subject Headings, along with a number of focused subject term lists like Medical Subject Headings or Getty Thesaurus of Geographic Names."
  {:db/ident :loc.vocabulary/subjectSchemes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Subject Schemes contains a list of subject schemes and assigns a URI to each scheme. The purpose of these properties is to permit users to associate controlled subjects with the appropriate subject scheme. These schemes are general subject heading and thesauri, such as the Library of Congress Subject Headings, along with a number of focused subject term lists like Medical Subject Headings or Getty Thesaurus of Geographic Names."},
   :madsrdf/hasMADSSchemeMember [:loc.subjectSchemes/inspect
                                 :loc.subjectSchemes/root
                                 :loc.subjectSchemes/dbn
                                 :loc.subjectSchemes/scot
                                 :loc.subjectSchemes/asrcseo
                                 :loc.subjectSchemes/tbjvp
                                 :loc.subjectSchemes/peakbag
                                 :loc.subjectSchemes/kaunokki
                                 :loc.subjectSchemes/abne
                                 :loc.subjectSchemes/embucm
                                 :loc.subjectSchemes/cdcng
                                 :loc.subjectSchemes/embuz
                                 :loc.subjectSchemes/bicssc
                                 :loc.subjectSchemes/dltlt
                                 :loc.subjectSchemes/rero
                                 :loc.subjectSchemes/trfgr
                                 :loc.subjectSchemes/maknaz
                                 :loc.subjectSchemes/trfzb
                                 :loc.subjectSchemes/aiatsiss
                                 :loc.subjectSchemes/gbd
                                 :loc.subjectSchemes/puho
                                 :loc.subjectSchemes/tasmas
                                 :loc.subjectSchemes/idsbb
                                 :loc.subjectSchemes/shbe
                                 :loc.subjectSchemes/hrvmesh
                                 :loc.subjectSchemes/nimacsc
                                 :loc.subjectSchemes/hapi
                                 :loc.subjectSchemes/sfit
                                 :loc.subjectSchemes/proqsc
                                 :loc.subjectSchemes/dit
                                 :loc.subjectSchemes/pmont
                                 :loc.subjectSchemes/dtict
                                 :loc.subjectSchemes/peri
                                 :loc.subjectSchemes/csh
                                 :loc.subjectSchemes/pmcsg
                                 :loc.subjectSchemes/tsr
                                 :loc.subjectSchemes/etiras
                                 :loc.subjectSchemes/bidex
                                 :loc.subjectSchemes/quiding
                                 :loc.subjectSchemes/rugeo
                                 :loc.subjectSchemes/sears
                                 :loc.subjectSchemes/aass
                                 :loc.subjectSchemes/pplt
                                 :loc.subjectSchemes/renib
                                 :loc.subjectSchemes/csapa
                                 :loc.subjectSchemes/cilla
                                 :loc.subjectSchemes/test
                                 :loc.subjectSchemes/itglit
                                 :loc.subjectSchemes/cgpa
                                 :loc.subjectSchemes/smda
                                 :loc.subjectSchemes/tgn
                                 :loc.subjectSchemes/ttka
                                 :loc.subjectSchemes/kto
                                 :loc.subjectSchemes/ntc
                                 :loc.subjectSchemes/stw
                                 :loc.subjectSchemes/ipat
                                 :loc.subjectSchemes/pleiades
                                 :loc.subjectSchemes/dicgentop
                                 :loc.subjectSchemes/nsbncf
                                 :loc.subjectSchemes/scgdst
                                 :loc.subjectSchemes/precis
                                 :loc.subjectSchemes/hoidokki
                                 :loc.subjectSchemes/bibalex
                                 :loc.subjectSchemes/tesa
                                 :loc.subjectSchemes/nicem
                                 :loc.subjectSchemes/dbcsh
                                 :loc.subjectSchemes/taika
                                 :loc.subjectSchemes/prnpdi
                                 :loc.subjectSchemes/mero
                                 :loc.subjectSchemes/allars
                                 :loc.subjectSchemes/ddcri
                                 :loc.subjectSchemes/ddcut
                                 :loc.subjectSchemes/pkk
                                 :loc.subjectSchemes/tucua
                                 :loc.subjectSchemes/cck
                                 :loc.subjectSchemes/tesbhaecid
                                 :loc.subjectSchemes/wpicsh
                                 :loc.subjectSchemes/asrctoa
                                 :loc.subjectSchemes/gnis
                                 :loc.subjectSchemes/labloc
                                 :loc.subjectSchemes/gpn
                                 :loc.subjectSchemes/eflch
                                 :loc.subjectSchemes/nskps
                                 :loc.subjectSchemes/noram
                                 :loc.subjectSchemes/ltcsh
                                 :loc.subjectSchemes/dltt
                                 :loc.subjectSchemes/bella
                                 :loc.subjectSchemes/mmm
                                 :loc.subjectSchemes/btr
                                 :loc.subjectSchemes/bdrc
                                 :loc.subjectSchemes/sao
                                 :loc.subjectSchemes/mar
                                 :loc.subjectSchemes/kulo
                                 :loc.subjectSchemes/idszbzes
                                 :loc.subjectSchemes/afo
                                 :loc.subjectSchemes/dcs
                                 :loc.subjectSchemes/asft
                                 :loc.subjectSchemes/rerovoc
                                 :loc.subjectSchemes/kassu
                                 :loc.subjectSchemes/bet
                                 :loc.subjectSchemes/apaist
                                 :loc.subjectSchemes/prvt
                                 :loc.subjectSchemes/aat
                                 :loc.subjectSchemes/cht
                                 :loc.subjectSchemes/idszbzzk
                                 :loc.subjectSchemes/stcv
                                 :loc.subjectSchemes/tho
                                 :loc.subjectSchemes/liv
                                 :loc.subjectSchemes/solstad
                                 :loc.subjectSchemes/idas
                                 :loc.subjectSchemes/buscem
                                 :loc.subjectSchemes/cash
                                 :loc.subjectSchemes/ausext
                                 :loc.subjectSchemes/bisacmt
                                 :loc.subjectSchemes/unescot
                                 :loc.subjectSchemes/eet
                                 :loc.subjectSchemes/atla
                                 :loc.subjectSchemes/kta
                                 :loc.subjectSchemes/ntids
                                 :loc.subjectSchemes/nal
                                 :loc.subjectSchemes/atg
                                 :loc.subjectSchemes/sosa
                                 :loc.subjectSchemes/tshd
                                 :loc.subjectSchemes/kaa
                                 :loc.subjectSchemes/fnhl
                                 :loc.subjectSchemes/eum
                                 :loc.subjectSchemes/kito
                                 :loc.subjectSchemes/embiaecid
                                 :loc.subjectSchemes/bhb
                                 :loc.subjectSchemes/pldi
                                 :loc.subjectSchemes/eurovocsl
                                 :loc.subjectSchemes/snt
                                 :loc.subjectSchemes/bisacsh
                                 :loc.subjectSchemes/skon
                                 :loc.subjectSchemes/cct
                                 :loc.subjectSchemes/gnd
                                 :loc.subjectSchemes/muzvukci
                                 :loc.subjectSchemes/iest
                                 :loc.subjectSchemes/bare
                                 :loc.subjectSchemes/taxhs
                                 :loc.subjectSchemes/nbdbt
                                 :loc.subjectSchemes/umitrist
                                 :loc.subjectSchemes/hamsun
                                 :loc.subjectSchemes/sgc
                                 :loc.subjectSchemes/ibsen
                                 :loc.subjectSchemes/thesoz
                                 :loc.subjectSchemes/lnmmbr
                                 :loc.subjectSchemes/khib
                                 :loc.subjectSchemes/kubikat
                                 :loc.subjectSchemes/rasuqam
                                 :loc.subjectSchemes/pmt
                                 :loc.subjectSchemes/wot
                                 :loc.subjectSchemes/ddcrit
                                 :loc.subjectSchemes/trfoba
                                 :loc.subjectSchemes/habiit
                                 :loc.subjectSchemes/huc
                                 :loc.subjectSchemes/vcaadu
                                 :loc.subjectSchemes/agrovoc
                                 :loc.subjectSchemes/hkcan
                                 :loc.subjectSchemes/pha
                                 :loc.subjectSchemes/gst
                                 :loc.subjectSchemes/embne
                                 :loc.subjectSchemes/opms
                                 :loc.subjectSchemes/popinte
                                 :loc.subjectSchemes/ntissc
                                 :loc.subjectSchemes/normesh
                                 :loc.subjectSchemes/henn
                                 :loc.subjectSchemes/rswkaf
                                 :loc.subjectSchemes/ericd
                                 :loc.subjectSchemes/ram
                                 :loc.subjectSchemes/georeft
                                 :loc.subjectSchemes/idszbzna
                                 :loc.subjectSchemes/csahssa
                                 :loc.subjectSchemes/frst
                                 :loc.subjectSchemes/tlka
                                 :loc.subjectSchemes/jlabsh
                                 :loc.subjectSchemes/inist
                                 :loc.subjectSchemes/local
                                 :loc.subjectSchemes/kauno
                                 :loc.subjectSchemes/trt
                                 :loc.subjectSchemes/rvm
                                 :loc.subjectSchemes/tips
                                 :loc.subjectSchemes/gcipmedia
                                 :loc.subjectSchemes/blcpss
                                 :loc.subjectSchemes/agrovocf
                                 :loc.subjectSchemes/samisk
                                 :loc.subjectSchemes/lua
                                 :loc.subjectSchemes/pascal
                                 :loc.subjectSchemes/maotao
                                 :loc.subjectSchemes/eurovocen
                                 :loc.subjectSchemes/no-ubo-mr
                                 :loc.subjectSchemes/iconauth
                                 :loc.subjectSchemes/helecon
                                 :loc.subjectSchemes/trfarn
                                 :loc.subjectSchemes/gccst
                                 :loc.subjectSchemes/nlmnaf
                                 :loc.subjectSchemes/bjornson
                                 :loc.subjectSchemes/dicgenam
                                 :loc.subjectSchemes/itis
                                 :loc.subjectSchemes/wikidata
                                 :loc.subjectSchemes/asth
                                 :loc.subjectSchemes/eurovocfr
                                 :loc.subjectSchemes/naf
                                 :loc.subjectSchemes/idszbzzh
                                 :loc.subjectSchemes/thla
                                 :loc.subjectSchemes/rurkp
                                 :loc.subjectSchemes/aucsh
                                 :loc.subjectSchemes/mtirdes
                                 :loc.subjectSchemes/ntcpsc
                                 :loc.subjectSchemes/sigle
                                 :loc.subjectSchemes/noubojur
                                 :loc.subjectSchemes/niodt
                                 :loc.subjectSchemes/sbiao
                                 :loc.subjectSchemes/unicefirc
                                 :loc.subjectSchemes/qnlsh
                                 :loc.subjectSchemes/flgeo
                                 :loc.subjectSchemes/humord
                                 :loc.subjectSchemes/ogst
                                 :loc.subjectSchemes/kula
                                 :loc.subjectSchemes/koko
                                 :loc.subjectSchemes/rpe
                                 :loc.subjectSchemes/drama
                                 :loc.subjectSchemes/ccsa
                                 :loc.subjectSchemes/tef
                                 :loc.subjectSchemes/thia
                                 :loc.subjectSchemes/odlt
                                 :loc.subjectSchemes/msc
                                 :loc.subjectSchemes/ipsp
                                 :loc.subjectSchemes/kssbar
                                 :loc.subjectSchemes/ukslc
                                 :loc.subjectSchemes/gemet
                                 :loc.subjectSchemes/ulan
                                 :loc.subjectSchemes/pepp
                                 :loc.subjectSchemes/hrvmr
                                 :loc.subjectSchemes/nalnaf
                                 :loc.subjectSchemes/fire
                                 :loc.subjectSchemes/nbiemnfag
                                 :loc.subjectSchemes/ated
                                 :loc.subjectSchemes/idszbz
                                 :loc.subjectSchemes/sgce
                                 :loc.subjectSchemes/rswk
                                 :loc.subjectSchemes/kkts
                                 :loc.subjectSchemes/jupo
                                 :loc.subjectSchemes/icpsr
                                 :loc.subjectSchemes/eks
                                 :loc.subjectSchemes/wgst
                                 :loc.subjectSchemes/mipfesd
                                 :loc.subjectSchemes/itrt
                                 :loc.subjectSchemes/erfemn
                                 :loc.subjectSchemes/ppluk
                                 :loc.subjectSchemes/afset
                                 :loc.subjectSchemes/dicgenes
                                 :loc.subjectSchemes/trfdh
                                 :loc.subjectSchemes/kao
                                 :loc.subjectSchemes/bibbi
                                 :loc.subjectSchemes/mts
                                 :loc.subjectSchemes/thub
                                 :loc.subjectSchemes/juho
                                 :loc.subjectSchemes/csalsct
                                 :loc.subjectSchemes/jhpk
                                 :loc.subjectSchemes/barn
                                 :loc.subjectSchemes/etuesh
                                 :loc.subjectSchemes/muzeukn
                                 :loc.subjectSchemes/watrest
                                 :loc.subjectSchemes/larpcal
                                 :loc.subjectSchemes/nzggn
                                 :loc.subjectSchemes/lctgm
                                 :loc.subjectSchemes/qrma
                                 :loc.subjectSchemes/muzeukc
                                 :loc.subjectSchemes/armarc
                                 :loc.subjectSchemes/francis
                                 :loc.subjectSchemes/kdm
                                 :loc.subjectSchemes/lcshac
                                 :loc.subjectSchemes/noraf
                                 :loc.subjectSchemes/nlksh
                                 :loc.subjectSchemes/csht
                                 :loc.subjectSchemes/iescs
                                 :loc.subjectSchemes/nmaict
                                 :loc.subjectSchemes/ktta
                                 :loc.subjectSchemes/dissao
                                 :loc.subjectSchemes/sipri
                                 :loc.subjectSchemes/albt
                                 :loc.subjectSchemes/usaidt
                                 :loc.subjectSchemes/ysa
                                 :loc.subjectSchemes/tisa
                                 :loc.subjectSchemes/maaq
                                 :loc.subjectSchemes/czmesh
                                 :loc.subjectSchemes/dhb-jdg
                                 :loc.subjectSchemes/ciesiniv
                                 :loc.subjectSchemes/czenas
                                 :loc.subjectSchemes/rma
                                 :loc.subjectSchemes/rvmgd
                                 :loc.subjectSchemes/biccbmc
                                 :loc.subjectSchemes/noubomn
                                 :loc.subjectSchemes/kitu
                                 :loc.subjectSchemes/fssh
                                 :loc.subjectSchemes/cstud
                                 :loc.subjectSchemes/lacnaf
                                 :loc.subjectSchemes/psychit
                                 :loc.subjectSchemes/homoit
                                 :loc.subjectSchemes/lcdgt
                                 :loc.subjectSchemes/minecost
                                 :loc.subjectSchemes/blmlsh
                                 :loc.subjectSchemes/agrovocs
                                 :loc.subjectSchemes/fmesh
                                 :loc.subjectSchemes/blnpn
                                 :loc.subjectSchemes/lcstt
                                 :loc.subjectSchemes/bhammf
                                 :loc.subjectSchemes/fast
                                 :loc.subjectSchemes/reo
                                 :loc.subjectSchemes/tsht
                                 :loc.subjectSchemes/aiatsisp
                                 :loc.subjectSchemes/trtsa
                                 :loc.subjectSchemes/bisacrt
                                 :loc.subjectSchemes/gem
                                 :loc.subjectSchemes/mech
                                 :loc.subjectSchemes/idszbzzg
                                 :loc.subjectSchemes/spines
                                 :loc.subjectSchemes/slem
                                 :loc.subjectSchemes/skbb
                                 :loc.subjectSchemes/chirosh
                                 :loc.subjectSchemes/rvmfast
                                 :loc.subjectSchemes/cgndb
                                 :loc.subjectSchemes/est
                                 :loc.subjectSchemes/sbt
                                 :loc.subjectSchemes/shsples
                                 :loc.subjectSchemes/gtt
                                 :loc.subjectSchemes/cckthema
                                 :loc.subjectSchemes/netc
                                 :loc.subjectSchemes/cctf
                                 :loc.subjectSchemes/ica
                                 :loc.subjectSchemes/lemac
                                 :loc.subjectSchemes/ilot
                                 :loc.subjectSchemes/bokbas
                                 :loc.subjectSchemes/ntcsd
                                 :loc.subjectSchemes/swemesh
                                 :loc.subjectSchemes/aktp
                                 :loc.subjectSchemes/sanb
                                 :loc.subjectSchemes/vffyl
                                 :loc.subjectSchemes/bhashe
                                 :loc.subjectSchemes/qlsp
                                 :loc.subjectSchemes/ashlnl
                                 :loc.subjectSchemes/habich
                                 :loc.subjectSchemes/collett
                                 :loc.subjectSchemes/periodo
                                 :loc.subjectSchemes/ncjt
                                 :loc.subjectSchemes/isis
                                 :loc.subjectSchemes/dugfr
                                 :loc.subjectSchemes/ebfem
                                 :loc.subjectSchemes/she
                                 :loc.subjectSchemes/norvok
                                 :loc.subjectSchemes/nlgaf
                                 :loc.subjectSchemes/eclas
                                 :loc.subjectSchemes/tha
                                 :loc.subjectSchemes/habibe
                                 :loc.subjectSchemes/ndlsh
                                 :loc.subjectSchemes/udc
                                 :loc.subjectSchemes/cyac
                                 :loc.subjectSchemes/ceeus
                                 :loc.subjectSchemes/msh
                                 :loc.subjectSchemes/lemb
                                 :loc.subjectSchemes/waqaf
                                 :loc.subjectSchemes/cabt
                                 :loc.subjectSchemes/norbok
                                 :loc.subjectSchemes/habifr
                                 :loc.subjectSchemes/tekord
                                 :loc.subjectSchemes/liito
                                 :loc.subjectSchemes/gsso
                                 :loc.subjectSchemes/lcac
                                 :loc.subjectSchemes/ktpt
                                 :loc.subjectSchemes/finmesh
                                 :loc.subjectSchemes/geonet
                                 :loc.subjectSchemes/nta
                                 :loc.subjectSchemes/gcipplatform
                                 :loc.subjectSchemes/ttll
                                 :loc.subjectSchemes/bt
                                 :loc.subjectSchemes/kaba
                                 :loc.subjectSchemes/masa
                                 :loc.subjectSchemes/unbist
                                 :loc.subjectSchemes/galestne
                                 :loc.subjectSchemes/etuturkob
                                 :loc.subjectSchemes/musa
                                 :loc.subjectSchemes/lapponica
                                 :loc.subjectSchemes/aiatsisl
                                 :loc.subjectSchemes/ilpt
                                 :loc.subjectSchemes/mpirdes
                                 :loc.subjectSchemes/jhpb
                                 :loc.subjectSchemes/sk
                                 :loc.subjectSchemes/valo
                                 :loc.subjectSchemes/kupu
                                 :loc.subjectSchemes/agrifors
                                 :loc.subjectSchemes/sthus
                                 :loc.subjectSchemes/eurovoces
                                 :loc.subjectSchemes/iptcnc
                                 :loc.subjectSchemes/qrmak
                                 :loc.subjectSchemes/nznb
                                 :loc.subjectSchemes/nlgkk
                                 :loc.subjectSchemes/soto
                                 :loc.subjectSchemes/qtglit
                                 :loc.subjectSchemes/qlit
                                 :loc.subjectSchemes/conorsi
                                 :loc.subjectSchemes/jurivoc
                                 :loc.subjectSchemes/vmj
                                 :loc.subjectSchemes/unbisn
                                 :loc.subjectSchemes/mesh
                                 :loc.subjectSchemes/ssg
                                 :loc.subjectSchemes/lcsh
                                 :loc.subjectSchemes/aatnor
                                 :loc.subjectSchemes/emnmus
                                 :loc.subjectSchemes/nli
                                 :loc.subjectSchemes/nasat
                                 :loc.subjectSchemes/hlasstg
                                 :loc.subjectSchemes/trfbmb
                                 :loc.subjectSchemes/tero
                                 :loc.subjectSchemes/bib1814
                                 :loc.subjectSchemes/asrcrfcd
                                 :loc.subjectSchemes/ordnok
                                 :loc.subjectSchemes/fes
                                 :loc.subjectSchemes/tlsh
                                 :loc.subjectSchemes/ccte
                                 :loc.subjectSchemes/swd
                                 :loc.subjectSchemes/pmbok
                                 :loc.subjectSchemes/scbi
                                 :loc.subjectSchemes/poliscit
                                 :loc.subjectSchemes/socio
                                 :loc.subjectSchemes/ept
                                 :loc.subjectSchemes/tsaij
                                 :loc.subjectSchemes/ascl
                                 :loc.subjectSchemes/aedoml
                                 :loc.subjectSchemes/muso
                                 :loc.subjectSchemes/nlgsh
                                 :loc.subjectSchemes/scisshl],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Subject Schemes"},
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.vocabulary/subjectSchemes,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Subject Schemes contains a list of subject schemes and assigns a URI to each scheme. The purpose of these properties is to permit users to associate controlled subjects with the appropriate subject scheme. These schemes are general subject heading and thesauri, such as the Library of Congress Subject Headings, along with a number of focused subject term lists like Medical Subject Headings or Getty Thesaurus of Geographic Names."}})