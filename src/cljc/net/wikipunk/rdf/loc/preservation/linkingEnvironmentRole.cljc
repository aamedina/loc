(ns net.wikipunk.rdf.loc.preservation.linkingEnvironmentRole
  "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.linkingEnvironmentRole"
    "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.linkingEnvironmentRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole/"})

(def byt
  "The object is represented as programming code that, once compiled, is run through a virtual machine instead of the computer's processor."
  {:db/ident :loc.preservation.linkingEnvironmentRole/byt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingEnvironmentRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingEnvironmentRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "byte code",
   :madsrdf/code "byt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The object is represented as programming code that, once compiled, is run through a virtual machine instead of the computer's processor."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.linkingEnvironmentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/linkingEnvironmentRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.linkingEnvironmentRole/dlc,
     :cs/subjectOfChange :loc.preservation.linkingEnvironmentRole/byt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.linkingEnvironmentRole/dlc,
     :cs/subjectOfChange :loc.preservation.linkingEnvironmentRole/byt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The object is represented as programming code that, once compiled, is run through a virtual machine instead of the computer's processor."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/linkingEnvironmentRole],
   :skos/notation "byt",
   :skos/prefLabel "byte code"})

(def dis
  "The object is represented as an exact copy of the computer's hard drive."
  {:db/ident :loc.preservation.linkingEnvironmentRole/dis,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingEnvironmentRole/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingEnvironmentRole/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "disk image",
   :madsrdf/code "dis",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The object is represented as an exact copy of the computer's hard drive."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.linkingEnvironmentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/linkingEnvironmentRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.linkingEnvironmentRole/dlc,
     :cs/subjectOfChange :loc.preservation.linkingEnvironmentRole/dis,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.linkingEnvironmentRole/dlc,
     :cs/subjectOfChange :loc.preservation.linkingEnvironmentRole/dis,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The object is represented as an exact copy of the computer's hard drive."},
   :skos/inScheme [:loc.preservation/linkingEnvironmentRole
                   :loc.vocabulary/preservation],
   :skos/notation "dis",
   :skos/prefLabel "disk image"})

(def sou
  "The object is represented as program instructions in their original form written by developers, not directly executable by the computer."
  {:db/ident :loc.preservation.linkingEnvironmentRole/sou,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingEnvironmentRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingEnvironmentRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "source code",
   :madsrdf/code "sou",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The object is represented as program instructions in their original form written by developers, not directly executable by the computer."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.linkingEnvironmentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/linkingEnvironmentRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.linkingEnvironmentRole/dlc,
     :cs/subjectOfChange :loc.preservation.linkingEnvironmentRole/sou,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.linkingEnvironmentRole/dlc,
     :cs/subjectOfChange :loc.preservation.linkingEnvironmentRole/sou,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The object is represented as program instructions in their original form written by developers, not directly executable by the computer."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/linkingEnvironmentRole],
   :skos/notation "sou",
   :skos/prefLabel "source code"})

(def ^{:private true} linkingEnvironmentRole
  "The role of the environment object associated with the agent, which allows one to record in what form the software or hardware has been preserved in the repository."
  {:db/ident :loc.preservation/linkingEnvironmentRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.linkingEnvironmentRole/sou
                                 :loc.preservation.linkingEnvironmentRole/dis
                                 :loc.preservation.linkingEnvironmentRole/byt],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment
   "The role of the environment object associated with the agent, which allows one to record in what form the software or hardware has been preserved in the repository.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Linking Environment Role"},
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/linkingEnvironmentRole,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/linkingEnvironmentRole,
     :rdf/type           :cs/ChangeSet}]})