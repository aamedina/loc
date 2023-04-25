(ns net.wikipunk.rdf.loc.classification
  "http://id.loc.gov/authorities/classification/"
  {:dcat/downloadURL  "https://id.loc.gov/authorities/classification.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.classification"
                       "http://id.loc.gov/authorities/classification/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.classification",
   :rdfa/uri          "http://id.loc.gov/authorities/classification/"})

(def A
  "A -- GENERAL WORK"
  {:db/ident :loc.classification/A,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-11-20T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/AI1-AI21
                                     :loc.classification/AP1-AP271
                                     :loc.classification/AC1-AC1100
                                     :loc.classification/AM1-AM501
                                     :loc.classification/AS1-AS911
                                     :loc.classification/AE1-AE90
                                     :loc.classification/AY10-AY29
                                     :loc.classification/AZ19.2-AZ999
                                     :loc.classification/AG1-AG600],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                A -- GENERAL WORK                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class A"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2019-11-20T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/A,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/AM1-AM501
                 :loc.classification/AP1-AP271
                 :loc.classification/AY10-AY29
                 :loc.classification/AE1-AE90
                 :loc.classification/AZ19.2-AZ999
                 :loc.classification/AG1-AG600
                 :loc.classification/AI1-AI21
                 :loc.classification/AS1-AS911
                 :loc.classification/AC1-AC1100]})

(def B
  "B -- PHILOSOPHY. PSYCHOLOGY. RELIGION"
  {:db/ident :loc.classification/B,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2013-02-04T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/BQ1-BQ9800
                                     :loc.classification/BP1-BP610
                                     :loc.classification/BF1-BF990
                                     :loc.classification/BF1001-BF1389
                                     :loc.classification/BF1403.2-BF1999
                                     :loc.classification/BX1-BX9999
                                     :loc.classification/BR1-BR1725
                                     :loc.classification/BL1-BL2790
                                     :loc.classification/BT1-BT1480
                                     :loc.classification/BD10-BD701
                                     :loc.classification/BJ1801-BJ2195
                                     :loc.classification/BJ1-BJ1725
                                     :loc.classification/BS1-BS2970
                                     :loc.classification/B1-B5802
                                     :loc.classification/BH1-BH301
                                     :loc.classification/BM1-BM990
                                     :loc.classification/BV1-BV5099
                                     :loc.classification/BC1-BC199],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                B -- PHILOSOPHY. PSYCHOLOGY. RELIGION                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class B"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2013-02-04T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/B,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/BF1-BF990
                 :loc.classification/BX1-BX9999
                 :loc.classification/BJ1801-BJ2195
                 :loc.classification/BV1-BV5099
                 :loc.classification/B1-B5802
                 :loc.classification/BC1-BC199
                 :loc.classification/BF1001-BF1389
                 :loc.classification/BH1-BH301
                 :loc.classification/BP1-BP610
                 :loc.classification/BD10-BD701
                 :loc.classification/BS1-BS2970
                 :loc.classification/BF1403.2-BF1999
                 :loc.classification/BM1-BM990
                 :loc.classification/BJ1-BJ1725
                 :loc.classification/BL1-BL2790
                 :loc.classification/BQ1-BQ9800
                 :loc.classification/BT1-BT1480
                 :loc.classification/BR1-BR1725]})

(def C
  "C -- Auxiliary Sciences of History (General)"
  {:db/ident :loc.classification/C,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-11-22T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/C1-C51
                                     :loc.classification/CB3-CB481
                                     :loc.classification/CJ1-CJ6661
                                     :loc.classification/CR1-CR6305
                                     :loc.classification/CD1-CD6471
                                     :loc.classification/CS1-CS3090
                                     :loc.classification/CE1-CE97
                                     :loc.classification/CT21-CT9999
                                     :loc.classification/CN1-CN1355
                                     :loc.classification/CC1-CC960],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                C -- Auxiliary Sciences of History (General)                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class C"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2019-11-22T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/C,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/CS1-CS3090
                 :loc.classification/CB3-CB481
                 :loc.classification/CD1-CD6471
                 :loc.classification/CE1-CE97
                 :loc.classification/CC1-CC960
                 :loc.classification/CJ1-CJ6661
                 :loc.classification/C1-C51
                 :loc.classification/CN1-CN1355
                 :loc.classification/CR1-CR6305
                 :loc.classification/CT21-CT9999]})

(def D
  "D -- WORLD HISTORY AND HISTORY OF EUROPE,ASIA, AFRICA, AUSTRALIA, NEW ZEALAND, ETC."
  {:db/ident :loc.classification/D,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-03-10T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/DJ1-DJ500.22
                                     :loc.classification/DF10-DF951
                                     :loc.classification/DH901-DH925
                                     :loc.classification/DD1-DD905.22
                                     :loc.classification/DR1-DR2285
                                     :loc.classification/DP501-DP900
                                     :loc.classification/DE1-DE100
                                     :loc.classification/DH1-DH207
                                     :loc.classification/DU1-DU950
                                     :loc.classification/DQ1-DQ851
                                     :loc.classification/DC1-DC947
                                     :loc.classification/DA1-DA995
                                     :loc.classification/D1-D2027
                                     :loc.classification/DAW1001-DAW1051
                                     :loc.classification/DS1-DS937
                                     :loc.classification/DB1-DB879
                                     :loc.classification/DG11-DG980.2
                                     :loc.classification/DJK1-DJK77
                                     :loc.classification/DX101-DX301
                                     :loc.classification/DK1-DK949.5
                                     :loc.classification/DB881-DB898
                                     :loc.classification/DT1-DT3415
                                     :loc.classification/DL1-DL1180.2
                                     :loc.classification/DB2000-DB3150
                                     :loc.classification/DH401-DH811
                                     :loc.classification/DK4010-DK4800
                                     :loc.classification/DG987-DG999
                                     :loc.classification/DP1-DP402
                                     :loc.classification/DB901-DB999],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                D -- WORLD HISTORY AND HISTORY OF EUROPE,ASIA, AFRICA, AUSTRALIA, NEW ZEALAND, ETC.                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class D"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-03-10T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/D,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/DS1-DS937
                 :loc.classification/DP501-DP900
                 :loc.classification/DG987-DG999
                 :loc.classification/DU1-DU950
                 :loc.classification/DH401-DH811
                 :loc.classification/D1-D2027
                 :loc.classification/DB1-DB879
                 :loc.classification/DG11-DG980.2
                 :loc.classification/DK4010-DK4800
                 :loc.classification/DR1-DR2285
                 :loc.classification/DD1-DD905.22
                 :loc.classification/DK1-DK949.5
                 :loc.classification/DP1-DP402
                 :loc.classification/DQ1-DQ851
                 :loc.classification/DT1-DT3415
                 :loc.classification/DB881-DB898
                 :loc.classification/DA1-DA995
                 :loc.classification/DB2000-DB3150
                 :loc.classification/DAW1001-DAW1051
                 :loc.classification/DE1-DE100
                 :loc.classification/DC1-DC947
                 :loc.classification/DH1-DH207
                 :loc.classification/DJ1-DJ500.22
                 :loc.classification/DX101-DX301
                 :loc.classification/DH901-DH925
                 :loc.classification/DB901-DB999
                 :loc.classification/DL1-DL1180.2
                 :loc.classification/DJK1-DJK77
                 :loc.classification/DF10-DF951]})

(def E
  "E -- HISTORY OF THE AMERICAS"
  {:db/ident :loc.classification/E,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-03-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/E151-E883
                                     :loc.classification/E11-E143],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                E -- HISTORY OF THE AMERICAS                         ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class E"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-03-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/E,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/E11-E143 :loc.classification/E151-E883]})

(def F
  "F -- HISTORY OF THE AMERICAS"
  {:db/ident :loc.classification/F,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-03-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/F1170-F1170.52
                                     :loc.classification/F1-F975
                                     :loc.classification/F1001-F1140
                                     :loc.classification/F1201-F3799],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                F -- HISTORY OF THE AMERICAS                         ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class F"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-03-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/F,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/F1170-F1170.52
                 :loc.classification/F1201-F3799
                 :loc.classification/F1001-F1140
                 :loc.classification/F1-F975]})

(def G
  "G -- GEOGRAPHY. ANTHROPOLOGY. RECREATION"
  {:db/ident :loc.classification/G,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-04-06T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/GT1-GT7070
                                     :loc.classification/GR1-GR950
                                     :loc.classification/GN1-GN890
                                     :loc.classification/G1-G922
                                     :loc.classification/GE1-GE350
                                     :loc.classification/GF1-GF900
                                     :loc.classification/G1000-G3122
                                     :loc.classification/G3160-G3171
                                     :loc.classification/GB3-GB5030
                                     :loc.classification/G3180-G9980
                                     :loc.classification/GV1-GV1860
                                     :loc.classification/G9900-G9980
                                     :loc.classification/GA1-GA1776
                                     :loc.classification/GC1-GC1581],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                G -- GEOGRAPHY. ANTHROPOLOGY. RECREATION                         ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class G"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-04-06T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/G,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/GB3-GB5030
                 :loc.classification/GA1-GA1776
                 :loc.classification/G3160-G3171
                 :loc.classification/GN1-GN890
                 :loc.classification/GE1-GE350
                 :loc.classification/GV1-GV1860
                 :loc.classification/GC1-GC1581
                 :loc.classification/G9900-G9980
                 :loc.classification/G1-G922
                 :loc.classification/G3180-G9980
                 :loc.classification/GF1-GF900
                 :loc.classification/GT1-GT7070
                 :loc.classification/G1000-G3122
                 :loc.classification/GR1-GR950]})

