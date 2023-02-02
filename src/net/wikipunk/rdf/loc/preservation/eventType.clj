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
  "The process of adding an object to the inventory of a repository. This provides a clear delineation point for the assumption of responsibility for the digital content's preservation."
  {:db/ident :loc.preservation.eventType/acc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "accession",
   :madsrdf/code "acc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of adding an object to the inventory of a repository. This provides a clear delineation point for the assumption of responsibility for the digital content's preservation."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/dea,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "See also the antonym \"deaccession\""},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/acc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/acc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/acc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/acc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of adding an object to the inventory of a repository. This provides a clear delineation point for the assumption of responsibility for the digital content's preservation."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "acc",
   :skos/prefLabel "accession",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "See also the antonym \"deaccession\""},
   :skos/semanticRelation :loc.preservation.eventType/dea})

(def app
  "The process of evaluating whether an object should be included or retained in the repository."
  {:db/ident :loc.preservation.eventType/app,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "appraisal",
   :madsrdf/code "app",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of evaluating whether an object should be included or retained in the repository."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Appraisal can include the process of determining the length of time digital  material should be retained. This can be based on legal requirements, appraisal policy and current and potential usefulness."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/app,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/app,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of evaluating whether an object should be included or retained in the repository."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "app",
   :skos/prefLabel "appraisal",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Appraisal can include the process of determining the length of time digital material should be retained. This can be based on legal requirements, appraisal policy and current and potential usefulness."}})

(def cap
  "The process whereby a repository actively obtains an object through means other than a transfer from the creator/donor."
  {:db/ident :loc.preservation.eventType/cap,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "capture",
   :madsrdf/code "cap",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process whereby a repository actively obtains an object through means other than a transfer from the creator/donor."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "One use case for this event is the capture of websites during crawling functions                of a repository."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/cap,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/cap,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/cap,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/cap,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process whereby a repository actively obtains an object through means other than a transfer from the creator/donor."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "cap",
   :skos/prefLabel "capture",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "One use case for this event is the capture of websites during crawling functions of a repository."}})

(def com
  "The process of encoding data to save storage space or transmission time."
  {:db/ident :loc.preservation.eventType/com,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "compression",
   :madsrdf/code "com",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of encoding data to save storage space or transmission time."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/dec,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Within a PREMIS context, information about the lossiness of the compression                should be in the eventDetailInformation or eventOutcomeInformation. "},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/com,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/com,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/com,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/com,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of encoding data to save storage space or transmission time."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "com",
   :skos/prefLabel "compression",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Within a PREMIS context, information about the lossiness of the compression should be in the eventDetailInformation or eventOutcomeInformation."},
   :skos/semanticRelation :loc.preservation.eventType/dec})

(def cop
  "The process of translating source code into object code. "
  {:db/ident :loc.preservation.eventType/cop,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.eventType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "compiling",
   :madsrdf/code "cop",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The process of translating source code into object code. "},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.environmentPurpose/com,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.eventType/dlc,
                     :cs/subjectOfChange :loc.preservation.eventType/cop,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The process of translating source code into object code. "},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "cop",
   :skos/prefLabel "compiling"})

(def cre
  "The process of creating a new object."
  {:db/ident :loc.preservation.eventType/cre,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "creation",
   :madsrdf/code "cre",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "The process of creating a new object."},
   :madsrdf/hasNarrowerAuthority [:loc.preservation.eventType/nor
                                  :loc.preservation.eventType/mig
                                  :loc.preservation.eventType/rep],
   :madsrdf/hasVariant {:madsrdf/variantLabel "create",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "\"Normalization\" and \"migration\" are narrower terms. However, this is not limited to an object created through a derivation event. It can include the results of digitization."},
   :madsrdf/useFor :loc.preservation.environmentPurpose/cre,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/altLabel "create",
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/cre,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/cre,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/cre,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/cre,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The process of creating a new object."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/narrower [:loc.preservation.eventType/rep
                   :loc.preservation.eventType/nor
                   :loc.preservation.eventType/mig],
   :skos/notation "cre",
   :skos/prefLabel "creation",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "\"Normalization\" and \"migration\" are narrower terms. However, this is not limited to an object created through a derivation event. It can include the results of digitization."},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "create"}})

