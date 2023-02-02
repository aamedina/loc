(ns net.wikipunk.loc.boot
  {:rdf/type :jsonld/Context})

(def record
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/ontologies/RecordInfo#"
   :rdfa/prefix "loc.record"})

(def identifiers
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/vocabulary/identifiers/"
   :rdfa/prefix "loc.identifiers"})

(def preservation
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/vocabulary/preservation/"
   :rdfa/prefix "loc.preservation"})
