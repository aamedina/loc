(ns net.wikipunk.rdf.loc.marcauthen
  "http://id.loc.gov/vocabulary/marcauthen/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/marcauthen.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.marcauthen"
                       "http://id.loc.gov/vocabulary/marcauthen/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.marcauthen",
   :rdfa/uri          "http://id.loc.gov/vocabulary/marcauthen/"})

(def anuc
  "The descriptive elements have been edited and all headings verified against the relevant authority file to prepare the record for inclusion in the Australian National Bibliographic Database. The Australian National Bibliographic Database authenticates records for Australian imprints, and bibliographic and authority records of Australian interest."
  {:db/ident :loc.marcauthen/anuc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Australian National Union Catalog",
   :madsrdf/code "anuc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings verified against the relevant authority file to prepare the record for inclusion in the Australian National Bibliographic Database. The Australian National Bibliographic Database authenticates records for Australian imprints, and bibliographic and authority records of Australian interest."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/anuc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings verified against the relevant authority file to prepare the record for inclusion in the Australian National Bibliographic Database. The Australian National Bibliographic Database authenticates records for Australian imprints, and bibliographic and authority records of Australian interest."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "anuc",
   :skos/prefLabel "Australian National Union Catalog"})

(def croatica
  "The descriptive elements have been edited and all headings verified against the relevant authority file to prepare the record for inclusion in the Croatian National Bibliography."
  {:db/ident :loc.marcauthen/croatica,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Croatian National Bibliography",
   :madsrdf/code "croatica",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings verified against the relevant authority file to prepare the record for inclusion in the Croatian National Bibliography."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/croatica,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings verified against the relevant authority file to prepare the record for inclusion in the Croatian National Bibliography."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "croatica",
   :skos/prefLabel "Croatian National Bibliography"})

(def cyac
  "Code cyac signifies that the cataloging was done as part of the Library of Congress Children's and Young Adults' Cataloging Program (formerly called the Library of Congress Annotated Card Program) whereby summaries and children's subject headings are added to facilitate discovery of a resource by a juvenile audience."
  {:db/ident :loc.marcauthen/cyac,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-02-25T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Library of Congress Children's and Young Adults' Cataloging Program",
   :madsrdf/code "cyac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Code cyac signifies that the cataloging was done as part of the Library of Congress Children's and Young Adults' Cataloging Program (formerly called the Library of Congress Annotated Card Program) whereby summaries and children's subject headings are added to facilitate discovery of a resource by a juvenile audience."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :madsrdf/useFor :loc.marcauthen/lcac,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-02-25T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/cyac,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Code cyac signifies that the cataloging was done as part of the Library of Congress Children's and Young Adults' Cataloging Program (formerly called the Library of Congress Annotated Card Program) whereby summaries and children's subject headings are added to facilitate discovery of a resource by a juvenile audience."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "cyac",
   :skos/prefLabel
   "Library of Congress Children's and Young Adults' Cataloging Program"})

(def dc
  "The record was converted from a simple resource description record in another syntax (e.g., HTML or SGML) using the Dublin Core metadata element set. The content of the record (descriptive elements and headings) may or may not follow any cataloging standard."
  {:db/ident :loc.marcauthen/dc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dublin Core",
   :madsrdf/code "dc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record was converted from a simple resource description record in another syntax (e.g., HTML or SGML) using the Dublin Core metadata element set. The content of the record (descriptive elements and headings) may or may not follow any cataloging standard."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/dc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record was converted from a simple resource description record in another syntax (e.g., HTML or SGML) using the Dublin Core metadata element set. The content of the record (descriptive elements and headings) may or may not follow any cataloging standard."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "dc",
   :skos/prefLabel "Dublin Core"})

(def dhca
  "The record was authenticated under the auspices of the Dance Heritage Coalition Access Project."
  {:db/ident :loc.marcauthen/dhca,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dance Heritage Coalition Access Project",
   :madsrdf/code "dhca",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record was authenticated under the auspices of the Dance Heritage Coalition Access Project."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/dhca,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record was authenticated under the auspices of the Dance Heritage Coalition Access Project."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "dhca",
   :skos/prefLabel "Dance Heritage Coalition Access Project"})

(def dlr
  "The record was authenticated under the auspices of a digital library registry."
  {:db/ident :loc.marcauthen/dlr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Digital library registry",
   :madsrdf/code "dlr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record was authenticated under the auspices of a digital library registry."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/dlr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record was authenticated under the auspices of a digital library registry."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "dlr",
   :skos/prefLabel "Digital library registry"})

(def finb
  "The record is part of the Finnish National Bibliography."
  {:db/ident :loc.marcauthen/finb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Finnish National Bibliography",
   :madsrdf/code "finb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The record is part of the Finnish National Bibliography."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/finb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The record is part of the Finnish National Bibliography."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "finb",
   :skos/prefLabel "Finnish National Bibliography"})

