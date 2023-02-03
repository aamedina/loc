(ns net.wikipunk.rdf.loc.genreFormSchemes
  "http://id.loc.gov/vocabulary/genreFormSchemes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/genreFormSchemes.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.genreFormSchemes"
                       "http://id.loc.gov/vocabulary/genreFormSchemes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.genreFormSchemes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/genreFormSchemes/"})

(def alett
  "An alphabetical list of English text types"
  {:db/ident :loc.genreFormSchemes/alett,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "An alphabetical list of English text types",
   :madsrdf/code "alett",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/alett,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "alett",
   :skos/prefLabel "An alphabetical list of English text types"})

(def amg
  "Audiovisual material glossary"
  {:db/ident :loc.genreFormSchemes/amg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Audiovisual material glossary",
   :madsrdf/code "amg",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/amg,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "amg",
   :skos/prefLabel "Audiovisual material glossary"})

(def barngf
  "Svenska ämnesord för barn - Genre"
  {:db/ident :loc.genreFormSchemes/barngf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Svenska ämnesord för barn - Genre",
   :madsrdf/code "barngf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/barngf,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "barngf",
   :skos/prefLabel "Svenska ämnesord för barn - Genre"})

(def bdrc
  "Buddhist Digital Resource Center"
  {:db/ident :loc.genreFormSchemes/bdrc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-06-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-06-22T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Buddhist Digital Resource Center",
   :madsrdf/code "bdrc",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-06-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-06-22T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/bdrc,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "bdrc",
   :skos/prefLabel "Buddhist Digital Resource Center"})

(def bgtchm
  "Basic genre terms for cultural heritage materials"
  {:db/ident :loc.genreFormSchemes/bgtchm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Basic genre terms for cultural heritage materials",
   :madsrdf/code "bgtchm",
   :madsrdf/editorialNote "https://memory.loc.gov/ammem/techdocs/genre.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/bgtchm,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://memory.loc.gov/ammem/techdocs/genre.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "bgtchm",
   :skos/prefLabel "Basic genre terms for cultural heritage materials"})

(def cbk
  "Centraal Bestand Kinderboeken"
  {:db/ident :loc.genreFormSchemes/cbk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Centraal Bestand Kinderboeken",
   :madsrdf/code "cbk",
   :madsrdf/editorialNote
   "https://resolver.obvsg.at/urn:nbn:at:at-obvsg-20201013145504030-1597525-7",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/cbk,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://resolver.obvsg.at/urn:nbn:at:at-obvsg-20201013145504030-1597525-7",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "cbk",
   :skos/prefLabel "Centraal Bestand Kinderboeken"})

(def cjh
  "Center for Jewish History thesaurus"
  {:db/ident :loc.genreFormSchemes/cjh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Center for Jewish History thesaurus",
   :madsrdf/code "cjh",
   :madsrdf/editorialNote "http://libguides.cjh.org/cjh_thesaurus",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/cjh,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://libguides.cjh.org/cjh_thesaurus",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "cjh",
   :skos/prefLabel "Center for Jewish History thesaurus"})

(def dct
  "Dublin Core list of resource types"
  {:db/ident :loc.genreFormSchemes/dct,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dublin Core list of resource types",
   :madsrdf/code "dct",
   :madsrdf/editorialNote
   "http://dublincore.org/documents/dcmi-type-vocabulary/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/dct,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://dublincore.org/documents/dcmi-type-vocabulary/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "dct",
   :skos/prefLabel "Dublin Core list of resource types"})

