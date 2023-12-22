**--- Tag 22: Sandplatten ---**

Es ist genug Sand gefallen, um endlich Wasser für Snow Island zu filtern.

Nun, fast.

Der Sand ist in Form von großen, verdichteten Sandziegeln gefallen, die sich hier am Rande der Insel zu einem beeindruckenden Stapel auftürmen. Um den Sand zum
Filtern von Wasser nutzen zu können, müssen einige der Ziegelsteine wieder in frei fließenden Sand zerbrochen - nein, aufgelöst - werden.

Der Stapel ist so hoch, dass du bei der Auswahl der Ziegelsteine, die du zerbrichst, vorsichtig sein musst. Wenn du den falschen Stein zerbrichst, könnten große
Teile des Stapels umstürzen, was ziemlich gefährlich ist.

Die Elfen, die für die Wasserfilterung zuständig sind, haben einen Schnappschuss von den Ziegeln gemacht, während sie noch fielen (deine Rätseleingabe), mit
dessen Hilfe du herausfinden kannst, welche Ziegel sicher sind.

Zum Beispiel:

```
1,0,1~1,2,1
0,0,2~2,0,2
0,2,3~2,2,3
0,0,4~0,2,4
2,0,5~2,2,5
0,1,6~2,1,6
1,1,8~1,1,9
```

Jede Textzeile im Schnappschuss stellt die Position eines einzelnen Steins zum Zeitpunkt der Aufnahme des Schnappschusses dar. Die Position wird als zwei
x,y,z-Koordinaten angegeben - eine für jedes Ende des Steins -, die durch eine Tilde (~) getrennt sind. Jeder Ziegelstein besteht aus einer einzigen geraden
Reihe von Würfeln, und die Elfen haben sogar darauf geachtet, einen Zeitpunkt für den Schnappschuss zu wählen, an dem sich alle frei fallenden Ziegelsteine an
ganzzahligen Positionen über dem Boden befinden, so dass der gesamte Schnappschuss an einem dreidimensionalen Würfelgitter ausgerichtet ist.

Eine Linie wie 2,2,2~2,2,2 bedeutet, dass sich beide Enden des Steins an der gleichen Koordinate befinden - mit anderen Worten, dass der Stein ein einzelner
Würfel ist.

Linien wie 0,0,10~1,0,10 oder 0,0,10~0,1,10 bedeuten, dass es sich um zwei Würfel handelt, die beide horizontal ausgerichtet sind. Der erste Würfel erstreckt
sich in x-Richtung, der zweite Würfel in y-Richtung.

Eine Linie wie 0,0,1~0,0,10 stellt einen Zehnerwürfel dar, der senkrecht ausgerichtet ist. Ein Ende des Ziegels ist der Würfel bei 0,0,1, während das andere
Ende des Ziegels direkt darüber bei 0,0,10 liegt.

Der Boden liegt bei z=0 und ist vollkommen flach; der niedrigste z-Wert, den ein Ziegelstein haben kann, ist also 1. Somit liegen 5,5,1~5,6,1 und 0,2,1~0,2,5
beide auf dem Boden, aber 3,3,2~3,3,3 befand sich zum Zeitpunkt des Schnappschusses über dem Boden.

Da der Schnappschuss gemacht wurde, während die Steine noch fielen, befinden sich einige Steine noch in der Luft; du musst zunächst herausfinden, wo sie landen
werden. Die Steine werden auf magische Weise stabilisiert, so dass sie sich nicht drehen, auch nicht in seltsamen Situationen, z. B. wenn ein langer
horizontaler Stein nur an einem Ende abgestützt ist. Zwei Ziegelsteine können nicht dieselbe Position einnehmen, so dass ein fallender Ziegelstein auf dem
ersten anderen Ziegelstein zum Liegen kommt, auf den er trifft.

Hier noch einmal das gleiche Beispiel, diesmal mit einem Buchstaben für jeden Stein, damit er in Diagrammen markiert werden kann:

