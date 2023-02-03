(ns net.wikipunk.rdf.loc.descriptionConventions
  "http://id.loc.gov/vocabulary/descriptionConventions/"
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/descriptionConventions.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.descriptionConventions"
                       "http://id.loc.gov/vocabulary/descriptionConventions/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.descriptionConventions",
   :rdfa/uri "http://id.loc.gov/vocabulary/descriptionConventions/"})

(def aacr
  "Published by the American Library Association in Chicago"
  {:db/ident :loc.descriptionConventions/aacr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Anglo-American cataloguing rules",
   :madsrdf/code "aacr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the American Library Association in Chicago"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/aacr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the American Library Association in Chicago"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "aacr",
   :skos/prefLabel "Anglo-American cataloguing rules"})

(def amim
  "Published by the Library of Congress in Washington, D.C."
  {:db/ident :loc.descriptionConventions/amim,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Archival moving image materials",
   :madsrdf/code "amim",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/amim,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "amim",
   :skos/prefLabel "Archival moving image materials"})

(def amremm
  "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"
  {:db/ident :loc.descriptionConventions/amremm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descriptive cataloging of ancient, medieval, Renaissance, and early-modern manuscripts",
   :madsrdf/code "amremm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :madsrdf/editorialNote "https://rbms.info/dcrm/amremm/",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Pass, Gregory A. Descriptive cataloging of ancient, medieval, Renaissance, and early-modern manuscripts",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Pass, Gregory A. Descriptive cataloging of ancient, medieval, Renaissance, and early-modern manuscripts",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/amremm,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :skos/editorial "https://rbms.info/dcrm/amremm/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "amremm",
   :skos/prefLabel
   "Descriptive cataloging of ancient, medieval, Renaissance, and early-modern manuscripts",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Pass, Gregory A. Descriptive cataloging of ancient, medieval, Renaissance, and early-modern manuscripts"}})

(def appm
  "Published by the Library of Congress in Washington, D.C."
  {:db/ident :loc.descriptionConventions/appm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Archives, personal papers, and manuscripts",
   :madsrdf/code "appm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Hensen, Steven L. Archives, personal papers, and manuscripts",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Hensen, Steven L. Archives, personal papers, and manuscripts",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/appm,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "appm",
   :skos/prefLabel "Archives, personal papers, and manuscripts",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Hensen, Steven L. Archives, personal papers, and manuscripts"}})

(def bdrb
  "Published by the Library of Congress Catalog Distribution Service in Washington, D.C."
  {:db/ident :loc.descriptionConventions/bdrb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliographic description of rare books",
   :madsrdf/code "bdrb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Library of Congress Catalog Distribution Service in Washington, D.C."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/bdrb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Library of Congress Catalog Distribution Service in Washington, D.C."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "bdrb",
   :skos/prefLabel "Bibliographic description of rare books"})

(def bps
  "Published by the Library of Congress, General Reference and Bibiography Division, in Washington, D.C."
  {:db/ident :loc.descriptionConventions/bps,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bibliographical procedures and style",
   :madsrdf/code "bps",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Library of Congress, General Reference and Bibiography Division, in Washington, D.C."},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "McCrum, Blanche Prichard. Bibliographical procedures and style",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "McCrum, Blanche Prichard. Bibliographical procedures and style",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/bps,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Library of Congress, General Reference and Bibiography Division, in Washington, D.C."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "bps",
   :skos/prefLabel "Bibliographical procedures and style",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "McCrum, Blanche Prichard. Bibliographical procedures and style"}})

(def cco
  "Published by the Visual Resources Association, American Library Association, in Chicago"
  {:db/ident :loc.descriptionConventions/cco,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Cataloging cultural objects: a guide to describing cultural works and their images",
   :madsrdf/code "cco",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Visual Resources Association, American Library Association, in Chicago"},
   :madsrdf/editorialNote
   "http://vraweb.org/wp-content/uploads/2020/04/CatalogingCulturalObjectsFullv2.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/cco,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Visual Resources Association, American Library Association, in Chicago"},
   :skos/editorial
   "http://vraweb.org/wp-content/uploads/2020/04/CatalogingCulturalObjectsFullv2.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "cco",
   :skos/prefLabel
   "Cataloging cultural objects: a guide to describing cultural works and their images"})

(def ccr
  "Published by the National Central Library in Taiwan"
  {:db/ident :loc.descriptionConventions/ccr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Chinese cataloging rules",
   :madsrdf/code "ccr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the National Central Library in Taiwan"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/ccr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by the National Central Library in Taiwan"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "ccr",
   :skos/prefLabel "Chinese cataloging rules"})

(def cgcrb
  "Published by the Research Library Group"
  {:db/ident :loc.descriptionConventions/cgcrb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Cataloging guidelines for creating Chinese rare book records in machine-reachable form",
   :madsrdf/code "cgcrb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by the Research Library Group"},
   :madsrdf/editorialNote
   "http://www.eastasianlib.org/ctp/webinars/ChineseRareBook/CRBP_guidelines.pdf",
   :madsrdf/hasVariant {:madsrdf/variantLabel "中文善本書機讀目錄編目規則",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "中文善本書機讀目錄編目規則",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/cgcrb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by the Research Library Group"},
   :skos/editorial
   "http://www.eastasianlib.org/ctp/webinars/ChineseRareBook/CRBP_guidelines.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "cgcrb",
   :skos/prefLabel
   "Cataloging guidelines for creating Chinese rare book records in machine-reachable form",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "中文善本書機讀目錄編目規則"}})

(def crlp
  "Published by the Library of Congress in Washington, D.C."
  {:db/ident :loc.descriptionConventions/crlp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Cataloging rules for the description of looseleaf publications: with special emphasis on legal materials",
   :madsrdf/code "crlp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Hallam, Adele. Cataloging rules for the description of looseleaf publications: with special emphasis on legal materials",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Hallam, Adele. Cataloging rules for the description of looseleaf publications: with special emphasis on legal materials",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/crlp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "crlp",
   :skos/prefLabel
   "Cataloging rules for the description of looseleaf publications: with special emphasis on legal materials",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Hallam, Adele. Cataloging rules for the description of looseleaf publications: with special emphasis on legal materials"}})

(def dacs
  "Published by the Society of American Archivists in Chicago"
  {:db/ident :loc.descriptionConventions/dacs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Describing archives: a content standard",
   :madsrdf/code "dacs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Society of American Archivists in Chicago"},
   :madsrdf/editorialNote "https://saa-ts-dacs.github.io/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dacs,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the Society of American Archivists in Chicago"},
   :skos/editorial "https://saa-ts-dacs.github.io/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dacs",
   :skos/prefLabel "Describing archives: a content standard"})

(def dcarlisnaaf
  "Published by the Art Libraries Society of North America"
  {:db/ident :loc.descriptionConventions/dcarlisnaaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Best practices for cataloging artist files using MARC",
   :madsrdf/code "dcarlisnaaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Art Libraries Society of North America"},
   :madsrdf/editorialNote
   "http://artistfiles.arlisna.org/best-practices-for-cataloging-artist-files-using-marc/",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "ARLIS best practices for cataloging artist files using MARC",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "ARLIS best practices for cataloging artist files using MARC",
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
    :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
    :cs/subjectOfChange :loc.descriptionConventions/dcarlisnaaf,
    :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by the Art Libraries Society of North America"},
   :skos/editorial
   "http://artistfiles.arlisna.org/best-practices-for-cataloging-artist-files-using-marc/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcarlisnaaf",
   :skos/prefLabel "Best practices for cataloging artist files using MARC",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "ARLIS best practices for cataloging artist files using MARC"}})