(def dea
  "The process of formally removing an object from the inventory of a repository. This may be by transfer to another repository, return to the depositor or by permanent deletion."
  {:db/ident :loc.preservation.eventType/dea,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "deaccession",
   :madsrdf/code "dea",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of formally removing an object from the inventory of a repository. This may be by transfer to another repository, return to the depositor or by permanent deletion."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/acc,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Note the relationship of deletion to this event. Deletion is a technical undertaking that may be a response to deaccession. An outcome of deaccessioning may be the deletion\" of objects. "},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dea,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dea,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dea,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dea,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of formally removing an object from the inventory of a repository. This may be by transfer to another repository, return to the depositor or by permanent deletion."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "dea",
   :skos/prefLabel "deaccession",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Note the relationship of deletion to this event. Deletion is a technical undertaking that may be a response to deaccession. An outcome of deaccessioning may be the deletion\" of objects."},
   :skos/semanticRelation :loc.preservation.eventType/acc})

(def dec
  "The process of reversing the effects of compression."
  {:db/ident :loc.preservation.eventType/dec,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "decompression",
   :madsrdf/code "dec",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The process of reversing the effects of compression."},
   :madsrdf/hasRelatedAuthority [:loc.preservation.eventType/com
                                 :loc.preservation.eventType/unp],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dec,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dec,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dec,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dec,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of reversing the effects of compression."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "dec",
   :skos/prefLabel "decompression",
   :skos/semanticRelation [:loc.preservation.eventType/com
                           :loc.preservation.eventType/unp]})

(def del
  "The process of permanently and wilfully removing an object in a repository."
  {:db/ident :loc.preservation.eventType/del,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "deletion",
   :madsrdf/code "del",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of permanently and wilfully removing an object in a repository."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "delete",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Some objects may be deaccessioned as a precursor to \"deletion\". "},
   :madsrdf/useFor :loc.preservation.actionsGranted/del,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/altLabel "delete",
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/del,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/del,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/del,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/del,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of permanently and wilfully removing an object in a repository."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "del",
   :skos/prefLabel "deletion",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Some objects may be deaccessioned as a precursor to \"deletion\"."},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "delete"}})

(def der
  "The process of converting encrypted data to data."
  {:db/ident :loc.preservation.eventType/der,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "decryption",
   :madsrdf/code "der",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The process of converting encrypted data to data."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/enc,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/useFor :loc.preservation.actionsGranted/del,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/der,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/der,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/der,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/der,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of converting encrypted data to data."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "der",
   :skos/prefLabel "decryption",
   :skos/semanticRelation :loc.preservation.eventType/enc})

(def dig
  "The process of determining that a decrypted digital signature matches an expected value."
  {:db/ident :loc.preservation.eventType/dig,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "digital signature validation",
   :madsrdf/code "dig",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of determining that a decrypted digital signature matches an expected value."},
   :madsrdf/hasBroaderAuthority :loc.preservation.eventType/val,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/broader :loc.preservation.eventType/val,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dig,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dig,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dig,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dig,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of determining that a decrypted digital signature matches an expected value."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "dig",
   :skos/prefLabel "digital signature validation"})

(def dis
  "The process of transmitting or providing access to a copy of the object."
  {:db/ident :loc.preservation.eventType/dis,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "dissemination",
   :madsrdf/code "dis",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of transmitting or providing access to a copy of the object."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/ipc,
   :madsrdf/hasVariant {:madsrdf/variantLabel "disseminate",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "It is assumed that a DIP is created in this process. Note the relationship with                \"information package creation\"."},
   :madsrdf/useFor :loc.preservation.actionsGranted/dis,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/altLabel "disseminate",
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dis,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dis,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of transmitting or providing access to a copy of the object."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "dis",
   :skos/prefLabel "dissemination",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "It is assumed that a DIP is created in this process. Note the relationship with \"information package creation\"."},
   :skos/semanticRelation :loc.preservation.eventType/ipc,
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "disseminate"}})

