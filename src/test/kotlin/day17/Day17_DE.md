**--- Tag 17: Ungeschickter Schmelztiegel ---**

Die Lava beginnt schnell zu fließen, sobald die Lava-Produktionsanlage in Betrieb ist. Beim Verlassen bietet dir das Rentier einen Fallschirm an, mit dem du die
Zahnradinsel schnell erreichen kannst.

Beim Abstieg wird dir aus der Vogelperspektive klar, warum du auf dem Weg nach oben Schwierigkeiten hattest, jemanden zu finden: Die Hälfte von Gear Island ist
leer, aber die Hälfte unter dir ist eine riesige Fabrikstadt!

Du landest in der Nähe des sich allmählich füllenden Lavapools am Fuß deines neuen Lavafalls. Lavadukte werden die Lava schließlich durch die ganze Stadt
transportieren, aber um sie sofort nutzen zu können, laden die Elfen sie in große Tiegel auf Rädern.

Die Tiegel sind kopflastig und werden von Hand geschoben. Leider lassen sich die Tiegel bei hohen Geschwindigkeiten nur sehr schwer lenken, so dass es schwierig
sein kann, lange in einer geraden Linie zu fahren.

Um die Wüsteninsel so schnell wie möglich mit den benötigten Maschinenteilen zu versorgen, musst du den besten Weg finden, um den Tiegel vom Lavapool zur Fabrik
für Maschinenteile zu bringen. Dazu musst du den Wärmeverlust so gering wie möglich halten und eine Route wählen, bei der der Schmelztiegel nicht zu lange in
gerader Linie fahren muss.

Glücklicherweise haben die Elfen hier eine Karte (Ihre Rätseleingabe), die anhand von Verkehrsmustern, Umgebungstemperatur und Hunderten von anderen Parametern
genau berechnet, wie viel Wärmeverlust für einen Schmelztiegel zu erwarten ist, der einen bestimmten Stadtblock betritt.

Ein Beispiel:

```
2413432311323
3215453535623
3255245654254
3446585845452
4546657867536
1438598798454
4457876987766
3637877979653
4654967986887
4564679986453
1224686865563
2546548887735
4322674655533
```

Jeder Stadtblock ist durch eine einzelne Ziffer gekennzeichnet, die den Wärmeverlust angibt, wenn der Tiegel in diesen Block eintritt. Der Startpunkt, der
Lavapool, ist der Stadtblock oben links; das Ziel, die Fabrik für Maschinenteile, ist der Stadtblock unten rechts. (Da Sie bereits im Block oben links beginnen,
entsteht Ihnen der Wärmeverlust dieses Blocks erst, wenn Sie diesen Block verlassen und wieder dorthin zurückkehren).

Da es schwierig ist, den kopflastigen Tiegel lange in einer geraden Linie zu halten, kann er sich höchstens drei Blöcke in eine Richtung bewegen, bevor er sich
um 90 Grad nach links oder rechts drehen muss. Der Tiegel kann auch nicht die Richtung umkehren; nach dem Betreten jedes Stadtblocks kann er nur nach links,
geradeaus oder nach rechts abbiegen.

Eine Möglichkeit, den Wärmeverlust zu minimieren, ist dieser Weg:

```
2>>34^>>>1323
32v>>>35v5623
32552456v>>54
3446585845v52
4546657867v>6
14385987984v4
44578769877v6
36378779796v>
465496798688v
456467998645v
12246868655<v
25465488877v5
43226746555v>
```

Auf diesem Weg werden nie mehr als drei aufeinanderfolgende Blöcke in dieselbe Richtung bewegt und es entsteht ein Wärmeverlust von nur 102.

Wie hoch ist der geringste Wärmeverlust, wenn der Tiegel vom Lavapool zur Fabrik für Maschinenteile geleitet wird, aber nicht mehr als drei aufeinanderfolgende
Blöcke in dieselbe Richtung bewegt werden?