(def dcgpm
  "Published by the Subcommittee on Japanese Rare Books, Committee on Japanese Materials, Council on East Asian Libraries"
  {:db/ident :loc.descriptionConventions/dcgpm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descriptive cataloging guidelines for pre-Meiji Japanese books",
   :madsrdf/code "dcgpm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Subcommittee on Japanese Rare Books, Committee on Japanese Materials, Council on East Asian Libraries"},
   :madsrdf/editorialNote "https://www.loc.gov/catdir/cpso/premeiji.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dcgpm,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Subcommittee on Japanese Rare Books, Committee on Japanese Materials, Council on East Asian Libraries"},
   :skos/editorial "https://www.loc.gov/catdir/cpso/premeiji.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcgpm",
   :skos/prefLabel
   "Descriptive cataloging guidelines for pre-Meiji Japanese books"})

(def dcrb
  "Published by the Library of Congress Catalog Distribution Service in Washington, D.C."
  {:db/ident :loc.descriptionConventions/dcrb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Descriptive cataloging of rare books",
   :madsrdf/code "dcrb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Library of Congress Catalog Distribution Service in Washington, D.C."},
   :madsrdf/editorialNote
   "https://www.loc.gov/cds/PDFdownloads/dcrm/DCRM(B)_2008.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dcrb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Library of Congress Catalog Distribution Service in Washington, D.C."},
   :skos/editorial "https://www.loc.gov/cds/PDFdownloads/dcrm/DCRM(B)_2008.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcrb",
   :skos/prefLabel "Descriptive cataloging of rare books"})

(def dcrmb
  "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"
  {:db/ident :loc.descriptionConventions/dcrmb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descriptive cataloging of rare materials (Books)",
   :madsrdf/code "dcrmb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :madsrdf/editorialNote "https://rbms.info/dcrm/dcrmb/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dcrmb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :skos/editorial "https://rbms.info/dcrm/dcrmb/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcrmb",
   :skos/prefLabel "Descriptive cataloging of rare materials (Books)"})

(def dcrmc
  "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"
  {:db/ident :loc.descriptionConventions/dcrmc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descriptive cataloging of rare materials (Cartographic)",
   :madsrdf/code "dcrmc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :madsrdf/editorialNote "http://rbms.info/dcrm/dcrmc/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dcrmc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :skos/editorial "http://rbms.info/dcrm/dcrmc/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcrmc",
   :skos/prefLabel "Descriptive cataloging of rare materials (Cartographic)"})