(def H
  "H -- SOCIAL SCIENCES"
  {:db/ident :loc.classification/H,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-04-13T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/HB1-HB3840
                                     :loc.classification/HT1-HT1595.22
                                     :loc.classification/HA1-HA4737
                                     :loc.classification/HV1-HV9960
                                     :loc.classification/HF1-HF6182
                                     :loc.classification/HD28-HD9999
                                     :loc.classification/HJ9-HJ9940
                                     :loc.classification/HX1-HX970.72
                                     :loc.classification/HQ1-HQ2044
                                     :loc.classification/HN1-HN995
                                     :loc.classification/H1-H99
                                     :loc.classification/HM401-HM1281
                                     :loc.classification/HE1-HE9900
                                     :loc.classification/HG1-HG9999
                                     :loc.classification/HS1-HS3371
                                     :loc.classification/HC1-HC1085.2],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                H -- SOCIAL SCIENCES                         ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class H"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-04-13T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/H,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/HQ1-HQ2044
                 :loc.classification/HB1-HB3840
                 :loc.classification/HC1-HC1085.2
                 :loc.classification/HG1-HG9999
                 :loc.classification/H1-H99
                 :loc.classification/HX1-HX970.72
                 :loc.classification/HF1-HF6182
                 :loc.classification/HV1-HV9960
                 :loc.classification/HD28-HD9999
                 :loc.classification/HJ9-HJ9940
                 :loc.classification/HT1-HT1595.22
                 :loc.classification/HE1-HE9900
                 :loc.classification/HS1-HS3371
                 :loc.classification/HN1-HN995
                 :loc.classification/HA1-HA4737
                 :loc.classification/HM401-HM1281]})

(def J
  "J -- POLITICAL SCIENCE"
  {:db/ident :loc.classification/J,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-04-21T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/JZ2-JZ6530
                                     :loc.classification/JV6001-JV9480
                                     :loc.classification/JF20-JF2112
                                     :loc.classification/JN1-JN9692.2
                                     :loc.classification/JC11-JC607
                                     :loc.classification/JQ1-JQ6651
                                     :loc.classification/JL1-JL3899
                                     :loc.classification/JV1-JV5397
                                     :loc.classification/JK1-JK9993
                                     :loc.classification/JS3-JS8500
                                     :loc.classification/JA1-JA92
                                     :loc.classification/JJ1000-JJ1020
                                     :loc.classification/J1-J981],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                J -- POLITICAL SCIENCE                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class J"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-04-21T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/J,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/JS3-JS8500
                 :loc.classification/JA1-JA92
                 :loc.classification/JJ1000-JJ1020
                 :loc.classification/JZ2-JZ6530
                 :loc.classification/JN1-JN9692.2
                 :loc.classification/J1-J981
                 :loc.classification/JV6001-JV9480
                 :loc.classification/JK1-JK9993
                 :loc.classification/JV1-JV5397
                 :loc.classification/JQ1-JQ6651
                 :loc.classification/JC11-JC607
                 :loc.classification/JL1-JL3899
                 :loc.classification/JF20-JF2112]})

