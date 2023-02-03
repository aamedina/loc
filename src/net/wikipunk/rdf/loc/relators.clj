(ns net.wikipunk.rdf.loc.relators
  "http://id.loc.gov/vocabulary/relators/"
  {:dcat/downloadURL  "resources/relators.madsrdf.nt.gz",
   :rdf/ns-prefix-map {"loc.relators" "http://id.loc.gov/vocabulary/relators/"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.relators",
   :rdfa/uri          "http://id.loc.gov/vocabulary/relators/"}
  (:refer-clojure :exclude [let mod pop prn str]))

(def abr
  "A person, family, or organization contributing to a resource by shortening or condensing the original work but leaving the nature and content of the original work substantially unchanged"
  {:db/ident :loc.relators/abr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Abridger",
   :madsrdf/code "abr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by shortening or condensing the original work but leaving the nature and content of the original work substantially unchanged"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/abr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/abr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by shortening or condensing the original work but leaving the nature and content of the original work substantially unchanged"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "abr",
   :skos/prefLabel "Abridger"})

(def acp
  "A person (e.g., a painter or sculptor) who makes copies of works of visual art"
  {:db/ident :loc.relators/acp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Art copyist",
   :madsrdf/code "acp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person (e.g., a painter or sculptor) who makes copies of works of visual art"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/acp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/acp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person (e.g., a painter or sculptor) who makes copies of works of visual art"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "acp",
   :skos/prefLabel "Art copyist"})

(def act
  "A performer contributing to an expression of a work by acting as a cast member or player in a musical or dramatic presentation, etc."
  {:db/ident :loc.relators/act,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Actor",
   :madsrdf/code "act",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to an expression of a work by acting as a cast member or player in a musical or dramatic presentation, etc."},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/hasNarrowerAuthority :loc.relators/vac,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAContributor],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/act,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/act,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to an expression of a work by acting as a cast member or player in a musical or dramatic presentation, etc."},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower :loc.relators/vac,
   :skos/notation "act",
   :skos/prefLabel "Actor"})

(def adi
  "A person contributing to a motion picture or television production by overseeing the artists and craftspeople who build the sets"
  {:db/ident :loc.relators/adi,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Art director",
   :madsrdf/code "adi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person contributing to a motion picture or television production by overseeing the artists and craftspeople who build the sets"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed RDA def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/adi,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/adi,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person contributing to a motion picture or television production by overseeing the artists and craftspeople who build the sets"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed RDA def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "adi",
   :skos/prefLabel "Art director"})

(def adp
  "A person or organization who 1) reworks a musical composition, usually for a different medium, or 2) rewrites novels or stories for motion pictures or other audiovisual medium"
  {:db/ident :loc.relators/adp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Adapter",
   :madsrdf/code "adp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who 1) reworks a musical composition, usually for a different medium, or 2) rewrites novels or stories for motion pictures or other audiovisual medium"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/adp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/adp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who 1) reworks a musical composition, usually for a different medium, or 2) rewrites novels or stories for motion pictures or other audiovisual medium"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "adp",
   :skos/prefLabel "Adapter"})

(def aft
  "A person or organization responsible for an afterword, postface, colophon, etc. but who is not the chief author of a work"
  {:db/ident :loc.relators/aft,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Author of afterword, colophon, etc.",
   :madsrdf/code "aft",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for an afterword, postface, colophon, etc. but who is not the chief author of a work"},
   :madsrdf/hasBroaderAuthority :loc.relators/aut,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/aut,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aft,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aft,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for an afterword, postface, colophon, etc. but who is not the chief author of a work"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "aft",
   :skos/prefLabel "Author of afterword, colophon, etc."})

(def anl
  "A person or organization that reviews, examines and interprets data or information in a specific area"
  {:db/ident :loc.relators/anl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Analyst",
   :madsrdf/code "anl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that reviews, examines and interprets data or information in a specific area"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/anl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/anl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that reviews, examines and interprets data or information in a specific area"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "anl",
   :skos/prefLabel "Analyst"})

(def anm
  "A person contributing to a moving image work or computer program by giving apparent movement to inanimate objects or drawings. For the creator of the drawings that are animated, see artist"
  {:db/ident :loc.relators/anm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Animator",
   :madsrdf/code "anm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person contributing to a moving image work or computer program by giving apparent movement to inanimate objects or drawings. For the creator of the drawings that are animated, see artist"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/anm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/anm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person contributing to a moving image work or computer program by giving apparent movement to inanimate objects or drawings. For the creator of the drawings that are animated, see artist"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "anm",
   :skos/prefLabel "Animator"})

(def ann
  "A person who makes manuscript annotations on an item"
  {:db/ident :loc.relators/ann,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Annotator",
   :madsrdf/code "ann",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person who makes manuscript annotations on an item"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAItem
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ann,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ann,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who makes manuscript annotations on an item"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ann",
   :skos/prefLabel "Annotator"})

(def ant
  "A person or organization responsible for a resource upon which the resource represented by the bibliographic description is based. This may be appropriate for adaptations, sequels, continuations, indexes, etc."
  {:db/ident :loc.relators/ant,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Bibliographic antecedent",
   :madsrdf/code "ant",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for a resource upon which the resource represented by the bibliographic description is based. This may be appropriate for adaptations, sequels, continuations, indexes, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ant,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ant,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for a resource upon which the resource represented by the bibliographic description is based. This may be appropriate for adaptations, sequels, continuations, indexes, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ant",
   :skos/prefLabel "Bibliographic antecedent"})

(def ape
  "A person or organization against whom an appeal is taken"
  {:db/ident :loc.relators/ape,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Appellee",
   :madsrdf/code "ape",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person or organization against whom an appeal is taken"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "MARC had more specific roles"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ape,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ape,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A person or organization against whom an appeal is taken"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "MARC had more specific roles"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ape",
   :skos/prefLabel "Appellee"})

(def apl
  "A person or organization who appeals a lower court's decision"
  {:db/ident :loc.relators/apl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Appellant",
   :madsrdf/code "apl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A person or organization who appeals a lower court's decision"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "MARC had more specific roles"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/apl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/apl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A person or organization who appeals a lower court's decision"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "MARC had more specific roles"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "apl",
   :skos/prefLabel "Appellant"})

(def app
  "A person or organization responsible for the submission of an application or who is named as eligible for the results of the processing of the application (e.g., bestowing of rights, reward, title, position)"
  {:db/ident :loc.relators/app,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Applicant",
   :madsrdf/code "app",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the submission of an application or who is named as eligible for the results of the processing of the application (e.g., bestowing of rights, reward, title, position)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/app,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/app,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the submission of an application or who is named as eligible for the results of the processing of the application (e.g., bestowing of rights, reward, title, position)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "app",
   :skos/prefLabel "Applicant"})

(def aqt
  "A person or organization whose work is largely quoted or extracted in works to which he or she did not contribute directly. Such quotations are found particularly in exhibition catalogs, collections of photographs, etc."
  {:db/ident :loc.relators/aqt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Author in quotations or text abstracts",
   :madsrdf/code "aqt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization whose work is largely quoted or extracted in works to which he or she did not contribute directly. Such quotations are found particularly in exhibition catalogs, collections of photographs, etc."},
   :madsrdf/hasBroaderAuthority :loc.relators/aut,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/aut,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aqt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aqt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization whose work is largely quoted or extracted in works to which he or she did not contribute directly. Such quotations are found particularly in exhibition catalogs, collections of photographs, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "aqt",
   :skos/prefLabel "Author in quotations or text abstracts"})

(def arc
  "A person, family, or organization responsible for creating an architectural design, including a pictorial representation intended to show how a building, etc., will look when completed. It also oversees the construction of structures"
  {:db/ident :loc.relators/arc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Architect",
   :madsrdf/code "arc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating an architectural design, including a pictorial representation intended to show how a building, etc., will look when completed. It also oversees the construction of structures"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "changed MARC def"},
   :madsrdf/hasNarrowerAuthority :loc.relators/lsa,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDACreator
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/arc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/arc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating an architectural design, including a pictorial representation intended to show how a building, etc., will look when completed. It also oversees the construction of structures"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower :loc.relators/lsa,
   :skos/notation "arc",
   :skos/prefLabel "Architect"})

(def ard
  "A person responsible for controlling the development of the artistic style of an entire production, including the choice of works to be presented and selection of senior production staff"
  {:db/ident :loc.relators/ard,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Artistic director",
   :madsrdf/code "ard",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person responsible for controlling the development of the artistic style of an entire production, including the choice of works to be presented and selection of senior production staff"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ard,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ard,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person responsible for controlling the development of the artistic style of an entire production, including the choice of works to be presented and selection of senior production staff"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ard",
   :skos/prefLabel "Artistic director"})

(def arr
  "A person, family, or organization contributing to a musical work by rewriting the composition for a medium of performance different from that for which the work was originally intended, or modifying the work for the same medium of performance, etc., such that the musical substance of the original composition remains essentially unchanged. For extensive modification that effectively results in the creation of a new musical work, see composer"
  {:db/ident :loc.relators/arr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Arranger",
   :madsrdf/code "arr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a musical work by rewriting the composition for a medium of performance different from that for which the work was originally intended, or modifying the work for the same medium of performance, etc., such that the musical substance of the original composition remains essentially unchanged. For extensive modification that effectively results in the creation of a new musical work, see composer"},
   :madsrdf/editorialNote [{:rdf/language "en",
                            :rdf/value    "changed MARC def"}
                           {:rdf/language "en",
                            :rdf/value    "changed RDA term"}],
   :madsrdf/hasVariant {:madsrdf/variantLabel "Arranger of music",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Arranger of music",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/arr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/arr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a musical work by rewriting the composition for a medium of performance different from that for which the work was originally intended, or modifying the work for the same medium of performance, etc., such that the musical substance of the original composition remains essentially unchanged. For extensive modification that effectively results in the creation of a new musical work, see composer"},
   :skos/editorial [{:rdf/language "en",
                     :rdf/value    "changed RDA term"}
                    {:rdf/language "en",
                     :rdf/value    "changed MARC def"}],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "arr",
   :skos/prefLabel "Arranger",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Arranger of music"}})

(def art
  "A person, family, or organization responsible for creating a work by conceiving, and implementing, an original graphic design, drawing, painting, etc. For book illustrators, prefer Illustrator [ill]"
  {:db/ident :loc.relators/art,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Artist",
   :madsrdf/code "art",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a work by conceiving, and implementing, an original graphic design, drawing, painting, etc. For book illustrators, prefer Illustrator [ill]"},
   :madsrdf/editorialNote
   {:rdf/language "en",
    :rdf/value
    "\"changed MARC def; Relator term \"\"Graphic technician\"\" (coded [grt]) used before March 1988 only\""},
   :madsrdf/hasNarrowerAuthority :loc.relators/scl,
   :madsrdf/hasVariant {:madsrdf/variantLabel "Graphic technician",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDACreator
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Graphic technician",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/art,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/art,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a work by conceiving, and implementing, an original graphic design, drawing, painting, etc. For book illustrators, prefer Illustrator [ill]"},
   :skos/editorial
   {:rdf/language "en",
    :rdf/value
    "\"changed MARC def; Relator term \"\"Graphic technician\"\" (coded [grt]) used before March 1988 only\""},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower :loc.relators/scl,
   :skos/notation "art",
   :skos/prefLabel "Artist",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Graphic technician"}})

(def asg
  "A person or organization to whom a license for printing or publishing has been transferred"
  {:db/ident :loc.relators/asg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Assignee",
   :madsrdf/code "asg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization to whom a license for printing or publishing has been transferred"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/asg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/asg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization to whom a license for printing or publishing has been transferred"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "asg",
   :skos/prefLabel "Assignee"})

(def asn
  "A person or organization associated with or found in an item or collection, which cannot be determined to be that of a Former owner [fmo] or other designated relationship indicative of provenance"
  {:db/ident :loc.relators/asn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Associated name",
   :madsrdf/code "asn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization associated with or found in an item or collection, which cannot be determined to be that of a Former owner [fmo] or other designated relationship indicative of provenance"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/asn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/asn,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization associated with or found in an item or collection, which cannot be determined to be that of a Former owner [fmo] or other designated relationship indicative of provenance"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "asn",
   :skos/prefLabel "Associated name"})

(def ato
  "A person whose manuscript signature appears on an item"
  {:db/ident :loc.relators/ato,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Autographer",
   :madsrdf/code "ato",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person whose manuscript signature appears on an item"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDAItem],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ato,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ato,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person whose manuscript signature appears on an item"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ato",
   :skos/prefLabel "Autographer"})

(def att
  "An author, artist, etc., relating him/her to a resource for which there is or once was substantial authority for designating that person as author, creator, etc. of the work"
  {:db/ident :loc.relators/att,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Attributed name",
   :madsrdf/code "att",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An author, artist, etc., relating him/her to a resource for which there is or once was substantial authority for designating that person as author, creator, etc. of the work"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Supposed name",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/altLabel "Supposed name",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/att,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/att,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An author, artist, etc., relating him/her to a resource for which there is or once was substantial authority for designating that person as author, creator, etc. of the work"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "att",
   :skos/prefLabel "Attributed name",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Supposed name"}})

(def auc
  "A person or organization in charge of the estimation and public auctioning of goods, particularly books, artistic works, etc."
  {:db/ident :loc.relators/auc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Auctioneer",
   :madsrdf/code "auc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization in charge of the estimation and public auctioning of goods, particularly books, artistic works, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/auc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/auc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization in charge of the estimation and public auctioning of goods, particularly books, artistic works, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "auc",
   :skos/prefLabel "Auctioneer"})

(def aud
  "A person or organization responsible for the dialog or spoken commentary for a screenplay or sound recording"
  {:db/ident :loc.relators/aud,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Author of dialog",
   :madsrdf/code "aud",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the dialog or spoken commentary for a screenplay or sound recording"},
   :madsrdf/hasBroaderAuthority :loc.relators/aut,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/aut,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aud,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aud,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the dialog or spoken commentary for a screenplay or sound recording"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "aud",
   :skos/prefLabel "Author of dialog"})

(def aui
  "A person or organization responsible for an introduction, preface, foreword, or other critical introductory matter, but who is not the chief author"
  {:db/ident :loc.relators/aui,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Author of introduction, etc.",
   :madsrdf/code "aui",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for an introduction, preface, foreword, or other critical introductory matter, but who is not the chief author"},
   :madsrdf/hasBroaderAuthority :loc.relators/aut,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/aut,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aui,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aui,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for an introduction, preface, foreword, or other critical introductory matter, but who is not the chief author"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "aui",
   :skos/prefLabel "Author of introduction, etc."})

(def aus
  "An author of a screenplay, script, or scene"
  {:db/ident :loc.relators/aus,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Screenwriter",
   :madsrdf/code "aus",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "An author of a screenplay, script, or scene"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/aut,
   :madsrdf/hasNarrowerAuthority
   "http://id.loc.gov/vocabulary/relators/http://purl.org/dc/elements/1.1/contributor",
   :madsrdf/hasVariant {:madsrdf/variantLabel "Author of screenplay, etc.",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDACreator],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Author of screenplay, etc.",
   :skos/broader :loc.relators/aut,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aus,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aus,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "An author of a screenplay, script, or scene"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower
   "http://id.loc.gov/vocabulary/relators/http://purl.org/dc/elements/1.1/contributor",
   :skos/notation "aus",
   :skos/prefLabel "Screenwriter",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Author of screenplay, etc."}})

(def aut
  "A person, family, or organization responsible for creating a work that is primarily textual in content, regardless of media type (e.g., printed text, spoken word, electronic text, tactile text) or genre (e.g., poems, novels, screenplays, blogs). Use also for persons, etc., creating a new work by paraphrasing, rewriting, or adapting works by another creator such that the modification has substantially changed the nature and content of the original or changed the medium of expression"
  {:db/ident :loc.relators/aut,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Author",
   :madsrdf/code "aut",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a work that is primarily textual in content, regardless of media type (e.g., printed text, spoken word, electronic text, tactile text) or genre (e.g., poems, novels, screenplays, blogs). Use also for persons, etc., creating a new work by paraphrasing, rewriting, or adapting works by another creator such that the modification has substantially changed the nature and content of the original or changed the medium of expression"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "changed MARC def"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/aud
                                  :loc.relators/aui
                                  :loc.relators/lbt
                                  :loc.relators/aft
                                  :loc.relators/aqt
                                  :loc.relators/lyr
                                  :loc.relators/aus],
   :madsrdf/hasVariant {:madsrdf/variantLabel "Joint author",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDACreator
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Joint author",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aut,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/aut,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a work that is primarily textual in content, regardless of media type (e.g., printed text, spoken word, electronic text, tactile text) or genre (e.g., poems, novels, screenplays, blogs). Use also for persons, etc., creating a new work by paraphrasing, rewriting, or adapting works by another creator such that the modification has substantially changed the nature and content of the original or changed the medium of expression"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/aud
                   :loc.relators/aui
                   :loc.relators/aft
                   :loc.relators/aqt
                   :loc.relators/lbt
                   :loc.relators/aus
                   :loc.relators/lyr],
   :skos/notation "aut",
   :skos/prefLabel "Author",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Joint author"}})

(def bdd
  "A person or organization responsible for the binding design of a book, including the type of binding, the type of materials used, and any decorative aspects of the binding"
  {:db/ident :loc.relators/bdd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Binding designer",
   :madsrdf/code "bdd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the binding design of a book, including the type of binding, the type of materials used, and any decorative aspects of the binding"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Designer of binding",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/altLabel "Designer of binding",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bdd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bdd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the binding design of a book, including the type of binding, the type of materials used, and any decorative aspects of the binding"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "bdd",
   :skos/prefLabel "Binding designer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Designer of binding"}})

(def bjd
  "A person or organization responsible for the design of flexible covers designed for or published with a book, including the type of materials used, and any decorative aspects of the bookjacket"
  {:db/ident :loc.relators/bjd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Bookjacket designer",
   :madsrdf/code "bjd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the design of flexible covers designed for or published with a book, including the type of materials used, and any decorative aspects of the bookjacket"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Designer of bookjacket",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/altLabel "Designer of bookjacket",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bjd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bjd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the design of flexible covers designed for or published with a book, including the type of materials used, and any decorative aspects of the bookjacket"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "bjd",
   :skos/prefLabel "Bookjacket designer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Designer of bookjacket"}})

(def bkd
  "A person or organization involved in manufacturing a manifestation by being responsible for the entire graphic design of a book, including arrangement of type and illustration, choice of materials, and process used"
  {:db/ident :loc.relators/bkd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Book designer",
   :madsrdf/code "bkd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization involved in manufacturing a manifestation by being responsible for the entire graphic design of a book, including arrangement of type and illustration, choice of materials, and process used"},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Designer of e-book",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Designer of book",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/altLabel ["Designer of e-book" "Designer of book"],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bkd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bkd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization involved in manufacturing a manifestation by being responsible for the entire graphic design of a book, including arrangement of type and illustration, choice of materials, and process used"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "bkd",
   :skos/prefLabel "Book designer",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Designer of book"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Designer of e-book"}]})

(def bkp
  "A person or organization responsible for the production of books and other print media"
  {:db/ident :loc.relators/bkp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Book producer",
   :madsrdf/code "bkp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the production of books and other print media"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Producer of book",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/altLabel "Producer of book",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bkp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bkp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the production of books and other print media"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "bkp",
   :skos/prefLabel "Book producer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Producer of book"}})

(def blw
  "A person or organization responsible for writing a commendation or testimonial for a work, which appears on or within the publication itself, frequently on the back or dust jacket of print publications or on advertising material for all media"
  {:db/ident :loc.relators/blw,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Blurb writer",
   :madsrdf/code "blw",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for writing a commendation or testimonial for a work, which appears on or within the publication itself, frequently on the back or dust jacket of print publications or on advertising material for all media"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/blw,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/blw,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for writing a commendation or testimonial for a work, which appears on or within the publication itself, frequently on the back or dust jacket of print publications or on advertising material for all media"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "blw",
   :skos/prefLabel "Blurb writer"})

(def bnd
  "A person who binds an item"
  {:db/ident :loc.relators/bnd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Binder",
   :madsrdf/code "bnd",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A person who binds an item"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAItem
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bnd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bnd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A person who binds an item"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "bnd",
   :skos/prefLabel "Binder"})

(def bpd
  "A person or organization responsible for the design of a book owner's identification label that is most commonly pasted to the inside front cover of a book"
  {:db/ident :loc.relators/bpd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Bookplate designer",
   :madsrdf/code "bpd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the design of a book owner's identification label that is most commonly pasted to the inside front cover of a book"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bpd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bpd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the design of a book owner's identification label that is most commonly pasted to the inside front cover of a book"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "bpd",
   :skos/prefLabel "Bookplate designer"})

(def brd
  "A person, family, or organization involved in broadcasting a resource to an audience via radio, television, webcast, etc."
  {:db/ident :loc.relators/brd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Broadcaster",
   :madsrdf/code "brd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in broadcasting a resource to an audience via radio, television, webcast, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAPublisher
    :loc.relators/collection_RDAManifestation
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/brd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/brd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in broadcasting a resource to an audience via radio, television, webcast, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "brd",
   :skos/prefLabel "Broadcaster"})

(def brl
  "A person, family, or organization involved in manufacturing a resource by embossing Braille cells using a stylus, special embossing printer, or other device"
  {:db/ident :loc.relators/brl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Braille embosser",
   :madsrdf/code "brl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a resource by embossing Braille cells using a stylus, special embossing printer, or other device"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAManifestation
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAManufacturer
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/brl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/brl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a resource by embossing Braille cells using a stylus, special embossing printer, or other device"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "brl",
   :skos/prefLabel "Braille embosser"})

(def bsl
  "A person or organization who makes books and other bibliographic materials available for purchase. Interest in the materials is primarily lucrative"
  {:db/ident :loc.relators/bsl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Bookseller",
   :madsrdf/code "bsl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes books and other bibliographic materials available for purchase. Interest in the materials is primarily lucrative"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bsl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/bsl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes books and other bibliographic materials available for purchase. Interest in the materials is primarily lucrative"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "bsl",
   :skos/prefLabel "Bookseller"})

(def cas
  "A person, family, or organization involved in manufacturing a resource by pouring a liquid or molten substance into a mold and leaving it to solidify to take the shape of the mold"
  {:db/ident :loc.relators/cas,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Caster",
   :madsrdf/code "cas",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a resource by pouring a liquid or molten substance into a mold and leaving it to solidify to take the shape of the mold"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAManifestation
    :loc.relators/collection_RDAManufacturer
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cas,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cas,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a resource by pouring a liquid or molten substance into a mold and leaving it to solidify to take the shape of the mold"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cas",
   :skos/prefLabel "Caster"})

(def ccp
  "A person or organization responsible for the original idea on which a work is based, this includes the scientific author of an audio-visual item and the conceptor of an advertisement"
  {:db/ident :loc.relators/ccp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Conceptor",
   :madsrdf/code "ccp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the original idea on which a work is based, this includes the scientific author of an audio-visual item and the conceptor of an advertisement"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ccp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ccp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the original idea on which a work is based, this includes the scientific author of an audio-visual item and the conceptor of an advertisement"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ccp",
   :skos/prefLabel "Conceptor"})

(def chr
  "A person responsible for creating or contributing to a work of movement"
  {:db/ident :loc.relators/chr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Choreographer",
   :madsrdf/code "chr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person responsible for creating or contributing to a work of movement"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDACreator
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAExpression],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/chr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/chr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person responsible for creating or contributing to a work of movement"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "chr",
   :skos/prefLabel "Choreographer"})

(def clb
  {:db/ident :loc.relators/clb,
   :madsrdf/code "clb",
   :madsrdf/deprecatedLabel "Collaborator",
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Combined with Contributor (ctb)"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Contributor",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.relators/collection_PastPresentRelatorsEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type :madsrdf/DeprecatedAuthority,
   :rdfs/subPropertyOf :dc11/contributor})

(def cli
  "A person or organization for whom another person or organization is acting"
  {:db/ident :loc.relators/cli,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Client",
   :madsrdf/code "cli",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization for whom another person or organization is acting"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cli,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cli,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization for whom another person or organization is acting"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cli",
   :skos/prefLabel "Client"})

(def cll
  "A person or organization who writes in an artistic hand, usually as a copyist and or engrosser"
  {:db/ident :loc.relators/cll,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Calligrapher",
   :madsrdf/code "cll",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who writes in an artistic hand, usually as a copyist and or engrosser"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cll,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cll,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who writes in an artistic hand, usually as a copyist and or engrosser"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cll",
   :skos/prefLabel "Calligrapher"})

(def clr
  "A person or organization responsible for applying color to drawings, prints, photographs, maps, moving images, etc"
  {:db/ident :loc.relators/clr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Colorist",
   :madsrdf/code "clr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for applying color to drawings, prints, photographs, maps, moving images, etc"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/clr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/clr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for applying color to drawings, prints, photographs, maps, moving images, etc"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "clr",
   :skos/prefLabel "Colorist"})

(def clt
  "A person, family, or organization involved in manufacturing a manifestation of photographic prints from film or other colloid that has ink-receptive and ink-repellent surfaces"
  {:db/ident :loc.relators/clt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Collotyper",
   :madsrdf/code "clt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a manifestation of photographic prints from film or other colloid that has ink-receptive and ink-repellent surfaces"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAManufacturer
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAManifestation],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/clt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/clt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a manifestation of photographic prints from film or other colloid that has ink-receptive and ink-repellent surfaces"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "clt",
   :skos/prefLabel "Collotyper"})

