(ns net.wikipunk.rdf.loc.mserialpubtype
  "http://id.loc.gov/vocabulary/mserialpubtype/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mserialpubtype.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mserialpubtype"
                       "http://id.loc.gov/vocabulary/mserialpubtype/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mserialpubtype",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mserialpubtype/"})

(def blog
  "An online periodical appearing on a web page that may contain links and/or comments on a particular topic or subject."
  {:db/ident :loc.mserialpubtype/blog,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-06-04T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "blog",
   :madsrdf/code "blog",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An online periodical appearing on a web page that may contain links and/or comments on a particular topic or subject."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=h"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-06-04T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mserialpubtype/blog,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An online periodical appearing on a web page that may contain links and/or comments on a particular topic or subject."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=h"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "blog",
   :skos/prefLabel "blog"})

(def database
  "A collection of logically interrelated data stored together in one or more files, usually created and managed by a database management system and which may be accessible via a search interface."
  {:db/ident :loc.mserialpubtype/database,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "database",
   :madsrdf/code "database",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A collection of logically interrelated data stored together in one or more files, usually created and managed by a database management system and which may be accessible via a search interface."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "updating database",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=d"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/altLabel "updating database",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mserialpubtype/database,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A collection of logically interrelated data stored together in one or more files, usually created and managed by a database management system and which may be accessible via a search interface."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=d"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "database",
   :skos/prefLabel "database",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "updating database"}})

(def direct
  "An itemized listing of information for the identification or location of persons, objects, organizations or places, arranged alphabetically, chronologically, or in other systematic order, and updated over time."
  {:db/ident :loc.mserialpubtype/direct,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-06-04T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-06-04T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "directory",
   :madsrdf/code "direct",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An itemized listing of information for the identification or location of persons, objects, organizations or places, arranged alphabetically, chronologically, or in other systematic order, and updated over time."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=t"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-06-04T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mserialpubtype/direct,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2021-06-04T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mserialpubtype/direct,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An itemized listing of information for the identification or location of persons, objects, organizations or places, arranged alphabetically, chronologically, or in other systematic order, and updated over time."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=t"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "direct",
   :skos/prefLabel "directory"})

(def journal
  "Print or digital periodical addressing readers interested in a specific subject of profession and often includes original research and current developments."
  {:db/ident :loc.mserialpubtype/journal,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-06-04T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "journal",
   :madsrdf/code "journal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Print or digital periodical addressing readers interested in a specific subject of profession and often includes original research and current developments."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=j"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-06-04T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mserialpubtype/journal,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Print or digital periodical addressing readers interested in a specific subject of profession and often includes original research and current developments."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=j"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "journal",
   :skos/prefLabel "journal"})

(def looseleaf
  "A resource consisting of a base volume(s) updated by separate pages which are inserted, removed, and/or substituted."
  {:db/ident :loc.mserialpubtype/looseleaf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "loose leaf",
   :madsrdf/code "looseleaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A resource consisting of a base volume(s) updated by separate pages which are inserted, removed, and/or substituted."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "updating loose leaf",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=l"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/altLabel "updating loose leaf",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mserialpubtype/looseleaf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource consisting of a base volume(s) updated by separate pages which are inserted, removed, and/or substituted."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=l"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "looseleaf",
   :skos/prefLabel "loose leaf",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "updating loose leaf"}})

(def mag
  "Print or digital periodical addressing non-scientific, non-professional general interest topics."
  {:db/ident :loc.mserialpubtype/mag,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-06-04T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "magazine",
   :madsrdf/code "mag",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Print or digital periodical addressing non-scientific, non-professional general interest topics."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=g"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-06-04T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mserialpubtype/mag,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Print or digital periodical addressing non-scientific, non-professional general interest topics."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=g"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "mag",
   :skos/prefLabel "magazine"})

(def monoseries
  "A group of analyzable items (i.e., each piece has a distinctive title) that are related to one another by a collective title. The individual items may or may not be numbered."
  {:db/ident :loc.mserialpubtype/monoseries,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "monographic series",
   :madsrdf/code "monoseries",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A group of analyzable items (i.e., each piece has a distinctive title) that are related to one another by a collective title. The individual items may or may not be numbered."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=m"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mserialpubtype/monoseries,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A group of analyzable items (i.e., each piece has a distinctive title) that are related to one another by a collective title. The individual items may or may not be numbered."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=m"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "monoseries",
   :skos/prefLabel "monographic series"})

