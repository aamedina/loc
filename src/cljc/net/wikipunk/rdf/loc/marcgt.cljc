(ns net.wikipunk.rdf.loc.marcgt
  "http://id.loc.gov/vocabulary/marcgt/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/marcgt.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.marcgt" "http://id.loc.gov/vocabulary/marcgt/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.marcgt",
   :rdfa/uri          "http://id.loc.gov/vocabulary/marcgt/"}
  (:refer-clojure :exclude [abs cat int let map mod num rem]))

(def abs
  "Brief summary that provides the essential points of written works, such as the content of a publication or of a journal."
  {:db/ident :loc.marcgt/abs,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/abs,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "abstract or summary",
   :madsrdf/code "abs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Brief summary that provides the essential points of written works, such as the content of a publication or of a journal."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/24+ BK,CR (code a)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/abs,
                     :cs/subjectOfChange :loc.marcgt/abs,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Brief summary that provides the essential points of written works, such as the content of a publication or of a journal."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/24+ BK,CR (code a)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "abs",
   :skos/prefLabel "abstract or summary"})

(def aro
  "Two or three-dimensional work of art created by an artist, for example, a sculpture, as contrasted with a reproduction of it."
  {:db/ident :loc.marcgt/aro,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
     :ri/recordContentSource :loc.marcgt/aro,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2023-01-20T05:00:00.000-00:00",
     :ri/recordContentSource :loc.marcgt/aro,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "art original",
   :madsrdf/code "aro",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Two or three-dimensional work of art created by an artist, for example, a sculpture, as contrasted with a reproduction of it."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code a)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2023-01-20T05:00:00.000-00:00",
                      :cs/creatorName     :loc.marcgt/aro,
                      :cs/subjectOfChange :loc.marcgt/aro,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                      :cs/creatorName     :loc.marcgt/aro,
                      :cs/subjectOfChange :loc.marcgt/aro,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Two or three-dimensional work of art created by an artist, for example, a sculpture, as contrasted with a reproduction of it."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code a)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "aro",
   :skos/prefLabel "art original"})

(def arr
  "Two or three-dimensional mechanically reproduced copy of a work of art, generally as one of a commercial edition."
  {:db/ident :loc.marcgt/arr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
     :ri/recordContentSource :loc.marcgt/arr,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2023-01-20T05:00:00.000-00:00",
     :ri/recordContentSource :loc.marcgt/arr,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "art reproduction",
   :madsrdf/code "arr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Two or three-dimensional mechanically reproduced copy of a work of art, generally as one of a commercial edition."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code c)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2023-01-20T05:00:00.000-00:00",
                      :cs/creatorName     :loc.marcgt/arr,
                      :cs/subjectOfChange :loc.marcgt/arr,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                      :cs/creatorName     :loc.marcgt/arr,
                      :cs/subjectOfChange :loc.marcgt/arr,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Two or three-dimensional mechanically reproduced copy of a work of art, generally as one of a commercial edition."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code c)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "arr",
   :skos/prefLabel "art reproduction"})

(def art
  "Composition prepared for publication as an independent portion of a magazine, newspaper, encyclopedia, or other work."
  {:db/ident :loc.marcgt/art,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/art,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "article",
   :madsrdf/code "art",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Composition prepared for publication as an independent portion of a magazine, newspaper, encyclopedia, or other work."},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/art,
                     :cs/subjectOfChange :loc.marcgt/art,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Composition prepared for publication as an independent portion of a magazine, newspaper, encyclopedia, or other work."},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "art",
   :skos/prefLabel "article"})

(def atl
  "A resource that contain maps, related text, and other cartographic information."
  {:db/ident :loc.marcgt/atl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/atl,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "atlas",
   :madsrdf/code "atl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A resource that contain maps, related text, and other cartographic information."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "or 007/01 MP (code d)"}
                         {:rdf/language "en",
                          :rdf/value    "008/25 MP (code e)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/atl,
                     :cs/subjectOfChange :loc.marcgt/atl,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource that contain maps, related text, and other cartographic information."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "or 007/01 MP (code d)"}
                      {:rdf/language "en",
                       :rdf/value    "008/25 MP (code e)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "atl",
   :skos/prefLabel "atlas"})

(def aut
  "Biographies of individuals written by themselves."
  {:db/ident :loc.marcgt/aut,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/aut,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "autobiography",
   :madsrdf/code "aut",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Biographies of individuals written by themselves."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code a)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/aut,
                     :cs/subjectOfChange :loc.marcgt/aut,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Biographies of individuals written by themselves."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code a)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "aut",
   :skos/prefLabel "autobiography"})

(def bda
  "Data with bibliographic citations. Includes data from library catalogs or citation databases. The data may be in a structured or unstructured form. Search software may be present, but the purpose of the record is description of the content of the bibliographic data or database, rather than description of the online system or service."
  {:db/ident :loc.marcgt/bda,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/bda,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "bibliographic data",
   :madsrdf/code "bda",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Data with bibliographic citations. Includes data from library catalogs or citation databases. The data may be in a structured or unstructured form. Search software may be present, but the purpose of the record is description of the content of the bibliographic data or database, rather than description of the online system or service."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/26 CF (code e)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/bda,
                     :cs/subjectOfChange :loc.marcgt/bda,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Data with bibliographic citations. Includes data from library catalogs or citation databases. The data may be in a structured or unstructured form. Search software may be present, but the purpose of the record is description of the content of the bibliographic data or database, rather than description of the online system or service."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code e)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "bda",
   :skos/prefLabel "bibliographic data"})

(def bib
  "List of books, documents, and other bibliographical items, often all related by author, topic, or another criterion. Bibliographies are arranged in some logical order giving brief information about the works, such as author, date, publisher, and place of publication."
  {:db/ident :loc.marcgt/bib,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/bib,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "bibliography",
   :madsrdf/code "bib",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "List of books, documents, and other bibliographical items, often all related by author, topic, or another criterion. Bibliographies are arranged in some logical order giving brief information about the works, such as author, date, publisher, and place of publication."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code b)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code b)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/bib,
                     :cs/subjectOfChange :loc.marcgt/bib,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "List of books, documents, and other bibliographical items, often all related by author, topic, or another criterion. Bibliographies are arranged in some logical order giving brief information about the works, such as author, date, publisher, and place of publication."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code b)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code b)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "bib",
   :skos/prefLabel "bibliography"})

(def bio
  "The genre of nonfiction that concerns accounts of the lives of individuals."
  {:db/ident :loc.marcgt/bio,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/bio,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "biography",
   :madsrdf/code "bio",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The genre of nonfiction that concerns accounts of the lives of individuals."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/34 BK (codes a,b,c,d)"}
                         {:rdf/language "en",
                          :rdf/value    "008/30-31 MU (code b)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/bio,
                     :cs/subjectOfChange :loc.marcgt/bio,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The genre of nonfiction that concerns accounts of the lives of individuals."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/34 BK (codes a,b,c,d)"}
                      {:rdf/language "en",
                       :rdf/value    "008/30-31 MU (code b)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "bio",
   :skos/prefLabel "biography"})

(def boo
  "Item comprising a collection of leaves of paper, parchment, wood, stiffened textile, ivory, metal tablets, or other flat material, that are blank, written on, or printed, and are strung or bound together in a volume. Includes e-book or electronic resource structured like a book."
  {:db/ident :loc.marcgt/boo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/boo,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "book",
   :madsrdf/code "boo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Item comprising a collection of leaves of paper, parchment, wood, stiffened textile, ivory, metal tablets, or other flat material, that are blank, written on, or printed, and are strung or bound together in a volume. Includes e-book or electronic resource structured like a book."},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/boo,
                     :cs/subjectOfChange :loc.marcgt/boo,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Item comprising a collection of leaves of paper, parchment, wood, stiffened textile, ivory, metal tablets, or other flat material, that are blank, written on, or printed, and are strung or bound together in a volume. Includes e-book or electronic resource structured like a book."},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "boo",
   :skos/prefLabel "book"})

(def cal
  "Published system of organizing days. These may be academic calendars or almanacs, calendars published by bodies, such as labor organizations, library associations, etc."
  {:db/ident :loc.marcgt/cal,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/cal,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "calendar",
   :madsrdf/code "cal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published system of organizing days. These may be academic calendars or almanacs, calendars published by bodies, such as labor organizations, library associations, etc."},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "008/24 CR; 008/25-27 CR (code 5); 008/33-34 MP (code k)"}
    {:rdf/language "en",
     :rdf/value    "008/24-27 BK (code 5)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/cal,
                     :cs/subjectOfChange :loc.marcgt/cal,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published system of organizing days. These may be academic calendars or almanacs, calendars published by bodies, such as labor organizations, library associations, etc."},
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "008/24 CR; 008/25-27 CR (code 5); 008/33-34 MP (code k)"}
    {:rdf/language "en",
     :rdf/value    "008/24-27 BK (code 5)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "cal",
   :skos/prefLabel "calendar"})

