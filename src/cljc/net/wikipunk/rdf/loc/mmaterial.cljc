(ns net.wikipunk.rdf.loc.mmaterial
  "http://id.loc.gov/vocabulary/mmaterial/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mmaterial.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mmaterial"
                       "http://id.loc.gov/vocabulary/mmaterial/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mmaterial",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mmaterial/"})

(def ace
  "Material composed of the acetate ester of cellulose."
  {:db/ident :loc.mmaterial/ace,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "acetate",
   :madsrdf/code "ace",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Material composed of the acetate ester of cellulose."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/mi/12; 007sr/10 - c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/ace,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Material composed of the acetate ester of cellulose."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/mi/12; 007sr/10 - c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "ace",
   :skos/prefLabel "acetate"})

(def acp
  "Material consisting of pigment or dye bound in an emulsion of acrylic resin."
  {:db/ident :loc.mmaterial/acp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "acrylic paint",
   :madsrdf/code "acp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment or dye bound in an emulsion of acrylic resin."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/acp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment or dye bound in an emulsion of acrylic resin."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "acp",
   :skos/prefLabel "acrylic paint"})

(def alu
  "Material of non-magnetic metal, usually alloyed, that is ductile and malleable with a lustre that ranges from grey to silver"
  {:db/ident :loc.mmaterial/alu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "aluminum",
   :madsrdf/code "alu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material of non-magnetic metal, usually alloyed, that is ductile and malleable with a lustre that ranges from grey to silver"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/10 - i"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/alu,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material of non-magnetic metal, usually alloyed, that is ductile and malleable with a lustre that ranges from grey to silver"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/10 - i"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "alu",
   :skos/prefLabel "aluminum"})

(def brb
  "Material consisting of a high-grade white cardboard, most commonly made by pasting together sheets of heavy ledger paper"
  {:db/ident :loc.mmaterial/brb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "bristol board",
   :madsrdf/code "brb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a high-grade white cardboard, most commonly made by pasting together sheets of heavy ledger paper"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - b"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/brb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a high-grade white cardboard, most commonly made by pasting together sheets of heavy ledger paper"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - b"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "brb",
   :skos/prefLabel "bristol board"})

(def can
  "Material consisting of a closely woven textile made in various weights, usually of flax, hemp, jute, or cotton, used as a support for painting or printing; or a loosely woven, lattice-like mesh, usually of flax, hemp, jute, or cotton, used as a needlepoint foundation"
  {:db/ident :loc.mmaterial/can,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "canvas",
   :madsrdf/code "can",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a closely woven textile made in various weights, usually of flax, hemp, jute, or cotton, used as a support for painting or printing; or a loosely woven, lattice-like mesh, usually of flax, hemp, jute, or cotton, used as a needlepoint foundation"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - a"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/can,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a closely woven textile made in various weights, usually of flax, hemp, jute, or cotton, used as a support for painting or printing; or a loosely woven, lattice-like mesh, usually of flax, hemp, jute, or cotton, used as a needlepoint foundation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - a"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "can",
   :skos/prefLabel "canvas"})

(def cer
  "Material consisting of a nonmetallic mineral, such as clay, fired at a high temperature to form a hard, brittle, heat- and corrosion-resistant material."
  {:db/ident :loc.mmaterial/cer,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ceramic",
   :madsrdf/code "cer",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a nonmetallic mineral, such as clay, fired at a high temperature to form a hard, brittle, heat- and corrosion-resistant material."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $a"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/cer,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a nonmetallic mineral, such as clay, fired at a high temperature to form a hard, brittle, heat- and corrosion-resistant material."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $a"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "cer",
   :skos/prefLabel "ceramic"})

(def chk
  "Material consisting of fine-grained limestone, or a soft, earthy form of calcium carbonate."
  {:db/ident :loc.mmaterial/chk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "chalk",
   :madsrdf/code "chk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of fine-grained limestone, or a soft, earthy form of calcium carbonate."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/chk,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of fine-grained limestone, or a soft, earthy form of calcium carbonate."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "chk",
   :skos/prefLabel "chalk"})

(def chr
  "Material consisting of the dark grey residue made of carbon, and any remaining ash, obtained by removing water and other volatile constituents from animal and plant substances."
  {:db/ident :loc.mmaterial/chr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "charcoal",
   :madsrdf/code "chr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the dark grey residue made of carbon, and any remaining ash, obtained by removing water and other volatile constituents from animal and plant substances."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/chr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the dark grey residue made of carbon, and any remaining ash, obtained by removing water and other volatile constituents from animal and plant substances."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "chr",
   :skos/prefLabel "charcoal"})

(def crd
  "Material consisting of a type of stiff sheet typically made of good-quality chemical pulp or rag pulp, varying greatly in type and strength, and that is thicker than 0.1524 mm."
  {:db/ident :loc.mmaterial/crd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "cardboard",
   :madsrdf/code "crd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a type of stiff sheet typically made of good-quality chemical pulp or rag pulp, varying greatly in type and strength, and that is thicker than 0.1524 mm."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - c ; 007/sr/10 - r"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mount"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/crd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a type of stiff sheet typically made of good-quality chemical pulp or rag pulp, varying greatly in type and strength, and that is thicker than 0.1524 mm."},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - c ; 007/sr/10 - r"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "crd",
   :skos/prefLabel "cardboard"})

(def dia
  "Material consisting of an emulsion of one or more light-sensitive layers of diazonium salts in a polyester or acetate base that react with dye couplers when processed to produce azo dye images."
  {:db/ident :loc.mmaterial/dia,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "diazo emulsion",
   :madsrdf/code "dia",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of an emulsion of one or more light-sensitive layers of diazonium salts in a polyester or acetate base that react with dye couplers when processed to produce azo dye images."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/mi/10 - b"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_emulsion"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/dia,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of an emulsion of one or more light-sensitive layers of diazonium salts in a polyester or acetate base that react with dye couplers when processed to produce azo dye images."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/mi/10 - b"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "dia",
   :skos/prefLabel "diazo emulsion"})

(def dic
  "Material made by treating cellulose with acetic acid."
  {:db/ident :loc.mmaterial/dic,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "diacetate",
   :madsrdf/code "dic",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Material made by treating cellulose with acetic acid."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/mi/12 - d"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/dic,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Material made by treating cellulose with acetic acid."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/mi/12 - d"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "dic",
   :skos/prefLabel "diacetate"})

(def dye
  "Material consisting of a colored substance dissolved or suspended in a liquid that can be absorbed by the base material."
  {:db/ident :loc.mmaterial/dye,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "dye",
   :madsrdf/code "dye",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a colored substance dissolved or suspended in a liquid that can be absorbed by the base material."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/dye,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a colored substance dissolved or suspended in a liquid that can be absorbed by the base material."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "dye",
   :skos/prefLabel "dye"})

(def fer
  "Material that is a natural or synthetic inorganic compound consisting of particles that are highly magnetic and are commonly used to store binary or analog information."
  {:db/ident :loc.mmaterial/fer,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "magnetic particles",
   :madsrdf/code "fer",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material that is a natural or synthetic inorganic compound consisting of particles that are highly magnetic and are commonly used to store binary or analog information."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/10 - c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_emulsion"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/fer,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material that is a natural or synthetic inorganic compound consisting of particles that are highly magnetic and are commonly used to store binary or analog information."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/10 - c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "fer",
   :skos/prefLabel "magnetic particles"})

(def gls
  "Material consisting of silicon dioxide, known as silica, fused with one or more basic oxides; generally transparent but often translucent or opaque."
  {:db/ident :loc.mmaterial/gls,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "glass",
   :madsrdf/code "gls",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of silicon dioxide, known as silica, fused with one or more basic oxides; generally transparent but often translucent or opaque."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - d ; 007/sr/10 - g"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mount"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/gls,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of silicon dioxide, known as silica, fused with one or more basic oxides; generally transparent but often translucent or opaque."},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - d ; 007/sr/10 - g"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "gls",
   :skos/prefLabel "glass"})

