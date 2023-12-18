**--- Tag 18: Lavadukt-Lagune ---**

Dank eurer Bemühungen ist die Fabrik für Maschinenteile eine der ersten Fabriken, die seit der Rückkehr des Lavafalls wieder in Betrieb ist. Um den großen
Rückstand bei den Ersatzteilanfragen aufzuholen, wird die Fabrik jedoch für eine Weile einen großen Vorrat an Lava benötigen; die Elfen haben bereits damit
begonnen, zu diesem Zweck eine große Lagune in der Nähe anzulegen.

Sie sind sich jedoch nicht sicher, ob die Lagune groß genug sein wird; sie haben dich gebeten, einen Blick auf den Ausgrabungsplan zu werfen (dein
Rätselbeitrag). Zum Beispiel:

```
R 6 (#70c710)
D 5 (#0dc571)
L 2 (#5713f0)
D 2 (#d2c081)
R 2 (#59c680)
D 2 (#411b91)
L 5 (#8ceee2)
U 2 (#caa173)
L 1 (#1b58a2)
U 2 (#caa171)
R 2 (#7807d2)
U 3 (#a77fa3)
L 2 (#015232)
U 2 (#7a21e3)
```

Der Bagger beginnt in einem 1-Meter-Würfel-Loch im Boden. Er gräbt dann die angegebene Anzahl von Metern nach oben (U), unten (D), links (L) oder rechts (R) und
räumt dabei volle 1-Meter-Würfel ab. Die Richtungen werden von oben gesehen angegeben, d. h. wenn "oben" Norden wäre, dann wäre "rechts" Osten und so weiter.
Jeder Graben ist auch mit der Farbe aufgeführt, die die Kante des Grabens als hexadezimaler RGB-Farbcode haben sollte.

Von oben betrachtet würde der obige Beispiel-Grabenplan dazu führen, dass die folgende Grabenschleife (#) aus dem ansonsten ebenerdigen Gelände ausgehoben
wird (.):

```
#######
#.....#
###...#
..#...#
..#...#
###.###
#...#..
##..###
.#....#
.######
```

Zu diesem Zeitpunkt könnte der Graben 38 Kubikmeter Lava enthalten. **Dies ist jedoch nur der Rand der Lagune**; der nächste Schritt besteht darin, das Innere
so auszugraben, dass es ebenfalls einen Meter tief ist:

```
#######
#######
#######
..#####
..#####
#######
#####..
#######
.######
.######
```

Jetzt kann die Lagune stolze **62** Kubikmeter Lava aufnehmen. Während das Innere ausgegraben wird, werden auch die Ränder entsprechend den Farbcodes im
Ausgrabungsplan gestrichen.

Die Elfen sind besorgt, dass die Lagune nicht groß genug sein wird; wie viele Kubikmeter Lava könnte sie fassen, wenn sie ihrem Grabungsplan folgen?