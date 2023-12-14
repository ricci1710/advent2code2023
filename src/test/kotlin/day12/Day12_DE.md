**--- Tag 12: Heiße Quellen ---**

Endlich erreichen Sie die heißen Quellen! Sie sehen, wie Dampf aus abgelegenen Bereichen aufsteigt, die an das verschnörkelte Hauptgebäude angeschlossen sind.

Als du dich umdrehst, um einzutreten, hält dich der Forscher auf. "Warten Sie - ich dachte, Sie suchen nach den heißen Quellen, nicht wahr?" Du deutest an, dass
dies für dich definitiv nach heißen Quellen aussieht.

"Oh, Entschuldigung, ein üblicher Fehler! Das ist eigentlich das Onsen! Die heißen Quellen sind nebenan."

Du schaust in die Richtung, in die der Forscher zeigt, und bemerkst plötzlich die massiven Metallspiralen, die sich über dir auftürmen. "Hier entlang!"

Es dauert nur noch ein paar Schritte, bis du das Haupttor des riesigen, eingezäunten Geländes erreichst, in dem sich die Quellen befinden. Du gehst durch das
Tor und betrittst ein kleines Verwaltungsgebäude.

"Hallo! Was führt Sie heute zu den heißen Quellen? Tut mir leid, dass sie im Moment nicht sehr heiß sind; wir haben im Moment einen Mangel an Lava." Du fragst
nach den fehlenden Maschinenteilen für Desert Island.

"Oh, die gesamte Getriebeinsel ist derzeit offline! Im Moment wird nichts hergestellt, nicht bevor wir mehr Lava haben, um unsere Schmieden zu heizen. Und
unsere Federn. Die Federn sind nicht sehr elastisch, wenn sie nicht heiß sind!"

"Sag mal, könntest du hochgehen und nachsehen, warum die Lava nicht mehr fließt? Die Quellen sind zu kalt für den normalen Betrieb, aber wir sollten eine
finden, die stark genug ist, um dich dort hinaufzuschicken!"

Es gibt nur ein Problem - viele der Quellen sind verfallen, so dass sie nicht sicher sind, welche Quellen überhaupt sicher zu benutzen wären! Noch schlimmer
ist, dass ihre Aufzeichnungen darüber, welche Federn beschädigt sind (deine Rätseleinlage), ebenfalls beschädigt sind! Du musst ihnen helfen, die beschädigten
Aufzeichnungen zu reparieren.

In dem riesigen Feld direkt vor der Tür sind die Federn in Reihen angeordnet. Für jede Reihe zeigen die Zustandsberichte jede Feder und ob sie
_funktionsfähig (.)_ oder **beschädigt (#)** ist. Dies ist der Teil der Zustandsdatensätze, der selbst beschädigt ist; bei einigen Federn ist einfach nicht
bekannt (?), ob die Feder betriebsbereit oder beschädigt ist.

Der Ingenieur, der die Zustandsdatensätze erstellt hat, hat jedoch auch einige dieser Informationen in einem anderen Format dupliziert! Nach der Auflistung der
Federn für eine bestimmte Zeile wird die Größe jeder zusammenhängenden Gruppe von beschädigten Federn in der Reihenfolge aufgelistet, in der diese Gruppen in
der Zeile erscheinen. Diese Liste berücksichtigt immer alle beschädigten Federn, und jede Zahl ist die gesamte Größe der zusammenhängenden Gruppe (d.h. die
Gruppen sind immer durch mindestens eine betriebsbereite Feder getrennt): #### würde immer 4 sein, niemals 2,2).

Zustandsdatensätze ohne unbekannte Federzustände könnten also wie folgt aussehen:

```
#.#.### 1,1,3
.#...#....###. 1,1,3
.#.###.#.###### 1,3,1,6
####.#...#... 4,1,1
#....######..#####. 1,6,5
.###.##....# 3,2,1
```

Allerdings sind die Zustandsberichte teilweise beschädigt; der Zustand einiger Federn ist tatsächlich **unbekannt** (?).
Zum Beispiel:

```
???.### 1,1,3
.??..??...?##. 1,1,3
?#?#?#?#?#?#?#? 1,3,1,6
????.#...#... 4,1,1
????.######..#####. 1,6,5
?###???????? 3,2,1
```

Mit diesen Informationen ist es Ihre Aufgabe, herauszufinden, wie viele verschiedene Anordnungen von funktionsfähigen und gebrochenen Federn die vorgegebenen
Kriterien in jeder Reihe erfüllen.

In der ersten Zeile (???.### 1,1,3) gibt es genau **eine** Möglichkeit, wie getrennte Gruppen von einer, einer und drei gebrochenen Federn (in dieser
Reihenfolge)
in dieser Zeile erscheinen können: die ersten drei unbekannten Federn müssen gebrochen sein, dann betriebsbereit, dann gebrochen (#.#), was die gesamte Zeile
zu #.#.### macht.

Die zweite Zeile ist interessanter: .??...??...?##. 1,1,3 könnten insgesamt **vier** verschiedene Anordnungen sein. Das letzte ? muss immer gebrochen sein (um
die letzte zusammenhängende Gruppe von drei gebrochenen Federn zu erfüllen), und jedes ?? muss genau eine der beiden gebrochenen Federn verbergen. (Keines der
beiden ?? könnte beide gebrochene Federn sein, sonst würden sie eine einzige zusammenhängende Gruppe von zwei bilden; wäre das der Fall, wären die Zahlen danach
stattdessen 2,3). Da jedes ?? entweder #. oder .# sein kann, gibt es vier mögliche Anordnungen von Federn.

Die letzte Zeile ist sogar mit **zehn** verschiedenen Anordnungen vereinbar! Da die erste Zahl 3 ist, müssen das erste und das zweite ? beide . sein (wären
beide #, müsste die erste Zahl 4 oder höher sein). Die verbleibende Reihe unbekannter Federzustände hat jedoch viele verschiedene Möglichkeiten, wie sie Gruppen
von zwei und einer gebrochenen Feder halten könnten:

```
?###???????? 3,2,1
.###.##.#...
.###.##..#..
.###.##...#.
.###.##....#
.###..##.#..
.###..##..#.
.###..##...#
.###...##.#.
.###...##..#
.###....##.#
```

In diesem Beispiel ist die Anzahl der möglichen Anordnungen für jede Zeile:

```
- ???.### 1,1,3               - 1 Anordnung
- .??..??...?##. 1,1,3        - 4 Anordnungen
- ?#?#?#?#?#?#?#? 1,3,1,6     - 1 Anordnung
- ????.#...#... 4,1,1         - 1 Anordnung
- ????.######..#####. 1,6,5   - 4 Anordnungen
- ?###???????? 3,2,1          - 10 Anordnungen
```

Wenn man alle möglichen Anordnungen zusammenzählt, kommt man auf insgesamt 21 Anordnungen.

Zählen Sie für jede Zeile alle verschiedenen Anordnungen von funktionsfähigen und gebrochenen Federn, die die vorgegebenen Kriterien erfüllen.

**Was ist die Summe dieser Anordnungen?**