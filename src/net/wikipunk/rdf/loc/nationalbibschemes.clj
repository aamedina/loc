(ns net.wikipunk.rdf.loc.nationalbibschemes
  "http://id.loc.gov/vocabulary/nationalbibschemes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/nationalbibschemes.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.nationalbibschemes"
                       "http://id.loc.gov/vocabulary/nationalbibschemes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.nationalbibschemes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/nationalbibschemes/"})

(def abc
  "Anuario bibliográfico colombiano (Calí: Biblioteca Jorge García B.)"
  {:db/ident :loc.nationalbibschemes/abc,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Anuario bibliográfico colombiano",
   :madsrdf/code "abc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Anuario bibliográfico colombiano (Calí: Biblioteca Jorge García B.)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/abc,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Anuario bibliográfico colombiano (Calí: Biblioteca Jorge García B.)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "abc",
   :skos/prefLabel "Anuario bibliográfico colombiano"})

(def abd
  "Anuario bibliográfico dominicana (Ciudad Trujillo: Biblioteca Nacional)"
  {:db/ident :loc.nationalbibschemes/abd,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Anuario bibliográfico dominicana",
   :madsrdf/code "abd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Anuario bibliográfico dominicana (Ciudad Trujillo: Biblioteca Nacional)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/abd,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Anuario bibliográfico dominicana (Ciudad Trujillo: Biblioteca Nacional)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "abd",
   :skos/prefLabel "Anuario bibliográfico dominicana"})

(def abe
  "Anuario bibliográfico ecuatoriano (Cuenca: Banco Central del Ecuador)"
  {:db/ident :loc.nationalbibschemes/abe,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Anuario bibliográfico ecuatoriano",
   :madsrdf/code "abe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Anuario bibliográfico ecuatoriano (Cuenca: Banco Central del Ecuador)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/abe,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Anuario bibliográfico ecuatoriano (Cuenca: Banco Central del Ecuador)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "abe",
   :skos/prefLabel "Anuario bibliográfico ecuatoriano"})

(def abp
  "Anuario bibliográfico peruano (Lima: Editorial Lumen)"
  {:db/ident :loc.nationalbibschemes/abp,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Anuario bibliográfico peruano",
   :madsrdf/code "abp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Anuario bibliográfico peruano (Lima: Editorial Lumen)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/abp,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Anuario bibliográfico peruano (Lima: Editorial Lumen)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "abp",
   :skos/prefLabel "Anuario bibliográfico peruano"})

(def abu
  "Anuario bibliográfico uruguayo (Montevideo: Biblioteca Nacional)"
  {:db/ident :loc.nationalbibschemes/abu,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Anuario bibliográfico uruguayo",
   :madsrdf/code "abu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Anuario bibliográfico uruguayo (Montevideo: Biblioteca Nacional)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/abu,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Anuario bibliográfico uruguayo (Montevideo: Biblioteca Nacional)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "abu",
   :skos/prefLabel "Anuario bibliográfico uruguayo"})

(def anb
  "Australian national bibliography (Canberra: National Library of Australia)"
  {:db/ident :loc.nationalbibschemes/anb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Australian national bibliography",
   :madsrdf/code "anb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Australian national bibliography (Canberra: National Library of Australia)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/anb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Australian national bibliography (Canberra: National Library of Australia)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "anb",
   :skos/prefLabel "Australian national bibliography"})

(def ba
  "Bibliografía d'Andorra (Andorra La Vella: Biblioteca Nacional)"
  {:db/ident :loc.nationalbibschemes/ba,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografía d'Andorra",
   :madsrdf/code "ba",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliografía d'Andorra (Andorra La Vella: Biblioteca Nacional)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/ba,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliografía d'Andorra (Andorra La Vella: Biblioteca Nacional)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "ba",
   :skos/prefLabel "Bibliografía d'Andorra"})