(def estc
  "English short title catalogue"
  {:db/ident :loc.genreFormSchemes/estc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "English short title catalogue",
   :madsrdf/code "estc",
   :madsrdf/editorialNote "http://estc.bl.uk/",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Eighteenth century short title catalogue, the cataloguing rules",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Eighteenth century short title catalogue, the cataloguing rules",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/estc,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://estc.bl.uk/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "estc",
   :skos/prefLabel "English short title catalogue",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Eighteenth century short title catalogue, the cataloguing rules"}})

(def fbg
  "Films by genre"
  {:db/ident :loc.genreFormSchemes/fbg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Films by genre",
   :madsrdf/code "fbg",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/fbg,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "fbg",
   :skos/prefLabel "Films by genre"})

(def fgtpcm
  "Form/genre terms for printed cartoon material"
  {:db/ident :loc.genreFormSchemes/fgtpcm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Form/genre terms for printed cartoon material",
   :madsrdf/code "fgtpcm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/fgtpcm,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "fgtpcm",
   :skos/prefLabel "Form/genre terms for printed cartoon material"})

(def ftamc
  "Form terms for archival and manuscripts control"
  {:db/ident :loc.genreFormSchemes/ftamc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Form terms for archival and manuscripts control",
   :madsrdf/code "ftamc",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ftamc,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ftamc",
   :skos/prefLabel "Form terms for archival and manuscripts control"})

(def gatbeg
  "Gattungsbegriffe"
  {:db/ident :loc.genreFormSchemes/gatbeg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gattungsbegriffe",
   :madsrdf/code "gatbeg",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gatbeg,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gatbeg",
   :skos/prefLabel "Gattungsbegriffe"})

(def gmd
  "Anglo-American Cataloguing Rules general material designation"
  {:db/ident :loc.genreFormSchemes/gmd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Anglo-American Cataloguing Rules general material designation",
   :madsrdf/code "gmd",
   :madsrdf/hasVariant {:madsrdf/variantLabel "AACR GMD",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "AACR GMD",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gmd,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gmd",
   :skos/prefLabel
   "Anglo-American Cataloguing Rules general material designation",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "AACR GMD"}})

(def gmgpc
  "Thesaurus for graphic materials: TGM II, Genre and physical characteristic terms"
  {:db/ident :loc.genreFormSchemes/gmgpc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thesaurus for graphic materials: TGM II, Genre and physical characteristic terms",
   :madsrdf/code "gmgpc",
   :madsrdf/editorialNote "https://id.loc.gov/vocabulary/graphicMaterials.html",
   :madsrdf/hasVariant {:madsrdf/variantLabel "TGM II",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "TGM II",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gmgpc,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://id.loc.gov/vocabulary/graphicMaterials.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gmgpc",
   :skos/prefLabel
   "Thesaurus for graphic materials: TGM II, Genre and physical characteristic terms",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "TGM II"}})

(def gnd
  "Gemeinsame Normdatei"
  {:db/ident :loc.genreFormSchemes/gnd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gemeinsame Normdatei",
   :madsrdf/code "gnd",
   :madsrdf/editorialNote "http://www.dnb.de/EN/gnd",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gnd,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.dnb.de/EN/gnd",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gnd",
   :skos/prefLabel "Gemeinsame Normdatei"})

(def gnd-carrier
  "Gemeinsame Normdatei: Datenträgertyp"
  {:db/ident :loc.genreFormSchemes/gnd-carrier,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gemeinsame Normdatei: Datenträgertyp",
   :madsrdf/code "gnd-carrier",
   :madsrdf/editorialNote
   "https://wiki.dnb.de/download/attachments/106042227/AH-008.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gnd-carrier,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://wiki.dnb.de/download/attachments/106042227/AH-008.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gnd-carrier",
   :skos/prefLabel "Gemeinsame Normdatei: Datenträgertyp"})

(def gnd-content
  "Gemeinsame Normdatei: Beschreibung des Inhalts"
  {:db/ident :loc.genreFormSchemes/gnd-content,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gemeinsame Normdatei: Beschreibung des Inhalts",
   :madsrdf/code "gnd-content",
   :madsrdf/editorialNote
   "https://wiki.dnb.de/download/attachments/106042227/AH-007.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gnd-content,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://wiki.dnb.de/download/attachments/106042227/AH-007.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gnd-content",
   :skos/prefLabel "Gemeinsame Normdatei: Beschreibung des Inhalts"})

(def gnd-music
  "Gemeinsame Normdatei: Musikalische Ausgabeform"
  {:db/ident :loc.genreFormSchemes/gnd-music,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gemeinsame Normdatei: Musikalische Ausgabeform",
   :madsrdf/code "gnd-music",
   :madsrdf/editorialNote
   "https://wiki.dnb.de/download/attachments/106042227/AH-009.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gnd-music,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://wiki.dnb.de/download/attachments/106042227/AH-009.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gnd-music",
   :skos/prefLabel "Gemeinsame Normdatei: Musikalische Ausgabeform"})

(def gsafd
  "Guidelines on subject access to individual works of fiction, drama, etc"
  {:db/ident :loc.genreFormSchemes/gsafd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Guidelines on subject access to individual works of fiction, drama, etc",
   :madsrdf/code "gsafd",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gsafd,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gsafd",
   :skos/prefLabel
   "Guidelines on subject access to individual works of fiction, drama, etc"})

(def gsso
  "Gender, sex, and sexal orientation ontology"
  {:db/ident :loc.genreFormSchemes/gsso,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gender, sex, and sexal orientation ontology",
   :madsrdf/code "gsso",
   :madsrdf/editorialNote "http://www.ontobee.org/ontology/GSSO",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gsso,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.ontobee.org/ontology/GSSO",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gsso",
   :skos/prefLabel "Gender, sex, and sexal orientation ontology"})

(def gtlm
  "Genre terms for law materials: a thesaurus"
  {:db/ident :loc.genreFormSchemes/gtlm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Genre terms for law materials: a thesaurus",
   :madsrdf/code "gtlm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gtlm,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gtlm",
   :skos/prefLabel "Genre terms for law materials: a thesaurus"})

(def gtmm
  "Genre terms for markerspace materials"
  {:db/ident :loc.genreFormSchemes/gtmm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Genre terms for markerspace materials",
   :madsrdf/code "gtmm",
   :madsrdf/editorialNote
   "https://digital.library.unt.edu/ark:/67531/metadc1132759/",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Robson, Diane; Yanowski, Kevin & Sassen, Catherine. Genre terms for makerspace materials",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Robson, Diane; Yanowski, Kevin & Sassen, Catherine. Genre terms for makerspace materials",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gtmm,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://digital.library.unt.edu/ark:/67531/metadc1132759/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gtmm",
   :skos/prefLabel "Genre terms for markerspace materials",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Robson, Diane; Yanowski, Kevin & Sassen, Catherine. Genre terms for makerspace materials"}})

(def gttg
  "Genre terms for tabletop games"
  {:db/ident :loc.genreFormSchemes/gttg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Genre terms for tabletop games",
   :madsrdf/code "gttg",
   :madsrdf/editorialNote
   "https://digital.library.unt.edu/ark:/67531/metadc826647/",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Robson, Diane; Yanowski, Kevin & Sassen, Catherine. Genre terms for tabletop games",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Robson, Diane; Yanowski, Kevin & Sassen, Catherine. Genre terms for tabletop games",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/gttg,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://digital.library.unt.edu/ark:/67531/metadc826647/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "gttg",
   :skos/prefLabel "Genre terms for tabletop games",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Robson, Diane; Yanowski, Kevin & Sassen, Catherine. Genre terms for tabletop games"}})

(def isbdcontent
  "ISBD Area 0 [content]"
  {:db/ident :loc.genreFormSchemes/isbdcontent,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ISBD Area 0 [content]",
   :madsrdf/code "isbdcontent",
   :madsrdf/editorialNote
   "https://www.ifla.org/files/assets/cataloguing/isbd/isbd-cons_20110321.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/isbdcontent,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.ifla.org/files/assets/cataloguing/isbd/isbd-cons_20110321.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "isbdcontent",
   :skos/prefLabel "ISBD Area 0 [content]"})

(def isbdmedia
  "ISBD Area 0 [media]"
  {:db/ident :loc.genreFormSchemes/isbdmedia,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ISBD Area 0 [media]",
   :madsrdf/code "isbdmedia",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/isbdmedia,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "isbdmedia",
   :skos/prefLabel "ISBD Area 0 [media]"})

(def lcgft
  "Library of Congress genre/form terms for library and archival materials"
  {:db/ident :loc.genreFormSchemes/lcgft,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Library of Congress genre/form terms for library and archival materials",
   :madsrdf/code "lcgft",
   :madsrdf/editorialNote "https://id.loc.gov/authorities/genreForms.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/lcgft,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://id.loc.gov/authorities/genreForms.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "lcgft",
   :skos/prefLabel
   "Library of Congress genre/form terms for library and archival materials"})

(def lobt
  "Language of Bindings Thesaurus"
  {:db/ident :loc.genreFormSchemes/lobt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Language of Bindings Thesaurus",
   :madsrdf/code "lobt",
   :madsrdf/editorialNote "http://www.ligatus.org.uk/lob/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/lobt,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.ligatus.org.uk/lob/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "lobt",
   :skos/prefLabel "Language of Bindings Thesaurus"})

(def marccategory
  "MARC form category term list"
  {:db/ident :loc.genreFormSchemes/marccategory,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MARC form category term list",
   :madsrdf/code "marccategory",
   :madsrdf/editorialNote
   "https://www.loc.gov/standards/valuelist/marccategory.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/marccategory,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.loc.gov/standards/valuelist/marccategory.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "marccategory",
   :skos/prefLabel "MARC form category term list"})

(def marcform
  "MARC form of item term list"
  {:db/ident :loc.genreFormSchemes/marcform,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MARC form of item term list",
   :madsrdf/code "marcform",
   :madsrdf/editorialNote
   "https://www.loc.gov/standards/valuelist/marcform.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/marcform,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.loc.gov/standards/valuelist/marcform.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "marcform",
   :skos/prefLabel "MARC form of item term list"})

(def marcgt
  "MARC genre terms"
  {:db/ident :loc.genreFormSchemes/marcgt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MARC genre terms",
   :madsrdf/code "marcgt",
   :madsrdf/editorialNote "https://id.loc.gov/vocabulary/marcgt.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/marcgt,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://id.loc.gov/vocabulary/marcgt.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "marcgt",
   :skos/prefLabel "MARC genre terms"})

(def marcsmd
  "MARC specific material form term list"
  {:db/ident :loc.genreFormSchemes/marcsmd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MARC specific material form term list",
   :madsrdf/code "marcsmd",
   :madsrdf/editorialNote
   "https://www.loc.gov/standards/valuelist/marcsmd.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/marcsmd,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.loc.gov/standards/valuelist/marcsmd.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "marcsmd",
   :skos/prefLabel "MARC specific material form term list"})

(def migfg
  "Moving image genre-form guide"
  {:db/ident :loc.genreFormSchemes/migfg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Moving image genre-form guide",
   :madsrdf/code "migfg",
   :madsrdf/editorialNote "https://www.loc.gov/rr/mopic/migintro.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/migfg,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.loc.gov/rr/mopic/migintro.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "migfg",
   :skos/prefLabel "Moving image genre-form guide"})

(def mim
  "Moving image materials: genre terms"
  {:db/ident :loc.genreFormSchemes/mim,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Moving image materials: genre terms",
   :madsrdf/code "mim",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/mim,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "mim",
   :skos/prefLabel "Moving image materials: genre terms"})

(def mts
  "Metatietosanasto"
  {:db/ident :loc.genreFormSchemes/mts,
   :madsrdf/authoritativeLabel "Metatietosanasto",
   :madsrdf/code "mts",
   :madsrdf/editorialNote "http://finto.fi/mts/fi/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/editorial "http://finto.fi/mts/fi/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "mts",
   :skos/prefLabel "Metatietosanasto"})

(def muzeukv
  "MuzeVideo UK DVD and UMD film genre classification"
  {:db/ident :loc.genreFormSchemes/muzeukv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "MuzeVideo UK DVD and UMD film genre classification",
   :madsrdf/code "muzeukv",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/muzeukv,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "muzeukv",
   :skos/prefLabel "MuzeVideo UK DVD and UMD film genre classification"})

(def nbdbgf
  "NBD Biblion Genres Fictie"
  {:db/ident :loc.genreFormSchemes/nbdbgf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NBD Biblion Genres Fictie",
   :madsrdf/code "nbdbgf",
   :madsrdf/editorialNote
   "http://www.nbdbiblion.nl/downloads/overzicht-genres-fictie",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/nbdbgf,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.nbdbiblion.nl/downloads/overzicht-genres-fictie",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "nbdbgf",
   :skos/prefLabel "NBD Biblion Genres Fictie"})

(def ncrbs
  "Nippon Cataloging Rules (2018 ed.) broadcast standard"
  {:db/ident :loc.genreFormSchemes/ncrbs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Nippon Cataloging Rules (2018 ed.) broadcast standard",
   :madsrdf/code "ncrbs",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrbs,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrbs",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) broadcast standard"})

(def ncrcarrier
  "Nippon Cataloging Rules (2018 ed.) carrier types"
  {:db/ident :loc.genreFormSchemes/ncrcarrier,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Nippon Cataloging Rules (2018 ed.) carrier types",
   :madsrdf/code "ncrcarrier",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrcarrier,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrcarrier",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) carrier types"})

(def ncrcontent
  "Nippon Cataloging Rules (2018 ed.) content types"
  {:db/ident :loc.genreFormSchemes/ncrcontent,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Nippon Cataloging Rules (2018 ed.) content types",
   :madsrdf/code "ncrcontent",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_05_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrcontent,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_05_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrcontent",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) content types"})

(def ncrcpc
  "Nippon Cataloging Rules (2018 ed.) configuration of playback channels"
  {:db/ident :loc.genreFormSchemes/ncrcpc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Nippon Cataloging Rules (2018 ed.) configuration of playback channels",
   :madsrdf/code "ncrcpc",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrcpc,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrcpc",
   :skos/prefLabel
   "Nippon Cataloging Rules (2018 ed.) configuration of playback channels"})

(def ncrfs
  "Nippon Cataloging Rules (2018 ed.) font size"
  {:db/ident :loc.genreFormSchemes/ncrfs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nippon Cataloging Rules (2018 ed.) font size",
   :madsrdf/code "ncrfs",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrfs,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrfs",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) font size"})

(def ncrft
  "Nippon Cataloging Rules (2018 ed.) file type"
  {:db/ident :loc.genreFormSchemes/ncrft,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nippon Cataloging Rules (2018 ed.) file type",
   :madsrdf/code "ncrft",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrft,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrft",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) file type"})

(def ncrmat
  "Nippon Cataloging Rules (2018 ed.) material"
  {:db/ident :loc.genreFormSchemes/ncrmat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nippon Cataloging Rules (2018 ed.) material",
   :madsrdf/code "ncrmat",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrmat,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrmat",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) material"})

(def ncrmedia
  "Nippon Cataloging Rules (2018 ed.) media types"
  {:db/ident :loc.genreFormSchemes/ncrmedia,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nippon Cataloging Rules (2018 ed.) media types",
   :madsrdf/code "ncrmedia",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrmedia,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrmedia",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) media types"})

(def ncrpm
  "Nippon Cataloging Rules (2018 ed.) production method"
  {:db/ident :loc.genreFormSchemes/ncrpm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Nippon Cataloging Rules (2018 ed.) production method",
   :madsrdf/code "ncrpm",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrpm,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrpm",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) production method"})

(def ncrpo
  "Nippon Cataloging Rules (2018 ed.) polarity"
  {:db/ident :loc.genreFormSchemes/ncrpo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nippon Cataloging Rules (2018 ed.) polarity",
   :madsrdf/code "ncrpo",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrpo,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrpo",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) polarity"})

(def ncrrm
  "Nippon Cataloging Rules (2018 ed.) recording medium"
  {:db/ident :loc.genreFormSchemes/ncrrm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Nippon Cataloging Rules (2018 ed.) recording medium",
   :madsrdf/code "ncrrm",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrrm,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrrm",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) recording medium"})

(def ncrtr
  "Nippon Cataloging Rules (2018 ed.) type of recording"
  {:db/ident :loc.genreFormSchemes/ncrtr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Nippon Cataloging Rules (2018 ed.) type of recording",
   :madsrdf/code "ncrtr",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrtr,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrtr",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) type of recording"})

(def ncrvf
  "Nippon Cataloging Rules (2018 ed.) video format"
  {:db/ident :loc.genreFormSchemes/ncrvf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Nippon Cataloging Rules (2018 ed.) video format",
   :madsrdf/code "ncrvf",
   :madsrdf/editorialNote
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ncrvf,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://www.jla.or.jp/Portals/0/data/iinkai/mokuroku/ncr2018/ncr2018_02_14-33_201812.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ncrvf",
   :skos/prefLabel "Nippon Cataloging Rules (2018 ed.) video format"})

(def ndlgft
  "National Diet Library in Japan genre/form terms for library materials"
  {:db/ident :loc.genreFormSchemes/ndlgft,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Diet Library in Japan genre/form terms for library materials",
   :madsrdf/code "ndlgft",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ndlgft,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ndlgft",
   :skos/prefLabel
   "National Diet Library in Japan genre/form terms for library materials"})

(def ngl
  "Newspaper genre list"
  {:db/ident :loc.genreFormSchemes/ngl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Newspaper genre list",
   :madsrdf/code "ngl",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ngl,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ngl",
   :skos/prefLabel "Newspaper genre list"})

(def nimafc
  "NIMA form codes"
  {:db/ident :loc.genreFormSchemes/nimafc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NIMA form codes",
   :madsrdf/code "nimafc",
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "National Imagery and Mapping Agency form codes",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "National Imagery and Mapping Agency form codes",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/nimafc,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "nimafc",
   :skos/prefLabel "NIMA form codes",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "National Imagery and Mapping Agency form codes"}})

(def nlggf
  "National Library of Greece genre/form for library materials"
  {:db/ident :loc.genreFormSchemes/nlggf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-06-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-06-22T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Library of Greece genre/form for library materials",
   :madsrdf/code "nlggf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-06-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-06-22T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/nlggf,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "nlggf",
   :skos/prefLabel
   "National Library of Greece genre/form for library materials"})

(def nmc
  "Revised nomenclature for museum cataloging: a revised and expanded version of Robert C. Chenhall's system for classifying man-made objects"
  {:db/ident :loc.genreFormSchemes/nmc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Revised nomenclature for museum cataloging: a revised and expanded version of Robert C. Chenhall's system for classifying man-made objects",
   :madsrdf/code "nmc",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/nmc,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "nmc",
   :skos/prefLabel
   "Revised nomenclature for museum cataloging: a revised and expanded version of Robert C. Chenhall's system for classifying man-made objects"})

(def ntsf
  "Norsk tesaurus for sjanger og form"
  {:db/ident :loc.genreFormSchemes/ntsf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Norsk tesaurus for sjanger og form",
   :madsrdf/code "ntsf",
   :madsrdf/editorialNote
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/ntsf,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://bibliotekutvikling.no/kunnskapsorganisering/kunnskapsorganisering/vokabularer-utkast/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "ntsf",
   :skos/prefLabel "Norsk tesaurus for sjanger og form"})

(def nzcoh
  "New Zealand Choral and Orchestral hire form and genre terms"
  {:db/ident :loc.genreFormSchemes/nzcoh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "New Zealand Choral and Orchestral hire form and genre terms",
   :madsrdf/code "nzcoh",
   :madsrdf/editorialNote
   "http://natlib.govt.nz/collections/choral-and-orchestral-music-hire-service",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/nzcoh,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "http://natlib.govt.nz/collections/choral-and-orchestral-music-hire-service",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "nzcoh",
   :skos/prefLabel
   "New Zealand Choral and Orchestral hire form and genre terms"})

(def olacvggt
  "OLAC Video Game Genre Terms"
  {:db/ident :loc.genreFormSchemes/olacvggt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "OLAC Video Game Genre Terms",
   :madsrdf/code "olacvggt",
   :madsrdf/editorialNote "https://www.olacinc.org/olac-video-game-vocabulary",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/olacvggt,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.olacinc.org/olac-video-game-vocabulary",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "olacvggt",
   :skos/prefLabel "OLAC Video Game Genre Terms"})

(def proysen
  "Prøysen: emneord for Prøysen-bibliografien"
  {:db/ident :loc.genreFormSchemes/proysen,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Prøysen: emneord for Prøysen-bibliografien",
   :madsrdf/code "proysen",
   :madsrdf/editorialNote "http://www.nb.no/baser/proysen/emneord.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/proysen,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/proysen,
     :rdf/type :cs/ChangeSet}],
   :skos/editorial "http://www.nb.no/baser/proysen/emneord.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "proysen",
   :skos/prefLabel "Prøysen: emneord for Prøysen-bibliografien"})

(def radfg
  "Radio form / genre terms guide"
  {:db/ident :loc.genreFormSchemes/radfg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Radio form / genre terms guide",
   :madsrdf/code "radfg",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/radfg,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "radfg",
   :skos/prefLabel "Radio form / genre terms guide"})

(def rbbin
  "Binding terms: a thesaurus for use in rare book and special collections cataloguing"
  {:db/ident :loc.genreFormSchemes/rbbin,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel
   "Binding terms: a thesaurus for use in rare book and special collections cataloguing",
   :madsrdf/code "rbbin",
   :madsrdf/editorialNote
   "https://rbms.info/vocabularies/binding/alphabetical_list.htm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :madsrdf/useInstead :loc.genreFormSchemes/rbmscv,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/genreFormSchemes/rbmscv"],
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbbin,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbbin,
     :rdf/type :cs/ChangeSet}],
   :skos/editorial
   "https://rbms.info/vocabularies/binding/alphabetical_list.htm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rbbin",
   :skos/prefLabel
   "Binding terms: a thesaurus for use in rare book and special collections cataloguing"})

