--- Tag 15: Linsenbibliothek ---
Die neu fokussierte Parabolantenne sendet das gesamte gesammelte Licht zu einem Punkt an der Seite eines weiteren Berges - des größten Berges auf der
Lava-Insel. Als Sie sich dem Berg nähern, stellen Sie fest, dass das Licht von der Wand einer großen, in den Berghang eingelassenen Anlage aufgefangen wird.

Sie finden eine Tür unter einem großen Schild mit der Aufschrift "Lava Production Facility" und neben einem kleineren Schild mit der Aufschrift "Danger -
Personal Protective Equipment required beyond this point".

Als Sie eintreten, werden Sie sofort von einem etwas panischen Rentier begrüßt, das eine Schutzbrille und einen locker sitzenden Schutzhelm trägt. Das Rentier
führt Sie zu einem Regal mit Schutzbrillen und Schutzhelmen (Sie finden schnell welche, die passen) und dann weiter in die Anlage hinein. An einer Stelle kommen
Sie an einem Knopf mit einer schwachen Schnauzenmarkierung und der Aufschrift "PUSH FOR HELP" vorbei. Kein Wunder, dass du so schnell in das Trebuchet geladen
wurdest!

ie gehen durch eine letzte Reihe von Türen, die mit noch mehr Warnschildern versehen sind, und gelangen in den Raum, der das gesamte Licht von draußen sammelt.
Während du die große Auswahl an Linsen bewunderst, die zur weiteren Fokussierung des Lichts zur Verfügung stehen, bringt dir das Rentier ein Buch mit dem
Titel "Initialisierungshandbuch".

"Hallo!", beginnt das Buch fröhlich, offenbar ohne das besorgte Rentier zu bemerken, das über deine Schulter liest. "Mit dieser Prozedur können Sie die
Lava-Produktionsanlage in Betrieb nehmen, ohne dass etwas Unbeabsichtigtes verbrennt oder schmilzt!"

"Bevor Sie beginnen, bereiten Sie sich bitte darauf vor, den Algorithmus Holiday ASCII String Helper zu verwenden (Anhang 1A)." Du blätterst zu Anhang 1A. Das
Rentier lehnt sich interessiert näher heran.

Der HASH-Algorithmus ist eine Möglichkeit, eine beliebige Zeichenkette in eine einzelne Zahl im Bereich von 0 bis 255 zu verwandeln. Um den HASH-Algorithmus auf
eine Zeichenkette anzuwenden, beginnen Sie mit einem aktuellen Wert von 0. Dann beginnen Sie für jedes Zeichen in der Zeichenkette vom Anfang an:

Ermitteln Sie den ASCII-Code für das aktuelle Zeichen der Zeichenkette.

- Erhöhen Sie den aktuellen Wert um den soeben ermittelten ASCII-Code.
- Setzen Sie den aktuellen Wert auf sich selbst multipliziert mit 17.
- Setzen Sie den aktuellen Wert auf den Rest, der sich aus der Teilung durch 256 ergibt.

Nachdem diese Schritte für jedes Zeichen in der Zeichenkette der Reihe nach durchgeführt wurden, ist der aktuelle Wert die Ausgabe des HASH-Algorithmus.

Um das Ergebnis des HASH-Algorithmus für die Zeichenfolge HASH zu ermitteln:

- Der aktuelle Wert beginnt bei 0.
- Das erste Zeichen ist H; sein ASCII-Code ist 72.
- Der aktuelle Wert erhöht sich auf 72.
- Der aktuelle Wert wird mit 17 multipliziert und ergibt 1224.
- Der aktuelle Wert wird zu 200 (der Rest von 1224 geteilt durch 256).
- Das nächste Zeichen ist A; sein ASCII-Code ist 65.
- Der aktuelle Wert erhöht sich auf 265.
- Der aktuelle Wert wird mit 17 multipliziert und ergibt 4505.
- Der aktuelle Wert wird zu 153 (der Rest von 4505 geteilt durch 256).
- Das nächste Zeichen ist S; sein ASCII-Code ist 83.
- Der aktuelle Wert erhöht sich auf 236.
- Der aktuelle Wert wird mit 17 multipliziert und ergibt 4012.
- Der aktuelle Wert wird zu 172 (der Rest von 4012 geteilt durch 256).
- Das nächste Zeichen ist H; sein ASCII-Code ist 72.
- Der aktuelle Wert erhöht sich auf 244.
- Der aktuelle Wert wird mit 17 multipliziert und ergibt 4148.
- Der aktuelle Wert wird zu 52 (der Rest von 4148 geteilt durch 256).

Das Ergebnis der Ausführung des HASH-Algorithmus auf die Zeichenfolge HASH ist also 52.

Die Initialisierungssequenz (Ihre Rätseleingabe) ist eine durch Kommata getrennte Liste von Schritten zum Starten der Lava-Produktionsanlage. Ignorieren Sie
Zeilenumbrüche beim Parsen der Initialisierungssequenz. Um zu überprüfen, ob Ihr HASH-Algorithmus funktioniert, bietet das Buch die Summe der Ergebnisse der
Ausführung des HASH-Algorithmus für jeden Schritt in der Initialisierungssequenz.

Zum Beispiel:

rn=1,cm-,qp=3,cm=2,qp-,pc=4,ot=9,ab=5,pc-,pc=6,ot=7
Diese Initialisierungssequenz legt 11 einzelne Schritte fest; das Ergebnis der Ausführung des HASH-Algorithmus auf jedem der Schritte ist wie folgt:

- rn=1 wird zu 30.
- cm- wird zu 253.
- qp=3 wird 97.
- cm=2 wird 47.
- qp- wird zu 14.
- pc=4 wird 180.
- ot=9 wird zu 9.
- ab=5 wird 197.
- pc- wird 48.
- pc=6 wird 214.
- ot=7 wird zu 231.

In diesem Beispiel ist die Summe dieser Ergebnisse 1320. Leider hat das Rentier die Seite mit der erwarteten Prüfziffer gestohlen und rennt damit aufgeregt
durch die Anlage.

Führen Sie den HASH-Algorithmus für jeden Schritt der Initialisierungssequenz aus. Was ist die Summe der Ergebnisse? (Die Initialisierungssequenz ist eine lange
Zeile; seien Sie vorsichtig, wenn Sie sie kopieren und einfügen).