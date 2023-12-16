**--- Tag 15: Linsenbibliothek ---**

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
eine Zeichenkette anzuwenden, beginnen Sie mit einem aktuellen Wert von 0. Dann beginnen Sie für jedes Zeichen in der Zeichenkette von Anfang an:

- Ermitteln Sie den ASCII-Code für das aktuelle Zeichen der Zeichenkette.
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
```
rn=1,cm-,qp=3,cm=2,qp-,pc=4,ot=9,ab=5,pc-,pc=6,ot=7
```

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

**--- Zweiter Teil ---**

Du überzeugst das Rentier, Dir die Seite zu bringen; die Seite bestätigt, dass Dein HASH-Algorithmus funktioniert.

Das Buch beschreibt eine Reihe von 256 Kästchen mit den Nummern 0 bis 255. Die Kästchen sind in einer Reihe angeordnet, ausgehend von dem Punkt, an dem das
Licht in die Einrichtung eintritt. 
Die Kästchen haben Löcher, durch die das Licht von einem Kästchen zum nächsten gelangt, und zwar die ganze Reihe entlang.

```
      +-----+  +-----+         +-----+
Light | Box |  | Box |   ...   | Box |
----------------------------------------->
      |  0  |  |  1  |   ...   | 255 |
      +-----+  +-----+         +-----+
```
Im Inneren jedes Kastens befinden sich mehrere Linsenschlitze, die dafür sorgen, dass die Linse richtig positioniert ist, um das durch den Kasten fallende 
Licht zu fokussieren.
An der Seite jedes Kastens befindet sich eine Klappe, die sich öffnen lässt, damit Sie die Linsen je nach Bedarf einsetzen oder entfernen können.

An der parallel zu den Kästen verlaufenden Wand befindet sich eine große Bibliothek mit Objektiven, die nach Brennweiten von 1 bis 9 geordnet sind.
Das Rentier bringt Ihnen auch einen kleinen tragbaren Etikettendrucker.

Das Buch erklärt die einzelnen Schritte der Initialisierungssequenz, die als Holiday ASCII String Helper Manual Arrangement Procedure, 
kurz HASHMAP, bezeichnet wird.

Jeder Schritt beginnt mit einer Buchstabenfolge, die die Bezeichnung der Linse angibt, auf die der Schritt wirkt. 
Das Ergebnis der Ausführung des HASH-Algorithmus auf dem Etikett zeigt das richtige Feld für diesen Schritt an.

Auf die Bezeichnung folgt unmittelbar ein Zeichen, das die auszuführende Operation angibt: entweder ein Gleichheitszeichen (=) oder ein Bindestrich (-).

Handelt es sich bei dem Operationszeichen um einen Bindestrich (-), gehen Sie zu dem betreffenden Kasten und entfernen Sie das Glas mit der angegebenen 
Bezeichnung, sofern es sich in diesem Kasten befindet.

Verschieben Sie dann alle verbleibenden Gläser im Kasten so weit nach vorne, wie es geht, ohne ihre Reihenfolge zu ändern, und füllen Sie den Platz, der 
durch das Entfernen des angegebenen Glases entstanden ist (Wenn keine Linse in der Schachtel das angegebene Etikett hat, passiert nichts.).

Wenn es sich bei dem Operationszeichen um ein Gleichheitszeichen (=) handelt, folgt darauf eine Zahl, die die Brennweite des Objektivs angibt, 
das in das betreffende Feld muss; verwenden Sie unbedingt den Beschriftungsersteller, um das Objektiv mit der zu Beginn des Schritts angegebenen 
Beschriftung zu versehen, damit Sie es später wiederfinden. 

Es gibt zwei mögliche Situationen:

- Wenn sich bereits ein Objektiv mit demselben Etikett in der Schachtel befindet, ersetzen Sie das alte Objektiv durch das neue: Nehmen Sie das alte Objektiv
  heraus und legen Sie das neue Objektiv an seine Stelle, ohne andere Objektive in der Schachtel zu verschieben.
- Befindet sich in der Schachtel noch kein Objektiv mit demselben Etikett, fügen Sie das Objektiv unmittelbar hinter den bereits in der Schachtel befindlichen
  Objektiven ein.
  Verschieben Sie dabei keines der anderen Objektive. Wenn sich keine Objektive in der Schachtel befinden, kommt das neue Objektiv ganz nach 
  vorne in die Schachtel.

Hier sehen Sie den Inhalt jedes Kastens nach jedem Schritt in der obigen Beispielinitialisierungssequenz:
```
After "rn=1":
Box 0: [rn 1]

After "cm-":
Box 0: [rn 1]

After "qp=3":
Box 0: [rn 1]
Box 1: [qp 3]

After "cm=2":
Box 0: [rn 1] [cm 2]
Box 1: [qp 3]

After "qp-":
Box 0: [rn 1] [cm 2]

After "pc=4":
Box 0: [rn 1] [cm 2]
Box 3: [pc 4]

After "ot=9":
Box 0: [rn 1] [cm 2]
Box 3: [pc 4] [ot 9]

After "ab=5":
Box 0: [rn 1] [cm 2]
Box 3: [pc 4] [ot 9] [ab 5]

After "pc-":
Box 0: [rn 1] [cm 2]
Box 3: [ot 9] [ab 5]

After "pc=6":
Box 0: [rn 1] [cm 2]
Box 3: [ot 9] [ab 5] [pc 6]

After "ot=7":
Box 0: [rn 1] [cm 2]
Box 3: [ot 7] [ab 5] [pc 6]
```

Es sind immer alle 256 Felder vorhanden; hier werden nur die Felder angezeigt, die Objektive enthalten. 
Innerhalb jedes Kastens sind die Objektive von vorne nach hinten aufgelistet; jedes Objektiv wird mit seiner Bezeichnung und Brennweite in eckigen Klammern 
angezeigt.

Um zu überprüfen, ob alle Objektive korrekt installiert sind, addieren Sie die Fokussierleistung aller Objektive.
Die Fokussierleistung eines einzelnen Objektivs ist das Ergebnis der Multiplikation:

- Eins plus die Schachtelnummer des betreffenden Objektivs.
- Die Steckplatznummer des Objektivs in der Schachtel: 1 für das erste Objektiv, 2 für das zweite Objektiv und so weiter.
- Die Brennweite des Objektivs.

Am Ende des obigen Beispiels ist die Fokussierleistung jedes Objektivs wie folgt:
```
- rn: 1 (box 0) * 1 (first slot) * 1 (focal length)   = 1
- cm: 1 (box 0) * 2 (second slot) * 2 (focal length)  = 4
- ot: 4 (box 3) * 1 (first slot) * 7 (focal length)   = 28
- ab: 4 (box 3) * 2 (second slot) * 5 (focal length)  = 40
- pc: 4 (box 3) * 3 (third slot) * 6 (focal length)   = 72
```
Im obigen Beispiel ergibt sich also eine Gesamtfokussierungskraft von 145.

Verfolgen Sie mit Hilfe eines übereifrigen Rentiers mit Schutzhelm die Initialisierungssequenz. 
Wie hoch ist die Fokussierungskraft der resultierenden Linsenkonfiguration?