(def rbgenr
  "Genre terms: a thesaurus for use in rare book and special collections cataloguing"
  {:db/ident :loc.genreFormSchemes/rbgenr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Genre terms: a thesaurus for use in rare book and special collections cataloguing",
   :madsrdf/code "rbgenr",
   :madsrdf/editorialNote
   "https://rbms.info/vocabularies/genre/alphabetical_list.htm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :madsrdf/useInstead :loc.genreFormSchemes/rbmscv,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/genreFormSchemes/rbmscv"],
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbgenr,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbgenr,
     :rdf/type :cs/ChangeSet}],
   :skos/editorial "https://rbms.info/vocabularies/genre/alphabetical_list.htm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rbgenr",
   :skos/prefLabel
   "Genre terms: a thesaurus for use in rare book and special collections cataloguing"})

(def rbmscv
  "RBMS Controlled Vocabularies"
  {:db/ident :loc.genreFormSchemes/rbmscv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RBMS Controlled Vocabularies",
   :madsrdf/code "rbmscv",
   :madsrdf/editorialNote "https://rbms.info/vocabularies/index.shtml",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :madsrdf/useFor [:loc.genreFormSchemes/rbbin
                    :loc.genreFormSchemes/rbpri
                    :loc.genreFormSchemes/rbprov
                    :loc.genreFormSchemes/rbpap
                    :loc.genreFormSchemes/rbgenr
                    :loc.genreFormSchemes/rbpup
                    :loc.genreFormSchemes/rbtyp],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rbmscv,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://rbms.info/vocabularies/index.shtml",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rbmscv",
   :skos/prefLabel "RBMS Controlled Vocabularies"})