(def gou
  "Material consisting of pigment and a binding agent, and sometimes added inert materials, to form an opaque, colored, water-soluble paint."
  {:db/ident :loc.mmaterial/gou,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "gouache",
   :madsrdf/code "gou",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment and a binding agent, and sometimes added inert materials, to form an opaque, colored, water-soluble paint."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/gou,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment and a binding agent, and sometimes added inert materials, to form an opaque, colored, water-soluble paint."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "gou",
   :skos/prefLabel "gouache"})

(def gra
  "Material consisting of a naturally occurring allotrope of carbon which is opaque, soft, greasy to the touch, and iron black to steel gray in color."
  {:db/ident :loc.mmaterial/gra,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "graphite",
   :madsrdf/code "gra",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a naturally occurring allotrope of carbon which is opaque, soft, greasy to the touch, and iron black to steel gray in color."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/gra,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a naturally occurring allotrope of carbon which is opaque, soft, greasy to the touch, and iron black to steel gray in color."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "gra",
   :skos/prefLabel "graphite"})

(def hdb
  "Material consisting of any firm, dense, rigid board, often manufactured from fiber consolidated in a hot press."
  {:db/ident :loc.mmaterial/hdb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "hardboard",
   :madsrdf/code "hdb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of any firm, dense, rigid board, often manufactured from fiber consolidated in a hot press."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 007np/mp/gb/04;   007np/05;   007pg/08 - q"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/hdb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of any firm, dense, rigid board, often manufactured from fiber consolidated in a hot press."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - q"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "hdb",
   :skos/prefLabel "hardboard"})

