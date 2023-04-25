(ns net.wikipunk.rdf.loc.organizations
  "http://id.loc.gov/vocabulary/organizations/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/organizations.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.organizations"
                       "http://id.loc.gov/vocabulary/organizations/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.organizations",
   :rdfa/uri          "http://id.loc.gov/vocabulary/organizations/"})

(def dlc
  "United States, Library of Congress"
  {:db/ident :loc.organizations/dlc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1975-10-03T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-07T13:13:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel "United States, Library of Congress",
   :madsrdf/code ["dlc" "US-dlc" "DLC"],
   :madsrdf/hasNarrowerAuthority [:loc.organizations/dlcn
                                  :loc.organizations/dlcm
                                  :loc.organizations/dlcesr
                                  :loc.organizations/dlcmrc
                                  :loc.organizations/dlclca
                                  :loc.organizations/dlcpf
                                  :loc.organizations/dlcmss
                                  :loc.organizations/dlcnucm
                                  :loc.organizations/dlcb
                                  :loc.organizations/dlcrs
                                  :loc.organizations/dlcs
                                  :loc.organizations/dlcl
                                  :loc.organizations/dlcad
                                  :loc.organizations/dlcmpmi
                                  :loc.organizations/dlced
                                  :loc.organizations/dlcco
                                  :loc.organizations/dlcdcm
                                  :loc.organizations/dlcbm
                                  :loc.organizations/dlcstbd
                                  :loc.organizations/dlcsm
                                  :loc.organizations/dlcvhp
                                  :loc.organizations/dlcadc
                                  :loc.organizations/dlcr
                                  :loc.organizations/dlcrbsc
                                  :loc.organizations/dlchd
                                  :loc.organizations/dlchl
                                  :loc.organizations/dlcgb
                                  :loc.organizations/dlcntc
                                  :loc.organizations/dlcafc
                                  :loc.organizations/dlcgm
                                  :loc.organizations/dlcismn
                                  :loc.organizations/dlcss
                                  :loc.organizations/dlcnr
                                  :loc.organizations/dlcc
                                  :loc.organizations/dlcsgp
                                  :loc.organizations/dlcpp],
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Congressional Library",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel
                         "United States, Congress, Library",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Library of Congress",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority :madsrdf/CorporateName],
   :skos/altLabel ["Congressional Library"
                   "United States, Congress, Library"
                   "Library of Congress"],
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2015-04-07T13:13:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1975-10-03T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/narrower [:loc.organizations/dlcgb
                   :loc.organizations/dlcstbd
                   :loc.organizations/dlcsm
                   :loc.organizations/dlcs
                   :loc.organizations/dlcad
                   :loc.organizations/dlced
                   :loc.organizations/dlcesr
                   :loc.organizations/dlcco
                   :loc.organizations/dlcntc
                   :loc.organizations/dlcbm
                   :loc.organizations/dlcr
                   :loc.organizations/dlcnucm
                   :loc.organizations/dlcmrc
                   :loc.organizations/dlchl
                   :loc.organizations/dlcadc
                   :loc.organizations/dlcpp
                   :loc.organizations/dlcm
                   :loc.organizations/dlcdcm
                   :loc.organizations/dlcismn
                   :loc.organizations/dlcc
                   :loc.organizations/dlcn
                   :loc.organizations/dlchd
                   :loc.organizations/dlcnr
                   :loc.organizations/dlcafc
                   :loc.organizations/dlcvhp
                   :loc.organizations/dlcmss
                   :loc.organizations/dlcrs
                   :loc.organizations/dlcrbsc
                   :loc.organizations/dlcss
                   :loc.organizations/dlclca
                   :loc.organizations/dlcsgp
                   :loc.organizations/dlcl
                   :loc.organizations/dlcgm
                   :loc.organizations/dlcmpmi
                   :loc.organizations/dlcb
                   :loc.organizations/dlcpf],
   :skos/notation ["DLC" "US-dlc" "dlc"],
   :skos/prefLabel "United States, Library of Congress",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "United States, Congress, Library"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Library of Congress"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Congressional Library"}]})

(def dlcad
  "Library of Congress, Asian Division"
  {:db/ident :loc.organizations/dlcad,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-07T13:13:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-08-31T20:33:29.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel "Library of Congress, Asian Division",
   :madsrdf/code ["DLC-AD" "US-dlcad" "dlcad"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Library of Congress, General Collections and Services, Asian Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Asian Division, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, General Collections & Services, Asian Division",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Library of Congress, General Collections and Services, Asian Division"
    "Asian Division, Library of Congress"
    "Library of Congress, General Collections & Services, Asian Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2010-08-31T20:33:29.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcad,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2015-04-07T13:13:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcad,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-AD" "US-dlcad" "dlcad"],
   :skos/prefLabel "Library of Congress, Asian Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Asian Division, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, General Collections & Services, Asian Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, General Collections and Services, Asian Division"}]})