(def bbe
  "Bibliographie de Belgique (Bruxelles: H. Manceaux)"
  {:db/ident :loc.nationalbibschemes/bbe,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliographie de Belgique",
   :madsrdf/code "bbe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Bibliographie de Belgique (Bruxelles: H. Manceaux)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bbe,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Bibliographie de Belgique (Bruxelles: H. Manceaux)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bbe",
   :skos/prefLabel "Bibliographie de Belgique"})

(def bbo
  "Bibliografía boliviana (Cochabamba: Amigos del Libro)"
  {:db/ident :loc.nationalbibschemes/bbo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografía boliviana",
   :madsrdf/code "bbo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Bibliografía boliviana (Cochabamba: Amigos del Libro)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bbo,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Bibliografía boliviana (Cochabamba: Amigos del Libro)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bbo",
   :skos/prefLabel "Bibliografía boliviana"})

(def bbr
  "Bibliografia brasileira (Rio de Janeiro: Biblioteca Nacional)"
  {:db/ident :loc.nationalbibschemes/bbr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografia brasileira",
   :madsrdf/code "bbr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Bibliografia brasileira (Rio de Janeiro: Biblioteca Nacional)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bbr,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Bibliografia brasileira (Rio de Janeiro: Biblioteca Nacional)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bbr",
   :skos/prefLabel "Bibliografia brasileira"})

(def bc
  "Bibliografía cubana (Habana: Biblioteca Nacional José Martá)"
  {:db/ident :loc.nationalbibschemes/bc,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografía cubana",
   :madsrdf/code "bc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Bibliografía cubana (Habana: Biblioteca Nacional José Martá)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bc,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Bibliografía cubana (Habana: Biblioteca Nacional José Martá)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bc",
   :skos/prefLabel "Bibliografía cubana"})

(def bccb
  "Brinkman's cumulatieve catalogus van boeken (Leiden: Sijthoff)"
  {:db/ident :loc.nationalbibschemes/bccb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Brinkman's cumulatieve catalogus van boeken",
   :madsrdf/code "bccb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Brinkman's cumulatieve catalogus van boeken (Leiden: Sijthoff)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bccb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Brinkman's cumulatieve catalogus van boeken (Leiden: Sijthoff)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bccb",
   :skos/prefLabel "Brinkman's cumulatieve catalogus van boeken"})

(def bcl
  "Bibliografía chilena (Santiago: Biblioteca Nacional de Chile)"
  {:db/ident :loc.nationalbibschemes/bcl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografía chilena",
   :madsrdf/code "bcl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Bibliografía chilena (Santiago: Biblioteca Nacional de Chile)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bcl,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Bibliografía chilena (Santiago: Biblioteca Nacional de Chile)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bcl",
   :skos/prefLabel "Bibliografía chilena"})

(def be
  "Bibliografía española (Madrid: Servicio Nacional de Información Bibliográfica)"
  {:db/ident :loc.nationalbibschemes/be,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografía española",
   :madsrdf/code "be",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliografía española (Madrid: Servicio Nacional de Información Bibliográfica)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/be,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliografía española (Madrid: Servicio Nacional de Información Bibliográfica)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "be",
   :skos/prefLabel "Bibliografía española"})

(def bk
  "Bulgarski knigopis (Sofiíà: Narodna biblioteka Kiril i Metodii)"
  {:db/ident :loc.nationalbibschemes/bk,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bulgarski knigopis",
   :madsrdf/code "bk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bulgarski knigopis (Sofiíà: Narodna biblioteka Kiril i Metodii)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bk,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bulgarski knigopis (Sofiíà: Narodna biblioteka Kiril i Metodii)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bk",
   :skos/prefLabel "Bulgarski knigopis"})

(def bkck
  "Bibliograficky katalog: Ceské knihy (Praha: Národní knihovna)"
  {:db/ident :loc.nationalbibschemes/bkck,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliograficky katalog: Ceské knihy",
   :madsrdf/code "bkck",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Bibliograficky katalog: Ceské knihy (Praha: Národní knihovna)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bkck,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Bibliograficky katalog: Ceské knihy (Praha: Národní knihovna)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bkck",
   :skos/prefLabel "Bibliograficky katalog: Ceské knihy"})