(def cat
  "List of items in a collection, such as a collection of books, a collection of art objects, etc."
  {:db/ident :loc.marcgt/cat,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/cat,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "catalog",
   :madsrdf/code "cat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "List of items in a collection, such as a collection of books, a collection of art objects, etc."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code c)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code c)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/cat,
                     :cs/subjectOfChange :loc.marcgt/cat,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "List of items in a collection, such as a collection of books, a collection of art objects, etc."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code c)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code c)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "cat",
   :skos/prefLabel "catalog"})

(def cgn
  "Instance of \"sequential art\" in which a story (whether fact or fiction) is told primarily through a set of images (often in the form of multiple \"panels\" per page) presented concurrently but meant to be \"read\" sequentially by the viewer. The accompanying narrative and/or dialog text, when it occurs, works integrally with the images to tell the story."
  {:db/ident :loc.marcgt/cgn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/cgn,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "comic or graphic novel",
   :madsrdf/code "cgn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Instance of \"sequential art\" in which a story (whether fact or fiction) is told primarily through a set of images (often in the form of multiple \"panels\" per page) presented concurrently but meant to be \"read\" sequentially by the viewer. The accompanying narrative and/or dialog text, when it occurs, works integrally with the images to tell the story."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code 6)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code 6)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/cgn,
                     :cs/subjectOfChange :loc.marcgt/cgn,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Instance of \"sequential art\" in which a story (whether fact or fiction) is told primarily through a set of images (often in the form of multiple \"panels\" per page) presented concurrently but meant to be \"read\" sequentially by the viewer. The accompanying narrative and/or dialog text, when it occurs, works integrally with the images to tell the story."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code 6)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code 6)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "cgn",
   :skos/prefLabel "comic or graphic novel"})

(def cha
  "Opaque sheet that exhibits data in graphic or tabular form (e.g., a calendar)."
  {:db/ident :loc.marcgt/cha,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/cha,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "chart",
   :madsrdf/code "cha",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Opaque sheet that exhibits data in graphic or tabular form (e.g., a calendar)."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code n)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/cha,
                     :cs/subjectOfChange :loc.marcgt/cha,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Opaque sheet that exhibits data in graphic or tabular form (e.g., a calendar)."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code n)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "cha",
   :skos/prefLabel "chart"})

(def cod
  "Genre encompassing forms of theatre, literature, and improvisation with the basic objective to amuse, humor, and induce laughter."
  {:db/ident :loc.marcgt/cod,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/cod,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "comedy",
   :madsrdf/code "cod",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Genre encompassing forms of theatre, literature, and improvisation with the basic objective to amuse, humor, and induce laughter."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 MU (code k)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/cod,
                     :cs/subjectOfChange :loc.marcgt/cod,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Genre encompassing forms of theatre, literature, and improvisation with the basic objective to amuse, humor, and induce laughter."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 MU (code k)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "cod",
   :skos/prefLabel "comedy"})

(def com
  "Ordered set of instructions directing the computer to perform basic operations and identifying the information and mechanisms required. Includes videogames and microcomputer software and computer models."
  {:db/ident :loc.marcgt/com,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/com,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer program",
   :madsrdf/code "com",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Ordered set of instructions directing the computer to perform basic operations and identifying the information and mechanisms required. Includes videogames and microcomputer software and computer models."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/26 CF (code b)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/com,
                     :cs/subjectOfChange :loc.marcgt/com,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Ordered set of instructions directing the computer to perform basic operations and identifying the information and mechanisms required. Includes videogames and microcomputer software and computer models."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code b)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "com",
   :skos/prefLabel "computer program"})

(def cpb
  "Proceedings, reports, or summaries of a conference."
  {:db/ident :loc.marcgt/cpb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/cpb,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "conference publication",
   :madsrdf/code "cpb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Proceedings, reports, or summaries of a conference."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/29 BK,CR (code 1)"}
                         {:rdf/language "en",
                          :rdf/value    "008/30-31 MU (code c)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/cpb,
                     :cs/subjectOfChange :loc.marcgt/cpb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Proceedings, reports, or summaries of a conference."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/30-31 MU (code c)"}
                      {:rdf/language "en",
                       :rdf/value    "008/29 BK,CR (code 1)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "cpb",
   :skos/prefLabel "conference publication"})

(def dic
  "Dictionary, glossary, or gazeteer"
  {:db/ident :loc.marcgt/dic,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/dic,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "dictionary",
   :madsrdf/code "dic",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Dictionary, glossary, or gazeteer"},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code d)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code d)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/dic,
                     :cs/subjectOfChange :loc.marcgt/dic,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Dictionary, glossary, or gazeteer"},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code d)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code d)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "dic",
   :skos/prefLabel "dictionary"})

(def dio
  "Three-dimensional representation of a scene created by placing objects, figures, etc. in front of a two-dimensional background."
  {:db/ident :loc.marcgt/dio,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/dio,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "diorama",
   :madsrdf/code "dio",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Three-dimensional representation of a scene created by placing objects, figures, etc. in front of a two-dimensional background."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code d)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/dio,
                     :cs/subjectOfChange :loc.marcgt/dio,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Three-dimensional representation of a scene created by placing objects, figures, etc. in front of a two-dimensional background."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code d)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "dio",
   :skos/prefLabel "diorama"})

(def dir
  "Directory or register of persons or corporate bodies."
  {:db/ident :loc.marcgt/dir,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/dir,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "directory",
   :madsrdf/code "dir",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Directory or register of persons or corporate bodies."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code r)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code r)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/dir,
                     :cs/subjectOfChange :loc.marcgt/dir,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Directory or register of persons or corporate bodies."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code r)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code r)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "dir",
   :skos/prefLabel "directory"})

(def dis
  "Bibliography of recorded sound."
  {:db/ident :loc.marcgt/dis,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/dis,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "discography",
   :madsrdf/code "dis",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Bibliography of recorded sound."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code k)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code k)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/dis,
                     :cs/subjectOfChange :loc.marcgt/dis,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Bibliography of recorded sound."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code k)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code k)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "dis",
   :skos/prefLabel "discography"})

(def doc
  "Textual document, consisting mostly of alphabetic information (words or sentences) converted into a coded format that can be processed, sorted, and manipulated by machine, and then retrieved in many optional formats."
  {:db/ident :loc.marcgt/doc,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/doc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "document (computer)",
   :madsrdf/code "doc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Textual document, consisting mostly of alphabetic information (words or sentences) converted into a coded format that can be processed, sorted, and manipulated by machine, and then retrieved in many optional formats."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/26 CF (code d)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/doc,
                     :cs/subjectOfChange :loc.marcgt/doc,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Textual document, consisting mostly of alphabetic information (words or sentences) converted into a coded format that can be processed, sorted, and manipulated by machine, and then retrieved in many optional formats."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code d)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "doc",
   :skos/prefLabel "document (computer)"})

(def dra
  "Academically oriented study of theater, comprising theater criticism, history, aesthetics, and the study of drama as a specialized form of literature."
  {:db/ident :loc.marcgt/dra,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/dra,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "drama",
   :madsrdf/code "dra",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Academically oriented study of theater, comprising theater criticism, history, aesthetics, and the study of drama as a specialized form of literature."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/30-31 MU (code d)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 CR (code d)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/dra,
                     :cs/subjectOfChange :loc.marcgt/dra,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Academically oriented study of theater, comprising theater criticism, history, aesthetics, and the study of drama as a specialized form of literature."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/30-31 MU (code d)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 CR (code d)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "dra",
   :skos/prefLabel "drama"})

(def dtb
  "Collection of logically interrelated data stored together in one or more computerized files, usually created and managed by a database. management system."
  {:db/ident :loc.marcgt/dtb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/dtb,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "database",
   :madsrdf/code "dtb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Collection of logically interrelated data stored together in one or more computerized files, usually created and managed by a database. management system."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/21 CR (code d)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/dtb,
                     :cs/subjectOfChange :loc.marcgt/dtb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Collection of logically interrelated data stored together in one or more computerized files, usually created and managed by a database. management system."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/21 CR (code d)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "dtb",
   :skos/prefLabel "database"})

(def enc
  "Book, set of books, or disk, containing informational articles on subjects in every field of knowledge, or limited to a special field or subject, usually arranged in alphabetical order."
  {:db/ident :loc.marcgt/enc,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/enc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "encyclopedia",
   :madsrdf/code "enc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Book, set of books, or disk, containing informational articles on subjects in every field of knowledge, or limited to a special field or subject, usually arranged in alphabetical order."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code e)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 CR (code e)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/enc,
                     :cs/subjectOfChange :loc.marcgt/enc,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Book, set of books, or disk, containing informational articles on subjects in every field of knowledge, or limited to a special field or subject, usually arranged in alphabetical order."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 CR (code e)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code e)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "enc",
   :skos/prefLabel "encyclopedia"})

