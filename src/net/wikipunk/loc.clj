(ns net.wikipunk.loc
  "Library of Congress"
  (:require
   [clojure.string :as str]
   [com.stuartsierra.component :as com]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.loc.boot]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf.bf]
   [net.wikipunk.rdf.bflc]
   [net.wikipunk.rdf.cs]
   [net.wikipunk.rdf.foaf]
   [net.wikipunk.rdf.geo]
   [net.wikipunk.rdf.madsrdf]
   [net.wikipunk.rdf.premis]   
   [net.wikipunk.rdf.dc11]
   [net.wikipunk.rdf.dcterms]
   [net.wikipunk.rdf.dcam]
   [net.wikipunk.rdf.prov]
   [net.wikipunk.rdf.schema]
   [net.wikipunk.rdf.skos]
   [net.wikipunk.rdf.skosxl]
   [net.wikipunk.rdf.vs]))

(declare quickstart)

(defrecord LOC [vocab boot]
  com/Lifecycle
  (start [this]
    (quickstart)
    this)
  (stop [this]
    this)

  rdf/NamespaceSpitter
  (emit [_ arg-map]
    (rdf/emit boot arg-map)))

(defn quickstart
  []
  (try
    (require 'net.wikipunk.rdf.lcc
             'net.wikipunk.rdf.ri
             'net.wikipunk.rdf.identifiers)
    (catch Throwable ex
      (clojure.repl/pst ex))))