(def K
  "K -- LAW"
  {:db/ident :loc.classification/K,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2013-03-26T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "created"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/KFW1201-KFW1799
                                     :loc.classification/KFV1-KFV599
                                     :loc.classification/KTJ1-KTJ490
                                     :loc.classification/KSY1-KSY4990
                                     :loc.classification/KRS1-KRS500
                                     :loc.classification/KUN499.2-KUN999.24
                                     :loc.classification/KHS1-KHS9000
                                     :loc.classification/KGT1001-KGT1499
                                     :loc.classification/KFN1201-KFN1799
                                     :loc.classification/KLE1-KLE490
                                     :loc.classification/KJJ1-KJJ9999
                                     :loc.classification/KEN1201-KEN1799
                                     :loc.classification/KJ1-KJ4999
                                     :loc.classification/KQH0-KQH4990
                                     :loc.classification/KVQ1-KVQ490
                                     :loc.classification/KJV1-KJV9158.2
                                     :loc.classification/KGG1-KGG9800
                                     :loc.classification/KQJ1-KQJ490
                                     :loc.classification/KWL2001-KWL2490
                                     :loc.classification/KGM0-KGM499
                                     :loc.classification/KDK21-KDK1950
                                     :loc.classification/KRU1-KRU490
                                     :loc.classification/KKS1001-KKS1505
                                     :loc.classification/KNV1-KNV489.2
                                     :loc.classification/KKJ1-KKJ499
                                     :loc.classification/KQX0-KQX490
                                     :loc.classification/KMF1001-KMF1490
                                     :loc.classification/KZD1002-KZD6715
                                     :loc.classification/KHC1-KHC8200
                                     :loc.classification/KKI1-KKI4999
                                     :loc.classification/KHL0-KHL9000
                                     :loc.classification/KEB1-KEB599
                                     :loc.classification/KTK1-KTK490
                                     :loc.classification/KFL1-KFL599
                                     :loc.classification/KST1-KST499
                                     :loc.classification/KJQ1-KJQ499
                                     :loc.classification/KPH4999.2-KPH4999.77
                                     :loc.classification/KKK501-KKK1000
                                     :loc.classification/KJP5401-KJP5999
                                     :loc.classification/KPL1-KPL4990
                                     :loc.classification/KUA1-KUA499
                                     :loc.classification/KJM1-KJM4999
                                     :loc.classification/KTL0-KTL9560
                                     :loc.classification/KFK1-KFK599
                                     :loc.classification/KFM6601-KFM7199
                                     :loc.classification/KFT1-KFT599
                                     :loc.classification/KRC1-KRC490
                                     :loc.classification/KFN8601-KFN9199
                                     :loc.classification/KQW0-KQW8020
                                     :loc.classification/KKY1-KKY4999
                                     :loc.classification/KGN0-KGN9800
                                     :loc.classification/KMS1-KMS490
                                     :loc.classification/KJP1-KJP9999
                                     :loc.classification/KUF1-KUF499
                                     :loc.classification/KGR2001-KGR2499
                                     :loc.classification/KWH1-KWH490
                                     :loc.classification/KSG1-KSG500
                                     :loc.classification/K1-K7720.22
                                     :loc.classification/KU-KUN
                                     :loc.classification/KFN601-KFN1199
                                     :loc.classification/KBP1-KBP4860
                                     :loc.classification/KTN601-KTN700
                                     :loc.classification/KZ2-KZ7500
                                     :loc.classification/KEQ1-KEQ1199.5
                                     :loc.classification/KGL3001-KGL3499
                                     :loc.classification/KTW1-KTW490
                                     :loc.classification/KFM7801-KFM8399
                                     :loc.classification/KBU2-KBU4820
                                     :loc.classification/KMM1-KMM490
                                     :loc.classification/KSC1-KSC490
                                     :loc.classification/KTV0-KTV4990
                                     :loc.classification/KIA1-KIX1000
                                     :loc.classification/KKJ5001-KKJ9999
                                     :loc.classification/KLH1-KLH490
                                     :loc.classification/KWX1-KWX950
                                     :loc.classification/KNU0-KNU8999
                                     :loc.classification/KJS1-KJS4999
                                     :loc.classification/KKG1-KKG499
                                     :loc.classification/KKQ1-KKQ4999
                                     :loc.classification/KPA0-KPA4990
                                     :loc.classification/KEN5401-KEN5999
                                     :loc.classification/KMV0-KMV9870
                                     :loc.classification/KKP1-KKP4999
                                     :loc.classification/KVJ1-KVJ2998
                                     :loc.classification/KMF1-KMF490
                                     :loc.classification/KMC1-KMC999.2
                                     :loc.classification/KFS1801-KFS2399
                                     :loc.classification/KLA0-KLA9999
                                     :loc.classification/KGR1-KGR499
                                     :loc.classification/KSN1-KSN490
                                     :loc.classification/KFI1-KFI599
                                     :loc.classification/KF1-KF9827
                                     :loc.classification/KGJ1-KGJ999
                                     :loc.classification/KTF1-KTF490
                                     :loc.classification/KGW5001-KGW5499
                                     :loc.classification/KFO1201-KFO1799
                                     :loc.classification/KKB101-KKB9399
                                     :loc.classification/KJM7001-KJM7505
                                     :loc.classification/KNC0-KNC999
                                     :loc.classification/KTT1-KTT9910
                                     :loc.classification/KLD1-KLD490
                                     :loc.classification/KKL1-KKL499
                                     :loc.classification/KFA3601-KFA4199
                                     :loc.classification/KKC100-KKC4319
                                     :loc.classification/KSL1-KSL490
                                     :loc.classification/KQ2010-KQ9000
                                     :loc.classification/KM1-KM999
                                     :loc.classification/KGP1-KGP499
                                     :loc.classification/KJA0-KJA4999
                                     :loc.classification/KFW2401-KFW2999
                                     :loc.classification/KEM1-KEM599
                                     :loc.classification/KVR1-KVR490
                                     :loc.classification/KTC1-KTC490
                                     :loc.classification/KJT1-KJT4999
                                     :loc.classification/KGA1-KGA9000
                                     :loc.classification/KGL4001-KGL4499
                                     :loc.classification/KKS1-KKS499
                                     :loc.classification/KBR2-KBR4090
                                     :loc.classification/KPH5001-KPH5490
                                     :loc.classification/KWT2001-KWT2490
                                     :loc.classification/KGU1-KGU499
                                     :loc.classification/KMU1-KMU490
                                     :loc.classification/KUB1-KUB499
                                     :loc.classification/KQ2-KQ197
                                     :loc.classification/KTU1-KTU490
                                     :loc.classification/KHH1-KHH9900
                                     :loc.classification/KFM4201-KFM4799
                                     :loc.classification/KEN8001-KEN8599
                                     :loc.classification/KGT1-KGT499
                                     :loc.classification/KFA1-KFA599
                                     :loc.classification/KHQ1-KHQ9800
                                     :loc.classification/KGR1001-KGR1499
                                     :loc.classification/KFC1-KFC1199.5
                                     :loc.classification/KKW1-KKW9999
                                     :loc.classification/KFM1201-KFM1799
                                     :loc.classification/KNH1-KNH490
                                     :loc.classification/KTX0-KTX4990
                                     :loc.classification/KGV1-KGV8200
                                     :loc.classification/KWA1-KWA490
                                     :loc.classification/KUH1-KUH499
                                     :loc.classification/KVS1-KVS490
                                     :loc.classification/KQP1000-KQP1499.2
                                     :loc.classification/KSW0-KSW4990
                                     :loc.classification/KB2-KB4855
                                     :loc.classification/KSV5001-KSV5490
                                     :loc.classification/KQK1-KQK490
                                     :loc.classification/KEP1-KEP599
                                     :loc.classification/KRP0-KRP4990
                                     :loc.classification/KNF0-KNF4990
                                     :loc.classification/KEO1-KEO1199.5
                                     :loc.classification/KSZ1-KSZ490
                                     :loc.classification/KNM0-KNM4990
                                     :loc.classification/KGT2001-KGT2499
                                     :loc.classification/KSA1-KSA490
                                     :loc.classification/KGL7001-KGL7499
                                     :loc.classification/KGS1-KGS9000
                                     :loc.classification/KTG0-KTG4990
                                     :loc.classification/KNY10-KNY220
                                     :loc.classification/KSH0-KSH5000
                                     :loc.classification/KNT1-KNT9999
                                     :loc.classification/KWT1-KWT490
                                     :loc.classification/KD9400-KD9500.24
                                     :loc.classification/KVH1001-KVH1489
                                     :loc.classification/KTY1-KTY490
                                     :loc.classification/KNE10-KNE499
                                     :loc.classification/KFM1-KFM599
                                     :loc.classification/KLS1-KLS490
                                     :loc.classification/KGW1-KGW499
                                     :loc.classification/KFN5001-KFN6199.5
                                     :loc.classification/KML1-KML490
                                     :loc.classification/KWL1-KWL490
                                     :loc.classification/KUD1-KUD499
                                     :loc.classification/KVC1-KVC999.2
                                     :loc.classification/KJC2-KJC9999
                                     :loc.classification/KRL1-KRL500
                                     :loc.classification/KTH1-KTH490
                                     :loc.classification/KNU9500-KNU9590
                                     :loc.classification/KMT0-KMT4990
                                     :loc.classification/KPW1-KPW490
                                     :loc.classification/KDC51-KDC990
                                     :loc.classification/KWW1-KWW490
                                     :loc.classification/KGW7001-KGW7499
                                     :loc.classification/KLF1-KLF490
                                     :loc.classification/KEN7401-KEN7999
                                     :loc.classification/KKS6001-KKS6505
                                     :loc.classification/KNP1-KNP490
                                     :loc.classification/KMP1-KMP490
                                     :loc.classification/KRK1-KRK490
                                     :loc.classification/KRB1-KRB490
                                     :loc.classification/KVS2501-KVS2999
                                     :loc.classification/KGL6001-KGL6499
                                     :loc.classification/KLV1-KLV490
                                     :loc.classification/KVS501-KVS990
                                     :loc.classification/KEA1-KEA599
                                     :loc.classification/KGW3001-KGW3499
                                     :loc.classification/KSU1-KSU490
                                     :loc.classification/KFG1-KFG599
                                     :loc.classification/KFA1201-KFA1799
                                     :loc.classification/KUC1-KUC499
                                     :loc.classification/KPG-KPH
                                     :loc.classification/KHD0-KHD9900
                                     :loc.classification/KLN1-KLN490.2
                                     :loc.classification/KMH0-KMH4990
                                     :loc.classification/KQM0-KQM499
                                     :loc.classification/KTY1501-KTY1600
                                     :loc.classification/KMQ1001-KMQ1499
                                     :loc.classification/KSE601-KSE700
                                     :loc.classification/KVU1-KVU499
                                     :loc.classification/KKV1-KKV4999
                                     :loc.classification/KRN1-KRN500
                                     :loc.classification/KRM0-KRM4990
                                     :loc.classification/KGL1-KGL499
                                     :loc.classification/KPG6999.2-KPG9999
                                     :loc.classification/KVW1-KVW490
                                     :loc.classification/KKA1-KKA9799
                                     :loc.classification/KGJ7001-KGJ7499
                                     :loc.classification/KGK1001-KGK1499
                                     :loc.classification/KKX1-KKX4999
                                     :loc.classification/KSS1-KSS499
                                     :loc.classification/KUG1-KUG499
                                     :loc.classification/KLP9001-KLP9499
                                     :loc.classification/KMQ1-KMQ490
                                     :loc.classification/KJR1-KJR4999
                                     :loc.classification/KQT1-KQT490
                                     :loc.classification/KPH1-KPH9999
                                     :loc.classification/KWR1-KWR490
                                     :loc.classification/KGZ1-KGZ499
                                     :loc.classification/KGR3001-KGR3499
                                     :loc.classification/KUN3000-KUN3050
                                     :loc.classification/KFR1-KFR599
                                     :loc.classification/KTR1-KTR490
                                     :loc.classification/KPC0-KPC4990
                                     :loc.classification/KEY1-KEY599
                                     :loc.classification/KTA1-KTA9150
                                     :loc.classification/KFK1201-KFK1799
                                     :loc.classification/KGY1-KGY499
                                     :loc.classification/KKY7001-KKY7099
                                     :loc.classification/KRX1-KRX4990
                                     :loc.classification/KGW2001-KGW2499
                                     :loc.classification/KGW8001-KGW8499
                                     :loc.classification/KFD1-KFD599
                                     :loc.classification/KPE0-KPE4990
                                     :loc.classification/KE1-KE9450
                                     :loc.classification/KHN1-KHN9000
                                     :loc.classification/KJW50-KJW4550
                                     :loc.classification/KBS3-KBS4130
                                     :loc.classification/KGD1-KGD9990
                                     :loc.classification/KVM1-KVM490
                                     :loc.classification/KFW4201-KFW4799
                                     :loc.classification/KKN1-KKN4999
                                     :loc.classification/KNS-KNU
                                     :loc.classification/KG3001-KG3999
                                     :loc.classification/KFU1-KFU599
                                     :loc.classification/KRG1-KRG490
                                     :loc.classification/KKR1-KKR4999
                                     :loc.classification/KGL2001-KGL2499
                                     :loc.classification/KMJ0-KMJ4990
                                     :loc.classification/KNK1-KNK490
                                     :loc.classification/KI1-KI500
                                     :loc.classification/KVL1-KVL490
                                     :loc.classification/KVN1-KVN490
                                     :loc.classification/KRE1-KRE490
                                     :loc.classification/KTE1-KTE490
                                     :loc.classification/KMN1-KMN499.2
                                     :loc.classification/KHF1-KHF9800
                                     :loc.classification/KFI1201-KFI1799
                                     :loc.classification/KVE10-KVE649
                                     :loc.classification/KNN1-KNN9000.2
                                     :loc.classification/KGH9001-KGH9499
                                     :loc.classification/KNY220.A-KNY220.Z
                                     :loc.classification/KMG1-KMG489
                                     :loc.classification/KTD1-KTD490
                                     :loc.classification/KG1-KG999.2
                                     :loc.classification/KMM501-KMM994
                                     :loc.classification/KDZ1-KDZ4499.2
                                     :loc.classification/KLP0-KLP4989
                                     :loc.classification/KFN1801-KFN2399
                                     :loc.classification/KEZ1-KEZ9999
                                     :loc.classification/KMX1001-KMX1526
                                     :loc.classification/KVU1001-KVU1099.2
                                     :loc.classification/KFW1-KFW599
                                     :loc.classification/KFT1201-KFT1799
                                     :loc.classification/KSV1-KSV500
                                     :loc.classification/KKL1001-KKL1505
                                     :loc.classification/KPJ0-KPJ490
                                     :loc.classification/KJN1-KJN499
                                     :loc.classification/KFN1-KFN599
                                     :loc.classification/KNW0-KNW4990
                                     :loc.classification/KGL1001-KGL1499
                                     :loc.classification/KLT1-KLT490
                                     :loc.classification/KFD1201-KFD1799
                                     :loc.classification/KHW1-KHW9900
                                     :loc.classification/KFV2401-KFV2999
                                     :loc.classification/KLW1-KLW490
                                     :loc.classification/KFC1801-KFC2399
                                     :loc.classification/KES1-KES599
                                     :loc.classification/KUQ1-KUQ4990
                                     :loc.classification/KFS3001-KFS3599
                                     :loc.classification/KHM1-KHM9000
                                     :loc.classification/KSE1-KSE490
                                     :loc.classification/KGB0-KGB9000
                                     :loc.classification/KSX0-KSX4990
                                     :loc.classification/KHR1-KHS9000
                                     :loc.classification/KTZ1-KTZ490
                                     :loc.classification/KJK1-KJK4999
                                     :loc.classification/KNR0-KNR489
                                     :loc.classification/KGE0-KGE9990
                                     :loc.classification/KQG0-KQG5000
                                     :loc.classification/KFM2401-KFM2999
                                     :loc.classification/KKZ1-KKZ6990
                                     :loc.classification/KK1-KK9799.33
                                     :loc.classification/KPF1-KPF490
                                     :loc.classification/KGL5001-KGL5999
                                     :loc.classification/KNL1-KNL4990
                                     :loc.classification/KFO1-KFO599
                                     :loc.classification/KFZ1801-KFZ2399
                                     :loc.classification/KGP2001-KGP2499
                                     :loc.classification/KRY1-KRY500
                                     :loc.classification/KBT3-KBT4300
                                     :loc.classification/KL2-KL9299
                                     :loc.classification/KLB0-KLB5780
                                     :loc.classification/KWG1-KWG490
                                     :loc.classification/KFC3601-KFC4199
                                     :loc.classification/KFO2401-KFO2999
                                     :loc.classification/KLM1-KLM496
                                     :loc.classification/KBM1-KBM4855
                                     :loc.classification/KKT1-KKT9999
                                     :loc.classification/KGC1-KGC9800
                                     :loc.classification/KFZ8601-KFZ9199
                                     :loc.classification/KNX-KNY
                                     :loc.classification/KLQ1-KLQ499
                                     :loc.classification/KFH1-KFH599
                                     :loc.classification/KFI4201-KFI4799
                                     :loc.classification/KHK0-KHK9990
                                     :loc.classification/KLR1001-KLR1499
                                     :loc.classification/KNG1-KNG4990
                                     :loc.classification/KSP0-KSP4990
                                     :loc.classification/KGQ1-KGQ9800
                                     :loc.classification/KKC5100-KKC9990
                                     :loc.classification/KRR1-KRR500
                                     :loc.classification/KQP1-KQP500
                                     :loc.classification/KQV1-KQV490
                                     :loc.classification/KFP1-KFP599
                                     :loc.classification/KJK8001-KJK8699
                                     :loc.classification/KKF1-KKF4999
                                     :loc.classification/KNQ0-KNQ9665
                                     :loc.classification/KHA1-KHA9800
                                     :loc.classification/KGH1-KGH8000
                                     :loc.classification/KH1-KH999
                                     :loc.classification/KFX1004-KFX2593
                                     :loc.classification/KPV0-KPV8094.2
                                     :loc.classification/KHP1-KHP9700
                                     :loc.classification/KWP1-KWP490
                                     :loc.classification/KFM5401-KFM5999
                                     :loc.classification/KRV1-KRV490
                                     :loc.classification/KRW1-KRW500
                                     :loc.classification/KJH1-KJH499
                                     :loc.classification/KFN7401-KFN7999
                                     :loc.classification/KPM1-KPM4999.2
                                     :loc.classification/KTQ0-KTQ4890
                                     :loc.classification/KWQ1-KWQ490
                                     :loc.classification/KSK1-KSK4990
                                     :loc.classification/KMK1-KMK4990
                                     :loc.classification/KGR5001-KGR5499
                                     :loc.classification/KLR1-KLR490
                                     :loc.classification/KPP1-KPP499
                                     :loc.classification/KTN1-KTN500
                                     :loc.classification/KDE21-KDE580
                                     :loc.classification/KPS1-KPS4990
                                     :loc.classification/KGF1-KGF9900
                                     :loc.classification/KFF1-KFF599
                                     :loc.classification/KDG21-KDG540
                                     :loc.classification/KQC0-KQC999
                                     :loc.classification/KQE10-KQE1249
                                     :loc.classification/KME10-KME799
                                     :loc.classification/KKH9901-KKH9999.5
                                     :loc.classification/KPK1-KPK490
                                     :loc.classification/KFM9001-KFM9599
                                     :loc.classification/KKK1001-KKK1499
                                     :loc.classification/KFI3001-KFI3599
                                     :loc.classification/KKM1-KKM9999
                                     :loc.classification/KKK1-KKK499
                                     :loc.classification/KUE1-KUE499
                                     :loc.classification/KMY1-KMY490
                                     :loc.classification/KVH1-KVH490
                                     :loc.classification/KGR4001-KGR4499
                                     :loc.classification/KPT0-KPT4990
                                     :loc.classification/KZA1002-KZA5205
                                     :loc.classification/KGX1-KGX499
                                     :loc.classification/KHU1-KHU9800
                                     :loc.classification/KEN1-KEN599
                                     :loc.classification/KJW5200-KJW9600
                                     :loc.classification/KFN3601-KFN4199
                                     :loc.classification/KJE5-KJE9999
                                     :loc.classification/KKH1-KKH9860
                                     :loc.classification/KFA2401-KFA2999
                                     :loc.classification/KGK1-KGK499
                                     :loc.classification/KWC1-KWC490
                                     :loc.classification/KTM1-KTM500
                                     :loc.classification/KVP1-KVP100
                                     :loc.classification/KSR1-KSR490
                                     :loc.classification/KJG1-KJG4999
                                     :loc.classification/KD1-KD9500.24
                                     :loc.classification/KKE1-KKE4999
                                     :loc.classification/KWE1-KWE499],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                K -- LAW                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class K"},
   :skos/changeNote {:cs/changeReason    "created",
                     :cs/createdDate     #inst "2013-03-26T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/K,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/KRW1-KRW500
                 :loc.classification/KJA0-KJA4999
                 :loc.classification/KGL3001-KGL3499
                 :loc.classification/KFN3601-KFN4199
                 :loc.classification/KRU1-KRU490
                 :loc.classification/KES1-KES599
                 :loc.classification/KQJ1-KQJ490
                 :loc.classification/KEY1-KEY599
                 :loc.classification/KKW1-KKW9999
                 :loc.classification/KNU0-KNU8999
                 :loc.classification/KMP1-KMP490
                 :loc.classification/KUC1-KUC499
                 :loc.classification/KMN1-KMN499.2
                 :loc.classification/KFW1-KFW599
                 :loc.classification/KEP1-KEP599
                 :loc.classification/KGL4001-KGL4499
                 :loc.classification/KMY1-KMY490
                 :loc.classification/KWQ1-KWQ490
                 :loc.classification/KLF1-KLF490
                 :loc.classification/KEN1201-KEN1799
                 :loc.classification/KWH1-KWH490
                 :loc.classification/KPG-KPH
                 :loc.classification/KNT1-KNT9999
                 :loc.classification/KKQ1-KKQ4999
                 :loc.classification/KUG1-KUG499
                 :loc.classification/KG3001-KG3999
                 :loc.classification/KFO2401-KFO2999
                 :loc.classification/KST1-KST499
                 :loc.classification/KVM1-KVM490
                 :loc.classification/KSX0-KSX4990
                 :loc.classification/KDZ1-KDZ4499.2
                 :loc.classification/KKI1-KKI4999
                 :loc.classification/KGL6001-KGL6499
                 :loc.classification/KPG6999.2-KPG9999
                 :loc.classification/KWL1-KWL490
                 :loc.classification/KGY1-KGY499
                 :loc.classification/KTW1-KTW490
                 :loc.classification/KFU1-KFU599
                 :loc.classification/K1-K7720.22
                 :loc.classification/KTN601-KTN700
                 :loc.classification/KUB1-KUB499
                 :loc.classification/KGW2001-KGW2499
                 :loc.classification/KRP0-KRP4990
                 :loc.classification/KMK1-KMK4990
                 :loc.classification/KKP1-KKP4999
                 :loc.classification/KGU1-KGU499
                 :loc.classification/KKH9901-KKH9999.5
                 :loc.classification/KFA3601-KFA4199
                 :loc.classification/KPJ0-KPJ490
                 :loc.classification/KGH1-KGH8000
                 :loc.classification/KVQ1-KVQ490
                 :loc.classification/KNC0-KNC999
                 :loc.classification/KEN5401-KEN5999
                 :loc.classification/KVL1-KVL490
                 :loc.classification/KVU1001-KVU1099.2
                 :loc.classification/KJV1-KJV9158.2
                 :loc.classification/KTY1-KTY490
                 :loc.classification/KFM5401-KFM5999
                 :loc.classification/KGW3001-KGW3499
                 :loc.classification/KVR1-KVR490
                 :loc.classification/KPF1-KPF490
                 :loc.classification/KDE21-KDE580
                 :loc.classification/KSK1-KSK4990
                 :loc.classification/KQH0-KQH4990
                 :loc.classification/KPP1-KPP499
                 :loc.classification/KHN1-KHN9000
                 :loc.classification/KFI1201-KFI1799
                 :loc.classification/KFN5001-KFN6199.5
                 :loc.classification/KTG0-KTG4990
                 :loc.classification/KMJ0-KMJ4990
                 :loc.classification/KGP1-KGP499
                 :loc.classification/KTQ0-KTQ4890
                 :loc.classification/KTV0-KTV4990
                 :loc.classification/KMU1-KMU490
                 :loc.classification/KGC1-KGC9800
                 :loc.classification/KLN1-KLN490.2
                 :loc.classification/KGR3001-KGR3499
                 :loc.classification/KQT1-KQT490
                 :loc.classification/KQX0-KQX490
                 :loc.classification/KJW5200-KJW9600
                 :loc.classification/KGW5001-KGW5499
                 :loc.classification/KKR1-KKR4999
                 :loc.classification/KFM2401-KFM2999
                 :loc.classification/KEM1-KEM599
                 :loc.classification/KQW0-KQW8020
                 :loc.classification/KF1-KF9827
                 :loc.classification/KGN0-KGN9800
                 :loc.classification/KHD0-KHD9900
                 :loc.classification/KFN601-KFN1199
                 :loc.classification/KJN1-KJN499
                 :loc.classification/KMV0-KMV9870
                 :loc.classification/KKJ5001-KKJ9999
                 :loc.classification/KPC0-KPC4990
                 :loc.classification/KFK1-KFK599
                 :loc.classification/KEN8001-KEN8599
                 :loc.classification/KVC1-KVC999.2
                 :loc.classification/KPV0-KPV8094.2
                 :loc.classification/KFM4201-KFM4799
                 :loc.classification/KGT1-KGT499
                 :loc.classification/KNH1-KNH490
                 :loc.classification/KLP9001-KLP9499
                 :loc.classification/KRN1-KRN500
                 :loc.classification/KZA1002-KZA5205
                 :loc.classification/KLV1-KLV490
                 :loc.classification/KD9400-KD9500.24
                 :loc.classification/KFN1801-KFN2399
                 :loc.classification/KZD1002-KZD6715
                 :loc.classification/KNN1-KNN9000.2
                 :loc.classification/KQE10-KQE1249
                 :loc.classification/KPL1-KPL4990
                 :loc.classification/KGR5001-KGR5499
                 :loc.classification/KTC1-KTC490
                 :loc.classification/KFT1201-KFT1799
                 :loc.classification/KLR1-KLR490
                 :loc.classification/KNY10-KNY220
                 :loc.classification/KFN1201-KFN1799
                 :loc.classification/KKA1-KKA9799
                 :loc.classification/KVU1-KVU499
                 :loc.classification/KHP1-KHP9700
                 :loc.classification/KPE0-KPE4990
                 :loc.classification/KFX1004-KFX2593
                 :loc.classification/KUA1-KUA499
                 :loc.classification/KKK501-KKK1000
                 :loc.classification/KGL1001-KGL1499
                 :loc.classification/KHF1-KHF9800
                 :loc.classification/KKG1-KKG499
                 :loc.classification/KE1-KE9450
                 :loc.classification/KKC100-KKC4319
                 :loc.classification/KLP0-KLP4989
                 :loc.classification/KPK1-KPK490
                 :loc.classification/KMX1001-KMX1526
                 :loc.classification/KPH5001-KPH5490
                 :loc.classification/KFA1201-KFA1799
                 :loc.classification/KTX0-KTX4990
                 :loc.classification/KTH1-KTH490
                 :loc.classification/KMF1-KMF490
                 :loc.classification/KFI1-KFI599
                 :loc.classification/KSE601-KSE700
                 :loc.classification/KBS3-KBS4130
                 :loc.classification/KPH4999.2-KPH4999.77
                 :loc.classification/KGE0-KGE9990
                 :loc.classification/KRR1-KRR500
                 :loc.classification/KJT1-KJT4999
                 :loc.classification/KUN3000-KUN3050
                 :loc.classification/KNV1-KNV489.2
                 :loc.classification/KFN1-KFN599
                 :loc.classification/KWC1-KWC490
                 :loc.classification/KGK1001-KGK1499
                 :loc.classification/KFC3601-KFC4199
                 :loc.classification/KI1-KI500
                 :loc.classification/KVS501-KVS990
                 :loc.classification/KMQ1001-KMQ1499
                 :loc.classification/KWR1-KWR490
                 :loc.classification/KKH1-KKH9860
                 :loc.classification/KQG0-KQG5000
                 :loc.classification/KFV1-KFV599
                 :loc.classification/KKJ1-KKJ499
                 :loc.classification/KU-KUN
                 :loc.classification/KGL2001-KGL2499
                 :loc.classification/KLD1-KLD490
                 :loc.classification/KLS1-KLS490
                 :loc.classification/KFM1-KFM599
                 :loc.classification/KFS3001-KFS3599
                 :loc.classification/KFO1-KFO599
                 :loc.classification/KFW2401-KFW2999
                 :loc.classification/KL2-KL9299
                 :loc.classification/KSZ1-KSZ490
                 :loc.classification/KZ2-KZ7500
                 :loc.classification/KSH0-KSH5000
                 :loc.classification/KLE1-KLE490
                 :loc.classification/KNS-KNU
                 :loc.classification/KHC1-KHC8200
                 :loc.classification/KMQ1-KMQ490
                 :loc.classification/KBU2-KBU4820
                 :loc.classification/KMH0-KMH4990
                 :loc.classification/KKN1-KKN4999
                 :loc.classification/KME10-KME799
                 :loc.classification/KGH9001-KGH9499
                 :loc.classification/KFN8601-KFN9199
                 :loc.classification/KIA1-KIX1000
                 :loc.classification/KHS1-KHS9000
                 :loc.classification/KFW4201-KFW4799
                 :loc.classification/KVE10-KVE649
                 :loc.classification/KTZ1-KTZ490
                 :loc.classification/KTE1-KTE490
                 :loc.classification/KJM1-KJM4999
                 :loc.classification/KTM1-KTM500
                 :loc.classification/KFM9001-KFM9599
                 :loc.classification/KRM0-KRM4990
                 :loc.classification/KGJ1-KGJ999
                 :loc.classification/KLW1-KLW490
                 :loc.classification/KGB0-KGB9000
                 :loc.classification/KFS1801-KFS2399
                 :loc.classification/KGL1-KGL499
                 :loc.classification/KVS1-KVS490
                 :loc.classification/KEB1-KEB599
                 :loc.classification/KSU1-KSU490
                 :loc.classification/KPW1-KPW490
                 :loc.classification/KSV1-KSV500
                 :loc.classification/KGQ1-KGQ9800
                 :loc.classification/KFI3001-KFI3599
                 :loc.classification/KHQ1-KHQ9800
                 :loc.classification/KGR2001-KGR2499
                 :loc.classification/KGL5001-KGL5999
                 :loc.classification/KGR4001-KGR4499
                 :loc.classification/KGM0-KGM499
                 :loc.classification/KTF1-KTF490
                 :loc.classification/KHH1-KHH9900
                 :loc.classification/KJS1-KJS4999
                 :loc.classification/KWG1-KWG490
                 :loc.classification/KTR1-KTR490
                 :loc.classification/KNM0-KNM4990
                 :loc.classification/KNQ0-KNQ9665
                 :loc.classification/KMM1-KMM490
                 :loc.classification/KUQ1-KUQ4990
                 :loc.classification/KSP0-KSP4990
                 :loc.classification/KMG1-KMG489
                 :loc.classification/KFC1-KFC1199.5
                 :loc.classification/KNR0-KNR489
                 :loc.classification/KBM1-KBM4855
                 :loc.classification/KNG1-KNG4990
                 :loc.classification/KUH1-KUH499
                 :loc.classification/KG1-KG999.2
                 :loc.classification/KTU1-KTU490
                 :loc.classification/KKS1001-KKS1505
                 :loc.classification/KNE10-KNE499
                 :loc.classification/KSN1-KSN490
                 :loc.classification/KFZ1801-KFZ2399
                 :loc.classification/KHW1-KHW9900
                 :loc.classification/KKL1001-KKL1505
                 :loc.classification/KSV5001-KSV5490
                 :loc.classification/KUN499.2-KUN999.24
                 :loc.classification/KTT1-KTT9910
                 :loc.classification/KKC5100-KKC9990
                 :loc.classification/KVP1-KVP100
                 :loc.classification/KNK1-KNK490
                 :loc.classification/KGW1-KGW499
                 :loc.classification/KFR1-KFR599
                 :loc.classification/KUF1-KUF499
                 :loc.classification/KTK1-KTK490
                 :loc.classification/KJR1-KJR4999
                 :loc.classification/KGG1-KGG9800
                 :loc.classification/KEN7401-KEN7999
                 :loc.classification/KTL0-KTL9560
                 :loc.classification/KFD1201-KFD1799
                 :loc.classification/KQP1-KQP500
                 :loc.classification/KPM1-KPM4999.2
                 :loc.classification/KQK1-KQK490
                 :loc.classification/KD1-KD9500.24
                 :loc.classification/KFA2401-KFA2999
                 :loc.classification/KWA1-KWA490
                 :loc.classification/KBR2-KBR4090
                 :loc.classification/KLB0-KLB5780
                 :loc.classification/KKY1-KKY4999
                 :loc.classification/KHU1-KHU9800
                 :loc.classification/KWX1-KWX950
                 :loc.classification/KSY1-KSY4990
                 :loc.classification/KKS6001-KKS6505
                 :loc.classification/KKK1001-KKK1499
                 :loc.classification/KBT3-KBT4300
                 :loc.classification/KPS1-KPS4990
                 :loc.classification/KEO1-KEO1199.5
                 :loc.classification/KJK8001-KJK8699
                 :loc.classification/KFN7401-KFN7999
                 :loc.classification/KKB101-KKB9399
                 :loc.classification/KDG21-KDG540
                 :loc.classification/KVH1001-KVH1489
                 :loc.classification/KRC1-KRC490
                 :loc.classification/KJC2-KJC9999
                 :loc.classification/KRY1-KRY500
                 :loc.classification/KKT1-KKT9999
                 :loc.classification/KHK0-KHK9990
                 :loc.classification/KKF1-KKF4999
                 :loc.classification/KGR1001-KGR1499
                 :loc.classification/KEA1-KEA599
                 :loc.classification/KFM6601-KFM7199
                 :loc.classification/KTJ1-KTJ490
                 :loc.classification/KFW1201-KFW1799
                 :loc.classification/KEN1-KEN599
                 :loc.classification/KNF0-KNF4990
                 :loc.classification/KMT0-KMT4990
                 :loc.classification/KVH1-KVH490
                 :loc.classification/KLT1-KLT490
                 :loc.classification/KVN1-KVN490
                 :loc.classification/KGD1-KGD9990
                 :loc.classification/KPH1-KPH9999
                 :loc.classification/KNL1-KNL4990
                 :loc.classification/KH1-KH999
                 :loc.classification/KGL7001-KGL7499
                 :loc.classification/KDK21-KDK1950
                 :loc.classification/KRK1-KRK490
                 :loc.classification/KJE5-KJE9999
                 :loc.classification/KFP1-KFP599
                 :loc.classification/KRG1-KRG490
                 :loc.classification/KLA0-KLA9999
                 :loc.classification/KRE1-KRE490
                 :loc.classification/KM1-KM999
                 :loc.classification/KSC1-KSC490
                 :loc.classification/KRS1-KRS500
                 :loc.classification/KNY220.A-KNY220.Z
                 :loc.classification/KFI4201-KFI4799
                 :loc.classification/KKV1-KKV4999
                 :loc.classification/KFH1-KFH599
                 :loc.classification/KGT2001-KGT2499
                 :loc.classification/KFG1-KFG599
                 :loc.classification/KBP1-KBP4860
                 :loc.classification/KNX-KNY
                 :loc.classification/KKK1-KKK499
                 :loc.classification/KKE1-KKE4999
                 :loc.classification/KLQ1-KLQ499
                 :loc.classification/KFZ8601-KFZ9199
                 :loc.classification/KEZ1-KEZ9999
                 :loc.classification/KGJ7001-KGJ7499
                 :loc.classification/KHA1-KHA9800
                 :loc.classification/KWW1-KWW490
                 :loc.classification/KFV2401-KFV2999
                 :loc.classification/KMS1-KMS490
                 :loc.classification/KUD1-KUD499
                 :loc.classification/KTA1-KTA9150
                 :loc.classification/KTD1-KTD490
                 :loc.classification/KWT1-KWT490
                 :loc.classification/KSL1-KSL490
                 :loc.classification/KTY1501-KTY1600
                 :loc.classification/KGA1-KGA9000
                 :loc.classification/KSW0-KSW4990
                 :loc.classification/KGX1-KGX499
                 :loc.classification/KKS1-KKS499
                 :loc.classification/KJM7001-KJM7505
                 :loc.classification/KFF1-KFF599
                 :loc.classification/KJK1-KJK4999
                 :loc.classification/KHL0-KHL9000
                 :loc.classification/KQC0-KQC999
                 :loc.classification/KQV1-KQV490
                 :loc.classification/KPA0-KPA4990
                 :loc.classification/KLH1-KLH490
                 :loc.classification/KWE1-KWE499
                 :loc.classification/KWL2001-KWL2490
                 :loc.classification/KFA1-KFA599
                 :loc.classification/KVJ1-KVJ2998
                 :loc.classification/KLR1001-KLR1499
                 :loc.classification/KJP5401-KJP5999
                 :loc.classification/KJJ1-KJJ9999
                 :loc.classification/KRX1-KRX4990
                 :loc.classification/KJW50-KJW4550
                 :loc.classification/KSE1-KSE490
                 :loc.classification/KKX1-KKX4999
                 :loc.classification/KKY7001-KKY7099
                 :loc.classification/KPT0-KPT4990
                 :loc.classification/KWT2001-KWT2490
                 :loc.classification/KNU9500-KNU9590
                 :loc.classification/KSG1-KSG500
                 :loc.classification/KTN1-KTN500
                 :loc.classification/KNP1-KNP490
                 :loc.classification/KHM1-KHM9000
                 :loc.classification/KLM1-KLM496
                 :loc.classification/KFC1801-KFC2399
                 :loc.classification/KFD1-KFD599
                 :loc.classification/KWP1-KWP490
                 :loc.classification/KKL1-KKL499
                 :loc.classification/KGW8001-KGW8499
                 :loc.classification/KRL1-KRL500
                 :loc.classification/KB2-KB4855
                 :loc.classification/KJ1-KJ4999
                 :loc.classification/KGR1-KGR499
                 :loc.classification/KFM7801-KFM8399
                 :loc.classification/KNW0-KNW4990
                 :loc.classification/KGK1-KGK499
                 :loc.classification/KDC51-KDC990
                 :loc.classification/KJQ1-KJQ499
                 :loc.classification/KFO1201-KFO1799
                 :loc.classification/KHR1-KHS9000
                 :loc.classification/KKM1-KKM9999
                 :loc.classification/KGT1001-KGT1499
                 :loc.classification/KEQ1-KEQ1199.5
                 :loc.classification/KFL1-KFL599
                 :loc.classification/KRB1-KRB490
                 :loc.classification/KJG1-KJG4999
                 :loc.classification/KSR1-KSR490
                 :loc.classification/KFM1201-KFM1799
                 :loc.classification/KSS1-KSS499
                 :loc.classification/KQ2-KQ197
                 :loc.classification/KMC1-KMC999.2
                 :loc.classification/KUE1-KUE499
                 :loc.classification/KQ2010-KQ9000
                 :loc.classification/KJP1-KJP9999
                 :loc.classification/KJH1-KJH499
                 :loc.classification/KKZ1-KKZ6990
                 :loc.classification/KK1-KK9799.33
                 :loc.classification/KGZ1-KGZ499
                 :loc.classification/KFK1201-KFK1799
                 :loc.classification/KQM0-KQM499
                 :loc.classification/KML1-KML490
                 :loc.classification/KGV1-KGV8200
                 :loc.classification/KMM501-KMM994
                 :loc.classification/KVW1-KVW490
                 :loc.classification/KGP2001-KGP2499
                 :loc.classification/KVS2501-KVS2999
                 :loc.classification/KFT1-KFT599
                 :loc.classification/KGS1-KGS9000
                 :loc.classification/KQP1000-KQP1499.2
                 :loc.classification/KGF1-KGF9900
                 :loc.classification/KMF1001-KMF1490
                 :loc.classification/KGW7001-KGW7499
                 :loc.classification/KRV1-KRV490
                 :loc.classification/KSA1-KSA490]})