(def rbpap
  "Paper terms: a thesaurus for use in rare book and special collections cataloging"
  {:db/ident :loc.genreFormSchemes/rbpap,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel
   "Paper terms: a thesaurus for use in rare book and special collections cataloging",
   :madsrdf/code "rbpap",
   :madsrdf/editorialNote
   "https://rbms.info/vocabularies/paper/alphabetical_list.htm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :madsrdf/useInstead :loc.genreFormSchemes/rbmscv,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/genreFormSchemes/rbmscv"],
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbpap,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbpap,
     :rdf/type :cs/ChangeSet}],
   :skos/editorial "https://rbms.info/vocabularies/paper/alphabetical_list.htm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rbpap",
   :skos/prefLabel
   "Paper terms: a thesaurus for use in rare book and special collections cataloging"})

(def rbpri
  "Printing & publishing evidence: a thesaurus for use in rare book and special collections cataloging"
  {:db/ident :loc.genreFormSchemes/rbpri,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Printing & publishing evidence: a thesaurus for use in rare book and special collections cataloging",
   :madsrdf/code "rbpri",
   :madsrdf/editorialNote
   "https://rbms.info/vocabularies/printing-publishing/alphabetical_list.htm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :madsrdf/useInstead :loc.genreFormSchemes/rbmscv,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/genreFormSchemes/rbmscv"],
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbpri,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbpri,
     :rdf/type :cs/ChangeSet}],
   :skos/editorial
   "https://rbms.info/vocabularies/printing-publishing/alphabetical_list.htm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rbpri",
   :skos/prefLabel
   "Printing & publishing evidence: a thesaurus for use in rare book and special collections cataloging"})

