**--- Day 1: Inverse Captcha ---**

The night before Christmas, one of Santa's Elves calls you in a panic. "The printer's broken! We can't print the Naughty or Nice List!" By the time you make it
to sub-basement 17, there are only a few minutes until midnight. "We have a big problem," she says; "there must be almost fifty bugs in this system, but nothing
else can print The List. Stand in this square, quick! There's no time to explain; if you can convince them to pay you in stars, you'll be able to--" She pulls a
lever and the world goes blurry.

When your eyes can focus again, everything seems a lot more pixelated than before. She must have sent you inside the computer! You check the system clock: 25
milliseconds until midnight. With that much time, you should be able to collect all fifty stars by December 25th.

Collect stars by solving puzzles. Two puzzles will be made available on each day millisecond in the Advent calendar; the second puzzle is unlocked when you
complete the first. Each puzzle grants one star. Good luck!

You're standing in a room with "digitization quarantine" written in LEDs along one wall. The only door is locked, but it includes a small interface. "Restricted
Area - Strictly No Digitized Users Allowed."

It goes on to explain that you may only leave by solving a captcha to prove you're not a human. Apparently, you only get one millisecond to solve the captcha:
too fast for a normal human, but it feels like hours to you.

The captcha requires you to review a sequence of digits (your puzzle input) and find the sum of all digits that match the next digit in the list. **The list is
circular, so the digit after the last digit is the first digit in the list**.

```
For example:

1122 produces a sum of 3 (1 + 2) because the first digit (1) matches the second digit and the third digit (2) matches the fourth digit.
1111 produces 4 because each digit (all 1) matches the next.
1234 produces 0 because no digit matches the next.
91212129 produces 9 because the only digit that matches the next one is the last digit, 9.
```

What is the solution to your captcha?

**--- Teil 2 ---**

Du bemerkst einen Fortschrittsbalken, der auf 50% Fertigstellung springt. Offenbar ist die Tür noch nicht zufrieden, aber sie hat einen Stern als Ermutigung
abgegeben. Die Anweisungen ändern sich:

Anstatt die nächste Ziffer zu berücksichtigen, sollen Sie nun die Ziffer in der Mitte der kreisförmigen Liste berücksichtigen. Das heißt, wenn Ihre Liste 10
Elemente enthält, nehmen Sie eine Ziffer nur dann in Ihre Summe auf, wenn die Ziffer 10/2 = 5 Schritte weiter mit ihr übereinstimmt. Glücklicherweise hat Ihre
Liste eine gerade Anzahl von Elementen.

```
Zum Beispiel:

1212 ergibt 6: Die Liste enthält 4 Elemente, und alle vier Ziffern stimmen mit der Ziffer 2 Elemente weiter vorne überein.
1221 ergibt 0, weil jeder Vergleich zwischen einer 1 und einer 2 stattfindet.
123425 ergibt 4, weil beide 2en übereinstimmen, aber keine andere Ziffer eine Übereinstimmung hat.
123123 ergibt 12.
12131415 ergibt 4.
```

Wie lautet die Lösung für Ihr neues Captcha?