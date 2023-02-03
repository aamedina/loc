(ns net.wikipunk.rdf.loc.rbmscv
  "http://id.loc.gov/vocabulary/rbmscv/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/rbmscv.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.rbmscv" "http://id.loc.gov/vocabulary/rbmscv/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.rbmscv",
   :rdfa/uri          "http://id.loc.gov/vocabulary/rbmscv/"})

(def cv00001
  "Production"
  {:db/ident :loc.rbmscv/cv00001,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-10-15T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "updated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-05-21T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Production",
   :madsrdf/hasNarrowerAuthority [:loc.rbmscv/cv00173
                                  :loc.rbmscv/cv00947
                                  :loc.rbmscv/cv01460
                                  :loc.rbmscv/cv00410
                                  :loc.rbmscv/cv00147
                                  :loc.rbmscv/cv01156
                                  :loc.rbmscv/cv00002
                                  :loc.rbmscv/cv01127
                                  :loc.rbmscv/cv00037
                                  :loc.rbmscv/cv00023
                                  :loc.rbmscv/cv00660
                                  :loc.rbmscv/cv01172
                                  :loc.rbmscv/cv01531],
   :madsrdf/isMemberOfMADSCollection
   "http://id.loc.gov/vocabulary/rbms/collection_rbmsTerms",
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/rbmscv,
   :madsrdf/scopeNote
   ["This term is in beta testing."
    "Encompasses terms describing evidence or processes relating to the production of a physical resource."],
   :owl/sameAs "info:lc/vocabulary/rbmscv/cv00001",
   :rdf/type :madsrdf/GenreForm,
   :skos/changeNote [{:cs/changeReason    "updated",
                      :cs/createdDate     #inst "2022-10-15T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00001,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2020-05-21T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00001,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/rbmscv,
   :skos/narrower [:loc.rbmscv/cv01156
                   :loc.rbmscv/cv01172
                   :loc.rbmscv/cv00147
                   :loc.rbmscv/cv00410
                   :loc.rbmscv/cv00173
                   :loc.rbmscv/cv00660
                   :loc.rbmscv/cv00037
                   :loc.rbmscv/cv01531
                   :loc.rbmscv/cv01460
                   :loc.rbmscv/cv01127
                   :loc.rbmscv/cv00002
                   :loc.rbmscv/cv00023
                   :loc.rbmscv/cv00947],
   :skos/prefLabel "Production",
   :skos/scopeNote
   ["Encompasses terms describing evidence or processes relating to the production of a physical resource."
    "This term is in beta testing."]})

(def cv00011
  "Works"
  {:db/ident :loc.rbmscv/cv00011,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-10-15T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "updated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-05-21T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Works",
   :madsrdf/hasNarrowerAuthority [:loc.rbmscv/cv00013
                                  :loc.rbmscv/cv00014
                                  :loc.rbmscv/cv00015
                                  :loc.rbmscv/cv00012],
   :madsrdf/isMemberOfMADSCollection
   "http://id.loc.gov/vocabulary/rbms/collection_rbmsTerms",
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/rbmscv,
   :madsrdf/scopeNote
   ["This term is in beta testing."
    "Encompasses terms that categorize the intellectual nature of resources."],
   :owl/sameAs "info:lc/vocabulary/rbmscv/cv00011",
   :rdf/type :madsrdf/GenreForm,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2020-05-21T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00011,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "updated",
                      :cs/createdDate     #inst "2022-10-15T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00011,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/rbmscv,
   :skos/narrower [:loc.rbmscv/cv00012
                   :loc.rbmscv/cv00015
                   :loc.rbmscv/cv00013
                   :loc.rbmscv/cv00014],
   :skos/prefLabel "Works",
   :skos/scopeNote
   ["Encompasses terms that categorize the intellectual nature of resources."
    "This term is in beta testing."]})

(def cv00017
  "Provenance"
  {:db/ident :loc.rbmscv/cv00017,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-10-15T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "updated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-05-21T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Provenance",
   :madsrdf/hasNarrowerAuthority [:loc.rbmscv/cv00125
                                  :loc.rbmscv/cv00970
                                  :loc.rbmscv/cv00018
                                  :loc.rbmscv/cv00148],
   :madsrdf/isMemberOfMADSCollection
   "http://id.loc.gov/vocabulary/rbms/collection_rbmsTerms",
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/rbmscv,
   :madsrdf/scopeNote
   ["This term is in beta testing."
    "Encompasses terms describing evidence indicating the history or ownership of a specific item."],
   :owl/sameAs "info:lc/vocabulary/rbmscv/cv00017",
   :rdf/type :madsrdf/GenreForm,
   :skos/changeNote [{:cs/changeReason    "updated",
                      :cs/createdDate     #inst "2022-10-15T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00017,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2020-05-21T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00017,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/rbmscv,
   :skos/narrower [:loc.rbmscv/cv00018
                   :loc.rbmscv/cv00148
                   :loc.rbmscv/cv00125
                   :loc.rbmscv/cv00970],
   :skos/prefLabel "Provenance",
   :skos/scopeNote
   ["Encompasses terms describing evidence indicating the history or ownership of a specific item."
    "This term is in beta testing."]})

(def cv00041
  "Objects"
  {:db/ident :loc.rbmscv/cv00041,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-05-21T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-10-15T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "updated"}],
   :madsrdf/authoritativeLabel "Objects",
   :madsrdf/hasNarrowerAuthority [:loc.rbmscv/cv00042
                                  :loc.rbmscv/cv00059
                                  :loc.rbmscv/cv00070
                                  :loc.rbmscv/cv01808
                                  :loc.rbmscv/cv00739],
   :madsrdf/isMemberOfMADSCollection
   "http://id.loc.gov/vocabulary/rbms/collection_rbmsTerms",
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/rbmscv,
   :madsrdf/scopeNote
   ["This term is in beta testing."
    "Encompasses terms that categorize the physical elements of resources."],
   :owl/sameAs "info:lc/vocabulary/rbmscv/cv00041",
   :rdf/type :madsrdf/GenreForm,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2020-05-21T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00041,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "updated",
                      :cs/createdDate     #inst "2022-10-15T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00041,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/rbmscv,
   :skos/narrower [:loc.rbmscv/cv00059
                   :loc.rbmscv/cv00739
                   :loc.rbmscv/cv00042
                   :loc.rbmscv/cv01808
                   :loc.rbmscv/cv00070],
   :skos/prefLabel "Objects",
   :skos/scopeNote
   ["Encompasses terms that categorize the physical elements of resources."
    "This term is in beta testing."]})

(def cv00050
  "Publishing"
  {:db/ident :loc.rbmscv/cv00050,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-05-21T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-10-15T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "updated"}],
   :madsrdf/authoritativeLabel "Publishing",
   :madsrdf/hasNarrowerAuthority [:loc.rbmscv/cv01158
                                  :loc.rbmscv/cv01167
                                  :loc.rbmscv/cv00999
                                  :loc.rbmscv/cv01617
                                  :loc.rbmscv/cv00170
                                  :loc.rbmscv/cv00051
                                  :loc.rbmscv/cv01033],
   :madsrdf/isMemberOfMADSCollection
   "http://id.loc.gov/vocabulary/rbms/collection_rbmsTerms",
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/rbmscv,
   :madsrdf/scopeNote
   ["Encompasses terms describing evidence or processes relating to the publication of a resource."
    "This term is in beta testing."],
   :owl/sameAs "info:lc/vocabulary/rbmscv/cv00050",
   :rdf/type :madsrdf/GenreForm,
   :skos/changeNote [{:cs/changeReason    "updated",
                      :cs/createdDate     #inst "2022-10-15T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00050,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2020-05-21T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.rbmscv/cv00050,
                      :rdf/type           :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/rbmscv,
   :skos/narrower [:loc.rbmscv/cv00170
                   :loc.rbmscv/cv01617
                   :loc.rbmscv/cv00051
                   :loc.rbmscv/cv00999
                   :loc.rbmscv/cv01033
                   :loc.rbmscv/cv01167
                   :loc.rbmscv/cv01158],
   :skos/prefLabel "Publishing",
   :skos/scopeNote
   ["Encompasses terms describing evidence or processes relating to the publication of a resource."
    "This term is in beta testing."]})

(def ^{:private true} rbmscv
  "Welcome to the Controlled Vocabulary for Rare Materials Cataloging. This scheme is developed and maintained by the Controlled Vocabularies Editorial Group of the Rare Books and Manuscripts Section (ACRL/ALA). These thesauri provide standardized vocabulary for retrieving special collections materials by form, genre, or by various physical characteristics that are typically of interest to researchers and special collections librarians, and for relating materials to individuals or corporate bodies. For information about the scope, application, and historical development of a thesaurus, please consult the digitized introductions to each text. All terms from the original print versions, as well as additions and changes since publication, are integrated into the databases below. We appreciate your patience as we improve the design and functionality of these databases, and welcome your comments. Proposal form for terms: https://rbms.info/vocabularies/form_thesaurus_term_proposal.shtml Contact email: vocabularies@rbms.info"
  {:db/ident :loc.vocabulary/rbmscv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-06-01T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-10-26T18:13:45.448-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasTopMemberOfMADSScheme [:loc.rbmscv/cv00001
                                      :loc.rbmscv/cv00041
                                      :loc.rbmscv/cv00017
                                      :loc.rbmscv/cv00050
                                      :loc.rbmscv/cv00011],
   :madsrdf/scopeNote
   ["version 2.0"
    "This is a beta version of this vocabulary, not to be used in cataloging."],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "Welcome to the Controlled Vocabulary for Rare Materials Cataloging. This scheme is developed and maintained by the Controlled Vocabularies Editorial Group of the Rare Books and Manuscripts Section (ACRL/ALA). These thesauri provide standardized vocabulary for retrieving special collections materials by form, genre, or by various physical characteristics that are typically of interest to researchers and special collections librarians, and for relating materials to individuals or corporate bodies. For information about the scope, application, and historical development of a thesaurus, please consult the digitized introductions to each text. All terms from the original print versions, as well as additions and changes since publication, are integrated into the databases below. We appreciate your patience as we improve the design and functionality of these databases, and welcome your comments. Proposal form for terms: https://rbms.info/vocabularies/form_thesaurus_term_proposal.shtml Contact email: vocabularies@rbms.info",
   :rdfs/label "Controlled Vocabulary for Rare Materials Cataloging",
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2016-06-01T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.vocabulary/rbmscv,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2022-10-26T18:13:45.448-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.vocabulary/rbmscv,
                      :rdf/type           :cs/ChangeSet}],
   :skos/hasTopConcept [:loc.rbmscv/cv00017
                        :loc.rbmscv/cv00041
                        :loc.rbmscv/cv00001
                        :loc.rbmscv/cv00011
                        :loc.rbmscv/cv00050],
   :skos/scopeNote
   ["This is a beta version of this vocabulary, not to be used in cataloging."
    "version 2.0"]})