# Wu-Tang nimigeneraattori koodareille

Tämän tehtävän tarkoitus on antaa sinulle, hyvä opiskelija, mahdollisuus tarkistaa itse onko TIRA -kurssin osaamisvaatimukset kohdallaan. 

Tehtävässä tarvitaan vain kurssien Ohjelmointi 1 ja 2 osaamistasoa vastaavia asioita:

* taulukoita (array),
* silmukoita (loop; for ja while),
* ehtolauseita (if)
* kokonaislukuja (int),
* merkkijonoja (String),
* luokkia (class),
* metodeja (eli funktioita),
* parametrin välitystä ja paluuarvoja.

> Opettajan malliratkaisussa on noin 75 riviä tehollista koodia ja kolme luokkaa. Oma ratkaisusi voi tietysti olla erilainen ja silti ihan OK.

## Tehtävä

Toteuta Javalla **ohjelmoijan nimigeneraattori**, joka:

0. esittelee kolme `String` -taulukkoa: a) henkilöiden nimiä, b) ohjelmoijan lempinimen etunimiä ja c) ohjelmoijan lempinimen sukunimiä,
1. käsittelee taulukossa olevia henkilöiden nimiä siten, että...
2. jokaiselle nimelle generoidaan satunnainen **ohjelmoijan lempinimi** joka on muotoa "4bstract Re¢ursion", eli siinä on *ohjelmoijan* etunimi ja sukunimi (yhdessä `String` -oliossa),
3. tarkistaa että nimi on uniikki (sellaista ei ole tähän mennessä jo generoitu, tällä ohjelman suorituskerralla),
4. jokaiselle henkilölle annetaan tällainen satunnaisesti generoitu ohjelmoijan nimi, ja...
5. ...lopuksi tulostetaan kaikki henkilöiden nimet ja hänen ohjelmoijan nimensä.

Esimerkki tulostuksesta löytyy alta.

## Tarkempia ohjeita

Henkilöiden nimet ja mahdolliset ohjelmoijan nimet voivat olla kovakoodatuissa taulukoissa. Ei ole siis tarvetta käsitellä ohjelman käynnistysparametreja, kysyä nimiä käyttäjältä tai lukea niitä tiedostoista.

Käytä aikaisempien kurssien oppimaa, eli niitä asioita mitä yllä listattiin opetetun Ohjelmointi 1 ja 2 -kursseilla.

Satunnaisuuden generointiin voit käyttää Javan `ThreadLocalRandom` luokkaa. 

Voit esimerkiksi arpoa nimen taulukosta:

```Java
	// firstNames on String -taulukko, jossa sopivia ohjelmoijan nimen etunimiä.
	// Arvotaan indeksi tähän taulukkoon:
	int index = ThreadLocalRandom.current().nextInt(firstNames.length);
	String randomFirstName = firstNames[index];
	// Ja niin edelleen...
```

## Ohjelman tulostus

Ohjelman tulostuksen pitäisi näyttää tältä:

```console
Wu-Tang name generator for programmers
--------------------------------------
  1.          Juha I a.k.a. Ⓒ orrupt Compiler
  2.         Antti J a.k.a. Infinite∞ L➿p
  3.          Heli A a.k.a. Private Øverflow
  4.      Priyanka S a.k.a. Infinite∞ Øverflow
  5.        Behnaz N a.k.a. Ⓒ orrupt Warning
  6.          Joni R a.k.a. Hex Thread
  7.         Jouni L a.k.a. Linεar 3reakpoint
  8.         Mikko R a.k.a. Hex Rege𝒳
  9.         Päivi R a.k.a. Linεar Compiler
 10.        Pertti K a.k.a. Bōōlean Packet
```
"Hex Rege𝒳" kuulostaa oikein rimmaavalta nimeltä! "Infinite∞ L➿p" -nimestä tulee taas mieleen erään teknologiajätin eräs katuosoite *One Infinite Loop*...

Sinun *ei tarvitse* käyttää esimerkin mukaisia erikoismerkkejä tai symboleita ohjelmoijan nimissä, jos konsolisi ei osaa näitä oikein tulostaa.

## Tietoja

Inspiraatiota tehtävään saatu videolta https://www.youtube.com/watch?v=nDeHQL6liSI