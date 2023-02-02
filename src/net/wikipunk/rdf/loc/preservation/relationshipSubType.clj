(ns net.wikipunk.rdf.loc.preservation.relationshipSubType
  "http://id.loc.gov/vocabulary/preservation/relationshipSubType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/relationshipSubType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.relationshipSubType"
    "http://id.loc.gov/vocabulary/preservation/relationshipSubType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.relationshipSubType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/relationshipSubType/"}
  (:refer-clojure :exclude [inc]))

(def cmf
  "compressed from"
  {:db/ident :loc.preservation.relationshipSubType/cmf,
   :madsrdf/authoritativeLabel "compressed from",
   :rdf/type :madsrdf/Authority})

(def cmt
  "compressed to"
  {:db/ident :loc.preservation.relationshipSubType/cmt,
   :madsrdf/authoritativeLabel "compressed to",
   :rdf/type :madsrdf/Authority})

(def doc
  "documents"
  {:db/ident :loc.preservation.relationshipSubType/doc,
   :madsrdf/authoritativeLabel "documents",
   :rdf/type :madsrdf/Authority})

(def dpe
  "deploys"
  {:db/ident :loc.preservation.relationshipSubType/dpe,
   :madsrdf/authoritativeLabel "deploys",
   :rdf/type :madsrdf/Authority})

(def emu
  "emulates"
  {:db/ident :loc.preservation.relationshipSubType/emu,
   :madsrdf/authoritativeLabel "emulates",
   :rdf/type :madsrdf/Authority})

(def enf
  "encrypted from"
  {:db/ident :loc.preservation.relationshipSubType/enf,
   :madsrdf/authoritativeLabel "encrypted from",
   :rdf/type :madsrdf/Authority})

(def ent
  "encrypted to"
  {:db/ident :loc.preservation.relationshipSubType/ent,
   :madsrdf/authoritativeLabel "encrypted to",
   :rdf/type :madsrdf/Authority})

(def gen
  "generalizes"
  {:db/ident :loc.preservation.relationshipSubType/gen,
   :madsrdf/authoritativeLabel "generalizes",
   :rdf/type :madsrdf/Authority})

(def hsi
  "has Sibling"
  {:db/ident :loc.preservation.relationshipSubType/hsi,
   :madsrdf/authoritativeLabel "has Sibling",
   :rdf/type :madsrdf/Authority})

(def hsp
  "has Part"
  {:db/ident :loc.preservation.relationshipSubType/hsp,
   :madsrdf/authoritativeLabel "has Part",
   :rdf/type :madsrdf/Authority})

(def hsr
  "has Root"
  {:db/ident :loc.preservation.relationshipSubType/hsr,
   :madsrdf/authoritativeLabel "has Root",
   :rdf/type :madsrdf/Authority})

(def hss
  "has Source"
  {:db/ident :loc.preservation.relationshipSubType/hss,
   :madsrdf/authoritativeLabel "has Source",
   :rdf/type :madsrdf/Authority})

(def icw
  "is Compatible With"
  {:db/ident :loc.preservation.relationshipSubType/icw,
   :madsrdf/authoritativeLabel "is Compatible With",
   :rdf/type :madsrdf/Authority})

(def idc
  "is Documented In"
  {:db/ident :loc.preservation.relationshipSubType/idc,
   :madsrdf/authoritativeLabel "is Documented In",
   :rdf/type :madsrdf/Authority})

(def idp
  "is Deployed On"
  {:db/ident :loc.preservation.relationshipSubType/idp,
   :madsrdf/authoritativeLabel "is Deployed On",
   :rdf/type :madsrdf/Authority})

(def iem
  "is Emulated By"
  {:db/ident :loc.preservation.relationshipSubType/iem,
   :madsrdf/authoritativeLabel "is Emulated By",
   :rdf/type :madsrdf/Authority})

(def inc
  "includes"
  {:db/ident :loc.preservation.relationshipSubType/inc,
   :madsrdf/authoritativeLabel "includes",
   :rdf/type :madsrdf/Authority})