(def cmm
  "A performer contributing to a work by providing interpretation, analysis, or a discussion of the subject matter on a recording, film, or other audiovisual medium"
  {:db/ident :loc.relators/cmm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Commentator",
   :madsrdf/code "cmm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a work by providing interpretation, analysis, or a discussion of the subject matter on a recording, film, or other audiovisual medium"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAWork
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cmm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cmm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a work by providing interpretation, analysis, or a discussion of the subject matter on a recording, film, or other audiovisual medium"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cmm",
   :skos/prefLabel "Commentator"})

(def cmp
  "A person, family, or organization responsible for creating or contributing to a musical resource by adding music to a work that originally lacked it or supplements it"
  {:db/ident :loc.relators/cmp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Composer",
   :madsrdf/code "cmp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating or contributing to a musical resource by adding music to a work that originally lacked it or supplements it"},
   :madsrdf/editorialNote [{:rdf/language "en",
                            :rdf/value    "combines RDA terms"}
                           {:rdf/language "en",
                            :rdf/value    "Changed MARC def"}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDACreator
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cmp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cmp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating or contributing to a musical resource by adding music to a work that originally lacked it or supplements it"},
   :skos/editorial [{:rdf/language "en",
                     :rdf/value    "Changed MARC def"}
                    {:rdf/language "en",
                     :rdf/value    "combines RDA terms"}],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cmp",
   :skos/prefLabel "Composer"})

(def cmt
  "A person or organization responsible for the creation of metal slug, or molds made of other materials, used to produce the text and images in printed matter"
  {:db/ident :loc.relators/cmt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Compositor",
   :madsrdf/code "cmt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the creation of metal slug, or molds made of other materials, used to produce the text and images in printed matter"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Typesetter",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/altLabel "Typesetter",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cmt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cmt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the creation of metal slug, or molds made of other materials, used to produce the text and images in printed matter"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cmt",
   :skos/prefLabel "Compositor",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Typesetter"}})

(def cnd
  "A performer contributing to a musical resource by leading a performing group (orchestra, chorus, opera, etc.) in a musical or dramatic presentation, etc."
  {:db/ident :loc.relators/cnd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Conductor",
   :madsrdf/code "cnd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a musical resource by leading a performing group (orchestra, chorus, opera, etc.) in a musical or dramatic presentation, etc."},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cnd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cnd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a musical resource by leading a performing group (orchestra, chorus, opera, etc.) in a musical or dramatic presentation, etc."},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cnd",
   :skos/prefLabel "Conductor"})

(def cng
  "A person in charge of photographing a motion picture, who plans the technical aspets of lighting and photographing of scenes, and often assists the director in the choice of angles, camera setups, and lighting moods. He or she may also supervise the further processing of filmed material up to the completion of the work print. Cinematographer is also referred to as director of photography. Do not confuse with videographer"
  {:db/ident :loc.relators/cng,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Cinematographer",
   :madsrdf/code "cng",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person in charge of photographing a motion picture, who plans the technical aspets of lighting and photographing of scenes, and often assists the director in the choice of angles, camera setups, and lighting moods. He or she may also supervise the further processing of filmed material up to the completion of the work print. Cinematographer is also referred to as director of photography. Do not confuse with videographer"},
   :madsrdf/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Changed MARC def (FIAF); RDA uses for videographer and MARC differentiates (confirmed with Andrea Leigh)"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Director of photography",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAOther
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :madsrdf/sourceNote {:rdf/language "en",
                        :rdf/value    "FIAF"},
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Director of photography",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cng,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cng,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person in charge of photographing a motion picture, who plans the technical aspets of lighting and photographing of scenes, and often assists the director in the choice of angles, camera setups, and lighting moods. He or she may also supervise the further processing of filmed material up to the completion of the work print. Cinematographer is also referred to as director of photography. Do not confuse with videographer"},
   :skos/editorial
   {:rdf/language "en",
    :rdf/value
    "Changed MARC def (FIAF); RDA uses for videographer and MARC differentiates (confirmed with Andrea Leigh)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cng",
   :skos/prefLabel "Cinematographer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Director of photography"}})

(def cns
  "A person or organization who examines bibliographic resources for the purpose of suppressing parts deemed objectionable on moral, political, military, or other grounds"
  {:db/ident :loc.relators/cns,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Censor",
   :madsrdf/code "cns",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who examines bibliographic resources for the purpose of suppressing parts deemed objectionable on moral, political, military, or other grounds"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def (not RDA)"},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Expurgator",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Bowdlerizer",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/altLabel ["Expurgator" "Bowdlerizer"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cns,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cns,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who examines bibliographic resources for the purpose of suppressing parts deemed objectionable on moral, political, military, or other grounds"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def (not RDA)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cns",
   :skos/prefLabel "Censor",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Expurgator"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Bowdlerizer"}]})

(def coe
  "A contestant against whom an appeal is taken from one court of law or jurisdiction to another to reverse the judgment"
  {:db/ident :loc.relators/coe,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Contestant-appellee",
   :madsrdf/code "coe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A contestant against whom an appeal is taken from one court of law or jurisdiction to another to reverse the judgment"},
   :madsrdf/hasBroaderAuthority :loc.relators/cos,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/broader :loc.relators/cos,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/coe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/coe,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A contestant against whom an appeal is taken from one court of law or jurisdiction to another to reverse the judgment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "coe",
   :skos/prefLabel "Contestant-appellee"})

(def col
  "A curator who brings together items from various sources that are then arranged, described, and cataloged as a collection. A collector is neither the creator of the material nor a person to whom manuscripts in the collection may have been addressed"
  {:db/ident :loc.relators/col,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Collector",
   :madsrdf/code "col",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A curator who brings together items from various sources that are then arranged, described, and cataloged as a collection. A collector is neither the creator of the material nor a person to whom manuscripts in the collection may have been addressed"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/cur,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAItem
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAOther],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/broader :loc.relators/cur,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/col,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/col,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A curator who brings together items from various sources that are then arranged, described, and cataloged as a collection. A collector is neither the creator of the material nor a person to whom manuscripts in the collection may have been addressed"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "col",
   :skos/prefLabel "Collector"})

(def com
  "A person, family, or organization responsible for creating a new work (e.g., a bibliography, a directory) through the act of compilation, e.g., selecting, arranging, aggregating, and editing data, information, etc."
  {:db/ident :loc.relators/com,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Compiler",
   :madsrdf/code "com",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a new work (e.g., a bibliography, a directory) through the act of compilation, e.g., selecting, arranging, aggregating, and editing data, information, etc."},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDACreator
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/com,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/com,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a new work (e.g., a bibliography, a directory) through the act of compilation, e.g., selecting, arranging, aggregating, and editing data, information, etc."},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "com",
   :skos/prefLabel "Compiler"})

(def con
  "A person or organization responsible for documenting, preserving, or treating printed or manuscript material, works of art, artifacts, or other media"
  {:db/ident :loc.relators/con,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Conservator",
   :madsrdf/code "con",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for documenting, preserving, or treating printed or manuscript material, works of art, artifacts, or other media"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Preservationist",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/altLabel "Preservationist",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/con,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/con,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for documenting, preserving, or treating printed or manuscript material, works of art, artifacts, or other media"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "con",
   :skos/prefLabel "Conservator",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Preservationist"}})

(def cor
  "A curator who lists or inventories the items in an aggregate work such as a collection of items or works"
  {:db/ident :loc.relators/cor,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Collection registrar",
   :madsrdf/code "cor",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A curator who lists or inventories the items in an aggregate work such as a collection of items or works"},
   :madsrdf/hasBroaderAuthority :loc.relators/cur,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAItem
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/cur,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cor,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cor,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A curator who lists or inventories the items in an aggregate work such as a collection of items or works"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cor",
   :skos/prefLabel "Collection registrar"})

(def cos
  "A person(s) or organization who opposes, resists, or disputes, in a court of law, a claim, decision, result, etc."
  {:db/ident :loc.relators/cos,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Contestant",
   :madsrdf/code "cos",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person(s) or organization who opposes, resists, or disputes, in a court of law, a claim, decision, result, etc."},
   :madsrdf/hasNarrowerAuthority [:loc.relators/cot :loc.relators/coe],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cos,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cos,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person(s) or organization who opposes, resists, or disputes, in a court of law, a claim, decision, result, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/coe :loc.relators/cot],
   :skos/notation "cos",
   :skos/prefLabel "Contestant"})

(def cot
  "A contestant who takes an appeal from one court of law or jurisdiction to another to reverse the judgment"
  {:db/ident :loc.relators/cot,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Contestant-appellant",
   :madsrdf/code "cot",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A contestant who takes an appeal from one court of law or jurisdiction to another to reverse the judgment"},
   :madsrdf/hasBroaderAuthority :loc.relators/cos,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/broader :loc.relators/cos,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cot,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cot,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A contestant who takes an appeal from one court of law or jurisdiction to another to reverse the judgment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cot",
   :skos/prefLabel "Contestant-appellant"})

(def cou
  "A court governed by court rules, regardless of their official nature (e.g., laws, administrative regulations)"
  {:db/ident :loc.relators/cou,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Court governed",
   :madsrdf/code "cou",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A court governed by court rules, regardless of their official nature (e.g., laws, administrative regulations)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cou,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cou,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A court governed by court rules, regardless of their official nature (e.g., laws, administrative regulations)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cou",
   :skos/prefLabel "Court governed"})

(def cov
  "A person or organization responsible for the graphic design of a book cover, album cover, slipcase, box, container, etc. For a person or organization responsible for the graphic design of an entire book, use Book designer; for book jackets, use bookjacket designer"
  {:db/ident :loc.relators/cov,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Cover designer",
   :madsrdf/code "cov",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the graphic design of a book cover, album cover, slipcase, box, container, etc. For a person or organization responsible for the graphic design of an entire book, use Book designer; for book jackets, use bookjacket designer"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Designer of cover",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/altLabel "Designer of cover",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cov,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cov,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the graphic design of a book cover, album cover, slipcase, box, container, etc. For a person or organization responsible for the graphic design of an entire book, use Book designer; for book jackets, use bookjacket designer"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cov",
   :skos/prefLabel "Cover designer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Designer of cover"}})

