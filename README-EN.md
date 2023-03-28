# Wu-Tang name generator for coders

The goal of this task is to give you, dear student, a possibility to check if the prerequisites of the TIRA course are OK in your case.

> TIRA, by the way, comes from the Finnish name of the course TIetoRAkenteet ja algoritmit, data structures and algorithms, in English.

You need only the skills and knowledge taught in the prerequisites of this course, Programming 1 and Programming 2:

* arrays,
* loops; for and while,
* conditionals (if)
* integers (int),
* strings of characters (String),
* classes,
* methods (a.k.a. functions),
* passing parameters and returning values.

> The teacher's solution contains about 75 lines of effective code and three classes. Your solution, while different, can still be quite OK.

## The task

Implement, using Java, a **name generator for programmers** that will:

0. define three `String` arrays: a) person names, b) programmer name firstnames, and c) programmer name lastnames,
1. handles person names from an array, so that...
2. for each person name, a **random programmer name** is generated, in the form of "4bstract Re¢ursion", having two parts in one `String`,
3. checks that the name is unique (no such name has been already generated at this run of the app),
4. each person is given a programmer name, and...
5. ...at the end, print all person names and their programmer names.

An example of the printout can be found below.

## Detailed instructions

You can put the person names and the programmer names in hardcoded `String` arrays. There is no need to handle startup parameters, ask input from the user or read files.

Use the prerequisite course learnings, the things listed in the introduction.

For generating randomness, use the Java `ThreadLocalRandom` class. 

You can, for example, randomly select a name from an array:

```Java
	// firstNames is a String arry, having suitable first names for the programmer name.
	// Select a random index to this array:
	int index = ThreadLocalRandom.current().nextInt(firstNames.length);
	String randomFirstName = firstNames[index];
	// And so on...
```

## App printout

The app printout should look like this:

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
"Hex Rege𝒳" rhymes really well! "Infinite∞ L➿p" reminds of a really large tech company street address *One Infinite Loop*...

You *no not need* to use special chars or symbols in the programmer names like in the example, if your console cannot print these correctly.

## Information

Inspiration for this task: https://www.youtube.com/watch?v=nDeHQL6liSI