(def rbprov
  "Provenance evidence: a thesaurus for use in rare book and special collections cataloging"
  {:db/ident :loc.genreFormSchemes/rbprov,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel
   "Provenance evidence: a thesaurus for use in rare book and special collections cataloging",
   :madsrdf/code "rbprov",
   :madsrdf/editorialNote
   "https://rbms.info/vocabularies/provenance/alphabetical_list.htm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :madsrdf/useInstead :loc.genreFormSchemes/rbmscv,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/genreFormSchemes/rbmscv"],
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbprov,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbprov,
     :rdf/type :cs/ChangeSet}],
   :skos/editorial
   "https://rbms.info/vocabularies/provenance/alphabetical_list.htm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rbprov",
   :skos/prefLabel
   "Provenance evidence: a thesaurus for use in rare book and special collections cataloging"})

(def rbpub
  "Printing and publishing evidence: a thesaurus for use in rare book and special collections cataloging"
  {:db/ident :loc.genreFormSchemes/rbpub,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel
   "Printing and publishing evidence: a thesaurus for use in rare book and special collections cataloging",
   :madsrdf/code "rbpub",
   :madsrdf/editorialNote
   "https://rbms.info/vocabularies/printing-publishing/alphabetical_list.htm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :madsrdf/useInstead :loc.genreFormSchemes/rbmscv,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/genreFormSchemes/rbmscv"],
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbpub,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbpub,
     :rdf/type :cs/ChangeSet}],
   :skos/editorial
   "https://rbms.info/vocabularies/printing-publishing/alphabetical_list.htm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rbpub",
   :skos/prefLabel
   "Printing and publishing evidence: a thesaurus for use in rare book and special collections cataloging"})

(def rbtyp
  "Type evidence: a thesaurus for use in rare book and special collections cataloging"
  {:db/ident :loc.genreFormSchemes/rbtyp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel
   "Type evidence: a thesaurus for use in rare book and special collections cataloging",
   :madsrdf/code "rbtyp",
   :madsrdf/editorialNote
   "https://rbms.info/vocabularies/type/alphabetical_list.htm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :madsrdf/useInstead :loc.genreFormSchemes/rbmscv,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/genreFormSchemes/rbmscv"],
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbtyp,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
     :cs/subjectOfChange :loc.genreFormSchemes/rbtyp,
     :rdf/type :cs/ChangeSet}],
   :skos/editorial "https://rbms.info/vocabularies/type/alphabetical_list.htm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rbtyp",
   :skos/prefLabel
   "Type evidence: a thesaurus for use in rare book and special collections cataloging"})

(def rda
  "Published by Association of College and Research Libraries ALA in Chicago"
  {:db/ident :loc.genreFormSchemes/rda,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Resource description and access",
   :madsrdf/code "rda",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Association of College and Research Libraries ALA in Chicago"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-09-27T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-09-27T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rda,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Association of College and Research Libraries ALA in Chicago"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rda",
   :skos/prefLabel "Resource description and access"})

(def rdaabf
  "RDA bibliographic format"
  {:db/ident :loc.genreFormSchemes/rdaabf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA bibliographic format",
   :madsrdf/code "rdaabf",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/bookFormat/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdaabf,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/bookFormat/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdaabf",
   :skos/prefLabel "RDA bibliographic format"})

(def rdaar
  "RDA aspect ratio designation"
  {:db/ident :loc.genreFormSchemes/rdaar,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA aspect ratio designation",
   :madsrdf/code "rdaar",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/AspectRatio/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdaar,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/AspectRatio/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdaar",
   :skos/prefLabel "RDA aspect ratio designation"})

(def rdabs
  "RDA broadcast standard"
  {:db/ident :loc.genreFormSchemes/rdabs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA broadcast standard",
   :madsrdf/code "rdabs",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/broadcastStand/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdabs,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/broadcastStand/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdabs",
   :skos/prefLabel "RDA broadcast standard"})

(def rdacarrier
  "Term and code list for RDA carrier types"
  {:db/ident :loc.genreFormSchemes/rdacarrier,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Term and code list for RDA carrier types",
   :madsrdf/code "rdacarrier",
   :madsrdf/editorialNote
   "https://www.loc.gov/standards/valuelist/rdacarrier.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdacarrier,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.loc.gov/standards/valuelist/rdacarrier.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdacarrier",
   :skos/prefLabel "Term and code list for RDA carrier types"})

(def rdacc
  "RDA colour content"
  {:db/ident :loc.genreFormSchemes/rdacc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA colour content",
   :madsrdf/code "rdacc",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/RDAColourContent/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdacc,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDAColourContent/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdacc",
   :skos/prefLabel "RDA colour content"})

(def rdaco
  "RDA content type"
  {:db/ident :loc.genreFormSchemes/rdaco,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA content type",
   :madsrdf/code "rdaco",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/RDAContentType/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdaco,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDAContentType/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdaco",
   :skos/prefLabel "RDA content type"})

(def rdacontent
  "Term and code list for RDA content types"
  {:db/ident :loc.genreFormSchemes/rdacontent,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Term and code list for RDA content types",
   :madsrdf/code "rdacontent",
   :madsrdf/editorialNote
   "https://www.loc.gov/standards/valuelist/rdacontent.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdacontent,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.loc.gov/standards/valuelist/rdacontent.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdacontent",
   :skos/prefLabel "Term and code list for RDA content types"})

(def rdacpc
  "RDA configuration of playback channels"
  {:db/ident :loc.genreFormSchemes/rdacpc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA configuration of playback channels",
   :madsrdf/code "rdacpc",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/configPlayback/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdacpc,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/configPlayback/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdacpc",
   :skos/prefLabel "RDA configuration of playback channels"})

(def rdact
  "RDA carrier type"
  {:db/ident :loc.genreFormSchemes/rdact,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA carrier type",
   :madsrdf/code "rdact",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/RDACarrierType/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdact,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDACarrierType/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdact",
   :skos/prefLabel "RDA carrier type"})

(def rdaep
  "RDA extention plan"
  {:db/ident :loc.genreFormSchemes/rdaep,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA extention plan",
   :madsrdf/code "rdaep",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/RDAExtensionPlan/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdaep,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDAExtensionPlan/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdaep",
   :skos/prefLabel "RDA extention plan"})

(def rdafmn
  "RDA form of musical notation"
  {:db/ident :loc.genreFormSchemes/rdafmn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA form of musical notation",
   :madsrdf/code "rdafmn",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/MusNotation/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdafmn,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/MusNotation/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdafmn",
   :skos/prefLabel "RDA form of musical notation"})

