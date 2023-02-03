(ns net.wikipunk.rdf.loc.mnotetype
  "http://id.loc.gov/vocabulary/mnotetype/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mnotetype.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mnotetype"
                       "http://id.loc.gov/vocabulary/mnotetype/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mnotetype",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mnotetype/"}
  (:refer-clojure :exclude [binding]))

(def accmat
  "Physical description of materials that accompany the resource being described"
  {:db/ident :loc.mnotetype/accmat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Accompanying material",
   :madsrdf/code "accmat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Physical description of materials that accompany the resource being described"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 300 $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/accmat,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Physical description of materials that accompany the resource being described"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 300 $e"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "accmat",
   :skos/prefLabel "Accompanying material"})

(def action
  "Information about processing, reference, and preservation actions"
  {:db/ident :loc.mnotetype/action,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Action",
   :madsrdf/code "action",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Information about processing, reference, and preservation actions"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 583"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/action,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information about processing, reference, and preservation actions"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 583"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "action",
   :skos/prefLabel "Action"})

(def addphys
  "Information concerning a different physical format in which the described resource is available"
  {:db/ident :loc.mnotetype/addphys,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Additional physical form",
   :madsrdf/code "addphys",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Information concerning a different physical format in which the described resource is available"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 530"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/addphys,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information concerning a different physical format in which the described resource is available"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 530"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "addphys",
   :skos/prefLabel "Additional physical form"})

(def adminhist
  "Historical and administrative information relating to an organization"
  {:db/ident :loc.mnotetype/adminhist,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Administrative history",
   :madsrdf/code "adminhist",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Historical and administrative information relating to an organization"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 545, Ind1=1"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/adminhist,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Historical and administrative information relating to an organization"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 545, Ind1=1"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "adminhist",
   :skos/prefLabel "Administrative history"})

(def award
  "Awards associated with the described resource"
  {:db/ident :loc.mnotetype/award,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2023-01-10T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2023-01-10T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Award",
   :madsrdf/code "award",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Awards associated with the described resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 586"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2023-01-10T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2023-01-10T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/award,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Awards associated with the described resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 586"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "award",
   :skos/prefLabel "Award"})

(def biblio
  "Information on the presence of one or more bibliographies, discographies, filmographies, and/or other bibliographic references in a described item or in its accompanying material"
  {:db/ident :loc.mnotetype/biblio,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliography",
   :madsrdf/code "biblio",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Information on the presence of one or more bibliographies, discographies, filmographies, and/or other bibliographic references in a described item or in its accompanying material"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 504"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/biblio,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information on the presence of one or more bibliographies, discographies, filmographies, and/or other bibliographic references in a described item or in its accompanying material"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 504"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "biblio",
   :skos/prefLabel "Bibliography"})

(def binding
  "Binding information intended primarily for use with antiquarian materials, rare books and other special collections"
  {:db/ident :loc.mnotetype/binding,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Binding",
   :madsrdf/code "binding",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Binding information intended primarily for use with antiquarian materials, rare books and other special collections"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 563"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/binding,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Binding information intended primarily for use with antiquarian materials, rare books and other special collections"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 563"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "binding",
   :skos/prefLabel "Binding"})

(def biogdata
  "Biographical information about an individual"
  {:db/ident :loc.mnotetype/biogdata,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Biographical data",
   :madsrdf/code "biogdata",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Biographical information about an individual"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 545, Ind1=0"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/biogdata,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Biographical information about an individual"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 545, Ind1=0"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "biogdata",
   :skos/prefLabel "Biographical data"})