(def newsletter
  "Print or digital periodical that can be issued by an organization, generally to its members, or to a specific audience to give current information about a topic or sphere of activity, issued either in print or digitally."
  {:db/ident :loc.mserialpubtype/newsletter,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-06-04T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "newsletter",
   :madsrdf/code "newsletter",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Print or digital periodical that can be issued by an organization, generally to its members, or to a specific audience to give current information about a topic or sphere of activity, issued either in print or digitally."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=s"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-06-04T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mserialpubtype/newsletter,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Print or digital periodical that can be issued by an organization, generally to its members, or to a specific audience to give current information about a topic or sphere of activity, issued either in print or digitally."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=s"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "newsletter",
   :skos/prefLabel "newsletter"})

(def newspaper
  "A resource that is designed to be a primary source of written information on current events, contains a broad range of news on all subjects and activities, and is not limited to any specific subject matter."
  {:db/ident :loc.mserialpubtype/newspaper,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "newspaper",
   :madsrdf/code "newspaper",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A resource that is designed to be a primary source of written information on current events, contains a broad range of news on all subjects and activities, and is not limited to any specific subject matter."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=n"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mserialpubtype/newspaper,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource that is designed to be a primary source of written information on current events, contains a broad range of news on all subjects and activities, and is not limited to any specific subject matter."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=n"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "newspaper",
   :skos/prefLabel "newspaper"})

(def periodical
  "Broad category of print or digital publications that includes resources with separate articles, stories, other writings, etc. that are published or distributed generally more frequently than annual including journals, magazines, newsletters and blogs."
  {:db/ident :loc.mserialpubtype/periodical,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-03-18T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-06-04T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "periodical",
   :madsrdf/code "periodical",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Broad category of print or digital publications that includes resources with separate articles, stories, other writings, etc. that are published or distributed generally more frequently than annual including journals, magazines, newsletters and blogs."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=p"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2020-03-18T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mserialpubtype/periodical,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2021-06-04T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mserialpubtype/periodical,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Broad category of print or digital publications that includes resources with separate articles, stories, other writings, etc. that are published or distributed generally more frequently than annual including journals, magazines, newsletters and blogs."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=p"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "periodical",
   :skos/prefLabel "periodical"})

(def repo
  "Online collection, often scholarly in nature, for storing the publications of an institution or a group of institutions. Can also be a collection of materials on a specific subject, or from a specific community."
  {:db/ident :loc.mserialpubtype/repo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-06-04T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "repository",
   :madsrdf/code "repo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Online collection, often scholarly in nature, for storing the publications of an institution or a group of institutions. Can also be a collection of materials on a specific subject, or from a specific community."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/21=r"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mserialpubtype/collection_mserialpubtype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mserialpubtype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-06-04T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mserialpubtype/repo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Online collection, often scholarly in nature, for storing the publications of an institution or a group of institutions. Can also be a collection of materials on a specific subject, or from a specific community."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/21=r"},
   :skos/inScheme :loc.vocabulary/mserialpubtype,
   :skos/notation "repo",
   :skos/prefLabel "repository"})

(def ^{:private true} mserialpubtype
  "The type of continuing resource which describes the item."
  {:db/ident :loc.vocabulary/mserialpubtype,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-03-18T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The type of continuing resource which describes the item."},
   :madsrdf/hasMADSSchemeMember [:loc.mserialpubtype/database
                                 :loc.mserialpubtype/monoseries
                                 :loc.mserialpubtype/journal
                                 :loc.mserialpubtype/blog
                                 :loc.mserialpubtype/newspaper
                                 :loc.mserialpubtype/mag
                                 :loc.mserialpubtype/repo
                                 :loc.mserialpubtype/looseleaf
                                 :loc.mserialpubtype/newsletter
                                 :loc.mserialpubtype/periodical
                                 :loc.mserialpubtype/direct],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Serial Publication Type"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-03-18T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mserialpubtype,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The type of continuing resource which describes the item."}})