(def dcrmg
  "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"
  {:db/ident :loc.descriptionConventions/dcrmg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descriptive cataloging of rare materials (Graphics)",
   :madsrdf/code "dcrmg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :madsrdf/editorialNote "http://rbms.info/dcrm/dcrmg/",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "DCRM(G): Descriptive cataloging of rare materials (Graphics)",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "DCRM(G): Descriptive cataloging of rare materials (Graphics)",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dcrmg,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :skos/editorial "http://rbms.info/dcrm/dcrmg/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcrmg",
   :skos/prefLabel "Descriptive cataloging of rare materials (Graphics)",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "DCRM(G): Descriptive cataloging of rare materials (Graphics)"}})

(def dcrmm
  "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"
  {:db/ident :loc.descriptionConventions/dcrmm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descriptive cataloging of rare materials (Music)",
   :madsrdf/code "dcrmm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :madsrdf/editorialNote "https://rbms.info/dcrm/dcrmm/",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "DCRM(M): Descriptive cataloging of rare materials (Music)",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "DCRM(M): Descriptive cataloging of rare materials (Music)",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dcrmm,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :skos/editorial "https://rbms.info/dcrm/dcrmm/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcrmm",
   :skos/prefLabel "Descriptive cataloging of rare materials (Music)",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "DCRM(M): Descriptive cataloging of rare materials (Music)"}})

(def dcrmmss
  "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"
  {:db/ident :loc.descriptionConventions/dcrmmss,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descriptive cataloging of rare materials (Manuscripts)",
   :madsrdf/code "dcrmmss",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :madsrdf/editorialNote "http://rbms.info/dcrm/dcrmmss/",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "DCRM(MSS): Descriptive cataloging of rare materials (Manuscripts)",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "DCRM(MSS): Descriptive cataloging of rare materials (Manuscripts)",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dcrmmss,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :skos/editorial "http://rbms.info/dcrm/dcrmmss/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcrmmss",
   :skos/prefLabel "Descriptive cataloging of rare materials (Manuscripts)",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "DCRM(MSS): Descriptive cataloging of rare materials (Manuscripts)"}})

(def dcrmr
  "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"
  {:db/ident :loc.descriptionConventions/dcrmr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descriptive cataloging of rare materials (RDA Edition)",
   :madsrdf/code "dcrmr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :madsrdf/editorialNote "https://bsc.rbms.info/DCRMR/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dcrmr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :skos/editorial "https://bsc.rbms.info/DCRMR/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcrmr",
   :skos/prefLabel "Descriptive cataloging of rare materials (RDA Edition)"})

(def dcrms
  "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"
  {:db/ident :loc.descriptionConventions/dcrms,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Descriptive cataloging of rare materials (Serials)",
   :madsrdf/code "dcrms",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :madsrdf/editorialNote "http://rbms.info/dcrm/dcrms/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dcrms,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Rare Books and Manuscripts Section of the Association of College & Research Libraries in Chicago"},
   :skos/editorial "http://rbms.info/dcrm/dcrms/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dcrms",
   :skos/prefLabel "Descriptive cataloging of rare materials (Serials)"})

(def din1505
  "Published by Beuth in Berlin"
  {:db/ident :loc.descriptionConventions/din1505,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Titelangaben von Dokumenten",
   :madsrdf/code "din1505",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Beuth in Berlin"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/din1505,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Beuth in Berlin"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "din1505",
   :skos/prefLabel "Titelangaben von Dokumenten"})

(def dmbsb
  "Published by the Kungliga Biblioteket in Stockholm"
  {:db/ident :loc.descriptionConventions/dmbsb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Dokumentation av materialets behandling i SB 1700-1829",
   :madsrdf/code "dmbsb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Kungliga Biblioteket in Stockholm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/dmbsb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by the Kungliga Biblioteket in Stockholm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "dmbsb",
   :skos/prefLabel "Dokumentation av materialets behandling i SB 1700-1829"})

(def enol
  "Published by Gosudarstvennaia biblioteka SSSR im. V. I. Lenin in Moskva"
  {:db/ident :loc.descriptionConventions/enol,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Ekspertiza i nauchno-tekhnicheskaia obrabotka lichnykh arkhivnykh fondov: metodicheskiie rekomendatsii",
   :madsrdf/code "enol",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Gosudarstvennaia biblioteka SSSR im. V. I. Lenin in Moskva"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/enol,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Gosudarstvennaia biblioteka SSSR im. V. I. Lenin in Moskva"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "enol",
   :skos/prefLabel
   "Ekspertiza i nauchno-tekhnicheskaia obrabotka lichnykh arkhivnykh fondov: metodicheskiie rekomendatsii"})

