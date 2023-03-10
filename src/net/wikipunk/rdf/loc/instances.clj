(ns net.wikipunk.rdf.loc.instances
  "<xhtml:div xmlns:xhtml=\"http://www.w3.org/1999/xhtml\" class=\"aboutCS\" property=\"rdfs:comment\" title=\"About the Instances Scheme:\"> <xhtml:p>These Instance descriptions from the BIBFRAME version of the Library of Congress Catalog were generated by converting the Library's MARC Bibliographic records to BIBFRAME Instance descriptions, but it also includes BIBFRAME descriptions created directly by catalogers. This database is a work in progress and the searching capabilities and description displays will be continuously modified and improved.</xhtml:p> <xhtml:p>The Instances are linked to their Works and their Items.</xhtml:p> </xhtml:div>"
  {:dcat/downloadURL "https://id.loc.gov/resources/instances.rdf",
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-06-20T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "modified"},
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "cc" "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.instances" "http://id.loc.gov/resources/instances/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://id.loc.gov/resources/instances",
   :rdfa/prefix "loc.instances",
   :rdfa/uri "http://id.loc.gov/resources/instances/",
   :rdfs/comment
   "\n      <xhtml:div xmlns:xhtml=\"http://www.w3.org/1999/xhtml\" class=\"aboutCS\" property=\"rdfs:comment\" title=\"About the Instances Scheme:\">\n                <xhtml:p>These Instance descriptions from the BIBFRAME version of the Library of Congress Catalog were generated by \n                converting the Library's MARC Bibliographic records to BIBFRAME Instance descriptions, but it also includes BIBFRAME \n                descriptions created directly by catalogers.  This database is a work in progress and the searching capabilities and \n                description displays will be continuously modified and improved.</xhtml:p>\n                <xhtml:p>The Instances are linked to their Works and their Items.</xhtml:p>\n            </xhtml:div>\n    ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Catalog Instances"}})