(def dsg
  "The process of generating a digital signature from a message using a private key."
  {:db/ident :loc.preservation.eventType/dsg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "digital signature generation",
   :madsrdf/code "dsg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of generating a digital signature from a message using a private key."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Digital signatures are verified through the \"digital signature validation\" event."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dsg,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/dsg,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of generating a digital signature from a message using a private key."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "dsg",
   :skos/prefLabel "digital signature generation",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Digital signatures are verified through the \"digital signature validation\" event."}})

(def dsp
  "The process of using a method of presenting graphical or pictorial images."
  {:db/ident :loc.preservation.eventType/dsp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.eventType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "displaying",
   :madsrdf/code "dsp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of using a method of presenting graphical or pictorial images."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.eventType/dlc,
                     :cs/subjectOfChange :loc.preservation.eventType/dsp,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of using a method of presenting graphical or pictorial images."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "dsp",
   :skos/prefLabel "displaying"})

(def enc
  "The process of converting data into encrypted data."
  {:db/ident :loc.preservation.eventType/enc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "encryption",
   :madsrdf/code "enc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The process of converting data into encrypted data."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/der,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/enc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/enc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of converting data into encrypted data."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "enc",
   :skos/prefLabel "encryption",
   :skos/semanticRelation :loc.preservation.eventType/der})

(def exe
  "The act of carrying out an instruction or program. This includes interpreting machine instructions, performing subroutines, and applying functions to sets of parameters"
  {:db/ident :loc.preservation.eventType/exe,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.eventType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "execution",
   :madsrdf/code "exe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The act of carrying out an instruction or program. This includes interpreting machine instructions, performing subroutines, and applying functions to sets of parameters"},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.eventType/dlc,
                     :cs/subjectOfChange :loc.preservation.eventType/exe,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of carrying out an instruction or program. This includes interpreting machine instructions, performing subroutines, and applying functions to sets of parameters"},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "exe",
   :skos/prefLabel "execution"})

(def exp
  "The process of formatting data in such a way that it can be used by another application."
  {:db/ident :loc.preservation.eventType/exp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.eventType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "exporting",
   :madsrdf/code "exp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of formatting data in such a way that it can be used by another application."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/dis,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Distinct from \"dissemination\". The end result of export may or may not be diss+E17emination."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.eventType/dlc,
                     :cs/subjectOfChange :loc.preservation.eventType/exp,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of formatting data in such a way that it can be used by another application."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "exp",
   :skos/prefLabel "exporting",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Distinct from \"dissemination\". The end result of export may or may not be diss+E17emination."},
   :skos/semanticRelation :loc.preservation.eventType/dis})

(def ext
  "The process of taking content out of a digital object. "
  {:db/ident :loc.preservation.eventType/ext,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.eventType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "extraction",
   :madsrdf/code "ext",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The process of taking content out of a digital object. "},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value
                       "Not to be confused with \"metadata extraction\"."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.eventType/dlc,
                     :cs/subjectOfChange :loc.preservation.eventType/ext,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of taking content out of a digital object. "},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "ext",
   :skos/prefLabel "extraction",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value
                    "Not to be confused with \"metadata extraction\"."}})