(def computer
  "Descriptor that characterizes the computer data file"
  {:db/ident :loc.mnotetype/computer,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Type of computer data",
   :madsrdf/code "computer",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Descriptor that characterizes the computer data file"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Computer file characteristics",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 256, 516"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Computer file characteristics",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/computer,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Descriptor that characterizes the computer data file"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 256, 516"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "computer",
   :skos/prefLabel "Type of computer data",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Computer file characteristics"}})

(def coverage
  "Holdings statements of continuing resources, both enumeration and chronology"
  {:db/ident :loc.mnotetype/coverage,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Coverage",
   :madsrdf/code "coverage",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Holdings statements of continuing resources, both enumeration and chronology"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 310, 321"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/coverage,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Holdings statements of continuing resources, both enumeration and chronology"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 310, 321"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "coverage",
   :skos/prefLabel "Coverage"})

(def datanf
  "Source in which information is not found related in some manner to the resource being described"
  {:db/ident :loc.mnotetype/datanf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Data not found",
   :madsrdf/code "datanf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Source in which information is not found related in some manner to the resource being described"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC auth: 675"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/datanf,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Source in which information is not found related in some manner to the resource being described"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC auth: 675"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "datanf",
   :skos/prefLabel "Data not found"})

(def datasource
  "Source in which information is found related in some manner to the resource being described"
  {:db/ident :loc.mnotetype/datasource,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Data source",
   :madsrdf/code "datasource",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Source in which information is found related in some manner to the resource being described"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC auth: 670"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/datasource,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Source in which information is found related in some manner to the resource being described"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC auth: 670"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "datasource",
   :skos/prefLabel "Data source"})

(def descsource
  "General and specific source of description notes that are especially of interest to other catalogers"
  {:db/ident :loc.mnotetype/descsource,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Description source",
   :madsrdf/code "descsource",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "General and specific source of description notes that are especially of interest to other catalogers"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 588"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/descsource,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "General and specific source of description notes that are especially of interest to other catalogers"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 588"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "descsource",
   :skos/prefLabel "Description source"})

(def exhibit
  "Exhibitions where the resource described has been shown"
  {:db/ident :loc.mnotetype/exhibit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Exhibition",
   :madsrdf/code "exhibit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Exhibitions where the resource described has been shown"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 585"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/exhibit,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Exhibitions where the resource described has been shown"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 585"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "exhibit",
   :skos/prefLabel "Exhibition"})

(def finding
  "Information identifying administrative and intellectual controls over the described materials and indicating the degree of control each provides"
  {:db/ident :loc.mnotetype/finding,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Finding aid",
   :madsrdf/code "finding",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Information identifying administrative and intellectual controls over the described materials and indicating the degree of control each provides"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 555, Ind1=0"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/finding,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information identifying administrative and intellectual controls over the described materials and indicating the degree of control each provides"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 555, Ind1=0"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "finding",
   :skos/prefLabel "Finding aid"})

(def freq
  "The intervals at which a resource is produced"
  {:db/ident :loc.mnotetype/freq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Frequency",
   :madsrdf/code "freq",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The intervals at which a resource is produced"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 310, 321"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/freq,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The intervals at which a resource is produced"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 310, 321"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "freq",
   :skos/prefLabel "Frequency"})

(def fundinfo
  "Contract, grant, and project numbers when the resource results from a funded project"
  {:db/ident :loc.mnotetype/fundinfo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-07-21T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-07-21T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Funding information",
   :madsrdf/code "fundinfo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Contract, grant, and project numbers when the resource results from a funded project"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 536"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-07-21T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-07-21T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/fundinfo,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Contract, grant, and project numbers when the resource results from a funded project"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 536"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "fundinfo",
   :skos/prefLabel "Funding information"})

(def index
  "Statement of volumes and/or dates covered by cumulative indexes of an item and a statement of location of these indexes"
  {:db/ident :loc.mnotetype/index,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Index",
   :madsrdf/code "index",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Statement of volumes and/or dates covered by cumulative indexes of an item and a statement of location of these indexes"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 555, Ind1=#"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/index,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Statement of volumes and/or dates covered by cumulative indexes of an item and a statement of location of these indexes"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 555, Ind1=#"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "index",
   :skos/prefLabel "Index"})

(def internal
  "Information about the resource to be conveyed with other catalogers"
  {:db/ident :loc.mnotetype/internal,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Internal",
   :madsrdf/code "internal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Information about the resource to be conveyed with other catalogers"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 955"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/internal,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information about the resource to be conveyed with other catalogers"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 955"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "internal",
   :skos/prefLabel "Internal"})

(def issuance
  "Irregularities and peculiarities in numbering or publishing patterns, report year coverage, revised editions, and/or issuance in parts"
  {:db/ident :loc.mnotetype/issuance,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Issuance information",
   :madsrdf/code "issuance",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Irregularities and peculiarities in numbering or publishing patterns, report year coverage, revised editions, and/or issuance in parts"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 515"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/issuance,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Irregularities and peculiarities in numbering or publishing patterns, report year coverage, revised editions, and/or issuance in parts"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 515"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "issuance",
   :skos/prefLabel "Issuance information"})

(def issuing
  "Current and former issuing bodies of a continuing resource"
  {:db/ident :loc.mnotetype/issuing,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Issuing body",
   :madsrdf/code "issuing",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Current and former issuing bodies of a continuing resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 550"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/issuing,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Current and former issuing bodies of a continuing resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 550"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "issuing",
   :skos/prefLabel "Issuing body"})

(def lang
  "Textual information on the language used to convey the content of the described resource"
  {:db/ident :loc.mnotetype/lang,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2022-09-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2022-09-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Language",
   :madsrdf/code "lang",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Textual information on the language used to convey the content of the described resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 546"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2022-09-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2022-09-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/lang,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Textual information on the language used to convey the content of the described resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 546"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "lang",
   :skos/prefLabel "Language"})

(def loc
  "Specific location of a citation or reference within the resource"
  {:db/ident :loc.mnotetype/loc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-07-12T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-07-12T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-07-21T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-07-21T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Location",
   :madsrdf/code "loc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Specific location of a citation or reference within the resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 510"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2021-07-21T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-07-21T00:00:00/dlc",
     :cs/subjectOfChange :loc.mnotetype/loc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2021-07-12T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-07-12T00:00:00/dlc",
     :cs/subjectOfChange :loc.mnotetype/loc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific location of a citation or reference within the resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 510"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "loc",
   :skos/prefLabel "Location"})

(def metaentry
  "Designation of successive entry, latest entry, or integrated entry cataloging conventions"
  {:db/ident :loc.mnotetype/metaentry,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2021-07-09T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2021-07-09T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Metadata entry convention",
   :madsrdf/code "metaentry",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Designation of successive entry, latest entry, or integrated entry cataloging conventions"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/34"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2021-07-09T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-07-09T00:00:00/dlc",
     :cs/subjectOfChange :loc.mnotetype/metaentry,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
     :cs/subjectOfChange :loc.mnotetype/metaentry,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Designation of successive entry, latest entry, or integrated entry cataloging conventions"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/34"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "metaentry",
   :skos/prefLabel "Metadata entry convention"})

(def number
  "Volume number, edition number, issue number, series of volume numbers, or other sequential designations according to the usage of the publisher"
  {:db/ident :loc.mnotetype/number,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Numbering",
   :madsrdf/code "number",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Volume number, edition number, issue number, series of volume numbers, or other sequential designations according to the usage of the publisher"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 362"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/number,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Volume number, edition number, issue number, series of volume numbers, or other sequential designations according to the usage of the publisher"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 362"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "number",
   :skos/prefLabel "Numbering"})

(def orig
  "Descriptive data for an original resources when its reproduction is described"
  {:db/ident :loc.mnotetype/orig,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Original version",
   :madsrdf/code "orig",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Descriptive data for an original resources when its reproduction is described"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 534"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/orig,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Descriptive data for an original resources when its reproduction is described"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 534"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "orig",
   :skos/prefLabel "Original version"})

(def physical
  "Physical characteristics of a resource such as illustrative content, playing speed, presence and kind of sound, presentation format, and others"
  {:db/ident :loc.mnotetype/physical,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Physical details",
   :madsrdf/code "physical",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Physical characteristics of a resource such as illustrative content, playing speed, presence and kind of sound, presentation format, and others"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 300 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/physical,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Physical characteristics of a resource such as illustrative content, playing speed, presence and kind of sound, presentation format, and others"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 300 $b"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "physical",
   :skos/prefLabel "Physical details"})

(def related
  "Relationship of the other materials or record citations to the resource being described"
  {:db/ident :loc.mnotetype/related,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Related material",
   :madsrdf/code "related",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Relationship of the other materials or record citations to the resource being described"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 544, 581"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/related,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relationship of the other materials or record citations to the resource being described"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 544, 581"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "related",
   :skos/prefLabel "Related material"})

(def report
  "Information on the type of report and the period covered by the report"
  {:db/ident :loc.mnotetype/report,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Report type",
   :madsrdf/code "report",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Information on the type of report and the period covered by the report"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 513"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/report,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information on the type of report and the period covered by the report"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 513"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "report",
   :skos/prefLabel "Report type"})

(def repro
  "Descriptive data for a reproduction of an original resource"
  {:db/ident :loc.mnotetype/repro,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Reproduction version",
   :madsrdf/code "repro",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Descriptive data for a reproduction of an original resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 533"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/repro,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Descriptive data for a reproduction of an original resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 533"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "repro",
   :skos/prefLabel "Reproduction version"})

(def source
  "Reference sources consulted to complete the description of a resource"
  {:db/ident :loc.mnotetype/source,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Source consulted",
   :madsrdf/code "source",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Reference sources consulted to complete the description of a resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 500"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/source,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Reference sources consulted to complete the description of a resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 500"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "source",
   :skos/prefLabel "Source consulted"})

(def with
  "Information indicating that more than one bibliographical work is contained in the physical item at the time of publishing, release, issue, or execution"
  {:db/ident :loc.mnotetype/with,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "With",
   :madsrdf/code "with",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Information indicating that more than one bibliographical work is contained in the physical item at the time of publishing, release, issue, or execution"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 501"},
   :madsrdf/isMemberOfMADSCollection :loc.mnotetype/collection_mnotetype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mnotetype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.mnotetype/with,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information indicating that more than one bibliographical work is contained in the physical item at the time of publishing, release, issue, or execution"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 501"},
   :skos/inScheme :loc.vocabulary/mnotetype,
   :skos/notation "with",
   :skos/prefLabel "With"})