(def bksk
  "Bibliograficky katalog: Slovenské knihy (Brastislava: Národní knihovna)"
  {:db/ident :loc.nationalbibschemes/bksk,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliograficky katalog: Slovenské knihy",
   :madsrdf/code "bksk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliograficky katalog: Slovenské knihy (Brastislava: Národní knihovna)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bksk,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliograficky katalog: Slovenské knihy (Brastislava: Národní knihovna)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bksk",
   :skos/prefLabel "Bibliograficky katalog: Slovenské knihy"})

(def bl
  "Bibliographie luxembourgeoise pour l'année (Luxembourg: Bibliothèque nationale)"
  {:db/ident :loc.nationalbibschemes/bl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliographie luxembourgeoise pour l'année",
   :madsrdf/code "bl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliographie luxembourgeoise pour l'année (Luxembourg: Bibliothèque nationale)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bl,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliographie luxembourgeoise pour l'année (Luxembourg: Bibliothèque nationale)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bl",
   :skos/prefLabel "Bibliographie luxembourgeoise pour l'année"})

(def bm
  "Bibliografía mexicana (Ciudad de México: Biblioteca Nacional)"
  {:db/ident :loc.nationalbibschemes/bm,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografía mexicana",
   :madsrdf/code "bm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Bibliografía mexicana (Ciudad de México: Biblioteca Nacional)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bm,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Bibliografía mexicana (Ciudad de México: Biblioteca Nacional)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bm",
   :skos/prefLabel "Bibliografía mexicana"})

(def bnb
  "British national bibliography (London: British Library, Bibliographic Services Division)"
  {:db/ident :loc.nationalbibschemes/bnb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "British national bibliography",
   :madsrdf/code "bnb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "British national bibliography (London: British Library, Bibliographic Services Division)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bnb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "British national bibliography (London: British Library, Bibliographic Services Division)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bnb",
   :skos/prefLabel "British national bibliography"})

(def bnc
  "Bibliografia nacional de Catalunya (Barcelona: Departement de Cultura de la Generalitat de Catalunya)"
  {:db/ident :loc.nationalbibschemes/bnc,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografia nacional de Catalunya",
   :madsrdf/code "bnc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliografia nacional de Catalunya (Barcelona: Departement de Cultura de la Generalitat de Catalunya)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bnc,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliografia nacional de Catalunya (Barcelona: Departement de Cultura de la Generalitat de Catalunya)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bnc",
   :skos/prefLabel "Bibliografia nacional de Catalunya"})

(def bne
  "Bibliografía nacional de España (Madrid: Biblioteca Nacional de España)"
  {:db/ident :loc.nationalbibschemes/bne,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografía nacional de España",
   :madsrdf/code "bne",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliografía nacional de España (Madrid: Biblioteca Nacional de España)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bne,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliografía nacional de España (Madrid: Biblioteca Nacional de España)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bne",
   :skos/prefLabel "Bibliografía nacional de España"})

(def bnf
  "Bibliographie nationale française (Paris: Bibliothèque nationale de France)"
  {:db/ident :loc.nationalbibschemes/bnf,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliographie nationale française",
   :madsrdf/code "bnf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliographie nationale française (Paris: Bibliothèque nationale de France)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bnf,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliographie nationale française (Paris: Bibliothèque nationale de France)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bnf",
   :skos/prefLabel "Bibliographie nationale française"})

(def bni
  "Bibliografia nazionale italiana (Roma: Istituto centrale per il catalogo unico delle biblioteche italiane e per le informazioni)"
  {:db/ident :loc.nationalbibschemes/bni,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografia nazionale italiana",
   :madsrdf/code "bni",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliografia nazionale italiana (Roma: Istituto centrale per il catalogo unico delle biblioteche italiane e per le informazioni)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bni,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliografia nazionale italiana (Roma: Istituto centrale per il catalogo unico delle biblioteche italiane e per le informazioni)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bni",
   :skos/prefLabel "Bibliografia nazionale italiana"})