(def ffa
  "The process of forensically analyzing raw bitstreams."
  {:db/ident :loc.preservation.eventType/ffa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "forensic feature analysis",
   :madsrdf/code "ffa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The process of forensically analyzing raw bitstreams."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Forensic analysis is the process of determining structure, characteristics, or format of an unknown digital object."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ffa,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ffa,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of forensically analyzing raw bitstreams."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "ffa",
   :skos/prefLabel "forensic feature analysis",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Forensic analysis is the process of determining structure, characteristics, or format of an unknown digital object."}})

(def fil
  "The process of modifying a filename."
  {:db/ident :loc.preservation.eventType/fil,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "filename change",
   :madsrdf/code "fil",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "The process of modifying a filename."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Either a removal of prohibited character or a partial or entire replacement of  the original filename. This can be used to note changes such as removing characters, or where a system removes the filename entirely and replaces it with a system generated name."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/fil,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/fil,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The process of modifying a filename."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "fil",
   :skos/prefLabel "filename change",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Either a removal of prohibited character or a partial or entire replacement of the original filename. This can be used to note changes such as removing characters, or where a system removes the filename entirely and replaces it with a system generated name."}})

(def fix
  "The process of verifying that an object has not been changed in a given period."
  {:db/ident :loc.preservation.eventType/fix,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "fixity check",
   :madsrdf/code "fix",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of verifying that an object has not been changed in a given period."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This will most likely utilize the results of the \"message digest calculation\" event."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/fix,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/fix,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/fix,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:00.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/fix,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of verifying that an object has not been changed in a given period."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "fix",
   :skos/prefLabel "fixity check",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This will most likely utilize the results of the \"message digest calculation\" event."}})

(def for
  "The process of determining the object's file format and version."
  {:db/ident :loc.preservation.eventType/for,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "format identification",
   :madsrdf/code "for",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of determining the object's file format and version."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "identify",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This event is different from \"validation\" which compares the object to known format specifications. Format identification could of course have the result of unidentified which could in turn trigger further investigation/processes. "},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/altLabel "identify",
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/for,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/for,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of determining the object's file format and version."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "for",
   :skos/prefLabel "format identification",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This event is different from \"validation\" which compares the object to known format specifications. Format identification could of course have the result of unidentified which could in turn trigger further investigation/processes."},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "identify"}})

(def ima
  "The process of extracting a disk image from a physical information carrier."
  {:db/ident :loc.preservation.eventType/ima,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "imaging",
   :madsrdf/code "ima",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of extracting a disk image from a physical information carrier."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ima,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ima,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of extracting a disk image from a physical information carrier."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "ima",
   :skos/prefLabel "imaging"})

(def ine
  "The process of completion of the total ingest process."
  {:db/ident :loc.preservation.eventType/ine,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "ingestion end",
   :madsrdf/code "ine",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The process of completion of the total ingest process."},
   :madsrdf/hasBroaderAuthority :loc.preservation.eventType/ing,
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/ins,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value
                       "Should be used if \"ingestion start\" is recorded. "},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/broader :loc.preservation.eventType/ing,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ine,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ine,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of completion of the total ingest process."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "ine",
   :skos/prefLabel "ingestion end",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value
                    "Should be used if \"ingestion start\" is recorded."},
   :skos/semanticRelation :loc.preservation.eventType/ins})

(def ing
  "The process of adding objects to a preservation repository. More detail can be gained by utilizing \"Ingestion Start\" and \"Ingestion End\" rather than this one event."
  {:db/ident :loc.preservation.eventType/ing,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "ingestion",
   :madsrdf/code "ing",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of adding objects to a preservation repository. More detail can be gained by utilizing \"Ingestion Start\" and \"Ingestion End\" rather than this one event."},
   :madsrdf/hasNarrowerAuthority [:loc.preservation.eventType/ine
                                  :loc.preservation.eventType/ins],
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/ipc,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "It is assumed that a SIP is created in this process. Note the relationship with \"information package creation\"."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ing,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ing,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ing,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ing,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of adding objects to a preservation repository. More detail can be gained by utilizing \"Ingestion Start\" and \"Ingestion End\" rather than this one event."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/narrower [:loc.preservation.eventType/ine
                   :loc.preservation.eventType/ins],
   :skos/notation "ing",
   :skos/prefLabel "ingestion",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "It is assumed that a SIP is created in this process. Note the relationship with \"information package creation\"."},
   :skos/semanticRelation :loc.preservation.eventType/ipc})

(def ins
  "The process of starting the ingest process."
  {:db/ident :loc.preservation.eventType/ins,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "ingestion start",
   :madsrdf/code "ins",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The process of starting the ingest process."},
   :madsrdf/hasBroaderAuthority :loc.preservation.eventType/ing,
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/ine,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/broader :loc.preservation.eventType/ing,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ins,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:00.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ins,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "The process of starting the ingest process."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "ins",
   :skos/prefLabel "ingestion start",
   :skos/semanticRelation :loc.preservation.eventType/ine})