(def cpc
  "A person or organization listed as a copyright owner at the time of registration. Copyright can be granted or later transferred to another person or organization, at which time the claimant becomes the copyright holder"
  {:db/ident :loc.relators/cpc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Copyright claimant",
   :madsrdf/code "cpc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization listed as a copyright owner at the time of registration. Copyright can be granted or later transferred to another person or organization, at which time the claimant becomes the copyright holder"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cpc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cpc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization listed as a copyright owner at the time of registration. Copyright can be granted or later transferred to another person or organization, at which time the claimant becomes the copyright holder"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cpc",
   :skos/prefLabel "Copyright claimant"})

(def cpe
  "A complainant against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"
  {:db/ident :loc.relators/cpe,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Complainant-appellee",
   :madsrdf/code "cpe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A complainant against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"},
   :madsrdf/hasBroaderAuthority :loc.relators/cpl,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/broader :loc.relators/cpl,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cpe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cpe,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A complainant against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cpe",
   :skos/prefLabel "Complainant-appellee"})

(def cph
  "A person or organization to whom copy and legal rights have been granted or transferred for the intellectual content of a work. The copyright holder, although not necessarily the creator of the work, usually has the exclusive right to benefit financially from the sale and use of the work to which the associated copyright protection applies"
  {:db/ident :loc.relators/cph,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Copyright holder",
   :madsrdf/code "cph",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization to whom copy and legal rights have been granted or transferred for the intellectual content of a work. The copyright holder, although not necessarily the creator of the work, usually has the exclusive right to benefit financially from the sale and use of the work to which the associated copyright protection applies"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cph,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cph,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization to whom copy and legal rights have been granted or transferred for the intellectual content of a work. The copyright holder, although not necessarily the creator of the work, usually has the exclusive right to benefit financially from the sale and use of the work to which the associated copyright protection applies"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cph",
   :skos/prefLabel "Copyright holder"})

(def cpl
  "A person or organization who applies to the courts for redress, usually in an equity proceeding"
  {:db/ident :loc.relators/cpl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Complainant",
   :madsrdf/code "cpl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who applies to the courts for redress, usually in an equity proceeding"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/cpt :loc.relators/cpe],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cpl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cpl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who applies to the courts for redress, usually in an equity proceeding"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/cpe :loc.relators/cpt],
   :skos/notation "cpl",
   :skos/prefLabel "Complainant"})

(def cpt
  "A complainant who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"
  {:db/ident :loc.relators/cpt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Complainant-appellant",
   :madsrdf/code "cpt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A complainant who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"},
   :madsrdf/hasBroaderAuthority :loc.relators/cpl,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/broader :loc.relators/cpl,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cpt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cpt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A complainant who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cpt",
   :skos/prefLabel "Complainant-appellant"})

(def cre
  "A person or organization responsible for the intellectual or artistic content of a resource"
  {:db/ident :loc.relators/cre,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Creator",
   :madsrdf/code "cre",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the intellectual or artistic content of a resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDACreator
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf [:dc11/contributor :dc11/creator],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cre,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cre,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the intellectual or artistic content of a resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cre",
   :skos/prefLabel "Creator"})

(def crp
  "A person or organization who was either the writer or recipient of a letter or other communication"
  {:db/ident :loc.relators/crp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Correspondent",
   :madsrdf/code "crp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who was either the writer or recipient of a letter or other communication"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/crp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/crp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who was either the writer or recipient of a letter or other communication"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "crp",
   :skos/prefLabel "Correspondent"})

(def crr
  "A person or organization who is a corrector of manuscripts, such as the scriptorium official who corrected the work of a scribe. For printed matter, use Proofreader"
  {:db/ident :loc.relators/crr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Corrector",
   :madsrdf/code "crr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is a corrector of manuscripts, such as the scriptorium official who corrected the work of a scribe. For printed matter, use Proofreader"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/crr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/crr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is a corrector of manuscripts, such as the scriptorium official who corrected the work of a scribe. For printed matter, use Proofreader"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "crr",
   :skos/prefLabel "Corrector"})

(def crt
  "A person, family, or organization contributing to a resource by preparing a court's opinions for publication"
  {:db/ident :loc.relators/crt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Court reporter",
   :madsrdf/code "crt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by preparing a court's opinions for publication"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAWork
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/crt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/crt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by preparing a court's opinions for publication"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "crt",
   :skos/prefLabel "Court reporter"})

(def csl
  "A person or organization relevant to a resource, who is called upon for professional advice or services in a specialized field of knowledge or training"
  {:db/ident :loc.relators/csl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Consultant",
   :madsrdf/code "csl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization relevant to a resource, who is called upon for professional advice or services in a specialized field of knowledge or training"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAOther
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/csl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/csl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization relevant to a resource, who is called upon for professional advice or services in a specialized field of knowledge or training"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "csl",
   :skos/prefLabel "Consultant"})

(def csp
  "A person or organization relevant to a resource, who is engaged specifically to provide an intellectual overview of a strategic or operational task and by analysis, specification, or instruction, to create or propose a cost-effective course of action or solution"
  {:db/ident :loc.relators/csp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Consultant to a project",
   :madsrdf/code "csp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization relevant to a resource, who is engaged specifically to provide an intellectual overview of a strategic or operational task and by analysis, specification, or instruction, to create or propose a cost-effective course of action or solution"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/csp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/csp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization relevant to a resource, who is engaged specifically to provide an intellectual overview of a strategic or operational task and by analysis, specification, or instruction, to create or propose a cost-effective course of action or solution"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "csp",
   :skos/prefLabel "Consultant to a project"})

(def cst
  "A person, family, or organization that designs the costumes for a moving image production or for a musical or dramatic presentation or entertainment"
  {:db/ident :loc.relators/cst,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Costume designer",
   :madsrdf/code "cst",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization that designs the costumes for a moving image production or for a musical or dramatic presentation or entertainment"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cst,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cst,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization that designs the costumes for a moving image production or for a musical or dramatic presentation or entertainment"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cst",
   :skos/prefLabel "Costume designer"})

(def ctb
  "A person, family or organization responsible for making contributions to the resource. This includes those whose work has been contributed to a larger work, such as an anthology, serial publication, or other compilation of individual works. If a more specific role is available, prefer that, e.g. editor, compiler, illustrator"
  {:db/ident :loc.relators/ctb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Contributor",
   :madsrdf/code "ctb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family or organization responsible for making contributions to the resource. This includes those whose work has been contributed to a larger work, such as an anthology, serial publication, or other compilation of individual works. If a more specific role is available, prefer that, e.g. editor, compiler, illustrator"},
   :madsrdf/editorialNote
   [{:rdf/language "en",
     :rdf/value    "Changed MARC def"}
    {:rdf/language "en",
     :rdf/value    "Collaborator deprecated in MARC list and reference made"}],
   :madsrdf/hasVariant {:madsrdf/variantLabel "Collaborator",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Collaborator",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ctb,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ctb,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family or organization responsible for making contributions to the resource. This includes those whose work has been contributed to a larger work, such as an anthology, serial publication, or other compilation of individual works. If a more specific role is available, prefer that, e.g. editor, compiler, illustrator"},
   :skos/editorial [{:rdf/language "en",
                     :rdf/value
                     "Collaborator deprecated in MARC list and reference made"}
                    {:rdf/language "en",
                     :rdf/value    "Changed MARC def"}],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ctb",
   :skos/prefLabel "Contributor",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Collaborator"}})

(def cte
  "A contestee against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment"
  {:db/ident :loc.relators/cte,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Contestee-appellee",
   :madsrdf/code "cte",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A contestee against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment"},
   :madsrdf/hasBroaderAuthority :loc.relators/cts,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/broader :loc.relators/cts,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cte,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cte,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A contestee against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cte",
   :skos/prefLabel "Contestee-appellee"})

(def ctg
  "A person, family, or organization responsible for creating a map, atlas, globe, or other cartographic work"
  {:db/ident :loc.relators/ctg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Cartographer",
   :madsrdf/code "ctg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a map, atlas, globe, or other cartographic work"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDACreator
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ctg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ctg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a map, atlas, globe, or other cartographic work"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ctg",
   :skos/prefLabel "Cartographer"})

(def ctr
  "A person or organization relevant to a resource, who enters into a contract with another person or organization to perform a specific task"
  {:db/ident :loc.relators/ctr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Contractor",
   :madsrdf/code "ctr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization relevant to a resource, who enters into a contract with another person or organization to perform a specific task"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ctr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ctr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization relevant to a resource, who enters into a contract with another person or organization to perform a specific task"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ctr",
   :skos/prefLabel "Contractor"})

(def cts
  "A person(s) or organization defending a claim, decision, result, etc. being opposed, resisted, or disputed in a court of law"
  {:db/ident :loc.relators/cts,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Contestee",
   :madsrdf/code "cts",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person(s) or organization defending a claim, decision, result, etc. being opposed, resisted, or disputed in a court of law"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/cte :loc.relators/ctt],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cts,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cts,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person(s) or organization defending a claim, decision, result, etc. being opposed, resisted, or disputed in a court of law"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/ctt :loc.relators/cte],
   :skos/notation "cts",
   :skos/prefLabel "Contestee"})

(def ctt
  "A contestee who takes an appeal from one court or jurisdiction to another to reverse the judgment"
  {:db/ident :loc.relators/ctt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Contestee-appellant",
   :madsrdf/code "ctt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A contestee who takes an appeal from one court or jurisdiction to another to reverse the judgment"},
   :madsrdf/hasBroaderAuthority :loc.relators/cts,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/cts,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ctt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ctt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A contestee who takes an appeal from one court or jurisdiction to another to reverse the judgment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ctt",
   :skos/prefLabel "Contestee-appellant"})

(def cur
  "A person, family, or organization conceiving, aggregating, and/or organizing an exhibition, collection, or other item"
  {:db/ident :loc.relators/cur,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Curator",
   :madsrdf/code "cur",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization conceiving, aggregating, and/or organizing an exhibition, collection, or other item"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/col :loc.relators/cor],
   :madsrdf/hasVariant {:madsrdf/variantLabel "Curator of an exhibition",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAItem
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAOther],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Curator of an exhibition",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cur,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cur,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization conceiving, aggregating, and/or organizing an exhibition, collection, or other item"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/col :loc.relators/cor],
   :skos/notation "cur",
   :skos/prefLabel "Curator",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Curator of an exhibition"}})

(def cwt
  "A person or organization responsible for the commentary or explanatory notes about a text. For the writer of manuscript annotations in a printed book, use Annotator"
  {:db/ident :loc.relators/cwt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Commentator for written text",
   :madsrdf/code "cwt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the commentary or explanatory notes about a text. For the writer of manuscript annotations in a printed book, use Annotator"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cwt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/cwt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the commentary or explanatory notes about a text. For the writer of manuscript annotations in a printed book, use Annotator"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "cwt",
   :skos/prefLabel "Commentator for written text"})

(def dbp
  "A place from which a resource, e.g., a serial, is distributed"
  {:db/ident :loc.relators/dbp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Distribution place",
   :madsrdf/code "dbp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A place from which a resource, e.g., a serial, is distributed"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dbp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dbp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A place from which a resource, e.g., a serial, is distributed"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dbp",
   :skos/prefLabel "Distribution place"})

(def dfd
  "A person or organization who is accused in a criminal proceeding or sued in a civil proceeding"
  {:db/ident :loc.relators/dfd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Defendant",
   :madsrdf/code "dfd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is accused in a criminal proceeding or sued in a civil proceeding"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/dfe :loc.relators/dft],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dfd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dfd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is accused in a criminal proceeding or sued in a civil proceeding"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/dfe :loc.relators/dft],
   :skos/notation "dfd",
   :skos/prefLabel "Defendant"})

(def dfe
  "A defendant against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in a legal action"
  {:db/ident :loc.relators/dfe,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Defendant-appellee",
   :madsrdf/code "dfe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A defendant against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in a legal action"},
   :madsrdf/hasBroaderAuthority :loc.relators/dfd,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/dfd,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dfe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dfe,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A defendant against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in a legal action"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dfe",
   :skos/prefLabel "Defendant-appellee"})

(def dft
  "A defendant who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in a legal action"
  {:db/ident :loc.relators/dft,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Defendant-appellant",
   :madsrdf/code "dft",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A defendant who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in a legal action"},
   :madsrdf/hasBroaderAuthority :loc.relators/dfd,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/dfd,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dft,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dft,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A defendant who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in a legal action"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dft",
   :skos/prefLabel "Defendant-appellant"})

(def dgg
  "A organization granting an academic degree"
  {:db/ident :loc.relators/dgg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Degree granting institution",
   :madsrdf/code "dgg",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A organization granting an academic degree"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Degree grantor",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/altLabel "Degree grantor",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dgg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dgg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A organization granting an academic degree"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dgg",
   :skos/prefLabel "Degree granting institution",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Degree grantor"}})

(def dgs
  "A person overseeing a higher level academic degree"
  {:db/ident :loc.relators/dgs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Degree supervisor",
   :madsrdf/code "dgs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person overseeing a higher level academic degree"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dgs,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dgs,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person overseeing a higher level academic degree"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dgs",
   :skos/prefLabel "Degree supervisor"})

(def dis
  "A person who presents a thesis for a university or higher-level educational degree"
  {:db/ident :loc.relators/dis,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Dissertant",
   :madsrdf/code "dis",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who presents a thesis for a university or higher-level educational degree"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dis,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dis,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who presents a thesis for a university or higher-level educational degree"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dis",
   :skos/prefLabel "Dissertant"})

(def dln
  "A person or organization executing technical drawings from others' designs"
  {:db/ident :loc.relators/dln,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Delineator",
   :madsrdf/code "dln",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization executing technical drawings from others' designs"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dln,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dln,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization executing technical drawings from others' designs"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dln",
   :skos/prefLabel "Delineator"})

(def dnc
  "A performer who dances in a musical, dramatic, etc., presentation"
  {:db/ident :loc.relators/dnc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Dancer",
   :madsrdf/code "dnc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer who dances in a musical, dramatic, etc., presentation"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dnc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dnc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer who dances in a musical, dramatic, etc., presentation"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dnc",
   :skos/prefLabel "Dancer"})

(def dnr
  "A former owner of an item who donated that item to another owner"
  {:db/ident :loc.relators/dnr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Donor",
   :madsrdf/code "dnr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A former owner of an item who donated that item to another owner"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/fmo,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAOwner
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAItem
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/broader :loc.relators/fmo,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dnr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dnr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A former owner of an item who donated that item to another owner"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dnr",
   :skos/prefLabel "Donor"})

(def dpc
  "An entity depicted or portrayed in a work, particularly in a work of art"
  {:db/ident :loc.relators/dpc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Depicted",
   :madsrdf/code "dpc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An entity depicted or portrayed in a work, particularly in a work of art"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Subject relationship"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/subject,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dpc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dpc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity depicted or portrayed in a work, particularly in a work of art"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Subject relationship"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dpc",
   :skos/prefLabel "Depicted"})

(def dpt
  "A current owner of an item who deposited the item into the custody of another person, family, or organization, while still retaining ownership"
  {:db/ident :loc.relators/dpt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Depositor",
   :madsrdf/code "dpt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A current owner of an item who deposited the item into the custody of another person, family, or organization, while still retaining ownership"},
   :madsrdf/hasBroaderAuthority :loc.relators/own,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAOwner
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAItem],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/broader :loc.relators/own,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dpt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dpt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A current owner of an item who deposited the item into the custody of another person, family, or organization, while still retaining ownership"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dpt",
   :skos/prefLabel "Depositor"})

(def drm
  "A person, family, or organization contributing to a resource by an architect, inventor, etc., by making detailed plans or drawings for buildings, ships, aircraft, machines, objects, etc"
  {:db/ident :loc.relators/drm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Draftsman",
   :madsrdf/code "drm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by an architect, inventor, etc., by making detailed plans or drawings for buildings, ships, aircraft, machines, objects, etc"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Technical draftsman",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAExpression],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Technical draftsman",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/drm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/drm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by an architect, inventor, etc., by making detailed plans or drawings for buildings, ships, aircraft, machines, objects, etc"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "drm",
   :skos/prefLabel "Draftsman",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Technical draftsman"}})

(def drt
  "A person responsible for the general management and supervision of a filmed performance, a radio or television program, etc."
  {:db/ident :loc.relators/drt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Director",
   :madsrdf/code "drt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person responsible for the general management and supervision of a filmed performance, a radio or television program, etc."},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasNarrowerAuthority
   [:loc.relators/fmk :loc.relators/fmd :loc.relators/rdd :loc.relators/tld],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/drt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/drt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person responsible for the general management and supervision of a filmed performance, a radio or television program, etc."},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower
   [:loc.relators/rdd :loc.relators/fmk :loc.relators/fmd :loc.relators/tld],
   :skos/notation "drt",
   :skos/prefLabel "Director"})

(def dsr
  "A person, family, or organization responsible for creating a design for an object"
  {:db/ident :loc.relators/dsr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Designer",
   :madsrdf/code "dsr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a design for an object"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDACreator
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dsr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dsr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a design for an object"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dsr",
   :skos/prefLabel "Designer"})

(def dst
  "A person or organization that has exclusive or shared marketing rights for a resource"
  {:db/ident :loc.relators/dst,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Distributor",
   :madsrdf/code "dst",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that has exclusive or shared marketing rights for a resource"},
   :madsrdf/hasBroaderAuthority :loc.relators/prv,
   :madsrdf/hasNarrowerAuthority :loc.relators/fds,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAManifestation],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/publisher,
   :skos/broader :loc.relators/prv,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dst,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dst,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that has exclusive or shared marketing rights for a resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower :loc.relators/fds,
   :skos/notation "dst",
   :skos/prefLabel "Distributor"})

(def dtc
  "A person or organization that submits data for inclusion in a database or other collection of data"
  {:db/ident :loc.relators/dtc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Data contributor",
   :madsrdf/code "dtc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that submits data for inclusion in a database or other collection of data"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dtc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dtc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that submits data for inclusion in a database or other collection of data"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dtc",
   :skos/prefLabel "Data contributor"})