(def bnm
  "Bibljografija nazzjonal ta' Malta = National bibliography of Malta (Valletta: National Library of Malta)"
  {:db/ident :loc.nationalbibschemes/bnm,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibljografija nazzjonal ta' Malta",
   :madsrdf/code "bnm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibljografija nazzjonal ta' Malta = National bibliography of Malta (Valletta: National Library of Malta)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bnm,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibljografija nazzjonal ta' Malta = National bibliography of Malta (Valletta: National Library of Malta)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bnm",
   :skos/prefLabel "Bibljografija nazzjonal ta' Malta"})

(def bnr
  "Bibliografia nationala româna (Bucuresti: Biblioteca Nationale a României)"
  {:db/ident :loc.nationalbibschemes/bnr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografia nationala româna",
   :madsrdf/code "bnr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliografia nationala româna (Bucuresti: Biblioteca Nationale a României)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bnr,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliografia nationala româna (Bucuresti: Biblioteca Nationale a României)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bnr",
   :skos/prefLabel "Bibliografia nationala româna"})

(def bv
  "Bibliografía venezolana (Caracas: Instituto Autónomo Biblioteca Nacional y Servicios de Bibliotecas)"
  {:db/ident :loc.nationalbibschemes/bv,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliografía venezolana",
   :madsrdf/code "bv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Bibliografía venezolana (Caracas: Instituto Autónomo Biblioteca Nacional y Servicios de Bibliotecas)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/bv,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Bibliografía venezolana (Caracas: Instituto Autónomo Biblioteca Nacional y Servicios de Bibliotecas)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "bv",
   :skos/prefLabel "Bibliografía venezolana"})

(def can
  "Canadiana (Ottawa: Library and Archives Canad)"
  {:db/ident :loc.nationalbibschemes/can,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Canadiana",
   :madsrdf/code "can",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Canadiana (Ottawa: Library and Archives Canad)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/can,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Canadiana (Ottawa: Library and Archives Canad)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "can",
   :skos/prefLabel "Canadiana"})

(def cncr
  "Catálogo nacional de Costa Rica (San José: Biblioteca Nacional)"
  {:db/ident :loc.nationalbibschemes/cncr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Catálogo nacional de Costa Rica",
   :madsrdf/code "cncr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Catálogo nacional de Costa Rica (San José: Biblioteca Nacional)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/cncr,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Catálogo nacional de Costa Rica (San José: Biblioteca Nacional)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "cncr",
   :skos/prefLabel "Catálogo nacional de Costa Rica"})

(def db
  "Deutsche Bibliographie (Frankfurt am Main: Die Deutsche Bibliothek)"
  {:db/ident :loc.nationalbibschemes/db,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Deutsche Bibliographie",
   :madsrdf/code "db",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Deutsche Bibliographie (Frankfurt am Main: Die Deutsche Bibliothek)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/db,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Deutsche Bibliographie (Frankfurt am Main: Die Deutsche Bibliothek)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "db",
   :skos/prefLabel "Deutsche Bibliographie"})

(def dbf
  "Dansk bogfortegnelse (Ballerup: Dansk Bibliotekscenter)"
  {:db/ident :loc.nationalbibschemes/dbf,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dansk bogfortegnelse",
   :madsrdf/code "dbf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Dansk bogfortegnelse (Ballerup: Dansk Bibliotekscenter)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/dbf,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Dansk bogfortegnelse (Ballerup: Dansk Bibliotekscenter)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "dbf",
   :skos/prefLabel "Dansk bogfortegnelse"})

(def dnb
  "Deutsche Nationalbibliografie"
  {:db/ident :loc.nationalbibschemes/dnb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Deutsche Nationalbibliografie",
   :madsrdf/code "dnb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Deutsche Nationalbibliografie"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/dnb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Deutsche Nationalbibliografie"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "dnb",
   :skos/prefLabel "Deutsche Nationalbibliografie"})