(def ess
  "Short literary composition on a single subject, often presenting the personal view of the author."
  {:db/ident :loc.marcgt/ess,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/ess,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "essay",
   :madsrdf/code "ess",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Short literary composition on a single subject, often presenting the personal view of the author."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/33 BK (code e)"}
                         {:rdf/language "en",
                          :rdf/value    "008/30-31 MU (code e)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/ess,
                     :cs/subjectOfChange :loc.marcgt/ess,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Short literary composition on a single subject, often presenting the personal view of the author."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/30-31 MU (code e)"}
                      {:rdf/language "en",
                       :rdf/value    "008/33 BK (code e)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "ess",
   :skos/prefLabel "essay"})

(def fes
  "Complimentary or memorial publication usually in the form of a collection of essays, addresses, or biographical, bibliographic, scientific, or other contributions. It often embodies the results of research, issued in honor of a person, an institution, or a society, as a rule, on the occasion of an anniversary celebration."
  {:db/ident :loc.marcgt/fes,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/fes,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "festschrift",
   :madsrdf/code "fes",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Complimentary or memorial publication usually in the form of a collection of essays, addresses, or biographical, bibliographic, scientific, or other contributions. It often embodies the results of research, issued in honor of a person, an institution, or a society, as a rule, on the occasion of an anniversary celebration."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30 BK (code 1)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/fes,
                     :cs/subjectOfChange :loc.marcgt/fes,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Complimentary or memorial publication usually in the form of a collection of essays, addresses, or biographical, bibliographic, scientific, or other contributions. It often embodies the results of research, issued in honor of a person, an institution, or a society, as a rule, on the occasion of an anniversary celebration."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30 BK (code 1)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "fes",
   :skos/prefLabel "festschrift"})

(def fic
  "Work of fiction but no further identification of the literary form is specified."
  {:db/ident :loc.marcgt/fic,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/fic,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "fiction",
   :madsrdf/code "fic",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Work of fiction but no further identification of the literary form is specified."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/33 (code 1)"}
                         {:rdf/language "en",
                          :rdf/value    "008/30-31 MU (code f)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/fic,
                     :cs/subjectOfChange :loc.marcgt/fic,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Work of fiction but no further identification of the literary form is specified."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/30-31 MU (code f)"}
                      {:rdf/language "en",
                       :rdf/value    "008/33 (code 1)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "fic",
   :skos/prefLabel "fiction"})

(def fil
  "Bibliography of moving images."
  {:db/ident :loc.marcgt/fil,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/fil,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "filmography",
   :madsrdf/code "fil",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Bibliography of moving images."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code q)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code q)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/fil,
                     :cs/subjectOfChange :loc.marcgt/fil,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Bibliography of moving images."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code q)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code q)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "fil",
   :skos/prefLabel "filmography"})

(def fin
  "Document, published or unpublished, listing or describing a body of records within a records center or archives, making them more readily accessible and comprehensible to the user."
  {:db/ident :loc.marcgt/fin,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/fin,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "finding aid",
   :madsrdf/code "fin",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Document, published or unpublished, listing or describing a body of records within a records center or archives, making them more readily accessible and comprehensible to the user."},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/fin,
                     :cs/subjectOfChange :loc.marcgt/fin,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Document, published or unpublished, listing or describing a body of records within a records center or archives, making them more readily accessible and comprehensible to the user."},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "fin",
   :skos/prefLabel "finding aid"})

(def fla
  "Card or other opaque material printed with words, numerals, or pictures and designed for rapid display. Activity cards are included in this category."
  {:db/ident :loc.marcgt/fla,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/fla,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "flash card",
   :madsrdf/code "fla",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Card or other opaque material printed with words, numerals, or pictures and designed for rapid display. Activity cards are included in this category."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code o)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/fla,
                     :cs/subjectOfChange :loc.marcgt/fla,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Card or other opaque material printed with words, numerals, or pictures and designed for rapid display. Activity cards are included in this category."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code o)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "fla",
   :skos/prefLabel "flash card"})

(def fls
  "Length of film containing a succession of images intended for projection one frame at a time with or without recorded sound."
  {:db/ident :loc.marcgt/fls,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/fls,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "filmstrip",
   :madsrdf/code "fls",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Length of film containing a succession of images intended for projection one frame at a time with or without recorded sound."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code f)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/fls,
                     :cs/subjectOfChange :loc.marcgt/fls,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Length of film containing a succession of images intended for projection one frame at a time with or without recorded sound."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code f)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "fls",
   :skos/prefLabel "filmstrip"})

(def fol
  "Timeless story or legend in popular culture that are passed down over time, often orally."
  {:db/ident :loc.marcgt/fol,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/fol,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "folktale",
   :madsrdf/code "fol",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Timeless story or legend in popular culture that are passed down over time, often orally."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code o)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/fol,
                     :cs/subjectOfChange :loc.marcgt/fol,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Timeless story or legend in popular culture that are passed down over time, often orally."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code o)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "fol",
   :skos/prefLabel "folktale"})

(def fon
  "Information for a computer to produce fonts."
  {:db/ident :loc.marcgt/fon,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/fon,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "font",
   :madsrdf/code "fon",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Information for a computer to produce fonts."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/26 CF (code f)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/fon,
                     :cs/subjectOfChange :loc.marcgt/fon,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Information for a computer to produce fonts."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code f)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "fon",
   :skos/prefLabel "font"})

(def gam
  "Item or set of items designed for play according to prescribed rules and intended for recreation or instruction. Computer or video games consist of text and software."
  {:db/ident :loc.marcgt/gam,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/gam,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "game",
   :madsrdf/code "gam",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Item or set of items designed for play according to prescribed rules and intended for recreation or instruction. Computer or video games consist of text and software."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "008/26 CF (code g) 008/33-34 MP (code n)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/gam,
                     :cs/subjectOfChange :loc.marcgt/gam,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Item or set of items designed for play according to prescribed rules and intended for recreation or instruction. Computer or video games consist of text and software."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code g) 008/33-34 MP (code n)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "gam",
   :skos/prefLabel "game"})

(def glo
  "The model of a celestial body, usually the Earth or the celestial sphere, depicted on the surface of a sphere."
  {:db/ident :loc.marcgt/glo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/glo,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "globe",
   :madsrdf/code "glo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The model of a celestial body, usually the Earth or the celestial sphere, depicted on the surface of a sphere."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/25 MP (code d)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/glo,
                     :cs/subjectOfChange :loc.marcgt/glo,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The model of a celestial body, usually the Earth or the celestial sphere, depicted on the surface of a sphere."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/25 MP (code d)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "glo",
   :skos/prefLabel "globe"})

(def gov
  "Resource published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."
  {:db/ident :loc.marcgt/gov,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/gov,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "government publication",
   :madsrdf/code "gov",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value
     "008/28 CF; 008/28 CR; 008/28 MP; 008/28 VM (code a,c,f,I,l,m,o,s,u,z)"}
    {:rdf/language "en",
     :rdf/value    "008/28 BK (code a,c,f,i,l,m,o,s,u,z)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/gov,
                     :cs/subjectOfChange :loc.marcgt/gov,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."},
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value
     "008/28 CF; 008/28 CR; 008/28 MP; 008/28 VM (code a,c,f,I,l,m,o,s,u,z)"}
    {:rdf/language "en",
     :rdf/value    "008/28 BK (code a,c,f,i,l,m,o,s,u,z)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "gov",
   :skos/prefLabel "government publication"})

(def gra
  "General term used for original or historical graphic material."
  {:db/ident :loc.marcgt/gra,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/gra,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "graphic",
   :madsrdf/code "gra",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "General term used for original or historical graphic material."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code k)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/gra,
                     :cs/subjectOfChange :loc.marcgt/gra,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "General term used for original or historical graphic material."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code k)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "gra",
   :skos/prefLabel "graphic"})