(def dlcadc
  "United States, Library of Congress, Asian Division, Chinese Section"
  {:db/ident :loc.organizations/dlcadc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1995-07-06T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:14:32.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Asian Division, Chinese Section",
   :madsrdf/code ["DLC-ADC" "US-dlcadc" "dlcadc"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant [{:madsrdf/variantLabel
                         "Asian Division, Chinese Section, Library of Congress",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel
                         "Library of Congress, Asian Division, Chinese Section",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Library of Congress, Asian Division, Chinese Section"
                   "Asian Division, Chinese Section, Library of Congress"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1995-07-06T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcadc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:14:32.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcadc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-ADC" "US-dlcadc" "dlcadc"],
   :skos/prefLabel
   "United States, Library of Congress, Asian Division, Chinese Section",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Library of Congress, Asian Division, Chinese Section"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Asian Division, Chinese Section, Library of Congress"}]})

(def dlcafc
  "United States, Library of Congress, American Folklife Center"
  {:db/ident :loc.organizations/dlcafc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1994-03-31T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:12:48.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, American Folklife Center",
   :madsrdf/code ["DLC-AFC" "US-dlcafc" "dlcafc"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Library of Congress, American Folklife Center",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "American Folklife Center, Library of Congress",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["American Folklife Center, Library of Congress"
                   "Library of Congress, American Folklife Center"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1994-03-31T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcafc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:12:48.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcafc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcafc" "dlcafc" "DLC-AFC"],
   :skos/prefLabel
   "United States, Library of Congress, American Folklife Center",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "American Folklife Center, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Library of Congress, American Folklife Center"}]})