(def dnd
  "Danish National Bibliographic Number for Musical Recordings (Copenhagen: Royal Danish Library)"
  {:db/ident :loc.nationalbibschemes/dnd,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Danish National Bibliographic Number for Musical Recordings",
   :madsrdf/code "dnd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Danish National Bibliographic Number for Musical Recordings (Copenhagen: Royal Danish Library)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/dnd,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Danish National Bibliographic Number for Musical Recordings (Copenhagen: Royal Danish Library)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "dnd",
   :skos/prefLabel
   "Danish National Bibliographic Number for Musical Recordings"})

(def eev
  "Ellenikê ethnikê vivliografia (Athenai: Ethnikê Vivliothêkê tês Ellados)"
  {:db/ident :loc.nationalbibschemes/eev,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Ellenikê ethnikê vivliografia",
   :madsrdf/code "eev",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Ellenikê ethnikê vivliografia (Athenai: Ethnikê Vivliothêkê tês Ellados)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/eev,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Ellenikê ethnikê vivliografia (Athenai: Ethnikê Vivliothêkê tês Ellados)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "eev",
   :skos/prefLabel "Ellenikê ethnikê vivliografia"})

(def hb
  "Hrvatska bibliografija (Zagreb: Nacionalna i sveucilisna biblioteka)"
  {:db/ident :loc.nationalbibschemes/hb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Hrvatska bibliografija",
   :madsrdf/code "hb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Hrvatska bibliografija (Zagreb: Nacionalna i sveucilisna biblioteka)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/hb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Hrvatska bibliografija (Zagreb: Nacionalna i sveucilisna biblioteka)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "hb",
   :skos/prefLabel "Hrvatska bibliografija"})

(def ib
  "Islensk bókaskrá (Reykjevík: Landbókasafn Islands - Háskólabókasafn)"
  {:db/ident :loc.nationalbibschemes/ib,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Islensk bókaskrá ",
   :madsrdf/code "ib",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Islensk bókaskrá (Reykjevík: Landbókasafn Islands - Háskólabókasafn)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/ib,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Islensk bókaskrá (Reykjevík: Landbókasafn Islands - Háskólabókasafn)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "ib",
   :skos/prefLabel "Islensk bókaskrá "})

(def ipr
  "Irish publishing record (Dublin: University College of Dublin)"
  {:db/ident :loc.nationalbibschemes/ipr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Irish publishing record",
   :madsrdf/code "ipr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Irish publishing record (Dublin: University College of Dublin)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/ipr,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Irish publishing record (Dublin: University College of Dublin)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "ipr",
   :skos/prefLabel "Irish publishing record"})

(def jnb
  "Japanese National Bibliography (Tokyo: National Diet Library)"
  {:db/ident :loc.nationalbibschemes/jnb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Japanese National Bibliography ",
   :madsrdf/code "jnb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Japanese National Bibliography (Tokyo: National Diet Library)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/jnb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Japanese National Bibliography (Tokyo: National Diet Library)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "jnb",
   :skos/prefLabel "Japanese National Bibliography "})

(def kktzm
  "Kokuritsu kokkai Toshokan zosho mokuroku (Tokyo: National Diet Library)"
  {:db/ident :loc.nationalbibschemes/kktzm,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Kokuritsu kokkai Toshokan zosho mokuroku",
   :madsrdf/code "kktzm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Kokuritsu kokkai Toshokan zosho mokuroku (Tokyo: National Diet Library)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/kktzm,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Kokuritsu kokkai Toshokan zosho mokuroku (Tokyo: National Diet Library)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "kktzm",
   :skos/prefLabel "Kokuritsu kokkai Toshokan zosho mokuroku"})

(def kl
  "Knizhnaíà letopis' (Moskva: Rossiiskaíà knizhnaíà palata)"
  {:db/ident :loc.nationalbibschemes/kl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Knizhnaíà letopis'",
   :madsrdf/code "kl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Knizhnaíà letopis' (Moskva: Rossiiskaíà knizhnaíà palata)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/kl,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Knizhnaíà letopis' (Moskva: Rossiiskaíà knizhnaíà palata)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "kl",
   :skos/prefLabel "Knizhnaíà letopis'"})