(def han
  "Portable book, treatise, or compendium, covering one or more subjects, arranged for quick location of information and of a size such as may conveniently be held in the hand."
  {:db/ident :loc.marcgt/han,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/han,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "handbook",
   :madsrdf/code "han",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Portable book, treatise, or compendium, covering one or more subjects, arranged for quick location of information and of a size such as may conveniently be held in the hand."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24; 008/25-27 CR (code f)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code f)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/han,
                     :cs/subjectOfChange :loc.marcgt/han,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Portable book, treatise, or compendium, covering one or more subjects, arranged for quick location of information and of a size such as may conveniently be held in the hand."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code f)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24; 008/25-27 CR (code f)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "han",
   :skos/prefLabel "handbook"})

(def his
  "Chronological record of significant events, as of the life or development of a people, country, or institution, often with an explanation of the causes."
  {:db/ident :loc.marcgt/his,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/his,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "history",
   :madsrdf/code "his",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Chronological record of significant events, as of the life or development of a people, country, or institution, often with an explanation of the causes."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code h)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/his,
                     :cs/subjectOfChange :loc.marcgt/his,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Chronological record of significant events, as of the life or development of a people, country, or institution, often with an explanation of the causes."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code h)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "his",
   :skos/prefLabel "history"})

(def hum
  "Humorous work, satire, or of similar literary form."
  {:db/ident :loc.marcgt/hum,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/hum,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "humor, satire",
   :madsrdf/code "hum",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Humorous work, satire, or of similar literary form."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/30-31 MU (code k)"}
                         {:rdf/language "en",
                          :rdf/value    "008/33 BK (code h)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/hum,
                     :cs/subjectOfChange :loc.marcgt/hum,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Humorous work, satire, or of similar literary form."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/30-31 MU (code k)"}
                      {:rdf/language "en",
                       :rdf/value    "008/33 BK (code h)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "hum",
   :skos/prefLabel "humor, satire"})

(def ind
  "Systematic guide to the contents of texts, files, documents, or collections, presented as a list, usually in alphabetical order, of persons and/or subjects referred to in documents, with location of references thereto."
  {:db/ident :loc.marcgt/ind,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/ind,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "index",
   :madsrdf/code "ind",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Systematic guide to the contents of texts, files, documents, or collections, presented as a list, usually in alphabetical order, of persons and/or subjects referred to in documents, with location of references thereto."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code i)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code i)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/ind,
                     :cs/subjectOfChange :loc.marcgt/ind,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Systematic guide to the contents of texts, files, documents, or collections, presented as a list, usually in alphabetical order, of persons and/or subjects referred to in documents, with location of references thereto."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code i)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code i)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "ind",
   :skos/prefLabel "index"})

(def inm
  "Supports navigation through and manipulation of many kinds of media (i.e., audio, video, etc.). Interactive multimedia usually gives the user a high level of control, often allowing almost conversational interaction with the computer and data."
  {:db/ident :loc.marcgt/inm,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/inm,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "interactive multimedia",
   :madsrdf/code "inm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Supports navigation through and manipulation of many kinds of media (i.e., audio, video, etc.). Interactive multimedia usually gives the user a high level of control, often allowing almost conversational interaction with the computer and data."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/26 CF (code i)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/inm,
                     :cs/subjectOfChange :loc.marcgt/inm,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Supports navigation through and manipulation of many kinds of media (i.e., audio, video, etc.). Interactive multimedia usually gives the user a high level of control, often allowing almost conversational interaction with the computer and data."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code i)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "inm",
   :skos/prefLabel "interactive multimedia"})

(def ins
  "Instruction on how to accomplish a task, learn an art, etc."
  {:db/ident :loc.marcgt/ins,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/ins,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "instruction",
   :madsrdf/code "ins",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Instruction on how to accomplish a task, learn an art, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code i)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/ins,
                     :cs/subjectOfChange :loc.marcgt/ins,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Instruction on how to accomplish a task, learn an art, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code i)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "ins",
   :skos/prefLabel "instruction"})

(def int
  "Statement, transcript, or recording of conversations in which one person obtains information from another such as for research purposes, publication, or broadcast."
  {:db/ident :loc.marcgt/int,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/int,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "interview",
   :madsrdf/code "int",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Statement, transcript, or recording of conversations in which one person obtains information from another such as for research purposes, publication, or broadcast."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code t)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/int,
                     :cs/subjectOfChange :loc.marcgt/int,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Statement, transcript, or recording of conversations in which one person obtains information from another such as for research purposes, publication, or broadcast."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code t)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "int",
   :skos/prefLabel "interview"})

(def iss
  "all examples of a set number or amount of multiples, such as coins, notes, stamps, prints, copies of a newspaper, books, periodicals, etc. that were issued at one time or otherwise sharply distinguished in pattern, design, color, or identifying numbers from those issued at another time."
  {:db/ident :loc.marcgt/iss,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/iss,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "issue",
   :madsrdf/code "iss",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "all examples of a set number or amount of multiples, such as coins, notes, stamps, prints, copies of a newspaper, books, periodicals, etc. that were issued at one time or otherwise sharply distinguished in pattern, design, color, or identifying numbers from those issued at another time."},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/iss,
                     :cs/subjectOfChange :loc.marcgt/iss,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "all examples of a set number or amount of multiples, such as coins, notes, stamps, prints, copies of a newspaper, books, periodicals, etc. that were issued at one time or otherwise sharply distinguished in pattern, design, color, or identifying numbers from those issued at another time."},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "iss",
   :skos/prefLabel "issue"})

(def jou
  "Periodical publication, particularly those containing scholarly articles or otherwise disseminating information on developments in a particular subject field."
  {:db/ident :loc.marcgt/jou,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/jou,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "journal",
   :madsrdf/code "jou",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Periodical publication, particularly those containing scholarly articles or otherwise disseminating information on developments in a particular subject field."},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/jou,
                     :cs/subjectOfChange :loc.marcgt/jou,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Periodical publication, particularly those containing scholarly articles or otherwise disseminating information on developments in a particular subject field."},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "jou",
   :skos/prefLabel "journal"})

(def kit
  "Mixture of components from two or more categories, that is, sound recording, maps, filmstrips, etc., no one of which is the predominant constituent of the item."
  {:db/ident :loc.marcgt/kit,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/kit,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "kit",
   :madsrdf/code "kit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Mixture of components from two or more categories, that is, sound recording, maps, filmstrips, etc., no one of which is the predominant constituent of the item."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code b)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/kit,
                     :cs/subjectOfChange :loc.marcgt/kit,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Mixture of components from two or more categories, that is, sound recording, maps, filmstrips, etc., no one of which is the predominant constituent of the item."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code b)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "kit",
   :skos/prefLabel "kit"})

(def lan
  "language instruction"
  {:db/ident :loc.marcgt/lan,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/lan,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "language instruction",
   :madsrdf/code "lan",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code j)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/lan,
                     :cs/subjectOfChange :loc.marcgt/lan,
                     :rdf/type           :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code j)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "lan",
   :skos/prefLabel "language instruction"})

(def law
  "also includes the packages of material called laboratory kits, and packages of assorted materials, such as a set of K-12 social studies curriculum material (all books, workbooks, guides, activities, etc.) or packages of educational test materials (tests, answer sheets, scoring guides, score charts, interpretative manuals, etc.)."
  {:db/ident :loc.marcgt/law,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/law,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "law report or digest",
   :madsrdf/code "law",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "also includes the packages of material called laboratory kits, and packages of assorted materials, such as a set of K-12 social studies curriculum material (all books, workbooks, guides, activities, etc.) or packages of educational test materials (tests, answer sheets, scoring guides, score charts, interpretative manuals, etc.)."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code w)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code w)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/law,
                     :cs/subjectOfChange :loc.marcgt/law,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "also includes the packages of material called laboratory kits, and packages of assorted materials, such as a set of K-12 social studies curriculum material (all books, workbooks, guides, activities, etc.) or packages of educational test materials (tests, answer sheets, scoring guides, score charts, interpretative manuals, etc.)."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code w)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code w)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "law",
   :skos/prefLabel "law report or digest"})

(def lea
  "legal article"
  {:db/ident :loc.marcgt/lea,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/lea,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "legal article",
   :madsrdf/code "lea",
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code g)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code g)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/lea,
                     :cs/subjectOfChange :loc.marcgt/lea,
                     :rdf/type           :cs/ChangeSet},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code g)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code g)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "lea",
   :skos/prefLabel "legal article"})

