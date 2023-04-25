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
  "Adler-32 is a checksum algorithm which was invented by Mark Adler. Compared to a cyclic redundancy check of the same length it trades reliability for speed. Compared to its original form (Fletcher-16), Adler-32 is more reliable than Fletcher-16. However, Adler-32 is slightly less reliable than Fletcher-32."
  {:db/ident :loc.preservation.cryptographicHashFunctions/adler,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Adler-32",
   :madsrdf/code "adler",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Adler-32 is a checksum algorithm which was invented by Mark Adler. Compared to a cyclic redundancy check of the same length it trades reliability for speed. Compared to its original form (Fletcher-16), Adler-32 is more reliable than Fletcher-16. However, Adler-32 is slightly less reliable than Fletcher-32."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_PREMIS
    :loc.preservation.cryptographicHashFunctions/collection_METS
    :loc.preservation.cryptographicHashFunctions/collection_MIX],
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/cryptographicHashFunctions
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/adler,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/adler,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/adler,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Adler-32 is a checksum algorithm which was invented by Mark Adler. Compared to a cyclic redundancy check of the same length it trades reliability for speed. Compared to its original form (Fletcher-16), Adler-32 is more reliable than Fletcher-16. However, Adler-32 is slightly less reliable than Fletcher-32."},
   :skos/inScheme [:loc.preservation/cryptographicHashFunctions
                   :loc.vocabulary/preservation],
   :skos/notation "adler",
   :skos/prefLabel "Adler-32"})

(def crc32
  "A cyclic redundancy check (CRC) is a type of function that takes as input a data stream of any length and produces as output a value of a certain fixed size. The term CRC is often used to denote either the function or the function's output. A CRC can be used as a checksum to detect accidental alteration of data during transmission or storage."
  {:db/ident :loc.preservation.cryptographicHashFunctions/crc32,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "CRC32",
   :madsrdf/code "crc32",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A cyclic redundancy check (CRC) is a type of function that takes as input a data stream of any length and produces as output a value of a certain fixed size. The term CRC is often used to denote either the function or the function's output. A CRC can be used as a checksum to detect accidental alteration of data during transmission or storage."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_METS
    :loc.preservation.cryptographicHashFunctions/collection_MIX],
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/cryptographicHashFunctions
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/crc32,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/crc32,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/crc32,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A cyclic redundancy check (CRC) is a type of function that takes as input a data stream of any length and produces as output a value of a certain fixed size. The term CRC is often used to denote either the function or the function's output. A CRC can be used as a checksum to detect accidental alteration of data during transmission or storage."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "crc32",
   :skos/prefLabel "CRC32"})

(def haval
  "HAVAL is a cryptographic hash function. HAVAL can produce hashes in lengths of 128 bits, 160 bits, 192 bits, 224 bits, and 256 bits. HAVAL also allows users to specify the number of rounds (3, 4, or 5) to be used to generate the hash."
  {:db/ident :loc.preservation.cryptographicHashFunctions/haval,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "HAVAL",
   :madsrdf/code "haval",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "HAVAL is a cryptographic hash function. HAVAL can produce hashes in lengths of 128 bits, 160 bits, 192 bits, 224 bits, and 256 bits. HAVAL also allows users to specify the number of rounds (3, 4, or 5) to be used to generate the hash."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_METS
    :loc.preservation.cryptographicHashFunctions/collection_MIX
    :loc.preservation.cryptographicHashFunctions/collection_PREMIS],
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/cryptographicHashFunctions],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/haval,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/haval,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/haval,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "HAVAL is a cryptographic hash function. HAVAL can produce hashes in lengths of 128 bits, 160 bits, 192 bits, 224 bits, and 256 bits. HAVAL also allows users to specify the number of rounds (3, 4, or 5) to be used to generate the hash."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "haval",
   :skos/prefLabel "HAVAL"})

(def md2
  "In cryptography, MD2 (MD2 Message-Digest Algorithm) is a cryptographic hash function with a 128-bit hash value. As an Internet standard (RFC 1319), MD2 is commonly used to check the integrity of files. An MD2 hash is typically expressed as a 32-character hexadecimal number."
  {:db/ident :loc.preservation.cryptographicHashFunctions/md2,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "MD2",
   :madsrdf/code "md2",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "In cryptography, MD2 (MD2 Message-Digest Algorithm) is a cryptographic hash function with a 128-bit hash value. As an Internet standard (RFC 1319), MD2 is commonly used to check the integrity of files. An MD2 hash is typically expressed as a 32-character hexadecimal number."},
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/cryptographicHashFunctions
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/md2,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/md2,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/md2,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "In cryptography, MD2 (MD2 Message-Digest Algorithm) is a cryptographic hash function with a 128-bit hash value. As an Internet standard (RFC 1319), MD2 is commonly used to check the integrity of files. An MD2 hash is typically expressed as a 32-character hexadecimal number."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "md2",
   :skos/prefLabel "MD2"})

