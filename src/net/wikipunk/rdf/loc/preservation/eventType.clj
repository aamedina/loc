(ns net.wikipunk.rdf.loc.preservation.eventType
  "http://id.loc.gov/vocabulary/preservation/eventType/"
  {:dcat/downloadURL  "http://id.loc.gov/vocabulary/preservation/eventType.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.preservation.eventType"
                       "http://id.loc.gov/vocabulary/preservation/eventType/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.preservation.eventType",
   :rdfa/uri          "http://id.loc.gov/vocabulary/preservation/eventType/"}
  (:refer-clojure :exclude [dec for int mod ref val]))

(def acc
  "accession"
  {:db/ident :loc.preservation.eventType/acc,
   :madsrdf/authoritativeLabel "accession",
   :rdf/type :madsrdf/Authority})

(def app
  "appraisal"
  {:db/ident :loc.preservation.eventType/app,
   :madsrdf/authoritativeLabel "appraisal",
   :rdf/type :madsrdf/Authority})

(def cap
  "capture"
  {:db/ident :loc.preservation.eventType/cap,
   :madsrdf/authoritativeLabel "capture",
   :rdf/type :madsrdf/Authority})

(def com
  "compression"
  {:db/ident :loc.preservation.eventType/com,
   :madsrdf/authoritativeLabel "compression",
   :rdf/type :madsrdf/Authority})

(def cop
  "compiling"
  {:db/ident :loc.preservation.eventType/cop,
   :madsrdf/authoritativeLabel "compiling",
   :rdf/type :madsrdf/Authority})

(def cre
  "creation"
  {:db/ident :loc.preservation.eventType/cre,
   :madsrdf/authoritativeLabel "creation",
   :rdf/type :madsrdf/Authority})

(def dea
  "deaccession"
  {:db/ident :loc.preservation.eventType/dea,
   :madsrdf/authoritativeLabel "deaccession",
   :rdf/type :madsrdf/Authority})

(def dec
  "decompression"
  {:db/ident :loc.preservation.eventType/dec,
   :madsrdf/authoritativeLabel "decompression",
   :rdf/type :madsrdf/Authority})

(def del
  "deletion"
  {:db/ident :loc.preservation.eventType/del,
   :madsrdf/authoritativeLabel "deletion",
   :rdf/type :madsrdf/Authority})

(def der
  "decryption"
  {:db/ident :loc.preservation.eventType/der,
   :madsrdf/authoritativeLabel "decryption",
   :rdf/type :madsrdf/Authority})

(def dig
  "digital signature validation"
  {:db/ident :loc.preservation.eventType/dig,
   :madsrdf/authoritativeLabel "digital signature validation",
   :rdf/type :madsrdf/Authority})

(def dis
  "dissemination"
  {:db/ident :loc.preservation.eventType/dis,
   :madsrdf/authoritativeLabel "dissemination",
   :rdf/type :madsrdf/Authority})

(def dsg
  "digital signature generation"
  {:db/ident :loc.preservation.eventType/dsg,
   :madsrdf/authoritativeLabel "digital signature generation",
   :rdf/type :madsrdf/Authority})

(def dsp
  "displaying"
  {:db/ident :loc.preservation.eventType/dsp,
   :madsrdf/authoritativeLabel "displaying",
   :rdf/type :madsrdf/Authority})

(def enc
  "encryption"
  {:db/ident :loc.preservation.eventType/enc,
   :madsrdf/authoritativeLabel "encryption",
   :rdf/type :madsrdf/Authority})

(def exe
  "execution"
  {:db/ident :loc.preservation.eventType/exe,
   :madsrdf/authoritativeLabel "execution",
   :rdf/type :madsrdf/Authority})

(def exp
  "exporting"
  {:db/ident :loc.preservation.eventType/exp,
   :madsrdf/authoritativeLabel "exporting",
   :rdf/type :madsrdf/Authority})

(def ext
  "extraction"
  {:db/ident :loc.preservation.eventType/ext,
   :madsrdf/authoritativeLabel "extraction",
   :rdf/type :madsrdf/Authority})

(def ffa
  "forensic feature analysis"
  {:db/ident :loc.preservation.eventType/ffa,
   :madsrdf/authoritativeLabel "forensic feature analysis",
   :rdf/type :madsrdf/Authority})