(def finbd
  "The record is part of the Finnish National Discography."
  {:db/ident :loc.marcauthen/finbd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Finnish National Discography",
   :madsrdf/code "finbd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The record is part of the Finnish National Discography."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/finbd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The record is part of the Finnish National Discography."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "finbd",
   :skos/prefLabel "Finnish National Discography"})

(def gamma
  "The record was authenticated under the auspices of the Georgia Archives and Manuscripts Automated Access Project, coordinated by the University Center in Georgia."
  {:db/ident :loc.marcauthen/gamma,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Georgia Archives and Manuscripts Automated Access Project",
   :madsrdf/code "gamma",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record was authenticated under the auspices of the Georgia Archives and Manuscripts Automated Access Project, coordinated by the University Center in Georgia."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gamma,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record was authenticated under the auspices of the Georgia Archives and Manuscripts Automated Access Project, coordinated by the University Center in Georgia."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gamma",
   :skos/prefLabel "Georgia Archives and Manuscripts Automated Access Project"})

(def gils
  "The record has been derived from a locator record contained in a GILS server using the GILS Application Profile. The content of the record (descriptive elements and headings) may or may not follow any cataloging standards."
  {:db/ident :loc.marcauthen/gils,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Government Information Location Service",
   :madsrdf/code "gils",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record has been derived from a locator record contained in a GILS server using the GILS Application Profile. The content of the record (descriptive elements and headings) may or may not follow any cataloging standards."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gils,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record has been derived from a locator record contained in a GILS server using the GILS Application Profile. The content of the record (descriptive elements and headings) may or may not follow any cataloging standards."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gils",
   :skos/prefLabel "Government Information Location Service"})

(def gnd1
  "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by a curation team of a library network."
  {:db/ident :loc.marcauthen/gnd1,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "GND authenticated by curation team of a library network",
   :madsrdf/code "gnd1",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by a curation team of a library network."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gnd1,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by a curation team of a library network."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gnd1",
   :skos/prefLabel "GND authenticated by curation team of a library network"})

(def gnd2
  "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by a local curation team."
  {:db/ident :loc.marcauthen/gnd2,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GND authenticated by a local curation team",
   :madsrdf/code "gnd2",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by a local curation team."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gnd2,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by a local curation team."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gnd2",
   :skos/prefLabel "GND authenticated by a local curation team"})

(def gnd3
  "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by trained users."
  {:db/ident :loc.marcauthen/gnd3,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GND authenticated by trained users",
   :madsrdf/code "gnd3",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by trained users."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gnd3,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by trained users."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gnd3",
   :skos/prefLabel "GND authenticated by trained users"})

(def gnd4
  "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by untrained users."
  {:db/ident :loc.marcauthen/gnd4,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GND authenticated by untrained users",
   :madsrdf/code "gnd4",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by untrained users."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gnd4,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by untrained users."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gnd4",
   :skos/prefLabel "GND authenticated by untrained users"})

(def gnd5
  "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by other non-librarian users."
  {:db/ident :loc.marcauthen/gnd5,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GND authenticated by other non-librarian users",
   :madsrdf/code "gnd5",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by other non-librarian users."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gnd5,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was authenticated by other non-librarian users."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gnd5",
   :skos/prefLabel "GND authenticated by other non-librarian users"})

(def gnd6
  "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it consists of legacy data not authenticated by a curation team."
  {:db/ident :loc.marcauthen/gnd6,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GND legacy data, not authenticated",
   :madsrdf/code "gnd6",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it consists of legacy data not authenticated by a curation team."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gnd6,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it consists of legacy data not authenticated by a curation team."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gnd6",
   :skos/prefLabel "GND legacy data, not authenticated"})

(def gnd7
  "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was not authenticated, but generated automatically."
  {:db/ident :loc.marcauthen/gnd7,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "GND automatically generated record, not authenticated",
   :madsrdf/code "gnd7",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was not authenticated, but generated automatically."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gnd7,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it was not authenticated, but generated automatically."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gnd7",
   :skos/prefLabel "GND automatically generated record, not authenticated"})

(def gndz
  "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it is protected from editing or updating."
  {:db/ident :loc.marcauthen/gndz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GND protected record",
   :madsrdf/code "gndz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it is protected from editing or updating."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/gndz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is part of the Integrated Authority File (GND - Gemeinsame Normdatei (Deutsche Nationalbibliothek)) and that it is protected from editing or updating."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "gndz",
   :skos/prefLabel "GND protected record"})

