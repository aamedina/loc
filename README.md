# loc
RDF vocabularies and linked data from the Library of Congress.

## rdfs:seeAlso
* https://id.loc.gov
* https://id.loc.gov/about/
* https://id.loc.gov/download/
* https://loc.gov/standards/mads/rdf/

## demo

``` shell
clojure -A:dev
```

``` clojure
user> (reset)
```

``` clojure
dev> (doc :madsrdf/GenreForm)
-------------------------
:madsrdf/GenreForm
   Describes a resource whose label is a genre or form term. Genre terms for textual materials designate specific kinds of materials distinguished by the style or technique of their intellectual contents; for example, biographies, catechisms, essays, hymns, or reviews. Form terms designate historically and functionally specific kinds of materials as distinguished by an examination of their physical character, characteristics of their intellectual content, or the order of information within them; for example, daybooks, diaries, directories, journals, memoranda, questionnaires, syllabi, or time sheets. In the context of graphic materials, genre headings denote categories of material distinguished by vantage point, intended purpose, characteristics of the creator, publication status, or method of representation.
  isa?
  :madsrdf/SimpleType
   :madsrdf/MADSType
    :owl/Class
     :rdfs/Class
```

``` clojure
dev> (require 'net.wikipunk.rdf.loc.genreForms)
```

``` clojure
dev> (reset)
```

``` clojure
dev> (count (descendants :madsrdf/GenreForm))
2664
```

``` clojure
dev> (->> (descendants :madsrdf/GenreForm)
          (random-sample 0.01)
          (take 10)
          (run! rdf/print-doc))
-------------------------
:loc.genreForms/gf2018026135
   Jump blues (Music)
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
-------------------------
:loc.genreForms/gf2014026314
   Epistolary fiction
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
-------------------------
:loc.genreForms/gf2014026211
   Abecedariuses
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
-------------------------
:loc.genreForms/gf2022026059
   Prank telephone calls
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
-------------------------
:loc.genreForms/gf2014026437
   Mock-heroic drama
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
-------------------------
:loc.genreForms/gf2011026498
   Radio golf matches
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
-------------------------
:loc.genreForms/gf2011026066
   Aviation films
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
-------------------------
:loc.genreForms/gf2014026713
   Chorales
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
-------------------------
:loc.genreForms/gf2011026508
   Radio public service announcements
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
-------------------------
:loc.genreForms/gf2017027267
   Watercolors
  isa?
  :madsrdf/GenreForm
   :madsrdf/MADSType
    :skos/Concept
     :madsrdf/SimpleType
      :madsrdf/Authority
       :owl/Class
        :rdfs/Class
```

``` clojure
dev> (datafy :loc.genreForms/gf2022026059)
{:rdf/type [:madsrdf/GenreForm :madsrdf/Authority],
 :mop/class-direct-slots [],
 :madsrdf/elementList
 [{:madsrdf/elementValue "Prank telephone calls@en",
   :rdf/type :madsrdf/GenreFormElement}],
 :madsrdf/hasVariant
 [{:madsrdf/elementList
   [{:madsrdf/elementValue "Crank calls@en",
     :rdf/type :madsrdf/GenreFormElement}],
   :madsrdf/variantLabel "Crank calls@en",
   :rdf/type [:madsrdf/Variant :madsrdf/GenreForm]}
  {:madsrdf/elementList
   [{:madsrdf/elementValue "Crank telephone calls@en",
     :rdf/type :madsrdf/GenreFormElement}],
   :madsrdf/variantLabel "Crank telephone calls@en",
   :rdf/type [:madsrdf/Variant :madsrdf/GenreForm]}
  {:madsrdf/elementList
   [{:madsrdf/elementValue "Prank calls@en",
     :rdf/type :madsrdf/GenreFormElement}],
   :madsrdf/variantLabel "Prank calls@en",
   :rdf/type [:madsrdf/Variant :madsrdf/GenreForm]}],
 :madsrdf/isMemberOfMADSScheme :loc.authorities/genreForms,
 :identifiers/lccn "gf2022026059",
 :madsrdf/isMemberOfMADSCollection
 :loc.genreForms/collection_LCGFT_General,
 :mop/class-direct-default-initargs {},
 :mop/class-default-initargs {},
 :bflc/marcKey "155  $aPrank telephone calls",
 :db/ident :loc.genreForms/gf2022026059,
 :mop/class-slots
 [:foaf/focus
  :skos/semanticRelation
  :skos/topConceptOf
  :madsrdf/isTopMemberOfMADSScheme
  :madsrdf/isMemberOfMADSScheme
  :madsrdf/isMemberOfMADSCollection
  :madsrdf/identifiesRWO
  :madsrdf/hasVariant
  :madsrdf/hasRelatedAuthority
  :madsrdf/hasHiddenVariant
  :madsrdf/classification
  :madsrdf/authoritativeLabel
  :madsrdf/adminMetadata
  :madsrdf/code
  :madsrdf/see],
 :madsrdf/hasBroaderAuthority :loc.genreForms/gf2014026265,
 :mop/class-precedence-list
 [:loc.genreForms/gf2022026059
  :madsrdf/GenreForm
  :madsrdf/MADSType
  :skos/Concept
  :madsrdf/SimpleType
  :madsrdf/Authority
  :owl/Class
  :rdfs/Class],
 :madsrdf/historyNote "[Established December 2022.]",
 :madsrdf/adminMetadata
 [{:rdf/type :ri/RecordInfo,
   :ri/languageOfCataloging :loc.iso639-2/eng,
   :ri/recordChangeDate #inst "2022-08-17T04:00:00.000-00:00",
   :ri/recordContentSource :loc.organizations/dlc,
   :ri/recordStatus "new"}
  {:rdf/type :ri/RecordInfo,
   :ri/languageOfCataloging :loc.iso639-2/eng,
   :ri/recordChangeDate #inst "2022-12-22T17:05:50.000-00:00",
   :ri/recordContentSource :loc.organizations/dlc,
   :ri/recordStatus "revised"}],
 :madsrdf/hasSource
 [{:madsrdf/citationNote
   "under Prank call (A prank call (also known as a crank call) is a telephone call intended by the caller as a practical joke played on the person answering. It is often a type of nuisance call. Recordings of prank phone calls became a staple of the obscure and amusing cassette tapes traded among musicians, sound engineers, and media traders in the United States from the late 1970s)@en",
   :madsrdf/citationSource "Wikipedia, viewed Aug. 17, 2022",
   :madsrdf/citationStatus "found",
   :rdf/type :madsrdf/Source}
  {:madsrdf/citationSource "Work cat: Phone jackin, 1997",
   :madsrdf/citationStatus "found",
   :rdf/type :madsrdf/Source}],
 :madsrdf/authoritativeLabel "Prank telephone calls@en"}
```