(def lec
  "Discussion, such as those in the case comments section of law school reviews, of particular legal cases that have been decided by, or that are pending before, courts or administrative agencies."
  {:db/ident :loc.marcgt/lec,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/lec,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "legal case and case notes",
   :madsrdf/code "lec",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Discussion, such as those in the case comments section of law school reviews, of particular legal cases that have been decided by, or that are pending before, courts or administrative agencies."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code v)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code v)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/lec,
                     :cs/subjectOfChange :loc.marcgt/lec,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Discussion, such as those in the case comments section of law school reviews, of particular legal cases that have been decided by, or that are pending before, courts or administrative agencies."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code v)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code v)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "lec",
   :skos/prefLabel "legal case and case notes"})

(def leg
  "Full or partial texts of enactments of legislative bodies, published either in statute or in code form, or texts of rules and regulations issued by executive or administrative agencies."
  {:db/ident :loc.marcgt/leg,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/leg,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "legislation",
   :madsrdf/code "leg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Full or partial texts of enactments of legislative bodies, published either in statute or in code form, or texts of rules and regulations issued by executive or administrative agencies."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "008/24-27 BK (code l) 008/24 CR; 008/25-27 CR (code l)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/leg,
                     :cs/subjectOfChange :loc.marcgt/leg,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Full or partial texts of enactments of legislative bodies, published either in statute or in code form, or texts of rules and regulations issued by executive or administrative agencies."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "008/24-27 BK (code l) 008/24 CR; 008/25-27 CR (code l)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "leg",
   :skos/prefLabel "legislation"})

(def let
  "Single letter or collection of correspondence."
  {:db/ident :loc.marcgt/let,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/let,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "letter",
   :madsrdf/code "let",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Single letter or collection of correspondence."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 BK (code i)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/let,
                     :cs/subjectOfChange :loc.marcgt/let,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Single letter or collection of correspondence."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 BK (code i)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "let",
   :skos/prefLabel "letter"})