(def isdsc
  "The CONSER ISSN Network data elements have been verified by ISSN Canada. ISSN Canada authenticates ISSN data elements for Canadian imprints."
  {:db/ident :loc.marcauthen/isdsc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ISSN Canada",
   :madsrdf/code "isdsc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The CONSER ISSN Network data elements have been verified by ISSN Canada. ISSN Canada authenticates ISSN data elements for Canadian imprints."},
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "International Serials Data System",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "International Serials Data System",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/isdsc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The CONSER ISSN Network data elements have been verified by ISSN Canada. ISSN Canada authenticates ISSN data elements for Canadian imprints."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "isdsc",
   :skos/prefLabel "ISSN Canada",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "International Serials Data System"}})

(def issnuk
  "The ISSN Network data elements have been verified by ISSN UK. ISSN UK authenticates ISSN data elements for United Kingdom imprints."
  {:db/ident :loc.marcauthen/issnuk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ISSN UK Centre",
   :madsrdf/code "issnuk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The ISSN Network data elements have been verified by ISSN UK. ISSN UK authenticates ISSN data elements for United Kingdom imprints."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/issnuk,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The ISSN Network data elements have been verified by ISSN UK. ISSN UK authenticates ISSN data elements for United Kingdom imprints."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "issnuk",
   :skos/prefLabel "ISSN UK Centre"})

(def lac
  "The descriptive elements and headings have been verified by Library and Archives Canada. LAC authenticates full monograph records for Canadian imprints and records of Canadian interest."
  {:db/ident :loc.marcauthen/lac,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Library and Archives Canada monographs",
   :madsrdf/code "lac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements and headings have been verified by Library and Archives Canada. LAC authenticates full monograph records for Canadian imprints and records of Canadian interest."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lac,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements and headings have been verified by Library and Archives Canada. LAC authenticates full monograph records for Canadian imprints and records of Canadian interest."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lac",
   :skos/prefLabel "Library and Archives Canada monographs"})

(def lacderived
  "The record has been created from data derived from an external source. Descriptive elements and headings have not been authenticated by a cataloger."
  {:db/ident :loc.marcauthen/lacderived,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Library and Archives Canada derived cataloging",
   :madsrdf/code "lacderived",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record has been created from data derived from an external source. Descriptive elements and headings have not been authenticated by a cataloger."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lacderived,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record has been created from data derived from an external source. Descriptive elements and headings have not been authenticated by a cataloger."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lacderived",
   :skos/prefLabel "Library and Archives Canada derived cataloging"})

(def lc
  "The CONSER descriptive elements and all headings have been verified by the Library of Congress. LC authenticates records not within the purview of Library and Archives Canada."
  {:db/ident :loc.marcauthen/lc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Library of Congress",
   :madsrdf/code "lc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The CONSER descriptive elements and all headings have been verified by the Library of Congress. LC authenticates records not within the purview of Library and Archives Canada."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The CONSER descriptive elements and all headings have been verified by the Library of Congress. LC authenticates records not within the purview of Library and Archives Canada."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lc",
   :skos/prefLabel "Library of Congress"})

(def lccopycat
  "The Library of Congress has used another organization's record as the basis for its cataloging. All headings have been checked against the relevant authority file, except for series headings in records used after May 31, 2006 and except for subject headings not from Library of Congress Subject Headings."
  {:db/ident :loc.marcauthen/lccopycat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC Copy Cataloging",
   :madsrdf/code "lccopycat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Library of Congress has used another organization's record as the basis for its cataloging. All headings have been checked against the relevant authority file, except for series headings in records used after May 31, 2006 and except for subject headings not from Library of Congress Subject Headings."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lccopycat,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Library of Congress has used another organization's record as the basis for its cataloging. All headings have been checked against the relevant authority file, except for series headings in records used after May 31, 2006 and except for subject headings not from Library of Congress Subject Headings."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lccopycat",
   :skos/prefLabel "LC Copy Cataloging"})

(def lccopycat-nm
  "The Library of Congress has used an existing bibliographic record that is not an exact match of the item in hand as the basis for its cataloging. The data in the record has been updated to fully reflect the item in hand."
  {:db/ident :loc.marcauthen/lccopycat-nm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC Copy Cataloging-Near Match",
   :madsrdf/code "lccopycat-nm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Library of Congress has used an existing bibliographic record that is not an exact match of the item in hand as the basis for its cataloging. The data in the record has been updated to fully reflect the item in hand."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lccopycat-nm,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Library of Congress has used an existing bibliographic record that is not an exact match of the item in hand as the basis for its cataloging. The data in the record has been updated to fully reflect the item in hand."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lccopycat-nm",
   :skos/prefLabel "LC Copy Cataloging-Near Match"})

