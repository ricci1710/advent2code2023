**--- Tag 24: Sagen Sie mir nie die Quoten ---**

Irgendetwas scheint bei der Schneeherstellung schief zu laufen. Anstatt Schnee zu bilden, scheint das Wasser, das in die Luft absorbiert wurde, Hagel zu bilden!

Vielleicht kannst du etwas tun, um die Hagelkörner aufzulösen?

Aufgrund starker, wahrscheinlich magischer Winde fliegen die Hagelkörner alle in perfekt geradlinigen Bahnen durch die Luft. Du notierst dir die Position und
die Geschwindigkeit jedes Hagelkorns (deine Rätseleingabe).

Zum Beispiel:

```
19, 13, 30 @ -2, 1, -2
18, 19, 22 @ -1, -1, -2
20, 25, 34 @ -2, -2, -4
12, 31, 28 @ -1, -2, -1
20, 19, 15 @ 1, -5, -3
```

Jede Textzeile entspricht der Position und Geschwindigkeit eines einzelnen Hagelkorns. Die Positionen geben an, wo sich die Hagelkörner gerade befinden (zum
Zeitpunkt 0). Die Geschwindigkeiten sind konstant und geben genau an, wie weit sich jedes Hagelkorn in einer Nanosekunde bewegen wird.

Jede Textzeile hat das Format px py pz @ vx vy vz. Das durch 20, 19, 15 @ 1, -5, -3 spezifizierte Hagelkorn hat beispielsweise die anfängliche X-Position 20,
Y-Position 19, Z-Position 15, X-Geschwindigkeit 1, Y-Geschwindigkeit -5 und Z-Geschwindigkeit -3. Nach einer Nanosekunde würde sich das Hagelkorn an der
Position 21, 14, 12 befinden.

Vielleicht müssen Sie gar nichts tun. Wie wahrscheinlich ist es, dass die Hagelkörner miteinander kollidieren und in winzige Eiskristalle zerschellen?

Um dies abzuschätzen, betrachten Sie nur die X- und Y-Achse; die Z-Achse lassen Sie außer Acht. Wie viele der Hagelkörner werden sich in der Zukunft innerhalb
eines Testgebiets kreuzen? (Die Hagelkörner selbst müssen nicht zusammenstoßen, es wird lediglich geprüft, ob sich die Bahnen, die sie ziehen werden, kreuzen).

In diesem Beispiel suchen Sie nach Schnittpunkten mit einer X- und Y-Position von jeweils mindestens 7 und höchstens 27; in Ihren tatsächlichen Daten müssen Sie
einen viel größeren Testbereich überprüfen. Der Vergleich aller Paare von Hagelkörnern ergibt die folgenden Ergebnisse:

