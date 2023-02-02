(ns net.wikipunk.rdf.loc.fingerprintschemes
  "http://id.loc.gov/vocabulary/fingerprintschemes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/fingerprintschemes.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.fingerprintschemes"
                       "http://id.loc.gov/vocabulary/fingerprintschemes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.fingerprintschemes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/fingerprintschemes/"})

(def fei
  "Fingerprints = Empreintes = Impronte (Paris: Institut de recherche et d'histoire des textes)"
  {:db/ident :loc.fingerprintschemes/fei,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.fingerprintschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Fingerprints Empreintes Impronte",
   :madsrdf/code "fei",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Fingerprints = Empreintes = Impronte (Paris: Institut de recherche et d'histoire des textes)"},
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Fingerprints = Empreintes = Impronte",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 026 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.fingerprintschemes/collection_fingerprintschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/fingerprintschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Fingerprints = Empreintes = Impronte",
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.fingerprintschemes/dlc,
                     :cs/subjectOfChange :loc.fingerprintschemes/fei,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Fingerprints = Empreintes = Impronte (Paris: Institut de recherche et d'histoire des textes)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 026 $2"},
   :skos/inScheme :loc.vocabulary/fingerprintschemes,
   :skos/notation "fei",
   :skos/prefLabel "Fingerprints Empreintes Impronte",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Fingerprints = Empreintes = Impronte"}})

(def stcnf
  "Vriesma, P.C.A. The STCN [Short title catalogue Netherlands] fingerprint"
  {:db/ident :loc.fingerprintschemes/stcnf,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.fingerprintschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "STCN fingerprint",
   :madsrdf/code "stcnf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Vriesma, P.C.A. The STCN [Short title catalogue Netherlands] fingerprint"},
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Short title catalogue Netherlands fingerprint",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 026 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.fingerprintschemes/collection_fingerprintschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/fingerprintschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Short title catalogue Netherlands fingerprint",
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.fingerprintschemes/dlc,
                     :cs/subjectOfChange :loc.fingerprintschemes/stcnf,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Vriesma, P.C.A. The STCN [Short title catalogue Netherlands] fingerprint"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 026 $2"},
   :skos/inScheme :loc.vocabulary/fingerprintschemes,
   :skos/notation "stcnf",
   :skos/prefLabel "STCN fingerprint",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Short title catalogue Netherlands fingerprint"}})

(def ^{:private true} fingerprintschemes
  ""
  {:db/ident        :loc.vocabulary/fingerprintschemes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-10-03T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/dlc",
    :ri/recordStatus "new"},
   :madsrdf/hasMADSSchemeMember [:loc.fingerprintschemes/stcnf
                                 :loc.fingerprintschemes/fei],
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Fingerprint Scheme Source Codes"},
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     "https://id.loc.gov/vocabulary/dlc",
                     :cs/subjectOfChange :loc.vocabulary/fingerprintschemes,
                     :rdf/type           :cs/ChangeSet}})