(def lcd
  "The CONSER descriptive elements and all headings have been verified by the Library of Congress or an authenticating CONSER participant."
  {:db/ident :loc.marcauthen/lcd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CONSER full authority application",
   :madsrdf/code "lcd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The CONSER descriptive elements and all headings have been verified by the Library of Congress or an authenticating CONSER participant."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lcd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The CONSER descriptive elements and all headings have been verified by the Library of Congress or an authenticating CONSER participant."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lcd",
   :skos/prefLabel "CONSER full authority application"})

(def lcderive
  "The Library of Congress has used another organization's catalog record essentially \"as is\" for its cataloging. All headings and uniform titles have been processed through special software developed to evaluate and ensure that the headings and uniform titles match all existing LC authority records and conform to cataloging rules."
  {:db/ident :loc.marcauthen/lcderive,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC derived cataloging",
   :madsrdf/code "lcderive",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Library of Congress has used another organization's catalog record essentially \"as is\" for its cataloging. All headings and uniform titles have been processed through special software developed to evaluate and ensure that the headings and uniform titles match all existing LC authority records and conform to cataloging rules."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lcderive,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Library of Congress has used another organization's catalog record essentially \"as is\" for its cataloging. All headings and uniform titles have been processed through special software developed to evaluate and ensure that the headings and uniform titles match all existing LC authority records and conform to cataloging rules."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lcderive",
   :skos/prefLabel "LC derived cataloging"})

(def lchlas
  "The descriptive and subject elements have been derived from the internal Library of Congress Handbook of Latin American Studies file. Name headings may or may not have been verified against LC's name authority file."
  {:db/ident :loc.marcauthen/lchlas,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC Handbook of Latin American Studies",
   :madsrdf/code "lchlas",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive and subject elements have been derived from the internal Library of Congress Handbook of Latin American Studies file. Name headings may or may not have been verified against LC's name authority file."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lchlas,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive and subject elements have been derived from the internal Library of Congress Handbook of Latin American Studies file. Name headings may or may not have been verified against LC's name authority file."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lchlas",
   :skos/prefLabel "LC Handbook of Latin American Studies"})

(def lcllh
  "The descriptive elements have been derived from the internal Library of Congress Index to Hispanic Legislation. Name headings have been verified against LC's name authority file."
  {:db/ident :loc.marcauthen/lcllh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC Law Library Hispanic",
   :madsrdf/code "lcllh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been derived from the internal Library of Congress Index to Hispanic Legislation. Name headings have been verified against LC's name authority file."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lcllh,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been derived from the internal Library of Congress Index to Hispanic Legislation. Name headings have been verified against LC's name authority file."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lcllh",
   :skos/prefLabel "LC Law Library Hispanic"})

(def lcnccp
  "The record is a Library of Congress National Coordinated Cataloging Program record. The headings are all present in LC's authority files and the descriptive elements follow AACR2."
  {:db/ident :loc.marcauthen/lcnccp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC National Coordinated Cataloging Program",
   :madsrdf/code "lcnccp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is a Library of Congress National Coordinated Cataloging Program record. The headings are all present in LC's authority files and the descriptive elements follow AACR2."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lcnccp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is a Library of Congress National Coordinated Cataloging Program record. The headings are all present in LC's authority files and the descriptive elements follow AACR2."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lcnccp",
   :skos/prefLabel "LC National Coordinated Cataloging Program"})

(def lcnitrate
  "The descriptive elements have been derived from a Library of Congress database containing inventory information on LC's nitrate film collection. Name headings have not been verified against LC's name authority file."
  {:db/ident :loc.marcauthen/lcnitrate,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC Nitrite Film",
   :madsrdf/code "lcnitrate",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been derived from a Library of Congress database containing inventory information on LC's nitrate film collection. Name headings have not been verified against LC's name authority file."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lcnitrate,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been derived from a Library of Congress database containing inventory information on LC's nitrate film collection. Name headings have not been verified against LC's name authority file."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lcnitrate",
   :skos/prefLabel "LC Nitrite Film"})

(def lcnuc
  "The descriptive elements have been edited and all headings verified against the relevant authority file to prepare the records for inclusion in an LC National Union Catalog file."
  {:db/ident :loc.marcauthen/lcnuc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "National Union Catalog",
   :madsrdf/code "lcnuc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings verified against the relevant authority file to prepare the records for inclusion in an LC National Union Catalog file."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lcnuc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings verified against the relevant authority file to prepare the records for inclusion in an LC National Union Catalog file."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lcnuc",
   :skos/prefLabel "National Union Catalog"})

