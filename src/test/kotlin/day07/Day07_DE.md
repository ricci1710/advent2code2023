**--- Tag 7: Kamelkarten ---**

Ihre Pauschalreise entpuppt sich als eine einfache, fünfminütige Fahrt in einem Luftschiff. (Wenigstens ist es ein cooles Luftschiff!) Es setzt Sie am Rande
einer riesigen Wüste ab und fliegt zurück nach Island Island.

"Hast du die Teile dabei?"

Du drehst dich um und siehst einen Elf, der ganz in weiße Kleidung gehüllt ist, eine Schutzbrille trägt und auf einem großen Kamel reitet.

"Hast du die Teile mitgebracht?", fragt sie erneut, diesmal lauter. Du bist dir nicht sicher, nach welchen Teilen sie sucht; du bist hier, um herauszufinden,
warum der Sand stehen geblieben ist.

"Die Teile! Für den Sand, ja! Komm mit mir, ich zeige sie dir." Sie winkt dich auf das Kamel.

Nachdem ihr ein Stück über den Sand der Wüsteninsel geritten seid, seht ihr etwas, das wie sehr große Felsen aussieht und den halben Horizont bedeckt. Die Elfe
erklärt, dass sich die Felsen entlang des Teils der Wüsteninsel befinden, der direkt über der Insel liegt, so dass es schwierig ist, überhaupt dorthin zu
gelangen. Normalerweise werden große Maschinen eingesetzt, um die Felsen zu bewegen und den Sand zu filtern, aber die Maschinen sind kaputt, weil die
Wüsteninsel seit kurzem keine Teile mehr erhält, die sie zur Reparatur der Maschinen benötigt.

Du hast schon angenommen, dass es deine Aufgabe sein wird, herauszufinden, warum die Teile nicht mehr geliefert werden, als sie dich fragt, ob du helfen kannst.
Du sagst automatisch zu.

Da die Reise ein paar Tage dauern wird, bietet sie dir an, dir das Spiel Kamelkarten beizubringen. Camel Cards ist ähnlich wie Poker, nur dass es leichter zu
spielen ist, wenn man auf einem Kamel reitet.

Bei Camel Cards erhältst du eine Liste von Blättern, und dein Ziel ist es, sie nach der Stärke des jeweiligen Blatts zu ordnen. Ein Blatt besteht aus fünf
Karten mit der Bezeichnung A, K, Q, J, T, 9, 8, 7, 6, 5, 4, 3 oder 2. Die relative Stärke der einzelnen Karten entspricht dieser Reihenfolge, wobei A die
höchste und 2 die niedrigste Karte ist.

Jedes Blatt ist genau ein Typ. Vom stärksten bis zum schwächsten Blatt sind dies:

- Fünflinge, bei denen alle fünf Karten die gleiche Bezeichnung haben: AAAAA
- Vierling, bei dem vier Karten die gleiche Bezeichnung haben und eine Karte eine andere Bezeichnung hat: AA8AA
- Full House, bei dem drei Karten die gleiche Bezeichnung haben und die verbleibenden zwei Karten eine andere Bezeichnung haben: 23332
- Drei Gleiche, bei denen drei Karten die gleiche Bezeichnung haben und die verbleibenden zwei Karten sich von jeder anderen Karte im Blatt unterscheiden: TTT98
- Zwei Paare, bei denen zwei Karten die gleiche Bezeichnung haben, zwei andere Karten eine zweite Bezeichnung haben und die verbleibende Karte eine dritte
  Bezeichnung hat: 23432
- Ein Paar, bei dem zwei Karten die gleiche Beschriftung haben und die anderen drei Karten eine andere Beschriftung haben als das Paar und die anderen Karten:
  A23A4
- Hohe Karte, bei der alle Karten unterschiedliche Bezeichnungen haben: 23456

Die Blätter sind in erster Linie nach ihrer Art geordnet; zum Beispiel ist jedes Full House stärker als jeder Drilling.

Wenn zwei Blätter den gleichen Typ haben, tritt eine zweite Ordnungsregel in Kraft. Vergleichen Sie zunächst die erste Karte in jedem Blatt. Wenn diese Karten
unterschiedlich sind, gilt das Blatt mit der stärkeren ersten Karte als stärker. Wenn die erste Karte in beiden Blättern jedoch die gleiche Bezeichnung hat,
wird die zweite Karte in beiden Blättern betrachtet. Wenn sie sich unterscheiden, gewinnt das Blatt mit der höheren zweiten Karte; andernfalls fahren Sie mit
der dritten Karte in jedem Blatt fort, dann mit der vierten und dann mit der fünften.

33332 und 2AAAA sind also beides Vierlingsblätter, aber 33332 ist stärker, weil seine erste Karte stärker ist. Ebenso sind 77888 und 77788 beides ein Full
House, aber 77888 ist stärker, weil seine dritte Karte stärker ist (und beide Blätter haben die gleiche erste und zweite Karte).

Um Camel Cards zu spielen, erhalten Sie eine Liste von Blättern und das dazugehörige Gebot (Ihr Puzzle-Input).
Zum Beispiel:

```
32T3K 765
T55J5 684
KK677 28
KTJJT 220
QQQJA 483
```

In diesem Beispiel werden fünf Blätter gezeigt; auf jedes Blatt folgt der Betrag, den es bietet. Jedes Blatt gewinnt einen Betrag, der seinem Gebot
multipliziert mit seinem Rang entspricht, wobei das schwächste Blatt den Rang 1 erhält, das zweitschwächste Blatt den Rang 2, und so weiter bis zum stärksten
Blatt. Da es in diesem Beispiel fünf Blätter gibt, hat das stärkste Blatt den Rang 5 und sein Gebot wird mit 5 multipliziert.

Der erste Schritt besteht also darin, die Hände in der Reihenfolge ihrer Stärke zu ordnen:

- 32T3K is the only one pair and the other hands are all a stronger type, so it gets rank 1.
- KK677 and KTJJT are both two pair. Their first cards both have the same label, but the second card of KK677 is stronger (K vs T), so KTJJT gets rank 2 and
  KK677 gets rank 3.
- T55J5 and QQQJA are both three of a kind. QQQJA has a stronger first card, so it gets rank 5 and T55J5 gets rank 4.

Sie können nun den Gesamtgewinn dieser Reihe von Blättern ermitteln, indem Sie das Ergebnis der Multiplikation der Gebote der einzelnen Blätter mit ihrem Rang
addieren (765 * 1 + 220 * 2 + 28 * 3 + 684 * 4 + 483 * 5). Der Gesamtgewinn in diesem Beispiel beträgt also 6440.

Ermitteln Sie den Rang jedes Blattes in Ihrem Satz. Wie hoch ist der Gesamtgewinn?