(def fil
  "filename change"
  {:db/ident :loc.preservation.eventType/fil,
   :madsrdf/authoritativeLabel "filename change",
   :rdf/type :madsrdf/Authority})

(def fix
  "fixity check"
  {:db/ident :loc.preservation.eventType/fix,
   :madsrdf/authoritativeLabel "fixity check",
   :rdf/type :madsrdf/Authority})

(def for
  "format identification"
  {:db/ident :loc.preservation.eventType/for,
   :madsrdf/authoritativeLabel "format identification",
   :rdf/type :madsrdf/Authority})

(def ima
  "imaging"
  {:db/ident :loc.preservation.eventType/ima,
   :madsrdf/authoritativeLabel "imaging",
   :rdf/type :madsrdf/Authority})

(def ine
  "ingestion end"
  {:db/ident :loc.preservation.eventType/ine,
   :madsrdf/authoritativeLabel "ingestion end",
   :rdf/type :madsrdf/Authority})

(def ing
  "ingestion"
  {:db/ident :loc.preservation.eventType/ing,
   :madsrdf/authoritativeLabel "ingestion",
   :rdf/type :madsrdf/Authority})

(def ins
  "ingestion start"
  {:db/ident :loc.preservation.eventType/ins,
   :madsrdf/authoritativeLabel "ingestion start",
   :rdf/type :madsrdf/Authority})

(def int
  "interpreting"
  {:db/ident :loc.preservation.eventType/int,
   :madsrdf/authoritativeLabel "interpreting",
   :rdf/type :madsrdf/Authority})

(def ipc
  "information package creation"
  {:db/ident :loc.preservation.eventType/ipc,
   :madsrdf/authoritativeLabel "information package creation",
   :rdf/type :madsrdf/Authority})

(def ipm
  "information package merging"
  {:db/ident :loc.preservation.eventType/ipm,
   :madsrdf/authoritativeLabel "information package merging",
   :rdf/type :madsrdf/Authority})

(def ips
  "information package splitting"
  {:db/ident :loc.preservation.eventType/ips,
   :madsrdf/authoritativeLabel "information package splitting",
   :rdf/type :madsrdf/Authority})

(def mee
  "metadata extraction"
  {:db/ident :loc.preservation.eventType/mee,
   :madsrdf/authoritativeLabel "metadata extraction",
   :rdf/type :madsrdf/Authority})

(def mem
  "metadata modification"
  {:db/ident :loc.preservation.eventType/mem,
   :madsrdf/authoritativeLabel "metadata modification",
   :rdf/type :madsrdf/Authority})

(def mes
  "message digest calculation"
  {:db/ident :loc.preservation.eventType/mes,
   :madsrdf/authoritativeLabel "message digest calculation",
   :rdf/type :madsrdf/Authority})

(def mig
  "migration"
  {:db/ident :loc.preservation.eventType/mig,
   :madsrdf/authoritativeLabel "migration",
   :rdf/type :madsrdf/Authority})

(def mod
  "modification"
  {:db/ident :loc.preservation.eventType/mod,
   :madsrdf/authoritativeLabel "modification",
   :rdf/type :madsrdf/Authority})

(def nor
  "normalization"
  {:db/ident :loc.preservation.eventType/nor,
   :madsrdf/authoritativeLabel "normalization",
   :rdf/type :madsrdf/Authority})

(def pac
  "packing"
  {:db/ident :loc.preservation.eventType/pac,
   :madsrdf/authoritativeLabel "packing",
   :rdf/type :madsrdf/Authority})

(def poa
  "policy assignment"
  {:db/ident :loc.preservation.eventType/poa,
   :madsrdf/authoritativeLabel "policy assignment",
   :rdf/type :madsrdf/Authority})

(def prt
  "printing"
  {:db/ident :loc.preservation.eventType/prt,
   :madsrdf/authoritativeLabel "printing",
   :rdf/type :madsrdf/Authority})

(def qua
  "quarantine"
  {:db/ident :loc.preservation.eventType/qua,
   :madsrdf/authoritativeLabel "quarantine",
   :rdf/type :madsrdf/Authority})

(def rec
  "recovery"
  {:db/ident :loc.preservation.eventType/rec,
   :madsrdf/authoritativeLabel "recovery",
   :rdf/type :madsrdf/Authority})

(def red
  "redaction"
  {:db/ident :loc.preservation.eventType/red,
   :madsrdf/authoritativeLabel "redaction",
   :rdf/type :madsrdf/Authority})