(def la
  "Libros argentinos (Buenos Aires: Cámara Argentina del Libro)"
  {:db/ident :loc.nationalbibschemes/la,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Libros argentinos",
   :madsrdf/code "la",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Libros argentinos (Buenos Aires: Cámara Argentina del Libro)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/la,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Libros argentinos (Buenos Aires: Cámara Argentina del Libro)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "la",
   :skos/prefLabel "Libros argentinos"})

(def lb
  "Liechtensteinische Bibliographie (Vaduz: Liechtensteinische Landesbibliothek)"
  {:db/ident :loc.nationalbibschemes/lb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Liechtensteinische Bibliographie ",
   :madsrdf/code "lb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Liechtensteinische Bibliographie (Vaduz: Liechtensteinische Landesbibliothek)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/lb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Liechtensteinische Bibliographie (Vaduz: Liechtensteinische Landesbibliothek)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "lb",
   :skos/prefLabel "Liechtensteinische Bibliographie "})

(def ldb
  "Letapis Druku Belarusi = Chronicle of the Press Belarus (Minsk: Natsyianal'naia kniznaia palata Belarusi)"
  {:db/ident :loc.nationalbibschemes/ldb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Letapis Druku Belarusi",
   :madsrdf/code "ldb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Letapis Druku Belarusi = Chronicle of the Press Belarus (Minsk: Natsyianal'naia kniznaia palata Belarusi)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/ldb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Letapis Druku Belarusi = Chronicle of the Press Belarus (Minsk: Natsyianal'naia kniznaia palata Belarusi)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "ldb",
   :skos/prefLabel "Letapis Druku Belarusi"})

(def mnb
  "Magyar nemzeti bibliográfia (Budapest: Országos Széchényi Könyvtár)"
  {:db/ident :loc.nationalbibschemes/mnb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Magyar nemzeti bibliográfia",
   :madsrdf/code "mnb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Magyar nemzeti bibliográfia (Budapest: Országos Széchényi Könyvtár)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/mnb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Magyar nemzeti bibliográfia (Budapest: Országos Széchényi Könyvtár)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "mnb",
   :skos/prefLabel "Magyar nemzeti bibliográfia"})

(def nbf
  "Norsk bokfortegnelse (Oslo: Norske bokhandlerforening)"
  {:db/ident :loc.nationalbibschemes/nbf,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Norsk bokfortegnelse",
   :madsrdf/code "nbf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Norsk bokfortegnelse (Oslo: Norske bokhandlerforening)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/nbf,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Norsk bokfortegnelse (Oslo: Norske bokhandlerforening)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "nbf",
   :skos/prefLabel "Norsk bokfortegnelse"})

(def nznb
  "New Zealand national bibliography (Wellington: National Library of New Zealand)"
  {:db/ident :loc.nationalbibschemes/nznb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "New Zealand national bibliography",
   :madsrdf/code "nznb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "New Zealand national bibliography (Wellington: National Library of New Zealand)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/nznb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "New Zealand national bibliography (Wellington: National Library of New Zealand)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "nznb",
   :skos/prefLabel "New Zealand national bibliography"})

(def oeb
  "Oesterreichische Bibliographie (Wien: Oesterreichische Nationalbibliothek)"
  {:db/ident :loc.nationalbibschemes/oeb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Oesterreichische Bibliographie",
   :madsrdf/code "oeb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Oesterreichische Bibliographie (Wien: Oesterreichische Nationalbibliothek)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/oeb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Oesterreichische Bibliographie (Wien: Oesterreichische Nationalbibliothek)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "oeb",
   :skos/prefLabel "Oesterreichische Bibliographie"})

