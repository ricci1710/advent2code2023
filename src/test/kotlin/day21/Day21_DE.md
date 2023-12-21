--- Tag 21: Schrittzähler ---
Du schaffst es, das Luftschiff genau in dem Moment zu erwischen, in dem es jemand anderen auf seiner Pauschalreise nach Desert Island absetzt! Es setzt dich
sogar hilfsbereit in der Nähe des Gärtners und seiner riesigen Farm ab.

"Du hast den Sand wieder zum Fließen gebracht! Tolle Arbeit! Jetzt müssen wir nur noch warten, bis wir genug Sand haben, um das Wasser für die Schneeinsel zu
filtern, dann haben wir im Handumdrehen wieder Schnee.

Während du wartest, hat einer der Elfen, der mit dem Gärtner zusammenarbeitet, gehört, wie gut du Probleme lösen kannst, und bittet um deine Hilfe. Er muss
seine Schritte für den Tag machen und möchte daher wissen, welche Parzellen er mit seinen verbleibenden 64 Schritten erreichen kann.

Er gibt dir eine aktuelle Karte (deine Rätseleingabe) mit seiner Startposition (S), den Kleingärten (.) und den Felsen (#).
Zum Beispiel:

```
...........
.....###.#.
.###.##..#.
..#.#...#..
....#.#....
.##..S####.
.##..#...#.
.......##..
.##.#.####.
.##..##.##.
...........
```

Der Elf beginnt in der Startposition (S), die auch als Gartengrundstück zählt. Dann kann er einen Schritt nach Norden, Süden, Osten oder Westen machen, aber nur
auf Plättchen, die Gartengrundstücke sind. So kann er jedes der mit O gekennzeichneten Felder erreichen:

```
...........
.....###.#.
.###.##..#.
..#.#...#..
....#O#....
.##.OS####.
.##..#...#.
.......##..
.##.#.####.
.##..##.##.
...........
```

Dann macht er einen zweiten Schritt. Da er sich zu diesem Zeitpunkt auf einem der mit O markierten Plättchen befinden könnte, würde er mit seinem zweiten
Schritt jede Gartenparzelle erreichen, die einen Schritt nördlich, südlich, östlich oder westlich von jedem Plättchen liegt, das er nach dem ersten Schritt
hätte erreichen können:

```
...........
.....###.#.
.###.##..#.
..#.#O..#..
....#.#....
.##O.O####.
.##.O#...#.
.......##..
.##.#.####.
.##..##.##.
...........
```

Nach zwei Schritten kann er sich auf jedem der mit O gekennzeichneten Felder befinden, einschließlich der Startposition (entweder von Norden nach Süden oder von
Westen nach Osten).

Ein einziger dritter Schritt führt zu noch mehr Möglichkeiten:

```
...........
.....###.#.
.###.##..#.
..#.#.O.#..
...O#O#....
.##.OS####.
.##O.#...#.
....O..##..
.##.#.####.
.##..##.##.
...........
```

Er macht so weiter, bis seine Schritte für den Tag erschöpft sind. Nach insgesamt 6 Schritten könnte er eine der mit O gekennzeichneten Gartenparzellen
erreichen:

```
...........
.....###.#.
.###.##.O#.
.O#O#O.O#..
O.O.#.#.O..
.##O.O####.
.##.O#O..#.
.O.O.O.##..
.##.#.####.
.##O.##.##.
...........
```

Wenn in diesem Beispiel das Ziel der Elfe darin bestünde, heute genau 6 Schritte mehr zu machen, könnte sie damit jede der 16 Gartenparzellen erreichen.

Tatsächlich muss der Elf heute aber **64** Schritte schaffen, und die Karte, die er dir gegeben hat, ist viel größer als die Beispielkarte.

Ausgehend von der Gartenparzelle S auf deiner Karte, wie viele Gartenparzellen könnte der Elf in genau 64 Schritten erreichen?