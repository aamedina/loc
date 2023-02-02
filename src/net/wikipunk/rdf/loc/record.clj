(ns net.wikipunk.rdf.loc.record
  "This document describes the Record Info vocabulary. It is a simple data model for administrative metadata. It is used by MADS/RDF."
  {:dcterms/modified "2020-03-05",
   :owl/ontologyIRI "http://id.loc.gov/ontologies/RecordInfo#",
   :owl/versionIRI "http://id.loc.gov/ontologies/RecordInfo-1-0-0",
   :owl/versionInfo "1.0.0",
   :rdf/ns-prefix-map {"loc.record" "http://id.loc.gov/ontologies/RecordInfo#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://id.loc.gov/ontologies/RecordInfo#",
   :rdfa/prefix "loc.record",
   :rdfa/uri "http://id.loc.gov/ontologies/RecordInfo#",
   :rdfs/comment
   "This document describes the Record Info vocabulary. It is a simple data model for administrative metadata. It is used by MADS/RDF.",
   :rdfs/label "Record Info"})

(def RecordInfo
  "A resource that captures administrative metadata of a related resource."
  {:db/ident :loc.record/RecordInfo,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A resource that captures administrative metadata of a related resource.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RecordInfo"}})

(def descriptionStandard
  "Description standard to which the description of the related resource conforms."
  {:db/ident :loc.record/descriptionStandard,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "Description standard to which the description of the related resource conforms.",
   :rdfs/label "Description Standard"})

(def languageofCataloging
  "Primary language used in describing the related resource."
  {:db/ident     :loc.record/languageofCataloging,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Primary language used in describing the related resource.",
   :rdfs/label   "Language of Cataloging"})

(def recordChangeDate
  "Date associated with the related resource's state or event in its lifecycle."
  {:db/ident :loc.record/recordChangeDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Date associated with the related resource's state or event in its lifecycle.",
   :rdfs/label "Change Date"})

(def recordChangeNote
  "Note describing the nature of a change to the related resource captured with this Record Info resource."
  {:db/ident :loc.record/recordChangeNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "Note describing the nature of a change to the related resource captured with this Record Info resource.",
   :rdfs/label "Change Note"})

(def recordContentSource
  "Source - typically an Organization - of the description of the related resource."
  {:db/ident :loc.record/recordContentSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Source - typically an Organization - of the description of the related resource.",
   :rdfs/label "Content Source"})

(def recordStatus
  "Status of related resource. Similar to the state of the related resource at a specific point in time or an event in the life of a resource."
  {:db/ident :loc.record/recordStatus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Status of related resource. Similar to the state of the related resource at a specific point in time or an event in the life of a resource.",
   :rdfs/label "Status"})