(def estc
  "Published by the British Library in London"
  {:db/ident :loc.descriptionConventions/estc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "English short title catalogue",
   :madsrdf/code "estc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by the British Library in London"},
   :madsrdf/editorialNote "http://estc.bl.uk/",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Eighteenth century short title catalogue, the cataloguing rules",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Eighteenth century short title catalogue, the cataloguing rules",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/estc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by the British Library in London"},
   :skos/editorial "http://estc.bl.uk/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "estc",
   :skos/prefLabel "English short title catalogue",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Eighteenth century short title catalogue, the cataloguing rules"}})

(def fiafcm
  "Published by the International Federation of Film Archives"
  {:db/ident :loc.descriptionConventions/fiafcm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "FIAF moving image cataloguing manual",
   :madsrdf/code "fiafcm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the International Federation of Film Archives"},
   :madsrdf/editorialNote
   "https://www.fiafnet.org/pages/E-Resources/Cataloguing-Manual.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/fiafcm,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the International Federation of Film Archives"},
   :skos/editorial
   "https://www.fiafnet.org/pages/E-Resources/Cataloguing-Manual.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "fiafcm",
   :skos/prefLabel "FIAF moving image cataloguing manual"})

(def fobidrtb
  "Published by the Nederlands Bibliotheek en Lektuur Centrum in Den Haag"
  {:db/ident :loc.descriptionConventions/fobidrtb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Federatie van Organisaties op het Gebied van het Bibliotheek-Informatie-en Dokumentatiewezen (FOBID) Regels voor de titelbeschrijving",
   :madsrdf/code "fobidrtb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Nederlands Bibliotheek en Lektuur Centrum in Den Haag"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/fobidrtb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Nederlands Bibliotheek en Lektuur Centrum in Den Haag"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "fobidrtb",
   :skos/prefLabel
   "Federatie van Organisaties op het Gebied van het Bibliotheek-Informatie-en Dokumentatiewezen (FOBID) Regels voor de titelbeschrijving"})