(def dte
  "A person, family, or organization to whom a resource is dedicated"
  {:db/ident :loc.relators/dte,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Dedicatee",
   :madsrdf/code "dte",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization to whom a resource is dedicated"},
   :madsrdf/editorialNote
   [{:rdf/language "en",
     :rdf/value    "Combines RDA dedicatee (work) and dedicatee of item (item)"}
    {:rdf/language "en",
     :rdf/value    "Changed MARC def"}],
   :madsrdf/hasVariant {:madsrdf/variantLabel "Dedicatee of item",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAItem
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAOther],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/altLabel "Dedicatee of item",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dte,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dte,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization to whom a resource is dedicated"},
   :skos/editorial
   [{:rdf/language "en",
     :rdf/value    "Combines RDA dedicatee (work) and dedicatee of item (item)"}
    {:rdf/language "en",
     :rdf/value    "Changed MARC def"}],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dte",
   :skos/prefLabel "Dedicatee",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Dedicatee of item"}})

(def dtm
  "A person or organization responsible for managing databases or other data sources"
  {:db/ident :loc.relators/dtm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Data manager",
   :madsrdf/code "dtm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for managing databases or other data sources"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dtm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dtm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for managing databases or other data sources"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dtm",
   :skos/prefLabel "Data manager"})

(def dto
  "A person who writes a dedication, which may be a formal statement or in epistolary or verse form"
  {:db/ident :loc.relators/dto,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Dedicator",
   :madsrdf/code "dto",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who writes a dedication, which may be a formal statement or in epistolary or verse form"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dto,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dto,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who writes a dedication, which may be a formal statement or in epistolary or verse form"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dto",
   :skos/prefLabel "Dedicator"})

(def dub
  "A person or organization to which authorship has been dubiously or incorrectly ascribed"
  {:db/ident :loc.relators/dub,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Dubious author",
   :madsrdf/code "dub",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization to which authorship has been dubiously or incorrectly ascribed"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dub,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/dub,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization to which authorship has been dubiously or incorrectly ascribed"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "dub",
   :skos/prefLabel "Dubious author"})

(def edc
  "A person, family, or organization contributing to a collective or aggregate work by selecting and putting together works, or parts of works, by one or more creators. For compilations of data, information, etc., that result in new works, see compiler"
  {:db/ident :loc.relators/edc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Editor of compilation",
   :madsrdf/code "edc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a collective or aggregate work by selecting and putting together works, or parts of works, by one or more creators. For compilations of data, information, etc., that result in new works, see compiler"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/edc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/edc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a collective or aggregate work by selecting and putting together works, or parts of works, by one or more creators. For compilations of data, information, etc., that result in new works, see compiler"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "edc",
   :skos/prefLabel "Editor of compilation"})

(def edm
  "A person, family, or organization responsible for assembling, arranging, and trimming film, video, or other moving image formats, including both visual and audio aspects"
  {:db/ident :loc.relators/edm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Editor of moving image work",
   :madsrdf/code "edm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for assembling, arranging, and trimming film, video, or other moving image formats, including both visual and audio aspects"},
   :madsrdf/hasNarrowerAuthority :loc.relators/flm,
   :madsrdf/hasVariant {:madsrdf/variantLabel "Moving image work editor",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAExpression],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/altLabel "Moving image work editor",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/edm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/edm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for assembling, arranging, and trimming film, video, or other moving image formats, including both visual and audio aspects"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower :loc.relators/flm,
   :skos/notation "edm",
   :skos/prefLabel "Editor of moving image work",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Moving image work editor"}})

(def edt
  "A person, family, or organization contributing to a resource by revising or elucidating the content, e.g., adding an introduction, notes, or other critical matter. An editor may also prepare a resource for production, publication, or distribution. For major revisions, adaptations, etc., that substantially change the nature and content of the original work, resulting in a new work, see author"
  {:db/ident :loc.relators/edt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Editor",
   :madsrdf/code "edt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by revising or elucidating the content, e.g., adding an introduction, notes, or other critical matter. An editor may also prepare a resource for production, publication, or distribution. For major revisions, adaptations, etc., that substantially change the nature and content of the original work, resulting in a new work, see author"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/edt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/edt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by revising or elucidating the content, e.g., adding an introduction, notes, or other critical matter. An editor may also prepare a resource for production, publication, or distribution. For major revisions, adaptations, etc., that substantially change the nature and content of the original work, resulting in a new work, see author"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "edt",
   :skos/prefLabel "Editor"})

(def egr
  "A person or organization who cuts letters, figures, etc. on a surface, such as a wooden or metal plate used for printing"
  {:db/ident :loc.relators/egr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Engraver",
   :madsrdf/code "egr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who cuts letters, figures, etc. on a surface, such as a wooden or metal plate used for printing"},
   :madsrdf/hasNarrowerAuthority :loc.relators/mte,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAManufacturer
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAManifestation
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/egr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/egr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who cuts letters, figures, etc. on a surface, such as a wooden or metal plate used for printing"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower :loc.relators/mte,
   :skos/notation "egr",
   :skos/prefLabel "Engraver"})

(def elg
  "A person responsible for setting up a lighting rig and focusing the lights for a production, and running the lighting at a performance"
  {:db/ident :loc.relators/elg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Electrician",
   :madsrdf/code "elg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person responsible for setting up a lighting rig and focusing the lights for a production, and running the lighting at a performance"},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Master electrician",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Chief electrician",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "House electrician",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/altLabel
   ["House electrician" "Master electrician" "Chief electrician"],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/elg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/elg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person responsible for setting up a lighting rig and focusing the lights for a production, and running the lighting at a performance"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "elg",
   :skos/prefLabel "Electrician",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "House electrician"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Master electrician"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Chief electrician"}]})

(def elt
  "A person or organization who creates a duplicate printing surface by pressure molding and electrodepositing of metal that is then backed up with lead for printing"
  {:db/ident :loc.relators/elt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Electrotyper",
   :madsrdf/code "elt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who creates a duplicate printing surface by pressure molding and electrodepositing of metal that is then backed up with lead for printing"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/elt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/elt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who creates a duplicate printing surface by pressure molding and electrodepositing of metal that is then backed up with lead for printing"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "elt",
   :skos/prefLabel "Electrotyper"})

(def eng
  "A person or organization that is responsible for technical planning and design, particularly with construction"
  {:db/ident :loc.relators/eng,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Engineer",
   :madsrdf/code "eng",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that is responsible for technical planning and design, particularly with construction"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/eng,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/eng,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that is responsible for technical planning and design, particularly with construction"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "eng",
   :skos/prefLabel "Engineer"})

(def enj
  "A jurisdiction enacting a law, regulation, constitution, court rule, etc."
  {:db/ident :loc.relators/enj,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Enacting jurisdiction",
   :madsrdf/code "enj",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A jurisdiction enacting a law, regulation, constitution, court rule, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDACreator],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/enj,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/enj,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A jurisdiction enacting a law, regulation, constitution, court rule, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "enj",
   :skos/prefLabel "Enacting jurisdiction"})

(def etr
  "A person or organization who produces text or images for printing by subjecting metal, glass, or some other surface to acid or the corrosive action of some other substanc"
  {:db/ident :loc.relators/etr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Etcher",
   :madsrdf/code "etr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who produces text or images for printing by subjecting metal, glass, or some other surface to acid or the corrosive action of some other substanc"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAManufacturer
    :loc.relators/collection_RDAManifestation
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/etr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/etr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who produces text or images for printing by subjecting metal, glass, or some other surface to acid or the corrosive action of some other substanc"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "etr",
   :skos/prefLabel "Etcher"})

(def evp
  "A place where an event such as a conference or a concert took place"
  {:db/ident :loc.relators/evp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Event place",
   :madsrdf/code "evp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A place where an event such as a conference or a concert took place"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/evp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/evp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A place where an event such as a conference or a concert took place"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "evp",
   :skos/prefLabel "Event place"})

(def exp
  "A person or organization in charge of the description and appraisal of the value of goods, particularly rare items, works of art, etc."
  {:db/ident :loc.relators/exp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Expert",
   :madsrdf/code "exp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization in charge of the description and appraisal of the value of goods, particularly rare items, works of art, etc."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Appraiser",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/altLabel "Appraiser",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/exp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/exp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization in charge of the description and appraisal of the value of goods, particularly rare items, works of art, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "exp",
   :skos/prefLabel "Expert",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Appraiser"}})

(def fac
  "A person or organization that executed the facsimile"
  {:db/ident :loc.relators/fac,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Facsimilist",
   :madsrdf/code "fac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person or organization that executed the facsimile"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Copier",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Copier",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fac,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fac,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person or organization that executed the facsimile"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "fac",
   :skos/prefLabel "Facsimilist",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Copier"}})

(def fds
  "A person, family, or organization involved in distributing a moving image resource to theatres or other distribution channels"
  {:db/ident :loc.relators/fds,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Film distributor",
   :madsrdf/code "fds",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in distributing a moving image resource to theatres or other distribution channels"},
   :madsrdf/hasBroaderAuthority :loc.relators/dst,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDADistributor
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAManifestation
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/broader :loc.relators/dst,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fds,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fds,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in distributing a moving image resource to theatres or other distribution channels"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "fds",
   :skos/prefLabel "Film distributor"})

(def fld
  "A person or organization that manages or supervises the work done to collect raw data or do research in an actual setting or environment (typically applies to the natural and social sciences)"
  {:db/ident :loc.relators/fld,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Field director",
   :madsrdf/code "fld",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that manages or supervises the work done to collect raw data or do research in an actual setting or environment (typically applies to the natural and social sciences)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fld,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fld,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that manages or supervises the work done to collect raw data or do research in an actual setting or environment (typically applies to the natural and social sciences)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "fld",
   :skos/prefLabel "Field director"})

(def flm
  "A person who, following the script and in creative cooperation with the Director, selects, arranges, and assembles the filmed material, controls the synchronization of picture and sound, and participates in other post-production tasks such as sound mixing and visual effects processing. Today, picture editing is often performed digitally"
  {:db/ident :loc.relators/flm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Film editor",
   :madsrdf/code "flm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who, following the script and in creative cooperation with the Director, selects, arranges, and assembles the filmed material, controls the synchronization of picture and sound, and participates in other post-production tasks such as sound mixing and visual effects processing. Today, picture editing is often performed digitally"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def (FIAF)"},
   :madsrdf/hasBroaderAuthority :loc.relators/edm,
   :madsrdf/hasVariant {:madsrdf/variantLabel "Motion picture editor",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :madsrdf/sourceNote {:rdf/language "en",
                        :rdf/value    "FIAF"},
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Motion picture editor",
   :skos/broader :loc.relators/edm,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/flm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/flm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who, following the script and in creative cooperation with the Director, selects, arranges, and assembles the filmed material, controls the synchronization of picture and sound, and participates in other post-production tasks such as sound mixing and visual effects processing. Today, picture editing is often performed digitally"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "flm",
   :skos/prefLabel "Film editor",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Motion picture editor"}})

(def fmd
  "A director responsible for the general management and supervision of a filmed performance"
  {:db/ident :loc.relators/fmd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Film director",
   :madsrdf/code "fmd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A director responsible for the general management and supervision of a filmed performance"},
   :madsrdf/hasBroaderAuthority :loc.relators/drt,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/drt,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fmd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fmd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A director responsible for the general management and supervision of a filmed performance"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "fmd",
   :skos/prefLabel "Film director"})

(def fmk
  "A person, family or organization responsible for creating an independent or personal film. A filmmaker is individually responsible for the conception and execution of all aspects of the film"
  {:db/ident :loc.relators/fmk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Filmmaker",
   :madsrdf/code "fmk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family or organization responsible for creating an independent or personal film. A filmmaker is individually responsible for the conception and execution of all aspects of the film"},
   :madsrdf/hasBroaderAuthority :loc.relators/drt,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDACreator
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/drt,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fmk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fmk,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family or organization responsible for creating an independent or personal film. A filmmaker is individually responsible for the conception and execution of all aspects of the film"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "fmk",
   :skos/prefLabel "Filmmaker"})

(def fmo
  "A person, family, or organization formerly having legal possession of an item"
  {:db/ident :loc.relators/fmo,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Former owner",
   :madsrdf/code "fmo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization formerly having legal possession of an item"},
   :madsrdf/editorialNote
   [{:rdf/language "en",
     :rdf/value
     "in RDA associated with Owner (element) which is broader than MARC owner (which means current owner)"}
    {:rdf/language "en",
     :rdf/value    "Changed MARC def"}],
   :madsrdf/hasNarrowerAuthority [:loc.relators/dnr :loc.relators/sll],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAItem
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAOwner],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fmo,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fmo,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization formerly having legal possession of an item"},
   :skos/editorial
   [{:rdf/language "en",
     :rdf/value    "Changed MARC def"}
    {:rdf/language "en",
     :rdf/value
     "in RDA associated with Owner (element) which is broader than MARC owner (which means current owner)"}],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/dnr :loc.relators/sll],
   :skos/notation "fmo",
   :skos/prefLabel "Former owner"})

(def fmp
  "A producer responsible for most of the business aspects of a film"
  {:db/ident :loc.relators/fmp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Film producer",
   :madsrdf/code "fmp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A producer responsible for most of the business aspects of a film"},
   :madsrdf/hasBroaderAuthority :loc.relators/pro,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAOther
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/broader :loc.relators/pro,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fmp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fmp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A producer responsible for most of the business aspects of a film"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "fmp",
   :skos/prefLabel "Film producer"})

(def fnd
  "A person or organization that furnished financial support for the production of the work"
  {:db/ident :loc.relators/fnd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Funder",
   :madsrdf/code "fnd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that furnished financial support for the production of the work"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fnd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fnd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that furnished financial support for the production of the work"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "fnd",
   :skos/prefLabel "Funder"})

(def fpy
  "A person or organization who is identified as the only party or the party of the first party. In the case of transfer of rights, this is the assignor, transferor, licensor, grantor, etc. Multiple parties can be named jointly as the first party"
  {:db/ident :loc.relators/fpy,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "First party",
   :madsrdf/code "fpy",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is identified as the only party or the party of the first party. In the case of transfer of rights, this is the assignor, transferor, licensor, grantor, etc. Multiple parties can be named jointly as the first party"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fpy,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/fpy,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is identified as the only party or the party of the first party. In the case of transfer of rights, this is the assignor, transferor, licensor, grantor, etc. Multiple parties can be named jointly as the first party"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "fpy",
   :skos/prefLabel "First party"})

(def frg
  "A person or organization who makes or imitates something of value or importance, especially with the intent to defraud"
  {:db/ident :loc.relators/frg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Forger",
   :madsrdf/code "frg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes or imitates something of value or importance, especially with the intent to defraud"},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Copier",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Counterfeiter",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel ["Copier" "Counterfeiter"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/frg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/frg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes or imitates something of value or importance, especially with the intent to defraud"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "frg",
   :skos/prefLabel "Forger",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Counterfeiter"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Copier"}]})

