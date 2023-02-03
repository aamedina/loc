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
