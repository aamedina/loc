(ns net.wikipunk.rdf.loc.preservation.inhibitorTarget
  "http://id.loc.gov/vocabulary/preservation/inhibitorTarget/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/inhibitorTarget.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.inhibitorTarget"
    "http://id.loc.gov/vocabulary/preservation/inhibitorTarget/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.inhibitorTarget",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/inhibitorTarget/"})

(def all
  "Inhibitor prohibits use of all content."
  {:db/ident :loc.preservation.inhibitorTarget/all,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorTarget/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorTarget/all,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "All Content",
   :madsrdf/code "all",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Inhibitor prohibits use of all content."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.inhibitorTarget/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/inhibitorTarget],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorTarget/all,
                      :cs/subjectOfChange :loc.preservation.inhibitorTarget/all,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorTarget/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorTarget/all,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Inhibitor prohibits use of all content."},
   :skos/inScheme [:loc.preservation/inhibitorTarget
                   :loc.vocabulary/preservation],
   :skos/notation "all",
   :skos/prefLabel "All Content"})

(def pla
  "Inhibitor prohibits function of play."
  {:db/ident :loc.preservation.inhibitorTarget/pla,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorTarget/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorTarget/pla,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Play Function",
   :madsrdf/code "pla",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Inhibitor prohibits function of play."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.inhibitorTarget/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/inhibitorTarget],
   :madsrdf/useInstead :loc.preservation.eventType/ren,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/ren"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorTarget/pla,
                      :cs/subjectOfChange :loc.preservation.inhibitorTarget/pla,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorTarget/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorTarget/pla,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Inhibitor prohibits function of play."},
   :skos/inScheme [:loc.preservation/inhibitorTarget
                   :loc.vocabulary/preservation],
   :skos/notation "pla",
   :skos/prefLabel "Play Function"})

(def prt
  "Inhibitor prohibits function of print."
  {:db/ident :loc.preservation.inhibitorTarget/prt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorTarget/prt,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorTarget/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Print Function",
   :madsrdf/code "prt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Inhibitor prohibits function of print."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.inhibitorTarget/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/inhibitorTarget],
   :madsrdf/useInstead :loc.preservation.eventType/prt,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/prt"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorTarget/prt,
                      :cs/subjectOfChange :loc.preservation.inhibitorTarget/prt,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorTarget/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorTarget/prt,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Inhibitor prohibits function of print."},
   :skos/inScheme [:loc.preservation/inhibitorTarget
                   :loc.vocabulary/preservation],
   :skos/notation "prt",
   :skos/prefLabel "Print Function"})

(def ^{:private true} inhibitorTarget
  "The content or function protected by the inhibitor."
  {:db/ident :loc.preservation/inhibitorTarget,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/inhibitorTarget.rdf,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.inhibitorTarget/pla
                                 :loc.preservation.inhibitorTarget/all
                                 :loc.preservation.inhibitorTarget/prt],
   :madsrdf/useInstead :loc.preservation/eventType,
   :rdf/type
   [:madsrdf/DeprecatedAuthority :skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "The content or function protected by the inhibitor.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inhibitor Target (DEPRECATED)"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/inhibitorTarget.rdf,
                      :cs/subjectOfChange :loc.preservation/inhibitorTarget,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/inhibitorTarget,
                      :rdf/type           :cs/ChangeSet}]})