(def dlcb
  "United States, Library of Congress, National Library Service for the Blind and Physically Handicapped"
  {:db/ident :loc.organizations/dlcb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1983-02-10T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:19:21.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, National Library Service for the Blind and Physically Handicapped",
   :madsrdf/code ["US-dlcb" "DLC-B" "dlcb"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "National Library for the Blind",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, National Library Service for the Blind",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["National Library for the Blind"
    "Library of Congress, National Library Service for the Blind"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1983-02-10T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcb,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:19:21.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcb,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["dlcb" "DLC-B" "US-dlcb"],
   :skos/prefLabel
   "United States, Library of Congress, National Library Service for the Blind and Physically Handicapped",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, National Library Service for the Blind"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "National Library for the Blind"}]})

(def dlcbm
  "United States, Library of Congress, National Library Service for the Blind and Physically Handicapped, Music Library"
  {:db/ident :loc.organizations/dlcbm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1983-02-10T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:20:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, National Library Service for the Blind and Physically Handicapped, Music Library",
   :madsrdf/code ["DLC-BM" "dlcbm" "US-dlcbm"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "National Library Service for the Blind and Physically Handicapped, Music Library, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, National Library Service for the Blind and Physically Handicapped, Music Library",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Library of Congress, National Library Service for the Blind and Physically Handicapped, Music Library"
    "National Library Service for the Blind and Physically Handicapped, Music Library, Library of Congress"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1983-02-10T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcbm,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:20:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcbm,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-BM" "dlcbm" "US-dlcbm"],
   :skos/prefLabel
   "United States, Library of Congress, National Library Service for the Blind and Physically Handicapped, Music Library",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "National Library Service for the Blind and Physically Handicapped, Music Library, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, National Library Service for the Blind and Physically Handicapped, Music Library"}]})

(def dlcc
  "United States, Library of Congress, Congressional Research Service, Library"
  {:db/ident :loc.organizations/dlcc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1994-04-08T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:17:54.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Congressional Research Service, Library",
   :madsrdf/code ["DLC-C" "US-dlcc" "dlcc"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant [{:madsrdf/variantLabel
                         "Congressional Research Service, Library of Congress",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel
                         "Library of Congress, Congressional Research Service",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Congressional Research Service, Library of Congress"
                   "Library of Congress, Congressional Research Service"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1994-04-08T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:17:54.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcc" "DLC-C" "dlcc"],
   :skos/prefLabel
   "United States, Library of Congress, Congressional Research Service, Library",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Congressional Research Service, Library of Congress"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Library of Congress, Congressional Research Service"}]})

(def dlcco
  "United States, Library of Congress, Copyright Office"
  {:db/ident :loc.organizations/dlcco,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:10:16.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1994-08-09T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Copyright Office",
   :madsrdf/code ["dlcco" "DLC-CO" "US-dlcco"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Library of Congress, Copyright Office",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Copyright Office, Library of Congress",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Library of Congress, Copyright Office"
                   "Copyright Office, Library of Congress"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:10:16.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcco,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1994-08-09T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcco,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-CO" "US-dlcco" "dlcco"],
   :skos/prefLabel "United States, Library of Congress, Copyright Office",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Copyright Office, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Library of Congress, Copyright Office"}]})

(def dlcdcm
  "Library of Congress, Digital Collections Management Division"
  {:db/ident :loc.organizations/dlcdcm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-10-27T21:04:35.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-10-27T21:04:35.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "Library of Congress, Digital Collections Management Division",
   :madsrdf/code ["DLC-DCM" "dlcdcm" "US-DLC-DCM"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2020-10-27T21:04:35.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcdcm,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2020-10-27T21:04:35.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcdcm,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-DLC-DCM" "DLC-DCM" "dlcdcm"],
   :skos/prefLabel
   "Library of Congress, Digital Collections Management Division"})

(def dlced
  "Library of Congress, European Division"
  {:db/ident :loc.organizations/dlced,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-07T13:13:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2014-01-14T18:19:42.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel "Library of Congress, European Division",
   :madsrdf/code ["dlced" "US-dlced" "DLC-ED"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "European Division, Library of Congress",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel "European Division, Library of Congress",
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2014-01-14T18:19:42.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlced,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2015-04-07T13:13:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlced,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlced" "DLC-ED" "dlced"],
   :skos/prefLabel "Library of Congress, European Division",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "European Division, Library of Congress"}})

(def dlcesr
  "United States, Library of Congress, Early State Records Collection Staff"
  {:db/ident :loc.organizations/dlcesr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1975-10-03T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:11:27.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Early State Records Collection Staff",
   :madsrdf/code ["US-dlcesr" "dlcesr" "DLC-ESR"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Early State Records Collection Staff, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Early State Records Collection Staff",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Early State Records Collection Staff, Library of Congress"
                   "Library of Congress, Early State Records Collection Staff"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:11:27.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcesr,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1975-10-03T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcesr,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcesr" "dlcesr" "DLC-ESR"],
   :skos/prefLabel
   "United States, Library of Congress, Early State Records Collection Staff",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Early State Records Collection Staff"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Early State Records Collection Staff, Library of Congress"}]})

(def dlcgb
  "United States, Library of Congress, Generalized Bibliography System Staff"
  {:db/ident :loc.organizations/dlcgb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1990-01-01T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:12:08.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Generalized Bibliography System Staff",
   :madsrdf/code ["DLC-GB" "dlcgb" "US-dlcgb"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Library of Congress, Generalized Bibliography System Staff",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Generalized Bibliography System Staff, Library of Congress",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Generalized Bibliography System Staff, Library of Congress"
    "Library of Congress, Generalized Bibliography System Staff"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:12:08.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcgb,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1990-01-01T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcgb,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["dlcgb" "DLC-GB" "US-dlcgb"],
   :skos/prefLabel
   "United States, Library of Congress, Generalized Bibliography System Staff",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Generalized Bibliography System Staff, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Generalized Bibliography System Staff"}]})

(def dlcgm
  "Library of Congress, Geography & Map Division"
  {:db/ident :loc.organizations/dlcgm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-09-03T17:01:45.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-07T13:13:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel "Library of Congress, Geography & Map Division",
   :madsrdf/code ["dlcgm" "US-dlcgm" "DLC-GM"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Library of Congress, Collections and Services Directorate, Geography & Map Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Collections & Services Directorate, Geography & Map Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Geography & Map Division, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Library of Congress, Geography and Map Division",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Library of Congress, Collections & Services Directorate, Geography & Map Division"
    "Geography & Map Division, Library of Congress"
    "Library of Congress, Geography and Map Division"
    "Library of Congress, Collections and Services Directorate, Geography & Map Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2010-09-03T17:01:45.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcgm,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2015-04-07T13:13:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcgm,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["dlcgm" "US-dlcgm" "DLC-GM"],
   :skos/prefLabel "Library of Congress, Geography & Map Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Library of Congress, Geography and Map Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Collections & Services Directorate, Geography & Map Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Geography & Map Division, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Collections and Services Directorate, Geography & Map Division"}]})

(def dlchd
  "Library of Congress, Hispanic Division"
  {:db/ident :loc.organizations/dlchd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-07T13:13:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-08-31T20:34:09.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel "Library of Congress, Hispanic Division",
   :madsrdf/code ["US-dlchd" "DLC-HD" "dlchd"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Library of Congress, Special Collections and Services, Hispanic Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Special Collections & Services, Hispanic Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Hispanic Division, Library of Congress",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Hispanic Division, Library of Congress"
    "Library of Congress, Special Collections & Services, Hispanic Division"
    "Library of Congress, Special Collections and Services, Hispanic Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2015-04-07T13:13:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlchd,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2010-08-31T20:34:09.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlchd,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-HD" "dlchd" "US-dlchd"],
   :skos/prefLabel "Library of Congress, Hispanic Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Special Collections & Services, Hispanic Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Hispanic Division, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Special Collections and Services, Hispanic Division"}]})

(def dlchl
  "United States, Library of Congress, Hispanic Division, Handbook of Latin American Studies Section"
  {:db/ident :loc.organizations/dlchl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2000-03-03T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:15:59.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Hispanic Division, Handbook of Latin American Studies Section",
   :madsrdf/code ["dlchl" "DLC-HL" "US-dlchl"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Library of Congress, Handbook of Latin American Studies Section",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Library of Congress, HLAS",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Handbook of Latin American Studies Section, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "HLAS",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Library of Congress, Handbook of Latin American Studies Section"
    "Handbook of Latin American Studies Section, Library of Congress"
    "Library of Congress, HLAS"
    "HLAS"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2000-03-03T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlchl,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:15:59.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlchl,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlchl" "DLC-HL" "dlchl"],
   :skos/prefLabel
   "United States, Library of Congress, Hispanic Division, Handbook of Latin American Studies Section",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Handbook of Latin American Studies Section"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Library of Congress, HLAS"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "HLAS"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Handbook of Latin American Studies Section, Library of Congress"}]})

(def dlcismn
  "U.S. ISMN Agency"
  {:db/ident :loc.organizations/dlcismn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-07T13:13:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2013-08-01T20:20:58.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel "U.S. ISMN Agency",
   :madsrdf/code ["US-dlcismn" "dlcismn" "DLC-ISMN"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant [{:madsrdf/variantLabel
                         "International Standard Music Number Agency",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "United States ISMN Agency",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "ISMN-US",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "ISMN-United States",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["ISMN-US"
                   "ISMN-United States"
                   "United States ISMN Agency"
                   "International Standard Music Number Agency"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2013-08-01T20:20:58.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcismn,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2015-04-07T13:13:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcismn,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcismn" "dlcismn" "DLC-ISMN"],
   :skos/prefLabel "U.S. ISMN Agency",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "ISMN-US"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "ISMN-United States"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "United States ISMN Agency"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "International Standard Music Number Agency"}]})

(def dlcl
  "United States, Library of Congress, Law Library"
  {:db/ident :loc.organizations/dlcl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:17:21.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1994-04-12T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Law Library",
   :madsrdf/code ["dlcl" "DLC-L" "US-dlcl"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Law Library, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Library of Congress, Law Library",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Law Library, Library of Congress"
                   "Library of Congress, Law Library"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:17:21.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcl,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1994-04-12T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcl,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcl" "dlcl" "DLC-L"],
   :skos/prefLabel "United States, Library of Congress, Law Library",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Law Library, Library of Congress"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Library of Congress, Law Library"}]})

(def dlclca
  "Library of Congress Archives"
  {:db/ident :loc.organizations/dlclca,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-03-23T14:57:31.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-03-23T14:57:31.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel "Library of Congress Archives",
   :madsrdf/code ["DLC-LCA" "US-DLC-LCA" "dlclca"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant {:madsrdf/variantLabel "Library of Congress. Archives",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel "Library of Congress. Archives",
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2018-03-23T14:57:31.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlclca,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2018-03-23T14:57:31.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlclca,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-DLC-LCA" "DLC-LCA" "dlclca"],
   :skos/prefLabel "Library of Congress Archives",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Library of Congress. Archives"}})

(def dlcm
  "United States, Library of Congress, Music Division"
  {:db/ident :loc.organizations/dlcm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1994-11-17T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:18:37.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Music Division",
   :madsrdf/code ["dlcm" "US-dlcm" "DLC-M"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Music Division, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Library of Congress, Music Division",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Music Division, Library of Congress"
                   "Library of Congress, Music Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1994-11-17T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcm,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:18:37.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcm,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["dlcm" "US-dlcm" "DLC-M"],
   :skos/prefLabel "United States, Library of Congress, Music Division",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Library of Congress, Music Division"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Music Division, Library of Congress"}]})

(def dlcmpmi
  "Library of Congress, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section"
  {:db/ident :loc.organizations/dlcmpmi,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-08-31T20:33:10.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-07T13:13:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "Library of Congress, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section",
   :madsrdf/code ["DLC-MPMI" "US-dlcmpmi" "dlcmpmi"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Special Collections and Services, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Moving Image Section, Motion Picture, Broadcasting and Recorded Sound Division, Library of Congress,",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Special Collections & Services, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Moving Image Section, Motion Picture, Broadcasting and Recorded Sound Division, Library of Congress,"
    "Library of Congress, Special Collections & Services, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section"
    "Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section, Library of Congress"
    "Library of Congress, Special Collections and Services, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2010-08-31T20:33:10.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcmpmi,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2015-04-07T13:13:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcmpmi,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcmpmi" "dlcmpmi" "DLC-MPMI"],
   :skos/prefLabel
   "Library of Congress, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Special Collections & Services, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Moving Image Section, Motion Picture, Broadcasting and Recorded Sound Division, Library of Congress,"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Special Collections and Services, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section"}]})

(def dlcmrc
  "United States, Library of Congress, Network Development and MARC Standards Office"
  {:db/ident :loc.organizations/dlcmrc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:22:59.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2000-12-06T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Network Development and MARC Standards Office",
   :madsrdf/code ["dlcmrc" "US-dlcmrc" "DLC-MRC"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Network Development and MARC Standards Office, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Network Development and MARC Standards Office",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Network Development and MARC Standards Office, Library of Congress"
    "Library of Congress, Network Development and MARC Standards Office"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:22:59.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcmrc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2000-12-06T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcmrc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-MRC" "US-dlcmrc" "dlcmrc"],
   :skos/prefLabel
   "United States, Library of Congress, Network Development and MARC Standards Office",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Network Development and MARC Standards Office, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Network Development and MARC Standards Office"}]})

(def dlcmss
  "Library of Congress, Manuscript Division"
  {:db/ident :loc.organizations/dlcmss,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-08-31T20:32:35.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-07T13:13:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel "Library of Congress, Manuscript Division",
   :madsrdf/code ["DLC-MSS" "dlcmss" "US-dlcmss"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Library of Congress, Collections & Services Directorate, Manuscript Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Collections and Services Directorate, Manuscript Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Manuscript Division, Library of Congress",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Library of Congress, Collections and Services Directorate, Manuscript Division"
    "Manuscript Division, Library of Congress"
    "Library of Congress, Collections & Services Directorate, Manuscript Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2010-08-31T20:32:35.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcmss,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2015-04-07T13:13:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcmss,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["dlcmss" "US-dlcmss" "DLC-MSS"],
   :skos/prefLabel "Library of Congress, Manuscript Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Collections and Services Directorate, Manuscript Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Collections & Services Directorate, Manuscript Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Manuscript Division, Library of Congress"}]})

(def dlcn
  "United States, Library of Congress, National Serials Data Program Office"
  {:db/ident :loc.organizations/dlcn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1976-05-07T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:21:38.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, National Serials Data Program Office",
   :madsrdf/code ["US-dlcn" "dlcn" "DLC-N"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "National Serials Data Program Office, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, National Serials Data Program Office",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Library of Congress, National Serials Data Program Office"
                   "National Serials Data Program Office, Library of Congress"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1976-05-07T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcn,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:21:38.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcn,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-N" "dlcn" "US-dlcn"],
   :skos/prefLabel
   "United States, Library of Congress, National Serials Data Program Office",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, National Serials Data Program Office"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "National Serials Data Program Office, Library of Congress"}]})

(def dlcnr
  "United States, Library of Congress, National Resources Program Office"
  {:db/ident :loc.organizations/dlcnr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1992-06-05T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:21:05.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, National Resources Program Office",
   :madsrdf/code ["dlcnr" "DLC-NR" "US-dlcnr"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Library of Congress, National Resources Program Office",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "National Resources Program Office, Library of Congress",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Library of Congress, National Resources Program Office"
                   "National Resources Program Office, Library of Congress"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1992-06-05T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcnr,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:21:05.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcnr,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcnr" "DLC-NR" "dlcnr"],
   :skos/prefLabel
   "United States, Library of Congress, National Resources Program Office",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "National Resources Program Office, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, National Resources Program Office"}]})

(def dlcntc
  "United States, Library of Congress, National Translations Center"
  {:db/ident :loc.organizations/dlcntc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1992-05-28T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:22:14.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, National Translations Center",
   :madsrdf/code ["US-dlcntc" "DLC-NTC" "dlcntc"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "National Translations Center, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Library of Congress, National Translations Center",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["National Translations Center, Library of Congress"
                   "Library of Congress, National Translations Center"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:22:14.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcntc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1992-05-28T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcntc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-NTC" "US-dlcntc" "dlcntc"],
   :skos/prefLabel
   "United States, Library of Congress, National Translations Center",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "National Translations Center, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Library of Congress, National Translations Center"}]})

(def dlcnucm
  "Library of Congress, National Union Catalog of Manuscript Collections"
  {:db/ident :loc.organizations/dlcnucm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:16:37.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-10-15T20:12:59.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "Library of Congress, National Union Catalog of Manuscript Collections",
   :madsrdf/code ["US-dlcnucm" "DLC-NUCM" "dlcnucm"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "NUCMC, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "National Union Catalog of Manuscript Collections, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Library of Congress, NUCMC",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "NUCMC",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Library of Congress, NUCMC"
    "NUCMC, Library of Congress"
    "NUCMC"
    "National Union Catalog of Manuscript Collections, Library of Congress"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2010-10-15T20:12:59.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcnucm,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:16:37.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcnucm,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcnucm" "DLC-NUCM" "dlcnucm"],
   :skos/prefLabel
   "Library of Congress, National Union Catalog of Manuscript Collections",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "NUCMC"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "National Union Catalog of Manuscript Collections, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Library of Congress, NUCMC"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "NUCMC, Library of Congress"}]})

(def dlcpf
  "United States, Library of Congress, Priority Four Collection Unit"
  {:db/ident :loc.organizations/dlcpf,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:31:19.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1975-10-03T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Priority Four Collection Unit",
   :madsrdf/code ["US-dlcpf" "DLC-PF" "dlcpf"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Priority Four Collection Unit, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Library of Congress, Priority Four Collection Unit",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Priority Four Collection Unit, Library of Congress"
                   "Library of Congress, Priority Four Collection Unit"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1975-10-03T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcpf,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:31:19.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcpf,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcpf" "dlcpf" "DLC-PF"],
   :skos/prefLabel
   "United States, Library of Congress, Priority Four Collection Unit",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Priority Four Collection Unit, Library of Congress"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Library of Congress, Priority Four Collection Unit"}]})

(def dlcpp
  "Library of Congress, Prints & Photographs Division"
  {:db/ident :loc.organizations/dlcpp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2007-08-30T14:23:49.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:07:43.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "Library of Congress, Prints & Photographs Division",
   :madsrdf/code ["DLC-PP" "US-dlcpp" "dlcpp"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant [{:madsrdf/variantLabel "P&P",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel
                         "Prints & Photographs Division, Library of Congress",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Prints & Photographs Division, Library of Congress" "P&P"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2007-08-30T14:23:49.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcpp,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:07:43.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcpp,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcpp" "dlcpp" "DLC-PP"],
   :skos/prefLabel "Library of Congress, Prints & Photographs Division",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "Prints & Photographs Division, Library of Congress"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "P&P"}]})

(def dlcr
  "United States, Library of Congress, Regional and Cooperative Cataloging Division"
  {:db/ident :loc.organizations/dlcr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1992-05-28T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:32:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Regional and Cooperative Cataloging Division",
   :madsrdf/code ["DLC-R" "dlcr" "US-dlcr"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Regional Cataloging Division, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Library of Congress, Regional Cataloging Division",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Regional Cataloging Division, Library of Congress"
                   "Library of Congress, Regional Cataloging Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1992-05-28T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcr,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:32:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcr,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-R" "dlcr" "US-dlcr"],
   :skos/prefLabel
   "United States, Library of Congress, Regional and Cooperative Cataloging Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Regional Cataloging Division, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Library of Congress, Regional Cataloging Division"}]})

(def dlcrbsc
  "Library of Congress, Rare Book and Special Collections Division"
  {:db/ident :loc.organizations/dlcrbsc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T14:00:44.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-08-31T20:34:25.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "Library of Congress, Rare Book and Special Collections Division",
   :madsrdf/code ["US-dlcrbsc" "DLC-RBSC" "dlcrbsc"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Rare Book and Special Collections Division, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Special Collections & Services, Rare Book and Special Collections Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Special Collections and Services, Rare Book and Special Collections Division",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Library of Congress, Special Collections and Services, Rare Book and Special Collections Division"
    "Library of Congress, Special Collections & Services, Rare Book and Special Collections Division"
    "Rare Book and Special Collections Division, Library of Congress"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2010-08-31T20:34:25.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcrbsc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T14:00:44.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcrbsc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["dlcrbsc" "DLC-RBSC" "US-dlcrbsc"],
   :skos/prefLabel
   "Library of Congress, Rare Book and Special Collections Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Special Collections & Services, Rare Book and Special Collections Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Special Collections and Services, Rare Book and Special Collections Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Rare Book and Special Collections Division, Library of Congress"}]})

(def dlcrs
  "Library of Congress, Motion Picture, Broadcasting, and Recorded Sound Division, Recorded Sound Section"
  {:db/ident :loc.organizations/dlcrs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:07:02.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2003-06-19T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "Library of Congress, Motion Picture, Broadcasting, and Recorded Sound Division, Recorded Sound Section",
   :madsrdf/code ["DLC-RS" "US-dlcrs" "dlcrs"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   {:madsrdf/variantLabel
    "Motion Picture, Broadcasting, and Recorded Sound Division, Recorded Sound Section, Library of Congress",
    :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   "Motion Picture, Broadcasting, and Recorded Sound Division, Recorded Sound Section, Library of Congress",
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:07:02.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcrs,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2003-06-19T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcrs,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["dlcrs" "DLC-RS" "US-dlcrs"],
   :skos/prefLabel
   "Library of Congress, Motion Picture, Broadcasting, and Recorded Sound Division, Recorded Sound Section",
   :skosxl/altLabel
   {:rdf/type :skosxl/Label,
    :skosxl/literalForm
    "Motion Picture, Broadcasting, and Recorded Sound Division, Recorded Sound Section, Library of Congress"}})

(def dlcs
  "United States, Library of Congress, Serial Record Division"
  {:db/ident :loc.organizations/dlcs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:27:41.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1990-01-01T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Serial Record Division",
   :madsrdf/code ["DLC-S" "dlcs" "US-dlcs"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Library of Congress, Serial Record Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Serial Record Division, Library of Congress",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Serial Record Division, Library of Congress"
                   "Library of Congress, Serial Record Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1990-01-01T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcs,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:27:41.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcs,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-dlcs" "DLC-S" "dlcs"],
   :skos/prefLabel "United States, Library of Congress, Serial Record Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Serial Record Division, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Library of Congress, Serial Record Division"}]})

(def dlcsgp
  "Library of Congress Serial and Government Publications Division"
  {:db/ident :loc.organizations/dlcsgp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:26:29.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2011-06-20T21:44:15.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "Library of Congress Serial and Government Publications Division",
   :madsrdf/code ["DLC-SGP" "US-dlcsgp" "dlcsgp"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Library of Congress, Serials Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Serials Division, Library of Congress",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Serials Division, Library of Congress"
                   "Library of Congress, Serials Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:26:29.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcsgp,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2011-06-20T21:44:15.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcsgp,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-SGP" "dlcsgp" "US-dlcsgp"],
   :skos/prefLabel
   "Library of Congress Serial and Government Publications Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Serials Division, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Library of Congress, Serials Division"}]})

(def dlcsm
  "United States, Library of Congress, Special Materials Cataloging Division"
  {:db/ident :loc.organizations/dlcsm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1999-04-13T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:29:19.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Special Materials Cataloging Division",
   :madsrdf/code ["DLC-SM" "US-dlcsm" "dlcsm"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Library of Congress, Special Materials Cataloging Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Special Materials Cataloging Division, Library of Congress",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Special Materials Cataloging Division, Library of Congress"
    "Library of Congress, Special Materials Cataloging Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:29:19.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcsm,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1999-04-13T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcsm,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-SM" "US-dlcsm" "dlcsm"],
   :skos/prefLabel
   "United States, Library of Congress, Special Materials Cataloging Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Special Materials Cataloging Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Special Materials Cataloging Division, Library of Congress"}]})

(def dlcss
  "United States, Library of Congress, Social Sciences Cataloging Division"
  {:db/ident :loc.organizations/dlcss,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1999-04-13T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:28:45.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}],
   :madsrdf/authoritativeLabel
   "United States, Library of Congress, Social Sciences Cataloging Division",
   :madsrdf/code ["dlcss" "DLC-SS" "US-dlcss"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Social Sciences Cataloging Division,  Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Social Sciences Cataloging Division",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel ["Social Sciences Cataloging Division, Library of Congress"
                   "Library of Congress, Social Sciences Cataloging Division"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:28:45.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcss,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "1999-04-13T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcss,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["dlcss" "US-dlcss" "DLC-SS"],
   :skos/prefLabel
   "United States, Library of Congress, Social Sciences Cataloging Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Social Sciences Cataloging Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Social Sciences Cataloging Division, Library of Congress"}]})

(def dlcstbd
  "Library of Congress, Science, Technology and Business Division"
  {:db/ident :loc.organizations/dlcstbd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-07T13:13:26.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-08-31T20:33:49.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel
   "Library of Congress, Science, Technology and Business Division",
   :madsrdf/code ["US-dlcstbd" "dlcstbd" "DLC-STBD"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Science, Technology and Business Division, Library of Congress",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Science, General Collections & Services, Technology and Business Division",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Library of Congress, Science, General Collections and Services, Technology and Business Division",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   ["Library of Congress, Science, General Collections & Services, Technology and Business Division"
    "Library of Congress, Science, General Collections and Services, Technology and Business Division"
    "Science, Technology and Business Division, Library of Congress"],
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2015-04-07T13:13:26.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcstbd,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2010-08-31T20:33:49.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcstbd,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["DLC-STBD" "dlcstbd" "US-dlcstbd"],
   :skos/prefLabel
   "Library of Congress, Science, Technology and Business Division",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Science, General Collections and Services, Technology and Business Division"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Science, Technology and Business Division, Library of Congress"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Library of Congress, Science, General Collections & Services, Technology and Business Division"}]})

(def dlcvhp
  "Veterans History Project, Library of Congress"
  {:db/ident :loc.organizations/dlcvhp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-14T20:04:25.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "modified"}}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-06-30T20:02:07.000-00:00",
     :ri/recordContentSource :loc.organizations/dlcmrc,
     :ri/recordStatus {:rdf/language "en",
                       :rdf/value    "new"}}],
   :madsrdf/authoritativeLabel "Veterans History Project, Library of Congress",
   :madsrdf/code ["DLC-VHP" "US-DLC-VHP" "dlcvhp"],
   :madsrdf/hasBroaderAuthority :loc.organizations/dlc,
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Library of Congress, Veterans History Project",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.organizations/collection_organizations,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/organizations,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel "Library of Congress, Veterans History Project",
   :skos/broader :loc.organizations/dlc,
   :skos/changeNote [{:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "new"},
                      :cs/createdDate     #inst "2015-06-30T20:02:07.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcvhp,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    {:rdf/language "en",
                                           :rdf/value    "modified"},
                      :cs/createdDate     #inst "2016-01-14T20:04:25.000-00:00",
                      :cs/creatorName     :loc.organizations/dlcmrc,
                      :cs/subjectOfChange :loc.organizations/dlcvhp,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/organizations,
   :skos/notation ["US-DLC-VHP" "dlcvhp" "DLC-VHP"],
   :skos/prefLabel "Veterans History Project, Library of Congress",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Library of Congress, Veterans History Project"}})

(def ^{:private true} organizations
  "The Code List for Cultural Heritage Organizations contains short alphabetic codes used to represent names of libraries and other kinds of organizations that need to be identified in the bibliographic environment. This code list is an essential reference tool for those dealing with MARC records, for systems reporting library holdings, for many interlibrary loan systems, and for those who may be organizing cooperative projects on a regional, national, or international scale. There are a number of data elements in the MARC formats that call for institutional identifiers, the chief ones being those that identify the organization assigning the record control number, the agency responsible for creating or modifying a record, and the agency holding a copy of the item. In particular, this list is a key to codes for holding institutions represented in the Library of Congress National Union Catalog (NUC) and other union list publications which contain holdings for reporting institutions. This code list for cultural heritage organizations , which was begun in 1932 as part of a community project, includes new codes assigned on an on-going basis. Over time, a small number of existing codes have been changed or made obsolete. In all cases, previously valid codes are given as references. The large number of codes can be attributed to continuing expansion of the use of standard identifiers, nationally by school libraries (particularly for statewide projects) and internationally as information is shared globally via the Internet. While this list of organizations focuses on US institutions, with over 30,000 defined, it also includes codes for institutions in other countries that have requested them. However, MARC codes are not assigned for institutions for Canada, Germany, or the United Kingdom unless the institution is a branch of a US institution. The list contains over 41,000 entries. The code list, including a detailed explanation of the codes' history and structure, is part of a database where the codes may also be searched. See the MARC Code List for Organizations website."
  {:db/ident :loc.vocabulary/organizations,
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "The Code List for Cultural Heritage Organizations contains short alphabetic codes used to represent names of libraries and other kinds of organizations that need to be identified in the bibliographic environment. This code list is an essential reference tool for those dealing with MARC records, for systems reporting library holdings, for many interlibrary loan systems, and for those who may be organizing cooperative projects on a regional, national, or international scale. There are a number of data elements in the MARC formats that call for institutional identifiers, the chief ones being those that identify the organization assigning the record control number, the agency responsible for creating or modifying a record, and the agency holding a copy of the item. In particular, this list is a key to codes for holding institutions represented in the Library of Congress National Union Catalog (NUC) and other union list publications which contain holdings for reporting institutions. This code list for cultural heritage organizations , which was begun in 1932 as part of a community project, includes new codes assigned on an on-going basis. Over time, a small number of existing codes have been changed or made obsolete. In all cases, previously valid codes are given as references. The large number of codes can be attributed to continuing expansion of the use of standard identifiers, nationally by school libraries (particularly for statewide projects) and internationally as information is shared globally via the Internet. While this list of organizations focuses on US institutions, with over 30,000 defined, it also includes codes for institutions in other countries that have requested them. However, MARC codes are not assigned for institutions for Canada, Germany, or the United Kingdom unless the institution is a branch of a US institution. The list contains over 41,000 entries. The code list, including a detailed explanation of the codes' history and structure, is part of a database where the codes may also be searched. See the MARC Code List for Organizations website.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Code List for Cultural Heritage Organizations"}})
