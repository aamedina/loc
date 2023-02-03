(ns net.wikipunk.rdf.loc.mencformat
  "http://id.loc.gov/vocabulary/mencformat/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mencformat.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mencformat"
                       "http://id.loc.gov/vocabulary/mencformat/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mencformat",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mencformat/"})

(def avi
  "Multimedia container format, part of Microsoft's Video for Windows software."
  {:db/ident :loc.mencformat/avi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AVI file",
   :madsrdf/code "avi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Multimedia container format, part of Microsoft's Video for Windows software."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Audio Video Interleave file",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Audio Video Interleave file",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/avi,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Multimedia container format, part of Microsoft's Video for Windows software."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "avi",
   :skos/prefLabel "AVI file",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Audio Video Interleave file"}})

(def azw3
  "An eBook created using Amazon's Kindle Format 8 (KF8)."
  {:db/ident :loc.mencformat/azw3,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AZW3 file",
   :madsrdf/code "azw3",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "An eBook created using Amazon's Kindle Format 8 (KF8)."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Amazon Kindle file",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Amazon Kindle file",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/azw3,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An eBook created using Amazon's Kindle Format 8 (KF8)."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "azw3",
   :skos/prefLabel "AZW3 file",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Amazon Kindle file"}})

(def bluray
  "A high-definition digital optical disc data storage format designed to supersede the DVD format."
  {:db/ident :loc.mencformat/bluray,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-12-10T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Blu-ray",
   :madsrdf/code "bluray",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A high-definition digital optical disc data storage format designed to supersede the DVD format."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Bluray",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Bluray",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2020-12-10T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mencformat/bluray,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2020-03-02T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mencformat/bluray,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A high-definition digital optical disc data storage format designed to supersede the DVD format."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "bluray",
   :skos/prefLabel "Blu-ray",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Bluray"}})

(def cda
  "The standard format for audio compact discs."
  {:db/ident :loc.mencformat/cda,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CD audio",
   :madsrdf/code "cda",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The standard format for audio compact discs."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/cda,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "The standard format for audio compact discs."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "cda",
   :skos/prefLabel "CD audio"})

(def dvda
  "The digital format for delivering high-fidelity audio content on a DVD."
  {:db/ident :loc.mencformat/dvda,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DVD audio",
   :madsrdf/code "dvda",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The digital format for delivering high-fidelity audio content on a DVD."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/dvda,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The digital format for delivering high-fidelity audio content on a DVD."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "dvda",
   :skos/prefLabel "DVD audio"})

(def dvdrv
  "A recordable DVD disc."
  {:db/ident :loc.mencformat/dvdrv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DVD-R video",
   :madsrdf/code "dvdrv",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A recordable DVD disc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/dvdrv,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A recordable DVD disc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "dvdrv",
   :skos/prefLabel "DVD-R video"})

(def dvdv
  "The format used to store digital video on DVD discs."
  {:db/ident :loc.mencformat/dvdv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DVD video",
   :madsrdf/code "dvdv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The format used to store digital video on DVD discs."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/dvdv,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The format used to store digital video on DVD discs."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "dvdv",
   :skos/prefLabel "DVD video"})

(def excel
  "A file created using Microsoft's Excel spreadsheet format."
  {:db/ident :loc.mencformat/excel,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Excel file",
   :madsrdf/code "excel",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A file created using Microsoft's Excel spreadsheet format."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/excel,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A file created using Microsoft's Excel spreadsheet format."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "excel",
   :skos/prefLabel "Excel file"})

(def gif
  "The Graphics Interchange Format is a bitmap image format."
  {:db/ident :loc.mencformat/gif,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "GIF image",
   :madsrdf/code "gif",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The Graphics Interchange Format is a bitmap image format."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/gif,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The Graphics Interchange Format is a bitmap image format."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "gif",
   :skos/prefLabel "GIF image"})

(def html
  "A file created using Hypertext Markup Language and designed to be displayed in a web browser."
  {:db/ident :loc.mencformat/html,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "HTML file",
   :madsrdf/code "html",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A file created using Hypertext Markup Language and designed to be displayed in a web browser."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/html,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A file created using Hypertext Markup Language and designed to be displayed in a web browser."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "html",
   :skos/prefLabel "HTML file"})

(def jpeg
  "A method of lossy compression for digital images."
  {:db/ident :loc.mencformat/jpeg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "JPEG image",
   :madsrdf/code "jpeg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A method of lossy compression for digital images."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/jpeg,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A method of lossy compression for digital images."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "jpeg",
   :skos/prefLabel "JPEG image"})

(def mp3
  "A coding format for digital audio."
  {:db/ident :loc.mencformat/mp3,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MP3 audio",
   :madsrdf/code "mp3",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A coding format for digital audio."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "MPEG-3 audio",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "MPEG-3 audio",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/mp3,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A coding format for digital audio."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "mp3",
   :skos/prefLabel "MP3 audio",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "MPEG-3 audio"}})

(def mp4
  "A compressed file format that can contain video, audio and subtitles"
  {:db/ident :loc.mencformat/mp4,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MP4 video",
   :madsrdf/code "mp4",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A compressed file format that can contain video, audio and subtitles"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "MPEG-4 video",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "MPEG-4 video",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/mp4,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A compressed file format that can contain video, audio and subtitles"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "mp4",
   :skos/prefLabel "MP4 video",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "MPEG-4 video"}})

(def pdf
  "The Portable Document Format presents documents in a manner independent of application software, hardware, and operating systems."
  {:db/ident :loc.mencformat/pdf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "PDF file",
   :madsrdf/code "pdf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Portable Document Format presents documents in a manner independent of application software, hardware, and operating systems."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/pdf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Portable Document Format presents documents in a manner independent of application software, hardware, and operating systems."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "pdf",
   :skos/prefLabel "PDF file"})

(def png
  "The Portable Network Graphics is a raster-graphics file-format that supports lossless data compression."
  {:db/ident :loc.mencformat/png,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "PNG image",
   :madsrdf/code "png",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Portable Network Graphics is a raster-graphics file-format that supports lossless data compression."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/png,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Portable Network Graphics is a raster-graphics file-format that supports lossless data compression."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "png",
   :skos/prefLabel "PNG image"})

(def qtime
  "A computer file format used natively by the QuickTime framework."
  {:db/ident :loc.mencformat/qtime,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "QuickTime file",
   :madsrdf/code "qtime",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A computer file format used natively by the QuickTime framework."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/qtime,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A computer file format used natively by the QuickTime framework."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "qtime",
   :skos/prefLabel "QuickTime file"})

(def sacd
  "Super Audio CD is a read-only optical disc format for audio storage."
  {:db/ident :loc.mencformat/sacd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "SACD audio",
   :madsrdf/code "sacd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Super Audio CD is a read-only optical disc format for audio storage."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/sacd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Super Audio CD is a read-only optical disc format for audio storage."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "sacd",
   :skos/prefLabel "SACD audio"})

(def swf
  "The Small Web Format is designed to store vector graphics and animation and may contain sound, video, text and other data."
  {:db/ident :loc.mencformat/swf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "SWF video",
   :madsrdf/code "swf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Small Web Format is designed to store vector graphics and animation and may contain sound, video, text and other data."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/swf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Small Web Format is designed to store vector graphics and animation and may contain sound, video, text and other data."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "swf",
   :skos/prefLabel "SWF video"})

(def tiff
  "The Tagged Image File Format is a computer file format for storing raster graphics images."
  {:db/ident :loc.mencformat/tiff,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "TIFF image",
   :madsrdf/code "tiff",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Tagged Image File Format is a computer file format for storing raster graphics images."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/tiff,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Tagged Image File Format is a computer file format for storing raster graphics images."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "tiff",
   :skos/prefLabel "TIFF image"})

(def vcd
  "The Video CD format was created to distribute films on 120 mm optical discs."
  {:db/ident :loc.mencformat/vcd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "VCD video",
   :madsrdf/code "vcd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Video CD format was created to distribute films on 120 mm optical discs."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/vcd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Video CD format was created to distribute films on 120 mm optical discs."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "vcd",
   :skos/prefLabel "VCD video"})

(def wma
  "A file created for Windows Media Audio."
  {:db/ident :loc.mencformat/wma,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "WMA file",
   :madsrdf/code "wma",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A file created for Windows Media Audio."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Windows Media file",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 347 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mencformat/collection_mencformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mencformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Windows Media file",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mencformat/wma,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A file created for Windows Media Audio."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 347 $b"},
   :skos/inScheme :loc.vocabulary/mencformat,
   :skos/notation "wma",
   :skos/prefLabel "WMA file",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Windows Media file"}})

(def ^{:private true} mencformat
  "A schema or standard used to encode the digital content of a resource."
  {:db/ident :loc.vocabulary/mencformat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-02T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A schema or standard used to encode the digital content of a resource."},
   :madsrdf/hasMADSSchemeMember [:loc.mencformat/png
                                 :loc.mencformat/jpeg
                                 :loc.mencformat/mp4
                                 :loc.mencformat/pdf
                                 :loc.mencformat/bluray
                                 :loc.mencformat/dvdrv
                                 :loc.mencformat/excel
                                 :loc.mencformat/qtime
                                 :loc.mencformat/dvdv
                                 :loc.mencformat/dvda
                                 :loc.mencformat/gif
                                 :loc.mencformat/mp3
                                 :loc.mencformat/cda
                                 :loc.mencformat/swf
                                 :loc.mencformat/azw3
                                 :loc.mencformat/sacd
                                 :loc.mencformat/avi
                                 :loc.mencformat/wma
                                 :loc.mencformat/tiff
                                 :loc.mencformat/html
                                 :loc.mencformat/vcd],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Encoding Format"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-02T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mencformat,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A schema or standard used to encode the digital content of a resource."}})