(def ill
  "Material consisting of laminated paper board that has paper layers glued to its surface."
  {:db/ident :loc.mmaterial/ill,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "illustration board",
   :madsrdf/code "ill",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of laminated paper board that has paper layers glued to its surface."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007np/04;   007np/05 - c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/ill,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of laminated paper board that has paper layers glued to its surface."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007np/04; 007np/05 - c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "ill",
   :skos/prefLabel "illustration board"})

(def ink
  "Material consisting of pigment or dye contained in a liquid or paste."
  {:db/ident :loc.mmaterial/ink,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ink",
   :madsrdf/code "ink",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment or dye contained in a liquid or paste."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/ink,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment or dye contained in a liquid or paste."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "ink",
   :skos/prefLabel "ink"})

(def ivo
  "Material consisting of the dentine forming the bulk of the teeth and tusks of animals such as elephants, walruses, and narwhals."
  {:db/ident :loc.mmaterial/ivo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ivory",
   :madsrdf/code "ivo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the dentine forming the bulk of the teeth and tusks of animals such as elephants, walruses, and narwhals."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $a"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/ivo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the dentine forming the bulk of the teeth and tusks of animals such as elephants, walruses, and narwhals."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $a"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "ivo",
   :skos/prefLabel "ivory"})

(def lac
  "Material generally used as a finish that may be clear or coloured, consisting of polymers or acrylic compounds dissolved in volatile organic compounds or other solvents, that when dry is a hard and durable material."
  {:db/ident :loc.mmaterial/lac,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "lacquer",
   :madsrdf/code "lac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material generally used as a finish that may be clear or coloured, consisting of polymers or acrylic compounds dissolved in volatile organic compounds or other solvents, that when dry is a hard and durable material."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/10 - a, g, i"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_emulsion"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/lac,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material generally used as a finish that may be clear or coloured, consisting of polymers or acrylic compounds dissolved in volatile organic compounds or other solvents, that when dry is a hard and durable material."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/10 - a, g, i"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "lac",
   :skos/prefLabel "lacquer"})

(def lea
  "Material consisting of the skin or hide of an animal that has been tanned to render it resistant to putrefaction and relatively soft and flexible when dry."
  {:db/ident :loc.mmaterial/lea,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "leather",
   :madsrdf/code "lea",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the skin or hide of an animal that has been tanned to render it resistant to putrefaction and relatively soft and flexible when dry."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 007np/mp/gb/04;   007np/05;   007pg/08 - v"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/lea,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the skin or hide of an animal that has been tanned to render it resistant to putrefaction and relatively soft and flexible when dry."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - v"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "lea",
   :skos/prefLabel "leather"})

(def mix
  "Mixture of material."
  {:db/ident :loc.mmaterial/mix,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "mixed material",
   :madsrdf/code "mix",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Mixture of material."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - m"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_emulsion"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/mix,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Mixture of material."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - m"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "mix",
   :skos/prefLabel "mixed material"})

(def mtl
  "Material consisting of a substance typified by being a good conductor of electricity and heat, opaque with a characteristic lustre, fusible, and usually malleable or ductile."
  {:db/ident :loc.mmaterial/mtl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "metal",
   :madsrdf/code "mtl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a substance typified by being a good conductor of electricity and heat, opaque with a characteristic lustre, fusible, and usually malleable or ductile."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - h ; 007/sr/10 - l"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mount"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_emulsion"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/mtl,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a substance typified by being a good conductor of electricity and heat, opaque with a characteristic lustre, fusible, and usually malleable or ductile."},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - h ; 007/sr/10 - l"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "mtl",
   :skos/prefLabel "metal"})