(def rdafnm
  "RDA form of notated music"
  {:db/ident :loc.genreFormSchemes/rdafnm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA form of notated music",
   :madsrdf/code "rdafnm",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/formatNoteMus/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdafnm,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/formatNoteMus/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdafnm",
   :skos/prefLabel "RDA form of notated music"})

(def rdafs
  "RDA font size"
  {:db/ident :loc.genreFormSchemes/rdafs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA font size",
   :madsrdf/code "rdafs",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/fontSize/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdafs,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/fontSize/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdafs",
   :skos/prefLabel "RDA font size"})

(def rdaft
  "RDA file type"
  {:db/ident :loc.genreFormSchemes/rdaft,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA file type",
   :madsrdf/code "rdaft",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/fileType/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdaft,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/fileType/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdaft",
   :skos/prefLabel "RDA file type"})

(def rdagen
  "RDA generation"
  {:db/ident :loc.genreFormSchemes/rdagen,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA generation",
   :madsrdf/code "rdagen",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/RDAGeneration/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdagen,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDAGeneration/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdagen",
   :skos/prefLabel "RDA generation"})

(def rdagrp
  "RDA groove pitch of an analog cylinder"
  {:db/ident :loc.genreFormSchemes/rdagrp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA groove pitch of an analog cylinder",
   :madsrdf/code "rdagrp",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/groovePitch/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdagrp,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/groovePitch/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdagrp",
   :skos/prefLabel "RDA groove pitch of an analog cylinder"})

(def rdagw
  "RDA groove width of an analog disc"
  {:db/ident :loc.genreFormSchemes/rdagw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA groove width of an analog disc",
   :madsrdf/code "rdagw",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/grooveWidth/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdagw,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/grooveWidth/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdagw",
   :skos/prefLabel "RDA groove width of an analog disc"})

(def rdaill
  "RDA illustrative content"
  {:db/ident :loc.genreFormSchemes/rdaill,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA illustrative content",
   :madsrdf/code "rdaill",
   :madsrdf/editorialNote "https://www.rdaregistry.info/termList/IllusContent/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdaill,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.rdaregistry.info/termList/IllusContent/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdaill",
   :skos/prefLabel "RDA illustrative content"})

(def rdalay
  "RDA layout"
  {:db/ident :loc.genreFormSchemes/rdalay,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA layout",
   :madsrdf/code "rdalay",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/layout/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdalay,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/layout/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdalay",
   :skos/prefLabel "RDA layout"})

(def rdamat
  "RDA material"
  {:db/ident :loc.genreFormSchemes/rdamat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA material",
   :madsrdf/code "rdamat",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/RDAMaterial/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdamat,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDAMaterial/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdamat",
   :skos/prefLabel "RDA material"})

(def rdamedia
  "Term and code list for RDA media types"
  {:db/ident :loc.genreFormSchemes/rdamedia,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Term and code list for RDA media types",
   :madsrdf/code "rdamedia",
   :madsrdf/editorialNote
   "https://www.loc.gov/standards/valuelist/rdamedia.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdamedia,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.loc.gov/standards/valuelist/rdamedia.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdamedia",
   :skos/prefLabel "Term and code list for RDA media types"})

(def rdami
  "RDA mode of issuance"
  {:db/ident :loc.genreFormSchemes/rdami,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA mode of issuance",
   :madsrdf/code "rdami",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/ModeIssue/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdami,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/ModeIssue/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdami",
   :skos/prefLabel "RDA mode of issuance"})

(def rdamt
  "RDA media type"
  {:db/ident :loc.genreFormSchemes/rdamt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA media type",
   :madsrdf/code "rdamt",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/RDAMediaType/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdamt,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDAMediaType/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdamt",
   :skos/prefLabel "RDA media type"})

(def rdapf
  "RDA presentation format"
  {:db/ident :loc.genreFormSchemes/rdapf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA presentation format",
   :madsrdf/code "rdapf",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/presFormat/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdapf,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/presFormat/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdapf",
   :skos/prefLabel "RDA presentation format"})

(def rdapm
  "RDA production method"
  {:db/ident :loc.genreFormSchemes/rdapm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA production method",
   :madsrdf/code "rdapm",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/RDAproductionMethod/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdapm,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDAproductionMethod/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdapm",
   :skos/prefLabel "RDA production method"})

(def rdapo
  "RDA polarity"
  {:db/ident :loc.genreFormSchemes/rdapo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA polarity",
   :madsrdf/code "rdapo",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/RDAPolarity/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdapo,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDAPolarity/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdapo",
   :skos/prefLabel "RDA polarity"})

(def rdare
  "RDA regional encoding"
  {:db/ident :loc.genreFormSchemes/rdare,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA regional encoding",
   :madsrdf/code "rdare",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/RDARegionalEncoding/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdare,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDARegionalEncoding/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdare",
   :skos/prefLabel "RDA regional encoding"})

(def rdarm
  "RDA recording medium"
  {:db/ident :loc.genreFormSchemes/rdarm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA recording medium",
   :madsrdf/code "rdarm",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/recMedium/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdarm,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/recMedium/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdarm",
   :skos/prefLabel "RDA recording medium"})

(def rdarr
  "RDA reduction ratio designation"
  {:db/ident :loc.genreFormSchemes/rdarr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA reduction ratio designation",
   :madsrdf/code "rdarr",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/RDAReductionRatio/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdarr,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/RDAReductionRatio/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdarr",
   :skos/prefLabel "RDA reduction ratio designation"})

(def rdasco
  "RDA sound content"
  {:db/ident :loc.genreFormSchemes/rdasco,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA sound content",
   :madsrdf/code "rdasco",
   :madsrdf/editorialNote "https://www.rdaregistry.info/termList/soundCont/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdasco,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "https://www.rdaregistry.info/termList/soundCont/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdasco",
   :skos/prefLabel "RDA sound content"})

(def rdaspc
  "RDA special playback characteristic"
  {:db/ident :loc.genreFormSchemes/rdaspc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA special playback characteristic",
   :madsrdf/code "rdaspc",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/specPlayback/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdaspc,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/specPlayback/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdaspc",
   :skos/prefLabel "RDA special playback characteristic"})

(def rdatb
  "RDA type of binding"
  {:db/ident :loc.genreFormSchemes/rdatb,
   :madsrdf/authoritativeLabel "RDA type of binding",
   :madsrdf/code "rdatb",
   :madsrdf/editorialNote "http://rdaregistry.info/termList/RDATypeOfBinding/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/editorial "http://rdaregistry.info/termList/RDATypeOfBinding/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdatb",
   :skos/prefLabel "RDA type of binding"})

(def rdatc
  "RDA track configuration"
  {:db/ident :loc.genreFormSchemes/rdatc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA track configuration",
   :madsrdf/code "rdatc",
   :madsrdf/editorialNote "http://www.rdaregistry.info/termList/trackConfig/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdatc,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/trackConfig/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdatc",
   :skos/prefLabel "RDA track configuration"})

(def rdatr
  "RDA type of recording"
  {:db/ident :loc.genreFormSchemes/rdatr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA type of recording",
   :madsrdf/code "rdatr",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/typeRec/index.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdatr,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://www.rdaregistry.info/termList/typeRec/index.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdatr",
   :skos/prefLabel "RDA type of recording"})