(def ref
  "refreshment"
  {:db/ident :loc.preservation.eventType/ref,
   :madsrdf/authoritativeLabel "refreshment",
   :rdf/type :madsrdf/Authority})

(def ren
  "rendering"
  {:db/ident :loc.preservation.eventType/ren,
   :madsrdf/authoritativeLabel "rendering",
   :rdf/type :madsrdf/Authority})

(def rep
  "replication"
  {:db/ident :loc.preservation.eventType/rep,
   :madsrdf/authoritativeLabel "replication",
   :rdf/type :madsrdf/Authority})

(def tra
  "transfer"
  {:db/ident :loc.preservation.eventType/tra,
   :madsrdf/authoritativeLabel "transfer",
   :rdf/type :madsrdf/Authority})

(def unp
  "unpacking"
  {:db/ident :loc.preservation.eventType/unp,
   :madsrdf/authoritativeLabel "unpacking",
   :rdf/type :madsrdf/Authority})

(def unq
  "unquarantine"
  {:db/ident :loc.preservation.eventType/unq,
   :madsrdf/authoritativeLabel "unquarantine",
   :rdf/type :madsrdf/Authority})

(def val
  "validation"
  {:db/ident :loc.preservation.eventType/val,
   :madsrdf/authoritativeLabel "validation",
   :rdf/type :madsrdf/Authority})

(def vir
  "virus check"
  {:db/ident :loc.preservation.eventType/vir,
   :madsrdf/authoritativeLabel "virus check",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} eventType
  "  Event Types are actions performed within or outside the repository that affect the long term preservation of digital objects."
  {:db/ident :loc.preservation/eventType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.eventType/ext
                                 :loc.preservation.eventType/der
                                 :loc.preservation.eventType/ine
                                 :loc.preservation.eventType/ref
                                 :loc.preservation.eventType/del
                                 :loc.preservation.eventType/val
                                 :loc.preservation.eventType/rec
                                 :loc.preservation.eventType/ren
                                 :loc.preservation.eventType/ips
                                 :loc.preservation.eventType/unp
                                 :loc.preservation.eventType/dsp
                                 :loc.preservation.eventType/prt
                                 :loc.preservation.eventType/pac
                                 :loc.preservation.eventType/ipc
                                 :loc.preservation.eventType/dsg
                                 :loc.preservation.eventType/mee
                                 :loc.preservation.eventType/com
                                 :loc.preservation.eventType/cop
                                 :loc.preservation.eventType/exe
                                 :loc.preservation.eventType/dec
                                 :loc.preservation.eventType/red
                                 :loc.preservation.eventType/cap
                                 :loc.preservation.eventType/vir
                                 :loc.preservation.eventType/poa
                                 :loc.preservation.eventType/int
                                 :loc.preservation.eventType/mes
                                 :loc.preservation.eventType/ing
                                 :loc.preservation.eventType/dis
                                 :loc.preservation.eventType/exp
                                 :loc.preservation.eventType/qua
                                 :loc.preservation.eventType/ipm
                                 :loc.preservation.eventType/fix
                                 :loc.preservation.eventType/mig
                                 :loc.preservation.eventType/nor
                                 :loc.preservation.eventType/mod
                                 :loc.preservation.eventType/unq
                                 :loc.preservation.eventType/dea
                                 :loc.preservation.eventType/app
                                 :loc.preservation.eventType/acc
                                 :loc.preservation.eventType/ins
                                 :loc.preservation.eventType/enc
                                 :loc.preservation.eventType/rep
                                 :loc.preservation.eventType/for
                                 :loc.preservation.eventType/mem
                                 :loc.preservation.eventType/cre
                                 :loc.preservation.eventType/ima
                                 :loc.preservation.eventType/fil
                                 :loc.preservation.eventType/ffa
                                 :loc.preservation.eventType/tra
                                 :loc.preservation.eventType/dig],
   :madsrdf/useFor [:loc.preservation/actionsGranted
                    :loc.preservation/environmentPurpose
                    :loc.preservation/inhibitorTarget],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment
   "  Event Types are actions performed within or outside the repository that affect the long term preservation of digital objects.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Type"},
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/eventType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/eventType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/eventType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/eventType,
                      :rdf/type           :cs/ChangeSet}]})