(def nit
  "Material of cellulose nitrate plasticized with camphor."
  {:db/ident :loc.mmaterial/nit,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "nitrate",
   :madsrdf/code "nit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Material of cellulose nitrate plasticized with camphor."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007mpic/mi/12 - I ; 007sr/10 - b"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/nit,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Material of cellulose nitrate plasticized with camphor."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value "MARC bib: 007mpic/mi/12 - I ; 007sr/10 - b"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "nit",
   :skos/prefLabel "nitrate"})

(def nsf
  "Highly flammable film base."
  {:db/ident :loc.mmaterial/nsf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "non-safety base",
   :madsrdf/code "nsf",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Highly flammable film base."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007pg/04 - k"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/nsf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Highly flammable film base."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007pg/04 - k"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "nsf",
   :skos/prefLabel "non-safety base"})

(def oip
  "Material consisting of pigment suspended in a drying oil."
  {:db/ident :loc.mmaterial/oip,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "oil paint",
   :madsrdf/code "oip",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Material consisting of pigment suspended in a drying oil."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/oip,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Material consisting of pigment suspended in a drying oil."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "oip",
   :skos/prefLabel "oil paint"})

(def pap
  "Material consisting of thin material made from felted sheets or webs of animal, plant, mineral, or synthetic fibres formed and dried from a suspension in water."
  {:db/ident :loc.mmaterial/pap,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "paper",
   :madsrdf/code "pap",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of thin material made from felted sheets or webs of animal, plant, mineral, or synthetic fibres formed and dried from a suspension in water."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - o"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/pap,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of thin material made from felted sheets or webs of animal, plant, mineral, or synthetic fibres formed and dried from a suspension in water."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - o"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "pap",
   :skos/prefLabel "paper"})

(def par
  "Material consisting of calf, sheep, or goat skin which has been prepared to produce a thin, strong, translucent or opaque substance for writing, bookbinding, or other uses."
  {:db/ident :loc.mmaterial/par,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "parchment",
   :madsrdf/code "par",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of calf, sheep, or goat skin which has been prepared to produce a thin, strong, translucent or opaque substance for writing, bookbinding, or other uses."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 007np/mp/gb/04;   007np/05;   007pg/08 - w"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/par,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of calf, sheep, or goat skin which has been prepared to produce a thin, strong, translucent or opaque substance for writing, bookbinding, or other uses."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - w"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "par",
   :skos/prefLabel "parchment"})

(def pas
  "Material consisting of pigment mixed with a binder, usually in the form of a stick."
  {:db/ident :loc.mmaterial/pas,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "pastel",
   :madsrdf/code "pas",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment mixed with a binder, usually in the form of a stick."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/pas,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment mixed with a binder, usually in the form of a stick."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "pas",
   :skos/prefLabel "pastel"})

(def pla
  "Material consisting of synthetic or semi-synthetic organic polymers of high molecular weight that are moldable."
  {:db/ident :loc.mmaterial/pla,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "plastic",
   :madsrdf/code "pla",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of synthetic or semi-synthetic organic polymers of high molecular weight that are moldable."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - i ; 007/sr/10 - m, p"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mount"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/pla,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of synthetic or semi-synthetic organic polymers of high molecular weight that are moldable."},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - i ; 007/sr/10 - m, p"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "pla",
   :skos/prefLabel "plastic"})

(def plt
  "Material consisting of a powder prepared from calcium sulphate dihydrate, known as gypsum, or calcium carbonate and mixed with water and sometimes a filler to form a paste that liberates heat and then hardens."
  {:db/ident :loc.mmaterial/plt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "plaster",
   :madsrdf/code "plt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a powder prepared from calcium sulphate dihydrate, known as gypsum, or calcium carbonate and mixed with water and sometimes a filler to form a paste that liberates heat and then hardens."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - p"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/plt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a powder prepared from calcium sulphate dihydrate, known as gypsum, or calcium carbonate and mixed with water and sometimes a filler to form a paste that liberates heat and then hardens."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - p"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "plt",
   :skos/prefLabel "plaster"})

