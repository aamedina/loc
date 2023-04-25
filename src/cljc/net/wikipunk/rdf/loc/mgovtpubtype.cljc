(ns net.wikipunk.rdf.loc.mgovtpubtype
  "http://id.loc.gov/vocabulary/mgovtpubtype/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mgovtpubtype.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mgovtpubtype"
                       "http://id.loc.gov/vocabulary/mgovtpubtype/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mgovtpubtype",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mgovtpubtype/"})

(def a
  "Published or produced by or for a government body of an autonomous or semi-autonomous component of a country."
  {:db/ident :loc.mgovtpubtype/a,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Autonomous",
   :madsrdf/code "a",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a government body of an autonomous or semi-autonomous component of a country."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Semi-autonomous",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/28=a"},
   :madsrdf/isMemberOfMADSCollection :loc.mgovtpubtype/collection_mgovtpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgovtpubtype,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Semi-autonomous",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgovtpubtype/a,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a government body of an autonomous or semi-autonomous component of a country."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/28=a"},
   :skos/inScheme :loc.vocabulary/mgovtpubtype,
   :skos/notation "a",
   :skos/prefLabel "Autonomous",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Semi-autonomous"}})

(def c
  "Published or produced by or for a multilocal jurisdiction which is defined as a regional combination of jurisdictions below the state level."
  {:db/ident :loc.mgovtpubtype/c,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Multilocal",
   :madsrdf/code "c",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a multilocal jurisdiction which is defined as a regional combination of jurisdictions below the state level."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/28=c"},
   :madsrdf/isMemberOfMADSCollection :loc.mgovtpubtype/collection_mgovtpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgovtpubtype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgovtpubtype/c,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a multilocal jurisdiction which is defined as a regional combination of jurisdictions below the state level."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/28=c"},
   :skos/inScheme :loc.vocabulary/mgovtpubtype,
   :skos/notation "c",
   :skos/prefLabel "Multilocal"})

(def f
  "Published or produced by or for a federal or national government body and American Indian tribes."
  {:db/ident :loc.mgovtpubtype/f,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Federal",
   :madsrdf/code "f",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a federal or national government body and American Indian tribes."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "National",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/28=f"},
   :madsrdf/isMemberOfMADSCollection :loc.mgovtpubtype/collection_mgovtpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgovtpubtype,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "National",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgovtpubtype/f,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a federal or national government body and American Indian tribes."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/28=f"},
   :skos/inScheme :loc.vocabulary/mgovtpubtype,
   :skos/notation "f",
   :skos/prefLabel "Federal",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "National"}})

(def g
  "Published or produced by or for a government body of an unknown or undetermined jurisdictional level."
  {:db/ident :loc.mgovtpubtype/g,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Government",
   :madsrdf/code "g",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a government body of an unknown or undetermined jurisdictional level."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Undetermined government",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/28=o"},
   :madsrdf/isMemberOfMADSCollection :loc.mgovtpubtype/collection_mgovtpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgovtpubtype,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Undetermined government",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgovtpubtype/g,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a government body of an unknown or undetermined jurisdictional level."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/28=o"},
   :skos/inScheme :loc.vocabulary/mgovtpubtype,
   :skos/notation "g",
   :skos/prefLabel "Government",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Undetermined government"}})

(def i
  "Published or produced by or for an international intergovernmental body."
  {:db/ident :loc.mgovtpubtype/i,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "International Intergovernmental",
   :madsrdf/code "i",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for an international intergovernmental body."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Intergovernmental International",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/28=i"},
   :madsrdf/isMemberOfMADSCollection :loc.mgovtpubtype/collection_mgovtpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgovtpubtype,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Intergovernmental International",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgovtpubtype/i,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for an international intergovernmental body."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/28=i"},
   :skos/inScheme :loc.vocabulary/mgovtpubtype,
   :skos/notation "i",
   :skos/prefLabel "International Intergovernmental",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Intergovernmental International"}})

(def l
  "Published or produced by or for a local government jurisdiction such as a town, city, county, or other jurisdiction."
  {:db/ident :loc.mgovtpubtype/l,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Local",
   :madsrdf/code "l",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a local government jurisdiction such as a town, city, county, or other jurisdiction."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/28=l"},
   :madsrdf/isMemberOfMADSCollection :loc.mgovtpubtype/collection_mgovtpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgovtpubtype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgovtpubtype/l,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a local government jurisdiction such as a town, city, county, or other jurisdiction."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/28=l"},
   :skos/inScheme :loc.vocabulary/mgovtpubtype,
   :skos/notation "l",
   :skos/prefLabel "Local"})

(def m
  "Published or produced by or for a regional combination of jurisdictions at the state, provincial, or territorial level."
  {:db/ident :loc.mgovtpubtype/m,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Multistate",
   :madsrdf/code "m",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a regional combination of jurisdictions at the state, provincial, or territorial level."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/28=m"},
   :madsrdf/isMemberOfMADSCollection :loc.mgovtpubtype/collection_mgovtpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgovtpubtype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgovtpubtype/m,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published or produced by or for a regional combination of jurisdictions at the state, provincial, or territorial level."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/28=m"},
   :skos/inScheme :loc.vocabulary/mgovtpubtype,
   :skos/notation "m",
   :skos/prefLabel "Multistate"})

(def s
  "Published by or produced for a government body that is a state, province, territory, or other dependent jurisdiction."
  {:db/ident :loc.mgovtpubtype/s,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "State",
   :madsrdf/code "s",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by or produced for a government body that is a state, province, territory, or other dependent jurisdiction."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Provincial;Territorial",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/28=s"},
   :madsrdf/isMemberOfMADSCollection :loc.mgovtpubtype/collection_mgovtpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgovtpubtype,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Provincial;Territorial",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgovtpubtype/s,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by or produced for a government body that is a state, province, territory, or other dependent jurisdiction."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/28=s"},
   :skos/inScheme :loc.vocabulary/mgovtpubtype,
   :skos/notation "s",
   :skos/prefLabel "State",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Provincial;Territorial"}})

(def ^{:private true} mgovtpubtype
  "Value indicating that a resource is published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."
  {:db/ident :loc.vocabulary/mgovtpubtype,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Value indicating that a resource is published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."},
   :madsrdf/hasMADSSchemeMember [:loc.mgovtpubtype/l
                                 :loc.mgovtpubtype/i
                                 :loc.mgovtpubtype/g
                                 :loc.mgovtpubtype/s
                                 :loc.mgovtpubtype/m
                                 :loc.mgovtpubtype/a
                                 :loc.mgovtpubtype/f
                                 :loc.mgovtpubtype/c],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government Publication Type"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mgovtpubtype,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Value indicating that a resource is published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."}})