(def L
  "L -- EDUCATION"
  {:db/ident :loc.classification/L,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-05-18T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/L1-L991
                                     :loc.classification/LJ1-LJ165
                                     :loc.classification/LA1-LA2396
                                     :loc.classification/LH1-LH9
                                     :loc.classification/LC1-LC6691
                                     :loc.classification/LB1-LB3640
                                     :loc.classification/LT1-LT1001
                                     :loc.classification/LG1-LG961
                                     :loc.classification/LF1-LF5477
                                     :loc.classification/LE1-LE78
                                     :loc.classification/LD1-LD7501],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                L -- EDUCATION                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class L"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-05-18T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/L,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/LJ1-LJ165
                 :loc.classification/LF1-LF5477
                 :loc.classification/LB1-LB3640
                 :loc.classification/LG1-LG961
                 :loc.classification/LD1-LD7501
                 :loc.classification/L1-L991
                 :loc.classification/LT1-LT1001
                 :loc.classification/LC1-LC6691
                 :loc.classification/LA1-LA2396
                 :loc.classification/LH1-LH9
                 :loc.classification/LE1-LE78]})

(def M
  "M -- MUSIC AND BOOKS ON MUSIC"
  {:db/ident :loc.classification/M,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-06-12T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/ML1-ML3930
                                     :loc.classification/M1-M5000
                                     :loc.classification/MT1-MT999],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                M -- MUSIC AND BOOKS ON MUSIC                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class M"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2012-06-12T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/M,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/MT1-MT999
                 :loc.classification/ML1-ML3930
                 :loc.classification/M1-M5000]})