(def int
  "The process of analyzing a small unit of code, for example a single line, and carrying out specified actions, rather than producing a machine-code translation to be executed later."
  {:db/ident :loc.preservation.eventType/int,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.eventType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "interpreting",
   :madsrdf/code "int",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of analyzing a small unit of code, for example a single line, and carrying out specified actions, rather than producing a machine-code translation to be executed later."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/useFor :loc.preservation.environmentPurpose/int,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.eventType/dlc,
                     :cs/subjectOfChange :loc.preservation.eventType/int,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of analyzing a small unit of code, for example a single line, and carrying out specified actions, rather than producing a machine-code translation to be executed later."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "int",
   :skos/prefLabel "interpreting"})

(def ipc
  "The process of generating an Information Package (SIP, AIP or DIP)."
  {:db/ident :loc.preservation.eventType/ipc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "information package creation",
   :madsrdf/code "ipc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of generating an Information Package (SIP, AIP or DIP)."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/dis,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This event can describe the creation of an SIP, AIP or DIP. The eventOutcomeDetailNote can be used to determine what package type has been created. Note that other event types can result in information package creation (such as \"ingestion\" and  \"dissemination\"). It is left to the discretion of the user to decide what event(s) are recorded in line with their own requirements and standards. "},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ipc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ipc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of generating an Information Package (SIP, AIP or DIP)."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "ipc",
   :skos/prefLabel "information package creation",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This event can describe the creation of an SIP, AIP or DIP. The eventOutcomeDetailNote can be used to determine what package type has been created. Note that other event types can result in information package creation (such as \"ingestion\" and \"dissemination\"). It is left to the discretion of the user to decide what event(s) are recorded in line with their own requirements and standards."},
   :skos/semanticRelation :loc.preservation.eventType/dis})

