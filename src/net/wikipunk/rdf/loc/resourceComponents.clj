(ns net.wikipunk.rdf.loc.resourceComponents
  "http://id.loc.gov/vocabulary/resourceComponents/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/resourceComponents.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.resourceComponents"
                       "http://id.loc.gov/vocabulary/resourceComponents/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.resourceComponents",
   :rdfa/uri          "http://id.loc.gov/vocabulary/resourceComponents/"}
  (:refer-clojure :exclude [int str]))

(def amt
  "Language of a resource's significant accompanying material other than summares, librettos, or transcripts; includes such items as program notes, prefaces, commentaries, manuals, or user instructions."
  {:db/ident :loc.resourceComponents/amt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Accompanying material",
   :madsrdf/code "amt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of a resource's significant accompanying material other than summares, librettos, or transcripts; includes such items as program notes, prefaces, commentaries, manuals, or user instructions."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $g"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/amt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of a resource's significant accompanying material other than summares, librettos, or transcripts; includes such items as program notes, prefaces, commentaries, manuals, or user instructions."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $g"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "amt",
   :skos/prefLabel "Accompanying material"})

(def aud
  "Language of audio used as an alternative mode of access to the visual or textual contents of a resource."
  {:db/ident :loc.resourceComponents/aud,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Accessible audio",
   :madsrdf/code "aud",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of audio used as an alternative mode of access to the visual or textual contents of a resource."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $q"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/aud,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of audio used as an alternative mode of access to the visual or textual contents of a resource."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $q"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "aud",
   :skos/prefLabel "Accessible audio"})

(def cap
  "Language used in moving image resource captions, either open or closed."
  {:db/ident :loc.resourceComponents/cap,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Captions",
   :madsrdf/code "cap",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language used in moving image resource captions, either open or closed."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $p"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/cap,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language used in moving image resource captions, either open or closed."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $p"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "cap",
   :skos/prefLabel "Captions"})

(def int
  "Language of intertiles or title cards used in silent films."
  {:db/ident :loc.resourceComponents/int,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Intertitles",
   :madsrdf/code "int",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Language of intertiles or title cards used in silent films."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $i"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/int,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Language of intertiles or title cards used in silent films."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $i"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "int",
   :skos/prefLabel "Intertitles"})

(def itr
  "Language of an intermediate language between the original and the current translation of the resource."
  {:db/ident :loc.resourceComponents/itr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Intermediate translations",
   :madsrdf/code "itr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of an intermediate language between the original and the current translation of the resource."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $k"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/itr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of an intermediate language between the original and the current translation of the resource."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $k"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "itr",
   :skos/prefLabel "Intermediate translations"})

(def lib
  "Language of the printed text of the vocal or textual content of the resource."
  {:db/ident :loc.resourceComponents/lib,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Librettos",
   :madsrdf/code "lib",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of the printed text of the vocal or textual content of the resource."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/lib,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of the printed text of the vocal or textual content of the resource."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $e"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "lib",
   :skos/prefLabel "Librettos"})

(def olb
  "Original language of the printed text of the vocal or textual content of the resource"
  {:db/ident :loc.resourceComponents/olb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Original libretto",
   :madsrdf/code "olb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Original language of the printed text of the vocal or textual content of the resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $n"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/olb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Original language of the printed text of the vocal or textual content of the resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $n"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "olb",
   :skos/prefLabel "Original libretto"})

(def otx
  "Original language of the resource"
  {:db/ident :loc.resourceComponents/otx,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Original text",
   :madsrdf/code "otx",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Original language of the resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $h"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/otx,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Original language of the resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $h"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "otx",
   :skos/prefLabel "Original text"})

(def res
  "Primary language of the resource"
  {:db/ident :loc.resourceComponents/res,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Resource",
   :madsrdf/code "res",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Primary language of the resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $a"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/res,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Primary language of the resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $a"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "res",
   :skos/prefLabel "Resource"})