(def N
  "N -- FINE ARTS"
  {:db/ident :loc.classification/N,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-06-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/N1-N9211
                                     :loc.classification/NB1-NB1952
                                     :loc.classification/NC1-NC1940
                                     :loc.classification/NA1-NA9428
                                     :loc.classification/ND25-ND3416
                                     :loc.classification/NK1-NK9990
                                     :loc.classification/NE1-NE3002
                                     :loc.classification/NX1-NX820],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                N -- FINE ARTS                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class N"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2012-06-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/N,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/NB1-NB1952
                 :loc.classification/NK1-NK9990
                 :loc.classification/NX1-NX820
                 :loc.classification/N1-N9211
                 :loc.classification/NC1-NC1940
                 :loc.classification/ND25-ND3416
                 :loc.classification/NA1-NA9428
                 :loc.classification/NE1-NE3002]})

(def P
  "P -- LANGUAGE AND LITERATURE"
  {:db/ident :loc.classification/P,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-07-07T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/PQ6001-PQ8929
                                     :loc.classification/PN3311-PN3503
                                     :loc.classification/PN4500
                                     :loc.classification/PT7001-PT7099
                                     :loc.classification/PA5000-PA5660
                                     :loc.classification/PT5001-PT5980
                                     :loc.classification/PE1-PE3729
                                     :loc.classification/PN1600-PN3307.2
                                     :loc.classification/PK1-PK9601
                                     :loc.classification/PT7101-PT7338
                                     :loc.classification/PA2001-PA2915
                                     :loc.classification/PQ4001-PQ5999
                                     :loc.classification/PN4001-PN4500.2
                                     :loc.classification/PN4397
                                     :loc.classification/PA3000-PA3049
                                     :loc.classification/PN6010-PN6790
                                     :loc.classification/PA1000-PA1179
                                     :loc.classification/PJ1-PJ9500
                                     :loc.classification/PT7601-PT8260
                                     :loc.classification/PD1-PD7159
                                     :loc.classification/PN4395
                                     :loc.classification/PA3050-PA4505
                                     :loc.classification/PT1-PT4897
                                     :loc.classification/PT7351-PT7550
                                     :loc.classification/PA6000-PA6971
                                     :loc.classification/PT6500-PT6593.36
                                     :loc.classification/PF1-PF5999
                                     :loc.classification/PN1560-PN1590
                                     :loc.classification/P1-P1091
                                     :loc.classification/PT6000-PT6467.36
                                     :loc.classification/PA201-PA899
                                     :loc.classification/PN1-PN6790
                                     :loc.classification/PA8001-PA8595
                                     :loc.classification/PB1-PB3029
                                     :loc.classification/PM1-PM9021
                                     :loc.classification/PR1-PR9680
                                     :loc.classification/PL1-PL8844
                                     :loc.classification/PT8301-PT9155
                                     :loc.classification/PC1-PC5498
                                     :loc.classification/PH1-PH5490
                                     :loc.classification/PA1-PA199
                                     :loc.classification/PN4390
                                     :loc.classification/PN4550-PN4590
                                     :loc.classification/PS1-PS3626
                                     :loc.classification/PG1-PG9665
                                     :loc.classification/PS8001-PS8599
                                     :loc.classification/PQ1-PQ3999
                                     :loc.classification/PQ9000-PQ9999
                                     :loc.classification/PZ1-PZ90
                                     :loc.classification/PT9201-PT9999
                                     :loc.classification/PT7581-PT7599],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                P -- LANGUAGE AND LITERATURE                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class P"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-07-07T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/P,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/PS8001-PS8599
                 :loc.classification/PA3000-PA3049
                 :loc.classification/PA8001-PA8595
                 :loc.classification/PC1-PC5498
                 :loc.classification/PH1-PH5490
                 :loc.classification/PT9201-PT9999
                 :loc.classification/PE1-PE3729
                 :loc.classification/PN4397
                 :loc.classification/PG1-PG9665
                 :loc.classification/PT6000-PT6467.36
                 :loc.classification/PR1-PR9680
                 :loc.classification/PA1-PA199
                 :loc.classification/PN4001-PN4500.2
                 :loc.classification/PT1-PT4897
                 :loc.classification/PJ1-PJ9500
                 :loc.classification/PQ9000-PQ9999
                 :loc.classification/PN4550-PN4590
                 :loc.classification/PN4390
                 :loc.classification/PK1-PK9601
                 :loc.classification/PA5000-PA5660
                 :loc.classification/PQ4001-PQ5999
                 :loc.classification/PT7351-PT7550
                 :loc.classification/PA6000-PA6971
                 :loc.classification/PN4395
                 :loc.classification/PF1-PF5999
                 :loc.classification/PN3311-PN3503
                 :loc.classification/PS1-PS3626
                 :loc.classification/PB1-PB3029
                 :loc.classification/PQ6001-PQ8929
                 :loc.classification/PA201-PA899
                 :loc.classification/PD1-PD7159
                 :loc.classification/PM1-PM9021
                 :loc.classification/PL1-PL8844
                 :loc.classification/PA1000-PA1179
                 :loc.classification/PT7001-PT7099
                 :loc.classification/PQ1-PQ3999
                 :loc.classification/PN1-PN6790
                 :loc.classification/PA3050-PA4505
                 :loc.classification/P1-P1091
                 :loc.classification/PN1560-PN1590
                 :loc.classification/PT7101-PT7338
                 :loc.classification/PN6010-PN6790
                 :loc.classification/PT5001-PT5980
                 :loc.classification/PT7581-PT7599
                 :loc.classification/PN4500
                 :loc.classification/PT7601-PT8260
                 :loc.classification/PT8301-PT9155
                 :loc.classification/PT6500-PT6593.36
                 :loc.classification/PN1600-PN3307.2
                 :loc.classification/PA2001-PA2915
                 :loc.classification/PZ1-PZ90]})

