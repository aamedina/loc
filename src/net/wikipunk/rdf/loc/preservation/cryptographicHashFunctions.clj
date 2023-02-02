(ns net.wikipunk.rdf.loc.preservation.cryptographicHashFunctions
  "http://id.loc.gov/vocabulary/preservation/cryptographicHashFunctions/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/cryptographicHashFunctions.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.cryptographicHashFunctions"
    "http://id.loc.gov/vocabulary/preservation/cryptographicHashFunctions/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.cryptographicHashFunctions",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/cryptographicHashFunctions/"})

(def adler
  "Adler-32"
  {:db/ident :loc.preservation.cryptographicHashFunctions/adler,
   :madsrdf/authoritativeLabel "Adler-32",
   :rdf/type :madsrdf/Authority})

(def crc32
  "CRC32"
  {:db/ident :loc.preservation.cryptographicHashFunctions/crc32,
   :madsrdf/authoritativeLabel "CRC32",
   :rdf/type :madsrdf/Authority})

(def haval
  "HAVAL"
  {:db/ident :loc.preservation.cryptographicHashFunctions/haval,
   :madsrdf/authoritativeLabel "HAVAL",
   :rdf/type :madsrdf/Authority})

(def md2
  "MD2"
  {:db/ident :loc.preservation.cryptographicHashFunctions/md2,
   :madsrdf/authoritativeLabel "MD2",
   :rdf/type :madsrdf/Authority})

(def md5
  "MD5"
  {:db/ident :loc.preservation.cryptographicHashFunctions/md5,
   :madsrdf/authoritativeLabel "MD5",
   :rdf/type :madsrdf/Authority})

(def mnp
  "MNP"
  {:db/ident :loc.preservation.cryptographicHashFunctions/mnp,
   :madsrdf/authoritativeLabel "MNP",
   :rdf/type :madsrdf/Authority})

(def sha1
  "SHA-1"
  {:db/ident :loc.preservation.cryptographicHashFunctions/sha1,
   :madsrdf/authoritativeLabel "SHA-1",
   :rdf/type :madsrdf/Authority})

(def sha256
  "SHA-256"
  {:db/ident :loc.preservation.cryptographicHashFunctions/sha256,
   :madsrdf/authoritativeLabel "SHA-256",
   :rdf/type :madsrdf/Authority})

(def sha384
  "SHA-384"
  {:db/ident :loc.preservation.cryptographicHashFunctions/sha384,
   :madsrdf/authoritativeLabel "SHA-384",
   :rdf/type :madsrdf/Authority})

(def sha512
  "SHA-512"
  {:db/ident :loc.preservation.cryptographicHashFunctions/sha512,
   :madsrdf/authoritativeLabel "SHA-512",
   :rdf/type :madsrdf/Authority})

(def tiger
  "TIGER"
  {:db/ident :loc.preservation.cryptographicHashFunctions/tiger,
   :madsrdf/authoritativeLabel "TIGER",
   :rdf/type :madsrdf/Authority})

(def unk
  "unknown"
  {:db/ident :loc.preservation.cryptographicHashFunctions/unk,
   :madsrdf/authoritativeLabel "unknown",
   :rdf/type :madsrdf/Authority})

(def whirl
  "Whirlpool"
  {:db/ident :loc.preservation.cryptographicHashFunctions/whirl,
   :madsrdf/authoritativeLabel "Whirlpool",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} cryptographicHashFunctions
  "A cryptographic hash function is a transformation that takes an input and returns a fixed-size string, which is called the hash value. Hash functions with this property are used for a variety of computational purposes, including cryptography. The hash value is a concise representation of the message or document from which it was computed. Cryptographic hash functions are used to do message integrity checks and digital signatures in various information security applications, such as authentication and message integrity. They may also be referred to as message digest algorithms or checksum algorithms."
  {:db/ident :loc.preservation/cryptographicHashFunctions,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember
   [:loc.preservation.cryptographicHashFunctions/md5
    :loc.preservation.cryptographicHashFunctions/sha512
    :loc.preservation.cryptographicHashFunctions/sha256
    :loc.preservation.cryptographicHashFunctions/md2
    :loc.preservation.cryptographicHashFunctions/sha1
    :loc.preservation.cryptographicHashFunctions/tiger
    :loc.preservation.cryptographicHashFunctions/unk
    :loc.preservation.cryptographicHashFunctions/sha384
    :loc.preservation.cryptographicHashFunctions/crc32
    :loc.preservation.cryptographicHashFunctions/adler
    :loc.preservation.cryptographicHashFunctions/mnp
    :loc.preservation.cryptographicHashFunctions/whirl
    :loc.preservation.cryptographicHashFunctions/haval],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "A cryptographic hash function is a transformation that takes an input and returns a fixed-size string, which is called the hash value. Hash functions with this property are used for a variety of computational purposes, including cryptography. The hash value is a concise representation of the message or document from which it was computed. Cryptographic hash functions are used to do message integrity checks and digital signatures in various information security applications, such as authentication and message integrity. They may also be referred to as message digest algorithms or checksum algorithms.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptographic Hash Functions"},
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/cryptographicHashFunctions,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/cryptographicHashFunctions,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/cryptographicHashFunctions,
     :rdf/type           :cs/ChangeSet}]})