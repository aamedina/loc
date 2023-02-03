(ns net.wikipunk.rdf.loc.mprojection
  "http://id.loc.gov/vocabulary/mprojection/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mprojection.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mprojection"
                       "http://id.loc.gov/vocabulary/mprojection/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mprojection",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mprojection/"})

(def aa
  "A modified azimuthal map projection presented by David A. Aitoff in 1889"
  {:db/ident :loc.mprojection/aa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Aitoff",
   :madsrdf/code "aa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A modified azimuthal map projection presented by David A. Aitoff in 1889"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - aa"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/aa,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A modified azimuthal map projection presented by David A. Aitoff in 1889"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - aa"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "aa",
   :skos/prefLabel "Aitoff"})

(def ab
  "Projection used for plottting arcs as straight lines on a map"
  {:db/ident :loc.mprojection/ab,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gnomic",
   :madsrdf/code "ab",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Projection used for plottting arcs as straight lines on a map"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - ab"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/ab,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Projection used for plottting arcs as straight lines on a map"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - ab"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "ab",
   :skos/prefLabel "Gnomic"})

(def ac
  "Equal-area projection mapping from a sphere to a disk"
  {:db/ident :loc.mprojection/ac,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lambert's azimuthal equal area",
   :madsrdf/code "ac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Equal-area projection mapping from a sphere to a disk"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - ac"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/ac,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Equal-area projection mapping from a sphere to a disk"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - ac"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "ac",
   :skos/prefLabel "Lambert's azimuthal equal area"})

(def ad
  "Projection that represents three-dimensional objects in two dimensions"
  {:db/ident :loc.mprojection/ad,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Orthographic",
   :madsrdf/code "ad",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection that represents three-dimensional objects in two dimensions"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - ad"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/ad,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection that represents three-dimensional objects in two dimensions"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - ad"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "ad",
   :skos/prefLabel "Orthographic"})

(def ae
  "Projection where all points on the map are at proportionally correct distances from the center point"
  {:db/ident :loc.mprojection/ae,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Azimuthal equidistant",
   :madsrdf/code "ae",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection where all points on the map are at proportionally correct distances from the center point"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - ae"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/ae,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection where all points on the map are at proportionally correct distances from the center point"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - ae"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "ae",
   :skos/prefLabel "Azimuthal equidistant"})

(def af
  "Mapping that projects a sphere onto a plane"
  {:db/ident :loc.mprojection/af,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Stereographic",
   :madsrdf/code "af",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Mapping that projects a sphere onto a plane"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - af"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/af,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Mapping that projects a sphere onto a plane"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - af"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "af",
   :skos/prefLabel "Stereographic"})

(def ag
  "Projection comprised of the height of perspective point above surface, longitude of projection center, latitude of projection center, false easting and false northing"
  {:db/ident :loc.mprojection/ag,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "General vertical near-sided",
   :madsrdf/code "ag",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection comprised of the height of perspective point above surface, longitude of projection center, latitude of projection center, false easting and false northing"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - ag"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/ag,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection comprised of the height of perspective point above surface, longitude of projection center, latitude of projection center, false easting and false northing"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - ag"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "ag",
   :skos/prefLabel "General vertical near-sided"})

(def am
  "Stereographic projection developed by the USGS to publish a map of Alaska at 1:2500000 scale"
  {:db/ident :loc.mprojection/am,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Modified stereographic for Alaska",
   :madsrdf/code "am",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Stereographic projection developed by the USGS to publish a map of Alaska at 1:2500000 scale"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - am"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/am,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Stereographic projection developed by the USGS to publish a map of Alaska at 1:2500000 scale"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - am"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "am",
   :skos/prefLabel "Modified stereographic for Alaska"})

(def an
  "Projection using triangulation that was presented by Wellman Chamberlin in 1946"
  {:db/ident :loc.mprojection/an,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Chamberlin trimetric",
   :madsrdf/code "an",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection using triangulation that was presented by Wellman Chamberlin in 1946"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - an"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/an,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection using triangulation that was presented by Wellman Chamberlin in 1946"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - an"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "an",
   :skos/prefLabel "Chamberlin trimetric"})

(def ap
  "Projection equivalent where the central point is either the North Pole or South Pole"
  {:db/ident :loc.mprojection/ap,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Polar stereographic",
   :madsrdf/code "ap",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection equivalent where the central point is either the North Pole or South Pole"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - ap"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/ap,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection equivalent where the central point is either the North Pole or South Pole"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - ap"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "ap",
   :skos/prefLabel "Polar stereographic"})

(def au
  "Only the azimuthal projection type is known -- not the specific projection"
  {:db/ident :loc.mprojection/au,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Azimuthal, specific type unknown",
   :madsrdf/code "au",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Only the azimuthal projection type is known -- not the specific projection"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - au"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/au,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Only the azimuthal projection type is known -- not the specific projection"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - au"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "au",
   :skos/prefLabel "Azimuthal, specific type unknown"})

(def az
  "Azimuthal projection for which none of the other defined codes are appropriate"
  {:db/ident :loc.mprojection/az,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Azimuthal, other",
   :madsrdf/code "az",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Azimuthal projection for which none of the other defined codes are appropriate"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - az"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/az,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Azimuthal projection for which none of the other defined codes are appropriate"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - az"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "az",
   :skos/prefLabel "Azimuthal, other"})

(def ba
  "Cylindrical projection presented by James Gall in 1855"
  {:db/ident :loc.mprojection/ba,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gall",
   :madsrdf/code "ba",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Cylindrical projection presented by James Gall in 1855"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - ba"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/ba,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Cylindrical projection presented by James Gall in 1855"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - ba"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "ba",
   :skos/prefLabel "Gall"})

(def bb
  "Pseudocylindrical composite projection presented by J. Paul Goode in 1923"
  {:db/ident :loc.mprojection/bb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Goode's homolographic",
   :madsrdf/code "bb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Pseudocylindrical composite projection presented by J. Paul Goode in 1923"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bb"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Pseudocylindrical composite projection presented by J. Paul Goode in 1923"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bb"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bb",
   :skos/prefLabel "Goode's homolographic"})

(def bc
  "Cylindrical equal-area projection attributed to Johann Lambert in 1772"
  {:db/ident :loc.mprojection/bc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lambert's cylindrical equal area",
   :madsrdf/code "bc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Cylindrical equal-area projection attributed to Johann Lambert in 1772"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bc"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Cylindrical equal-area projection attributed to Johann Lambert in 1772"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bc"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bc",
   :skos/prefLabel "Lambert's cylindrical equal area"})

(def bd
  "Cylindrical map projection presented by Geradus Marcator in 1569"
  {:db/ident :loc.mprojection/bd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Mercator",
   :madsrdf/code "bd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Cylindrical map projection presented by Geradus Marcator in 1569"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bd"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Cylindrical map projection presented by Geradus Marcator in 1569"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bd"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bd",
   :skos/prefLabel "Mercator"})

(def be
  "A modified Mercator projection presented by Osborn Maitland Miller in 1942"
  {:db/ident :loc.mprojection/be,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Miller",
   :madsrdf/code "be",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A modified Mercator projection presented by Osborn Maitland Miller in 1942"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - be"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/be,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A modified Mercator projection presented by Osborn Maitland Miller in 1942"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - be"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "be",
   :skos/prefLabel "Miller"})

(def bf
  "An equal-area pseudocylindrical map projection"
  {:db/ident :loc.mprojection/bf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Mollweide",
   :madsrdf/code "bf",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "An equal-area pseudocylindrical map projection"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bf"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An equal-area pseudocylindrical map projection"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bf"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bf",
   :skos/prefLabel "Mollweide"})

(def bg
  "A pseudoclindrical equal-area map projection"
  {:db/ident :loc.mprojection/bg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Sinusoidal",
   :madsrdf/code "bg",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A pseudoclindrical equal-area map projection"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bg"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bg,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "A pseudoclindrical equal-area map projection"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bg"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bg",
   :skos/prefLabel "Sinusoidal"})

(def bh
  "An adaptation of the standard Mercator projection"
  {:db/ident :loc.mprojection/bh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Transverse Mercator",
   :madsrdf/code "bh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "An adaptation of the standard Mercator projection"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bh"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bh,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An adaptation of the standard Mercator projection"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bh"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bh",
   :skos/prefLabel "Transverse Mercator"})

(def bi
  "A system using Transverse Mercator projections to map the world into standard zones that are six degrees wide"
  {:db/ident :loc.mprojection/bi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gauss-Kruger",
   :madsrdf/code "bi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A system using Transverse Mercator projections to map the world into standard zones that are six degrees wide"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bi"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bi,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A system using Transverse Mercator projections to map the world into standard zones that are six degrees wide"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bi"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bi",
   :skos/prefLabel "Gauss-Kruger"})

(def bj
  "Simple map projection attributed to Marinus of Tyre"
  {:db/ident :loc.mprojection/bj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Equirectangular",
   :madsrdf/code "bj",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Simple map projection attributed to Marinus of Tyre"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bj"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bj,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Simple map projection attributed to Marinus of Tyre"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bj"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bj",
   :skos/prefLabel "Equirectangular"})

(def bk
  "Conic projection presented by Josef Krovák and used in in Czech Republic and Slovakia"
  {:db/ident :loc.mprojection/bk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Krovak",
   :madsrdf/code "bk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Conic projection presented by Josef Krovák and used in in Czech Republic and Slovakia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bk"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bk,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Conic projection presented by Josef Krovák and used in in Czech Republic and Slovakia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bk"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bk",
   :skos/prefLabel "Krovak"})

(def bl
  "A transverse cylindrical projection presented by César-François Cassini de Thury in 1745"
  {:db/ident :loc.mprojection/bl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Cassini-Soldner",
   :madsrdf/code "bl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A transverse cylindrical projection presented by César-François Cassini de Thury in 1745"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bl"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bl,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transverse cylindrical projection presented by César-François Cassini de Thury in 1745"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bl"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bl",
   :skos/prefLabel "Cassini-Soldner"})

(def bo
  "An oblique rotation of the Mercator projection"
  {:db/ident :loc.mprojection/bo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Oblique Mercator",
   :madsrdf/code "bo",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "An oblique rotation of the Mercator projection"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bo"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An oblique rotation of the Mercator projection"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bo"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bo",
   :skos/prefLabel "Oblique Mercator"})

(def br
  "A compromise map projection presented by Arthur H. Robinson in 1961"
  {:db/ident :loc.mprojection/br,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Robinson",
   :madsrdf/code "br",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A compromise map projection presented by Arthur H. Robinson in 1961"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - br"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/br,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A compromise map projection presented by Arthur H. Robinson in 1961"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - br"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "br",
   :skos/prefLabel "Robinson"})

(def bs
  "Projection created by John Parr Snyder to continually map the Earth's surface using Landsat data"
  {:db/ident :loc.mprojection/bs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Space oblique Mercator",
   :madsrdf/code "bs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection created by John Parr Snyder to continually map the Earth's surface using Landsat data"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bs"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bs,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection created by John Parr Snyder to continually map the Earth's surface using Landsat data"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bs"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bs",
   :skos/prefLabel "Space oblique Mercator"})

(def bu
  "Only the cylindrical projection type is known -- not the specific projection"
  {:db/ident :loc.mprojection/bu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Cylindrical, specific type unknown",
   :madsrdf/code "bu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Only the cylindrical projection type is known -- not the specific projection"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bu"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bu,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Only the cylindrical projection type is known -- not the specific projection"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bu"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bu",
   :skos/prefLabel "Cylindrical, specific type unknown"})

(def bz
  "Cylindrical projection for which none of the other defined codes are appropriate"
  {:db/ident :loc.mprojection/bz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Cylindrical, other",
   :madsrdf/code "bz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Cylindrical projection for which none of the other defined codes are appropriate"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - bz"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/bz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Cylindrical projection for which none of the other defined codes are appropriate"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - bz"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "bz",
   :skos/prefLabel "Cylindrical, other"})

(def ca
  "Conic equal area map projection presented by Henrich C. Albers"
  {:db/ident :loc.mprojection/ca,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Alber's equal area",
   :madsrdf/code "ca",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Conic equal area map projection presented by Henrich C. Albers"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - ca"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/ca,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Conic equal area map projection presented by Henrich C. Albers"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - ca"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "ca",
   :skos/prefLabel "Alber's equal area"})

(def cb
  "Pseudoconical equal-area map projection named after Rigobert Bonne"
  {:db/ident :loc.mprojection/cb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bonne",
   :madsrdf/code "cb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Pseudoconical equal-area map projection named after Rigobert Bonne"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - cb"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/cb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Pseudoconical equal-area map projection named after Rigobert Bonne"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - cb"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "cb",
   :skos/prefLabel "Bonne"})

(def cc
  "Conic map projection that portrays shape more accurately than area"
  {:db/ident :loc.mprojection/cc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lambert's conformal conic",
   :madsrdf/code "cc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Conic map projection that portrays shape more accurately than area"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - cc"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/cc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Conic map projection that portrays shape more accurately than area"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - cc"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "cc",
   :skos/prefLabel "Lambert's conformal conic"})

(def ce
  "Projection based on one or two standard parallels where all circular parallels are spaced evenly along the meridians"
  {:db/ident :loc.mprojection/ce,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Equidistant conic",
   :madsrdf/code "ce",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection based on one or two standard parallels where all circular parallels are spaced evenly along the meridians"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - ce"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/ce,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection based on one or two standard parallels where all circular parallels are spaced evenly along the meridians"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - ce"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "ce",
   :skos/prefLabel "Equidistant conic"})

(def cp
  "A projection whose parallels are all non-concentric circular arcs"
  {:db/ident :loc.mprojection/cp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Polyconic",
   :madsrdf/code "cp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A projection whose parallels are all non-concentric circular arcs"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - cp"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/cp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A projection whose parallels are all non-concentric circular arcs"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - cp"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "cp",
   :skos/prefLabel "Polyconic"})

(def cu
  "Only the conic projection type is known -- not the specific projection"
  {:db/ident :loc.mprojection/cu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Conic, specific type unknown",
   :madsrdf/code "cu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Only the conic projection type is known -- not the specific projection"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - cu"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/cu,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Only the conic projection type is known -- not the specific projection"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - cu"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "cu",
   :skos/prefLabel "Conic, specific type unknown"})

(def cz
  "Conic projection for which none of the other defined codes are appropriate"
  {:db/ident :loc.mprojection/cz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Conic, other",
   :madsrdf/code "cz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Conic projection for which none of the other defined codes are appropriate"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - cz"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/cz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Conic projection for which none of the other defined codes are appropriate"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - cz"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "cz",
   :skos/prefLabel "Conic, other"})

(def da
  "Projection presented by Erwin Raisz in 1943 that is neither conformal nor equal-area"
  {:db/ident :loc.mprojection/da,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Armadillo",
   :madsrdf/code "da",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection presented by Erwin Raisz in 1943 that is neither conformal nor equal-area"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - da"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/da,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection presented by Erwin Raisz in 1943 that is neither conformal nor equal-area"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - da"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "da",
   :skos/prefLabel "Armadillo"})

(def db
  "Projection of the globe as a truncated octahedron presented by Steve Waterman in 1996"
  {:db/ident :loc.mprojection/db,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Butterfly",
   :madsrdf/code "db",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection of the globe as a truncated octahedron presented by Steve Waterman in 1996"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - db"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/db,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection of the globe as a truncated octahedron presented by Steve Waterman in 1996"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - db"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "db",
   :skos/prefLabel "Butterfly"})

(def dc
  "An equal-area pseudocylindrical map projection presented by Max Eckert-Greifendorff in 1906"
  {:db/ident :loc.mprojection/dc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Eckert",
   :madsrdf/code "dc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An equal-area pseudocylindrical map projection presented by Max Eckert-Greifendorff in 1906"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - dc"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/dc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An equal-area pseudocylindrical map projection presented by Max Eckert-Greifendorff in 1906"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - dc"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "dc",
   :skos/prefLabel "Eckert"})

(def dd
  "An interrupted pseudocylindrical equal-area projection designed to minimize distortion for the entire world"
  {:db/ident :loc.mprojection/dd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Goode's homolosine",
   :madsrdf/code "dd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An interrupted pseudocylindrical equal-area projection designed to minimize distortion for the entire world"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - dd"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/dd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An interrupted pseudocylindrical equal-area projection designed to minimize distortion for the entire world"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - dd"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "dd",
   :skos/prefLabel "Goode's homolosine"})

(def de
  "A conformal projection that consists of two oblique conic projections"
  {:db/ident :loc.mprojection/de,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Miller's bipolar oblique conformal conic",
   :madsrdf/code "de",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A conformal projection that consists of two oblique conic projections"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - de"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/de,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A conformal projection that consists of two oblique conic projections"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - de"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "de",
   :skos/prefLabel "Miller's bipolar oblique conformal conic"})

(def df
  "Compromise projection presented by Alphons J. van der Grinten in 1904"
  {:db/ident :loc.mprojection/df,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Van Der Grinten",
   :madsrdf/code "df",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Compromise projection presented by Alphons J. van der Grinten in 1904"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - df"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/df,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Compromise projection presented by Alphons J. van der Grinten in 1904"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - df"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "df",
   :skos/prefLabel "Van Der Grinten"})

(def dg
  "Projection of a world map onto the surface of an icosahedron presented by Buckminster Fuller in 1943"
  {:db/ident :loc.mprojection/dg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dimaxion",
   :madsrdf/code "dg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Projection of a world map onto the surface of an icosahedron presented by Buckminster Fuller in 1943"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - dg"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/dg,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Projection of a world map onto the surface of an icosahedron presented by Buckminster Fuller in 1943"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - dg"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "dg",
   :skos/prefLabel "Dimaxion"})

(def dh
  "A pseudoconic projection in the shape of a heart"
  {:db/ident :loc.mprojection/dh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Cordiform",
   :madsrdf/code "dh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A pseudoconic projection in the shape of a heart"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - dh"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/dh,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A pseudoconic projection in the shape of a heart"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - dh"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "dh",
   :skos/prefLabel "Cordiform"})

(def dl
  "A conformal projection using equal-area circles on the map surface"
  {:db/ident :loc.mprojection/dl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Lambert conformal",
   :madsrdf/code "dl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A conformal projection using equal-area circles on the map surface"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/22 - dl"},
   :madsrdf/isMemberOfMADSCollection :loc.mprojection/collection_mprojection,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mprojection,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mprojection/dl,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A conformal projection using equal-area circles on the map surface"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/22 - dl"},
   :skos/inScheme :loc.vocabulary/mprojection,
   :skos/notation "dl",
   :skos/prefLabel "Lambert conformal"})