(def str
  "Primary language of the text or sound track."
  {:db/ident :loc.resourceComponents/str,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Sound Track",
   :madsrdf/code "str",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Primary language of the text or sound track."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Soundtrack",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $a"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel "Soundtrack",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/str,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Primary language of the text or sound track."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $a"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "str",
   :skos/prefLabel "Sound Track",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Soundtrack"}})

(def stx
  "Language of the audible potion of a sound recording or computer file resource."
  {:db/ident :loc.resourceComponents/stx,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Sung or spoken text",
   :madsrdf/code "stx",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of the audible potion of a sound recording or computer file resource."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $d"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/stx,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of the audible potion of a sound recording or computer file resource."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $d"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "stx",
   :skos/prefLabel "Sung or spoken text"})

(def sub
  "Language of the subtitles of the moving image resource."
  {:db/ident :loc.resourceComponents/sub,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Subtitles",
   :madsrdf/code "sub",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Language of the subtitles of the moving image resource."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $j"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/sub,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Language of the subtitles of the moving image resource."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $j"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "sub",
   :skos/prefLabel "Subtitles"})

(def sum
  "Language of the summary or abstract of the resource."
  {:db/ident :loc.resourceComponents/sum,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Summary or abstract",
   :madsrdf/code "sum",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Language of the summary or abstract of the resource."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $b"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/sum,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Language of the summary or abstract of the resource."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $b"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "sum",
   :skos/prefLabel "Summary or abstract"})

(def tav
  "Language of the printed text of the spoken content of the resource."
  {:db/ident :loc.resourceComponents/tav,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Transcripts for audiovisual materials",
   :madsrdf/code "tav",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of the printed text of the spoken content of the resource."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $t"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/tav,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of the printed text of the spoken content of the resource."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $t"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "tav",
   :skos/prefLabel "Transcripts for audiovisual materials"})

(def toc
  "Language of the table of contents of a resource when it differs from the language of the text."
  {:db/ident :loc.resourceComponents/toc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Table of contents",
   :madsrdf/code "toc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of the table of contents of a resource when it differs from the language of the text."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $f"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/toc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of the table of contents of a resource when it differs from the language of the text."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $f"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "toc",
   :skos/prefLabel "Table of contents"})

(def vis
  "Visual language used to provide alternative access to the audio content of a resource."
  {:db/ident :loc.resourceComponents/vis,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Accessible visual language",
   :madsrdf/code "vis",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Visual language used to provide alternative access to the audio content of a resource."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 041 $r"},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceComponents/collection_resourceComponents,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceComponents,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.resourceComponents/vis,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Visual language used to provide alternative access to the audio content of a resource."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 041 $r"},
   :skos/inScheme :loc.vocabulary/resourceComponents,
   :skos/notation "vis",
   :skos/prefLabel "Accessible visual language"})

(def ^{:private true} resourceComponents
  "The Language Resource Component List is derived from a controlled list of subfield values in MARC 21 Format for Bibliographic Data field 041."
  {:db/ident :loc.vocabulary/resourceComponents,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Language Resource Component List is derived from a controlled list of subfield values in MARC 21 Format for Bibliographic Data field 041."},
   :madsrdf/hasMADSSchemeMember [:loc.resourceComponents/aud
                                 :loc.resourceComponents/lib
                                 :loc.resourceComponents/sum
                                 :loc.resourceComponents/olb
                                 :loc.resourceComponents/cap
                                 :loc.resourceComponents/amt
                                 :loc.resourceComponents/otx
                                 :loc.resourceComponents/stx
                                 :loc.resourceComponents/int
                                 :loc.resourceComponents/vis
                                 :loc.resourceComponents/res
                                 :loc.resourceComponents/sub
                                 :loc.resourceComponents/itr
                                 :loc.resourceComponents/str
                                 :loc.resourceComponents/toc
                                 :loc.resourceComponents/tav],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Resource Component Scheme Codes"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/resourceComponents,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Language Resource Component List is derived from a controlled list of subfield values in MARC 21 Format for Bibliographic Data field 041."}})