(def pb
  "Przewodnik bibliograficzny (Warszawa: Biblioteka Narodowa)"
  {:db/ident :loc.nationalbibschemes/pb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Przewodnik bibliograficzny",
   :madsrdf/code "pb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Przewodnik bibliograficzny (Warszawa: Biblioteka Narodowa)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/pb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Przewodnik bibliograficzny (Warszawa: Biblioteka Narodowa)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "pb",
   :skos/prefLabel "Przewodnik bibliograficzny"})

(def sanb
  "South African national bibliography = Suid-Afrikaanse nasionale bibliografie(Pretoria: National Library of South Africa)"
  {:db/ident :loc.nationalbibschemes/sanb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "South African national bibliography",
   :madsrdf/code "sanb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "South African national bibliography = Suid-Afrikaanse nasionale bibliografie(Pretoria: National Library of South Africa)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/sanb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "South African national bibliography = Suid-Afrikaanse nasionale bibliografie(Pretoria: National Library of South Africa)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "sanb",
   :skos/prefLabel "South African national bibliography"})

(def sbf
  "Svensk bokförteckning (Stockholm: Svenska bokhandlareforeningen)"
  {:db/ident :loc.nationalbibschemes/sbf,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Svensk bokförteckning",
   :madsrdf/code "sbf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Svensk bokförteckning (Stockholm: Svenska bokhandlareforeningen)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/sbf,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Svensk bokförteckning (Stockholm: Svenska bokhandlareforeningen)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "sbf",
   :skos/prefLabel "Svensk bokförteckning"})

(def skl
  "Suomen kirjallisuus (Helsinki: Helsingin Yliopiston Kirjasto)"
  {:db/ident :loc.nationalbibschemes/skl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Suomen kirjallisuus",
   :madsrdf/code "skl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Suomen kirjallisuus (Helsinki: Helsingin Yliopiston Kirjasto)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/skl,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Suomen kirjallisuus (Helsinki: Helsingin Yliopiston Kirjasto)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "skl",
   :skos/prefLabel "Suomen kirjallisuus"})

(def slb
  "Slovenska bibliografija (Ljubljana: Narodna in univerzitetna knjiznica)"
  {:db/ident :loc.nationalbibschemes/slb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Slovenska bibliografija",
   :madsrdf/code "slb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Slovenska bibliografija (Ljubljana: Narodna in univerzitetna knjiznica)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/slb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Slovenska bibliografija (Ljubljana: Narodna in univerzitetna knjiznica)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "slb",
   :skos/prefLabel "Slovenska bibliografija"})

(def szb
  "Das Schweizer Buch: Schweizerische Nationalbibliographie (Zürich: Schweizerischer Buchhändler- und Verlegerverband)"
  {:db/ident :loc.nationalbibschemes/szb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Das Schweizer Buch: Schweizerische Nationalbibliographie",
   :madsrdf/code "szb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Das Schweizer Buch: Schweizerische Nationalbibliographie (Zürich: Schweizerischer Buchhändler- und Verlegerverband)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/szb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Das Schweizer Buch: Schweizerische Nationalbibliographie (Zürich: Schweizerischer Buchhändler- und Verlegerverband)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "szb",
   :skos/prefLabel "Das Schweizer Buch: Schweizerische Nationalbibliographie"})

(def tnb
  "Taiwan National Bibliography (Taipei: National Central Library)"
  {:db/ident :loc.nationalbibschemes/tnb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Taiwan National Bibliography",
   :madsrdf/code "tnb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Taiwan National Bibliography (Taipei: National Central Library)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/tnb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Taiwan National Bibliography (Taipei: National Central Library)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "tnb",
   :skos/prefLabel "Taiwan National Bibliography"})

(def ulk
  "Ukraïna: litopys knih (Kyïv: Knyzhkova palata Ukraïny)"
  {:db/ident :loc.nationalbibschemes/ulk,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Ukraïna: litopys knih",
   :madsrdf/code "ulk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Ukraïna: litopys knih (Kyïv: Knyzhkova palata Ukraïny)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/ulk,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Ukraïna: litopys knih (Kyïv: Knyzhkova palata Ukraïny)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "ulk",
   :skos/prefLabel "Ukraïna: litopys knih"})