```
1,0,1~1,2,1   <- A
0,0,2~2,0,2   <- B
0,2,3~2,2,3   <- C
0,0,4~0,2,4   <- D
2,0,5~2,2,5   <- E
0,1,6~2,1,6   <- F
1,1,8~1,1,9   <- G
```

Zum Zeitpunkt des Schnappschusses sind die Ziegelsteine von der Seite aus gesehen, also von links nach rechts, wie folgt angeordnet:

```
x
012
.G. 9
.G. 8
... 7
FFF 6
..E 5 z
D.. 4
CCC 3
BBB 2
.A. 1
--- 0
```

Dreht man die Perspektive um 90 Grad, so dass die y-Achse nun von links nach rechts verläuft, werden die gleichen Ziegelsteine wie folgt angeordnet:

```
y
012
.G. 9
.G. 8
... 7
.F. 6
EEE 5 z
DDD 4
..C 3
B.. 2
AAA 1
--- 0
```

Wenn alle Steine so weit wie möglich nach unten fallen, sieht der Stapel wie folgt aus, wobei ? bedeutet, dass die Steine an dieser Stelle hinter anderen
Steinen versteckt sind:

```
x
012
.G. 6
.G. 5
FFF 4
D.E 3 z
??? 2
.A. 1
--- 0
```

Wieder von der Seite:

```
y
012
.G. 6
.G. 5
.F. 4
??? 3 z
B.C 2
AAA 1
--- 0
```

Jetzt, wo sich alle Steine gesetzt haben, ist es einfacher zu erkennen, welche Steine welche anderen Steine stützen:

- Ziegel A ist der einzige Ziegel, der die Ziegel B und C trägt.
- Ziegel B ist einer von zwei Ziegeln, die Ziegel D und E tragen.
- Ziegel C ist der andere Ziegel, der Ziegel D und Ziegel E trägt.
- Ziegel D stützt Ziegel F.
- Ziegel E stützt auch Ziegel F.
- Ziegel F stützt Ziegel G.
- Ziegel G stützt keinen anderen Ziegel.

Deine erste Aufgabe ist es, herauszufinden, welche Ziegel sicher abgebaut werden können. Ein Ziegelstein kann sicher aufgelöst werden, wenn nach seiner
Entfernung keine anderen Ziegelsteine mehr direkt nach unten fallen würden. Lösen Sie keine Steine auf, sondern ermitteln Sie nur, was passieren würde, wenn für
jeden Stein nur dieser eine Stein aufgelöst würde. Ziegelsteine können auch dann zerfallen, wenn sie vollständig von anderen Ziegelsteinen umgeben sind; Sie
können sich notfalls zwischen die Ziegelsteine quetschen.

In diesem Beispiel können die Ziegelsteine wie folgt zerkleinert werden:

- Ziegelstein A kann nicht gefahrlos aufgelöst werden; würde er aufgelöst, würden die Ziegelsteine B und C beide fallen.
- Ziegelstein B kann abgebaut werden; die darüber liegenden Ziegelsteine (D und E) würden weiterhin von Ziegelstein C gestützt.
- Ziegelstein C kann zerfallen; die darüber liegenden Ziegelsteine (D und E) würden immer noch von Ziegelstein B gestützt werden.
- Ziegelstein D kann zerfallen; der darüber liegende Ziegelstein (F) würde immer noch von Ziegelstein E gestützt werden.
- Ziegelstein E kann aufgelöst werden; der darüber liegende Ziegelstein (F) würde immer noch von Ziegelstein D gestützt werden.
- Ziegelstein F kann nicht zerschlagen werden; der darüber liegende Ziegelstein (G) würde fallen.
- Ziegelstein G kann zerschlagen werden; er stützt keinen anderen Ziegelstein.

In diesem Beispiel können also **5 Steine** sicher zerlegt werden.

Berechne anhand des Schnappschusses, wie sich die Blöcke absetzen werden.
Sobald sie sich gesetzt haben, überlege, ob ein einzelner Stein zerfallen kann.
Wie viele Steine können sicher ausgewählt werden, um zerfallen zu können?