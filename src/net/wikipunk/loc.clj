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
   [net.wikipunk.rdf.madsrdf]
   [net.wikipunk.rdf.premis]
   [net.wikipunk.rdf.loc.record]
   [net.wikipunk.rdf.loc.identifiers]
   [net.wikipunk.rdf.loc.preservation]))

(defrecord LOC [vocab boot]
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this)

  rdf/NamespaceSpitter
  (emit [_ arg-map]
    (rdf/emit boot arg-map)))
