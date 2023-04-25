(ns net.wikipunk.rdf.loc.preservation.rightsBasis
  "http://id.loc.gov/vocabulary/preservation/rightsBasis/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/rightsBasis.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.preservation.rightsBasis"
                       "http://id.loc.gov/vocabulary/preservation/rightsBasis/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.rightsBasis",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/rightsBasis/"})

(def cop
  "The repository's rights to perform actions on an object is due to copyright law."
  {:db/ident :loc.preservation.rightsBasis/cop,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsBasis/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsBasis/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "copyright",
   :madsrdf/code "cop",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due to copyright law."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.rightsBasis/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/rightsBasis
                                  :loc.vocabulary/preservation],
   :owl/sameAs :premis/Copyright,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/RightsBasis,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.rightsBasis/dlc,
                      :cs/subjectOfChange :loc.preservation.rightsBasis/cop,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.rightsBasis/dlc,
                      :cs/subjectOfChange :loc.preservation.rightsBasis/cop,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due to copyright law."},
   :skos/inScheme [:loc.preservation/rightsBasis :loc.vocabulary/preservation],
   :skos/notation "cop",
   :skos/prefLabel "copyright"})

(def ins
  "The repository's rights to perform actions on an object is due to policies the institutional has established."
  {:db/ident :loc.preservation.rightsBasis/ins,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.rightsBasis/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "institutional policy",
   :madsrdf/code "ins",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due to policies the institutional has established."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.rightsBasis/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/rightsBasis
                                  :loc.vocabulary/preservation],
   :owl/sameAs :premis/InstitutionalPolicy,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/RightsBasis,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.rightsBasis/dlc,
                     :cs/subjectOfChange :loc.preservation.rightsBasis/ins,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due to policies the institutional has established."},
   :skos/inScheme [:loc.preservation/rightsBasis :loc.vocabulary/preservation],
   :skos/notation "ins",
   :skos/prefLabel "institutional policy"})

(def lic
  "The repository's rights to perform actions on an object is due to a license or other agreement granting permissions."
  {:db/ident :loc.preservation.rightsBasis/lic,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsBasis/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsBasis/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "license",
   :madsrdf/code "lic",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due to a license or other agreement granting permissions."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.rightsBasis/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/rightsBasis
                                  :loc.vocabulary/preservation],
   :owl/sameAs :premis/License,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/RightsBasis,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.rightsBasis/dlc,
                      :cs/subjectOfChange :loc.preservation.rightsBasis/lic,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.rightsBasis/dlc,
                      :cs/subjectOfChange :loc.preservation.rightsBasis/lic,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due to a license or other agreement granting permissions."},
   :skos/inScheme [:loc.preservation/rightsBasis :loc.vocabulary/preservation],
   :skos/notation "lic",
   :skos/prefLabel "license"})

(def oth
  "The repository's rights to perform actions on an object is due a rights basis other than copyright, license or statute and is indicated in otherRightsBasis."
  {:db/ident :loc.preservation.rightsBasis/oth,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.rightsBasis/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other",
   :madsrdf/code "oth",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due a rights basis other than copyright, license or statute and is indicated in otherRightsBasis."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.rightsBasis/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/rightsBasis
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.rightsBasis/dlc,
                     :cs/subjectOfChange :loc.preservation.rightsBasis/oth,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due a rights basis other than copyright, license or statute and is indicated in otherRightsBasis."},
   :skos/inScheme [:loc.preservation/rightsBasis :loc.vocabulary/preservation],
   :skos/notation "oth",
   :skos/prefLabel "other"})

(def sta
  "The repository's rights to perform actions on an object is due to a statute."
  {:db/ident :loc.preservation.rightsBasis/sta,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsBasis/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsBasis/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "statute",
   :madsrdf/code "sta",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due to a statute."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.rightsBasis/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/rightsBasis],
   :owl/sameAs :premis/Statute,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/RightsBasis,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.rightsBasis/dlc,
                      :cs/subjectOfChange :loc.preservation.rightsBasis/sta,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.rightsBasis/dlc,
                      :cs/subjectOfChange :loc.preservation.rightsBasis/sta,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The repository's rights to perform actions on an object is due to a statute."},
   :skos/inScheme [:loc.preservation/rightsBasis :loc.vocabulary/preservation],
   :skos/notation "sta",
   :skos/prefLabel "statute"})

(def ^{:private true} rightsBasis
  "Designation of the basis for the right or permission."
  {:db/ident        :loc.preservation/rightsBasis,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.rightsBasis/sta
                                 :loc.preservation.rightsBasis/cop
                                 :loc.preservation.rightsBasis/lic
                                 :loc.preservation.rightsBasis/ins
                                 :loc.preservation.rightsBasis/oth],
   :rdf/type        [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment    "Designation of the basis for the right or permission.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Rights Basis"},
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/rightsBasis,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/rightsBasis,
                      :rdf/type           :cs/ChangeSet}]})