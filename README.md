# Wu-Tang nimigeneraattori koodareille

Tämän valinnaisen tehtävän tarkoitus on antaa sinulle, hyvä opiskelija, mahdollisuus tarkistaa itse ovatko TIRA -kurssin osaamisvaatimukset osaltasi kohdallaan. 

Jos tämä tehtävä tuottaa ylipääsemättömiä vaikeuksia, ohjelmoinnin perusteet Javalla eivät välttämättä vielä ole hallussa. Se ei estä kurssin aloittamista, mutta voi tarkoittaa sitä että varaudu kertaamaan ja oppimaan perusteita samalla kun teet kurssin tehtäviä.

Tässä tehtävässä tarvitaan vain kurssien Ohjelmointi 1 ja 2 osaamistasoa vastaavia asioita:

* taulukoita (array),
* silmukoita (loop; for ja while),
* ehtolauseita (if)
* kokonaislukuja (int),
* merkkijonoja (String),
* luokkia (class),
* metodeja (eli funktioita),
* parametrin välitystä ja paluuarvoja.

> Opettajan oliopohjaisessa malliratkaisussa on noin 75 riviä tehollista koodia ja kolme luokkaa. Oma ratkaisusi voi tietysti olla erilainen ja silti ihan OK.

## Tehtävä

Toteuta Javalla **ohjelmoijan nimigeneraattori**, joka 

1. annetuille henkilöille (merkkijonotaulukossa olevia `String` -olioita) 
2. luo *satunnaisen* ohjelmoijan nimen yhdistämällä kahdesta merkkijonotaulukosta yhden ohjelmoijan nimen (esimerkiksi "Infinite∞ L➿p" on koostettu kahdesta taulukosta, toisesta sana "Infinite∞" ja toisesta sana "L➿p"),
3. varmistaen ettei tätä ohjelmoijan nimeä ole jo annettu jollekulle henkilölle (jos on, arpoo uuden ohjelmoijan nimen),
4. ja lopuksi tulostaa henkilöiden nimet ja heidän ohjelmoijan nimensä.

Ohjelman tulostuksen pitäisi näyttää tältä:

```console
Wu-Tang name generator for programmers
--------------------------------------
- The generator can produce 342 unique names
  1. Kevin B         a.k.a. ∧bstract ⨃nderflow
  2. Antti J         a.k.a. R∀ndom βyte
  3. Kristian H.     a.k.a. ⦶ctal L➿p
  4. Joni R          a.k.a. Hex Rege𝒳
  5. Jouni L         a.k.a. Ïnvariant Thread
  6. Mikko R         a.k.a. ℙrotected De🪳ger
  7. Päivi R         a.k.a. ℙrotected Øverflow
  8. Pertti K        a.k.a. ⦶ctal Packet
  9. Juha I          a.k.a. Parallel Ĥeap
 10. Markku O        a.k.a. R∀ndom Warning
 11. Netta I         a.k.a. Infinite∞ L➿p
 12. Harrri O-K      a.k.a. Linεar Packet
```

"Hex Rege𝒳" kuulostaa oikein rimmaavalta nimeltä! "Infinite∞ L➿p" -nimestä tulee taas mieleen erään teknologiajätin eräs katuosoite *One Infinite Loop*...

> Sinun *ei tarvitse* käyttää esimerkin mukaisia erikoismerkkejä, symboleita tai emojeita ohjelmoijan nimissä, jos konsolisi ei osaa näitä oikein tulostaa (I'm looking at you Windows...).

## Tarkempia ohjeita

Henkilöiden nimet ja kaikki mahdolliset ohjelmoijan nimet voivat olla kovakoodatuissa taulukoissa. Ei ole siis tarvetta käsitellä ohjelman käynnistysparametreja, kysyä nimiä käyttäjältä tai lukea niitä tiedostoista.

Käytä aikaisempien kurssien oppimaa, eli niitä asioita mitä yllä listattiin opetetun Ohjelmointi 1 ja 2 -kursseilla.

Satunnaisuuden generointiin voit käyttää Javan `ThreadLocalRandom` luokkaa. 

Voit esimerkiksi arpoa nimen taulukosta tietystä satunnaisesta indeksistä:

```Java
	// firstNames on String -taulukko, jossa sopivia ohjelmoijan nimen etunimiä.
	// Arvotaan indeksi tähän taulukkoon:
	int index = ThreadLocalRandom.current().nextInt(firstNames.length);
	String randomFirstName = firstNames[index];
	// Ja niin edelleen...
```

Tulostaminen onnistuu kätevästi käyttäen formatointia:

```Java
   System.out.format("%3d %s%n", integerVariable, stringVariable);
```
Jolloin tulostuu kolmen merkin levyinen kokonaislukuarvo ja sen perään merkkijonomuuttuja ja rivinvaihto.

## Tietoja

Inspiraatiota tehtävään saatu videolta https://www.youtube.com/watch?v=nDeHQL6liSI