(def znb
  "Zimbabwe national bibliography (Harare: National Archives)"
  {:db/ident :loc.nationalbibschemes/znb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.nationalbibschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Zimbabwe national bibliography",
   :madsrdf/code "znb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Zimbabwe national bibliography (Harare: National Archives)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 015 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.nationalbibschemes/collection_nationalbibschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/nationalbibschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.nationalbibschemes/dlc,
                     :cs/subjectOfChange :loc.nationalbibschemes/znb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Zimbabwe national bibliography (Harare: National Archives)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 015 $2"},
   :skos/inScheme :loc.vocabulary/nationalbibschemes,
   :skos/notation "znb",
   :skos/prefLabel "Zimbabwe national bibliography"})

(def ^{:private true} nationalbibschemes
  ""
  {:db/ident        :loc.vocabulary/nationalbibschemes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-10-03T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/dlc",
    :ri/recordStatus "new"},
   :madsrdf/hasMADSSchemeMember [:loc.nationalbibschemes/slb
                                 :loc.nationalbibschemes/abu
                                 :loc.nationalbibschemes/oeb
                                 :loc.nationalbibschemes/hb
                                 :loc.nationalbibschemes/db
                                 :loc.nationalbibschemes/jnb
                                 :loc.nationalbibschemes/abp
                                 :loc.nationalbibschemes/be
                                 :loc.nationalbibschemes/bnc
                                 :loc.nationalbibschemes/szb
                                 :loc.nationalbibschemes/ba
                                 :loc.nationalbibschemes/ipr
                                 :loc.nationalbibschemes/nbf
                                 :loc.nationalbibschemes/dbf
                                 :loc.nationalbibschemes/bbo
                                 :loc.nationalbibschemes/la
                                 :loc.nationalbibschemes/lb
                                 :loc.nationalbibschemes/pb
                                 :loc.nationalbibschemes/bnr
                                 :loc.nationalbibschemes/bm
                                 :loc.nationalbibschemes/ldb
                                 :loc.nationalbibschemes/bnm
                                 :loc.nationalbibschemes/mnb
                                 :loc.nationalbibschemes/bccb
                                 :loc.nationalbibschemes/znb
                                 :loc.nationalbibschemes/bv
                                 :loc.nationalbibschemes/skl
                                 :loc.nationalbibschemes/sanb
                                 :loc.nationalbibschemes/anb
                                 :loc.nationalbibschemes/nznb
                                 :loc.nationalbibschemes/dnb
                                 :loc.nationalbibschemes/sbf
                                 :loc.nationalbibschemes/ulk
                                 :loc.nationalbibschemes/eev
                                 :loc.nationalbibschemes/can
                                 :loc.nationalbibschemes/bbe
                                 :loc.nationalbibschemes/bnf
                                 :loc.nationalbibschemes/bl
                                 :loc.nationalbibschemes/bkck
                                 :loc.nationalbibschemes/bc
                                 :loc.nationalbibschemes/bnb
                                 :loc.nationalbibschemes/abd
                                 :loc.nationalbibschemes/bbr
                                 :loc.nationalbibschemes/abe
                                 :loc.nationalbibschemes/ib
                                 :loc.nationalbibschemes/kl
                                 :loc.nationalbibschemes/bk
                                 :loc.nationalbibschemes/bni
                                 :loc.nationalbibschemes/bne
                                 :loc.nationalbibschemes/kktzm
                                 :loc.nationalbibschemes/tnb
                                 :loc.nationalbibschemes/bcl
                                 :loc.nationalbibschemes/dnd
                                 :loc.nationalbibschemes/bksk
                                 :loc.nationalbibschemes/cncr
                                 :loc.nationalbibschemes/abc],
   :rdf/type        [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment    "",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "National Bibliography Number Source Codes"},
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     "https://id.loc.gov/vocabulary/dlc",
                     :cs/subjectOfChange :loc.vocabulary/nationalbibschemes,
                     :rdf/type           :cs/ChangeSet}})