(def pol
  "Material that is a category of polymers that contain the ester functional group in their main chain."
  {:db/ident :loc.mmaterial/pol,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "polyester",
   :madsrdf/code "pol",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material that is a category of polymers that contain the ester functional group in their main chain."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/mi/12 - p"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/pol,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material that is a category of polymers that contain the ester functional group in their main chain."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/mi/12 - p"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "pol",
   :skos/prefLabel "polyester"})

(def por
  "Material consisting of a refractory white clay, known as kaolin, and a feldspathic rock that is heated to form a ceramic material."
  {:db/ident :loc.mmaterial/por,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "porcelain",
   :madsrdf/code "por",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a refractory white clay, known as kaolin, and a feldspathic rock that is heated to form a ceramic material."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 007np/mp/gb/04;   007np/05;   007pg/08 - r"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/por,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a refractory white clay, known as kaolin, and a feldspathic rock that is heated to form a ceramic material."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - r"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "por",
   :skos/prefLabel "porcelain"})

(def rub
  "Material consisting of natural or synthetic polymers that have a high degree of resilience and elasticity."
  {:db/ident :loc.mmaterial/rub,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "rubber",
   :madsrdf/code "rub",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of natural or synthetic polymers that have a high degree of resilience and elasticity."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $a"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/rub,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of natural or synthetic polymers that have a high degree of resilience and elasticity."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $a"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "rub",
   :skos/prefLabel "rubber"})

(def saf
  "Material consisting of nonflammable cellulose acetate or polyester."
  {:db/ident :loc.mmaterial/saf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "safety base",
   :madsrdf/code "saf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of nonflammable cellulose acetate or polyester."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007pg/04; 007mpic/mi/12 - j"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/saf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of nonflammable cellulose acetate or polyester."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007pg/04; 007mpic/mi/12 - j"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "saf",
   :skos/prefLabel "safety base"})

(def she
  "Material consisting of lac, a resinous substance excreted by the female lac insect, that can be dissolved in ethyl alcohol to form a liquid that can be applied with a brush."
  {:db/ident :loc.mmaterial/she,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "shellac",
   :madsrdf/code "she",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of lac, a resinous substance excreted by the female lac insect, that can be dissolved in ethyl alcohol to form a liquid that can be applied with a brush."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/10 - s"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_emulsion"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/she,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of lac, a resinous substance excreted by the female lac insect, that can be dissolved in ethyl alcohol to form a liquid that can be applied with a brush."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/10 - s"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "she",
   :skos/prefLabel "shellac"})

(def ski
  "Material consisting of the integument of animals, such as sheep, goats, or calves, separated from the body and variously processed to remove hair, dry, tan, or otherwise dress."
  {:db/ident :loc.mmaterial/ski,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "skin",
   :madsrdf/code "ski",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the integument of animals, such as sheep, goats, or calves, separated from the body and variously processed to remove hair, dry, tan, or otherwise dress."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - f"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/ski,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the integument of animals, such as sheep, goats, or calves, separated from the body and variously processed to remove hair, dry, tan, or otherwise dress."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - f"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "ski",
   :skos/prefLabel "skin"})

(def slh
  "Material consisting of an emulsion of a light-sensitive compound of silver and chlorine, bromine, iodine or fluorine suspended in a colloidal medium, usually gelatin."
  {:db/ident :loc.mmaterial/slh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "silver halide emulsion",
   :madsrdf/code "slh",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of an emulsion of a light-sensitive compound of silver and chlorine, bromine, iodine or fluorine suspended in a colloidal medium, usually gelatin."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/mi/10 - a"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_emulsion"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/slh,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of an emulsion of a light-sensitive compound of silver and chlorine, bromine, iodine or fluorine suspended in a colloidal medium, usually gelatin."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/mi/10 - a"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "slh",
   :skos/prefLabel "silver halide emulsion"})

(def sto
  "Material consisting of rock in its naturally occurring shape or that has been cut, shaped, crushed, or otherwise formed."
  {:db/ident :loc.mmaterial/sto,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "stone",
   :madsrdf/code "sto",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of rock in its naturally occurring shape or that has been cut, shaped, crushed, or otherwise formed."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 007np/mp/gb/04;   007np/05;   007pg/08 - s"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/sto,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of rock in its naturally occurring shape or that has been cut, shaped, crushed, or otherwise formed."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - s"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "sto",
   :skos/prefLabel "stone"})