(def loo
  "Resource that consists of a base volume(s) updated by separate pages or leaves which are inserted, removed, and/or substituted."
  {:db/ident :loc.marcgt/loo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/loo,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "loose-leaf",
   :madsrdf/code "loo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource that consists of a base volume(s) updated by separate pages or leaves which are inserted, removed, and/or substituted."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/21 CR (code l)"}
                         {:rdf/language "en",
                          :rdf/value    "008/33-34 MP (code o)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/loo,
                     :cs/subjectOfChange :loc.marcgt/loo,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource that consists of a base volume(s) updated by separate pages or leaves which are inserted, removed, and/or substituted."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/21 CR (code l)"}
                      {:rdf/language "en",
                       :rdf/value    "008/33-34 MP (code o)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "loo",
   :skos/prefLabel "loose-leaf"})

(def man
  "Handwritten documents, particularly books and other documents created before the invention of the printing press. Includes originals of compiled maps, drawn but not printed; loosely, any map drawn by hand."
  {:db/ident :loc.marcgt/man,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/man,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "manuscript",
   :madsrdf/code "man",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Handwritten documents, particularly books and other documents created before the invention of the printing press. Includes originals of compiled maps, drawn but not printed; loosely, any map drawn by hand."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33-34 MP (code e)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/man,
                     :cs/subjectOfChange :loc.marcgt/man,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Handwritten documents, particularly books and other documents created before the invention of the printing press. Includes originals of compiled maps, drawn but not printed; loosely, any map drawn by hand."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33-34 MP (code e)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "man",
   :skos/prefLabel "manuscript"})

(def map
  "Representation normally to scale and on a flat medium, of a selection of material or abstract features on, or in relation to, the surface of the earth or of another celestial body."
  {:db/ident :loc.marcgt/map,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/map,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "map",
   :madsrdf/code "map",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Representation normally to scale and on a flat medium, of a selection of material or abstract features on, or in relation to, the surface of the earth or of another celestial body."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/25 MP (code a,b,c)"}
                         {:rdf/language "en",
                          :rdf/value    "or 007/01 MP (code j)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/map,
                     :cs/subjectOfChange :loc.marcgt/map,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Representation normally to scale and on a flat medium, of a selection of material or abstract features on, or in relation to, the surface of the earth or of another celestial body."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "or 007/01 MP (code j)"}
                      {:rdf/language "en",
                       :rdf/value    "008/25 MP (code a,b,c)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "map",
   :skos/prefLabel "map"})

(def mem
  "Narrative or history autobiographical in nature or stressing the author's personal experience of the events."
  {:db/ident :loc.marcgt/mem,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/mem,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "memoir",
   :madsrdf/code "mem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Narrative or history autobiographical in nature or stressing the author's personal experience of the events."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code m)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/mem,
                     :cs/subjectOfChange :loc.marcgt/mem,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Narrative or history autobiographical in nature or stressing the author's personal experience of the events."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code m)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "mem",
   :skos/prefLabel "memoir"})

(def mic
  "Transparent mount, usually glass, containing a minute object to be viewed through a microscope or microprojector."
  {:db/ident :loc.marcgt/mic,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/mic,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microscope slide",
   :madsrdf/code "mic",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Transparent mount, usually glass, containing a minute object to be viewed through a microscope or microprojector."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code p)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/mic,
                     :cs/subjectOfChange :loc.marcgt/mic,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Transparent mount, usually glass, containing a minute object to be viewed through a microscope or microprojector."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code p)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "mic",
   :skos/prefLabel "microscope slide"})

(def mod
  "Three-dimensional representation of a real thing, either of the exact size of the original or to scale."
  {:db/ident :loc.marcgt/mod,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/mod,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "model",
   :madsrdf/code "mod",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Three-dimensional representation of a real thing, either of the exact size of the original or to scale."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "or 007/01 MP (code q)"}
                         {:rdf/language "en",
                          :rdf/value    "008/33 VM (code q)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/mod,
                     :cs/subjectOfChange :loc.marcgt/mod,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Three-dimensional representation of a real thing, either of the exact size of the original or to scale."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "or 007/01 MP (code q)"}
                      {:rdf/language "en",
                       :rdf/value    "008/33 VM (code q)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "mod",
   :skos/prefLabel "model"})

(def mot
  "Series of still pictures on film with or without sound, designed to be projected in rapid succession to produce the optical effect of motion."
  {:db/ident :loc.marcgt/mot,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/mot,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "motion picture",
   :madsrdf/code "mot",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Series of still pictures on film with or without sound, designed to be projected in rapid succession to produce the optical effect of motion."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code m)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/mot,
                     :cs/subjectOfChange :loc.marcgt/mot,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Series of still pictures on film with or without sound, designed to be projected in rapid succession to produce the optical effect of motion."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code m)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "mot",
   :skos/prefLabel "motion picture"})

(def new
  "Resource that is mainly designed to be a primary source of written information on current events connected with public affairs, either local, national and/or international in scope."
  {:db/ident :loc.marcgt/new,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/new,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "newspaper",
   :madsrdf/code "new",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource that is mainly designed to be a primary source of written information on current events connected with public affairs, either local, national and/or international in scope."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/21 CR (code n)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/new,
                     :cs/subjectOfChange :loc.marcgt/new,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource that is mainly designed to be a primary source of written information on current events connected with public affairs, either local, national and/or international in scope."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/21 CR (code n)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "new",
   :skos/prefLabel "newspaper"})

(def nos
  "Nonmusical utterances and vocalizations that may or may not convey meaning."
  {:db/ident :loc.marcgt/nos,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/nos,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "nonmusical sound",
   :madsrdf/code "nos",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Nonmusical utterances and vocalizations that may or may not convey meaning."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code s)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/nos,
                     :cs/subjectOfChange :loc.marcgt/nos,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Nonmusical utterances and vocalizations that may or may not convey meaning."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code s)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "nos",
   :skos/prefLabel "nonmusical sound"})

(def nov
  "novel"
  {:db/ident :loc.marcgt/nov,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/nov,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "novel",
   :madsrdf/code "nov",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 BK (code f)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/nov,
                     :cs/subjectOfChange :loc.marcgt/nov,
                     :rdf/type           :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 BK (code f)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "nov",
   :skos/prefLabel "novel"})

(def num
  "Numbers or representation by numbers, such as records containing all information on student test scores, all information on football team statistics, etc. Information may be original surveys and/or information that has been summarized or statistically manipulated."
  {:db/ident :loc.marcgt/num,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/num,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "numeric data",
   :madsrdf/code "num",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Numbers or representation by numbers, such as records containing all information on student test scores, all information on football team statistics, etc. Information may be original surveys and/or information that has been summarized or statistically manipulated."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/26 CF (code a)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/num,
                     :cs/subjectOfChange :loc.marcgt/num,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Numbers or representation by numbers, such as records containing all information on student test scores, all information on football team statistics, etc. Information may be original surveys and/or information that has been summarized or statistically manipulated."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code a)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "num",
   :skos/prefLabel "numeric data"})

(def off
  "Publication that originally was published as an article in a monograph or a serial and that is also issued separately and independently. Includes preprints and postprints."
  {:db/ident :loc.marcgt/off,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/off,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "offprint",
   :madsrdf/code "off",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Publication that originally was published as an article in a monograph or a serial and that is also issued separately and independently. Includes preprints and postprints."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/24-27 BK (code 2)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/off,
                     :cs/subjectOfChange :loc.marcgt/off,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Publication that originally was published as an article in a monograph or a serial and that is also issued separately and independently. Includes preprints and postprints."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/24-27 BK (code 2)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "off",
   :skos/prefLabel "offprint"})

(def ons
  "Online system or service supports system-based user interaction.Used if the focus of the record is to describe the system itself, with the content of the databases incidental. Includes online library systems (consisting of a variety of databases), FTP sites, online bulletin boards, network information centers."
  {:db/ident :loc.marcgt/ons,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/ons,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "online system or service",
   :madsrdf/code "ons",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Online system or service supports system-based user interaction.Used if the focus of the record is to describe the system itself, with the content of the databases incidental. Includes online library systems (consisting of a variety of databases), FTP sites, online bulletin boards, network information centers."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/26 CF (code j)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/ons,
                     :cs/subjectOfChange :loc.marcgt/ons,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Online system or service supports system-based user interaction.Used if the focus of the record is to describe the system itself, with the content of the databases incidental. Includes online library systems (consisting of a variety of databases), FTP sites, online bulletin boards, network information centers."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code j)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "ons",
   :skos/prefLabel "online system or service"})

(def pat
  "Detailed description of an invention or discovery of a new and useful process, machine, manufacture, composition of matter, or improvements thereof."
  {:db/ident :loc.marcgt/pat,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/pat,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "patent",
   :madsrdf/code "pat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Detailed description of an invention or discovery of a new and useful process, machine, manufacture, composition of matter, or improvements thereof."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/24-27 BK (code j)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/pat,
                     :cs/subjectOfChange :loc.marcgt/pat,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Detailed description of an invention or discovery of a new and useful process, machine, manufacture, composition of matter, or improvements thereof."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/24-27 BK (code j)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "pat",
   :skos/prefLabel "patent"})

(def per
  "Separate articles, stories, other writings, etc. that are published or distributed generally more frequently than annual."
  {:db/ident :loc.marcgt/per,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/per,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "periodical",
   :madsrdf/code "per",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Separate articles, stories, other writings, etc. that are published or distributed generally more frequently than annual."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/21 CR (code p)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/per,
                     :cs/subjectOfChange :loc.marcgt/per,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Separate articles, stories, other writings, etc. that are published or distributed generally more frequently than annual."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/21 CR (code p)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "per",
   :skos/prefLabel "periodical"})

(def pic
  "Two-dimensional visual representation accessible to the naked eye and generally on an opaque backing."
  {:db/ident :loc.marcgt/pic,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/pic,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "picture",
   :madsrdf/code "pic",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Two-dimensional visual representation accessible to the naked eye and generally on an opaque backing."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code i)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/pic,
                     :cs/subjectOfChange :loc.marcgt/pic,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Two-dimensional visual representation accessible to the naked eye and generally on an opaque backing."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code i)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "pic",
   :skos/prefLabel "picture"})

(def pla
  "Cards made in sets of a designated number and marked for use as game accessories during play. The markings or designs may follow a standard suit or rank system or may be special and individualized."
  {:db/ident :loc.marcgt/pla,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/pla,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "playing cards",
   :madsrdf/code "pla",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Cards made in sets of a designated number and marked for use as game accessories during play. The markings or designs may follow a standard suit or rank system or may be special and individualized."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33-34 MP (code p)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/pla,
                     :cs/subjectOfChange :loc.marcgt/pla,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Cards made in sets of a designated number and marked for use as game accessories during play. The markings or designs may follow a standard suit or rank system or may be special and individualized."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33-34 MP (code p)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "pla",
   :skos/prefLabel "playing cards"})

(def poe
  "Poem or collection of poems."
  {:db/ident :loc.marcgt/poe,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/poe,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "poetry",
   :madsrdf/code "poe",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Poem or collection of poems."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/30-31 MU (code p)"}
                         {:rdf/language "en",
                          :rdf/value    "008/33 BK (code p)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/poe,
                     :cs/subjectOfChange :loc.marcgt/poe,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Poem or collection of poems."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/30-31 MU (code p)"}
                      {:rdf/language "en",
                       :rdf/value    "008/33 BK (code p)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "poe",
   :skos/prefLabel "poetry"})

(def pos
  "Card on which a message may be written or printed for mailing without an envelope, usually at a lower rate than that for letters in envelopes."
  {:db/ident :loc.marcgt/pos,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/pos,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "postcard",
   :madsrdf/code "pos",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Card on which a message may be written or printed for mailing without an envelope, usually at a lower rate than that for letters in envelopes."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33-34 MP (code j)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/pos,
                     :cs/subjectOfChange :loc.marcgt/pos,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Card on which a message may be written or printed for mailing without an envelope, usually at a lower rate than that for letters in envelopes."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33-34 MP (code j)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "pos",
   :skos/prefLabel "postcard"})

(def pro
  "Book that includes instructional material and also directions on how to assimilate information. Material in the textbook is divided into units of information to be assimilated, combined with instructions on student fulfillment of assignments, additional explanations, and sections for self-testing for retention."
  {:db/ident :loc.marcgt/pro,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/pro,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "programmed text",
   :madsrdf/code "pro",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Book that includes instructional material and also directions on how to assimilate information. Material in the textbook is divided into units of information to be assimilated, combined with instructions on student fulfillment of assignments, additional explanations, and sections for self-testing for retention."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code p)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code p)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/pro,
                     :cs/subjectOfChange :loc.marcgt/pro,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Book that includes instructional material and also directions on how to assimilate information. Material in the textbook is divided into units of information to be assimilated, combined with instructions on student fulfillment of assignments, additional explanations, and sections for self-testing for retention."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code p)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code p)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "pro",
   :skos/prefLabel "programmed text"})

(def puz
  "Image may be disassembled into pieces and reassembled."
  {:db/ident :loc.marcgt/puz,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/puz,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "puzzle",
   :madsrdf/code "puz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Image may be disassembled into pieces and reassembled."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33-34 MP (code l)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/puz,
                     :cs/subjectOfChange :loc.marcgt/puz,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Image may be disassembled into pieces and reassembled."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33-34 MP (code l)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "puz",
   :skos/prefLabel "puzzle"})

(def rea
  "Three-dimensional items not covered by more specific terms (e.g., clothing, stitchery, fabrics, tools, utensils), and naturally occurring objects."
  {:db/ident :loc.marcgt/rea,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/rea,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "realia",
   :madsrdf/code "rea",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Three-dimensional items not covered by more specific terms (e.g., clothing, stitchery, fabrics, tools, utensils), and naturally occurring objects."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code r)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/rea,
                     :cs/subjectOfChange :loc.marcgt/rea,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Three-dimensional items not covered by more specific terms (e.g., clothing, stitchery, fabrics, tools, utensils), and naturally occurring objects."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code r)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "rea",
   :skos/prefLabel "realia"})

(def reh
  "Performance of any of a variety of nonmusical productions."
  {:db/ident :loc.marcgt/reh,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/reh,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "rehearsal",
   :madsrdf/code "reh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Performance of any of a variety of nonmusical productions."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code r)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/reh,
                     :cs/subjectOfChange :loc.marcgt/reh,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Performance of any of a variety of nonmusical productions."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code r)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "reh",
   :skos/prefLabel "rehearsal"})

(def rem
  "Image produced by a recording device that is not in physical or intimate contact with the object under study. This may be a map or other image that is obtained through various remote sensing devices such as cameras, computers, lasers, radio frequency receivers, radar systems, sonar, seismographs, gravimeters, magnetometers, and scintillation counters."
  {:db/ident :loc.marcgt/rem,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/rem,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "remote sensing image",
   :madsrdf/code "rem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Image produced by a recording device that is not in physical or intimate contact with the object under study. This may be a map or other image that is obtained through various remote sensing devices such as cameras, computers, lasers, radio frequency receivers, radar systems, sonar, seismographs, gravimeters, magnetometers, and scintillation counters."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "or 007/00 (code r)"}
                         {:rdf/language "en",
                          :rdf/value    "007/01 MP (code r)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/rem,
                     :cs/subjectOfChange :loc.marcgt/rem,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Image produced by a recording device that is not in physical or intimate contact with the object under study. This may be a map or other image that is obtained through various remote sensing devices such as cameras, computers, lasers, radio frequency receivers, radar systems, sonar, seismographs, gravimeters, magnetometers, and scintillation counters."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "or 007/00 (code r)"}
                      {:rdf/language "en",
                       :rdf/value    "007/01 MP (code r)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "rem",
   :skos/prefLabel "remote sensing image"})

(def rep
  "Pictorial or graphic information that can be manipulated in conjunction with other types of files to produce graphic patterns that can be used to interpret and give meaning to the information."
  {:db/ident :loc.marcgt/rep,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/rep,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "representational",
   :madsrdf/code "rep",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Pictorial or graphic information that can be manipulated in conjunction with other types of files to produce graphic patterns that can be used to interpret and give meaning to the information."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/26 CF (code c)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/rep,
                     :cs/subjectOfChange :loc.marcgt/rep,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Pictorial or graphic information that can be manipulated in conjunction with other types of files to produce graphic patterns that can be used to interpret and give meaning to the information."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code c)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "rep",
   :skos/prefLabel "representational"})

(def rev
  "Critical review of published or performed works (e.g., books, films, sound recordings, theater)."
  {:db/ident :loc.marcgt/rev,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/rev,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "review",
   :madsrdf/code "rev",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Critical review of published or performed works (e.g., books, films, sound recordings, theater)."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code o)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code o)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/rev,
                     :cs/subjectOfChange :loc.marcgt/rev,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Critical review of published or performed works (e.g., books, films, sound recordings, theater)."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code o)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code o)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "rev",
   :skos/prefLabel "review"})

(def rpt
  "Generally, giving an account. In the context of journalism, gathering and writing, or narrating by phone or broadcast, news events for newspapers, radio, or television."
  {:db/ident :loc.marcgt/rpt,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/rpt,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "reporting",
   :madsrdf/code "rpt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generally, giving an account. In the context of journalism, gathering and writing, or narrating by phone or broadcast, news events for newspapers, radio, or television."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code g)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/rpt,
                     :cs/subjectOfChange :loc.marcgt/rpt,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generally, giving an account. In the context of journalism, gathering and writing, or narrating by phone or broadcast, news events for newspapers, radio, or television."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code g)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "rpt",
   :skos/prefLabel "reporting"})

(def scr
  "Written text of stage plays, screenplays, and radio or television broadcasts."
  {:db/ident :loc.marcgt/scr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/scr,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "script",
   :madsrdf/code "scr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Written text of stage plays, screenplays, and radio or television broadcasts."},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/scr,
                     :cs/subjectOfChange :loc.marcgt/scr,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Written text of stage plays, screenplays, and radio or television broadcasts."},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "scr",
   :skos/prefLabel "script"})

(def ser
  "Groups of separate bibliographic items related to one another by the fact that each bears, in addition to its own title proper, a collective title applying to the group as a whole and issued successively; in the visual arts, for groups of works by a single artist having a specific and purposeful relation among the works."
  {:db/ident :loc.marcgt/ser,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/ser,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "series",
   :madsrdf/code "ser",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Groups of separate bibliographic items related to one another by the fact that each bears, in addition to its own title proper, a collective title applying to the group as a whole and issued successively; in the visual arts, for groups of works by a single artist having a specific and purposeful relation among the works."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/21 CR (code m)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/ser,
                     :cs/subjectOfChange :loc.marcgt/ser,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Groups of separate bibliographic items related to one another by the fact that each bears, in addition to its own title proper, a collective title applying to the group as a whole and issued successively; in the visual arts, for groups of works by a single artist having a specific and purposeful relation among the works."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/21 CR (code m)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "ser",
   :skos/prefLabel "series"})

(def sho
  "Short story or collection of short stories."
  {:db/ident :loc.marcgt/sho,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/sho,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "short story",
   :madsrdf/code "sho",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Short story or collection of short stories."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 BK (code j)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/sho,
                     :cs/subjectOfChange :loc.marcgt/sho,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Short story or collection of short stories."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 BK (code j)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "sho",
   :skos/prefLabel "short story"})

(def sli
  "Transparent material on which there is a two-dimensional image, usually held in a mount, and designed for use in a projector or viewer."
  {:db/ident :loc.marcgt/sli,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/sli,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "slide",
   :madsrdf/code "sli",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Transparent material on which there is a two-dimensional image, usually held in a mount, and designed for use in a projector or viewer."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code s)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/sli,
                     :cs/subjectOfChange :loc.marcgt/sli,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Transparent material on which there is a two-dimensional image, usually held in a mount, and designed for use in a projector or viewer."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code s)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "sli",
   :skos/prefLabel "slide"})

(def sou
  "Data encoding sounds producible by the computer. May be musical or non-musical. See al sounds for non-musical."
  {:db/ident :loc.marcgt/sou,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/sou,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "sound",
   :madsrdf/code "sou",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Data encoding sounds producible by the computer. May be musical or non-musical. See al sounds for non-musical."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/26 CF (code h)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/sou,
                     :cs/subjectOfChange :loc.marcgt/sou,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Data encoding sounds producible by the computer. May be musical or non-musical. See al sounds for non-musical."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/26 CF (code h)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "sou",
   :skos/prefLabel "sound"})

(def spe
  "Report of newsworthy events and informative messages"
  {:db/ident :loc.marcgt/spe,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/spe,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "speech",
   :madsrdf/code "spe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Report of newsworthy events and informative messages"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/30-31 MU (code l)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/spe,
                     :cs/subjectOfChange :loc.marcgt/spe,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Report of newsworthy events and informative messages"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/30-31 MU (code l)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "spe",
   :skos/prefLabel "speech"})

(def sta
  "Collection of statistical data on a subject."
  {:db/ident :loc.marcgt/sta,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/sta,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "statistics",
   :madsrdf/code "sta",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Collection of statistical data on a subject."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code s)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code s)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/sta,
                     :cs/subjectOfChange :loc.marcgt/sta,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Collection of statistical data on a subject."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code s)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code s)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "sta",
   :skos/prefLabel "statistics"})

(def stp
  "International, national or industry standard or a specification which gives a precise statement of a process or a service requirement."
  {:db/ident :loc.marcgt/stp,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/stp,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "standard or specification",
   :madsrdf/code "stp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "International, national or industry standard or a specification which gives a precise statement of a process or a service requirement."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/24-27 BK (code u)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/stp,
                     :cs/subjectOfChange :loc.marcgt/stp,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "International, national or industry standard or a specification which gives a precise statement of a process or a service requirement."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/24-27 BK (code u)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "stp",
   :skos/prefLabel "standard or specification"})

(def sur
  "Authored survey that summarizes what has been published about a subject."
  {:db/ident :loc.marcgt/sur,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/sur,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "survey of literature",
   :madsrdf/code "sur",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Authored survey that summarizes what has been published about a subject."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code n)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code n)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/sur,
                     :cs/subjectOfChange :loc.marcgt/sur,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Authored survey that summarizes what has been published about a subject."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code n)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code n)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "sur",
   :skos/prefLabel "survey of literature"})

(def ted
  "Cross section, detail, diagram, elevation, perspective, plan, working plan, etc., made for use in an architectural engineering or other technical context."
  {:db/ident :loc.marcgt/ted,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/ted,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "technical drawing",
   :madsrdf/code "ted",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Cross section, detail, diagram, elevation, perspective, plan, working plan, etc., made for use in an architectural engineering or other technical context."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code l)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/ted,
                     :cs/subjectOfChange :loc.marcgt/ted,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Cross section, detail, diagram, elevation, perspective, plan, working plan, etc., made for use in an architectural engineering or other technical context."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code l)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "ted",
   :skos/prefLabel "technical drawing"})

(def ter
  "Work that is the result of scientific investigation or technical development, testing, or evaluation, presented in a form suitable for dissemination.to the technical community."
  {:db/ident :loc.marcgt/ter,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/ter,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "technical report",
   :madsrdf/code "ter",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Work that is the result of scientific investigation or technical development, testing, or evaluation, presented in a form suitable for dissemination.to the technical community."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code t)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code t)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/ter,
                     :cs/subjectOfChange :loc.marcgt/ter,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Work that is the result of scientific investigation or technical development, testing, or evaluation, presented in a form suitable for dissemination.to the technical community."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code t)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code t)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "ter",
   :skos/prefLabel "technical report"})

(def the
  "Thesis, dissertation, or work identified as having been created to satisfy the requirements for an academic certification or degree."
  {:db/ident :loc.marcgt/the,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/the,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "thesis",
   :madsrdf/code "the",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Thesis, dissertation, or work identified as having been created to satisfy the requirements for an academic certification or degree."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code m)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code m)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/the,
                     :cs/subjectOfChange :loc.marcgt/the,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Thesis, dissertation, or work identified as having been created to satisfy the requirements for an academic certification or degree."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code m)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code m)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "the",
   :skos/prefLabel "thesis"})

(def toy
  "Material object for children or others to play with (often an imitation of some familiar object); a plaything; also, something contrived for amusement rather than for practical use."
  {:db/ident :loc.marcgt/toy,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/toy,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "toy",
   :madsrdf/code "toy",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material object for children or others to play with (often an imitation of some familiar object); a plaything; also, something contrived for amusement rather than for practical use."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code w)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/toy,
                     :cs/subjectOfChange :loc.marcgt/toy,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material object for children or others to play with (often an imitation of some familiar object); a plaything; also, something contrived for amusement rather than for practical use."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code w)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "toy",
   :skos/prefLabel "toy"})

(def tra
  "Transparent material on which a basically still image is recorded. Transparencies are designed for use with an overhead projector or a light box. X-rays are included here."
  {:db/ident :loc.marcgt/tra,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/tra,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "transparency",
   :madsrdf/code "tra",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Transparent material on which a basically still image is recorded. Transparencies are designed for use with an overhead projector or a light box. X-rays are included here."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code t)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/tra,
                     :cs/subjectOfChange :loc.marcgt/tra,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Transparent material on which a basically still image is recorded. Transparencies are designed for use with an overhead projector or a light box. X-rays are included here."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code t)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "tra",
   :skos/prefLabel "transparency"})

(def tre
  "Treaty or accord negotiated between two or more parties to settle a disagreement, establish a relationship, grant rights, etc."
  {:db/ident :loc.marcgt/tre,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/tre,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "treaty",
   :madsrdf/code "tre",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Treaty or accord negotiated between two or more parties to settle a disagreement, establish a relationship, grant rights, etc."},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "008/24-27 BK (code z)"}
                         {:rdf/language "en",
                          :rdf/value    "008/24 CR; 008/25-27 CR (code z)"}],
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/tre,
                     :cs/subjectOfChange :loc.marcgt/tre,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Treaty or accord negotiated between two or more parties to settle a disagreement, establish a relationship, grant rights, etc."},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "008/24 CR; 008/25-27 CR (code z)"}
                      {:rdf/language "en",
                       :rdf/value    "008/24-27 BK (code z)"}],
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "tre",
   :skos/prefLabel "treaty"})