(def gis
  "A person responsible for geographic information system (GIS) development and integration with global positioning system data"
  {:db/ident :loc.relators/gis,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Geographic information specialist",
   :madsrdf/code "gis",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person responsible for geographic information system (GIS) development and integration with global positioning system data"},
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Geospatial information specialist",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/altLabel "Geospatial information specialist",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/gis,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/gis,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person responsible for geographic information system (GIS) development and integration with global positioning system data"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "gis",
   :skos/prefLabel "Geographic information specialist",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Geospatial information specialist"}})

(def grt
  {:db/ident :loc.relators/grt,
   :madsrdf/code "grt",
   :madsrdf/deprecatedLabel "Graphic technician",
   :madsrdf/hasVariant {:madsrdf/variantLabel "Artist",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.relators/collection_PastPresentRelatorsEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type :madsrdf/DeprecatedAuthority})

(def his
  "An organization hosting the event, exhibit, conference, etc., which gave rise to a resource, but having little or no responsibility for the content of the resource"
  {:db/ident :loc.relators/his,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Host institution",
   :madsrdf/code "his",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An organization hosting the event, exhibit, conference, etc., which gave rise to a resource, but having little or no responsibility for the content of the resource"},
   :madsrdf/hasBroaderAuthority :loc.relators/hst,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/broader :loc.relators/hst,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/his,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/his,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An organization hosting the event, exhibit, conference, etc., which gave rise to a resource, but having little or no responsibility for the content of the resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "his",
   :skos/prefLabel "Host institution"})

(def hnr
  "A person, family, or organization honored by a work or item (e.g., the honoree of a festschrift, a person to whom a copy is presented)"
  {:db/ident :loc.relators/hnr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Honoree",
   :madsrdf/code "hnr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization honored by a work or item (e.g., the honoree of a festschrift, a person to whom a copy is presented)"},
   :madsrdf/editorialNote [{:rdf/language "en",
                            :rdf/value
                            "combines RDA honoree and honoree of item"}
                           {:rdf/language "en",
                            :rdf/value    "Changed MARC def"}],
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Honouree of item",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Honouree",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAItem
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDAWork
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/altLabel ["Honouree of item" "Honouree"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/hnr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/hnr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization honored by a work or item (e.g., the honoree of a festschrift, a person to whom a copy is presented)"},
   :skos/editorial [{:rdf/language "en",
                     :rdf/value    "combines RDA honoree and honoree of item"}
                    {:rdf/language "en",
                     :rdf/value    "Changed MARC def"}],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "hnr",
   :skos/prefLabel "Honoree",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Honouree"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Honouree of item"}]})

(def hst
  "A performer contributing to a resource by leading a program (often broadcast) that includes other guests, performers, etc. (e.g., talk show host)"
  {:db/ident :loc.relators/hst,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Host",
   :madsrdf/code "hst",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by leading a program (often broadcast) that includes other guests, performers, etc. (e.g., talk show host)"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/hasNarrowerAuthority :loc.relators/his,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/hst,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/hst,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by leading a program (often broadcast) that includes other guests, performers, etc. (e.g., talk show host)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower :loc.relators/his,
   :skos/notation "hst",
   :skos/prefLabel "Host"})

(def ill
  "A person, family, or organization contributing to a resource by supplementing the primary content with drawings, diagrams, photographs, etc. If the work is primarily the artistic content created by this entity, use artist or photographer"
  {:db/ident :loc.relators/ill,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Illustrator",
   :madsrdf/code "ill",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by supplementing the primary content with drawings, diagrams, photographs, etc. If the work is primarily the artistic content created by this entity, use artist or photographer"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ill,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ill,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by supplementing the primary content with drawings, diagrams, photographs, etc. If the work is primarily the artistic content created by this entity, use artist or photographer"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ill",
   :skos/prefLabel "Illustrator"})

(def ilu
  "A person providing decoration to a specific item using precious metals or color, often with elaborate designs and motifs"
  {:db/ident :loc.relators/ilu,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Illuminator",
   :madsrdf/code "ilu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person providing decoration to a specific item using precious metals or color, often with elaborate designs and motifs"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDAItem
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ilu,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ilu,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person providing decoration to a specific item using precious metals or color, often with elaborate designs and motifs"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ilu",
   :skos/prefLabel "Illuminator"})

(def ins
  "A person who has written a statement of dedication or gift"
  {:db/ident :loc.relators/ins,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Inscriber",
   :madsrdf/code "ins",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person who has written a statement of dedication or gift"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAOther
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ins,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ins,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A person who has written a statement of dedication or gift"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ins",
   :skos/prefLabel "Inscriber"})

(def inv
  "A person, family, or organization responsible for creating a new device or process"
  {:db/ident :loc.relators/inv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Inventor",
   :madsrdf/code "inv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a new device or process"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Patent inventor",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDACreator],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Patent inventor",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/inv,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/inv,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a new device or process"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "inv",
   :skos/prefLabel "Inventor",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Patent inventor"}})

(def isb
  "A person, family or organization issuing a work, such as an official organ of the body"
  {:db/ident :loc.relators/isb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Issuing body",
   :madsrdf/code "isb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family or organization issuing a work, such as an official organ of the body"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/isb,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/isb,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family or organization issuing a work, such as an official organ of the body"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "isb",
   :skos/prefLabel "Issuing body"})

(def itr
  "A performer contributing to a resource by playing a musical instrument"
  {:db/ident :loc.relators/itr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Instrumentalist",
   :madsrdf/code "itr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by playing a musical instrument"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAExpression],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/itr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/itr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by playing a musical instrument"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "itr",
   :skos/prefLabel "Instrumentalist"})

(def ive
  "A person, family or organization responsible for creating or contributing to a resource by responding to an interviewer, usually a reporter, pollster, or some other information gathering agent"
  {:db/ident :loc.relators/ive,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Interviewee",
   :madsrdf/code "ive",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family or organization responsible for creating or contributing to a resource by responding to an interviewer, usually a reporter, pollster, or some other information gathering agent"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDACreator
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ive,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ive,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family or organization responsible for creating or contributing to a resource by responding to an interviewer, usually a reporter, pollster, or some other information gathering agent"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ive",
   :skos/prefLabel "Interviewee"})

(def ivr
  "A person, family, or organization responsible for creating or contributing to a resource by acting as an interviewer, reporter, pollster, or some other information gathering agent"
  {:db/ident :loc.relators/ivr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Interviewer",
   :madsrdf/code "ivr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating or contributing to a resource by acting as an interviewer, reporter, pollster, or some other information gathering agent"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAWork
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDACreator
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ivr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ivr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating or contributing to a resource by acting as an interviewer, reporter, pollster, or some other information gathering agent"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ivr",
   :skos/prefLabel "Interviewer"})

(def jud
  "A person who hears and decides on legal matters in court"
  {:db/ident :loc.relators/jud,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Judge",
   :madsrdf/code "jud",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person who hears and decides on legal matters in court"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/jud,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/jud,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A person who hears and decides on legal matters in court"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "jud",
   :skos/prefLabel "Judge"})

(def jug
  "A jurisdiction governed by a law, regulation, etc., that was enacted by another jurisdiction"
  {:db/ident :loc.relators/jug,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Jurisdiction governed",
   :madsrdf/code "jug",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A jurisdiction governed by a law, regulation, etc., that was enacted by another jurisdiction"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAOther
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/jug,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/jug,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A jurisdiction governed by a law, regulation, etc., that was enacted by another jurisdiction"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "jug",
   :skos/prefLabel "Jurisdiction governed"})

(def lbr
  "An organization that provides scientific analyses of material samples"
  {:db/ident :loc.relators/lbr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Laboratory",
   :madsrdf/code "lbr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An organization that provides scientific analyses of material samples"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lbr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lbr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An organization that provides scientific analyses of material samples"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lbr",
   :skos/prefLabel "Laboratory"})

(def lbt
  "An author of a libretto of an opera or other stage work, or an oratorio"
  {:db/ident :loc.relators/lbt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Librettist",
   :madsrdf/code "lbt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An author of a libretto of an opera or other stage work, or an oratorio"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/aut,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDACreator],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/aut,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lbt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lbt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An author of a libretto of an opera or other stage work, or an oratorio"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lbt",
   :skos/prefLabel "Librettist"})

(def ldr
  "A person or organization that manages or supervises work done in a controlled setting or environment"
  {:db/ident :loc.relators/ldr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Laboratory director",
   :madsrdf/code "ldr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that manages or supervises work done in a controlled setting or environment"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Lab director",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/altLabel "Lab director",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ldr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ldr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that manages or supervises work done in a controlled setting or environment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ldr",
   :skos/prefLabel "Laboratory director",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Lab director"}})

(def led
  "A person or organization that takes primary responsibility for a particular activity or endeavor. May be combined with another relator term or code to show the greater importance this person or organization has regarding that particular role. If more than one relator is assigned to a heading, use the Lead relator only if it applies to all the relators"
  {:db/ident :loc.relators/led,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Lead",
   :madsrdf/code "led",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that takes primary responsibility for a particular activity or endeavor. May be combined with another relator term or code to show the greater importance this person or organization has regarding that particular role. If more than one relator is assigned to a heading, use the Lead relator only if it applies to all the relators"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/led,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/led,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that takes primary responsibility for a particular activity or endeavor. May be combined with another relator term or code to show the greater importance this person or organization has regarding that particular role. If more than one relator is assigned to a heading, use the Lead relator only if it applies to all the relators"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "led",
   :skos/prefLabel "Lead"})

(def lee
  "A libelee against whom an appeal is taken from one ecclesiastical court or admiralty to another to reverse the judgment"
  {:db/ident :loc.relators/lee,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Libelee-appellee",
   :madsrdf/code "lee",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A libelee against whom an appeal is taken from one ecclesiastical court or admiralty to another to reverse the judgment"},
   :madsrdf/hasBroaderAuthority :loc.relators/lel,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :loc.relators/lei,
   :skos/broader :loc.relators/lel,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lee,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lee,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A libelee against whom an appeal is taken from one ecclesiastical court or admiralty to another to reverse the judgment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lee",
   :skos/prefLabel "Libelee-appellee"})

(def lel
  "A person or organization against whom a libel has been filed in an ecclesiastical court or admiralty"
  {:db/ident :loc.relators/lel,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Libelee",
   :madsrdf/code "lel",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization against whom a libel has been filed in an ecclesiastical court or admiralty"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/lee :loc.relators/let],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lel,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lel,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization against whom a libel has been filed in an ecclesiastical court or admiralty"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/lee :loc.relators/let],
   :skos/notation "lel",
   :skos/prefLabel "Libelee"})

(def len
  "A person or organization permitting the temporary use of a book, manuscript, etc., such as for photocopying or microfilming"
  {:db/ident :loc.relators/len,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Lender",
   :madsrdf/code "len",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization permitting the temporary use of a book, manuscript, etc., such as for photocopying or microfilming"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/len,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/len,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization permitting the temporary use of a book, manuscript, etc., such as for photocopying or microfilming"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "len",
   :skos/prefLabel "Lender"})

(def let
  "A libelee who takes an appeal from one ecclesiastical court or admiralty to another to reverse the judgment"
  {:db/ident :loc.relators/let,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Libelee-appellant",
   :madsrdf/code "let",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A libelee who takes an appeal from one ecclesiastical court or admiralty to another to reverse the judgment"},
   :madsrdf/hasBroaderAuthority :loc.relators/lel,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/broader :loc.relators/lel,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/let,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/let,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A libelee who takes an appeal from one ecclesiastical court or admiralty to another to reverse the judgment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "let",
   :skos/prefLabel "Libelee-appellant"})

(def lgd
  "A person or organization who designs the lighting scheme for a theatrical presentation, entertainment, motion picture, etc."
  {:db/ident :loc.relators/lgd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Lighting designer",
   :madsrdf/code "lgd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who designs the lighting scheme for a theatrical presentation, entertainment, motion picture, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lgd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lgd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who designs the lighting scheme for a theatrical presentation, entertainment, motion picture, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lgd",
   :skos/prefLabel "Lighting designer"})

(def lie
  "A libelant against whom an appeal is taken from one ecclesiastical court or admiralty to another to reverse the judgment"
  {:db/ident :loc.relators/lie,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Libelant-appellee",
   :madsrdf/code "lie",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A libelant against whom an appeal is taken from one ecclesiastical court or admiralty to another to reverse the judgment"},
   :madsrdf/hasBroaderAuthority :loc.relators/lil,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/broader :loc.relators/lil,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lie,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lie,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A libelant against whom an appeal is taken from one ecclesiastical court or admiralty to another to reverse the judgment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lie",
   :skos/prefLabel "Libelant-appellee"})

(def lil
  "A person or organization who files a libel in an ecclesiastical or admiralty case"
  {:db/ident :loc.relators/lil,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Libelant",
   :madsrdf/code "lil",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who files a libel in an ecclesiastical or admiralty case"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/lie :loc.relators/lit],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lil,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lil,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who files a libel in an ecclesiastical or admiralty case"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/lie :loc.relators/lit],
   :skos/notation "lil",
   :skos/prefLabel "Libelant"})

(def lit
  "A libelant who takes an appeal from one ecclesiastical court or admiralty to another to reverse the judgment"
  {:db/ident :loc.relators/lit,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Libelant-appellant",
   :madsrdf/code "lit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A libelant who takes an appeal from one ecclesiastical court or admiralty to another to reverse the judgment"},
   :madsrdf/hasBroaderAuthority :loc.relators/lil,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/broader :loc.relators/lil,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lit,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lit,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A libelant who takes an appeal from one ecclesiastical court or admiralty to another to reverse the judgment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lit",
   :skos/prefLabel "Libelant-appellant"})

(def lsa
  "An architect responsible for creating landscape works. This work involves coordinating the arrangement of existing and proposed land features and structures"
  {:db/ident :loc.relators/lsa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Landscape architect",
   :madsrdf/code "lsa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An architect responsible for creating landscape works. This work involves coordinating the arrangement of existing and proposed land features and structures"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/arc,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDACreator
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/arc,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lsa,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lsa,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An architect responsible for creating landscape works. This work involves coordinating the arrangement of existing and proposed land features and structures"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lsa",
   :skos/prefLabel "Landscape architect"})

(def lse
  "A person or organization who is an original recipient of the right to print or publish"
  {:db/ident :loc.relators/lse,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Licensee",
   :madsrdf/code "lse",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is an original recipient of the right to print or publish"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lse,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lse,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is an original recipient of the right to print or publish"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lse",
   :skos/prefLabel "Licensee"})

(def lso
  "A person or organization who is a signer of the license, imprimatur, etc."
  {:db/ident :loc.relators/lso,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Licensor",
   :madsrdf/code "lso",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is a signer of the license, imprimatur, etc."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Imprimatur",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/altLabel "Imprimatur",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lso,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lso,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is a signer of the license, imprimatur, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lso",
   :skos/prefLabel "Licensor",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Imprimatur"}})

(def ltg
  "A person or organization who prepares the stone or plate for lithographic printing, including a graphic artist creating a design directly on the surface from which printing will be done."
  {:db/ident :loc.relators/ltg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Lithographer",
   :madsrdf/code "ltg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who prepares the stone or plate for lithographic printing, including a graphic artist creating a design directly on the surface from which printing will be done."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAManufacturer
    :loc.relators/collection_RDAManifestation
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ltg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ltg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who prepares the stone or plate for lithographic printing, including a graphic artist creating a design directly on the surface from which printing will be done."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ltg",
   :skos/prefLabel "Lithographer"})

(def lyr
  "An author of the words of a non-dramatic musical work (e.g. the text of a song), except for oratorios"
  {:db/ident :loc.relators/lyr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Lyricist",
   :madsrdf/code "lyr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An author of the words of a non-dramatic musical work (e.g. the text of a song), except for oratorios"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/aut,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/aut,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lyr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/lyr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An author of the words of a non-dramatic musical work (e.g. the text of a song), except for oratorios"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "lyr",
   :skos/prefLabel "Lyricist"})

(def mcp
  "A person who transcribes or copies musical notation"
  {:db/ident :loc.relators/mcp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Music copyist",
   :madsrdf/code "mcp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person who transcribes or copies musical notation"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mcp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mcp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who transcribes or copies musical notation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mcp",
   :skos/prefLabel "Music copyist"})

(def mdc
  "A person or organization primarily responsible for compiling and maintaining the original description of a metadata set (e.g., geospatial metadata set)"
  {:db/ident :loc.relators/mdc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Metadata contact",
   :madsrdf/code "mdc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization primarily responsible for compiling and maintaining the original description of a metadata set (e.g., geospatial metadata set)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mdc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mdc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization primarily responsible for compiling and maintaining the original description of a metadata set (e.g., geospatial metadata set)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mdc",
   :skos/prefLabel "Metadata contact"})

(def med
  "A person held to be a channel of communication between the earthly world and a world of spirits"
  {:db/ident :loc.relators/med,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Medium",
   :madsrdf/code "med",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person held to be a channel of communication between the earthly world and a world of spirits"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/med,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/med,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person held to be a channel of communication between the earthly world and a world of spirits"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "med",
   :skos/prefLabel "Medium"})

(def mfp
  "The place of manufacture (e.g., printing, duplicating, casting, etc.) of a resource in a published form"
  {:db/ident :loc.relators/mfp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Manufacture place",
   :madsrdf/code "mfp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The place of manufacture (e.g., printing, duplicating, casting, etc.) of a resource in a published form"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mfp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mfp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The place of manufacture (e.g., printing, duplicating, casting, etc.) of a resource in a published form"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mfp",
   :skos/prefLabel "Manufacture place"})

(def mfr
  "A person or organization responsible for printing, duplicating, casting, etc. a resource"
  {:db/ident :loc.relators/mfr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Manufacturer",
   :madsrdf/code "mfr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for printing, duplicating, casting, etc. a resource"},
   :madsrdf/hasBroaderAuthority :loc.relators/prv,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prv,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mfr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mfr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for printing, duplicating, casting, etc. a resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mfr",
   :skos/prefLabel "Manufacturer"})

(def mod
  "A performer contributing to a resource by leading a program (often broadcast) where topics are discussed, usually with participation of experts in fields related to the discussion"
  {:db/ident :loc.relators/mod,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Moderator",
   :madsrdf/code "mod",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by leading a program (often broadcast) where topics are discussed, usually with participation of experts in fields related to the discussion"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mod,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mod,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by leading a program (often broadcast) where topics are discussed, usually with participation of experts in fields related to the discussion"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mod",
   :skos/prefLabel "Moderator"})

(def mon
  "A person or organization that supervises compliance with the contract and is responsible for the report and controls its distribution. Sometimes referred to as the grantee, or controlling agency"
  {:db/ident :loc.relators/mon,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Monitor",
   :madsrdf/code "mon",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that supervises compliance with the contract and is responsible for the report and controls its distribution. Sometimes referred to as the grantee, or controlling agency"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mon,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mon,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that supervises compliance with the contract and is responsible for the report and controls its distribution. Sometimes referred to as the grantee, or controlling agency"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mon",
   :skos/prefLabel "Monitor"})

(def mrb
  "The entity responsible for marbling paper, cloth, leather, etc. used in construction of a resource"
  {:db/ident :loc.relators/mrb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Marbler",
   :madsrdf/code "mrb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The entity responsible for marbling paper, cloth, leather, etc. used in construction of a resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mrb,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mrb,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The entity responsible for marbling paper, cloth, leather, etc. used in construction of a resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mrb",
   :skos/prefLabel "Marbler"})

(def mrk
  "A person or organization performing the coding of SGML, HTML, or XML markup of metadata, text, etc."
  {:db/ident :loc.relators/mrk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Markup editor",
   :madsrdf/code "mrk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization performing the coding of SGML, HTML, or XML markup of metadata, text, etc."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Encoder",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/altLabel "Encoder",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mrk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mrk,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization performing the coding of SGML, HTML, or XML markup of metadata, text, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mrk",
   :skos/prefLabel "Markup editor",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Encoder"}})

(def msd
  "A person who coordinates the activities of the composer, the sound editor, and sound mixers for a moving image production or for a musical or dramatic presentation or entertainment"
  {:db/ident :loc.relators/msd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Musical director",
   :madsrdf/code "msd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who coordinates the activities of the composer, the sound editor, and sound mixers for a moving image production or for a musical or dramatic presentation or entertainment"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/msd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/msd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who coordinates the activities of the composer, the sound editor, and sound mixers for a moving image production or for a musical or dramatic presentation or entertainment"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "msd",
   :skos/prefLabel "Musical director"})

(def mte
  "An engraver responsible for decorations, illustrations, letters, etc. cut on a metal surface for printing or decoration"
  {:db/ident :loc.relators/mte,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Metal engraver",
   :madsrdf/code "mte",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An engraver responsible for decorations, illustrations, letters, etc. cut on a metal surface for printing or decoration"},
   :madsrdf/hasBroaderAuthority :loc.relators/egr,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/egr,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mte,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mte,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An engraver responsible for decorations, illustrations, letters, etc. cut on a metal surface for printing or decoration"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mte",
   :skos/prefLabel "Metal engraver"})

(def mtk
  "A person, family, or organization responsible for recording the minutes of a meeting"
  {:db/ident :loc.relators/mtk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Minute taker",
   :madsrdf/code "mtk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for recording the minutes of a meeting"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mtk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mtk,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for recording the minutes of a meeting"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mtk",
   :skos/prefLabel "Minute taker"})

(def mus
  "A person or organization who performs music or contributes to the musical content of a work when it is not possible or desirable to identify the function more precisely"
  {:db/ident :loc.relators/mus,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Musician",
   :madsrdf/code "mus",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who performs music or contributes to the musical content of a work when it is not possible or desirable to identify the function more precisely"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mus,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/mus,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who performs music or contributes to the musical content of a work when it is not possible or desirable to identify the function more precisely"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "mus",
   :skos/prefLabel "Musician"})

(def nrt
  "A performer contributing to a resource by reading or speaking in order to give an account of an act, occurrence, course of events, etc."
  {:db/ident :loc.relators/nrt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Narrator",
   :madsrdf/code "nrt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by reading or speaking in order to give an account of an act, occurrence, course of events, etc."},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/nrt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/nrt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by reading or speaking in order to give an account of an act, occurrence, course of events, etc."},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "nrt",
   :skos/prefLabel "Narrator"})

(def opn
  "A person or organization responsible for opposing a thesis or dissertation"
  {:db/ident :loc.relators/opn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Opponent",
   :madsrdf/code "opn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for opposing a thesis or dissertation"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/opn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/opn,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for opposing a thesis or dissertation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "opn",
   :skos/prefLabel "Opponent"})

(def org
  "A person or organization performing the work, i.e., the name of a person or organization associated with the intellectual content of the work. This category does not include the publisher or personal affiliation, or sponsor except where it is also the corporate author"
  {:db/ident :loc.relators/org,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Originator",
   :madsrdf/code "org",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization performing the work, i.e., the name of a person or organization associated with the intellectual content of the work. This category does not include the publisher or personal affiliation, or sponsor except where it is also the corporate author"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/org,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/org,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization performing the work, i.e., the name of a person or organization associated with the intellectual content of the work. This category does not include the publisher or personal affiliation, or sponsor except where it is also the corporate author"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "org",
   :skos/prefLabel "Originator"})

(def orm
  "A person, family, or organization organizing the exhibit, event, conference, etc., which gave rise to a resource"
  {:db/ident :loc.relators/orm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Organizer",
   :madsrdf/code "orm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization organizing the exhibit, event, conference, etc., which gave rise to a resource"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "changed MARC term and def"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Organizer of meeting",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAWork
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Organizer of meeting",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/orm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/orm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization organizing the exhibit, event, conference, etc., which gave rise to a resource"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "changed MARC term and def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "orm",
   :skos/prefLabel "Organizer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Organizer of meeting"}})

(def osp
  "A performer contributing to an expression of a work by appearing on screen in nonfiction moving image materials or introductions to fiction moving image materials to provide contextual or background information. Use when another term (e.g., narrator, host) is either not applicable or not desired"
  {:db/ident :loc.relators/osp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Onscreen presenter",
   :madsrdf/code "osp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to an expression of a work by appearing on screen in nonfiction moving image materials or introductions to fiction moving image materials to provide contextual or background information. Use when another term (e.g., narrator, host) is either not applicable or not desired"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAContributor],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/osp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/osp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to an expression of a work by appearing on screen in nonfiction moving image materials or introductions to fiction moving image materials to provide contextual or background information. Use when another term (e.g., narrator, host) is either not applicable or not desired"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "osp",
   :skos/prefLabel "Onscreen presenter"})