(def rdavf
  "RDA video format"
  {:db/ident :loc.genreFormSchemes/rdavf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RDA video format",
   :madsrdf/code "rdavf",
   :madsrdf/editorialNote
   "http://www.rdaregistry.info/termList/videoFormat/index.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rdavf,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "http://www.rdaregistry.info/termList/videoFormat/index.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rdavf",
   :skos/prefLabel "RDA video format"})

(def reveal
  "REVEAL: fiction indexing and genre headings"
  {:db/ident :loc.genreFormSchemes/reveal,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "REVEAL: fiction indexing and genre headings",
   :madsrdf/code "reveal",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/reveal,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "reveal",
   :skos/prefLabel "REVEAL: fiction indexing and genre headings"})

(def rvmgf
  "Thésaurus des descripteurs de genre/forme de l'Université Laval"
  {:db/ident :loc.genreFormSchemes/rvmgf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thésaurus des descripteurs de genre/forme de l'Université Laval",
   :madsrdf/code "rvmgf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/rvmgf,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "rvmgf",
   :skos/prefLabel
   "Thésaurus des descripteurs de genre/forme de l'Université Laval"})

(def saogf
  "Svenska ämnesord - Genre/Form"
  {:db/ident :loc.genreFormSchemes/saogf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Svenska ämnesord - Genre/Form",
   :madsrdf/code "saogf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/saogf,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "saogf",
   :skos/prefLabel "Svenska ämnesord - Genre/Form"})

(def sgp
  "Svenska genrebeteckningar för periodika"
  {:db/ident :loc.genreFormSchemes/sgp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Svenska genrebeteckningar för periodika",
   :madsrdf/code "sgp",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/sgp,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "sgp",
   :skos/prefLabel "Svenska genrebeteckningar för periodika"})

(def slm
  "Suomalainen lajityyppi-ja muotosanasto"
  {:db/ident :loc.genreFormSchemes/slm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Suomalainen lajityyppi-ja muotosanasto",
   :madsrdf/code "slm",
   :madsrdf/editorialNote "http://finto.fi/slm/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/slm,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://finto.fi/slm/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "slm",
   :skos/prefLabel "Suomalainen lajityyppi-ja muotosanasto"})

(def tept
  "Thesaurus of eEphemera terms"
  {:db/ident :loc.genreFormSchemes/tept,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thesaurus of eEphemera terms",
   :madsrdf/code "tept",
   :madsrdf/editorialNote
   "http://blogs.reading.ac.uk/typography-at-reading/files/2014/07/Ephemera-Thesaurus.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/tept,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "http://blogs.reading.ac.uk/typography-at-reading/files/2014/07/Ephemera-Thesaurus.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "tept",
   :skos/prefLabel "Thesaurus of eEphemera terms"})

(def tgfbne
  "Términos de género/forma de la Biblioteca Nacional de España"
  {:db/ident :loc.genreFormSchemes/tgfbne,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Términos de género/forma de la Biblioteca Nacional de España",
   :madsrdf/code "tgfbne",
   :madsrdf/editorialNote
   "http://catalogo.bne.es/uhtbin/authoritybrowse.cgi?lang=en",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/tgfbne,
    :rdf/type :cs/ChangeSet},
   :skos/editorial "http://catalogo.bne.es/uhtbin/authoritybrowse.cgi?lang=en",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "tgfbne",
   :skos/prefLabel
   "Términos de género/forma de la Biblioteca Nacional de España"})

(def tgfc
  "Published by Biblioteca de Catalunya in Barcelona"
  {:db/ident :loc.genreFormSchemes/tgfc,
   :madsrdf/authoritativeLabel "Termes de gènere i forma en català",
   :madsrdf/code "tgfc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Biblioteca de Catalunya in Barcelona"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Biblioteca de Catalunya in Barcelona"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "tgfc",
   :skos/prefLabel "Termes de gènere i forma en català"})

(def vgmsgg
  "Video game metadata schema: controlled vocabulary for gameplay genre"
  {:db/ident :loc.genreFormSchemes/vgmsgg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Video game metadata schema: controlled vocabulary for gameplay genre",
   :madsrdf/code "vgmsgg",
   :madsrdf/editorialNote
   "https://cpb-us-e1.wpmucdn.com/sites.uw.edu/dist/2/3760/files/2019/09/VGMSVersion4.0_20180824.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 655 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.genreFormSchemes/collection_genreFormSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/genreFormSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.genreFormSchemes/vgmsgg,
    :rdf/type :cs/ChangeSet},
   :skos/editorial
   "https://cpb-us-e1.wpmucdn.com/sites.uw.edu/dist/2/3760/files/2019/09/VGMSVersion4.0_20180824.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 655 $2"},
   :skos/inScheme :loc.vocabulary/genreFormSchemes,
   :skos/notation "vgmsgg",
   :skos/prefLabel
   "Video game metadata schema: controlled vocabulary for gameplay genre"})