```
Hagelkorn A: 19, 13, 30 @ -2, 1, -2
Hagelkorn B: 18, 19, 22 @ -1, -1, -2
Die Bahnen der Hagelkörner kreuzen sich innerhalb des Testbereichs (bei x=14,333, y=15,333).

Hagelkorn A: 19, 13, 30 @ -2, 1, -2
Hagelkorn B: 20, 25, 34 @ -2, -2, -4
Die Bahnen der Hagelkörner kreuzen sich innerhalb des Testgebiets (bei x=11,667, y=16,667).

Hagelkorn A: 19, 13, 30 @ -2, 1, -2
Hagelkorn B: 12, 31, 28 @ -1, -2, -1
Die Bahnen der Hagelkörner kreuzen sich außerhalb des Testgebiets (bei x=6,2, y=19,4).

Hagelkorn A: 19, 13, 30 @ -2, 1, -2
Hagelkorn B: 20, 19, 15 @ 1, -5, -3
Die Wege der Hagelkörner haben sich in der Vergangenheit bei Hagelkorn A gekreuzt.

Hagelkorn A: 18, 19, 22 @ -1, -1, -2
Hagelkorn B: 20, 25, 34 @ -2, -2, -4
Die Bahnen der Hagelkörner sind parallel; sie kreuzen sich nie.

Hagelkorn A: 18, 19, 22 @ -1, -1, -2
Hagelkorn B: 12, 31, 28 @ -1, -2, -1
Die Bahnen der Hagelkörner kreuzen sich außerhalb des Testbereichs (bei x=-6, y=-5).

Hagelkorn A: 18, 19, 22 @ -1, -1, -2
Hagelkorn B: 20, 19, 15 @ 1, -5, -3
Bei beiden Hagelkörnern haben sich die Wege in der Vergangenheit gekreuzt.

Hagelkorn A: 20, 25, 34 @ -2, -2, -4
Hagelkorn B: 12, 31, 28 @ -1, -2, -1
Die Bahnen der Hagelkörner kreuzen sich außerhalb des Testgebiets (bei x=-2, y=3).

Hagelkorn A: 20, 25, 34 @ -2, -2, -4
Hagelkorn B: 20, 19, 15 @ 1, -5, -3
Die Wege der Hagelkörner haben sich in der Vergangenheit bei Hagelkorn B gekreuzt.

Hagelkorn A: 12, 31, 28 @ -1, -2, -1
Hagelkorn B: 20, 19, 15 @ 1, -5, -3
Die Wege der Hagelkörner haben sich in der Vergangenheit für beide Hagelkörner gekreuzt.
```

In diesem Beispiel kreuzen sich also die zukünftigen Wege von 2 Hagelkörnern innerhalb der Grenzen des Testgebiets.

Sie müssen jedoch einen viel größeren Testbereich durchsuchen, wenn Sie herausfinden wollen, ob Hagelkörner zusammenstoßen könnten. Suchen Sie nach
Überschneidungen mit einer X- und Y-Position, die jeweils mindestens 200000000000000 und höchstens 400000000000000 betragen.
Lassen Sie die Z-Achse völlig außer Acht.

Betrachten Sie nur die X- und Y-Achse und überprüfen Sie alle Paare von Hagelkörnern auf Überschneidungen ihrer zukünftigen Bahnen.

**Wie viele dieser Schnittpunkte treten innerhalb des Testgebiets auf?**

https://mathegym.de/mathe/wissen/635/wie-ermittelt-man-die-gleichung-einer-geraden-wenn-zwei-punkte-gegeben-sind

https://studyflix.de/mathematik/schnittpunkt-zweier-geraden-1904

```
Schnittpunkt:

Hagelkorn A: 19, 13, 30 @ -2, 1, -2
Hagelkorn B: 18, 19, 22 @ -1, -1, -2
Die Bahnen der Hagelkörner kreuzen sich innerhalb des Testbereichs (bei x=14,333, y=15,333).


19, 13, 30 @ -2, 1, -2.  =>

P1(19, 13).  P2(17, 14)

dx = P2x - P1x = 17 - 19 =  -2
dy = P2y - P1y = 14 - 13 =   1

1. Bestimme zunächst die Steigung m = Δy / Δx -> m = - 1/2
2. Setze dann in die Gleichung y = m·x + b die Koordinaten von einem der beiden Punkte ein und löse die Gleichung nach b auf.

y = m * x + b => b = y - m * x

b = 13 - (-1/2) *19 = 22.5

f(x) = y = -0.5 * x + 22.5

————————————————————————————————————————————————————————————————

18, 19, 22 @ -1, -1, -2
P1(18,19)  P2(17,18)

m = Δy / Δx -> m = 1
b = 19 - 1 * 18 = 1

g(x) = x + 1


Schnittpunkt zweier Geraden berechnen – kurz & knapp
1. Funktionen gleichsetzen.
2. Nach x auflösen.
3. y-Koordinate berechnen
4. Probe: x in die zweite Gleichung einsetzen
5. Schnittpunkt angeben


-0.5 * x + 22.5 = x + 1       | -1 |  +0.5 * x
21.5 = 1/2 + 2/2 = 3/2x

21.5 * 2 / 3 = x = 14,33333
               y = 15,33333
```