(def irq
  "is Required By"
  {:db/ident :loc.preservation.relationshipSubType/irq,
   :madsrdf/authoritativeLabel "is Required By",
   :rdf/type :madsrdf/Authority})

(def isi
  "is Included In"
  {:db/ident :loc.preservation.relationshipSubType/isi,
   :madsrdf/authoritativeLabel "is Included In",
   :rdf/type :madsrdf/Authority})

(def iso
  "is Source Of"
  {:db/ident :loc.preservation.relationshipSubType/iso,
   :madsrdf/authoritativeLabel "is Source Of",
   :rdf/type :madsrdf/Authority})

(def isp
  "is Part Of"
  {:db/ident :loc.preservation.relationshipSubType/isp,
   :madsrdf/authoritativeLabel "is Part Of",
   :rdf/type :madsrdf/Authority})

(def isr
  "is Represented By"
  {:db/ident :loc.preservation.relationshipSubType/isr,
   :madsrdf/authoritativeLabel "is Represented By",
   :rdf/type :madsrdf/Authority})

(def iss
  "is Superseded By"
  {:db/ident :loc.preservation.relationshipSubType/iss,
   :madsrdf/authoritativeLabel "is Superseded By",
   :rdf/type :madsrdf/Authority})

(def rep
  "represents"
  {:db/ident :loc.preservation.relationshipSubType/rep,
   :madsrdf/authoritativeLabel "represents",
   :rdf/type :madsrdf/Authority})

(def req
  "requires"
  {:db/ident :loc.preservation.relationshipSubType/req,
   :madsrdf/authoritativeLabel "requires",
   :rdf/type :madsrdf/Authority})

(def spe
  "specializes"
  {:db/ident :loc.preservation.relationshipSubType/spe,
   :madsrdf/authoritativeLabel "specializes",
   :rdf/type :madsrdf/Authority})

(def sup
  "supersedes"
  {:db/ident :loc.preservation.relationshipSubType/sup,
   :madsrdf/authoritativeLabel "supersedes",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} relationshipSubType
  "A specific characterization of the nature of the relationship between this object and one or more other objects."
  {:db/ident :loc.preservation/relationshipSubType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasBroaderAuthority :loc.preservation/relationshipType,
   :madsrdf/hasMADSSchemeMember [:loc.preservation.relationshipSubType/sup
                                 :loc.preservation.relationshipSubType/rep
                                 :loc.preservation.relationshipSubType/inc
                                 :loc.preservation.relationshipSubType/hsr
                                 :loc.preservation.relationshipSubType/dpe
                                 :loc.preservation.relationshipSubType/isr
                                 :loc.preservation.relationshipSubType/isi
                                 :loc.preservation.relationshipSubType/irq
                                 :loc.preservation.relationshipSubType/cmt
                                 :loc.preservation.relationshipSubType/iem
                                 :loc.preservation.relationshipSubType/hss
                                 :loc.preservation.relationshipSubType/ent
                                 :loc.preservation.relationshipSubType/iso
                                 :loc.preservation.relationshipSubType/iss
                                 :loc.preservation.relationshipSubType/hsi
                                 :loc.preservation.relationshipSubType/icw
                                 :loc.preservation.relationshipSubType/gen
                                 :loc.preservation.relationshipSubType/idc
                                 :loc.preservation.relationshipSubType/spe
                                 :loc.preservation.relationshipSubType/idp
                                 :loc.preservation.relationshipSubType/hsp
                                 :loc.preservation.relationshipSubType/cmf
                                 :loc.preservation.relationshipSubType/isp
                                 :loc.preservation.relationshipSubType/req
                                 :loc.preservation.relationshipSubType/emu
                                 :loc.preservation.relationshipSubType/enf
                                 :loc.preservation.relationshipSubType/doc],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "A specific characterization of the nature of the relationship between this object and one or more other objects.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship Subtype"},
   :skos/broader :loc.preservation/relationshipType,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/relationshipSubType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/relationshipSubType,
                      :rdf/type           :cs/ChangeSet}]})