(def syn
  "Material created by processing man-made materials, usually as a substitute for a natural material."
  {:db/ident :loc.mmaterial/syn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "synthetic",
   :madsrdf/code "syn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material created by processing man-made materials, usually as a substitute for a natural material."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - e"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mount"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/syn,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material created by processing man-made materials, usually as a substitute for a natural material."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - e"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "syn",
   :skos/prefLabel "synthetic"})

(def tem
  "Material consisting of pigment mixed with a water-soluble binder medium, usually a glutinous material such as egg yolk or some other size, to form a permanent fast-drying painting medium."
  {:db/ident :loc.mmaterial/tem,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "tempura",
   :madsrdf/code "tem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment mixed with a water-soluble binder medium, usually a glutinous material such as egg yolk or some other size, to form a permanent fast-drying painting medium."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/tem,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment mixed with a water-soluble binder medium, usually a glutinous material such as egg yolk or some other size, to form a permanent fast-drying painting medium."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "tem",
   :skos/prefLabel "tempura"})

(def tex
  "Material produced by weaving, felting, knotting, twining, or otherwise processing natural or synthetic fibers so that they cohere."
  {:db/ident :loc.mmaterial/tex,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "textile",
   :madsrdf/code "tex",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material produced by weaving, felting, knotting, twining, or otherwise processing natural or synthetic fibers so that they cohere."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - g"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/tex,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material produced by weaving, felting, knotting, twining, or otherwise processing natural or synthetic fibers so that they cohere."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - g"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "tex",
   :skos/prefLabel "textile"})

(def tri
  "Material manufactured from cellulose and a source of acetate esters, typically acetic anhydride."
  {:db/ident :loc.mmaterial/tri,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "triacetate",
   :madsrdf/code "tri",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material manufactured from cellulose and a source of acetate esters, typically acetic anhydride."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/mi/12 - t"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/tri,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material manufactured from cellulose and a source of acetate esters, typically acetic anhydride."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/mi/12 - t"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "tri",
   :skos/prefLabel "triacetate"})

(def vel
  "Material consisting of fine-quality calf or lamb parchment."
  {:db/ident :loc.mmaterial/vel,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "vellum",
   :madsrdf/code "vel",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Material consisting of fine-quality calf or lamb parchment."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - n"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/vel,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Material consisting of fine-quality calf or lamb parchment."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - n"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "vel",
   :skos/prefLabel "vellum"})

(def ves
  "Material consisting of an emulsion of one or more light-sensitive layers of diazonium salts in a polyester thermoplastic base that decompose on exposure to produce nitrogen bubbles, known as vesicles, that form a latent image, commonly blue or beige, which becomes visible and fixed when heated and allowed to cool."
  {:db/ident :loc.mmaterial/ves,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "vesicular emulsion",
   :madsrdf/code "ves",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of an emulsion of one or more light-sensitive layers of diazonium salts in a polyester thermoplastic base that decompose on exposure to produce nitrogen bubbles, known as vesicles, that form a latent image, commonly blue or beige, which becomes visible and fixed when heated and allowed to cool."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/mi/10 - c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_emulsion"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/ves,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of an emulsion of one or more light-sensitive layers of diazonium salts in a polyester thermoplastic base that decompose on exposure to produce nitrogen bubbles, known as vesicles, that form a latent image, commonly blue or beige, which becomes visible and fixed when heated and allowed to cool."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/mi/10 - c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "ves",
   :skos/prefLabel "vesicular emulsion"})

(def vny
  "Material consisting of a polymer or copolymer derived from a vinyl group, typically vinyl chloride."
  {:db/ident :loc.mmaterial/vny,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "vinyl",
   :madsrdf/code "vny",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a polymer or copolymer derived from a vinyl group, typically vinyl chloride."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - l"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/vny,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a polymer or copolymer derived from a vinyl group, typically vinyl chloride."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - l"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "vny",
   :skos/prefLabel "vinyl"})

(def wat
  "Material consisting of pigment suspended in water to form a transparent painting medium."
  {:db/ident :loc.mmaterial/wat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "watercolor",
   :madsrdf/code "wat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment suspended in water to form a transparent painting medium."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "watercolour",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $c"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_applied"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel "watercolour",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/wat,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of pigment suspended in water to form a transparent painting medium."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $c"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "wat",
   :skos/prefLabel "watercolor",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "watercolour"}})