(def oth
  "A role that has no equivalent in the MARC list"
  {:db/ident :loc.relators/oth,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Other",
   :madsrdf/code "oth",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A role that has no equivalent in the MARC list"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/oth,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/oth,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A role that has no equivalent in the MARC list"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "oth",
   :skos/prefLabel "Other"})

(def own
  "A person, family, or organization that currently owns an item or collection, i.e.has legal possession of a resource"
  {:db/ident :loc.relators/own,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Owner",
   :madsrdf/code "own",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization that currently owns an item or collection, i.e.has legal possession of a resource"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Combined defs"},
   :madsrdf/hasNarrowerAuthority :loc.relators/dpt,
   :madsrdf/hasVariant {:madsrdf/variantLabel "Current owner",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAOwner
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAItem
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/altLabel "Current owner",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/own,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/own,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization that currently owns an item or collection, i.e.has legal possession of a resource"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Combined defs"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower :loc.relators/dpt,
   :skos/notation "own",
   :skos/prefLabel "Owner",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Current owner"}})

(def pan
  "A performer contributing to a resource by participating in a program (often broadcast) where topics are discussed, usually with participation of experts in fields related to the discussion"
  {:db/ident :loc.relators/pan,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Panelist",
   :madsrdf/code "pan",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by participating in a program (often broadcast) where topics are discussed, usually with participation of experts in fields related to the discussion"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAExpression],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pan,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pan,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by participating in a program (often broadcast) where topics are discussed, usually with participation of experts in fields related to the discussion"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pan",
   :skos/prefLabel "Panelist"})

(def pat
  "A person or organization responsible for commissioning a work. Usually a patron uses his or her means or influence to support the work of artists, writers, etc. This includes those who commission and pay for individual works"
  {:db/ident :loc.relators/pat,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Patron",
   :madsrdf/code "pat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for commissioning a work. Usually a patron uses his or her means or influence to support the work of artists, writers, etc. This includes those who commission and pay for individual works"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pat,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pat,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for commissioning a work. Usually a patron uses his or her means or influence to support the work of artists, writers, etc. This includes those who commission and pay for individual works"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pat",
   :skos/prefLabel "Patron"})

(def pbd
  "A person or organization who presides over the elaboration of a collective work to ensure its coherence or continuity. This includes editors-in-chief, literary editors, editors of series, etc."
  {:db/ident :loc.relators/pbd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Publisher director",
   :madsrdf/code "pbd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who presides over the elaboration of a collective work to ensure its coherence or continuity. This includes editors-in-chief, literary editors, editors of series, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pbd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pbd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who presides over the elaboration of a collective work to ensure its coherence or continuity. This includes editors-in-chief, literary editors, editors of series, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pbd",
   :skos/prefLabel "Publisher director"})

(def pbl
  "A person or organization responsible for publishing, releasing, or issuing a resource"
  {:db/ident :loc.relators/pbl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Publisher",
   :madsrdf/code "pbl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for publishing, releasing, or issuing a resource"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prv,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/publisher,
   :skos/broader :loc.relators/prv,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pbl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pbl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for publishing, releasing, or issuing a resource"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pbl",
   :skos/prefLabel "Publisher"})

(def pdr
  "A person or organization with primary responsibility for all essential aspects of a project, has overall responsibility for managing projects, or provides overall direction to a project manager"
  {:db/ident :loc.relators/pdr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Project director",
   :madsrdf/code "pdr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization with primary responsibility for all essential aspects of a project, has overall responsibility for managing projects, or provides overall direction to a project manager"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pdr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pdr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization with primary responsibility for all essential aspects of a project, has overall responsibility for managing projects, or provides overall direction to a project manager"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pdr",
   :skos/prefLabel "Project director"})

(def pfr
  "A person who corrects printed matter. For manuscripts, use corrector [crr]"
  {:db/ident :loc.relators/pfr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Proofreader",
   :madsrdf/code "pfr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who corrects printed matter. For manuscripts, use corrector [crr]"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pfr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pfr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who corrects printed matter. For manuscripts, use corrector [crr]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pfr",
   :skos/prefLabel "Proofreader"})

(def pht
  "A person, family, or organization responsible for creating a photographic work"
  {:db/ident :loc.relators/pht,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Photographer",
   :madsrdf/code "pht",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a photographic work"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDACreator
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pht,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pht,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a photographic work"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pht",
   :skos/prefLabel "Photographer"})

(def plt
  "A person, family, or organization involved in manufacturing a manifestation by preparing plates used in the production of printed images and/or text"
  {:db/ident :loc.relators/plt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Platemaker",
   :madsrdf/code "plt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a manifestation by preparing plates used in the production of printed images and/or text"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAManufacturer
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAManifestation
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/plt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/plt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a manifestation by preparing plates used in the production of printed images and/or text"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "plt",
   :skos/prefLabel "Platemaker"})

(def pma
  "An organization (usually a government agency) that issues permits under which work is accomplished"
  {:db/ident :loc.relators/pma,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Permitting agency",
   :madsrdf/code "pma",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An organization (usually a government agency) that issues permits under which work is accomplished"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pma,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pma,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An organization (usually a government agency) that issues permits under which work is accomplished"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pma",
   :skos/prefLabel "Permitting agency"})

(def pmn
  "A person responsible for all technical and business matters in a production"
  {:db/ident :loc.relators/pmn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Production manager",
   :madsrdf/code "pmn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person responsible for all technical and business matters in a production"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pmn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pmn,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person responsible for all technical and business matters in a production"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pmn",
   :skos/prefLabel "Production manager"})

(def pop
  "A person or organization who prints illustrations from plates"
  {:db/ident :loc.relators/pop,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Printer of plates",
   :madsrdf/code "pop",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A person or organization who prints illustrations from plates"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Plates, printer of",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/altLabel "Plates, printer of",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pop,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pop,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A person or organization who prints illustrations from plates"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pop",
   :skos/prefLabel "Printer of plates",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Plates, printer of"}})

(def ppm
  "A person or organization responsible for the production of paper, usually from wood, cloth, or other fibrous material"
  {:db/ident :loc.relators/ppm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Papermaker",
   :madsrdf/code "ppm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the production of paper, usually from wood, cloth, or other fibrous material"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ppm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ppm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the production of paper, usually from wood, cloth, or other fibrous material"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ppm",
   :skos/prefLabel "Papermaker"})

(def ppt
  "A performer contributing to a resource by manipulating, controlling, or directing puppets or marionettes in a moving image production or a musical or dramatic presentation or entertainment"
  {:db/ident :loc.relators/ppt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Puppeteer",
   :madsrdf/code "ppt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by manipulating, controlling, or directing puppets or marionettes in a moving image production or a musical or dramatic presentation or entertainment"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAExpression
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ppt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ppt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by manipulating, controlling, or directing puppets or marionettes in a moving image production or a musical or dramatic presentation or entertainment"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ppt",
   :skos/prefLabel "Puppeteer"})

(def pra
  "A person who is the faculty moderator of an academic disputation, normally proposing a thesis and participating in the ensuing disputation"
  {:db/ident :loc.relators/pra,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Praeses",
   :madsrdf/code "pra",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who is the faculty moderator of an academic disputation, normally proposing a thesis and participating in the ensuing disputation"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDACreator
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pra,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pra,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who is the faculty moderator of an academic disputation, normally proposing a thesis and participating in the ensuing disputation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pra",
   :skos/prefLabel "Praeses"})

(def prc
  "A person or organization primarily responsible for performing or initiating a process, such as is done with the collection of metadata sets"
  {:db/ident :loc.relators/prc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Process contact",
   :madsrdf/code "prc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization primarily responsible for performing or initiating a process, such as is done with the collection of metadata sets"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization primarily responsible for performing or initiating a process, such as is done with the collection of metadata sets"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "prc",
   :skos/prefLabel "Process contact"})

(def prd
  "A person or organization associated with the production (props, lighting, special effects, etc.) of a musical or dramatic presentation or entertainment"
  {:db/ident :loc.relators/prd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Production personnel",
   :madsrdf/code "prd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization associated with the production (props, lighting, special effects, etc.) of a musical or dramatic presentation or entertainment"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization associated with the production (props, lighting, special effects, etc.) of a musical or dramatic presentation or entertainment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "prd",
   :skos/prefLabel "Production personnel"})

(def pre
  "A person or organization mentioned in an \"X presents\" credit for moving image materials and who is associated with production, finance, or distribution in some way. A vanity credit; in early years, normally the head of a studio"
  {:db/ident :loc.relators/pre,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Presenter",
   :madsrdf/code "pre",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization mentioned in an \"X presents\" credit for moving image materials and who is associated with production, finance, or distribution in some way. A vanity credit; in early years, normally the head of a studio"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "includes one sentence from FIAF def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAExpression],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pre,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pre,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization mentioned in an \"X presents\" credit for moving image materials and who is associated with production, finance, or distribution in some way. A vanity credit; in early years, normally the head of a studio"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "includes one sentence from FIAF def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pre",
   :skos/prefLabel "Presenter"})

(def prf
  "A person contributing to a resource by performing music, acting, dancing, speaking, etc., often in a musical or dramatic presentation, etc. If specific codes are used, [prf] is used for a person whose principal skill is not known or specified"
  {:db/ident :loc.relators/prf,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Performer",
   :madsrdf/code "prf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person contributing to a resource by performing music, acting, dancing, speaking, etc., often in a musical or dramatic presentation, etc. If specific codes are used, [prf] is used for a person whose principal skill is not known or specified"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/ppt
                                  :loc.relators/act
                                  :loc.relators/pan
                                  :loc.relators/cnd
                                  :loc.relators/nrt
                                  :loc.relators/spk
                                  :loc.relators/sng
                                  :loc.relators/stl
                                  :loc.relators/cmm
                                  :loc.relators/osp
                                  :loc.relators/tch
                                  :loc.relators/mod
                                  :loc.relators/itr
                                  :loc.relators/dnc
                                  :loc.relators/hst],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAExpression
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prf,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prf,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person contributing to a resource by performing music, acting, dancing, speaking, etc., often in a musical or dramatic presentation, etc. If specific codes are used, [prf] is used for a person whose principal skill is not known or specified"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/spk
                   :loc.relators/stl
                   :loc.relators/nrt
                   :loc.relators/itr
                   :loc.relators/ppt
                   :loc.relators/mod
                   :loc.relators/pan
                   :loc.relators/act
                   :loc.relators/hst
                   :loc.relators/cnd
                   :loc.relators/cmm
                   :loc.relators/tch
                   :loc.relators/osp
                   :loc.relators/sng
                   :loc.relators/dnc],
   :skos/notation "prf",
   :skos/prefLabel "Performer"})

(def prg
  "A person, family, or organization responsible for creating a computer program"
  {:db/ident :loc.relators/prg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Programmer",
   :madsrdf/code "prg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a computer program"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDACreator],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for creating a computer program"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "prg",
   :skos/prefLabel "Programmer"})

(def prm
  "A person or organization who makes a relief, intaglio, or planographic printing surface"
  {:db/ident :loc.relators/prm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Printmaker",
   :madsrdf/code "prm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes a relief, intaglio, or planographic printing surface"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAManufacturer
    :loc.relators/collection_RDAManifestation],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes a relief, intaglio, or planographic printing surface"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "prm",
   :skos/prefLabel "Printmaker"})

(def prn
  "An organization that is responsible for financial, technical, and organizational management of a production for stage, screen, audio recording, television, webcast, etc."
  {:db/ident :loc.relators/prn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Production company",
   :madsrdf/code "prn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An organization that is responsible for financial, technical, and organizational management of a production for stage, screen, audio recording, television, webcast, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAOther
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prn,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An organization that is responsible for financial, technical, and organizational management of a production for stage, screen, audio recording, television, webcast, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "prn",
   :skos/prefLabel "Production company"})

(def pro
  "A person, family, or organization responsible for most of the business aspects of a production for screen, audio recording, television, webcast, etc. The producer is generally responsible for fund raising, managing the production, hiring key personnel, arranging for distributors, etc."
  {:db/ident :loc.relators/pro,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Producer",
   :madsrdf/code "pro",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for most of the business aspects of a production for screen, audio recording, television, webcast, etc. The producer is generally responsible for fund raising, managing the production, hiring key personnel, arranging for distributors, etc."},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prv,
   :madsrdf/hasNarrowerAuthority
   [:loc.relators/fmp :loc.relators/tlp :loc.relators/rpc],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prv,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pro,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pro,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for most of the business aspects of a production for screen, audio recording, television, webcast, etc. The producer is generally responsible for fund raising, managing the production, hiring key personnel, arranging for distributors, etc."},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/fmp :loc.relators/tlp :loc.relators/rpc],
   :skos/notation "pro",
   :skos/prefLabel "Producer"})

(def prp
  "The place of production (e.g., inscription, fabrication, construction, etc.) of a resource in an unpublished form"
  {:db/ident :loc.relators/prp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Production place",
   :madsrdf/code "prp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The place of production (e.g., inscription, fabrication, construction, etc.) of a resource in an unpublished form"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The place of production (e.g., inscription, fabrication, construction, etc.) of a resource in an unpublished form"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "prp",
   :skos/prefLabel "Production place"})

(def prs
  "A person or organization responsible for designing the overall visual appearance of a moving image production"
  {:db/ident :loc.relators/prs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Production designer",
   :madsrdf/code "prs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for designing the overall visual appearance of a moving image production"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAOther
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prs,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prs,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for designing the overall visual appearance of a moving image production"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "prs",
   :skos/prefLabel "Production designer"})

(def prt
  "A person, family, or organization involved in manufacturing a manifestation of printed text, notated music, etc., from type or plates, such as a book, newspaper, magazine, broadside, score, etc."
  {:db/ident :loc.relators/prt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Printer",
   :madsrdf/code "prt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a manifestation of printed text, notated music, etc., from type or plates, such as a book, newspaper, magazine, broadside, score, etc."},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAManufacturer
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAManifestation
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization involved in manufacturing a manifestation of printed text, notated music, etc., from type or plates, such as a book, newspaper, magazine, broadside, score, etc."},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "prt",
   :skos/prefLabel "Printer"})

