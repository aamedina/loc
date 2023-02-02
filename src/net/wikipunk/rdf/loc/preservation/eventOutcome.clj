(ns net.wikipunk.rdf.loc.preservation.eventOutcome
  "http://id.loc.gov/vocabulary/preservation/eventOutcome/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/eventOutcome.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.eventOutcome"
    "http://id.loc.gov/vocabulary/preservation/eventOutcome/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.eventOutcome",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/eventOutcome/"})

(def fai
  "fail"
  {:db/ident :loc.preservation.eventOutcome/fai,
   :madsrdf/authoritativeLabel "fail",
   :rdf/type :madsrdf/Authority})

(def suc
  "success"
  {:db/ident :loc.preservation.eventOutcome/suc,
   :madsrdf/authoritativeLabel "success",
   :rdf/type :madsrdf/Authority})

(def war
  "warning"
  {:db/ident :loc.preservation.eventOutcome/war,
   :madsrdf/authoritativeLabel "warning",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} eventOutcome
  "A categorization of the overall result of the Event in terms of success, partial success, or failure."
  {:db/ident :loc.preservation/eventOutcome,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2018-09-24T04:00:01.000-00:00",
                           :ri/recordContentSource :loc.preservation/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/hasMADSSchemeMember [:loc.preservation.eventOutcome/fai
                                 :loc.preservation.eventOutcome/suc
                                 :loc.preservation.eventOutcome/war],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "A categorization of the overall result of the Event in terms of success, partial success, or failure.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Outcome"},
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation/dlc,
                     :cs/subjectOfChange :loc.preservation/eventOutcome,
                     :rdf/type           :cs/ChangeSet}})