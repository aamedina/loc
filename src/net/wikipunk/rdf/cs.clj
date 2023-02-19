(ns net.wikipunk.rdf.cs
  "The vocabulary introduces the notion of a ChangeSet which encapsulates the delta between two versions of a resource description. In this context a resource description is the set of triples that in some way comprise a description of a resource. The delta is represented by two sets of triples: additions and removals. A ChangeSet can be used to modify a resource description by first removing all triples from the description that are in the removals set and adding the triples in the additions set."
  {:dc11/creator ["http://iandavis.com/id/me" "Sam Tunnicliffe"],
   :dc11/date "2006-03-21",
   :dc11/identifier "http://purl.org/vocab/changeset/schema-20060321",
   :dc11/isVersionOf "http://purl.org/vocab/changeset/schema#",
   :dc11/issued "2005-12-14",
   :dc11/replaces "http://purl.org/vocab/changeset/schema-20051214",
   :dc11/rights "Copyright © 2005 Talis Information Ltd.",
   :dc11/title {:rdf/language "en",
                :rdf/value    "Changeset"},
   :dcat/downloadURL "https://vocab.org/changeset/schema-20090518.rdf",
   :rdf/ns-prefix-map {"cc"       "http://web.resource.org/cc/",
                       "cs"       "http://purl.org/vocab/changeset/schema#",
                       "dc11"     "http://purl.org/dc/terms/",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "foaf"     "http://xmlns.com/foaf/0.1/",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "vann"     "http://purl.org/vocab/vann/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cs",
   :rdfa/uri "http://purl.org/vocab/changeset/schema",
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "\n      The vocabulary introduces the notion of a ChangeSet which encapsulates the delta between two versions of a \n      resource description. In this context a resource description is the set of triples that in some way comprise a \n      description of a resource. The delta is represented by two sets of triples: additions and removals. A ChangeSet can be used to \n      modify a resource description by first removing all triples from the description that are in the removals set and\n      adding the triples in the additions set.\n    "}
    {:rdf/language "en",
     :rdf/value
     "\n      This vocabulary defines a set of terms for describing changes to resource descriptions.\n    "}],
   :skos/changeNote [{:dc11/creator "http://iandavis.com/id/me",
                      :dc11/date    "2006-03-21",
                      :rdfs/label   {:rdf/language "en",
                                     :rdf/value    "Improved documentation"}}
                     {:dc11/creator "http://iandavis.com/id/me",
                      :dc11/date    "2006-06-23",
                      :rdfs/label   {:rdf/language "en",
                                     :rdf/value    "Fixed invalid RDF"}}],
   :skos/historyNote
   [{:dc11/creator "http://iandavis.com/id/me",
     :dc11/date    "2006-03-21",
     :rdfs/label   {:rdf/language "en",
                    :rdf/value    "Introduced statement property"}}
    {:dc11/creator "http://iandavis.com/id/me",
     :dc11/date    "2009-05-18",
     :rdfs/label   {:rdf/language "en",
                    :rdf/value
                    "Updated dublin core properties to new namespace"}}],
   :vann/example
   ["http://vocab.org/changeset/changesets-example-20060321.html"
    "http://vocab.org/changeset/changesets-example2-20060321.html"
    "http://vocab.org/changeset/changesets-example3-20060321.html"],
   :vann/preferredNamespacePrefix "cs",
   :vann/preferredNamespaceUri "http://purl.org/vocab/changeset/schema#"})

(def ChangeSet
  "The encapsulation of a delta between two versions of a resource description"
  {:db/ident :cs/ChangeSet,
   :dc11/issued "2005-12-14",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://purl.org/vocab/changeset/schema",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ChangeSet"},
   :rdfs/subClassOf {:owl/intersectionOf [{:owl/minCardinality 1,
                                           :owl/onProperty     :cs/statement,
                                           :rdf/type           :owl/Restriction}
                                          {:owl/maxCardinality 1,
                                           :owl/onProperty
                                           :cs/previousChangeSet,
                                           :rdf/type :owl/Restriction}
                                          {:owl/maxCardinality 1,
                                           :owl/onProperty :cs/subjectOfChange,
                                           :rdf/type :owl/Restriction}
                                          {:owl/maxCardinality 1,
                                           :owl/onProperty     :cs/createdDate,
                                           :rdf/type           :owl/Restriction}
                                          {:owl/maxCardinality 1,
                                           :owl/onProperty     :cs/creatorName,
                                           :rdf/type           :owl/Restriction}
                                          {:owl/maxCardinality 1,
                                           :owl/onProperty :cs/changeReason,
                                           :rdf/type :owl/Restriction}],
                     :rdf/type :owl/Class},
   :skos/changeNote {:dc11/creator "Ian Davis",
                     :dc11/date    "2006-03-21",
                     :rdf/value    "Improved documentation"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The encapsulation of a delta between two versions of a resource description"},
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2006-03-21",
                      :rdf/value    "Added property cardinality restrictions"}})

