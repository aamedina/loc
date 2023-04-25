(ns net.wikipunk.rdf.loc.mfiletype
  "http://id.loc.gov/vocabulary/mfiletype/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mfiletype.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mfiletype"
                       "http://id.loc.gov/vocabulary/mfiletype/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mfiletype",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mfiletype/"})

(def audio
  "File type for storing electronically recorded audio content"
  {:db/ident :loc.mfiletype/audio,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "audio file",
   :madsrdf/code "audio",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "File type for storing electronically recorded audio content"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mfiletype/collection_mfiletype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mfiletype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mfiletype/audio,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "File type for storing electronically recorded audio content"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $a"},
   :skos/inScheme :loc.vocabulary/mfiletype,
   :skos/notation "audio",
   :skos/prefLabel "audio file"})

(def data
  "File type for storing electronically recorded content representing data values"
  {:db/ident :loc.mfiletype/data,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "data file",
   :madsrdf/code "data",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "File type for storing electronically recorded content representing data values"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mfiletype/collection_mfiletype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mfiletype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mfiletype/data,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "File type for storing electronically recorded content representing data values"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $a"},
   :skos/inScheme :loc.vocabulary/mfiletype,
   :skos/notation "data",
   :skos/prefLabel "data file"})

(def image
  "File type for storing electronically recorded content representing still images"
  {:db/ident :loc.mfiletype/image,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "image file",
   :madsrdf/code "image",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "File type for storing electronically recorded content representing still images"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $a\r\n"},
   :madsrdf/isMemberOfMADSCollection :loc.mfiletype/collection_mfiletype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mfiletype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mfiletype/image,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "File type for storing electronically recorded content representing still images"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $a"},
   :skos/inScheme :loc.vocabulary/mfiletype,
   :skos/notation "image",
   :skos/prefLabel "image file"})

(def program
  "File type for storing electronically recorded programs consisting of organized lists of instructions to be executed by computer software"
  {:db/ident :loc.mfiletype/program,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "program file",
   :madsrdf/code "program",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "File type for storing electronically recorded programs consisting of organized lists of instructions to be executed by computer software"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:  347 $a\r\n\r\n"},
   :madsrdf/isMemberOfMADSCollection :loc.mfiletype/collection_mfiletype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mfiletype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mfiletype/program,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "File type for storing electronically recorded programs consisting of organized lists of instructions to be executed by computer software"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $a"},
   :skos/inScheme :loc.vocabulary/mfiletype,
   :skos/notation "program",
   :skos/prefLabel "program file"})

(def text
  "File type for storing electronically recorded textual content"
  {:db/ident :loc.mfiletype/text,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "text file",
   :madsrdf/code "text",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "File type for storing electronically recorded textual content"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $a\r\n"},
   :madsrdf/isMemberOfMADSCollection :loc.mfiletype/collection_mfiletype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mfiletype,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mfiletype/text,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "File type for storing electronically recorded textual content"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $a"},
   :skos/inScheme :loc.vocabulary/mfiletype,
   :skos/notation "text",
   :skos/prefLabel "text file"})

(def ^{:private true} mfiletype
  "General type of data content encoded in a computer file"
  {:db/ident :loc.vocabulary/mfiletype,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "General type of data content encoded in a computer file"},
   :madsrdf/hasMADSSchemeMember [:loc.mfiletype/data
                                 :loc.mfiletype/image
                                 :loc.mfiletype/text
                                 :loc.mfiletype/audio
                                 :loc.mfiletype/program],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $a"},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "File Type"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mfiletype,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "General type of data content encoded in a computer file"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $a"}})