(def md5
  "In cryptography, MD5 (Message-Digest algorithm 5) is a widely used cryptographic hash function with a 128-bit hash value. As an Internet standard (RFC 1321), MD5 has been employed in a wide variety of security applications, and is also commonly used to check the integrity of files. An MD5 hash is typically expressed as a 32-character hexadecimal number."
  {:db/ident :loc.preservation.cryptographicHashFunctions/md5,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "MD5",
   :madsrdf/code "md5",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "In cryptography, MD5 (Message-Digest algorithm 5) is a widely used cryptographic hash function with a 128-bit hash value. As an Internet standard (RFC 1321), MD5 has been employed in a wide variety of security applications, and is also commonly used to check the integrity of files. An MD5 hash is typically expressed as a 32-character hexadecimal number."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_PREMIS
    :loc.preservation.cryptographicHashFunctions/collection_METS
    :loc.preservation.cryptographicHashFunctions/collection_MIX],
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/cryptographicHashFunctions],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/md5,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/md5,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/md5,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "In cryptography, MD5 (Message-Digest algorithm 5) is a widely used cryptographic hash function with a 128-bit hash value. As an Internet standard (RFC 1321), MD5 has been employed in a wide variety of security applications, and is also commonly used to check the integrity of files. An MD5 hash is typically expressed as a 32-character hexadecimal number."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "md5",
   :skos/prefLabel "MD5"})

(def mnp
  "The MNP (Microcom Networking Protocol) family of error-correcting protocols were commonly used on early high-speed (2400 bit/s and higher) modems. Originally developed for use on Microcom's own family of modems, the protocol was later openly licensed and used by most of the modem industry, notably the\"big three\", Telebit, USRobotics and Hayes. MNP was later supplanted by v.42bis, which was used almost universally on the first v.32bis modems in the early 1990s."
  {:db/ident :loc.preservation.cryptographicHashFunctions/mnp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "MNP",
   :madsrdf/code "mnp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The MNP (Microcom Networking Protocol) family of error-correcting protocols were commonly used on early high-speed (2400 bit/s and higher) modems. Originally developed for use on Microcom's own family of modems, the protocol was later openly licensed and used by most of the modem industry, notably the\"big three\", Telebit, USRobotics and Hayes. MNP was later supplanted by v.42bis, which was used almost universally on the first v.32bis modems in the early 1990s."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_MIX
    :loc.preservation.cryptographicHashFunctions/collection_METS],
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/cryptographicHashFunctions
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/mnp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/mnp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/mnp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The MNP (Microcom Networking Protocol) family of error-correcting protocols were commonly used on early high-speed (2400 bit/s and higher) modems. Originally developed for use on Microcom's own family of modems, the protocol was later openly licensed and used by most of the modem industry, notably the\"big three\", Telebit, USRobotics and Hayes. MNP was later supplanted by v.42bis, which was used almost universally on the first v.32bis modems in the early 1990s."},
   :skos/inScheme [:loc.preservation/cryptographicHashFunctions
                   :loc.vocabulary/preservation],
   :skos/notation "mnp",
   :skos/prefLabel "MNP"})

(def sha1
  "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."
  {:db/ident :loc.preservation.cryptographicHashFunctions/sha1,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "SHA-1",
   :madsrdf/code "sha1",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_MIX
    :loc.preservation.cryptographicHashFunctions/collection_METS
    :loc.preservation.cryptographicHashFunctions/collection_PREMIS],
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/cryptographicHashFunctions],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha1,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha1,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha1,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "sha1",
   :skos/prefLabel "SHA-1"})

(def sha256
  "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."
  {:db/ident :loc.preservation.cryptographicHashFunctions/sha256,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "SHA-256",
   :madsrdf/code "sha256",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_MIX
    :loc.preservation.cryptographicHashFunctions/collection_METS
    :loc.preservation.cryptographicHashFunctions/collection_PREMIS],
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/cryptographicHashFunctions
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha256,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha256,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha256,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "sha256",
   :skos/prefLabel "SHA-256"})

(def sha384
  "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."
  {:db/ident :loc.preservation.cryptographicHashFunctions/sha384,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "SHA-384",
   :madsrdf/code "sha384",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_METS
    :loc.preservation.cryptographicHashFunctions/collection_MIX
    :loc.preservation.cryptographicHashFunctions/collection_PREMIS],
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/cryptographicHashFunctions],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha384,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha384,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha384,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "sha384",
   :skos/prefLabel "SHA-384"})

(def sha512
  "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."
  {:db/ident :loc.preservation.cryptographicHashFunctions/sha512,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "SHA-512",
   :madsrdf/code "sha512",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_METS
    :loc.preservation.cryptographicHashFunctions/collection_MIX],
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/cryptographicHashFunctions],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha512,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha512,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/sha512,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "SHA stands for Secure Hash Algorithm. Hash algorithms compute a fixed-length digital representation (known as a message digest) of an input data sequence (the message) of any length."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "sha512",
   :skos/prefLabel "SHA-512"})