(def wax
  "Material consisting of a chemical compound from an animal, plant, mineral, or synthetic source that is malleable near ambient temperatures, slightly greasy to the touch, with a low melting point, and usually translucent, water-repellant, and soluble in organic solvents."
  {:db/ident :loc.mmaterial/wax,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "wax",
   :madsrdf/code "wax",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a chemical compound from an animal, plant, mineral, or synthetic source that is malleable near ambient temperatures, slightly greasy to the touch, with a low melting point, and usually translucent, water-repellant, and soluble in organic solvents."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/10 - w"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_emulsion"],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/wax,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of a chemical compound from an animal, plant, mineral, or synthetic source that is malleable near ambient temperatures, slightly greasy to the touch, with a low melting point, and usually translucent, water-repellant, and soluble in organic solvents."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/10 - w"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "wax",
   :skos/prefLabel "wax"})

(def wod
  "Material consisting of the principal tissue of trees and similar plants."
  {:db/ident :loc.mmaterial/wod,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "wood",
   :madsrdf/code "wod",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the principal tissue of trees and similar plants."},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 007np/mp/gb/04;   007np/05;   007pg/08 - t"},
   :madsrdf/isMemberOfMADSCollection
   ["http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_base"
    "http://id.loc.gov/vocabulary/mmaterial/collection_http://id.loc.gov/vocabulary/mmaterial/collection_mmaterial"
    :loc.mmaterial/collection_mmaterial],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmaterial,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmaterial/wod,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Material consisting of the principal tissue of trees and similar plants."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007np/mp/gb/04; 007np/05; 007pg/08 - t"},
   :skos/inScheme :loc.vocabulary/mmaterial,
   :skos/notation "wod",
   :skos/prefLabel "wood"})

(def ^{:private true} mmaterial
  "Support Material is a vocabulary that provides URIs for describing the underlying physical material of a resource: primary, secondary, coating, applied."
  {:db/ident :loc.vocabulary/mmaterial,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Support Material is a vocabulary that provides URIs for describing the underlying physical material of a resource: primary, secondary, coating, applied."},
   :madsrdf/hasMADSSchemeMember [:loc.mmaterial/ves
                                 :loc.mmaterial/wax
                                 :loc.mmaterial/ivo
                                 :loc.mmaterial/slh
                                 :loc.mmaterial/she
                                 :loc.mmaterial/cer
                                 :loc.mmaterial/ill
                                 :loc.mmaterial/sto
                                 :loc.mmaterial/lac
                                 :loc.mmaterial/rub
                                 :loc.mmaterial/nit
                                 :loc.mmaterial/brb
                                 :loc.mmaterial/por
                                 :loc.mmaterial/crd
                                 :loc.mmaterial/dia
                                 :loc.mmaterial/par
                                 :loc.mmaterial/ace
                                 :loc.mmaterial/oip
                                 :loc.mmaterial/syn
                                 :loc.mmaterial/chk
                                 :loc.mmaterial/gls
                                 :loc.mmaterial/fer
                                 :loc.mmaterial/plt
                                 :loc.mmaterial/vny
                                 :loc.mmaterial/pol
                                 :loc.mmaterial/tem
                                 :loc.mmaterial/dye
                                 :loc.mmaterial/chr
                                 :loc.mmaterial/lea
                                 :loc.mmaterial/gou
                                 :loc.mmaterial/pas
                                 :loc.mmaterial/pla
                                 :loc.mmaterial/tri
                                 :loc.mmaterial/alu
                                 :loc.mmaterial/hdb
                                 :loc.mmaterial/acp
                                 :loc.mmaterial/pap
                                 :loc.mmaterial/mtl
                                 :loc.mmaterial/ski
                                 :loc.mmaterial/nsf
                                 :loc.mmaterial/wat
                                 :loc.mmaterial/ink
                                 :loc.mmaterial/tex
                                 :loc.mmaterial/wod
                                 :loc.mmaterial/can
                                 :loc.mmaterial/mix
                                 :loc.mmaterial/dic
                                 :loc.mmaterial/vel
                                 :loc.mmaterial/gra
                                 :loc.mmaterial/saf],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Support Material"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mmaterial,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Support Material is a vocabulary that provides URIs for describing the underlying physical material of a resource: primary, secondary, coating, applied."}})