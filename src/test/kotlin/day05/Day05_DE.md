**--- Tag 5: Wenn man einer Saat einen Dünger gibt ---**

Du nimmst das Boot und findest den Gärtner genau dort, wo du ihn vermutet hast: Er bewirtschaftet einen riesigen "Garten", der für dich eher wie ein Bauernhof
aussieht.

"Eine Wasserquelle? Island ist die Wasserquelle!" Sie weisen darauf hin, dass Snow Island kein Wasser erhält.

"Oh, wir mussten das Wasser stoppen, weil uns der Sand zum Filtern ausgegangen ist! Mit schmutzigem Wasser kann man keinen Schnee machen. Keine Sorge, ich bin
sicher, dass wir bald mehr Sand bekommen; wir haben das Wasser nur ein paar Tage ... Wochen ... oh nein."
Sein Gesicht verzieht sich zu einem Ausdruck entsetzter
Erkenntnis.

"Ich war so damit beschäftigt, dafür zu sorgen, dass alle hier etwas zu essen haben, dass ich ganz vergessen habe, nachzusehen, warum wir keinen Sand mehr
bekommen! Es gibt bald eine Fähre, die in diese Richtung fährt - sie ist viel schneller als dein Boot. Könntest du bitte mal nachsehen?"

Sie haben kaum Zeit, dieser Bitte zuzustimmen, als er eine weitere vorbringt. "Während du auf die Fähre wartest, kannst du uns vielleicht bei unserem Problem
mit der Nahrungsmittelproduktion helfen. Der neueste Insel-Almanach ist gerade eingetroffen und wir haben Schwierigkeiten, ihn zu verstehen."

Der Almanach (Ihre Rätseleingabe) listet alle Samen auf, die gepflanzt werden müssen. Er listet auch auf, welche Art von Erde für jede Art von Saatgut zu
verwenden ist, welche Art von Dünger für jede Art von Erde zu verwenden ist, welche Art von Wasser für jede Art von Dünger zu verwenden ist, und so weiter. Jede
Art von Saatgut, Erde, Dünger usw. ist mit einer Nummer gekennzeichnet, aber die Nummern werden in jeder Kategorie wiederverwendet - das heißt, Erde 123 und
Dünger 123 sind nicht unbedingt miteinander verbunden.

Ein Beispiel:

```
seeds: 79 14 55 13

seed-to-soil map:
50 98 2
52 50 48

soil-to-fertilizer map:
0 15 37
37 52 2
39 0 15

fertilizer-to-water map:
49 53 8
0 11 42
42 0 7
57 7 4

water-to-light map:
88 18 7
18 25 70

light-to-temperature map:
45 77 23
81 45 19
68 64 13

temperature-to-humidity map:
0 69 1
1 0 69

humidity-to-location map:
60 56 37
56 93 4
```

Der Almanach beginnt mit einer Auflistung der Samen, die gepflanzt werden müssen: Samen 79, 14, 55 und 13.

Der Rest des Almanachs enthält eine Liste von Karten, die beschreiben, wie man Zahlen aus einer Quellkategorie in Zahlen einer Zielkategorie umwandelt. Das
heißt, der Abschnitt, der mit Saatgut-zu-Boden-Karte beginnt, beschreibt, wie man eine Saatgutnummer (die Quelle) in eine Bodennummer (das Ziel) umwandelt. Auf
diese Weise wissen der Gärtner und sein Team, welcher Boden für welches Saatgut, welches Wasser für welchen Dünger usw. zu verwenden ist.

Anstatt jede Quellennummer und die entsprechende Zielnummer einzeln aufzulisten, beschreiben die Karten ganze Zahlenbereiche, die umgerechnet werden können.
Jede Zeile innerhalb einer Karte enthält drei Zahlen: den Beginn des Zielbereichs, den Beginn des Quellbereichs und die Länge des Bereichs.

Betrachten Sie noch einmal das Beispiel für die Zuordnung von Saatgut zu Boden:

```
50 98 2
52 50 48
```

Die erste Zeile hat einen Zielbereichsanfang von 50, einen Quellbereichsanfang von 98 und eine Bereichslänge von 2. Diese Zeile bedeutet, dass der Quellbereich
bei 98 beginnt und zwei Werte enthält: 98 und 99. Der Zielbereich hat die gleiche Länge, beginnt aber bei 50, so dass seine beiden Werte 50 und 51 sind. Mit
diesen Informationen wissen Sie, dass die Saatgutnummer 98 der Bodennummer 50 und die Saatgutnummer 99 der Bodennummer 51 entspricht.

Die zweite Zeile bedeutet, dass der Quellbereich bei 50 beginnt und 48 Werte enthält: 50, 51, ..., 96, 97. Dies entspricht einem Zielbereich, der bei 52 beginnt
und ebenfalls 48 Werte enthält: 52, 53, ..., 98, 99. Die Saatgutnummer 53 entspricht also der Bodennummer 55.

Alle Quellnummern, die nicht zugeordnet sind, entsprechen der gleichen Zielnummer. Die Saatgutnummer 10 entspricht also der Bodennummer 10.

Die gesamte Liste der Saatgutnummern und der entsprechenden Bodennummern sieht also wie folgt aus:

```
seed  soil
0     0
1     1
...   ...
48    48
49    49
50    52
51    53
...   ...
96    98
97    99
98    50
99    51
```

Anhand dieser Karte können Sie die für jede ursprüngliche Saatgutnummer erforderliche Bodennummer nachschlagen:

- Die Saatgutnummer 79 entspricht der Bodennummer 81.
- Die Saatgutnummer 14 entspricht der Bodennummer 14.
- Die Saatgutnummer 55 entspricht der Bodennummer 57.
- Saatgut Nummer 13 entspricht der Bodennummer 13.

Der Gärtner und sein Team wollen so schnell wie möglich loslegen und möchten daher wissen, welcher Standort am nächsten liegt und Saatgut benötigt. Finde
mithilfe dieser Karten die niedrigste Standortnummer, die einem der ersten Samen entspricht. Dazu müssen Sie jede Saatgutnummer in andere Kategorien umwandeln,
bis Sie die entsprechende Ortsnummer finden. In diesem Beispiel sind die entsprechenden Typen:

- Saatgut 79, Erde 81, Dünger 81, Wasser 81, Licht 74, Temperatur 78, Feuchtigkeit 78, Standort 82.
- Saatgut 14, Boden 14, Dünger 53, Wasser 49, Licht 42, Temperatur 42, Feuchtigkeit 43, Ort 43.
- Saatgut 55, Boden 57, Dünger 57, Wasser 53, Licht 46, Temperatur 82, Feuchtigkeit 82, Standort 86.
- Saatgut 13, Boden 13, Dünger 52, Wasser 41, Licht 34, Temperatur 34, Feuchtigkeit 35, Standort 35.

Die niedrigste Ortsnummer in diesem Beispiel ist also 35.

Welches ist die niedrigste Ortszahl, die einer der ursprünglichen Saatgutnummern entspricht?
