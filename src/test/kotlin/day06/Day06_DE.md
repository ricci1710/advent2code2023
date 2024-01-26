--- Tag 6: Warten Sie auf ihn ---
Die Fähre bringt dich schnell über die Insel Island. Nachdem du dich umgehört hast, entdeckst du, dass es in der Tat normalerweise irgendwo in der Nähe einen
großen Sandhaufen gibt, aber du siehst nichts außer viel Wasser und der kleinen Insel, an der die Fähre angedockt hat.

Während du überlegst, was du als Nächstes tun sollst, bemerkst du ein Plakat an einer Wand in der Nähe des Fähranlegers. "Bootsrennen! Offen für die
Öffentlichkeit! Der Hauptpreis ist eine Pauschalreise nach Desert Island!" Da muss der Sand herkommen! Und das Beste ist, dass die Bootsrennen in wenigen
Minuten beginnen.

Sie schaffen es gerade noch rechtzeitig, sich als Teilnehmer für das Bootsrennen anzumelden. Der Veranstalter erklärt Ihnen, dass es sich nicht um ein
herkömmliches Rennen handelt. Stattdessen bekommen Sie eine bestimmte Zeitspanne, in der Ihr Boot so weit wie möglich fahren muss, und Sie gewinnen, wenn Ihr
Boot am weitesten fährt.

Als Teil der Anmeldung erhalten Sie ein Blatt Papier (Ihre Rätseleingabe), auf dem die für jedes Rennen erlaubte Zeit sowie die beste jemals in diesem Rennen
erzielte Entfernung aufgeführt sind. Um den Hauptpreis zu gewinnen, müssen Sie in jedem Rennen weiter fahren als der aktuelle Rekordhalter.

Der Organisator bringt Sie zu dem Bereich, in dem die Bootsrennen stattfinden. Die Boote sind viel kleiner, als du erwartet hast - es sind eigentlich
Spielzeugboote, jedes mit einem großen Knopf auf der Oberseite. Wenn du den Knopf gedrückt hältst, wird das Boot aufgeladen, und wenn du den Knopf loslässt,
fährt das Boot los. Die Boote fahren schneller, wenn du den Knopf länger gedrückt hältst, aber die Zeit, in der du den Knopf gedrückt hältst, wird auf die
Gesamtzeit des Rennens angerechnet. Du kannst den Knopf nur zu Beginn des Rennens gedrückt halten, und die Boote bewegen sich erst, wenn du den Knopf loslässt.

Zum Beispiel:

```
Zeit: 7 15 30
Entfernung: 9 40 200
```

In diesem Dokument werden drei Rennen beschrieben:

- Das erste Rennen dauert 7 Millisekunden. Die Rekorddistanz in diesem Rennen beträgt 9 Millimeter.
- Das zweite Rennen dauert 15 Millisekunden. Die Rekorddistanz in diesem Rennen beträgt 40 Millimeter.
- Das dritte Rennen dauert 30 Millisekunden. Die Rekorddistanz in diesem Rennen beträgt 200 Millimeter.

Ihr Spielzeugboot hat eine Startgeschwindigkeit von null Millimetern pro Millisekunde. Für jede ganze Millisekunde, die Sie zu Beginn des Rennens die Taste
gedrückt halten, erhöht sich die Geschwindigkeit des Bootes um einen Millimeter pro Millisekunde.

Da das erste Rennen also 7 Millisekunden dauert, haben Sie nur wenige Möglichkeiten:

- Halten Sie die Taste zu Beginn des Rennens überhaupt nicht gedrückt (d. h. 0 Millisekunden lang). Das Boot wird sich nicht bewegen; es wird am Ende des
  Rennens 0 Millimeter zurückgelegt haben.
- Halten Sie die Taste zu Beginn des Rennens 1 Millisekunde lang gedrückt. Dann bewegt sich das Boot 6 Millisekunden lang mit einer Geschwindigkeit von 1
  Millimeter pro Millisekunde, so dass es eine Gesamtstrecke von 6 Millimetern zurückgelegt hat.
- Halten Sie die Taste 2 Millisekunden lang gedrückt, damit das Boot eine Geschwindigkeit von 2 Millimetern pro Millisekunde erreicht. Es hat dann 5
  Millisekunden Zeit, um sich zu bewegen und eine Gesamtstrecke von 10 Millimetern zu erreichen.
- Halten Sie die Taste 3 Millisekunden lang gedrückt. Nach den verbleibenden 4 Millisekunden Fahrzeit hat das Boot 12 Millimeter zurückgelegt.
- Halten Sie die Taste 4 Millisekunden lang gedrückt. Nach der verbleibenden Fahrzeit von 3 Millisekunden hat sich das Boot 12 Millimeter bewegt.
- Halten Sie die Taste 5 Millisekunden lang gedrückt, so dass das Boot insgesamt 10 Millimeter zurückgelegt hat.
- Halten Sie die Taste 6 Millisekunden lang gedrückt, so dass das Boot insgesamt 6 Millimeter zurückgelegt hat.
- Halten Sie die Taste 7 Millisekunden lang gedrückt. Das ist die gesamte Dauer des Rennens. Du darfst den Knopf nie loslassen. Das Boot kann sich erst bewegen,
  wenn Sie den Knopf loslassen. Achten Sie darauf, dass Sie den Knopf loslassen, damit sich das Boot bewegen kann. 0 Millimeter.

Da der aktuelle Rekord bei diesem Rennen bei 9 Millimetern liegt, gibt es vier verschiedene Möglichkeiten zu gewinnen: Sie können die Taste zu Beginn des
Rennens 2, 3, 4 oder 5 Millisekunden lang gedrückt halten.

Im zweiten Rennen kannst du den Knopf mindestens 4 und höchstens 11 Millisekunden lang gedrückt halten und den Rekord brechen, also insgesamt 8 verschiedene
Möglichkeiten zu gewinnen.

Im dritten Rennen musst du den Knopf mindestens 11 Millisekunden und höchstens 19 Millisekunden gedrückt halten, um den Rekord zu brechen, also insgesamt 9
Möglichkeiten zu gewinnen.

Um zu sehen, wie viel Spielraum Sie haben, bestimmen Sie die Anzahl der Möglichkeiten, wie Sie den Rekord in jedem Rennen schlagen können. Wenn Sie in diesem
Beispiel diese Werte miteinander multiplizieren, erhalten Sie 288 (4 * 8 * 9).

Bestimmen Sie die Anzahl der Möglichkeiten, wie Sie den Rekord in jedem Rennen schlagen können. Was erhältst du, wenn du diese Zahlen miteinander
multiplizierst?