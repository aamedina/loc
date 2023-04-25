(ns net.wikipunk.rdf.loc.maudience
  "http://id.loc.gov/vocabulary/maudience/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/maudience.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.maudience"
                       "http://id.loc.gov/vocabulary/maudience/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.maudience",
   :rdfa/uri          "http://id.loc.gov/vocabulary/maudience/"})

(def ado
  "Intended for young people, approximate ages 14-17."
  {:db/ident :loc.maudience/ado,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Adolescent",
   :madsrdf/code "ado",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Intended for young people, approximate ages 14-17."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - d"},
   :madsrdf/isMemberOfMADSCollection :loc.maudience/collection_maudience,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maudience,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.maudience/ado,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Intended for young people, approximate ages 14-17."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - d"},
   :skos/inScheme :loc.vocabulary/maudience,
   :skos/notation "ado",
   :skos/prefLabel "Adolescent"})

(def adu
  "Intended for adults."
  {:db/ident :loc.maudience/adu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Adult",
   :madsrdf/code "adu",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Intended for adults."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.maudience/collection_maudience,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maudience,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.maudience/adu,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Intended for adults."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - e"},
   :skos/inScheme :loc.vocabulary/maudience,
   :skos/notation "adu",
   :skos/prefLabel "Adult"})

(def gen
  "Of general interest and not aimed at a particular target audience"
  {:db/ident :loc.maudience/gen,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "General",
   :madsrdf/code "gen",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Of general interest and not aimed at a particular target audience"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - g"},
   :madsrdf/isMemberOfMADSCollection :loc.maudience/collection_maudience,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maudience,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.maudience/gen,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Of general interest and not aimed at a particular target audience"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - g"},
   :skos/inScheme :loc.vocabulary/maudience,
   :skos/notation "gen",
   :skos/prefLabel "General"})

(def juv
  "Intended for use by children and young people, approximate ages 0-15."
  {:db/ident :loc.maudience/juv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Juvenile",
   :madsrdf/code "juv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Intended for use by children and young people, approximate ages 0-15."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - j"},
   :madsrdf/isMemberOfMADSCollection :loc.maudience/collection_maudience,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maudience,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.maudience/juv,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Intended for use by children and young people, approximate ages 0-15."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - j"},
   :skos/inScheme :loc.vocabulary/maudience,
   :skos/notation "juv",
   :skos/prefLabel "Juvenile"})

(def pad
  "Intended for young people, approximate ages 9-13."
  {:db/ident :loc.maudience/pad,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Pre-adolescent",
   :madsrdf/code "pad",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Intended for young people, approximate ages 9-13."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.maudience/collection_maudience,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maudience,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.maudience/pad,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Intended for young people, approximate ages 9-13."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - c"},
   :skos/inScheme :loc.vocabulary/maudience,
   :skos/notation "pad",
   :skos/prefLabel "Pre-adolescent"})

(def pre
  "Intended for children, approximate ages 0-5 years."
  {:db/ident :loc.maudience/pre,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Preschool",
   :madsrdf/code "pre",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Intended for children, approximate ages 0-5 years."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.maudience/collection_maudience,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maudience,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.maudience/pre,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Intended for children, approximate ages 0-5 years."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - a"},
   :skos/inScheme :loc.vocabulary/maudience,
   :skos/notation "pre",
   :skos/prefLabel "Preschool"})

(def pri
  "Intended for children, approximate ages 6-8 years."
  {:db/ident :loc.maudience/pri,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Primary",
   :madsrdf/code "pri",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Intended for children, approximate ages 6-8 years."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.maudience/collection_maudience,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maudience,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.maudience/pri,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Intended for children, approximate ages 6-8 years."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - b"},
   :skos/inScheme :loc.vocabulary/maudience,
   :skos/notation "pri",
   :skos/prefLabel "Primary"})

(def spe
  "Aimed at a particular audience and the nature of the presentation would make the resource of little interest to other audiences. Examples of resources include: 1) technical material geared to a specialized audience, and 2) resources that address a limited audience; for example, the employees of a single organization."
  {:db/ident :loc.maudience/spe,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Specialized",
   :madsrdf/code "spe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Aimed at a particular audience and the nature of the presentation would make the resource of little interest to other audiences. Examples of resources include: 1) technical material geared to a specialized audience, and 2) resources that address a limited audience; for example, the employees of a single organization."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - f"},
   :madsrdf/isMemberOfMADSCollection :loc.maudience/collection_maudience,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maudience,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.maudience/spe,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Aimed at a particular audience and the nature of the presentation would make the resource of little interest to other audiences. Examples of resources include: 1) technical material geared to a specialized audience, and 2) resources that address a limited audience; for example, the employees of a single organization."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/MU/CF/VM/22 - f"},
   :skos/inScheme :loc.vocabulary/maudience,
   :skos/notation "spe",
   :skos/prefLabel "Specialized"})

(def ^{:private true} maudience
  "Category of user for which the content of a resource is intended, or for whom the content is considered suitable."
  {:db/ident :loc.vocabulary/maudience,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Category of user for which the content of a resource is intended, or for whom the content is considered suitable."},
   :madsrdf/hasMADSSchemeMember [:loc.maudience/juv
                                 :loc.maudience/spe
                                 :loc.maudience/adu
                                 :loc.maudience/pre
                                 :loc.maudience/ado
                                 :loc.maudience/pri
                                 :loc.maudience/pad
                                 :loc.maudience/gen],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Intended Audience"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/maudience,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Category of user for which the content of a resource is intended, or for whom the content is considered suitable."}})