(def prv
  "A person or organization who produces, publishes, manufactures, or distributes a resource if specific codes are not desired (e.g. [mfr], [pbl])"
  {:db/ident :loc.relators/prv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Provider",
   :madsrdf/code "prv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who produces, publishes, manufactures, or distributes a resource if specific codes are not desired (e.g. [mfr], [pbl])"},
   :madsrdf/hasNarrowerAuthority
   [:loc.relators/dst :loc.relators/mfr :loc.relators/pbl :loc.relators/pro],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prv,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/prv,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who produces, publishes, manufactures, or distributes a resource if specific codes are not desired (e.g. [mfr], [pbl])"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower
   [:loc.relators/pbl :loc.relators/mfr :loc.relators/dst :loc.relators/pro],
   :skos/notation "prv",
   :skos/prefLabel "Provider"})

(def pta
  "A person or organization that applied for a patent"
  {:db/ident :loc.relators/pta,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Patent applicant",
   :madsrdf/code "pta",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person or organization that applied for a patent"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pta,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pta,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person or organization that applied for a patent"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pta",
   :skos/prefLabel "Patent applicant"})

(def pte
  "A plaintiff against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in a legal proceeding"
  {:db/ident :loc.relators/pte,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Plaintiff-appellee",
   :madsrdf/code "pte",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A plaintiff against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in a legal proceeding"},
   :madsrdf/hasBroaderAuthority :loc.relators/ptf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/broader :loc.relators/ptf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pte,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pte,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A plaintiff against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in a legal proceeding"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pte",
   :skos/prefLabel "Plaintiff-appellee"})

(def ptf
  "A person or organization who brings a suit in a civil proceeding"
  {:db/ident :loc.relators/ptf,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Plaintiff",
   :madsrdf/code "ptf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who brings a suit in a civil proceeding"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/pte :loc.relators/ptt],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ptf,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ptf,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who brings a suit in a civil proceeding"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/ptt :loc.relators/pte],
   :skos/notation "ptf",
   :skos/prefLabel "Plaintiff"})

(def pth
  "A person or organization that was granted the patent referred to by the item"
  {:db/ident :loc.relators/pth,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Patent holder",
   :madsrdf/code "pth",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that was granted the patent referred to by the item"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Patentee",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/altLabel "Patentee",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pth,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pth,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that was granted the patent referred to by the item"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pth",
   :skos/prefLabel "Patent holder",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Patentee"}})

(def ptt
  "A plaintiff who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in a legal proceeding"
  {:db/ident :loc.relators/ptt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Plaintiff-appellant",
   :madsrdf/code "ptt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A plaintiff who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in a legal proceeding"},
   :madsrdf/hasBroaderAuthority :loc.relators/ptf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/broader :loc.relators/ptf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ptt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ptt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A plaintiff who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in a legal proceeding"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ptt",
   :skos/prefLabel "Plaintiff-appellant"})

(def pup
  "The place where a resource is published"
  {:db/ident :loc.relators/pup,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Publication place",
   :madsrdf/code "pup",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The place where a resource is published"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pup,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/pup,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The place where a resource is published"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "pup",
   :skos/prefLabel "Publication place"})

(def rbr
  "A person or organization responsible for parts of a work, often headings or opening parts of a manuscript, that appear in a distinctive color, usually red"
  {:db/ident :loc.relators/rbr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Rubricator",
   :madsrdf/code "rbr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for parts of a work, often headings or opening parts of a manuscript, that appear in a distinctive color, usually red"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rbr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rbr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for parts of a work, often headings or opening parts of a manuscript, that appear in a distinctive color, usually red"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rbr",
   :skos/prefLabel "Rubricator"})

(def rcd
  "A person or organization who uses a recording device to capture sounds and/or video during a recording session, including field recordings of natural sounds, folkloric events, music, etc."
  {:db/ident :loc.relators/rcd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Recordist",
   :madsrdf/code "rcd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who uses a recording device to capture sounds and/or video during a recording session, including field recordings of natural sounds, folkloric events, music, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAExpression
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rcd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rcd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who uses a recording device to capture sounds and/or video during a recording session, including field recordings of natural sounds, folkloric events, music, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rcd",
   :skos/prefLabel "Recordist"})

(def rce
  "A person contributing to a resource by supervising the technical aspects of a sound or video recording session"
  {:db/ident :loc.relators/rce,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Recording engineer",
   :madsrdf/code "rce",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person contributing to a resource by supervising the technical aspects of a sound or video recording session"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rce,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rce,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person contributing to a resource by supervising the technical aspects of a sound or video recording session"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rce",
   :skos/prefLabel "Recording engineer"})

(def rcp
  "A person, family, or organization to whom the correspondence in a work is addressed"
  {:db/ident :loc.relators/rcp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Addressee",
   :madsrdf/code "rcp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization to whom the correspondence in a work is addressed"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "changed MARC term and def"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Recipient",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/altLabel "Recipient",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rcp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rcp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization to whom the correspondence in a work is addressed"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "changed MARC term and def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rcp",
   :skos/prefLabel "Addressee",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Recipient"}})

(def rdd
  "A director responsible for the general management and supervision of a radio program"
  {:db/ident :loc.relators/rdd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Radio director",
   :madsrdf/code "rdd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A director responsible for the general management and supervision of a radio program"},
   :madsrdf/hasBroaderAuthority :loc.relators/drt,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/drt,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rdd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rdd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A director responsible for the general management and supervision of a radio program"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rdd",
   :skos/prefLabel "Radio director"})

(def red
  "A person or organization who writes or develops the framework for an item without being intellectually responsible for its content"
  {:db/ident :loc.relators/red,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Redaktor",
   :madsrdf/code "red",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who writes or develops the framework for an item without being intellectually responsible for its content"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/red,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/red,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who writes or develops the framework for an item without being intellectually responsible for its content"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "red",
   :skos/prefLabel "Redaktor"})

(def ren
  "A person or organization who prepares drawings of architectural designs (i.e., renderings) in accurate, representational perspective to show what the project will look like when completed"
  {:db/ident :loc.relators/ren,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Renderer",
   :madsrdf/code "ren",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who prepares drawings of architectural designs (i.e., renderings) in accurate, representational perspective to show what the project will look like when completed"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ren,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ren,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who prepares drawings of architectural designs (i.e., renderings) in accurate, representational perspective to show what the project will look like when completed"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ren",
   :skos/prefLabel "Renderer"})

(def res
  "A person or organization responsible for performing research"
  {:db/ident :loc.relators/res,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Researcher",
   :madsrdf/code "res",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A person or organization responsible for performing research"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Performer of research",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Performer of research",
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/res,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/res,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A person or organization responsible for performing research"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "res",
   :skos/prefLabel "Researcher",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Performer of research"}})

(def rev
  "A person or organization responsible for the review of a book, motion picture, performance, etc."
  {:db/ident :loc.relators/rev,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Reviewer",
   :madsrdf/code "rev",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the review of a book, motion picture, performance, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rev,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rev,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization responsible for the review of a book, motion picture, performance, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rev",
   :skos/prefLabel "Reviewer"})

(def rpc
  "A producer responsible for most of the business aspects of a radio program"
  {:db/ident :loc.relators/rpc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Radio producer",
   :madsrdf/code "rpc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A producer responsible for most of the business aspects of a radio program"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/pro,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/broader :loc.relators/pro,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rpc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rpc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A producer responsible for most of the business aspects of a radio program"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rpc",
   :skos/prefLabel "Radio producer"})

(def rps
  "An organization that hosts data or material culture objects and provides services to promote long term, consistent and shared use of those data or objects"
  {:db/ident :loc.relators/rps,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Repository",
   :madsrdf/code "rps",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An organization that hosts data or material culture objects and provides services to promote long term, consistent and shared use of those data or objects"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rps,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rps,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An organization that hosts data or material culture objects and provides services to promote long term, consistent and shared use of those data or objects"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rps",
   :skos/prefLabel "Repository"})

(def rpt
  "A person or organization who writes or presents reports of news or current events on air or in print"
  {:db/ident :loc.relators/rpt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Reporter",
   :madsrdf/code "rpt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who writes or presents reports of news or current events on air or in print"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rpt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rpt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who writes or presents reports of news or current events on air or in print"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rpt",
   :skos/prefLabel "Reporter"})

(def rpy
  "A person or organization legally responsible for the content of the published material"
  {:db/ident :loc.relators/rpy,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Responsible party",
   :madsrdf/code "rpy",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization legally responsible for the content of the published material"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rpy,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rpy,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization legally responsible for the content of the published material"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rpy",
   :skos/prefLabel "Responsible party"})

(def rse
  "A respondent against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"
  {:db/ident :loc.relators/rse,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Respondent-appellee",
   :madsrdf/code "rse",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A respondent against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"},
   :madsrdf/hasBroaderAuthority :loc.relators/rsp,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/rsp,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rse,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rse,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A respondent against whom an appeal is taken from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rse",
   :skos/prefLabel "Respondent-appellee"})

(def rsg
  "A person or organization, other than the original choreographer or director, responsible for restaging a choreographic or dramatic work and who contributes minimal new content"
  {:db/ident :loc.relators/rsg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Restager",
   :madsrdf/code "rsg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization, other than the original choreographer or director, responsible for restaging a choreographic or dramatic work and who contributes minimal new content"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rsg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rsg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization, other than the original choreographer or director, responsible for restaging a choreographic or dramatic work and who contributes minimal new content"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rsg",
   :skos/prefLabel "Restager"})

(def rsp
  "A person or organization who makes an answer to the courts pursuant to an application for redress (usually in an equity proceeding) or a candidate for a degree who defends or opposes a thesis provided by the praeses in an academic disputation"
  {:db/ident :loc.relators/rsp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Respondent",
   :madsrdf/code "rsp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes an answer to the courts pursuant to an application for redress (usually in an equity proceeding) or a candidate for a degree who defends or opposes a thesis provided by the praeses in an academic disputation"},
   :madsrdf/hasNarrowerAuthority [:loc.relators/rse :loc.relators/rst],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDACreator
    :loc.relators/collection_RDAWork
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rsp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rsp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes an answer to the courts pursuant to an application for redress (usually in an equity proceeding) or a candidate for a degree who defends or opposes a thesis provided by the praeses in an academic disputation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/rst :loc.relators/rse],
   :skos/notation "rsp",
   :skos/prefLabel "Respondent"})

(def rsr
  "A person, family, or organization responsible for the set of technical, editorial, and intellectual procedures aimed at compensating for the degradation of an item by bringing it back to a state as close as possible to its original condition"
  {:db/ident :loc.relators/rsr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Restorationist",
   :madsrdf/code "rsr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for the set of technical, editorial, and intellectual procedures aimed at compensating for the degradation of an item by bringing it back to a state as close as possible to its original condition"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDAItem
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rsr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rsr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization responsible for the set of technical, editorial, and intellectual procedures aimed at compensating for the degradation of an item by bringing it back to a state as close as possible to its original condition"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rsr",
   :skos/prefLabel "Restorationist"})

(def rst
  "A respondent who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"
  {:db/ident :loc.relators/rst,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Respondent-appellant",
   :madsrdf/code "rst",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A respondent who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"},
   :madsrdf/hasBroaderAuthority :loc.relators/rsp,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/rsp,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rst,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rst,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A respondent who takes an appeal from one court or jurisdiction to another to reverse the judgment, usually in an equity proceeding"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rst",
   :skos/prefLabel "Respondent-appellant"})

(def rth
  "A person who directed or managed a research project"
  {:db/ident :loc.relators/rth,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Research team head",
   :madsrdf/code "rth",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A person who directed or managed a research project"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rth,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rth,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who directed or managed a research project"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rth",
   :skos/prefLabel "Research team head"})

(def rtm
  "A person who participated in a research project but whose role did not involve direction or management of it"
  {:db/ident :loc.relators/rtm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Research team member",
   :madsrdf/code "rtm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who participated in a research project but whose role did not involve direction or management of it"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rtm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/rtm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who participated in a research project but whose role did not involve direction or management of it"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "rtm",
   :skos/prefLabel "Research team member"})

(def sad
  "A person or organization who brings scientific, pedagogical, or historical competence to the conception and realization on a work, particularly in the case of audio-visual items"
  {:db/ident :loc.relators/sad,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Scientific advisor",
   :madsrdf/code "sad",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who brings scientific, pedagogical, or historical competence to the conception and realization on a work, particularly in the case of audio-visual items"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sad,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sad,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who brings scientific, pedagogical, or historical competence to the conception and realization on a work, particularly in the case of audio-visual items"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "sad",
   :skos/prefLabel "Scientific advisor"})

(def sce
  "A person or organization who is the author of a motion picture screenplay, generally the person who wrote the scenarios for a motion picture during the silent era"
  {:db/ident :loc.relators/sce,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Scenarist",
   :madsrdf/code "sce",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is the author of a motion picture screenplay, generally the person who wrote the scenarios for a motion picture during the silent era"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Revised MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sce,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sce,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is the author of a motion picture screenplay, generally the person who wrote the scenarios for a motion picture during the silent era"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Revised MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "sce",
   :skos/prefLabel "Scenarist"})

(def scl
  "An artist responsible for creating a three-dimensional work by modeling, carving, or similar technique"
  {:db/ident :loc.relators/scl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Sculptor",
   :madsrdf/code "scl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An artist responsible for creating a three-dimensional work by modeling, carving, or similar technique"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/art,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAWork
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDACreator],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/art,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/scl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/scl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An artist responsible for creating a three-dimensional work by modeling, carving, or similar technique"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "scl",
   :skos/prefLabel "Sculptor"})

(def scr
  "A person who is an amanuensis and for a writer of manuscripts proper. For a person who makes pen-facsimiles, use facsimilist [fac]"
  {:db/ident :loc.relators/scr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Scribe",
   :madsrdf/code "scr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who is an amanuensis and for a writer of manuscripts proper. For a person who makes pen-facsimiles, use facsimilist [fac]"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/scr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/scr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who is an amanuensis and for a writer of manuscripts proper. For a person who makes pen-facsimiles, use facsimilist [fac]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "scr",
   :skos/prefLabel "Scribe"})

(def sds
  "A person who produces and reproduces the sound score (both live and recorded), the installation of microphones, the setting of sound levels, and the coordination of sources of sound for a production"
  {:db/ident :loc.relators/sds,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Sound designer",
   :madsrdf/code "sds",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who produces and reproduces the sound score (both live and recorded), the installation of microphones, the setting of sound levels, and the coordination of sources of sound for a production"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sds,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sds,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who produces and reproduces the sound score (both live and recorded), the installation of microphones, the setting of sound levels, and the coordination of sources of sound for a production"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "sds",
   :skos/prefLabel "Sound designer"})

(def sec
  "A person or organization who is a recorder, redactor, or other person responsible for expressing the views of a organization"
  {:db/ident :loc.relators/sec,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Secretary",
   :madsrdf/code "sec",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is a recorder, redactor, or other person responsible for expressing the views of a organization"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sec,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sec,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is a recorder, redactor, or other person responsible for expressing the views of a organization"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "sec",
   :skos/prefLabel "Secretary"})

(def sgd
  "A person or organization contributing to a stage resource through the overall management and supervision of a performance"
  {:db/ident :loc.relators/sgd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Stage director",
   :madsrdf/code "sgd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization contributing to a stage resource through the overall management and supervision of a performance"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sgd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sgd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization contributing to a stage resource through the overall management and supervision of a performance"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "sgd",
   :skos/prefLabel "Stage director"})

(def sgn
  "A person whose signature appears without a presentation or other statement indicative of provenance. When there is a presentation statement, use inscriber [ins]"
  {:db/ident :loc.relators/sgn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Signer",
   :madsrdf/code "sgn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person whose signature appears without a presentation or other statement indicative of provenance. When there is a presentation statement, use inscriber [ins]"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sgn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sgn,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person whose signature appears without a presentation or other statement indicative of provenance. When there is a presentation statement, use inscriber [ins]"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "sgn",
   :skos/prefLabel "Signer"})

(def sht
  "A person or organization that supports (by allocating facilities, staff, or other resources) a project, program, meeting, event, data objects, material culture objects, or other entities capable of support"
  {:db/ident :loc.relators/sht,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Supporting host",
   :madsrdf/code "sht",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization that supports (by allocating facilities, staff, or other resources) a project, program, meeting, event, data objects, material culture objects, or other entities capable of support"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Host, supporting",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/altLabel "Host, supporting",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sht,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sht,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization that supports (by allocating facilities, staff, or other resources) a project, program, meeting, event, data objects, material culture objects, or other entities capable of support"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "sht",
   :skos/prefLabel "Supporting host",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Host, supporting"}})

(def sll
  "A former owner of an item who sold that item to another owner"
  {:db/ident :loc.relators/sll,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Seller",
   :madsrdf/code "sll",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A former owner of an item who sold that item to another owner"},
   :madsrdf/hasBroaderAuthority :loc.relators/fmo,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAOwner
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAItem],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/fmo,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sll,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sll,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A former owner of an item who sold that item to another owner"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "sll",
   :skos/prefLabel "Seller"})

(def sng
  "A performer contributing to a resource by using his/her/their voice, with or without instrumental accompaniment, to produce music. A singer's performance may or may not include actual words"
  {:db/ident :loc.relators/sng,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Singer",
   :madsrdf/code "sng",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by using his/her/their voice, with or without instrumental accompaniment, to produce music. A singer's performance may or may not include actual words"},
   :madsrdf/editorialNote [{:rdf/language "en",
                            :rdf/value
                            "Vocalist is deprecated and made reference"}
                           {:rdf/language "en",
                            :rdf/value    "Changed MARC def"}],
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/hasVariant {:madsrdf/variantLabel "Vocalist",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAContributor],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Vocalist",
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sng,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/sng,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by using his/her/their voice, with or without instrumental accompaniment, to produce music. A singer's performance may or may not include actual words"},
   :skos/editorial [{:rdf/language "en",
                     :rdf/value    "Vocalist is deprecated and made reference"}
                    {:rdf/language "en",
                     :rdf/value    "Changed MARC def"}],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "sng",
   :skos/prefLabel "Singer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Vocalist"}})

(def spk
  "A performer contributing to a resource by speaking words, such as a lecture, speech, etc."
  {:db/ident :loc.relators/spk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Speaker",
   :madsrdf/code "spk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by speaking words, such as a lecture, speech, etc."},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/spk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/spk,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by speaking words, such as a lecture, speech, etc."},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "spk",
   :skos/prefLabel "Speaker"})