(def lcode
  "The record is from one of LC's overseas field offices. The descriptive elements follow AACR2 and the headings have been checked off-line against LC's name authority file using MARC-Names."
  {:db/ident :loc.marcauthen/lcode,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC Overseas Data Entry",
   :madsrdf/code "lcode",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record is from one of LC's overseas field offices. The descriptive elements follow AACR2 and the headings have been checked off-line against LC's name authority file using MARC-Names."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/lcode,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record is from one of LC's overseas field offices. The descriptive elements follow AACR2 and the headings have been checked off-line against LC's name authority file using MARC-Names."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "lcode",
   :skos/prefLabel "LC Overseas Data Entry"})

(def msc
  "The CONSER descriptive elements have been verified by the Library of Congress or an authenticating CONSER participant. All headings have been checked against the relevant authority file, but an authority record was not found for one or more headings."
  {:db/ident :loc.marcauthen/msc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CONSER minimal authority application",
   :madsrdf/code "msc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The CONSER descriptive elements have been verified by the Library of Congress or an authenticating CONSER participant. All headings have been checked against the relevant authority file, but an authority record was not found for one or more headings."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/msc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The CONSER descriptive elements have been verified by the Library of Congress or an authenticating CONSER participant. All headings have been checked against the relevant authority file, but an authority record was not found for one or more headings."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "msc",
   :skos/prefLabel "CONSER minimal authority application"})

(def natgaz
  "The heading (geographic feature name) for the record has been approved by the U.S. Board of Geographic Names for inclusion in the National Gazetteer maintained by the U.S. Geological Survey. The name is the official name for the U.S. geographic feature, for general use and for use in Federal printed and electronic products."
  {:db/ident :loc.marcauthen/natgaz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "U.S. National Gazetteer Geographic Feature Name",
   :madsrdf/code "natgaz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The heading (geographic feature name) for the record has been approved by the U.S. Board of Geographic Names for inclusion in the National Gazetteer maintained by the U.S. Geological Survey. The name is the official name for the U.S. geographic feature, for general use and for use in Federal printed and electronic products."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/natgaz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The heading (geographic feature name) for the record has been approved by the U.S. Board of Geographic Names for inclusion in the National Gazetteer maintained by the U.S. Geological Survey. The name is the official name for the U.S. geographic feature, for general use and for use in Federal printed and electronic products."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "natgaz",
   :skos/prefLabel "U.S. National Gazetteer Geographic Feature Name"})

(def nbr
  "Signifies unambiguous identification that a record is part of a national bibliography."
  {:db/ident :loc.marcauthen/nbr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "National Bibliography Resource",
   :madsrdf/code "nbr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Signifies unambiguous identification that a record is part of a national bibliography."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/nbr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signifies unambiguous identification that a record is part of a national bibliography."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "nbr",
   :skos/prefLabel "National Bibliography Resource"})

(def nlc
  "The CONSER descriptive elements and headings have been verified by Library and Archives Canada. LAC authenticates records for Canadian imprints and records of Canadian interest."
  {:db/ident :loc.marcauthen/nlc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Library and Archives Canada",
   :madsrdf/code "nlc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The CONSER descriptive elements and headings have been verified by Library and Archives Canada. LAC authenticates records for Canadian imprints and records of Canadian interest."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/nlc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The CONSER descriptive elements and headings have been verified by Library and Archives Canada. LAC authenticates records for Canadian imprints and records of Canadian interest."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "nlc",
   :skos/prefLabel "Library and Archives Canada"})

(def nlmcopyc
  "The National Library of Medicine has used another organization's record as the basis for its cataloging. All headings have been checked against the relevant authority file (except subject headings not from the National Library of Medicine)."
  {:db/ident :loc.marcauthen/nlmcopyc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "National Library of Medicine Copy Cataloging",
   :madsrdf/code "nlmcopyc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The National Library of Medicine has used another organization's record as the basis for its cataloging. All headings have been checked against the relevant authority file (except subject headings not from the National Library of Medicine)."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/nlmcopyc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The National Library of Medicine has used another organization's record as the basis for its cataloging. All headings have been checked against the relevant authority file (except subject headings not from the National Library of Medicine)."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "nlmcopyc",
   :skos/prefLabel "National Library of Medicine Copy Cataloging"})

(def norbibl
  "The descriptive elements have been edited and all headings were verified by the National Library of Norway."
  {:db/ident :loc.marcauthen/norbibl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "National Library of Norway (Nasjonalbiblioteket)",
   :madsrdf/code "norbibl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings were verified by the National Library of Norway."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/norbibl,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings were verified by the National Library of Norway."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "norbibl",
   :skos/prefLabel "National Library of Norway (Nasjonalbiblioteket)"})

