(ns net.wikipunk.rdf.loc.preservation.preservationLevelRole
  "http://id.loc.gov/vocabulary/preservation/preservationLevelRole/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/preservationLevelRole.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.preservationLevelRole"
    "http://id.loc.gov/vocabulary/preservation/preservationLevelRole/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.preservationLevelRole",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/preservationLevelRole/"}
  (:refer-clojure :exclude [int]))

(def cap
  "An indication of the level at which an institution is currently capable of preserving an object."
  {:db/ident :loc.preservation.preservationLevelRole/cap,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.preservationLevelRole/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.preservationLevelRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.preservationLevelRole/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "capability",
   :madsrdf/code "cap",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An indication of the level at which an institution is currently capable of preserving an object."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.preservationLevelRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/preservationLevelRole],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/policy,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.preservationLevelRole/dlc,
     :cs/subjectOfChange :loc.preservation.preservationLevelRole/cap,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.preservationLevelRole/dlc,
     :cs/subjectOfChange :loc.preservation.preservationLevelRole/cap,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.preservationLevelRole/dlc,
     :cs/subjectOfChange :loc.preservation.preservationLevelRole/cap,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An indication of the level at which an institution is currently capable of preserving an object."},
   :skos/inScheme [:loc.preservation/preservationLevelRole
                   :loc.vocabulary/preservation],
   :skos/notation "cap",
   :skos/prefLabel "capability"})

(def int
  "An indication of the level at which an institution intends to preserve an object, which may vary from current capability."
  {:db/ident :loc.preservation.preservationLevelRole/int,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.preservationLevelRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.preservationLevelRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.preservationLevelRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "intention",
   :madsrdf/code "int",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An indication of the level at which an institution intends to preserve an object, which may vary from current capability."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.preservationLevelRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/preservationLevelRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/policy,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.preservationLevelRole/dlc,
     :cs/subjectOfChange :loc.preservation.preservationLevelRole/int,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.preservationLevelRole/dlc,
     :cs/subjectOfChange :loc.preservation.preservationLevelRole/int,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.preservationLevelRole/dlc,
     :cs/subjectOfChange :loc.preservation.preservationLevelRole/int,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An indication of the level at which an institution intends to preserve an object, which may vary from current capability."},
   :skos/inScheme [:loc.preservation/preservationLevelRole
                   :loc.vocabulary/preservation],
   :skos/notation "int",
   :skos/prefLabel "intention"})

(def req
  "An indication of the level at which an institution is obligated to preserve an object, for example for legal reasons."
  {:db/ident :loc.preservation.preservationLevelRole/req,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.preservationLevelRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.preservationLevelRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.preservationLevelRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "requirement",
   :madsrdf/code "req",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An indication of the level at which an institution is obligated to preserve an object, for example for legal reasons."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.preservationLevelRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/preservationLevelRole],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/policy,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.preservationLevelRole/dlc,
     :cs/subjectOfChange :loc.preservation.preservationLevelRole/req,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.preservationLevelRole/dlc,
     :cs/subjectOfChange :loc.preservation.preservationLevelRole/req,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.preservationLevelRole/dlc,
     :cs/subjectOfChange :loc.preservation.preservationLevelRole/req,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An indication of the level at which an institution is obligated to preserve an object, for example for legal reasons."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/preservationLevelRole],
   :skos/notation "req",
   :skos/prefLabel "requirement"})

(def ^{:private true} preservationLevelRole
  "Preservation Level Role"
  {:db/ident        :loc.preservation/preservationLevelRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.preservationLevelRole/int
                                 :loc.preservation.preservationLevelRole/cap
                                 :loc.preservation.preservationLevelRole/req],
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "Preservation Level Role",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Preservation Level Role"},
   :skos/changeNote [{:cs/changeReason "modified",
                      :cs/createdDate #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/dlc,
                      :cs/subjectOfChange
                      :loc.preservation/preservationLevelRole,
                      :rdf/type :cs/ChangeSet}
                     {:cs/changeReason "modified",
                      :cs/createdDate #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/dlc,
                      :cs/subjectOfChange
                      :loc.preservation/preservationLevelRole,
                      :rdf/type :cs/ChangeSet}
                     {:cs/changeReason "new",
                      :cs/createdDate #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/dlc,
                      :cs/subjectOfChange
                      :loc.preservation/preservationLevelRole,
                      :rdf/type :cs/ChangeSet}]})