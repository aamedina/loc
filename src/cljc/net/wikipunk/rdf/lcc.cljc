(ns net.wikipunk.rdf.lcc
  "This ontology identifies the classes and properties used to describe LC Classfication data in RDF."
  {:dcterms/modified "2012-07-15",
   :owl/versionIRI "http://id.loc.gov/ontologies/lcc-1-0-0",
   :owl/versionInfo "1.0.0",
   :rdf/ns-prefix-map {"lcc" "http://id.loc.gov/ontologies/lcc#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://id.loc.gov/ontologies/lcc#",
   :rdfa/prefix "lcc",
   :rdfa/uri "http://id.loc.gov/ontologies/lcc#",
   :rdfs/comment
   "This ontology identifies the classes and properties used to describe LC Classfication data in RDF.",
   :rdfs/label "Ontology for Library of Congress Classification"})

(def ClassNumber
  "A ClassNumber is an assignable Resource. The class name and label refer to the resource's code, but a ClassNumber represents a distinct concept designed to describe another resource's \"aboutness.\""
  {:db/ident :lcc/ClassNumber,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A ClassNumber is an assignable Resource.  The class name and label refer to the resource's code, but a ClassNumber represents a distinct concept designed to describe another resource's \"aboutness.\"",
   :rdfs/label "Class Number",
   :rdfs/subClassOf :owl/Thing})

(def GuideTable
  "A Guide Table is a resource that contains a table rule. A Guide Table is associated with one or more Schedules; a Guide Table has one or more associated Tables. The Guide Table's table rule is the needed instruction to synthesize a classification number from the Schedule code and an associated Table's code."
  {:db/ident :lcc/GuideTable,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Guide Table is a resource that contains a table rule.  A Guide Table is associated with one or more Schedules; a Guide Table has one or more associated Tables.  The Guide Table's table rule is the needed instruction to synthesize a classification number from the Schedule code and an associated Table's code.",
   :rdfs/label "Guide Table",
   :rdfs/subClassOf :owl/Thing})

(def IndexTerm
  "Index Term"
  {:db/ident        :lcc/IndexTerm,
   :rdf/type        :owl/Class,
   :rdfs/label      "Index Term",
   :rdfs/subClassOf :owl/Thing})

(def Range
  "A Range resource is a resource whose code is a class number arrange. From the MARC Classification format, a Range resource is a Defined Range or Summary Range."
  {:db/ident :lcc/Range,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Range resource is a resource whose code is a class number arrange.  From the MARC Classification format, a Range resource is a Defined Range or Summary Range.",
   :rdfs/label "Range",
   :rdfs/subClassOf :owl/Thing})

(def Schedule
  "A Schedule resource contains classification data. It will have a code (classification number) associated with it, which may represent a DefinedRange, SummaryRange, or Topic. Its code could be assignable as is or it may require synthesis with a Table resource. A Schedule resource is used to derive an assignable classification topic/number/code. Therefore, a schedule resource is not assignable."
  {:db/ident :lcc/Schedule,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Schedule resource contains classification data.  It will have a code (classification number) associated with it, which may represent a DefinedRange, SummaryRange, or Topic.  Its code could be assignable as is or it may require synthesis with a Table resource.   A Schedule resource is used to derive an assignable classification topic/number/code.  Therefore, a schedule resource is not assignable.",
   :rdfs/label "LCC Schedule",
   :rdfs/subClassOf :owl/Thing})

(def Table
  "A Table resource has a code or code range designed to be combined with the code or code range from a Schedule resource according to the table rule from the Table's related Guide Table. A Table is not assignable."
  {:db/ident :lcc/Table,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Table resource has a code or code range designed to be combined with the code or code range from a Schedule resource according to the table rule from the Table's related Guide Table. A Table is not assignable.  ",
   :rdfs/label "Table",
   :rdfs/subClassOf :owl/Thing})

(def TableRule
  "A Table Rule resource describes the type of rule applied to the code of a Schedule with the code of a Table."
  {:db/ident :lcc/TableRule,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Table Rule resource describes the type of rule applied to the code of a Schedule with the code of a Table.",
   :rdfs/label "Table rule",
   :rdfs/subClassOf :owl/Thing})

(def invokeTableRule
  "Invoke Table Rule"
  {:db/ident    :lcc/invokeTableRule,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :lcc/GuideTable,
   :rdfs/label  "Invoke Table Rule",
   :rdfs/range  :lcc/TableRule})

(def isGuideTableFor
  "Associates a Guide Table with a Table."
  {:db/ident     :lcc/isGuideTableFor,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Associates a Guide Table with a Table.",
   :rdfs/domain  :lcc/GuideTable,
   :rdfs/label   "Is Guide Table For",
   :rdfs/range   :lcc/Table})

(def isTableFor
  "Associates a Table with its Guide Table, which contains the table rule."
  {:db/ident :lcc/isTableFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a Table with its Guide Table, which contains the table rule.",
   :rdfs/domain :lcc/Table,
   :rdfs/label "Is Table For",
   :rdfs/range :lcc/GuideTable})

(def rule
  "Rule"
  {:db/ident    :lcc/rule,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :lcc/TableRule,
   :rdfs/label  "Rule",
   :rdfs/range  :xsd/string})

(def ruleNumber
  "The number identifying the particular rule to be used."
  {:db/ident     :lcc/ruleNumber,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The number identifying the particular rule to be used.",
   :rdfs/domain  :lcc/TableRule,
   :rdfs/label   "Rule Number",
   :rdfs/range   :xsd/integer})

(def synthesizedFromSchedule
  "Synthesized From Schedule"
  {:db/ident    :lcc/synthesizedFromSchedule,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :lcc/ClassNumber,
   :rdfs/label  "Synthesized From Schedule",
   :rdfs/range  :lcc/Schedule})

(def synthesizedFromTable
  "Synthesized From Table"
  {:db/ident    :lcc/synthesizedFromTable,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :lcc/ClassNumber,
   :rdfs/label  "Synthesized From Table",
   :rdfs/range  :lcc/Table})

(def tableIdentification
  "A code that identifies a GuideTable or Table resource used in the synthesis of a ClassNumber."
  {:db/ident :lcc/tableIdentification,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A code that identifies a GuideTable or Table resource used in the synthesis of a ClassNumber.",
   :rdfs/domain {:owl/unionOf [:lcc/GuideTable :lcc/Table],
                 :rdf/type    :owl/Class},
   :rdfs/label "Table Identification",
   :rdfs/range :xsd/string})

(def useGuideTable
  "Associates a Schedule with a the Guide Table required to synthesize a Class Number."
  {:db/ident :lcc/useGuideTable,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a Schedule with a the Guide Table required to synthesize a Class Number.",
   :rdfs/domain :lcc/Schedule,
   :rdfs/label "Use Guide Table",
   :rdfs/range :lcc/GuideTable})

(def useWithSchedule
  "Associates a GuideTable with a Schedule that is used in the synthesis of a Class Number."
  {:db/ident :lcc/useWithSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a GuideTable with a Schedule that is used in the synthesis of a Class Number.",
   :rdfs/domain :lcc/GuideTable,
   :rdfs/label "Use With Schedule",
   :rdfs/range :lcc/Schedule})