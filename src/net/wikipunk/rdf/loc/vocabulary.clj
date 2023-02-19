(ns net.wikipunk.rdf.loc.vocabulary
  {:rdf/type :owl/Ontology})

(def identifiers
  "The Standard Identifiers Scheme lists standard number or code systems and assigns a URI to each database or publication that defines or contains the identifiers. The purpose of these source codes is to enable the type of standard numbers or codes in resource descriptions to be indicated by URI."
  {:db/ident     :loc.vocabulary/identifiers,
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Standard Identifiers Scheme lists standard number or code systems and assigns a URI to each database or publication that defines or contains the identifiers. The purpose of these source codes is to enable the type of standard numbers or codes in resource descriptions to be indicated by URI."},
   :madsrdf/hasMADSSchemeMember
   [:identifiers/videorecording-identifer :identifiers/darome
    :identifiers/archna :identifiers/strn :identifiers/isfdbaw
    :identifiers/margaz :identifiers/kdw :identifiers/prabook
    :identifiers/isbn-a :identifiers/scopus :identifiers/artsy
    :identifiers/mocofo :identifiers/cerl :identifiers/isfdbma
    :identifiers/trove :identifiers/vd17 :identifiers/isbn :identifiers/artukaw
    :identifiers/cabt :identifiers/matrix-number :identifiers/sprfcfb
    :identifiers/musicb :identifiers/sici :identifiers/porthu :identifiers/mesh
    :identifiers/sprfpfb :identifiers/bsi :identifiers/sprfbsb :identifiers/nipo
    :identifiers/vd16 :identifiers/npg :identifiers/morana :identifiers/ror
    :identifiers/unescot :identifiers/nagv :identifiers/iswc :identifiers/lcmd
    :identifiers/nga :identifiers/wndla :identifiers/iconauth :identifiers/istc
    :identifiers/theatr :identifiers/stw :identifiers/nacat :identifiers/knpam
    :identifiers/muscl :identifiers/worldcat :identifiers/allmusic
    :identifiers/manto :identifiers/hdl :identifiers/vgmdb :identifiers/isfdbpu
    :identifiers/archinpr :identifiers/moviemetr :identifiers/filmaff
    :identifiers/stock-number :identifiers/pleiades :identifiers/csfdcz
    :identifiers/bew :identifiers/tpce :identifiers/isbnre :identifiers/benezit
    :identifiers/permid :identifiers/idref :identifiers/geonames
    :identifiers/cbwpid :identifiers/belvku :identifiers/bdusc
    :identifiers/filmport :identifiers/music-plate :identifiers/gettyulan
    :identifiers/emanus-vlid :identifiers/sprfcbb :identifiers/bpn
    :identifiers/nndb :identifiers/gettyaat :identifiers/pcadpf
    :identifiers/fidecp :identifiers/kulturnav :identifiers/sprfoly
    :identifiers/rid :identifiers/sprfhoc :identifiers/fisa :identifiers/atg
    :identifiers/findagr :identifiers/dpb :identifiers/libaus
    :identifiers/belvwrk :identifiers/bibbi :identifiers/allmovie
    :identifiers/picnypl :identifiers/dkfilm :identifiers/pcadpe
    :identifiers/iso :identifiers/balat :identifiers/bnfcg :identifiers/bbcth
    :identifiers/gacsch :identifiers/scope :identifiers/oxforddnb
    :identifiers/pnta :identifiers/spotify :identifiers/clara
    :identifiers/isbnsbn :identifiers/archinpe :identifiers/erara-vlid
    :identifiers/datoses :identifiers/fast :identifiers/ibdb
    :identifiers/freebase :identifiers/cantic :identifiers/munzing
    :identifiers/gtaa :identifiers/dma :identifiers/discogs :identifiers/goodra
    :identifiers/gnis :identifiers/moma :identifiers/gtin-14
    :identifiers/geprishisp :identifiers/isfdbau :identifiers/nlg
    :identifiers/eidr :identifiers/s2a3bd :identifiers/upc
    :identifiers/natgazfid :identifiers/isil :identifiers/lei :identifiers/cgndb
    :identifiers/artukart :identifiers/geogndb :identifiers/svfilm
    :identifiers/issn-l :identifiers/nstc :identifiers/gettytgn
    :identifiers/gettyobj :identifiers/vd18 :identifiers/ssaut :identifiers/ansi
    :identifiers/saam :identifiers/rkda :identifiers/isrc :identifiers/amnbo
    :identifiers/moviemetf :identifiers/ilot :identifiers/zbaut :identifiers/ean
    :identifiers/uri :identifiers/lattes :identifiers/ecli :identifiers/bdrc
    :identifiers/emlo :identifiers/cnbksy :identifiers/gettyart
    :identifiers/scholaru :identifiers/archns :identifiers/ngva
    :identifiers/danacode :identifiers/odnb :identifiers/onix :identifiers/gec
    :identifiers/wikidata :identifiers/issue-number :identifiers/kda
    :identifiers/doi :identifiers/iaafa :identifiers/isni :identifiers/cana
    :identifiers/bfi :identifiers/xgamea :identifiers/sprfbsk :identifiers/smgp
    :identifiers/bigenc :identifiers/orcid :identifiers/tatearid
    :identifiers/itar :identifiers/kinopo :identifiers/viaf :identifiers/pcadbu
    :identifiers/gnd :identifiers/allocine :identifiers/ismm :identifiers/imdb
    :identifiers/agorha :identifiers/snac :identifiers/urn :identifiers/lccn
    :identifiers/nzggn :identifiers/ofdb :identifiers/music-publisher
    :identifiers/isan :identifiers/agrovoc :identifiers/issn :identifiers/ark
    :identifiers/opensm :identifiers/ngvw :identifiers/local
    :identifiers/archinl :identifiers/orgnr :identifiers/it-acnp],
   :rdf/type     [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label   {:rdf/language "en", :rdf/value "Standard Identifiers"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Standard Identifiers Scheme lists standard number or code systems and assigns a URI to each database or publication that defines or contains the identifiers. The purpose of these source codes is to enable the type of standard numbers or codes in resource descriptions to be indicated by URI."}})