(def spn
  "A person, family, or organization sponsoring some aspect of a resource, e.g., funding research, sponsoring an event"
  {:db/ident :loc.relators/spn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Sponsor",
   :madsrdf/code "spn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization sponsoring some aspect of a resource, e.g., funding research, sponsoring an event"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Sponsoring body",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAWork
    :loc.relators/collection_RDAOther
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/altLabel "Sponsoring body",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/spn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/spn,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization sponsoring some aspect of a resource, e.g., funding research, sponsoring an event"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "spn",
   :skos/prefLabel "Sponsor",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Sponsoring body"}})

(def spy
  "A person or organization who is identified as the party of the second part. In the case of transfer of right, this is the assignee, transferee, licensee, grantee, etc. Multiple parties can be named jointly as the second party"
  {:db/ident :loc.relators/spy,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Second party",
   :madsrdf/code "spy",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is identified as the party of the second part. In the case of transfer of right, this is the assignee, transferee, licensee, grantee, etc. Multiple parties can be named jointly as the second party"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/spy,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/spy,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who is identified as the party of the second part. In the case of transfer of right, this is the assignee, transferee, licensee, grantee, etc. Multiple parties can be named jointly as the second party"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "spy",
   :skos/prefLabel "Second party"})

(def srv
  "A person, family, or organization contributing to a cartographic resource by providing measurements or dimensional relationships for the geographic area represented"
  {:db/ident :loc.relators/srv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Surveyor",
   :madsrdf/code "srv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a cartographic resource by providing measurements or dimensional relationships for the geographic area represented"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/srv,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/srv,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a cartographic resource by providing measurements or dimensional relationships for the geographic area represented"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "srv",
   :skos/prefLabel "Surveyor"})

(def std
  "A person who translates the rough sketches of the art director into actual architectural structures for a theatrical presentation, entertainment, motion picture, etc. Set designers draw the detailed guides and specifications for building the set"
  {:db/ident :loc.relators/std,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Set designer",
   :madsrdf/code "std",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who translates the rough sketches of the art director into actual architectural structures for a theatrical presentation, entertainment, motion picture, etc. Set designers draw the detailed guides and specifications for building the set"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/std,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/std,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who translates the rough sketches of the art director into actual architectural structures for a theatrical presentation, entertainment, motion picture, etc. Set designers draw the detailed guides and specifications for building the set"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "std",
   :skos/prefLabel "Set designer"})

(def stg
  "An entity in which the activity or plot of a work takes place, e.g. a geographic place, a time period, a building, an event"
  {:db/ident :loc.relators/stg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Setting",
   :madsrdf/code "stg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An entity in which the activity or plot of a work takes place, e.g. a geographic place, a time period, a building, an event"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Subject relationship"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/stg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/stg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in which the activity or plot of a work takes place, e.g. a geographic place, a time period, a building, an event"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Subject relationship"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "stg",
   :skos/prefLabel "Setting"})

(def stl
  "A performer contributing to a resource by relaying a creator's original story with dramatic or theatrical interpretation"
  {:db/ident :loc.relators/stl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Storyteller",
   :madsrdf/code "stl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by relaying a creator's original story with dramatic or theatrical interpretation"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/stl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/stl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by relaying a creator's original story with dramatic or theatrical interpretation"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "stl",
   :skos/prefLabel "Storyteller"})

(def stm
  "A person who is in charge of everything that occurs on a performance stage, and who acts as chief of all crews and assistant to a director during rehearsals"
  {:db/ident :loc.relators/stm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Stage manager",
   :madsrdf/code "stm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who is in charge of everything that occurs on a performance stage, and who acts as chief of all crews and assistant to a director during rehearsals"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/stm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/stm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who is in charge of everything that occurs on a performance stage, and who acts as chief of all crews and assistant to a director during rehearsals"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "stm",
   :skos/prefLabel "Stage manager"})

(def stn
  "An organization responsible for the development or enforcement of a standard"
  {:db/ident :loc.relators/stn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Standards body",
   :madsrdf/code "stn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An organization responsible for the development or enforcement of a standard"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/stn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/stn,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An organization responsible for the development or enforcement of a standard"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "stn",
   :skos/prefLabel "Standards body"})

(def str
  "A person or organization who creates a new plate for printing by molding or copying another printing surface"
  {:db/ident :loc.relators/str,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Stereotyper",
   :madsrdf/code "str",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who creates a new plate for printing by molding or copying another printing surface"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/str,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/str,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who creates a new plate for printing by molding or copying another printing surface"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "str",
   :skos/prefLabel "Stereotyper"})

(def tcd
  "A person who is ultimately in charge of scenery, props, lights and sound for a production"
  {:db/ident :loc.relators/tcd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Technical director",
   :madsrdf/code "tcd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person who is ultimately in charge of scenery, props, lights and sound for a production"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tcd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tcd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who is ultimately in charge of scenery, props, lights and sound for a production"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "tcd",
   :skos/prefLabel "Technical director"})

(def tch
  "A performer contributing to a resource by giving instruction or providing a demonstration"
  {:db/ident :loc.relators/tch,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Teacher",
   :madsrdf/code "tch",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by giving instruction or providing a demonstration"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/hasBroaderAuthority :loc.relators/prf,
   :madsrdf/hasVariant {:madsrdf/variantLabel "Instructor",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/altLabel "Instructor",
   :skos/broader :loc.relators/prf,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tch,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tch,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A performer contributing to a resource by giving instruction or providing a demonstration"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "tch",
   :skos/prefLabel "Teacher",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Instructor"}})

(def ths
  "A person under whose supervision a degree candidate develops and presents a thesis, mémoire, or text of a dissertation"
  {:db/ident :loc.relators/ths,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Thesis advisor",
   :madsrdf/code "ths",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person under whose supervision a degree candidate develops and presents a thesis, mémoire, or text of a dissertation"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Promoter",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/altLabel "Promoter",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ths,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/ths,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person under whose supervision a degree candidate develops and presents a thesis, mémoire, or text of a dissertation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "ths",
   :skos/prefLabel "Thesis advisor",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Promoter"}})

(def tld
  "A director responsible for the general management and supervision of a television program"
  {:db/ident :loc.relators/tld,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Television director",
   :madsrdf/code "tld",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A director responsible for the general management and supervision of a television program"},
   :madsrdf/hasBroaderAuthority :loc.relators/drt,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAWork],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/broader :loc.relators/drt,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tld,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tld,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A director responsible for the general management and supervision of a television program"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "tld",
   :skos/prefLabel "Television director"})

(def tlp
  "A producer responsible for most of the business aspects of a television program"
  {:db/ident :loc.relators/tlp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Television producer",
   :madsrdf/code "tlp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A producer responsible for most of the business aspects of a television program"},
   :madsrdf/hasBroaderAuthority :loc.relators/pro,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAWork
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAOther
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/broader :loc.relators/pro,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tlp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tlp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A producer responsible for most of the business aspects of a television program"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "tlp",
   :skos/prefLabel "Television producer"})

(def trc
  "A person, family, or organization contributing to a resource by changing it from one system of notation to another. For a work transcribed for a different instrument or performing group, see arranger [arr]. For makers of pen-facsimiles, use facsimilist [fac]"
  {:db/ident :loc.relators/trc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Transcriber",
   :madsrdf/code "trc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by changing it from one system of notation to another. For a work transcribed for a different instrument or performing group, see arranger [arr]. For makers of pen-facsimiles, use facsimilist [fac]"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Changed MARC def"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/trc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/trc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by changing it from one system of notation to another. For a work transcribed for a different instrument or performing group, see arranger [arr]. For makers of pen-facsimiles, use facsimilist [fac]"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "Changed MARC def"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "trc",
   :skos/prefLabel "Transcriber"})

(def trl
  "A person or organization who renders a text from one language into another, or from an older form of a language into the modern form"
  {:db/ident :loc.relators/trl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Translator",
   :madsrdf/code "trl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who renders a text from one language into another, or from an older form of a language into the modern form"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAExpression],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/trl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/trl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who renders a text from one language into another, or from an older form of a language into the modern form"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "trl",
   :skos/prefLabel "Translator"})

(def tyd
  "A person or organization who designs the type face used in a particular item"
  {:db/ident :loc.relators/tyd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Type designer",
   :madsrdf/code "tyd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who designs the type face used in a particular item"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Designer of type",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/altLabel "Designer of type",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tyd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tyd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who designs the type face used in a particular item"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "tyd",
   :skos/prefLabel "Type designer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Designer of type"}})

(def tyg
  "A person or organization primarily responsible for choice and arrangement of type used in an item. If the typographer is also responsible for other aspects of the graphic design of a book (e.g., Book designer [bkd]), codes for both functions may be needed"
  {:db/ident :loc.relators/tyg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Typographer",
   :madsrdf/code "tyg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization primarily responsible for choice and arrangement of type used in an item. If the typographer is also responsible for other aspects of the graphic design of a book (e.g., Book designer [bkd]), codes for both functions may be needed"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :skos/Concept :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tyg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/tyg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization primarily responsible for choice and arrangement of type used in an item. If the typographer is also responsible for other aspects of the graphic design of a book (e.g., Book designer [bkd]), codes for both functions may be needed"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "tyg",
   :skos/prefLabel "Typographer"})

(def uvp
  "A place where a university that is associated with a resource is located, for example, a university where an academic dissertation or thesis was presented"
  {:db/ident :loc.relators/uvp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "University place",
   :madsrdf/code "uvp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A place where a university that is associated with a resource is located, for example, a university where an academic dissertation or thesis was presented"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :madsrdf/Authority :owl/ObjectProperty],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/uvp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/uvp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A place where a university that is associated with a resource is located, for example, a university where an academic dissertation or thesis was presented"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "uvp",
   :skos/prefLabel "University place"})

(def vac
  "An actor contributing to a resource by providing the voice for characters in radio and audio productions and for animated characters in moving image works, as well as by providing voice overs in radio and television commercials, dubbed resources, etc."
  {:db/ident :loc.relators/vac,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Voice actor",
   :madsrdf/code "vac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An actor contributing to a resource by providing the voice for characters in radio and audio productions and for animated characters in moving image works, as well as by providing voice overs in radio and television commercials, dubbed resources, etc."},
   :madsrdf/hasBroaderAuthority :loc.relators/act,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/broader :loc.relators/act,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/vac,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/vac,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An actor contributing to a resource by providing the voice for characters in radio and audio productions and for animated characters in moving image works, as well as by providing voice overs in radio and television commercials, dubbed resources, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "vac",
   :skos/prefLabel "Voice actor"})

(def vdg
  "A person in charge of a video production, e.g. the video recording of a stage production as opposed to a commercial motion picture. The videographer may be the camera operator or may supervise one or more camera operators. Do not confuse with cinematographer"
  {:db/ident :loc.relators/vdg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Videographer",
   :madsrdf/code "vdg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person in charge of a video production, e.g. the video recording of a stage production as opposed to a commercial motion picture. The videographer may be the camera operator or may supervise one or more camera operators. Do not confuse with cinematographer"},
   :madsrdf/editorialNote
   {:rdf/language "en",
    :rdf/value
    "In RDA included under Director of photography (i.e. cinematographer)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/vdg,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/vdg,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person in charge of a video production, e.g. the video recording of a stage production as opposed to a commercial motion picture. The videographer may be the camera operator or may supervise one or more camera operators. Do not confuse with cinematographer"},
   :skos/editorial
   {:rdf/language "en",
    :rdf/value
    "In RDA included under Director of photography (i.e. cinematographer)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "vdg",
   :skos/prefLabel "Videographer"})

(def voc
  {:db/ident :loc.relators/voc,
   :madsrdf/code "voc",
   :madsrdf/deprecatedLabel "Vocalist",
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "Combined with Singer (sng)"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Singer",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.relators/collection_PastPresentRelatorsEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type :madsrdf/DeprecatedAuthority,
   :rdfs/subPropertyOf :dc11/contributor})

(def wac
  "A person, family, or organization contributing to an expression of a work by providing an interpretation or critical explanation of the original work"
  {:db/ident :loc.relators/wac,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Writer of added commentary",
   :madsrdf/code "wac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to an expression of a work by providing an interpretation or critical explanation of the original work"},
   :madsrdf/hasBroaderAuthority :loc.relators/wst,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/broader :loc.relators/wst,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wac,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wac,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to an expression of a work by providing an interpretation or critical explanation of the original work"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "wac",
   :skos/prefLabel "Writer of added commentary"})

(def wal
  "A writer of words added to an expression of a musical work. For lyric writing in collaboration with a composer to form an original work, see lyricist"
  {:db/ident :loc.relators/wal,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Writer of added lyrics",
   :madsrdf/code "wal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A writer of words added to an expression of a musical work. For lyric writing in collaboration with a composer to form an original work, see lyricist"},
   :madsrdf/hasBroaderAuthority :loc.relators/wst,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAContributor
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/broader :loc.relators/wst,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wal,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wal,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A writer of words added to an expression of a musical work. For lyric writing in collaboration with a composer to form an original work, see lyricist"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "wal",
   :skos/prefLabel "Writer of added lyrics"})

(def wam
  "A person or organization who writes significant material which accompanies a sound recording or other audiovisual material"
  {:db/ident :loc.relators/wam,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Writer of accompanying material",
   :madsrdf/code "wam",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who writes significant material which accompanies a sound recording or other audiovisual material"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wam,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wam,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who writes significant material which accompanies a sound recording or other audiovisual material"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "wam",
   :skos/prefLabel "Writer of accompanying material"})

(def wat
  "A person, family, or organization contributing to a non-textual resource by providing text for the non-textual work (e.g., writing captions for photographs, descriptions of maps)"
  {:db/ident :loc.relators/wat,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Writer of added text",
   :madsrdf/code "wat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a non-textual resource by providing text for the non-textual work (e.g., writing captions for photographs, descriptions of maps)"},
   :madsrdf/hasBroaderAuthority :loc.relators/wst,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :skos/broader :loc.relators/wst,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wat,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wat,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a non-textual resource by providing text for the non-textual work (e.g., writing captions for photographs, descriptions of maps)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "wat",
   :skos/prefLabel "Writer of added text"})

(def wdc
  "A person or organization who makes prints by cutting the image in relief on the plank side of a wood block"
  {:db/ident :loc.relators/wdc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Woodcutter",
   :madsrdf/code "wdc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes prints by cutting the image in relief on the plank side of a wood block"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wdc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wdc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes prints by cutting the image in relief on the plank side of a wood block"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "wdc",
   :skos/prefLabel "Woodcutter"})

(def wde
  "A person or organization who makes prints by cutting the image in relief on the end-grain of a wood block"
  {:db/ident :loc.relators/wde,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Wood engraver",
   :madsrdf/code "wde",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes prints by cutting the image in relief on the end-grain of a wood block"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:skos/Concept :owl/ObjectProperty :madsrdf/Authority],
   :rdfs/subPropertyOf :dc11/contributor,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wde,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wde,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person or organization who makes prints by cutting the image in relief on the end-grain of a wood block"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "wde",
   :skos/prefLabel "Wood engraver"})

(def win
  "A person, family, or organization contributing to a resource by providing an introduction to the original work"
  {:db/ident :loc.relators/win,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Writer of introduction",
   :madsrdf/code "win",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by providing an introduction to the original work"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_RDA],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:madsrdf/Authority :owl/ObjectProperty :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/win,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/win,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by providing an introduction to the original work"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "win",
   :skos/prefLabel "Writer of introduction"})

(def wit
  "Use for a person who verifies the truthfulness of an event or action"
  {:db/ident :loc.relators/wit,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Witness",
   :madsrdf/code "wit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Use for a person who verifies the truthfulness of an event or action"},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Testifier",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Deponent",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Eyewitness",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Onlooker",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Observer",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_PastPresentRelatorsEntries
    :loc.relators/collection_BIBFRAME],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :madsrdf/Authority :skos/Concept],
   :skos/altLabel ["Onlooker" "Testifier" "Observer" "Deponent" "Eyewitness"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wit,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wit,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Use for a person who verifies the truthfulness of an event or action"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "wit",
   :skos/prefLabel "Witness",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Onlooker"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Deponent"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Eyewitness"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Testifier"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Observer"}]})

(def wpr
  "A person, family, or organization contributing to a resource by providing a preface to the original work"
  {:db/ident :loc.relators/wpr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Writer of preface",
   :madsrdf/code "wpr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by providing a preface to the original work"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_RDAContributor
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDA
    :loc.relators/collection_BIBFRAME
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wpr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wpr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by providing a preface to the original work"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/notation "wpr",
   :skos/prefLabel "Writer of preface"})

(def wst
  "A person, family, or organization contributing to a resource by providing supplementary textual content (e.g., an introduction, a preface) to the original work"
  {:db/ident :loc.relators/wst,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-11-29T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Writer of supplementary textual content",
   :madsrdf/code "wst",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by providing supplementary textual content (e.g., an introduction, a preface) to the original work"},
   :madsrdf/hasNarrowerAuthority
   [:loc.relators/wal :loc.relators/wat :loc.relators/wac],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.relators/collection_BIBFRAME
    :loc.relators/collection_RDA
    :loc.relators/collection_RDAExpression
    :loc.relators/collection_RDAContributor
    :loc.relators/collection_PastPresentRelatorsEntries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/relators,
   :rdf/type [:owl/ObjectProperty :skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2021-08-02T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wst,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-11-29T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.relators/wst,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person, family, or organization contributing to a resource by providing supplementary textual content (e.g., an introduction, a preface) to the original work"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 1XX/7XX/8XX $4"},
   :skos/inScheme :loc.vocabulary/relators,
   :skos/narrower [:loc.relators/wac :loc.relators/wat :loc.relators/wal],
   :skos/notation "wst",
   :skos/prefLabel "Writer of supplementary textual content"})