(def nsdp
  "The data elements have been verified by the United States ISSN Centre. The U.S. ISSN Center assigns and authenticates ISSN Network data elements for U.S. imprints."
  {:db/ident :loc.marcauthen/nsdp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-07-08T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "U.S. ISSN Center",
   :madsrdf/code "nsdp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The data elements have been verified by the United States ISSN Centre. The U.S. ISSN Center assigns and authenticates ISSN Network data elements for U.S. imprints."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "National Serials Data Program",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "National Serials Data Program",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2021-07-08T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.marcauthen/nsdp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2018-08-31T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.marcauthen/nsdp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The data elements have been verified by the United States ISSN Centre. The U.S. ISSN Center assigns and authenticates ISSN Network data elements for U.S. imprints."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "nsdp",
   :skos/prefLabel "U.S. ISSN Center",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "National Serials Data Program"}})

(def ntccf
  "The descriptive elements have been derived from data in the Library of Congress National Translations Center Citation File. Name headings have not been verified against LC's name authority file."
  {:db/ident :loc.marcauthen/ntccf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC National Translations Center Citation File",
   :madsrdf/code "ntccf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been derived from data in the Library of Congress National Translations Center Citation File. Name headings have not been verified against LC's name authority file."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/ntccf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been derived from data in the Library of Congress National Translations Center Citation File. Name headings have not been verified against LC's name authority file."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "ntccf",
   :skos/prefLabel "LC National Translations Center Citation File"})

(def nznb
  "The descriptive elements have been edited and all headings were verified against the relevant authority file to prepare the record for inclusion in the New Zealand National Bibliography."
  {:db/ident :loc.marcauthen/nznb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "New Zealand National Bibliography",
   :madsrdf/code "nznb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings were verified against the relevant authority file to prepare the record for inclusion in the New Zealand National Bibliography."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/nznb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and all headings were verified against the relevant authority file to prepare the record for inclusion in the New Zealand National Bibliography."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "nznb",
   :skos/prefLabel "New Zealand National Bibliography"})

(def pcc
  "The record was authenticated under the auspices of the Program for Cooperative Cataloging. All name and series headings have been checked against the appropriate national level authority file and authority records have been created if they did not already exist. Subject headings are checked for authorized forms or combinations supported by the relevant authority."
  {:db/ident :loc.marcauthen/pcc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Program for Cooperative Cataloging",
   :madsrdf/code "pcc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record was authenticated under the auspices of the Program for Cooperative Cataloging. All name and series headings have been checked against the appropriate national level authority file and authority records have been created if they did not already exist. Subject headings are checked for authorized forms or combinations supported by the relevant authority."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/pcc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record was authenticated under the auspices of the Program for Cooperative Cataloging. All name and series headings have been checked against the appropriate national level authority file and authority records have been created if they did not already exist. Subject headings are checked for authorized forms or combinations supported by the relevant authority."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "pcc",
   :skos/prefLabel "Program for Cooperative Cataloging"})

(def premarc
  "The record was converted to machine-readable form as part of a Library of Congress retrospective conversion project. The source records used in the initial phase of this project (1978-1979) were printed catalog cards taken from general, music, and atlas and map shelflist files at the Library of Congress. Subsequently phases used printed catalog cards from other LC files."
  {:db/ident :loc.marcauthen/premarc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LC PreMARC Retrospective Conversion Project",
   :madsrdf/code "premarc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record was converted to machine-readable form as part of a Library of Congress retrospective conversion project. The source records used in the initial phase of this project (1978-1979) were printed catalog cards taken from general, music, and atlas and map shelflist files at the Library of Congress. Subsequently phases used printed catalog cards from other LC files."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/premarc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record was converted to machine-readable form as part of a Library of Congress retrospective conversion project. The source records used in the initial phase of this project (1978-1979) were printed catalog cards taken from general, music, and atlas and map shelflist files at the Library of Congress. Subsequently phases used printed catalog cards from other LC files."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "premarc",
   :skos/prefLabel "LC PreMARC Retrospective Conversion Project"})

(def reveal
  "The MARC record conforms to the criteria for inclusion in the REVEAL union catalog."
  {:db/ident :loc.marcauthen/reveal,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "REVEAL Union Catalog Project",
   :madsrdf/code "reveal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The MARC record conforms to the criteria for inclusion in the REVEAL union catalog."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/reveal,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The MARC record conforms to the criteria for inclusion in the REVEAL union catalog."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "reveal",
   :skos/prefLabel "REVEAL Union Catalog Project"})

(def sanb
  "The descriptive elements and all headings in the records have been authenticated for inclusion in the South African National Bibliography Project."
  {:db/ident :loc.marcauthen/sanb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "South African National Bibliography Project",
   :madsrdf/code "sanb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements and all headings in the records have been authenticated for inclusion in the South African National Bibliography Project."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/sanb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements and all headings in the records have been authenticated for inclusion in the South African National Bibliography Project."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "sanb",
   :skos/prefLabel "South African National Bibliography Project"})