(def gihc
  "Published by the Library of Congress in Washington, D.C."
  {:db/ident :loc.descriptionConventions/gihc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Graphic materials",
   :madsrdf/code "gihc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :madsrdf/editorialNote "https://www.loc.gov/rr/print/gm/GraMatWP8.pdf",
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Betz, Elisabeth W. Graphic materials",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Betz, Elisabeth W. Graphic materials",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/gihc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :skos/editorial "https://www.loc.gov/rr/print/gm/GraMatWP8.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "gihc",
   :skos/prefLabel "Graphic materials",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Betz, Elisabeth W. Graphic materials"}})

(def hmstcn
  "Published by Koninklijke Bibliotheek in 's Gravenhage"
  {:db/ident :loc.descriptionConventions/hmstcn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Handleiding voor de medewerkers aan de STCN",
   :madsrdf/code "hmstcn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Koninklijke Bibliotheek in 's Gravenhage"},
   :madsrdf/editorialNote "https://www.kb.nl/kbhtml/stcnhandleiding/stcn.html",
   :madsrdf/hasVariant [{:madsrdf/variantLabel
                         "Short title catalog of the Netherlands",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "STCN",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Short title catalog of the Netherlands" "STCN"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/hmstcn,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Koninklijke Bibliotheek in 's Gravenhage"},
   :skos/editorial "https://www.kb.nl/kbhtml/stcnhandleiding/stcn.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "hmstcn",
   :skos/prefLabel "Handleiding voor de medewerkers aan de STCN",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "STCN"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Short title catalog of the Netherlands"}]})

(def iosr
  "Published by Izd-vo Akademii in Moskva"
  {:db/ident :loc.descriptionConventions/iosr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Instruktsiia po opisaniiu slaviano-russkikh rukopisei XI-XIV vv. dlia Svodnogo kataloga rukopisei, khraniashchikhsia v SSSR",
   :madsrdf/code "iosr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Izd-vo Akademii in Moskva"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "\"Instruktsiia po opisaniiu slaviano-russkikh rukopisei XI-XIV vv. dlia Svodnogo kataloga rukopisei, khraniashchikhsia v SSSR\" in Arkheologicheskii ezhegodnik za 1975 god",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "\"Instruktsiia po opisaniiu slaviano-russkikh rukopisei XI-XIV vv. dlia Svodnogo kataloga rukopisei, khraniashchikhsia v SSSR\" in Arkheologicheskii ezhegodnik za 1975 god",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/iosr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Izd-vo Akademii in Moskva"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "iosr",
   :skos/prefLabel
   "Instruktsiia po opisaniiu slaviano-russkikh rukopisei XI-XIV vv. dlia Svodnogo kataloga rukopisei, khraniashchikhsia v SSSR",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "\"Instruktsiia po opisaniiu slaviano-russkikh rukopisei XI-XIV vv. dlia Svodnogo kataloga rukopisei, khraniashchikhsia v SSSR\" in Arkheologicheskii ezhegodnik za 1975 god"}})

(def isbd
  "Published by the IFLA Review Group/Standing Committee of the IFLA Cataloguing Section"
  {:db/ident :loc.descriptionConventions/isbd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "ISBD: International standard bibliographic description",
   :madsrdf/code "isbd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the IFLA Review Group/Standing Committee of the IFLA Cataloguing Section"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/isbd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the IFLA Review Group/Standing Committee of the IFLA Cataloguing Section"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "isbd",
   :skos/prefLabel "ISBD: International standard bibliographic description"})

(def kam
  "Published by the Hrvatski drzavni arhiv : Muzejski dokumentacijski centar : Nacionalna i sveucilisna knjiznica u Zagrebu in Zagreb"
  {:db/ident :loc.descriptionConventions/kam,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Pravilnik za opis i pristup gardji u knjiznicama, arhivima i muzejima",
   :madsrdf/code "kam",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Hrvatski drzavni arhiv : Muzejski dokumentacijski centar : Nacionalna i sveucilisna knjiznica u Zagrebu in Zagreb"},
   :madsrdf/editorialNote "https://pravilnik.kam.hr/",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/kam,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Hrvatski drzavni arhiv : Muzejski dokumentacijski centar : Nacionalna i sveucilisna knjiznica u Zagrebu in Zagreb"},
   :skos/editorial "https://pravilnik.kam.hr/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "kam",
   :skos/prefLabel
   "Pravilnik za opis i pristup gardji u knjiznicama, arhivima i muzejima"})

(def katreg
  "Published by the Nasjonalbiblioteket in Oslo"
  {:db/ident :loc.descriptionConventions/katreg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Katalogiseringsregler",
   :madsrdf/code "katreg",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by the Nasjonalbiblioteket in Oslo"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Anglo-American cataloguing rules, second edition, oversatt og bearbiedet for Norske forhold ved Inger Cathrine Spangen",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Anglo-American cataloguing rules, second edition, oversatt og bearbiedet for Norske forhold ved Inger Cathrine Spangen",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/katreg,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by the Nasjonalbiblioteket in Oslo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "katreg",
   :skos/prefLabel "Katalogiseringsregler",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Anglo-American cataloguing rules, second edition, oversatt og bearbiedet for Norske forhold ved Inger Cathrine Spangen"}})

(def kdsdb
  "Published by the Dansk BiblioteksCenter in Ballreup"
  {:db/ident :loc.descriptionConventions/kdsdb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Katalogiseringsregler og bibliografisk standard for danske biblioteker",
   :madsrdf/code "kdsdb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Dansk BiblioteksCenter in Ballreup"},
   :madsrdf/editorialNote "http://www.kat-format.dk/kat_regl/default.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/kdsdb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by the Dansk BiblioteksCenter in Ballreup"},
   :skos/editorial "http://www.kat-format.dk/kat_regl/default.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "kdsdb",
   :skos/prefLabel
   "Katalogiseringsregler og bibliografisk standard for danske biblioteker"})

(def kids
  "Published by Informationsverbund Deutschschweiz in Zurich"
  {:db/ident :loc.descriptionConventions/kids,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Katalogisierungsregeln Informationsverbund Deutschschweiz",
   :madsrdf/code "kids",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Informationsverbund Deutschschweiz in Zurich"},
   :madsrdf/editorialNote "https://www.informationsverbund.ch/27.0.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/kids,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Informationsverbund Deutschschweiz in Zurich"},
   :skos/editorial "https://www.informationsverbund.ch/27.0.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "kids",
   :skos/prefLabel "Katalogisierungsregeln Informationsverbund Deutschschweiz"})

(def krsb
  "Published by Bibliotekstjanst in Lund"
  {:db/ident :loc.descriptionConventions/krsb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Katalogiseringsregler for svenska bibliotek",
   :madsrdf/code "krsb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Bibliotekstjanst in Lund"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/krsb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Bibliotekstjanst in Lund"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "krsb",
   :skos/prefLabel "Katalogiseringsregler for svenska bibliotek"})

(def lcmpt
  "Published by the Library of Congress in Washington, D.C."
  {:db/ident :loc.descriptionConventions/lcmpt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Library of Congress medium of performance thesaurus for music",
   :madsrdf/code "lcmpt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :madsrdf/editorialNote
   "http://loc.gov/aba/publications/FreeLCMPT/freelcmpt.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/lcmpt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the Library of Congress in Washington, D.C."},
   :skos/editorial "http://loc.gov/aba/publications/FreeLCMPT/freelcmpt.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "lcmpt",
   :skos/prefLabel
   "Library of Congress medium of performance thesaurus for music"})

(def local
  "Locally defined or unknown cataloging rules"
  {:db/ident :loc.descriptionConventions/local,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Locally defined or unknown cataloging rules",
   :madsrdf/code "local",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/local,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "local",
   :skos/prefLabel "Locally defined or unknown cataloging rules"})

(def mmlcc
  "Published by the Ministry of Defence in London"
  {:db/ident :loc.descriptionConventions/mmlcc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Manual of map library classification and cataloguing",
   :madsrdf/code "mmlcc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by the Ministry of Defence in London"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/mmlcc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by the Ministry of Defence in London"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "mmlcc",
   :skos/prefLabel "Manual of map library classification and cataloguing"})

(def ncafnor
  "Published by AFNOR in Paris"
  {:db/ident :loc.descriptionConventions/ncafnor,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Normes de catalogage publiées par l'Association française de normalisation",
   :madsrdf/code "ncafnor",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by AFNOR in Paris"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/ncafnor,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by AFNOR in Paris"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "ncafnor",
   :skos/prefLabel
   "Normes de catalogage publiées par l'Association française de normalisation"})

(def ncr
  "Published by the National Diet Library in Tokyo"
  {:db/ident :loc.descriptionConventions/ncr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Nihon mokuroku kisoku",
   :madsrdf/code "ncr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by the National Diet Library in Tokyo"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/ncr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by the National Diet Library in Tokyo"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "ncr",
   :skos/prefLabel "Nihon mokuroku kisoku"})

(def ncs
  "Published by the Biblioteca apostolica vaticana in Città del Vaticano"
  {:db/ident :loc.descriptionConventions/ncs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Norme per il catalogo degli stampati",
   :madsrdf/code "ncs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Biblioteca apostolica vaticana in Città del Vaticano"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/ncs,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Biblioteca apostolica vaticana in Città del Vaticano"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "ncs",
   :skos/prefLabel "Norme per il catalogo degli stampati"})

(def nmxcmdf
  "Published by the Secretaría de Economía. Dirección General de Normas in México"
  {:db/ident :loc.descriptionConventions/nmxcmdf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Norma Mexicana NMX-R-069-SCFI-2016",
   :madsrdf/code "nmxcmdf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Secretaría de Economía. Dirección General de Normas in México"},
   :madsrdf/editorialNote "http://fotobservatorio.mx/norma_mexicana.html",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Norma Mexicana NMX-R-069-SCFI-2016: Documentos Fotográficos-Lineamientos para su Catalogación",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Norma Mexicana NMX-R-069-SCFI-2016: Documentos Fotográficos-Lineamientos para su Catalogación",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/nmxcmdf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Secretaría de Economía. Dirección General de Normas in México"},
   :skos/editorial "http://fotobservatorio.mx/norma_mexicana.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "nmxcmdf",
   :skos/prefLabel "Norma Mexicana NMX-R-069-SCFI-2016",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Norma Mexicana NMX-R-069-SCFI-2016: Documentos Fotográficos-Lineamientos para su Catalogación"}})

(def ohcm
  "Published by the Society of American Archivists in Chicago"
  {:db/ident :loc.descriptionConventions/ohcm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Oral history cataloging manual",
   :madsrdf/code "ohcm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Society of American Archivists in Chicago"},
   :madsrdf/editorialNote
   "http://files.archivists.org/pubs/free/OralHistoryCatalogingManual.pdf",
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Matters, Marion E. Oral history cataloging manual",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Matters, Marion E. Oral history cataloging manual",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/ohcm,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the Society of American Archivists in Chicago"},
   :skos/editorial
   "http://files.archivists.org/pubs/free/OralHistoryCatalogingManual.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "ohcm",
   :skos/prefLabel "Oral history cataloging manual",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Matters, Marion E. Oral history cataloging manual"}})

(def pi
  "Published by Otto Harrasowitz in Wiesbaden"
  {:db/ident :loc.descriptionConventions/pi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Instruktionen für die alphabetischen Kataloge der preussischen Bibliotheken",
   :madsrdf/code "pi",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Otto Harrasowitz in Wiesbaden"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/pi,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Otto Harrasowitz in Wiesbaden"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "pi",
   :skos/prefLabel
   "Instruktionen für die alphabetischen Kataloge der preussischen Bibliotheken"})

(def pn
  "Published by the Library of Congress, Program for Cooperative Cataloging, in Washington, D.C."
  {:db/ident :loc.descriptionConventions/pn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Provider-neutral e-resource MARC record guidelines",
   :madsrdf/code "pn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by the Library of Congress, Program for Cooperative Cataloging, in Washington, D.C."},
   :madsrdf/editorialNote
   "https://www.loc.gov/aba/pcc/scs/documents/PCC-PN-guidelines.html",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/pn,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by the Library of Congress, Program for Cooperative Cataloging, in Washington, D.C."},
   :skos/editorial
   "https://www.loc.gov/aba/pcc/scs/documents/PCC-PN-guidelines.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "pn",
   :skos/prefLabel "Provider-neutral e-resource MARC record guidelines"})

(def ppiak
  "Published by Hrvatsko bibliotekarsko drustvo in Zagreb"
  {:db/ident :loc.descriptionConventions/ppiak,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Pravilnik i prirucnik za izradbu abecednih kataloga",
   :madsrdf/code "ppiak",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Hrvatsko bibliotekarsko drustvo in Zagreb"},
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Verona, Eva. Pravilnik i prirucnik za izradbu abecednih kataloga",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Verona, Eva. Pravilnik i prirucnik za izradbu abecednih kataloga",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/ppiak,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Hrvatsko bibliotekarsko drustvo in Zagreb"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "ppiak",
   :skos/prefLabel "Pravilnik i prirucnik za izradbu abecednih kataloga",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Verona, Eva. Pravilnik i prirucnik za izradbu abecednih kataloga"}})

(def psbo
  "Published by Kniga in Moskva"
  {:db/ident :loc.descriptionConventions/psbo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Pravila sostavleníìa bibliograficheskogo opisaníìa",
   :madsrdf/code "psbo",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Moskva"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/psbo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Moskva"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "psbo",
   :skos/prefLabel "Pravila sostavleníìa bibliograficheskogo opisaníìa"})

(def rad
  "Published by the Bureau of Canadian Archivists in Ottawa"
  {:db/ident :loc.descriptionConventions/rad,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Rules for archival description",
   :madsrdf/code "rad",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the Bureau of Canadian Archivists in Ottawa"},
   :madsrdf/editorialNote
   "http://www.archivescanada.ca/uploads/files/Publications/RADComplete_July2008.pdf",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rad,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the Bureau of Canadian Archivists in Ottawa"},
   :skos/editorial
   "http://www.archivescanada.ca/uploads/files/Publications/RADComplete_July2008.pdf",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rad",
   :skos/prefLabel "Rules for archival description"})

(def rak
  "Published by Reichert in Wiesbaden"
  {:db/ident :loc.descriptionConventions/rak,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Regeln für die alphabetische Katalogisierung",
   :madsrdf/code "rak",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Reichert in Wiesbaden"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rak,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Reichert in Wiesbaden"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rak",
   :skos/prefLabel "Regeln für die alphabetische Katalogisierung"})

(def rakddb
  "Ansetzungsform gemaess der RAK - Anwendung Der Deutschen Bibliothek"
  {:db/ident :loc.descriptionConventions/rakddb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Ansetzungsform gemaess der RAK - Anwendung Der Deutschen Bibliothek",
   :madsrdf/code "rakddb",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rakddb,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rakddb",
   :skos/prefLabel
   "Ansetzungsform gemaess der RAK - Anwendung Der Deutschen Bibliothek"})

(def rakwb
  "Published by Deutsches Bibliotheksinstitut in Berlin"
  {:db/ident :loc.descriptionConventions/rakwb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Regeln für die alphabetische Katalogisierung an wissenschaftlichen Bibliotheken",
   :madsrdf/code "rakwb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Deutsches Bibliotheksinstitut in Berlin"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rakwb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Deutsches Bibliotheksinstitut in Berlin"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rakwb",
   :skos/prefLabel
   "Regeln für die alphabetische Katalogisierung an wissenschaftlichen Bibliotheken"})

(def rda
  "Published by the American Library Association in Chicago"
  {:db/ident :loc.descriptionConventions/rda,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Resource description and access",
   :madsrdf/code "rda",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by the American Library Association in Chicago"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rda,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by the American Library Association in Chicago"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rda",
   :skos/prefLabel "Resource description and access"})

(def rdc
  "Published by Dirección General del Libro, Archivos y Bibliotecas in Madrid"
  {:db/ident :loc.descriptionConventions/rdc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Reglas de catalogación",
   :madsrdf/code "rdc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Dirección General del Libro, Archivos y Bibliotecas in Madrid"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rdc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Dirección General del Libro, Archivos y Bibliotecas in Madrid"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rdc",
   :skos/prefLabel "Reglas de catalogación"})

(def rica
  "Published by Istituto central per il catalogo unico delle biblioteche italiane e per le informazioni bibliografiche in Roma"
  {:db/ident :loc.descriptionConventions/rica,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Regole italiane di catalogazione per autori",
   :madsrdf/code "rica",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Istituto central per il catalogo unico delle biblioteche italiane e per le informazioni bibliografiche in Roma"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rica,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Istituto central per il catalogo unico delle biblioteche italiane e per le informazioni bibliografiche in Roma"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rica",
   :skos/prefLabel "Regole italiane di catalogazione per autori"})

(def rna
  "Regeln zur Erschließung von Nachlässen und Autographen"
  {:db/ident :loc.descriptionConventions/rna,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Regeln zur Erschließung von Nachlässen und Autographen",
   :madsrdf/code "rna",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rna,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rna",
   :skos/prefLabel "Regeln zur Erschließung von Nachlässen und Autographen"})

(def rnab
  "RNAB für Personen-, Familien-, Körperschaftsarchive und Sammlungen"
  {:db/ident :loc.descriptionConventions/rnab,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "RNAB für Personen-, Familien-, Körperschaftsarchive und Sammlungen",
   :madsrdf/code "rnab",
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Ressourcenerschließung mit Normdaten in Archiven und Bibliotheken (RNAB) für Personen-, Familien-, Körperschaftsarchive und Sammlungen",
    :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Ressourcenerschließung mit Normdaten in Archiven und Bibliotheken (RNAB) für Personen-, Familien-, Körperschaftsarchive und Sammlungen",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rnab,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rnab",
   :skos/prefLabel
   "RNAB für Personen-, Familien-, Körperschaftsarchive und Sammlungen",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Ressourcenerschließung mit Normdaten in Archiven und Bibliotheken (RNAB) für Personen-, Familien-, Körperschaftsarchive und Sammlungen"}})

(def rpk
  "Published by Rossiiskaíà Gosudarstvennaíà Biblioteka in Moskva"
  {:db/ident :loc.descriptionConventions/rpk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Rossiiskiie pravila katalogizatsii",
   :madsrdf/code "rpk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Rossiiskaíà Gosudarstvennaíà Biblioteka in Moskva"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/rpk,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Rossiiskaíà Gosudarstvennaíà Biblioteka in Moskva"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "rpk",
   :skos/prefLabel "Rossiiskiie pravila katalogizatsii"})

(def sscde
  "Published by Education Services Australia Ltd."
  {:db/ident :loc.descriptionConventions/sscde,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "SCIS standards for cataloguing and data entry",
   :madsrdf/code "sscde",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Education Services Australia Ltd."},
   :madsrdf/editorialNote
   "http://www2.curriculum.edu.au/scis/cataloguing_standards.html",
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Schools Catalogue Information Service standards",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Schools Catalogue Information Service standards",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/sscde,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Education Services Australia Ltd."},
   :skos/editorial
   "http://www2.curriculum.edu.au/scis/cataloguing_standards.html",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "sscde",
   :skos/prefLabel "SCIS standards for cataloguing and data entry",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Schools Catalogue Information Service standards"}})

(def vd16
  "Formalerschliessung nach dem Verzeichnis der Drucke des 16. Jahrhunderts"
  {:db/ident :loc.descriptionConventions/vd16,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Formalerschliessung nach dem Verzeichnis der Drucke des 16. Jahrhunderts",
   :madsrdf/code "vd16",
   :madsrdf/hasVariant {:madsrdf/variantLabel "VD 16",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.descriptionConventions/collection_descriptionConventions,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/descriptionConventions,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "VD 16",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.descriptionConventions/vd16,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/descriptionConventions,
   :skos/notation "vd16",
   :skos/prefLabel
   "Formalerschliessung nach dem Verzeichnis der Drucke des 16. Jahrhunderts",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "VD 16"}})

(def ^{:private true} descriptionConventions
  "Description Conventions is a vocabulary that provides URIs for standard rules or guidelines for describing bibliographic resources, commonly called cataloging rules."
  {:db/ident :loc.vocabulary/descriptionConventions,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Description Conventions is a vocabulary that provides URIs for standard rules or guidelines for describing bibliographic resources, commonly called cataloging rules."},
   :madsrdf/hasMADSSchemeMember [:loc.descriptionConventions/ncs
                                 :loc.descriptionConventions/gihc
                                 :loc.descriptionConventions/aacr
                                 :loc.descriptionConventions/mmlcc
                                 :loc.descriptionConventions/ppiak
                                 :loc.descriptionConventions/enol
                                 :loc.descriptionConventions/ncr
                                 :loc.descriptionConventions/dcrmmss
                                 :loc.descriptionConventions/dcarlisnaaf
                                 :loc.descriptionConventions/rna
                                 :loc.descriptionConventions/appm
                                 :loc.descriptionConventions/din1505
                                 :loc.descriptionConventions/krsb
                                 :loc.descriptionConventions/cgcrb
                                 :loc.descriptionConventions/dcrb
                                 :loc.descriptionConventions/rda
                                 :loc.descriptionConventions/dcrmc
                                 :loc.descriptionConventions/ccr
                                 :loc.descriptionConventions/dcrmb
                                 :loc.descriptionConventions/kam
                                 :loc.descriptionConventions/bps
                                 :loc.descriptionConventions/crlp
                                 :loc.descriptionConventions/ncafnor
                                 :loc.descriptionConventions/kids
                                 :loc.descriptionConventions/cco
                                 :loc.descriptionConventions/rakddb
                                 :loc.descriptionConventions/amim
                                 :loc.descriptionConventions/rpk
                                 :loc.descriptionConventions/dcrmr
                                 :loc.descriptionConventions/dcrmg
                                 :loc.descriptionConventions/katreg
                                 :loc.descriptionConventions/rdc
                                 :loc.descriptionConventions/fobidrtb
                                 :loc.descriptionConventions/rnab
                                 :loc.descriptionConventions/hmstcn
                                 :loc.descriptionConventions/bdrb
                                 :loc.descriptionConventions/dmbsb
                                 :loc.descriptionConventions/pi
                                 :loc.descriptionConventions/dcrmm
                                 :loc.descriptionConventions/isbd
                                 :loc.descriptionConventions/kdsdb
                                 :loc.descriptionConventions/rica
                                 :loc.descriptionConventions/nmxcmdf
                                 :loc.descriptionConventions/fiafcm
                                 :loc.descriptionConventions/estc
                                 :loc.descriptionConventions/dcrms
                                 :loc.descriptionConventions/local
                                 :loc.descriptionConventions/psbo
                                 :loc.descriptionConventions/rak
                                 :loc.descriptionConventions/pn
                                 :loc.descriptionConventions/vd16
                                 :loc.descriptionConventions/iosr
                                 :loc.descriptionConventions/dcgpm
                                 :loc.descriptionConventions/rakwb
                                 :loc.descriptionConventions/rad
                                 :loc.descriptionConventions/ohcm
                                 :loc.descriptionConventions/amremm
                                 :loc.descriptionConventions/dacs
                                 :loc.descriptionConventions/sscde
                                 :loc.descriptionConventions/lcmpt],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Description Conventions"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/descriptionConventions,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Description Conventions is a vocabulary that provides URIs for standard rules or guidelines for describing bibliographic resources, commonly called cataloging rules."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"}})