(def ipm
  "The process of merging two or more Information Packages (SIP, AIP or DIP) into one Information Package of the type."
  {:db/ident :loc.preservation.eventType/ipm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "information package merging",
   :madsrdf/code "ipm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of merging two or more Information Packages (SIP, AIP or DIP) into one Information Package of the type."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This event covers functions that merge the contents of multiple information packages of one type into one information package: for example, multiple SIPs into one  SIP. It does not cover moving multiple information packages across types (i.e. multiple SIPs into one AIP). Such merging may for example be undertaken as a result of a repository wishing to reshape the structure of SIPs to better align with its object                model."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ipm,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ipm,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of merging two or more Information Packages (SIP, AIP or DIP) into one Information Package of the type."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "ipm",
   :skos/prefLabel "information package merging",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This event covers functions that merge the contents of multiple information packages of one type into one information package: for example, multiple SIPs into one SIP. It does not cover moving multiple information packages across types (i.e. multiple SIPs into one AIP). Such merging may for example be undertaken as a result of a repository wishing to reshape the structure of SIPs to better align with its object model."}})

(def ips
  "The process of dividing an Information Package (SIP, AIP or DIP) into two or more Information Packages of the same type."
  {:db/ident :loc.preservation.eventType/ips,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "information package splitting",
   :madsrdf/code "ips",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of dividing an Information Package (SIP, AIP or DIP) into two or more Information Packages of the same type."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This event covers functions that divide the contents of one information package into more than one information package of the same type: for example, one AIP into  multiple AIPs. It does not cover dividing an information package across types (e.g. one SIP into multiple AIPs). Such splitting may as an example be undertaken as a result of a repository wishing to divide a single large AIP into smaller AIPs to accommodate storage systems with size limitations."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ips,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ips,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of dividing an Information Package (SIP, AIP or DIP) into two or more Information Packages of the same type."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "ips",
   :skos/prefLabel "information package splitting",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This event covers functions that divide the contents of one information package into more than one information package of the same type: for example, one AIP into multiple AIPs. It does not cover dividing an information package across types (e.g. one SIP into multiple AIPs). Such splitting may as an example be undertaken as a result of a repository wishing to divide a single large AIP into smaller AIPs to accommodate storage systems with size limitations."}})

(def mee
  "The process of extracting metadata from an object. This includes technical, administrative and descriptive metadata."
  {:db/ident :loc.preservation.eventType/mee,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "metadata extraction",
   :madsrdf/code "mee",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of extracting metadata from an object. This includes technical, administrative and descriptive metadata."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "characterize",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/altLabel "characterize",
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mee,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mee,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of extracting metadata from an object. This includes technical, administrative and descriptive metadata."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "mee",
   :skos/prefLabel "metadata extraction",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "characterize"}})

(def mem
  "The process of making changes to the metadata of an object."
  {:db/ident :loc.preservation.eventType/mem,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "metadata modification",
   :madsrdf/code "mem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "The process of making changes to the metadata of an object."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The modification is of metadata, not an object. Compare with \"modification\" event."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mem,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mem,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "The process of making changes to the metadata of an object."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "mem",
   :skos/prefLabel "metadata modification",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The modification is of metadata, not an object. Compare with \"modification\" event."}})

(def mes
  "The process by which a message digest (\"hash\") is created."
  {:db/ident :loc.preservation.eventType/mes,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "message digest calculation",
   :madsrdf/code "mes",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "The process by which a message digest (\"hash\") is created."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Message digest is also commonly referred to as a \"checksum\". The event \"fixity check\" checks the message digest."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mes,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mes,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mes,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mes,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "The process by which a message digest (\"hash\") is created."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "mes",
   :skos/prefLabel "message digest calculation",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Message digest is also commonly referred to as a \"checksum\". The event \"fixity check\" checks the message digest."}})

(def mig
  "The act of transforming an object from one file format(s) into another file format(s)."
  {:db/ident :loc.preservation.eventType/mig,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "migration",
   :madsrdf/code "mig",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The act of transforming an object from one file format(s) into another file format(s)."},
   :madsrdf/hasBroaderAuthority :loc.preservation.eventType/cre,
   :madsrdf/hasVariant [{:madsrdf/variantLabel "migrate",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "transform",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "reformat",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Migration events should always create a new object. This term is narrower than the OAIS definition. "},
   :madsrdf/useFor :loc.preservation.actionsGranted/mig,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/altLabel ["reformat" "migrate" "transform"],
   :skos/broader :loc.preservation.eventType/cre,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mig,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mig,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mig,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mig,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of transforming an object from one file format(s) into another file format(s)."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "mig",
   :skos/prefLabel "migration",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Migration events should always create a new object. This term is narrower than the OAIS definition."},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "migrate"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "transform"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "reformat"}]})

(def mod
  "The act of changing a file or bitstream after receipt of the object."
  {:db/ident :loc.preservation.eventType/mod,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "modification",
   :madsrdf/code "mod",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The act of changing a file or bitstream after receipt of the object."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "modify",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "edit",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The modification takes place on the object, in contrast to the \"metadata                modification\" event."},
   :madsrdf/useFor [:loc.preservation.actionsGranted/mod
                    :loc.preservation.environmentPurpose/edt],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/altLabel ["edit" "modify"],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mod,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/mod,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of changing a file or bitstream after receipt of the object."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "mod",
   :skos/prefLabel "modification",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The modification takes place on the object, in contrast to the \"metadata modification\" event."},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "modify"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "edit"}]})

(def nor
  "An act of transforming of an object into an institutionally supported preservation format."
  {:db/ident :loc.preservation.eventType/nor,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "normalization",
   :madsrdf/code "nor",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An act of transforming of an object into an institutionally supported preservation format."},
   :madsrdf/hasBroaderAuthority :loc.preservation.eventType/cre,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/broader :loc.preservation.eventType/cre,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/nor,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/nor,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/nor,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/nor,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An act of transforming of an object into an institutionally supported preservation format."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "nor",
   :skos/prefLabel "normalization"})

(def pac
  "The process of putting objects into container files (e.g. .zip, .tar)."
  {:db/ident :loc.preservation.eventType/pac,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "packing",
   :madsrdf/code "pac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of putting objects into container files (e.g. .zip, .tar)."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/com,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Compression may be used in this packing. If so, an additional event of  \"compression\" should be recorded."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/pac,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/pac,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of putting objects into container files (e.g. .zip, .tar)."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "pac",
   :skos/prefLabel "packing",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Compression may be used in this packing. If so, an additional event of \"compression\" should be recorded."},
   :skos/semanticRelation :loc.preservation.eventType/com})

