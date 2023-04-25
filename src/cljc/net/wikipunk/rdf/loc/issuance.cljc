(ns net.wikipunk.rdf.loc.issuance
  "http://id.loc.gov/vocabulary/issuance/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/issuance.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.issuance" "http://id.loc.gov/vocabulary/issuance/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.issuance",
   :rdfa/uri          "http://id.loc.gov/vocabulary/issuance/"})

(def intg
  "A resource that is added to or changed by means of updates that do not remain discrete and are integrated into the whole. Examples include updating loose-leafs and updating Web sites. Integrating resources may be finite or continuing."
  {:db/ident :loc.issuance/intg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-11-15T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "integrating resource",
   :madsrdf/code "intg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A resource that is added to or changed by means of updates that do not remain discrete and are integrated into the whole. Examples include updating loose-leafs and updating Web sites. Integrating resources may be finite or continuing."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: LDR/07 - i"},
   :madsrdf/isMemberOfMADSCollection :loc.issuance/collection_issuance,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/issuance,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.issuance/intg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-11-15T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.issuance/intg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource that is added to or changed by means of updates that do not remain discrete and are integrated into the whole. Examples include updating loose-leafs and updating Web sites. Integrating resources may be finite or continuing."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: LDR/07 - i"},
   :skos/inScheme :loc.vocabulary/issuance,
   :skos/notation "intg",
   :skos/prefLabel "integrating resource"})

(def mono
  "A resource that is complete in one part or intended to be completed within a finite number of parts."
  {:db/ident :loc.issuance/mono,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-11-15T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "single unit",
   :madsrdf/code "mono",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A resource that is complete in one part or intended to be completed within a finite number of parts."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "monograph",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: LDR/07 - a, m"},
   :madsrdf/isMemberOfMADSCollection :loc.issuance/collection_issuance,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/issuance,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "monograph",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.issuance/mono,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-11-15T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.issuance/mono,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource that is complete in one part or intended to be completed within a finite number of parts."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: LDR/07 - a, m"},
   :skos/inScheme :loc.vocabulary/issuance,
   :skos/notation "mono",
   :skos/prefLabel "single unit",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "monograph"}})

(def mulm
  "A resource issued in two or more parts, either simultaneously or successively, that is complete or intended to be completed within a finite number of parts."
  {:db/ident :loc.issuance/mulm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-11-15T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "multipart monograph",
   :madsrdf/code "mulm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A resource issued in two or more parts, either simultaneously or successively, that is complete or intended to be completed within a finite number of parts."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "multivolume monograph",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: LDR/19 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.issuance/collection_issuance,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/issuance,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "multivolume monograph",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-11-15T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.issuance/mulm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.issuance/mulm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource issued in two or more parts, either simultaneously or successively, that is complete or intended to be completed within a finite number of parts."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: LDR/19 - a"},
   :skos/inScheme :loc.vocabulary/issuance,
   :skos/notation "mulm",
   :skos/prefLabel "multipart monograph",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "multivolume monograph"}})

(def serl
  "A resource issued in successive parts, usually bearing numbering, that has no predetermined conclusion."
  {:db/ident :loc.issuance/serl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "serial",
   :madsrdf/code "serl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A resource issued in successive parts, usually bearing numbering, that has no predetermined conclusion."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: LDR/07 - b, s"},
   :madsrdf/isMemberOfMADSCollection :loc.issuance/collection_issuance,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/issuance,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.issuance/serl,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource issued in successive parts, usually bearing numbering, that has no predetermined conclusion."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: LDR/07 - b, s"},
   :skos/inScheme :loc.vocabulary/issuance,
   :skos/notation "serl",
   :skos/prefLabel "serial"})

(def ^{:private true} issuance
  "Categorization reflecting whether a resource is issued in one or more parts, the way it is updated, and whether its termination is predetermined or not."
  {:db/ident :loc.vocabulary/issuance,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Categorization reflecting whether a resource is issued in one or more parts, the way it is updated, and whether its termination is predetermined or not."},
   :madsrdf/hasMADSSchemeMember [:loc.issuance/intg
                                 :loc.issuance/serl
                                 :loc.issuance/mono
                                 :loc.issuance/mulm],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Issuance"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/issuance,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Categorization reflecting whether a resource is issued in one or more parts, the way it is updated, and whether its termination is predetermined or not."}})