``` clojure
dev> (require 'net.wikipunk.rdf.loc.organizations)
dev> (reset)
dev> (doc :loc.organizations/dlc)
-------------------------
:loc.organizations/dlc
   United States, Library of Congress
  isa?
  :madsrdf/CorporateName
   :madsrdf/Name
    :madsrdf/MADSType
     :skos/Concept
      :madsrdf/SimpleType
       :madsrdf/Authority
        :owl/Class
         :rdfs/Class
dev> (run! rdf/print-doc (descendants :loc.organizations/dlc))
-------------------------
:loc.organizations/dlcismn
   U.S. ISMN Agency
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcr
   United States, Library of Congress, Regional and Cooperative Cataloging Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcstbd
   Library of Congress, Science, Technology and Business Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcbm
   United States, Library of Congress, National Library Service for the Blind and Physically Handicapped, Music Library
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcm
   United States, Library of Congress, Music Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcb
   United States, Library of Congress, National Library Service for the Blind and Physically Handicapped
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcntc
   United States, Library of Congress, National Translations Center
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcvhp
   Veterans History Project, Library of Congress
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcss
   United States, Library of Congress, Social Sciences Cataloging Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcmpmi
   Library of Congress, Motion Picture, Broadcasting and Recorded Sound Division, Moving Image Section
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcsgp
   Library of Congress Serial and Government Publications Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcrs
   Library of Congress, Motion Picture, Broadcasting, and Recorded Sound Division, Recorded Sound Section
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcnr
   United States, Library of Congress, National Resources Program Office
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcpp
   Library of Congress, Prints & Photographs Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcmrc
   United States, Library of Congress, Network Development and MARC Standards Office
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlclca
   Library of Congress Archives
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcad
   Library of Congress, Asian Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcrbsc
   Library of Congress, Rare Book and Special Collections Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcpf
   United States, Library of Congress, Priority Four Collection Unit
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcadc
   United States, Library of Congress, Asian Division, Chinese Section
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlced
   Library of Congress, European Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcnucm
   Library of Congress, National Union Catalog of Manuscript Collections
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcdcm
   Library of Congress, Digital Collections Management Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcafc
   United States, Library of Congress, American Folklife Center
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcn
   United States, Library of Congress, National Serials Data Program Office
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcgm
   Library of Congress, Geography & Map Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcs
   United States, Library of Congress, Serial Record Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcl
   United States, Library of Congress, Law Library
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcgb
   United States, Library of Congress, Generalized Bibliography System Staff
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcesr
   United States, Library of Congress, Early State Records Collection Staff
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcc
   United States, Library of Congress, Congressional Research Service, Library
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcco
   United States, Library of Congress, Copyright Office
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlchd
   Library of Congress, Hispanic Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcmss
   Library of Congress, Manuscript Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlcsm
   United States, Library of Congress, Special Materials Cataloging Division
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
-------------------------
:loc.organizations/dlchl
   United States, Library of Congress, Hispanic Division, Handbook of Latin American Studies Section
  isa?
  :loc.organizations/dlc
   :madsrdf/CorporateName
    :madsrdf/Name
     :madsrdf/MADSType
      :skos/Concept
       :madsrdf/SimpleType
        :madsrdf/Authority
         :owl/Class
          :rdfs/Class
```