(def poa
  "The process of assigning a policy to an object."
  {:db/ident :loc.preservation.eventType/poa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "policy assignment",
   :madsrdf/code "poa",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The process of assigning a policy to an object."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value "Policies can be related to rights, preservation, access, etc."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/poa,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/poa,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of assigning a policy to an object."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "poa",
   :skos/prefLabel "policy assignment",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Policies can be related to rights, preservation, access, etc."}})

(def prt
  "The process of transferring to paper or another substrate an image, pictorial or textual, from an original representation in digital storage or from a physical representation."
  {:db/ident :loc.preservation.eventType/prt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.eventType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "printing",
   :madsrdf/code "prt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of transferring to paper or another substrate an image, pictorial or textual, from an original representation in digital storage or from a physical representation."},
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.inhibitorTarget/prt,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.eventType/dlc,
                     :cs/subjectOfChange :loc.preservation.eventType/prt,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of transferring to paper or another substrate an image, pictorial or textual, from an original representation in digital storage or from a physical representation."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "prt",
   :skos/prefLabel "printing"})

(def qua
  "The process of segregating objects for designated period of time."
  {:db/ident :loc.preservation.eventType/qua,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "quarantine",
   :madsrdf/code "qua",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of segregating objects for designated period of time."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/unq,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Usually undertaken as part of virus checking to allow time for virus definition  updates, or as a response to finding malware."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/qua,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/qua,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of segregating objects for designated period of time."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "qua",
   :skos/prefLabel "quarantine",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Usually undertaken as part of virus checking to allow time for virus definition updates, or as a response to finding malware."},
   :skos/semanticRelation :loc.preservation.eventType/unq})

(def rec
  "The act of regaining one or more files after a disaster. Usually occurs as part of a disaster recovery process."
  {:db/ident :loc.preservation.eventType/rec,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "recovery",
   :madsrdf/code "rec",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The act of regaining one or more files after a disaster. Usually occurs as part of a disaster recovery process."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/rec,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/rec,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of regaining one or more files after a disaster. Usually occurs as part of a disaster recovery process."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "rec",
   :skos/prefLabel "recovery"})

(def red
  "The process of modifying the content of information considered to be sensitive in nature (that is, the information cannot be viewed by non-authorized users of the repository)."
  {:db/ident :loc.preservation.eventType/red,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "redaction",
   :madsrdf/code "red",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of modifying the content of information considered to be sensitive in nature (that is, the information cannot be viewed by non-authorized users of the repository)."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value "Redaction will usually take place on a copy of the object. "},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/red,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/red,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of modifying the content of information considered to be sensitive in nature (that is, the information cannot be viewed by non-authorized users of the repository)."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "red",
   :skos/prefLabel "redaction",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value "Redaction will usually take place on a copy of the object."}})

(def ref
  "The process of moving objects to a new storage medium."
  {:db/ident :loc.preservation.eventType/ref,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "refreshment",
   :madsrdf/code "ref",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The process of moving objects to a new storage medium."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ref,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/ref,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of moving objects to a new storage medium."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "ref",
   :skos/prefLabel "refreshment"})

(def ren
  "The act of making a Digital Object perceptible to a user."
  {:db/ident :loc.preservation.eventType/ren,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.eventType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "rendering",
   :madsrdf/code "ren",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The act of making a Digital Object perceptible to a user."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "play",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/useFor [:loc.preservation.inhibitorTarget/pla
                    :loc.preservation.environmentPurpose/ren],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/altLabel "play",
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.eventType/dlc,
                     :cs/subjectOfChange :loc.preservation.eventType/ren,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The act of making a Digital Object perceptible to a user."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "ren",
   :skos/prefLabel "rendering",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "play"}})