(def vid
  "Recording on which visual images, usually in motion and accompanied by sound, have been registered."
  {:db/ident :loc.marcgt/vid,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/vid,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "videorecording",
   :madsrdf/code "vid",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Recording on which visual images, usually in motion and accompanied by sound, have been registered."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33 VM (code v)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/vid,
                     :cs/subjectOfChange :loc.marcgt/vid,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Recording on which visual images, usually in motion and accompanied by sound, have been registered."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33 VM (code v)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "vid",
   :skos/prefLabel "videorecording"})

(def wal
  "wall map"
  {:db/ident :loc.marcgt/wal,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/wal,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "wall map",
   :madsrdf/code "wal",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/33-34 MP (code o)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/wal,
                     :cs/subjectOfChange :loc.marcgt/wal,
                     :rdf/type           :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/33-34 MP (code o)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "wal",
   :skos/prefLabel "wall map"})

(def web
  "Web site that does not fit into one of the othermore specific categories, such as periodical, newspaper, or database."
  {:db/ident :loc.marcgt/web,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.marcgt/web,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "web site",
   :madsrdf/code "web",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Web site that does not fit into one of the othermore specific categories, such as periodical, newspaper, or database."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008/21 CR (code w)"},
   :madsrdf/isMemberOfMADSCollection :loc.marcgt/collection_marcgt,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcgt,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.marcgt/web,
                     :cs/subjectOfChange :loc.marcgt/web,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Web site that does not fit into one of the othermore specific categories, such as periodical, newspaper, or database."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008/21 CR (code w)"},
   :skos/inScheme :loc.vocabulary/marcgt,
   :skos/notation "web",
   :skos/prefLabel "web site"})

