(ns net.wikipunk.rdf.loc.preservation.copyrightStatus
  "http://id.loc.gov/vocabulary/preservation/copyrightStatus/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/copyrightStatus.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.copyrightStatus"
    "http://id.loc.gov/vocabulary/preservation/copyrightStatus/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.copyrightStatus",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/copyrightStatus/"})

(def cpr
  "Under copyright."
  {:db/ident :loc.preservation.copyrightStatus/cpr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.copyrightStatus/cpr,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.copyrightStatus/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "copyrighted",
   :madsrdf/code "cpr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Under copyright."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.copyrightStatus/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/copyrightStatus],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/RightsStatus,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.copyrightStatus/cpr,
                      :cs/subjectOfChange :loc.preservation.copyrightStatus/cpr,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.copyrightStatus/dlc,
                      :cs/subjectOfChange :loc.preservation.copyrightStatus/cpr,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Under copyright."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/copyrightStatus],
   :skos/notation "cpr",
   :skos/prefLabel "copyrighted"})

(def pub
  "In the public domain and may used without copyright restriction."
  {:db/ident :loc.preservation.copyrightStatus/pub,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:02.000-00:00",
     :ri/recordContentSource :loc.preservation.copyrightStatus/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.copyrightStatus/pub,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "public domain",
   :madsrdf/code "pub",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "In the public domain and may used without copyright restriction."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.copyrightStatus/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/copyrightStatus
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/RightsStatus,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:02.000-00:00",
                      :cs/creatorName     :loc.preservation.copyrightStatus/dlc,
                      :cs/subjectOfChange :loc.preservation.copyrightStatus/pub,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.copyrightStatus/pub,
                      :cs/subjectOfChange :loc.preservation.copyrightStatus/pub,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "In the public domain and may used without copyright restriction."},
   :skos/inScheme [:loc.preservation/copyrightStatus
                   :loc.vocabulary/preservation],
   :skos/notation "pub",
   :skos/prefLabel "public domain"})

(def unk
  "Copyright status of the resource is unknown."
  {:db/ident :loc.preservation.copyrightStatus/unk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:03.000-00:00",
     :ri/recordContentSource :loc.preservation.copyrightStatus/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.copyrightStatus/unk,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "unknown",
   :madsrdf/code "unk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Copyright status of the resource is unknown."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.copyrightStatus/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/copyrightStatus],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/RightsStatus,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:03.000-00:00",
                      :cs/creatorName     :loc.preservation.copyrightStatus/dlc,
                      :cs/subjectOfChange :loc.preservation.copyrightStatus/unk,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.copyrightStatus/unk,
                      :cs/subjectOfChange :loc.preservation.copyrightStatus/unk,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Copyright status of the resource is unknown."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/copyrightStatus],
   :skos/notation "unk",
   :skos/prefLabel "unknown"})

(def ^{:private true} copyrightStatus
  "A designation for the copyright status of the object at the time the rights statement is recorded."
  {:db/ident :loc.preservation/copyrightStatus,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/copyrightStatus.rdf,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.copyrightStatus/unk
                                 :loc.preservation.copyrightStatus/pub
                                 :loc.preservation.copyrightStatus/cpr],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "A designation for the copyright status of the object at the time the rights statement is recorded.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copyright Status"},
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/copyrightStatus.rdf,
                      :cs/subjectOfChange :loc.preservation/copyrightStatus,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/copyrightStatus,
                      :rdf/type           :cs/ChangeSet}]})