(def rep
  "The process of creating a copy of an object that is, bit-wise, identical to the original."
  {:db/ident :loc.preservation.eventType/rep,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "replication",
   :madsrdf/code "rep",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of creating a copy of an object that is, bit-wise, identical to the original."},
   :madsrdf/hasBroaderAuthority :loc.preservation.eventType/cre,
   :madsrdf/hasVariant {:madsrdf/variantLabel "replicate",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :madsrdf/useFor :loc.preservation.actionsGranted/rep,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/altLabel "replicate",
   :skos/broader :loc.preservation.eventType/cre,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/rep,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/rep,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/rep,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/rep,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of creating a copy of an object that is, bit-wise, identical to the original."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "rep",
   :skos/prefLabel "replication",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "replicate"}})

(def tra
  "The process of transmitting metadata and/or digital object(s) to a repository."
  {:db/ident :loc.preservation.eventType/tra,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "transfer",
   :madsrdf/code "tra",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of transmitting metadata and/or digital object(s) to a repository."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/tra,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/tra,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of transmitting metadata and/or digital object(s) to a repository."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "tra",
   :skos/prefLabel "transfer"})

(def unp
  "The process of extracting objects from packages (e.g. .zip, .tar)."
  {:db/ident :loc.preservation.eventType/unp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "unpacking",
   :madsrdf/code "unp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of extracting objects from packages (e.g. .zip, .tar)."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/dec,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The archive file may be compressed. If so, an additional event of \"decompression\" should be recorded. "},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/unp,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/unp,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of extracting objects from packages (e.g. .zip, .tar)."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "unp",
   :skos/prefLabel "unpacking",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The archive file may be compressed. If so, an additional event of \"decompression\" should be recorded."},
   :skos/semanticRelation :loc.preservation.eventType/dec})

(def unq
  "The process of releasing a file from quarantine."
  {:db/ident :loc.preservation.eventType/unq,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "unquarantine",
   :madsrdf/code "unq",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The process of releasing a file from quarantine."},
   :madsrdf/hasRelatedAuthority :loc.preservation.eventType/qua,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/unq,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/unq,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of releasing a file from quarantine."},
   :skos/inScheme [:loc.preservation/eventType :loc.vocabulary/preservation],
   :skos/notation "unq",
   :skos/prefLabel "unquarantine",
   :skos/semanticRelation :loc.preservation.eventType/qua})

(def val
  "The process of comparing an object with a standard and noting compliance or exceptions."
  {:db/ident :loc.preservation.eventType/val,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "validation",
   :madsrdf/code "val",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The process of comparing an object with a standard and noting compliance or exceptions."},
   :madsrdf/hasNarrowerAuthority :loc.preservation.eventType/dig,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventType
                                  :loc.vocabulary/preservation],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The object being validated may be a file or an information package."},
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/val,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/val,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/val,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/val,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of comparing an object with a standard and noting compliance or exceptions."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/narrower :loc.preservation.eventType/dig,
   :skos/notation "val",
   :skos/prefLabel "validation",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The object being validated may be a file or an information package."}})

(def vir
  "The process of scanning a file for malicious programs."
  {:db/ident :loc.preservation.eventType/vir,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "virus check",
   :madsrdf/code "vir",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The process of scanning a file for malicious programs."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Event,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/vir,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/vir,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/vir,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.eventType/dlc,
                      :cs/subjectOfChange :loc.preservation.eventType/vir,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process of scanning a file for malicious programs."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/eventType],
   :skos/notation "vir",
   :skos/prefLabel "virus check"})

(def ^{:private true} eventType
  "  Event Types are actions performed within or outside the repository that affect the long term preservation of digital objects."
  {:db/ident :loc.preservation/eventType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-07T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
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
                      :cs/createdDate     #inst "2012-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/eventType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/eventType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2017-09-07T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/eventType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2010-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/eventType,
                      :rdf/type           :cs/ChangeSet}]})