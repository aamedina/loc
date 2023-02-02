(ns net.wikipunk.rdf.loc.edtf
  "http://id.loc.gov/datatypes/edtf/"
  {:dcat/downloadURL  "https://id.loc.gov/datatypes/edtf.rdf",
   :rdf/ns-prefix-map {"bf"       "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"     "http://id.loc.gov/ontologies/bflc/",
                       "cc"       "http://creativecommons.org/ns#",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "foaf"     "http://xmlns.com/foaf/0.1/",
                       "loc.edtf" "http://id.loc.gov/datatypes/edtf/",
                       "madsrdf"  "http://www.loc.gov/mads/rdf/v1#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"    "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.edtf",
   :rdfa/uri          "http://id.loc.gov/datatypes/edtf/"})

(def EDTF
  "Extended Date/Time Format"
  {:db/ident :loc.edtf/EDTF,
   :madsrdf/authoritativeLabel "Extended Date/Time Format",
   :madsrdf/code "EDTF",
   :madsrdf/isMemberOfMADSCollection :loc.edtf/collection_EDTFTypes,
   :madsrdf/isMemberOfMADSScheme :loc.datatypes/edtf,
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This datatype describes a date and time that adheres to features of EDTF Levels 0, 1, and 2."},
   :rdf/type [:rdfs/Datatype :owl/Class :skos/Concept :madsrdf/Authority],
   :skos/inScheme :loc.datatypes/edtf,
   :skos/notation "EDTF",
   :skos/prefLabel "Extended Date/Time Format",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This datatype describes a date and time that adheres to features of EDTF Levels 0, 1, and 2."}})

(def EDTF-level0
  "Extended Date/Time Format - Level 0"
  {:db/ident :loc.edtf/EDTF-level0,
   :madsrdf/authoritativeLabel "Extended Date/Time Format - Level 0",
   :madsrdf/code "EDTF-level0",
   :madsrdf/exampleNote
   [{:rdf/language "en",
     :rdf/value    "Date/Time: 2001-02-03T09:30:01"}
    {:rdf/language "en",
     :rdf/value
     "Interval: 2004-06/2006-08 (An interval with month precision, beginning sometime in June 2004 and ending sometime in August of 2006.\r\n2004-02-01/2005-02-08.)"}
    {:rdf/language "en",
     :rdf/value    "Date/Time: 2004-01-01T10:10:10+05:00"}
    {:rdf/language "en",
     :rdf/value    "Date/Time: 2004-01-01T10:10:10Z"}
    {:rdf/language "en",
     :rdf/value
     "Interval: 1964/2008 (An interval with year precision, beginning sometime in 1964 and ending sometime in 2008.)"}],
   :madsrdf/isMemberOfMADSCollection :loc.edtf/collection_EDTFTypes,
   :madsrdf/isMemberOfMADSScheme :loc.datatypes/edtf,
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Level 0 features describe dates, dates and times, and intervals.  The latter are represented by start and end dates. Level 0 supports ISO 8601 features and could be considered a profile of ISO 8601."},
   :rdf/type [:madsrdf/Authority :owl/Class :skos/Concept :rdfs/Datatype],
   :rdfs/subClassOf :loc.edtf/EDTF,
   :skos/example
   [{:rdf/language "en",
     :rdf/value    "Date/Time: 2004-01-01T10:10:10Z"}
    {:rdf/language "en",
     :rdf/value    "Date/Time: 2001-02-03T09:30:01"}
    {:rdf/language "en",
     :rdf/value
     "Interval: 1964/2008 (An interval with year precision, beginning sometime in 1964 and ending sometime in 2008.)"}
    {:rdf/language "en",
     :rdf/value    "Date/Time: 2004-01-01T10:10:10+05:00"}
    {:rdf/language "en",
     :rdf/value
     "Interval: 2004-06/2006-08 (An interval with month precision, beginning sometime in June 2004 and ending sometime in August of 2006. 2004-02-01/2005-02-08.)"}],
   :skos/inScheme :loc.datatypes/edtf,
   :skos/notation "EDTF-level0",
   :skos/prefLabel "Extended Date/Time Format - Level 0",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Level 0 features describe dates, dates and times, and intervals. The latter are represented by start and end dates. Level 0 supports ISO 8601 features and could be considered a profile of ISO 8601."}})

(def EDTF-level1
  "Extended Date/Time Format - Level 1"
  {:db/ident :loc.edtf/EDTF-level1,
   :madsrdf/authoritativeLabel "Extended Date/Time Format - Level 1",
   :madsrdf/code "EDTF-level1",
   :madsrdf/exampleNote
   [{:rdf/language "en",
     :rdf/value    "Unspecified: 1999-01-uu (some day in January 1999)"}
    {:rdf/language "en",
     :rdf/value
     "Uncertain/approximate: 1984? (uncertain: possibly the year 1984, but not definitely)"}
    {:rdf/language "en",
     :rdf/value    "Unspecified: 199u (some unspecified year in the 1990s)"}
    {:rdf/language "en",
     :rdf/value
     "Uncertain/approximate: 1984? (approximate: \"approximately\" the year 1984)"}
    {:rdf/language "en",
     :rdf/value
     "Extended interval: 1984/2004-06~ (interval beginning 1984 and ending approximately June 2004)"}],
   :madsrdf/isMemberOfMADSCollection :loc.edtf/collection_EDTFTypes,
   :madsrdf/isMemberOfMADSScheme :loc.datatypes/edtf,
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Level 1 features describe uncertain, approximate, or unspecified dates, including provisions for intervals."},
   :rdf/type [:rdfs/Datatype :owl/Class :madsrdf/Authority :skos/Concept],
   :rdfs/subClassOf :loc.edtf/EDTF,
   :skos/example
   [{:rdf/language "en",
     :rdf/value    "Unspecified: 1999-01-uu (some day in January 1999)"}
    {:rdf/language "en",
     :rdf/value
     "Uncertain/approximate: 1984? (approximate: \"approximately\" the year 1984)"}
    {:rdf/language "en",
     :rdf/value    "Unspecified: 199u (some unspecified year in the 1990s)"}
    {:rdf/language "en",
     :rdf/value
     "Extended interval: 1984/2004-06~ (interval beginning 1984 and ending approximately June 2004)"}
    {:rdf/language "en",
     :rdf/value
     "Uncertain/approximate: 1984? (uncertain: possibly the year 1984, but not definitely)"}],
   :skos/inScheme :loc.datatypes/edtf,
   :skos/notation "EDTF-level1",
   :skos/prefLabel "Extended Date/Time Format - Level 1",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Level 1 features describe uncertain, approximate, or unspecified dates, including provisions for intervals."}})

(def EDTF-level2
  "Extended Date/Time Format - Level 2"
  {:db/ident :loc.edtf/EDTF-level2,
   :madsrdf/authoritativeLabel "Extended Date/Time Format - Level 2",
   :madsrdf/code "EDTF-level2",
   :madsrdf/exampleNote
   [{:rdf/language "en",
     :rdf/value
     "Partial Uncertain/approximate: (2004-(06)~)? (Year uncertain and month is both uncertain and approximate)"}
    {:rdf/language "en",
     :rdf/value
     "Partial unspecified: 156u-12-25 (December 25 sometime during the 1560s)"}
    {:rdf/language "en",
     :rdf/value
     "Partial Uncertain/approximate: 2011-23~ (Approximate season (Autumn 2011))"}
    {:rdf/language "en",
     :rdf/value
     "Partial Uncertain/approximate: 2004-06-(11)~ (day is approximate; year, month known)"}],
   :madsrdf/isMemberOfMADSCollection :loc.edtf/collection_EDTFTypes,
   :madsrdf/isMemberOfMADSScheme :loc.datatypes/edtf,
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Level 2 features provide a way to describe dates that have elements, such as days or months, that are known but which also have elements that are uncertain, approximate, or unspecified.  Level 2 also describes dates that are part of a set. "},
   :rdf/type [:owl/Class :madsrdf/Authority :skos/Concept :rdfs/Datatype],
   :rdfs/subClassOf :loc.edtf/EDTF,
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "Partial unspecified: 156u-12-25 (December 25 sometime during the 1560s)"}
    {:rdf/language "en",
     :rdf/value
     "Partial Uncertain/approximate: 2011-23~ (Approximate season (Autumn 2011))"}
    {:rdf/language "en",
     :rdf/value
     "Partial Uncertain/approximate: 2004-06-(11)~ (day is approximate; year, month known)"}
    {:rdf/language "en",
     :rdf/value
     "Partial Uncertain/approximate: (2004-(06)~)? (Year uncertain and month is both uncertain and approximate)"}],
   :skos/inScheme :loc.datatypes/edtf,
   :skos/notation "EDTF-level2",
   :skos/prefLabel "Extended Date/Time Format - Level 2",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Level 2 features provide a way to describe dates that have elements, such as days or months, that are known but which also have elements that are uncertain, approximate, or unspecified. Level 2 also describes dates that are part of a set."}})

(def collection_EDTFTypes
  "This collection gathers all EDTF Types together."
  {:db/ident     :loc.edtf/collection_EDTFTypes,
   :madsrdf/hasMADSCollectionMember [:loc.edtf/EDTF-level1
                                     :loc.edtf/EDTF-level0
                                     :loc.edtf/EDTF-level2
                                     :loc.edtf/EDTF],
   :rdf/type     [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment "This collection gathers all EDTF Types together.",
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "EDTF Collection"},
   :skos/member  [:loc.edtf/EDTF-level0
                  :loc.edtf/EDTF-level1
                  :loc.edtf/EDTF-level2
                  :loc.edtf/EDTF]})

(def ^{:private true} edtf
  "Extended Date/Time Format Datatypes Scheme collects the three different datatypes, one each pertaining to a EDTF level."
  {:db/ident :loc.datatypes/edtf,
   :madsrdf/hasMADSSchemeMember [:loc.edtf/EDTF-level2
                                 :loc.edtf/EDTF-level1
                                 :loc.edtf/EDTF-level0
                                 :loc.edtf/EDTF],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "Extended Date/Time Format Datatypes Scheme collects the three different datatypes, one each pertaining to a EDTF level.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extended Date/Time Format Datatypes Scheme"}})