(def Q
  "Q -- SCIENCE"
  {:db/ident :loc.classification/Q,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-08-10T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/QB1-QB991
                                     :loc.classification/QA1-QA939
                                     :loc.classification/QP1-QP981
                                     :loc.classification/QM1-QM695
                                     :loc.classification/QE1-QE996.5
                                     :loc.classification/QR1-QR502
                                     :loc.classification/QH301-QH705
                                     :loc.classification/Q1-Q390
                                     :loc.classification/QD1-QD999
                                     :loc.classification/QL1-QL991
                                     :loc.classification/QH1-QH278.5
                                     :loc.classification/QC1-QC999
                                     :loc.classification/QK1-QK989],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                Q -- SCIENCE                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class Q"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-08-10T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/Q,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/QP1-QP981
                 :loc.classification/QE1-QE996.5
                 :loc.classification/QD1-QD999
                 :loc.classification/QB1-QB991
                 :loc.classification/QH1-QH278.5
                 :loc.classification/QM1-QM695
                 :loc.classification/QK1-QK989
                 :loc.classification/QC1-QC999
                 :loc.classification/QR1-QR502
                 :loc.classification/QA1-QA939
                 :loc.classification/Q1-Q390
                 :loc.classification/QL1-QL991
                 :loc.classification/QH301-QH705]})

