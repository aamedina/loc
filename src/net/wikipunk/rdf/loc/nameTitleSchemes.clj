(ns net.wikipunk.rdf.loc.nameTitleSchemes
  "http://id.loc.gov/vocabulary/nameTitleSchemes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/nameTitleSchemes.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.nameTitleSchemes"
                       "http://id.loc.gov/vocabulary/nameTitleSchemes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.nameTitleSchemes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/nameTitleSchemes/"})

(def abne
  "Published by Biblioteca Nacional de España in Madrd"
  {:db/ident :loc.nameTitleSchemes/abne,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Autoridades de la Biblioteca Nacional de España",
   :madsrdf/code "abne",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Biblioteca Nacional de España in Madrd"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the Biblioteca Nacional de España",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Authority records of the Biblioteca Nacional de España",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/abne,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Biblioteca Nacional de España in Madrd"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "abne",
   :skos/prefLabel "Autoridades de la Biblioteca Nacional de España",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Authority records of the Biblioteca Nacional de España"}})

(def banqa
  "Published by Bibliothèque et Archives nationales du Québec"
  {:db/ident :loc.nameTitleSchemes/banqa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Fichier d'autorité local de Bibliothéque et Archives nationales du Québec",
   :madsrdf/code "banqa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bibliothèque et Archives nationales du Québec"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the Bibliothéque et Archives nationales du Québec ",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Authority records of the Bibliothéque et Archives nationales du Québec",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/banqa,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Bibliothèque et Archives nationales du Québec"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "banqa",
   :skos/prefLabel
   "Fichier d'autorité local de Bibliothéque et Archives nationales du Québec",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Authority records of the Bibliothéque et Archives nationales du Québec"}})

(def bibalex
  "Published by Bibliotheca Alexandrina in Alexandria, Egypt"
  {:db/ident :loc.nameTitleSchemes/bibalex,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Bibliotheca Alexandrina name and subject authority file",
   :madsrdf/code "bibalex",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bibliotheca Alexandrina in Alexandria, Egypt"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the Bibliotheca Alexandrina in Egypt",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Authority records of the Bibliotheca Alexandrina in Egypt",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/bibalex,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Bibliotheca Alexandrina in Alexandria, Egypt"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "bibalex",
   :skos/prefLabel "Bibliotheca Alexandrina name and subject authority file",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Authority records of the Bibliotheca Alexandrina in Egypt"}})

(def bibbi
  "Published by Biblioteksentralen in Oslo, Norway"
  {:db/ident :loc.nameTitleSchemes/bibbi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "BIBBI autoriteer",
   :madsrdf/code "bibbi",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Biblioteksentralen in Oslo, Norway"},
   :madsrdf/editorialNote "https://vokabular.bs.no/bibbi/en/",
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Authority records of the Biblioteksentralen in Norway",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Authority records of the Biblioteksentralen in Norway",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/bibbi,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Biblioteksentralen in Oslo, Norway"},
   :skos/editorial "https://vokabular.bs.no/bibbi/en/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "bibbi",
   :skos/prefLabel "BIBBI autoriteer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Authority records of the Biblioteksentralen in Norway"}})

(def bnfnaf
  "Published by Bibliothèque nationale de France in Paris"
  {:db/ident :loc.nameTitleSchemes/bnfnaf,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Fichier d'autorité personnes, collectivités et titres uniformes de la Bibliothéque nationale de France",
   :madsrdf/code "bnfnaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bibliothèque nationale de France in Paris"},
   :madsrdf/editorialNote "https://catalogue.bnf.fr/recherche-autorite.do?",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the Bibliothéque nationale de France",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Authority records of the Bibliothéque nationale de France",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2020-10-14T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.nameTitleSchemes/bnfnaf,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.nameTitleSchemes/bnfnaf,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Bibliothèque nationale de France in Paris"},
   :skos/editorial "https://catalogue.bnf.fr/recherche-autorite.do?",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "bnfnaf",
   :skos/prefLabel
   "Fichier d'autorité personnes, collectivités et titres uniformes de la Bibliothéque nationale de France",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Authority records of the Bibliothéque nationale de France"}})

(def cantic
  "Published by Biblioteca de Catalunya"
  {:db/ident :loc.nameTitleSchemes/cantic,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "CANTIC (Catàleg d'autoritats de noms i títols de Catalunya)",
   :madsrdf/code "cantic",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Biblioteca de Catalunya"},
   :madsrdf/editorialNote "http://cantic.bnc.cat",
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Authority records of the Biblioteca de Catalunya",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Catàleg d'autoritats de noms i títols de Catalunya",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Catàleg d'autoritats de noms i títols de Catalunya"
                   "Authority records of the Biblioteca de Catalunya"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/cantic,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Biblioteca de Catalunya"},
   :skos/editorial "http://cantic.bnc.cat",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "cantic",
   :skos/prefLabel
   "CANTIC (Catàleg d'autoritats de noms i títols de Catalunya)",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Authority records of the Biblioteca de Catalunya"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Catàleg d'autoritats de noms i títols de Catalunya"}]})

(def ccucaut
  "Catàleg Collectiu de les Universitats de Catalunya: CCUC authorities"
  {:db/ident :loc.nameTitleSchemes/ccucaut,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Catàleg Collectiu de les Universitats de Catalunya: CCUC authorities",
   :madsrdf/code "ccucaut",
   :madsrdf/hasVariant [{:madsrdf/variantLabel "CCUC authorities",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel
                         "Authority records of the Universitats de Catalunya",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Authority records of the Universitats de Catalunya"
                   "CCUC authorities"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/ccucaut,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "ccucaut",
   :skos/prefLabel
   "Catàleg Collectiu de les Universitats de Catalunya: CCUC authorities",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "CCUC authorities"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Authority records of the Universitats de Catalunya"}]})

(def cerlt
  "CERL thesaurus"
  {:db/ident :loc.nameTitleSchemes/cerlt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "CERL thesaurus",
   :madsrdf/code "cerlt",
   :madsrdf/editorialNote "https://www.cerl.org/resources/cerl_thesaurus/main",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Thesaurus file of the Consortium of European Research Libraries",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Thesaurus file of the Consortium of European Research Libraries",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2020-10-14T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.nameTitleSchemes/cerlt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.nameTitleSchemes/cerlt,
     :rdf/type           :cs/ChangeSet}],
   :skos/editorial "https://www.cerl.org/resources/cerl_thesaurus/main",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "cerlt",
   :skos/prefLabel "CERL thesaurus",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Thesaurus file of the Consortium of European Research Libraries"}})

(def ckhw
  "Published by Union Catalog of Polish Research Library Collections"
  {:db/ident :loc.nameTitleSchemes/ckhw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NUKAT Union Authority File",
   :madsrdf/code "ckhw",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Union Catalog of Polish Research Library Collections"},
   :madsrdf/editorialNote
   "http://katalog.nukat.edu.pl/heading/search?theme=nukat&locale=EN",
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Authority records of the Polish Research Library Collection",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Union Catalog of Polish Research Library Collections",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Authority records of the Polish Research Library Collection"
                   "Union Catalog of Polish Research Library Collections"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/ckhw,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Union Catalog of Polish Research Library Collections"},
   :skos/editorial
   "http://katalog.nukat.edu.pl/heading/search?theme=nukat&locale=EN",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "ckhw",
   :skos/prefLabel "NUKAT Union Authority File",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Authority records of the Polish Research Library Collection"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Union Catalog of Polish Research Library Collections"}]})

(def conorsi
  "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"
  {:db/ident :loc.nameTitleSchemes/conorsi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CONOR.SI [name authority file]",
   :madsrdf/code "conorsi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the Institut informacijskih znanosti (IZUM) in Slovenia",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Authority records of the Institut informacijskih znanosti (IZUM) in Slovenia",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/conorsi,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Institut informacijskih znanosti (IZUM) in Maribor, Slovenia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "conorsi",
   :skos/prefLabel "CONOR.SI [name authority file]",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Authority records of the Institut informacijskih znanosti (IZUM) in Slovenia"}})

(def dib
  "Published by Royal Irish Academy in Dublin, Ireland"
  {:db/ident :loc.nameTitleSchemes/dib,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-05-04T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dictionary of Irish biography (DIB)",
   :madsrdf/code "dib",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Royal Irish Academy in Dublin, Ireland"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the Dictionary of Irish Biography (DIB) (Dublin, Ireland: Royal Irish Academy)",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Authority records of the Dictionary of Irish Biography (DIB) (Dublin, Ireland: Royal Irish Academy)",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-05-04T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/dib,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Royal Irish Academy in Dublin, Ireland"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "dib",
   :skos/prefLabel "Dictionary of Irish biography (DIB)",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Authority records of the Dictionary of Irish Biography (DIB) (Dublin, Ireland: Royal Irish Academy)"}})

(def fautor
  "Published by Service documentaires multimédias in Montréal, Québec"
  {:db/ident :loc.nameTitleSchemes/fautor,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Fautor",
   :madsrdf/code "fautor",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Service documentaires multimédias in Montréal, Québec"},
   :madsrdf/editorialNote "https://www.sdm.qc.ca/AutresProduits.cfm",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the Services documentaires multimédias in Québec",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Authority records of the Services documentaires multimédias in Québec",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/fautor,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Service documentaires multimédias in Montréal, Québec"},
   :skos/editorial "https://www.sdm.qc.ca/AutresProduits.cfm",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "fautor",
   :skos/prefLabel "Fautor",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Authority records of the Services documentaires multimédias in Québec"}})

(def finaf
  "Finnish name authority file"
  {:db/ident :loc.nameTitleSchemes/finaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Finnish name authority file",
   :madsrdf/code "finaf",
   :madsrdf/editorialNote "http://finto.fi/finaf/en/",
   :madsrdf/hasVariant [{:madsrdf/variantLabel
                         "Finnish Thesaurus and Ontology Service",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Finto",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Finnish Thesaurus and Ontology Service" "Finto"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/finaf,
                     :rdf/type :cs/ChangeSet},
   :skos/editorial "http://finto.fi/finaf/en/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "finaf",
   :skos/prefLabel "Finnish name authority file",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Finnish Thesaurus and Ontology Service"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Finto"}]})

(def gkd
  "Published by Deutsche Nationalbibliothek in Leipzig and Frankfurt"
  {:db/ident :loc.nameTitleSchemes/gkd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gemeinsame Körperschaftsdatei",
   :madsrdf/code "gkd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Deutsche Nationalbibliothek in Leipzig and Frankfurt"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Corporate name authority records of the Deutsche Nationalbibliothek; part of the Integrated authority file (GND)",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Corporate name authority records of the Deutsche Nationalbibliothek; part of the Integrated authority file (GND)",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/gkd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Deutsche Nationalbibliothek in Leipzig and Frankfurt"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "gkd",
   :skos/prefLabel "Gemeinsame Körperschaftsdatei",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Corporate name authority records of the Deutsche Nationalbibliothek; part of the Integrated authority file (GND)"}})

(def gnd
  "Published by Deutsche Nationalbibliothek in Leipzig and Frankfurt"
  {:db/ident :loc.nameTitleSchemes/gnd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gemeinsame Normdatei ",
   :madsrdf/code "gnd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Deutsche Nationalbibliothek in Leipzig and Frankfurt"},
   :madsrdf/editorialNote
   "https://www.dnb.de/EN/Professionell/Standardisierung/GND/gnd_node.html",
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Authority records of the Deutsche Nationalbibliothek in Germany",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Integrated authority file (GND)",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["Integrated authority file (GND)"
    "Authority records of the Deutsche Nationalbibliothek in Germany"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/gnd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Deutsche Nationalbibliothek in Leipzig and Frankfurt"},
   :skos/editorial
   "https://www.dnb.de/EN/Professionell/Standardisierung/GND/gnd_node.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "gnd",
   :skos/prefLabel "Gemeinsame Normdatei ",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Integrated authority file (GND)"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Authority records of the Deutsche Nationalbibliothek in Germany"}]})

(def hapi
  "Published by UCLA Latin America Center Pubs. In Los Angeles, CA"
  {:db/ident :loc.nameTitleSchemes/hapi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "HAPI thesaurus and name authority, 1970-2000",
   :madsrdf/code "hapi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by UCLA Latin America Center Pubs. In Los Angeles, CA"},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Hispanic American Periodicals Index thesaurus and name authority, 1970-2000",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Thesaurus and name authority records of the Hispanic American Periodicals Index at UCLA in California",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["Hispanic American Periodicals Index thesaurus and name authority, 1970-2000"
    "Thesaurus and name authority records of the Hispanic American Periodicals Index at UCLA in California"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/hapi,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by UCLA Latin America Center Pubs. In Los Angeles, CA"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "hapi",
   :skos/prefLabel "HAPI thesaurus and name authority, 1970-2000",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Thesaurus and name authority records of the Hispanic American Periodicals Index at UCLA in California"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Hispanic American Periodicals Index thesaurus and name authority, 1970-2000"}]})

(def hkcan
  "Published by JULAC in Hong Kong"
  {:db/ident :loc.nameTitleSchemes/hkcan,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Hong Kong Chinese authority file (name)",
   :madsrdf/code "hkcan",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by JULAC in Hong Kong"},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "HKCAN",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Chinese name authority records coordinated by JULAC (Joint University Librarians Advisory Committee) in Hong Kong",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["Chinese name authority records coordinated by JULAC (Joint University Librarians Advisory Committee) in Hong Kong"
    "HKCAN"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/hkcan,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by JULAC in Hong Kong"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "hkcan",
   :skos/prefLabel "Hong Kong Chinese authority file (name)",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "HKCAN"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Chinese name authority records coordinated by JULAC (Joint University Librarians Advisory Committee) in Hong Kong"}]})

(def iconauth
  "Published by Getty Research Institute"
  {:db/ident :loc.nameTitleSchemes/iconauth,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Iconography authority",
   :madsrdf/code "iconauth",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Getty Research Institute"},
   :madsrdf/editorialNote
   "http://www.getty.edu/research/tools/vocabularies/cona/",
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Cultural Objects Name Authority @ CONA",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Cultural Objects Name Authority records of the Getty Research Institute in California ",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["Cultural Objects Name Authority records of the Getty Research Institute in California"
    "Cultural Objects Name Authority @ CONA"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/iconauth,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Getty Research Institute"},
   :skos/editorial "http://www.getty.edu/research/tools/vocabularies/cona/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "iconauth",
   :skos/prefLabel "Iconography authority",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Cultural Objects Name Authority records of the Getty Research Institute in California"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Cultural Objects Name Authority @ CONA"}]})

(def lacnaf
  "Published by Library and Archives Canada on Ottawa, ON [equivalent to second indicator value 5 in name and title headings]"
  {:db/ident :loc.nameTitleSchemes/lacnaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Library and Archives Canada name authority file",
   :madsrdf/code "lacnaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Library and Archives Canada on Ottawa, ON [equivalent to second indicator value 5 in name and title headings]"},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "French-language name authority records of Library and Archives Canada, governed by the Francophone Name Authority Program",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Canadiana Authorities",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["French-language name authority records of Library and Archives Canada, governed by the Francophone Name Authority Program"
    "Canadiana Authorities"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/lacnaf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Library and Archives Canada on Ottawa, ON [equivalent to second indicator value 5 in name and title headings]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "lacnaf",
   :skos/prefLabel "Library and Archives Canada name authority file",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Canadiana Authorities"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "French-language name authority records of Library and Archives Canada, governed by the Francophone Name Authority Program"}]})

(def mitos
  "Authority file of the Hellenic (Greek) Academic Libraries Cataloguing Consortium (ILSaS-Mitos)"
  {:db/ident :loc.nameTitleSchemes/mitos,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-05-04T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Authority file of the Hellenic (Greek) Academic Libraries Cataloguing Consortium (ILSaS-Mitos)",
   :madsrdf/code "mitos",
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Authority file of the Hellenic (Greek) Academic Libraries Cataloguing Consortium (ILSaS-Mitos)",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Hellenic Academic Libraries Cataloguing Consortium authority file",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["Hellenic Academic Libraries Cataloguing Consortium authority file"
    "Authority file of the Hellenic (Greek) Academic Libraries Cataloguing Consortium (ILSaS-Mitos)"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-05-04T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/mitos,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "mitos",
   :skos/prefLabel
   "Authority file of the Hellenic (Greek) Academic Libraries Cataloguing Consortium (ILSaS-Mitos)",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Hellenic Academic Libraries Cataloguing Consortium authority file"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Authority file of the Hellenic (Greek) Academic Libraries Cataloguing Consortium (ILSaS-Mitos)"}]})

(def naf
  "Published by Library of Congress in Washington, DC"
  {:db/ident :loc.nameTitleSchemes/naf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NACO authority file",
   :madsrdf/code "naf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Library of Congress in Washington, DC"},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Name authority records of the NACO program and administered by the Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "LC NAF",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["Name authority records of the NACO program and administered by the Library of Congress"
    "LC NAF"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/naf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Library of Congress in Washington, DC"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "naf",
   :skos/prefLabel "NACO authority file",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Name authority records of the NACO program and administered by the Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "LC NAF"}]})

(def nalnaf
  "Published by National Agricultural Library in Beltsville, Maryland [equivalent to second indicator value 3 in name and title headings]"
  {:db/ident :loc.nameTitleSchemes/nalnaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Agricultural Library name authority file",
   :madsrdf/code "nalnaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Agricultural Library in Beltsville, Maryland [equivalent to second indicator value 3 in name and title headings]"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Name authority records of the National Agricultural Library in Maryland",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Name authority records of the National Agricultural Library in Maryland",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/nalnaf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Agricultural Library in Beltsville, Maryland [equivalent to second indicator value 3 in name and title headings]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "nalnaf",
   :skos/prefLabel "National Agricultural Library name authority file",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Name authority records of the National Agricultural Library in Maryland"}})

(def nliaf
  "Published by National Library of Israel in Jerusalem"
  {:db/ident :loc.nameTitleSchemes/nliaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "National Library of Israel authority file",
   :madsrdf/code "nliaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by National Library of Israel in Jerusalem"},
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Authority records of the National Library of Israel",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Authority records of the National Library of Israel",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/nliaf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Library of Israel in Jerusalem"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "nliaf",
   :skos/prefLabel "National Library of Israel authority file",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Authority records of the National Library of Israel"}})

(def nlmnaf
  "Published by National Library of Medicine in Bethesda, Maryland [equivalent to second indicator value 3 in name and title headings]"
  {:db/ident :loc.nameTitleSchemes/nlmnaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Library of Medicine name authority file",
   :madsrdf/code "nlmnaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Library of Medicine in Bethesda, Maryland [equivalent to second indicator value 3 in name and title headings]"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Name authority records of the National Library of Medicine in Maryland",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Name authority records of the National Library of Medicine in Maryland",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/nlmnaf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Library of Medicine in Bethesda, Maryland [equivalent to second indicator value 3 in name and title headings]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "nlmnaf",
   :skos/prefLabel "National Library of Medicine name authority file",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Name authority records of the National Library of Medicine in Maryland"}})

(def nta
  "Published by Koninklijke Bibliotheek"
  {:db/ident :loc.nameTitleSchemes/nta,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nederlandse Thesaurus van Auteursnamen",
   :madsrdf/code "nta",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Koninklijke Bibliotheek"},
   :madsrdf/editorialNote "http://data.bibliotheken.nl/doc/dataset/persons",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Name authority records of the Koninklijke Bibliotheek in the Netherlands",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Name authority records of the Koninklijke Bibliotheek in the Netherlands",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/nta,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Koninklijke Bibliotheek"},
   :skos/editorial "http://data.bibliotheken.nl/doc/dataset/persons",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "nta",
   :skos/prefLabel "Nederlandse Thesaurus van Auteursnamen",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Name authority records of the Koninklijke Bibliotheek in the Netherlands"}})

(def ntc
  "Published by Koninklijke Bibliotheek in Den Haag"
  {:db/ident :loc.nameTitleSchemes/ntc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nederlandse Thesaurus voor Corporaties",
   :madsrdf/code "ntc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Koninklijke Bibliotheek in Den Haag"},
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Dutch corporations authority file",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Dutch corporations authority file",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/ntc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Koninklijke Bibliotheek in Den Haag"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "ntc",
   :skos/prefLabel "Nederlandse Thesaurus voor Corporaties",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Dutch corporations authority file"}})

(def ntd
  "Published by Koninklijke Bibliotheek in Den Haag"
  {:db/ident :loc.nameTitleSchemes/ntd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nederlandse Thesaurus voor Drukkers",
   :madsrdf/code "ntd",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Koninklijke Bibliotheek in Den Haag"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Dutch printers authority file",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Dutch printers authority file",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/ntd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Koninklijke Bibliotheek in Den Haag"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "ntd",
   :skos/prefLabel "Nederlandse Thesaurus voor Drukkers",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Dutch printers authority file"}})

(def nznb
  "Published by National Library of New Zealand in Wellington"
  {:db/ident :loc.nameTitleSchemes/nznb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "New Zealand national bibliography",
   :madsrdf/code "nznb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by National Library of New Zealand in Wellington"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the National Library of New Zealand",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Authority records of the National Library of New Zealand",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/nznb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by National Library of New Zealand in Wellington"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "nznb",
   :skos/prefLabel "New Zealand national bibliography",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Authority records of the National Library of New Zealand"}})

(def sanb
  "South African national bibliography authority file"
  {:db/ident :loc.nameTitleSchemes/sanb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "South African national bibliography authority file",
   :madsrdf/code "sanb",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the National Library of South Africa",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Authority records of the National Library of South Africa",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/sanb,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "sanb",
   :skos/prefLabel "South African national bibliography authority file",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Authority records of the National Library of South Africa"}})

(def sucnsaf
  "Published by King Fahd National Library in Riyadh, Saudi Arabia"
  {:db/ident :loc.nameTitleSchemes/sucnsaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Saudi Unified Catalog name and subject authority file",
   :madsrdf/code "sucnsaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by King Fahd National Library in Riyadh, Saudi Arabia"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Authority records of the King Fahd National Library in Saudi Arabia",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Authority records of the King Fahd National Library in Saudi Arabia",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/sucnsaf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by King Fahd National Library in Riyadh, Saudi Arabia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "sucnsaf",
   :skos/prefLabel "Saudi Unified Catalog name and subject authority file",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Authority records of the King Fahd National Library in Saudi Arabia"}})

(def twnaf
  "Published by National Central Library in Taipei, Taiwan"
  {:db/ident :loc.nameTitleSchemes/twnaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Taiwan name authority",
   :madsrdf/code "twnaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by National Central Library in Taipei, Taiwan"},
   :madsrdf/editorialNote "https://ld.ncl.lib.ntu.edu.tw/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/twnaf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Central Library in Taipei, Taiwan"},
   :skos/editorial "https://ld.ncl.lib.ntu.edu.tw/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "twnaf",
   :skos/prefLabel "Taiwan name authority"})

(def ulan
  "Publushed by Getty Research Institute in Los Angeles"
  {:db/ident :loc.nameTitleSchemes/ulan,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Union list of artist names",
   :madsrdf/code "ulan",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Publushed by Getty Research Institute in Los Angeles"},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "ULAN",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Union list of artist names records of the Getty Research Institute in California",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nameTitleSchemes/collection_nameTitleSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nameTitleSchemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["Union list of artist names records of the Getty Research Institute in California"
    "ULAN"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.nameTitleSchemes/ulan,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Publushed by Getty Research Institute in Los Angeles"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $2"},
   :skos/inScheme :loc.vocabulary/nameTitleSchemes,
   :skos/notation "ulan",
   :skos/prefLabel "Union list of artist names",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "ULAN"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Union list of artist names records of the Getty Research Institute in California"}]})

(def ^{:private true} nameTitleSchemes
  ""
  {:db/ident        :loc.vocabulary/nameTitleSchemes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-10-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/hasMADSSchemeMember [:loc.nameTitleSchemes/ntc
                                 :loc.nameTitleSchemes/nliaf
                                 :loc.nameTitleSchemes/cantic
                                 :loc.nameTitleSchemes/bnfnaf
                                 :loc.nameTitleSchemes/iconauth
                                 :loc.nameTitleSchemes/abne
                                 :loc.nameTitleSchemes/naf
                                 :loc.nameTitleSchemes/nlmnaf
                                 :loc.nameTitleSchemes/ccucaut
                                 :loc.nameTitleSchemes/ckhw
                                 :loc.nameTitleSchemes/sanb
                                 :loc.nameTitleSchemes/hkcan
                                 :loc.nameTitleSchemes/nalnaf
                                 :loc.nameTitleSchemes/fautor
                                 :loc.nameTitleSchemes/nta
                                 :loc.nameTitleSchemes/gkd
                                 :loc.nameTitleSchemes/dib
                                 :loc.nameTitleSchemes/conorsi
                                 :loc.nameTitleSchemes/finaf
                                 :loc.nameTitleSchemes/twnaf
                                 :loc.nameTitleSchemes/ntd
                                 :loc.nameTitleSchemes/bibbi
                                 :loc.nameTitleSchemes/cerlt
                                 :loc.nameTitleSchemes/lacnaf
                                 :loc.nameTitleSchemes/nznb
                                 :loc.nameTitleSchemes/gnd
                                 :loc.nameTitleSchemes/ulan
                                 :loc.nameTitleSchemes/sucnsaf
                                 :loc.nameTitleSchemes/mitos
                                 :loc.nameTitleSchemes/hapi
                                 :loc.nameTitleSchemes/banqa
                                 :loc.nameTitleSchemes/bibalex],
   :rdf/type        [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment    "",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Name and Title Authority Source Codes"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-10-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/nameTitleSchemes,
                     :rdf/type :cs/ChangeSet}})