(def ^{:private true} genreFormSchemes
  "Genre/Form Schemes contains a list of genre/form schemes and assigns a URI to each scheme. The purpose of these properties is to permit users to associate controlled genre/form term with the appropriate scheme. The schemes include lists that contain the following types of information: content types that indicate the form of communication through which a work is expressed (cartographic dataset, notated music, or text); media types that specify the general type of intermediation device required to view, play, run, etc., the content of a resource; carrier types that specify the format of the storage medium and housing of a resource (audiocassette, microfiche, or online resource); genre types designate the style or technique of the intellectual content of textual materials or, for graphic materials, aspects such as vantage point, intended purpose, characteristics of the creator, publication status, or method of representation (biographies, catechisms, essays, hymns, or reviews); form and physical characteristic types designate historically and functionally specific kinds of materials distinguished by their physical character, the subject of their intellectual content, or the order of information within them (daybooks, diaries, directories, journals, memoranda, questionnaires, syllabi, or time sheets). The purpose of this list is to identify the vocabulary used in records. Only sources that are specific for genre/form are listed here."
  {:db/ident :loc.vocabulary/genreFormSchemes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Genre/Form Schemes contains a list of genre/form schemes and assigns a URI to each scheme. The purpose of these properties is to permit users to associate controlled genre/form term with the appropriate scheme. The schemes include lists that contain the following types of information: content types that indicate the form of communication through which a work is expressed (cartographic dataset, notated music, or text); media types that specify the general type of intermediation device required to view, play, run, etc., the content of a resource; carrier types that specify the format of the storage medium and housing of a resource (audiocassette, microfiche, or online resource); genre types designate the style or technique of the intellectual content of textual materials or, for graphic materials, aspects such as vantage point, intended purpose, characteristics of the creator, publication status, or method of representation (biographies, catechisms, essays, hymns, or reviews); form and physical characteristic types designate historically and functionally specific kinds of materials distinguished by their physical character, the subject of their intellectual content, or the order of information within them (daybooks, diaries, directories, journals, memoranda, questionnaires, syllabi, or time sheets). The purpose of this list is to identify the vocabulary used in records. Only sources that are specific for genre/form are listed here."},
   :madsrdf/hasMADSSchemeMember [:loc.genreFormSchemes/ntsf
                                 :loc.genreFormSchemes/gmd
                                 :loc.genreFormSchemes/isbdmedia
                                 :loc.genreFormSchemes/dct
                                 :loc.genreFormSchemes/nmc
                                 :loc.genreFormSchemes/ncrpm
                                 :loc.genreFormSchemes/amg
                                 :loc.genreFormSchemes/ncrbs
                                 :loc.genreFormSchemes/rdagen
                                 :loc.genreFormSchemes/cjh
                                 :loc.genreFormSchemes/tept
                                 :loc.genreFormSchemes/rdamt
                                 :loc.genreFormSchemes/gmgpc
                                 :loc.genreFormSchemes/rbgenr
                                 :loc.genreFormSchemes/marcgt
                                 :loc.genreFormSchemes/rdacc
                                 :loc.genreFormSchemes/gsso
                                 :loc.genreFormSchemes/ncrmedia
                                 :loc.genreFormSchemes/alett
                                 :loc.genreFormSchemes/mim
                                 :loc.genreFormSchemes/rdaep
                                 :loc.genreFormSchemes/lcgft
                                 :loc.genreFormSchemes/rdatc
                                 :loc.genreFormSchemes/reveal
                                 :loc.genreFormSchemes/olacvggt
                                 :loc.genreFormSchemes/cbk
                                 :loc.genreFormSchemes/rdapo
                                 :loc.genreFormSchemes/rdatb
                                 :loc.genreFormSchemes/marcsmd
                                 :loc.genreFormSchemes/rdapf
                                 :loc.genreFormSchemes/rdaft
                                 :loc.genreFormSchemes/rdagw
                                 :loc.genreFormSchemes/fgtpcm
                                 :loc.genreFormSchemes/lobt
                                 :loc.genreFormSchemes/rdalay
                                 :loc.genreFormSchemes/rdatr
                                 :loc.genreFormSchemes/nzcoh
                                 :loc.genreFormSchemes/rdami
                                 :loc.genreFormSchemes/rbtyp
                                 :loc.genreFormSchemes/muzeukv
                                 :loc.genreFormSchemes/rdare
                                 :loc.genreFormSchemes/rdarm
                                 :loc.genreFormSchemes/slm
                                 :loc.genreFormSchemes/fbg
                                 :loc.genreFormSchemes/gnd-carrier
                                 :loc.genreFormSchemes/ncrft
                                 :loc.genreFormSchemes/nlggf
                                 :loc.genreFormSchemes/ncrcontent
                                 :loc.genreFormSchemes/ncrcpc
                                 :loc.genreFormSchemes/rdacontent
                                 :loc.genreFormSchemes/rbpub
                                 :loc.genreFormSchemes/rdasco
                                 :loc.genreFormSchemes/rdact
                                 :loc.genreFormSchemes/rdacarrier
                                 :loc.genreFormSchemes/rdavf
                                 :loc.genreFormSchemes/estc
                                 :loc.genreFormSchemes/proysen
                                 :loc.genreFormSchemes/rdarr
                                 :loc.genreFormSchemes/barngf
                                 :loc.genreFormSchemes/ngl
                                 :loc.genreFormSchemes/migfg
                                 :loc.genreFormSchemes/nbdbgf
                                 :loc.genreFormSchemes/rdapm
                                 :loc.genreFormSchemes/rdaspc
                                 :loc.genreFormSchemes/ndlgft
                                 :loc.genreFormSchemes/ncrcarrier
                                 :loc.genreFormSchemes/ncrmat
                                 :loc.genreFormSchemes/rda
                                 :loc.genreFormSchemes/marcform
                                 :loc.genreFormSchemes/rdaabf
                                 :loc.genreFormSchemes/rbmscv
                                 :loc.genreFormSchemes/sgp
                                 :loc.genreFormSchemes/saogf
                                 :loc.genreFormSchemes/rdafs
                                 :loc.genreFormSchemes/tgfbne
                                 :loc.genreFormSchemes/mts
                                 :loc.genreFormSchemes/tgfc
                                 :loc.genreFormSchemes/ncrfs
                                 :loc.genreFormSchemes/rbprov
                                 :loc.genreFormSchemes/gtmm
                                 :loc.genreFormSchemes/rdafnm
                                 :loc.genreFormSchemes/rbbin
                                 :loc.genreFormSchemes/ncrpo
                                 :loc.genreFormSchemes/rvmgf
                                 :loc.genreFormSchemes/gsafd
                                 :loc.genreFormSchemes/rdafmn
                                 :loc.genreFormSchemes/gnd-content
                                 :loc.genreFormSchemes/rbpap
                                 :loc.genreFormSchemes/marccategory
                                 :loc.genreFormSchemes/ncrtr
                                 :loc.genreFormSchemes/gnd
                                 :loc.genreFormSchemes/rdabs
                                 :loc.genreFormSchemes/rdagrp
                                 :loc.genreFormSchemes/ncrrm
                                 :loc.genreFormSchemes/vgmsgg
                                 :loc.genreFormSchemes/nimafc
                                 :loc.genreFormSchemes/rdaco
                                 :loc.genreFormSchemes/gtlm
                                 :loc.genreFormSchemes/rbpri
                                 :loc.genreFormSchemes/isbdcontent
                                 :loc.genreFormSchemes/rdamedia
                                 :loc.genreFormSchemes/rdaill
                                 :loc.genreFormSchemes/rdamat
                                 :loc.genreFormSchemes/radfg
                                 :loc.genreFormSchemes/ftamc
                                 :loc.genreFormSchemes/ncrvf
                                 :loc.genreFormSchemes/bgtchm
                                 :loc.genreFormSchemes/rdacpc
                                 :loc.genreFormSchemes/gatbeg
                                 :loc.genreFormSchemes/rdaar
                                 :loc.genreFormSchemes/bdrc
                                 :loc.genreFormSchemes/gttg
                                 :loc.genreFormSchemes/gnd-music],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Genre Form Schemes"},
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-02T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-02T00:00:00/dlc",
    :cs/subjectOfChange :loc.vocabulary/genreFormSchemes,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Genre/Form Schemes contains a list of genre/form schemes and assigns a URI to each scheme. The purpose of these properties is to permit users to associate controlled genre/form term with the appropriate scheme. The schemes include lists that contain the following types of information: content types that indicate the form of communication through which a work is expressed (cartographic dataset, notated music, or text); media types that specify the general type of intermediation device required to view, play, run, etc., the content of a resource; carrier types that specify the format of the storage medium and housing of a resource (audiocassette, microfiche, or online resource); genre types designate the style or technique of the intellectual content of textual materials or, for graphic materials, aspects such as vantage point, intended purpose, characteristics of the creator, publication status, or method of representation (biographies, catechisms, essays, hymns, or reviews); form and physical characteristic types designate historically and functionally specific kinds of materials distinguished by their physical character, the subject of their intellectual content, or the order of information within them (daybooks, diaries, directories, journals, memoranda, questionnaires, syllabi, or time sheets). The purpose of this list is to identify the vocabulary used in records. Only sources that are specific for genre/form are listed here."}})