(def ^{:private true} mnotetype
  "Codes and terms for note type fields"
  {:db/ident :loc.vocabulary/mnotetype,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Codes and terms for note type fields"},
   :madsrdf/hasMADSSchemeMember [:loc.mnotetype/binding
                                 :loc.mnotetype/adminhist
                                 :loc.mnotetype/orig
                                 :loc.mnotetype/exhibit
                                 :loc.mnotetype/fundinfo
                                 :loc.mnotetype/finding
                                 :loc.mnotetype/biogdata
                                 :loc.mnotetype/repro
                                 :loc.mnotetype/computer
                                 :loc.mnotetype/metaentry
                                 :loc.mnotetype/internal
                                 :loc.mnotetype/report
                                 :loc.mnotetype/addphys
                                 :loc.mnotetype/datanf
                                 :loc.mnotetype/action
                                 :loc.mnotetype/lang
                                 :loc.mnotetype/issuing
                                 :loc.mnotetype/related
                                 :loc.mnotetype/source
                                 :loc.mnotetype/with
                                 :loc.mnotetype/accmat
                                 :loc.mnotetype/physical
                                 :loc.mnotetype/award
                                 :loc.mnotetype/datasource
                                 :loc.mnotetype/descsource
                                 :loc.mnotetype/coverage
                                 :loc.mnotetype/freq
                                 :loc.mnotetype/loc
                                 :loc.mnotetype/number
                                 :loc.mnotetype/issuance
                                 :loc.mnotetype/index
                                 :loc.mnotetype/biblio],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Note Type"},
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-05-24T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-05-24T00:00:00/dlc",
    :cs/subjectOfChange :loc.vocabulary/mnotetype,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Codes and terms for note type fields"}})