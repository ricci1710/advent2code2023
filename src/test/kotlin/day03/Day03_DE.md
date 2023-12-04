**--- Tag 3: Ausrüstungsverhältnisse ---**

Du und der Elf erreichen schließlich eine Gondelbahn Station. Er sagt, dass die Gondelbahn dich bis zur Wasserquelle bringen wird,
aber weiter kann er dich nicht bringen. Du gehst hinein.

Es dauert nicht lange, um die Gondeln zu finden, aber es scheint ein Problem zu geben: Sie bewegen sich nicht.

"Aaah!"

Du drehst dich um und siehst einen leicht schmierigen Elfen mit einem Schraubenschlüssel und einem überraschten Blick. "Tut mir leid,
ich habe niemanden erwartet! Die Gondelbahn funktioniert im Moment nicht; es wird noch eine Weile dauern, bis ich sie reparieren kann."
Du bietest deine Hilfe an.

Der Ingenieur erklärt, dass am Motor ein Teil zu fehlen scheint, aber niemand kann herausfinden, welches. Wenn Sie alle Teilenummern
im Schaltplan des Motors zusammenzählen können, sollte es einfach sein, das fehlende Teil herauszufinden.

Der Motorschaltplan (dein Rätselbild) besteht aus einer visuellen Darstellung des Motors. Es gibt viele Zahlen und Symbole, die du nicht
wirklich verstehst, aber offensichtlich ist jede Zahl, die an ein Symbol angrenzt, auch diagonal, eine "Teilenummer" und sollte in deine
Summe einbezogen werden. (Punkte (.) zählen nicht als Symbol.)

```
Hier ist ein Beispiel für einen Motorschaltplan:

467..114..
...*......
..35..633.
......#...
617*......
.....+.58.
..592.....
......755.
...$.*....
.664.598..
```

In diesem Schaltplan sind zwei Zahlen keine Teilenummern, da sie nicht neben einem Symbol stehen: 114 (oben rechts) und 58 (Mitte rechts).
Jede andere Zahl grenzt an ein Symbol und ist somit eine Teilnummer; ihre Summe ist 4361.

Der eigentliche Schaltplan des Motors ist natürlich viel größer. Wie hoch ist die Summe aller Teilenummern im Schaltplan des Motors?

**--- Zweiter Teil ---**

Der Ingenieur findet das fehlende Teil und baut es in den Motor ein! Als der Motor zum Leben erwacht, springst du in die nächstgelegene Gondel und bist
endlich bereit, zur Wasserquelle aufzusteigen.

Du scheinst aber nicht sehr schnell zu fahren. Vielleicht stimmt noch etwas nicht? Zum Glück gibt es in der Gondel ein Telefon mit der Aufschrift "Hilfe",
also nimmst du es ab und der Ingenieur geht ran.

Bevor du die Situation erklären kannst, schlägt sie vor, dass du aus dem Fenster schaust. Dort steht der Lokführer mit dem Telefon in der einen Hand und
winkt mit der anderen. Du fährst so langsam, dass du noch nicht einmal den Bahnhof verlassen hast. Sie verlassen die Gondel.

Das fehlende Teil war nicht das einzige Problem - eines der Zahnräder im Motor ist falsch. Ein Zahnrad ist ein beliebiges *-Symbol, das an genau zwei
Teilenummern angrenzt. Das Übersetzungsverhältnis ist das Ergebnis der Multiplikation dieser beiden Zahlen.

Diesmal müssen Sie das Übersetzungsverhältnis jedes Zahnrads ermitteln und alle Zahlen addieren, damit der Ingenieur herausfinden kann, welches Zahnrad
ersetzt werden muss.

```
Betrachten Sie noch einmal das gleiche Motorschema:

467..114..
...*......
..35..633.
......#...
617*......
.....+.58.
..592.....
......755.
...$.*....
.664.598..
```

In diesem Schaltplan gibt es zwei Zahnräder. Das erste befindet sich oben links; es hat die Teilenummern 467 und 35, sein Übersetzungsverhältnis ist also 16345.
Das zweite Zahnrad befindet sich unten rechts; sein Übersetzungsverhältnis ist 451490.
(Das * neben 617 ist kein Zahnrad, da es nur neben einer Teilenummer steht).

Die Addition aller Zahnradübersetzungen ergibt 467835.
**Wie hoch ist die Summe aller Übersetzungsverhältnisse in Ihrem Motorschaltplan?**