**--- Tag 2: Würfel-Rätsel ---**

Du wirst hoch in die Atmosphäre geschossen! Der Scheitelpunkt deiner Flugbahn erreicht gerade noch die Oberfläche einer großen Insel, 
die im Himmel schwebt. Du landest sanft in einem flauschigen Blätterhaufen. Es ist ziemlich kalt, aber du siehst nicht viel Schnee. 
Ein Elf kommt herbeigelaufen, um dich zu begrüßen.

Der Elf erklärt dir, dass du auf der Schneeinsel angekommen bist, und entschuldigt sich für den fehlenden Schnee. Er erklärt dir gerne 
die Situation, aber es ist ein kleiner Spaziergang, also hast du noch etwas Zeit. Sie bekommen nicht viele Besucher hier oben; möchtest 
du in der Zwischenzeit ein Spiel spielen?

Während ihr geht, zeigt euch der Elf einen kleinen Beutel und einige Würfel, die entweder rot, grün oder blau sind. Jedes Mal, wenn du 
dieses Spiel spielst, wird er eine geheime Anzahl von Würfeln jeder Farbe in dem Beutel verstecken, und dein Ziel ist es, Informationen
über die Anzahl der Würfel herauszufinden.

Um an die Informationen zu gelangen, greift der Elf in den Beutel, nimmt eine Handvoll zufälliger Würfel, zeigt sie dir und legt sie wieder 
in den Beutel zurück. Das macht er ein paar Mal pro Spiel.

Du spielst mehrere Spiele und notierst die Informationen aus jedem Spiel (deinen Rätseleinsatz). Jedes Spiel wird mit seiner ID-Nummer 
aufgelistet (z. B. die 11 in Spiel 11: ...), gefolgt von einer durch Semikolon getrennten Liste von Teilmengen von Würfeln, die aus dem 
Beutel aufgedeckt wurden (z. B. 3 rote, 5 grüne, 4 blaue).
```
Die Aufzeichnung einiger Spiele könnte zum Beispiel so aussehen:

Spiel 1: 3 blau, 4 rot; 1 rot, 2 grün, 6 blau; 2 grün
Spiel 2: 1 blau, 2 grün; 3 grün, 4 blau, 1 rot; 1 grün, 1 blau
Spiel 3: 8 grün, 6 blau, 20 rot; 5 blau, 4 rot, 13 grün; 5 grün, 1 rot
Spiel 4: 1 grün, 3 rot, 6 blau; 3 grün, 6 rot; 3 grün, 15 blau, 14 rot
Spiel 5: 6 rot, 1 blau, 3 grün; 2 blau, 1 rot, 2 grün
```

In Spiel 1 werden drei Sätze von Würfeln aus dem Beutel aufgedeckt (und dann wieder zurückgelegt). 
Der erste Satz besteht aus 3 blauen und 4 roten Würfeln; der zweite Satz aus 1 roten, 2 grünen und 6 blauen Würfeln; der dritte Satz besteht
nur aus 2 grünen Würfeln.

Die Elfe möchte zunächst wissen, welche Spiele möglich gewesen wären, wenn der Beutel nur 12 rote, 13 grüne und 14 blaue Würfel enthalten hätte?

Im obigen Beispiel wären die Spiele 1, 2 und 5 möglich gewesen, wenn der Beutel mit dieser Konfiguration beladen worden wäre. Spiel 3 wäre jedoch 
unmöglich gewesen, weil die Elfe dir an einer Stelle 20 rote Würfel auf einmal gezeigt hat; ebenso wäre Spiel 4 unmöglich gewesen, weil die Elfe
dir 15 blaue Würfel auf einmal gezeigt hat. Zählt man die IDs der Spiele zusammen, die möglich gewesen wären, erhält man 8.

Bestimme, welche Spiele möglich gewesen wären, wenn der Beutel nur mit 12 roten, 13 grünen und 14 blauen Würfeln beladen gewesen wäre.
Was ist die Summe der IDs dieser Spiele?

**--- Zweiter Teil ---**

Der Elf sagt, dass sie aufgehört haben, Schnee zu produzieren, weil sie kein Wasser mehr bekommen! Er ist sich nicht sicher, warum das Wasser aufgehört hat,
aber er kann dir zeigen, wie du zu der Wasserquelle kommst, um es selbst zu überprüfen. Sie ist gleich da vorne!

Während ihr euren Spaziergang fortsetzt, stellt euch die Elfe eine zweite Frage: Wie viele Würfel jeder Farbe waren bei jedem Spiel, das ihr gespielt habt, 
am wenigsten im Beutel, um das Spiel zu ermöglichen?

Denkt wieder an die Beispielspiele von vorhin:
```
Spiel 1: 3 blau, 4 rot; 1 rot, 2 grün, 6 blau; 2 grün
Spiel 2: 1 blau, 2 grün; 3 grün, 4 blau, 1 rot; 1 grün, 1 blau
Spiel 3: 8 grün, 6 blau, 20 rot; 5 blau, 4 rot, 13 grün; 5 grün, 1 rot
Spiel 4: 1 grün, 3 rot, 6 blau; 3 grün, 6 rot; 3 grün, 15 blau, 14 rot
Spiel 5: 6 rot, 1 blau, 3 grün; 2 blau, 1 rot, 2 grün
```

- In Spiel 1 hätte das Spiel mit nur 4 roten, 2 grünen und 6 blauen Würfeln gespielt werden können. Hätte eine Farbe auch nur einen Würfel weniger gehabt, 
  wäre das Spiel unmöglich gewesen.
- Spiel 2 hätte mit einem Minimum von 1 roten, 3 grünen und 4 blauen Würfeln gespielt werden können.
- Spiel 3 muss mit mindestens 20 roten, 13 grünen und 6 blauen Würfeln gespielt worden sein.
- Spiel 4 musste mit mindestens 14 roten, 3 grünen und 15 blauen Würfeln gespielt werden.
- Für Spiel 5 mussten mindestens 6 rote, 3 grüne und 2 blaue Würfel im Beutel sein.

Die **Potenz** einer Menge von Würfeln ist gleich der Anzahl der roten, grünen und blauen Würfel, die miteinander multipliziert werden.
Die Potenz der kleinsten Würfelmenge in Spiel 1 ist 48. In den Spielen 2-5 waren es 12, 1560, 630 bzw. 36. Addiert man diese fünf Potenzen, erhält 
man die Summe 2286.

Ermitteln Sie für jedes Spiel die Mindestmenge an Würfeln, die vorhanden gewesen sein muss. 
**Was ist die Summe der Potenzen dieser Mengen?**