(def tiger
  "Tiger is a cryptographic hash function designed by Ross Anderson and Eli Biham in 1995 for efficiency on 64-bit platforms. The size of a Tiger hash value is 192 bits. Truncated versions (known as Tiger/128 and Tiger/160) can be used for compatibility with protocols assuming a particular hash size."
  {:db/ident :loc.preservation.cryptographicHashFunctions/tiger,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "TIGER",
   :madsrdf/code "tiger",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Tiger is a cryptographic hash function designed by Ross Anderson and Eli Biham in 1995 for efficiency on 64-bit platforms. The size of a Tiger hash value is 192 bits. Truncated versions (known as Tiger/128 and Tiger/160) can be used for compatibility with protocols assuming a particular hash size."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_MIX
    :loc.preservation.cryptographicHashFunctions/collection_PREMIS
    :loc.preservation.cryptographicHashFunctions/collection_METS],
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/cryptographicHashFunctions],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/tiger,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/tiger,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/tiger,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Tiger is a cryptographic hash function designed by Ross Anderson and Eli Biham in 1995 for efficiency on 64-bit platforms. The size of a Tiger hash value is 192 bits. Truncated versions (known as Tiger/128 and Tiger/160) can be used for compatibility with protocols assuming a particular hash size."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "tiger",
   :skos/prefLabel "TIGER"})

(def unk
  "Unknown indicates that a hash function was used but which it is cannot be adequately determined."
  {:db/ident :loc.preservation.cryptographicHashFunctions/unk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "unknown",
   :madsrdf/code "unk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Unknown indicates that a hash function was used but which it is cannot be adequately determined."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_MIX
    :loc.preservation.cryptographicHashFunctions/collection_PREMIS
    :loc.preservation.cryptographicHashFunctions/collection_METS],
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/cryptographicHashFunctions
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/unk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/unk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/unk,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Unknown indicates that a hash function was used but which it is cannot be adequately determined."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/cryptographicHashFunctions],
   :skos/notation "unk",
   :skos/prefLabel "unknown"})

(def whirl
  "Whirlpool (sometimes styled WHIRLPOOL) is a cryptographic hash function designed by Vincent Rijmen (co-creator of the Advanced Encryption Standard) and Paulo S. L. M. Barreto. The hash has been recommended by the NESSIE project. It has also been adopted by the International Organization for Standardization (ISO) and the International Electrotechnical Commission (IEC) as part of the joint ISO/IEC 10118-3 international standard."
  {:db/ident :loc.preservation.cryptographicHashFunctions/whirl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.cryptographicHashFunctions/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Whirlpool",
   :madsrdf/code "whirl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Whirlpool (sometimes styled WHIRLPOOL) is a cryptographic hash function designed by Vincent Rijmen (co-creator of the Advanced Encryption Standard) and Paulo S. L. M. Barreto. The hash has been recommended by the NESSIE project. It has also been adopted by the International Organization for Standardization (ISO) and the International Electrotechnical Commission (IEC) as part of the joint ISO/IEC 10118-3 international standard."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.preservation.cryptographicHashFunctions/collection_METS
    :loc.preservation.cryptographicHashFunctions/collection_MIX
    :loc.preservation.cryptographicHashFunctions/collection_PREMIS],
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/cryptographicHashFunctions],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Fixity,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/whirl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/whirl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.cryptographicHashFunctions/dlc,
     :cs/subjectOfChange :loc.preservation.cryptographicHashFunctions/whirl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whirlpool (sometimes styled WHIRLPOOL) is a cryptographic hash function designed by Vincent Rijmen (co-creator of the Advanced Encryption Standard) and Paulo S. L. M. Barreto. The hash has been recommended by the NESSIE project. It has also been adopted by the International Organization for Standardization (ISO) and the International Electrotechnical Commission (IEC) as part of the joint ISO/IEC 10118-3 international standard."},
   :skos/inScheme [:loc.preservation/cryptographicHashFunctions
                   :loc.vocabulary/preservation],
   :skos/notation "whirl",
   :skos/prefLabel "Whirlpool"})

(def ^{:private true} cryptographicHashFunctions
  "A cryptographic hash function is a transformation that takes an input and returns a fixed-size string, which is called the hash value. Hash functions with this property are used for a variety of computational purposes, including cryptography. The hash value is a concise representation of the message or document from which it was computed. Cryptographic hash functions are used to do message integrity checks and digital signatures in various information security applications, such as authentication and message integrity. They may also be referred to as message digest algorithms or checksum algorithms."
  {:db/ident :loc.preservation/cryptographicHashFunctions,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
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
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/cryptographicHashFunctions,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/cryptographicHashFunctions,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/cryptographicHashFunctions,
     :rdf/type           :cs/ChangeSet}]})