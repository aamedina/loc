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