(def addition
  "a triple to be added to the resource description"
  {:db/ident :cs/addition,
   :dc11/issued "2005-12-14",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "\n      By convention the subject of the triple being added should be the same as the subjectOfChange\n    "},
   :rdfs/domain :cs/ChangeSet,
   :rdfs/isDefinedBy "http://purl.org/vocab/changeset/schema",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "addition"},
   :rdfs/range :rdf/Statement,
   :rdfs/subPropertyOf :cs/statement,
   :skos/changeNote {:dc11/creator "Ian Davis",
                     :dc11/date    "2006-03-21",
                     :rdf/value    "Added definitition and documentation"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "a triple to be added to the resource description"},
   :skos/historyNote [{:dc11/creator "Ian Davis",
                       :dc11/date    "2006-03-21",
                       :rdf/value    "Made owl:ObjectProperty"}
                      {:dc11/creator "Ian Davis",
                       :dc11/date    "2006-03-21",
                       :rdf/value    "Made a sub-property of statement"}]})

(def changeReason
  "a short, human readable description of the purpose for the changeset"
  {:db/ident :cs/changeReason,
   :dc11/issued "2005-12-14",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :cs/ChangeSet,
   :rdfs/isDefinedBy "http://purl.org/vocab/changeset/schema",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "changeReason"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a  short, human readable description of the purpose for the changeset"},
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2006-03-21",
                      :rdf/value    "Made owl:DatatypeProperty"}})

(def createdDate
  "the date that the changeset was created"
  {:db/ident           :cs/createdDate,
   :dc11/issued        "2005-12-14",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "\n      The date should be in W3CDTF format\n    "},
   :rdfs/domain        :cs/ChangeSet,
   :rdfs/isDefinedBy   "http://purl.org/vocab/changeset/schema",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "createdDate"},
   :rdfs/subPropertyOf :dc11/date,
   :skos/definition    {:rdf/language "en",
                        :rdf/value "the date that the changeset was created"},
   :skos/historyNote   {:dc11/creator "Ian Davis",
                        :dc11/date    "2006-03-21",
                        :rdf/value    "Made owl:DatatypeProperty"}})

(def creatorName
  "the name of the entity responsible for creating the changeset"
  {:db/ident :cs/creatorName,
   :dc11/issued "2005-12-14",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :cs/ChangeSet,
   :rdfs/isDefinedBy "http://purl.org/vocab/changeset/schema",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "creatorName"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "the name of the entity responsible for creating the changeset"},
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2006-03-21",
                      :rdf/value    "Made owl:DatatypeProperty"}})

(def precedingChangeSet
  "the changeset that immediately precedes this one"
  {:db/ident :cs/precedingChangeSet,
   :dc11/issued "2005-12-14",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "\n      This property can be used to build a history of changes to a particular resource description. The first\n      ChangeSet in the history will have no precedingChangeSet property. Each subsequent ChangeSet added\n      to the history references the preceding one resulting in a singly-linked list of changes.  Care must be taken\n      not to introduce cycles in the history.\n    "}
    {:rdf/language "en",
     :rdf/value
     "\n      In systems that assume a closed world, the most recent ChangeSet for a particular resource description \n      can be discovered by looking for the ChangeSet that is not the value of a precedingChangeSet property. \n      Conversely, the earliest ChangeSet is the one that is not the subject of a precedingChangeSet property.\n    "}],
   :rdfs/domain :cs/ChangeSet,
   :rdfs/isDefinedBy "http://purl.org/vocab/changeset/schema",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "precedingChangeSet"},
   :rdfs/range :cs/ChangeSet,
   :skos/changeNote {:dc11/creator "Ian Davis",
                     :dc11/date    "2006-03-21",
                     :rdf/value    "Added definitition and documentation"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the changeset that immediately precedes this one"},
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2006-03-21",
                      :rdf/value    "Made owl:ObjectProperty"}})

(def removal
  "a triple to be removed from the resource description"
  {:db/ident :cs/removal,
   :dc11/issued "2005-12-14",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "\n      By convention the subject of the triple being removed should be the same as the subjectOfChange\n    "},
   :rdfs/domain :cs/ChangeSet,
   :rdfs/isDefinedBy "http://purl.org/vocab/changeset/schema",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "removal"},
   :rdfs/range :rdf/Statement,
   :rdfs/subPropertyOf :cs/statement,
   :skos/changeNote {:dc11/creator "Ian Davis",
                     :dc11/date    "2006-03-21",
                     :rdf/value    "Added definitition and documentation"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "a triple to be removed from the resource description"},
   :skos/historyNote [{:dc11/creator "Ian Davis",
                       :dc11/date    "2006-03-21",
                       :rdf/value    "Made owl:ObjectProperty"}
                      {:dc11/creator "Ian Davis",
                       :dc11/date    "2006-03-21",
                       :rdf/value    "Made a sub-property of statement"}]})

(def statement
  "a triple included in this set of changes"
  {:db/ident         :cs/statement,
   :dc11/issued      "2006-03-21",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :cs/ChangeSet,
   :rdfs/isDefinedBy "http://purl.org/vocab/changeset/schema",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "statement"},
   :rdfs/range       :rdf/Statement,
   :skos/definition  {:rdf/language "en",
                      :rdf/value "a triple included in this set of changes"}})

(def subjectOfChange
  "the resource to which this set of changes applies"
  {:db/ident         :cs/subjectOfChange,
   :dc11/issued      "2005-12-14",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :cs/ChangeSet,
   :rdfs/isDefinedBy "http://purl.org/vocab/changeset/schema",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "subjectOfChange"},
   :rdfs/range       :rdfs/Resource,
   :skos/changeNote  {:dc11/creator "Ian Davis",
                      :dc11/date    "2006-03-21",
                      :rdf/value    "Added definitition and documentation"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "the resource to which this set of changes applies"},
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2006-03-21",
                      :rdf/value    "Made owl:ObjectProperty"}})