(def scipio
  "The descriptive elements and all headings in the records have been authenticated for inclusion in Scipio."
  {:db/ident :loc.marcauthen/scipio,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "SCIPIO: Art and Rare Book Sales Catalogs",
   :madsrdf/code "scipio",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements and all headings in the records have been authenticated for inclusion in Scipio."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/scipio,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements and all headings in the records have been authenticated for inclusion in Scipio."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "scipio",
   :skos/prefLabel "SCIPIO: Art and Rare Book Sales Catalogs"})

(def toknb
  "The descriptive elements have been edited and the record authenticated for inclusion in the Tokelau National Bibliography."
  {:db/ident :loc.marcauthen/toknb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Tokelau National Bibliography",
   :madsrdf/code "toknb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and the record authenticated for inclusion in the Tokelau National Bibliography."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/toknb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The descriptive elements have been edited and the record authenticated for inclusion in the Tokelau National Bibliography."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "toknb",
   :skos/prefLabel "Tokelau National Bibliography"})

(def ukblcatcopy
  "The British Library has used another organization's catalog record essentially \"as is\" for its cataloging. All name headings have been checked against the relevant authority file."
  {:db/ident :loc.marcauthen/ukblcatcopy,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "British Library derived copy cataloging",
   :madsrdf/code "ukblcatcopy",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The British Library has used another organization's catalog record essentially \"as is\" for its cataloging. All name headings have been checked against the relevant authority file."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/ukblcatcopy,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The British Library has used another organization's catalog record essentially \"as is\" for its cataloging. All name headings have been checked against the relevant authority file."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "ukblcatcopy",
   :skos/prefLabel "British Library derived copy cataloging"})

(def ukblderived
  "The British Library has re-used another organization's catalog record for its cataloging. Headings have been validated against the relevant authority file."
  {:db/ident :loc.marcauthen/ukblderived,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "British Library derived cataloging",
   :madsrdf/code "ukblderived",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The British Library has re-used another organization's catalog record for its cataloging. Headings have been validated against the relevant authority file."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/ukblderived,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The British Library has re-used another organization's catalog record for its cataloging. Headings have been validated against the relevant authority file."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "ukblderived",
   :skos/prefLabel "British Library derived cataloging"})

(def ukblproject
  "The British Library has entered metadata in accordance with a template or script which was machine transformed to MARC. Name headings and subject headings correspond to NACO and FAST respectively."
  {:db/ident :loc.marcauthen/ukblproject,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "British Library project",
   :madsrdf/code "ukblproject",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The British Library has entered metadata in accordance with a template or script which was machine transformed to MARC. Name headings and subject headings correspond to NACO and FAST respectively."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/ukblproject,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The British Library has entered metadata in accordance with a template or script which was machine transformed to MARC. Name headings and subject headings correspond to NACO and FAST respectively."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "ukblproject",
   :skos/prefLabel "British Library project"})

(def ukblsr
  "The record conforms to the definition for the British Library Standard Record and all name and subject headings have been verified against the relevant authority file."
  {:db/ident :loc.marcauthen/ukblsr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "British Library Standard Record",
   :madsrdf/code "ukblsr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record conforms to the definition for the British Library Standard Record and all name and subject headings have been verified against the relevant authority file."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/ukblsr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record conforms to the definition for the British Library Standard Record and all name and subject headings have been verified against the relevant authority file."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "ukblsr",
   :skos/prefLabel "British Library Standard Record"})

(def ukscp
  "The record conforms to the definition for the UK Legal Deposit Libraries' Shared Cataloguing Programme Record."
  {:db/ident :loc.marcauthen/ukscp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "UK Legal Deposit Libraries' Shared Cataloguing Programme Record",
   :madsrdf/code "ukscp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The record conforms to the definition for the UK Legal Deposit Libraries' Shared Cataloguing Programme Record."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/ukscp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The record conforms to the definition for the UK Legal Deposit Libraries' Shared Cataloguing Programme Record."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "ukscp",
   :skos/prefLabel
   "UK Legal Deposit Libraries' Shared Cataloguing Programme Record"})

(def xissnuk
  "The ISSN Network data elements have not been verified by ISSN UK. ISSN UK authenticates ISSN data elements for United Kingdom imprints."
  {:db/ident :loc.marcauthen/xissnuk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Unverified by ISSN UK Centre",
   :madsrdf/code "xissnuk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The ISSN Network data elements have not been verified by ISSN UK. ISSN UK authenticates ISSN data elements for United Kingdom imprints."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/xissnuk,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The ISSN Network data elements have not been verified by ISSN UK. ISSN UK authenticates ISSN data elements for United Kingdom imprints."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "xissnuk",
   :skos/prefLabel "Unverified by ISSN UK Centre"})

