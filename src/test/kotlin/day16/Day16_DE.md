**--- Tag 16: Der Boden wird Lava sein ---**

Mit dem Lichtstrahl, der sich irgendwo konzentriert, führt dich das Rentier noch tiefer in die Lava-Produktionsanlage. Irgendwann stellst du fest, dass die
Stahlwände der Anlage durch eine Höhle ersetzt wurden, dass die Türen aus einer Höhle bestehen, dass der Boden aus einer Höhle besteht und dass du dir ziemlich
sicher bist, dass es sich um eine riesige Höhle handelt.

Schließlich, als Sie sich dem Herzen des Berges nähern, sehen Sie ein helles Licht in einer Höhle vor Ihnen. Dort entdeckst du, dass der Lichtstrahl, den du so
sorgfältig fokussiert hast, aus der Höhlenwand austritt, die der Anlage am nächsten ist, und seine gesamte Energie in eine Vorrichtung auf der
gegenüberliegenden Seite leitet.

Bei näherer Betrachtung scheint die Vorrichtung ein flaches, zweidimensionales, quadratisches Gitter zu sein, das Leeren Raum (.), Spiegel (/ und \) und
Teiler (| und -) enthält.

Die Vorrichtung ist so ausgerichtet, dass der größte Teil des Strahls am Gitter abprallt, aber jede Kachel auf dem Gitter wandelt einen Teil des Lichts in Wärme
um, um das Gestein in der Höhle zu schmelzen.

Du notierst dir die Anordnung der Vorrichtung (deine Rätseleingabe). Zum Beispiel:

```
.|...\....
|.-.\.....
.....|-...
........|.
..........
.........\
..../.\\..
.-.-/..|..
.|....-|.\
..//.|....
```

Der Strahl tritt in der linken oberen Ecke von links ein und bewegt sich nach rechts. Sein Verhalten hängt dann davon ab, was ihm bei seiner Bewegung begegnet:

- Trifft der Strahl auf leeren Raum (.), setzt er seine Bewegung in dieselbe Richtung fort.
- Trifft der Strahl auf einen Spiegel (/ oder \), wird der Strahl je nach Winkel des Spiegels um 90 Grad reflektiert. Beispielsweise würde ein nach rechts
  gerichteter Strahl, der auf einen / Spiegel trifft, in der Spalte des Spiegels nach oben weiterlaufen, während ein nach rechts gerichteter Strahl, der auf
  einen \ Spiegel trifft, in der Spalte des Spiegels nach unten weiterlaufen würde.
- Trifft der Strahl auf das spitze Ende eines Teilers (| oder -), durchläuft der Strahl den Teiler, als wäre der Teiler ein leerer Raum. Beispielsweise würde
  ein nach rechts gerichteter Strahl, der auf einen --Teiler trifft, in dieselbe Richtung weiterlaufen.
- Trifft der Strahl auf die flache Seite eines Teilers (| oder -), wird der Strahl in zwei Strahlen aufgeteilt, die in jede der beiden Richtungen gehen, in die
  die spitzen Enden des Teilers zeigen. Ein sich nach rechts bewegender Strahl, der auf einen Splitter (|) trifft, wird beispielsweise in zwei Strahlen
  aufgeteilt: einen, der von der Säule des Splitters nach oben geht, und einen, der von der Säule des Splitters nach unten geht.

Strahlen interagieren nicht mit anderen Strahlen; ein Spielstein kann von mehreren Strahlen gleichzeitig durchlaufen werden. Ein Spielstein wird aktiviert, wenn
mindestens ein Strahl durch ihn hindurchgeht, in ihm reflektiert oder in ihm geteilt wird.

Im obigen Beispiel sieht man, wie der Lichtstrahl in der Vorrichtung reflektiert wird:

```
>|<<<\....
|v-.\^....
.v...|->>>
.v...v^.|.
.v...v^...
.v...v^..\
.v../2\\..
<->-/vv|..
.|<<<2-|.\
.v//.|.v..
```

Strahlen werden nur auf leeren Feldern angezeigt; Pfeile geben die Richtung der Strahlen an. Wenn ein Spielstein Strahlen enthält, die sich in mehrere
Richtungen bewegen, wird stattdessen die Anzahl der verschiedenen Richtungen angezeigt. Hier ist das gleiche Diagramm, aber stattdessen wird nur angezeigt, ob
eine Kachel erregt ist (#) oder nicht (.):

```
######....
.#...#....
.#...#####
.#...##...
.#...##...
.#...##...
.#..####..
########..
.#######..
.#...#.#..
```

Letztlich werden in diesem Beispiel **46** Kacheln mit Energie versorgt.

Das Licht erregt nicht genug Kacheln, um Lava zu erzeugen. Um die Vorrichtung zu testen, müssen Sie zunächst die aktuelle Situation analysieren. Wenn der Strahl
oben links beginnt und nach rechts geht, wie viele Kacheln werden dann mit Energie versorgt?