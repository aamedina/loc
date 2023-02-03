(ns net.wikipunk.rdf.loc.mreductionratio
  "http://id.loc.gov/vocabulary/mreductionratio/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mreductionratio.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mreductionratio"
                       "http://id.loc.gov/vocabulary/mreductionratio/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mreductionratio",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mreductionratio/"})

(def high
  "A reduction ratio designation for between 31:1 and 60:1 for a microform resource"
  {:db/ident :loc.mreductionratio/high,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "high reduction",
   :madsrdf/code "high",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for between 31:1 and 60:1 for a microform resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mf/05 - c"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mreductionratio/collection_mreductionratio,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mreductionratio,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mreductionratio/high,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for between 31:1 and 60:1 for a microform resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mf/05 - c"},
   :skos/inScheme :loc.vocabulary/mreductionratio,
   :skos/notation "high",
   :skos/prefLabel "high reduction"})

(def low
  "A reduction ratio designation for less than 16:1 for a microform resource"
  {:db/ident :loc.mreductionratio/low,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "low reduction",
   :madsrdf/code "low",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for less than 16:1 for a microform resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mf/05 - a"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mreductionratio/collection_mreductionratio,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mreductionratio,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mreductionratio/low,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for less than 16:1 for a microform resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mf/05 - a"},
   :skos/inScheme :loc.vocabulary/mreductionratio,
   :skos/notation "low",
   :skos/prefLabel "low reduction"})

(def normal
  "A reduction ratio designation for between 16:1 and 30:1 for a microform resource"
  {:db/ident :loc.mreductionratio/normal,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "normal reduction",
   :madsrdf/code "normal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for between 16:1 and 30:1 for a microform resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mf/05 - b"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mreductionratio/collection_mreductionratio,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mreductionratio,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mreductionratio/normal,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for between 16:1 and 30:1 for a microform resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mf/05 - b"},
   :skos/inScheme :loc.vocabulary/mreductionratio,
   :skos/notation "normal",
   :skos/prefLabel "normal reduction"})

(def ultrahigh
  "A reduction ratio designation for over 90:1 for a microform resource"
  {:db/ident :loc.mreductionratio/ultrahigh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ultra high reduction",
   :madsrdf/code "ultrahigh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for over 90:1 for a microform resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mf/05 - e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mreductionratio/collection_mreductionratio,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mreductionratio,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mreductionratio/ultrahigh,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for over 90:1 for a microform resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mf/05 - e"},
   :skos/inScheme :loc.vocabulary/mreductionratio,
   :skos/notation "ultrahigh",
   :skos/prefLabel "ultra high reduction"})

(def veryhigh
  "A reduction ratio designation for between 61:1 and 90:1 for a microform resource"
  {:db/ident :loc.mreductionratio/veryhigh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "very high reduction",
   :madsrdf/code "veryhigh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for between 61:1 and 90:1 for a microform resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mf/05 - d"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mreductionratio/collection_mreductionratio,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mreductionratio,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mreductionratio/veryhigh,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A reduction ratio designation for between 61:1 and 90:1 for a microform resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mf/05 - d"},
   :skos/inScheme :loc.vocabulary/mreductionratio,
   :skos/notation "veryhigh",
   :skos/prefLabel "very high reduction"})

(def ^{:private true} mreductionratio
  "A general designation of the size of a micro-image in relation to the original from which it was produced"
  {:db/ident :loc.vocabulary/mreductionratio,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A general designation of the size of a micro-image in relation to the original from which it was produced"},
   :madsrdf/hasMADSSchemeMember [:loc.mreductionratio/ultrahigh
                                 :loc.mreductionratio/veryhigh
                                 :loc.mreductionratio/high
                                 :loc.mreductionratio/low
                                 :loc.mreductionratio/normal],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reduction Ratio"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mreductionratio,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A general designation of the size of a micro-image in relation to the original from which it was produced"}})