(def xlc
  "The Library of Congress does not consider item a serial."
  {:db/ident :loc.marcauthen/xlc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "xlc",
   :madsrdf/code "xlc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The Library of Congress does not consider item a serial."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/xlc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The Library of Congress does not consider item a serial."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "xlc",
   :skos/prefLabel "xlc"})

(def xnlc
  "Library and Archives Canada (formerly NLC) does not consider item a serial."
  {:db/ident :loc.marcauthen/xnlc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "xnlc",
   :madsrdf/code "xnlc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Library and Archives Canada (formerly NLC) does not consider item a serial."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/xnlc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Library and Archives Canada (formerly NLC) does not consider item a serial."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "xnlc",
   :skos/prefLabel "xnlc"})

(def xnsdp
  "The U.S. ISSN Center (formerly NDSP) does not consider item a serial."
  {:db/ident :loc.marcauthen/xnsdp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "xndsp",
   :madsrdf/code "xnsdp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The U.S. ISSN Center (formerly NDSP) does not consider item a serial."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 042-a"},
   :madsrdf/isMemberOfMADSCollection :loc.marcauthen/collection_marcauthen,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/marcauthen,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.marcauthen/xnsdp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The U.S. ISSN Center (formerly NDSP) does not consider item a serial."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 042-a"},
   :skos/inScheme :loc.vocabulary/marcauthen,
   :skos/notation "xnsdp",
   :skos/prefLabel "xndsp"})

(def ^{:private true} marcauthen
  "This list was originally developed for use in the MARC21 formats for field 042 $a (Authentication code). In BIBFRAME 2.0, the code is used in Admin Metadata as the descriptionAuthentication property."
  {:db/ident :loc.vocabulary/marcauthen,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-08-31T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "This list was originally developed for use in the MARC21 formats for field 042 $a (Authentication code). In BIBFRAME 2.0, the code is used in Admin Metadata as the descriptionAuthentication property."},
   :madsrdf/hasMADSSchemeMember [:loc.marcauthen/gnd4
                                 :loc.marcauthen/dhca
                                 :loc.marcauthen/lcnitrate
                                 :loc.marcauthen/ukblproject
                                 :loc.marcauthen/gnd2
                                 :loc.marcauthen/lcderive
                                 :loc.marcauthen/lacderived
                                 :loc.marcauthen/anuc
                                 :loc.marcauthen/nznb
                                 :loc.marcauthen/sanb
                                 :loc.marcauthen/lcd
                                 :loc.marcauthen/issnuk
                                 :loc.marcauthen/gamma
                                 :loc.marcauthen/msc
                                 :loc.marcauthen/norbibl
                                 :loc.marcauthen/pcc
                                 :loc.marcauthen/gils
                                 :loc.marcauthen/ukblderived
                                 :loc.marcauthen/isdsc
                                 :loc.marcauthen/lccopycat
                                 :loc.marcauthen/nlc
                                 :loc.marcauthen/ukblsr
                                 :loc.marcauthen/lcode
                                 :loc.marcauthen/gndz
                                 :loc.marcauthen/ukscp
                                 :loc.marcauthen/lac
                                 :loc.marcauthen/dlr
                                 :loc.marcauthen/nsdp
                                 :loc.marcauthen/premarc
                                 :loc.marcauthen/lccopycat-nm
                                 :loc.marcauthen/xissnuk
                                 :loc.marcauthen/croatica
                                 :loc.marcauthen/toknb
                                 :loc.marcauthen/gnd7
                                 :loc.marcauthen/lcllh
                                 :loc.marcauthen/natgaz
                                 :loc.marcauthen/gnd5
                                 :loc.marcauthen/nbr
                                 :loc.marcauthen/ukblcatcopy
                                 :loc.marcauthen/lc
                                 :loc.marcauthen/dc
                                 :loc.marcauthen/xnsdp
                                 :loc.marcauthen/reveal
                                 :loc.marcauthen/lchlas
                                 :loc.marcauthen/ntccf
                                 :loc.marcauthen/xlc
                                 :loc.marcauthen/lcac
                                 :loc.marcauthen/nlmcopyc
                                 :loc.marcauthen/finbd
                                 :loc.marcauthen/cyac
                                 :loc.marcauthen/scipio
                                 :loc.marcauthen/gnd3
                                 :loc.marcauthen/gnd1
                                 :loc.marcauthen/finb
                                 :loc.marcauthen/lcnuc
                                 :loc.marcauthen/xnlc
                                 :loc.marcauthen/lcnccp
                                 :loc.marcauthen/gnd6],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MARC Authentication Action"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-08-31T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/marcauthen,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This list was originally developed for use in the MARC21 formats for field 042 $a (Authentication code). In BIBFRAME 2.0, the code is used in Admin Metadata as the descriptionAuthentication property."}})