(def ^{:private true} marcgt
  "MARC Genre Terms List is derived from a controlled list of coded values representing MARC Genre Terms."
  {:db/ident :loc.vocabulary/marcgt,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-01-23T05:00:00.000-00:00",
                           :ri/recordContentSource "2017-01-23T00:00:00",
                           :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "MARC Genre Terms List  is derived from a controlled list of coded values representing MARC Genre Terms."},
   :madsrdf/hasMADSSchemeMember [:loc.marcgt/art
                                 :loc.marcgt/dio
                                 :loc.marcgt/num
                                 :loc.marcgt/com
                                 :loc.marcgt/dic
                                 :loc.marcgt/sho
                                 :loc.marcgt/the
                                 :loc.marcgt/gam
                                 :loc.marcgt/ted
                                 :loc.marcgt/mem
                                 :loc.marcgt/lan
                                 :loc.marcgt/dra
                                 :loc.marcgt/ser
                                 :loc.marcgt/ess
                                 :loc.marcgt/spe
                                 :loc.marcgt/sur
                                 :loc.marcgt/off
                                 :loc.marcgt/jou
                                 :loc.marcgt/pic
                                 :loc.marcgt/cal
                                 :loc.marcgt/man
                                 :loc.marcgt/his
                                 :loc.marcgt/doc
                                 :loc.marcgt/pos
                                 :loc.marcgt/pro
                                 :loc.marcgt/ons
                                 :loc.marcgt/law
                                 :loc.marcgt/gra
                                 :loc.marcgt/fla
                                 :loc.marcgt/puz
                                 :loc.marcgt/atl
                                 :loc.marcgt/kit
                                 :loc.marcgt/gov
                                 :loc.marcgt/inm
                                 :loc.marcgt/reh
                                 :loc.marcgt/rea
                                 :loc.marcgt/hum
                                 :loc.marcgt/mod
                                 :loc.marcgt/rep
                                 :loc.marcgt/nos
                                 :loc.marcgt/arr
                                 :loc.marcgt/dir
                                 :loc.marcgt/dtb
                                 :loc.marcgt/rem
                                 :loc.marcgt/cod
                                 :loc.marcgt/sou
                                 :loc.marcgt/fls
                                 :loc.marcgt/fin
                                 :loc.marcgt/aut
                                 :loc.marcgt/lec
                                 :loc.marcgt/glo
                                 :loc.marcgt/ins
                                 :loc.marcgt/lea
                                 :loc.marcgt/tra
                                 :loc.marcgt/pat
                                 :loc.marcgt/leg
                                 :loc.marcgt/mic
                                 :loc.marcgt/stp
                                 :loc.marcgt/iss
                                 :loc.marcgt/mot
                                 :loc.marcgt/nov
                                 :loc.marcgt/loo
                                 :loc.marcgt/pla
                                 :loc.marcgt/rpt
                                 :loc.marcgt/bda
                                 :loc.marcgt/bio
                                 :loc.marcgt/han
                                 :loc.marcgt/web
                                 :loc.marcgt/ter
                                 :loc.marcgt/boo
                                 :loc.marcgt/toy
                                 :loc.marcgt/vid
                                 :loc.marcgt/cpb
                                 :loc.marcgt/new
                                 :loc.marcgt/fil
                                 :loc.marcgt/sta
                                 :loc.marcgt/scr
                                 :loc.marcgt/abs
                                 :loc.marcgt/sli
                                 :loc.marcgt/bib
                                 :loc.marcgt/fon
                                 :loc.marcgt/cat
                                 :loc.marcgt/per
                                 :loc.marcgt/enc
                                 :loc.marcgt/cha
                                 :loc.marcgt/map
                                 :loc.marcgt/poe
                                 :loc.marcgt/dis
                                 :loc.marcgt/fes
                                 :loc.marcgt/cgn
                                 :loc.marcgt/fol
                                 :loc.marcgt/fic
                                 :loc.marcgt/int
                                 :loc.marcgt/ind
                                 :loc.marcgt/let
                                 :loc.marcgt/tre
                                 :loc.marcgt/wal
                                 :loc.marcgt/aro
                                 :loc.marcgt/rev],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    ""},
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName     "2017-01-23T00:00:00",
                     :cs/subjectOfChange :loc.vocabulary/marcgt,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "MARC Genre Terms List is derived from a controlled list of coded values representing MARC Genre Terms."}})