(def R
  "R -- SCIENCE"
  {:db/ident :loc.classification/R,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-08-11T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/RX1-RX681
                                     :loc.classification/RT1-RT120
                                     :loc.classification/RD1-RD811
                                     :loc.classification/RK1-RK715
                                     :loc.classification/RB1-RB214
                                     :loc.classification/R1-R920
                                     :loc.classification/RJ1-RJ570
                                     :loc.classification/RC1-RC1245
                                     :loc.classification/RE1-RE994
                                     :loc.classification/RM1-RM950
                                     :loc.classification/RS1-RS441
                                     :loc.classification/RV1-RV431
                                     :loc.classification/RG1-RG991
                                     :loc.classification/RA1-RA1270
                                     :loc.classification/RF1-RF547
                                     :loc.classification/RL1-RL803
                                     :loc.classification/RZ1-RZ999],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                R -- SCIENCE                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class R"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-08-11T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/R,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/RL1-RL803
                 :loc.classification/RE1-RE994
                 :loc.classification/R1-R920
                 :loc.classification/RS1-RS441
                 :loc.classification/RK1-RK715
                 :loc.classification/RT1-RT120
                 :loc.classification/RZ1-RZ999
                 :loc.classification/RB1-RB214
                 :loc.classification/RJ1-RJ570
                 :loc.classification/RD1-RD811
                 :loc.classification/RA1-RA1270
                 :loc.classification/RM1-RM950
                 :loc.classification/RC1-RC1245
                 :loc.classification/RX1-RX681
                 :loc.classification/RF1-RF547
                 :loc.classification/RV1-RV431
                 :loc.classification/RG1-RG991]})

(def S
  "S -- AGRICULTURE"
  {:db/ident :loc.classification/S,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-08-11T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/S1-S972
                                     :loc.classification/SB1-SB1110
                                     :loc.classification/SH1-SH691
                                     :loc.classification/SK1-SK664
                                     :loc.classification/SD1-SD669.5
                                     :loc.classification/SF1-SF1100],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                S -- AGRICULTURE                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class S"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-08-11T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/S,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/SF1-SF1100
                 :loc.classification/S1-S972
                 :loc.classification/SD1-SD669.5
                 :loc.classification/SH1-SH691
                 :loc.classification/SK1-SK664
                 :loc.classification/SB1-SB1110]})