(def ^{:private true} mprojection
  "A method or system used to represent the surface of the Earth or of a celestial sphere on a plane."
  {:db/ident :loc.vocabulary/mprojection,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A method or system used to represent the surface of the Earth or of a celestial sphere on a plane."},
   :madsrdf/hasMADSSchemeMember [:loc.mprojection/ab
                                 :loc.mprojection/ce
                                 :loc.mprojection/bz
                                 :loc.mprojection/bb
                                 :loc.mprojection/ca
                                 :loc.mprojection/dl
                                 :loc.mprojection/cb
                                 :loc.mprojection/df
                                 :loc.mprojection/au
                                 :loc.mprojection/br
                                 :loc.mprojection/bf
                                 :loc.mprojection/bu
                                 :loc.mprojection/dg
                                 :loc.mprojection/az
                                 :loc.mprojection/bh
                                 :loc.mprojection/db
                                 :loc.mprojection/bi
                                 :loc.mprojection/ac
                                 :loc.mprojection/bk
                                 :loc.mprojection/dc
                                 :loc.mprojection/ap
                                 :loc.mprojection/bo
                                 :loc.mprojection/cu
                                 :loc.mprojection/ad
                                 :loc.mprojection/bc
                                 :loc.mprojection/cc
                                 :loc.mprojection/dh
                                 :loc.mprojection/af
                                 :loc.mprojection/cp
                                 :loc.mprojection/ba
                                 :loc.mprojection/am
                                 :loc.mprojection/dd
                                 :loc.mprojection/bj
                                 :loc.mprojection/bl
                                 :loc.mprojection/ae
                                 :loc.mprojection/de
                                 :loc.mprojection/bd
                                 :loc.mprojection/bs
                                 :loc.mprojection/be
                                 :loc.mprojection/ag
                                 :loc.mprojection/cz
                                 :loc.mprojection/aa
                                 :loc.mprojection/bg
                                 :loc.mprojection/da
                                 :loc.mprojection/an],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Projection"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mprojection,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A method or system used to represent the surface of the Earth or of a celestial sphere on a plane."}})