(def T
  "T -- TECHNOLOGY"
  {:db/ident :loc.classification/T,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-08-12T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/TF1-TF1620
                                     :loc.classification/TD1-TD1066
                                     :loc.classification/TC1501-TC1800
                                     :loc.classification/TR1-TR1050
                                     :loc.classification/TG1-TG470
                                     :loc.classification/TA1-TA2040
                                     :loc.classification/TS1-TS2301
                                     :loc.classification/TX1-TX1110
                                     :loc.classification/T1-T995
                                     :loc.classification/TK1-TK9971
                                     :loc.classification/TE1-TE450
                                     :loc.classification/TJ1-TJ1570
                                     :loc.classification/TL1-TL4050
                                     :loc.classification/TT1-TT999
                                     :loc.classification/TC1-TC1800
                                     :loc.classification/TP1-TP1185
                                     :loc.classification/TH1-TH9745
                                     :loc.classification/TN1-TN997],
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                T -- TECHNOLOGY                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class T"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-08-12T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/T,
                     :rdf/type           :cs/ChangeSet},
   :skos/member [:loc.classification/TH1-TH9745
                 :loc.classification/TC1-TC1800
                 :loc.classification/TX1-TX1110
                 :loc.classification/TE1-TE450
                 :loc.classification/TT1-TT999
                 :loc.classification/T1-T995
                 :loc.classification/TJ1-TJ1570
                 :loc.classification/TL1-TL4050
                 :loc.classification/TN1-TN997
                 :loc.classification/TG1-TG470
                 :loc.classification/TF1-TF1620
                 :loc.classification/TS1-TS2301
                 :loc.classification/TP1-TP1185
                 :loc.classification/TK1-TK9971
                 :loc.classification/TC1501-TC1800
                 :loc.classification/TD1-TD1066
                 :loc.classification/TR1-TR1050
                 :loc.classification/TA1-TA2040]})

(def U
  "U -- MILITARY SCIENCE"
  {:db/ident :loc.classification/U,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-08-15T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/UF1-UF910
                                     :loc.classification/UB1-UB900
                                     :loc.classification/UG1500-UG1530
                                     :loc.classification/UD1-UD495
                                     :loc.classification/UC10-UC780
                                     :loc.classification/UG622-UG1435
                                     :loc.classification/UG1-UG620
                                     :loc.classification/U1-U900
                                     :loc.classification/UA10-UA997
                                     :loc.classification/UH20-UH910
                                     :loc.classification/UE1-UE500],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                U -- MILITARY SCIENCE                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class U"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-08-15T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/U,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/U1-U900
                 :loc.classification/UE1-UE500
                 :loc.classification/UH20-UH910
                 :loc.classification/UF1-UF910
                 :loc.classification/UG1500-UG1530
                 :loc.classification/UB1-UB900
                 :loc.classification/UG1-UG620
                 :loc.classification/UA10-UA997
                 :loc.classification/UG622-UG1435
                 :loc.classification/UD1-UD495
                 :loc.classification/UC10-UC780]})

(def V
  "V -- NAVAL SCIENCE"
  {:db/ident :loc.classification/V,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-08-15T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/VA10-VA750
                                     :loc.classification/VM1-VM989
                                     :loc.classification/VC10-VC580
                                     :loc.classification/VG20-VG2029
                                     :loc.classification/VB15-VB955
                                     :loc.classification/VF1-VF580
                                     :loc.classification/VK1-VK1661
                                     :loc.classification/VD7-VD430
                                     :loc.classification/VE7-VE500
                                     :loc.classification/V1-V995],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:madsrdf/MADSCollection :skos/Collection],
   :rdfs/comment
   "                                V -- NAVAL SCIENCE                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class V"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2020-08-15T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/V,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/VF1-VF580
                 :loc.classification/VK1-VK1661
                 :loc.classification/VE7-VE500
                 :loc.classification/VM1-VM989
                 :loc.classification/VA10-VA750
                 :loc.classification/VC10-VC580
                 :loc.classification/V1-V995
                 :loc.classification/VD7-VD430
                 :loc.classification/VB15-VB955
                 :loc.classification/VG20-VG2029]})

(def Z
  "Z -- BIBLIOGRAPHY. LIBRARY SCIENCE. INFORMATION RESOURCES (GENERAL)"
  {:db/ident :loc.classification/Z,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-11-27T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSCollectionMember [:loc.classification/Z662-Z1000.5
                                     :loc.classification/Z1201-Z4980
                                     :loc.classification/Z5051-Z7999
                                     :loc.classification/Z4-Z115.5
                                     :loc.classification/Z1001-Z1121
                                     :loc.classification/ZA3038-ZA5190
                                     :loc.classification/Z8001.A1-Z8999
                                     :loc.classification/Z116-Z659],
   :madsrdf/isMemberOfMADSScheme :loc.authorities/classification,
   :rdf/type [:skos/Collection :madsrdf/MADSCollection],
   :rdfs/comment
   "                                Z -- BIBLIOGRAPHY. LIBRARY SCIENCE. INFORMATION RESOURCES (GENERAL)                        ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification: Class Z"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2019-11-27T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.classification/Z,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.authorities/classification,
   :skos/member [:loc.classification/Z8001.A1-Z8999
                 :loc.classification/Z4-Z115.5
                 :loc.classification/Z1201-Z4980
                 :loc.classification/Z5051-Z7999
                 :loc.classification/ZA3038-ZA5190
                 :loc.classification/Z116-Z659
                 :loc.classification/Z1001-Z1121
                 :loc.classification/Z662-Z1000.5]})

(def ^{:private true} classification
  "The Library of Congress Classification (LCC) is a classification system that was first developed in the late nineteenth and early twentieth centuries to organize and arrange the book collections of the Library of Congress. Over the course of the twentieth century, the system was adopted for use by other libraries as well, especially large academic libraries in the United States. It is currently one of the most widely used library classification systems in the world. The system divides all knowledge into twenty-one basic classes, each identified by a single letter of the alphabet. Most of these alphabetical classes are further divided into more specific subclasses, identified by two-letter, or occasionally three-letter, combinations. For example, class N, Artxhtml:i&gt;, has subclasses NA, Architecturexhtml:i&gt;; NB, Sculpturexhtml:i&gt;, ND, Paintingxhtml:i&gt;; as well as several other subclasses. Each subclass includes a loosely hierarchical arrangement of the topics pertinent to the subclass, going from the general to the more specific. Individual topics are often broken down by specific places, time periods, or bibliographic forms (such as periodicals, biographies, etc.). Each topic (often referred to as a caption) is assigned a single number or a span of numbers. Whole numbers used in LCC may range from one to four digits in length, and may be further extended by the use of decimal numbers. Some subtopics appear in alphabetical, rather than hierarchical, lists and are represented by decimal numbers that combine a letter of the alphabet with a numeral , e.g. .B72 or .K535. Relationships among topics in LCC are shown not by the numbers that are assigned to them, but by indenting subtopics under the larger topics that they are a part of, much like an outline. In this respect, it is different from more strictly hierarchical classification systems, such as the Dewey Decimal Classificationxhtml:i&gt;, where hierarchical relationships among topics are shown by numbers that can be continuously subdivided."
  {:db/ident :loc.authorities/classification,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-11-20T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasMADSSchemeMember [:loc.classification/D
                                 :loc.classification/V
                                 :loc.classification/L
                                 :loc.classification/Q
                                 :loc.classification/G
                                 :loc.classification/T
                                 :loc.classification/E
                                 :loc.classification/M
                                 :loc.classification/A
                                 :loc.classification/J
                                 :loc.classification/C
                                 :loc.classification/R
                                 :loc.classification/U
                                 :loc.classification/H
                                 :loc.classification/K
                                 :loc.classification/Z
                                 :loc.classification/P
                                 :loc.classification/F
                                 :loc.classification/N
                                 :loc.classification/B
                                 :loc.classification/S],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment
   "The Library of Congress Classification (LCC) is a classification system that was first developed in the late nineteenth and early twentieth centuries to organize and arrange the book collections of the Library of Congress. Over the course of the twentieth century, the system was adopted for use by other libraries as well, especially large academic libraries in the United States. It is currently one of the most widely used library classification systems in the world. The system divides all knowledge into twenty-one basic classes, each identified by a single letter of the alphabet. Most of these alphabetical classes are further divided into more specific subclasses, identified by two-letter, or occasionally three-letter, combinations. For example, class N, Artxhtml:i&gt;, has subclasses NA, Architecturexhtml:i&gt;; NB, Sculpturexhtml:i&gt;, ND, Paintingxhtml:i&gt;; as well as several other subclasses. Each subclass includes a loosely hierarchical arrangement of the topics pertinent to the subclass, going from the general to the more specific. Individual topics are often broken down by specific places, time periods, or bibliographic forms (such as periodicals, biographies, etc.). Each topic (often referred to as a caption) is assigned a single number or a span of numbers. Whole numbers used in LCC may range from one to four digits in length, and may be further extended by the use of decimal numbers. Some subtopics appear in alphabetical, rather than hierarchical, lists and are represented by decimal numbers that combine a letter of the alphabet with a numeral , e.g. .B72 or .K535. Relationships among topics in LCC are shown not by the numbers that are assigned to them, but by indenting subtopics under the larger topics that they are a part of, much like an outline. In this respect, it is different from more strictly hierarchical classification systems, such as the Dewey Decimal Classificationxhtml:i&gt;, where hierarchical relationships among topics are shown by numbers that can be continuously subdivided.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Library of Congress Classification"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2019-11-20T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.authorities/classification,
                     :rdf/type           :cs/ChangeSet}})
