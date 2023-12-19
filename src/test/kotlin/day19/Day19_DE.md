**--- Tag 19: Reichlich ---**

Die Elfen von Gear Island sind dankbar für deine Hilfe und schicken dich auf den Weg. Sie haben sogar einen Hängegleiter, den jemand von der Wüsteninsel
gestohlen hat. Da du bereits in diese Richtung gehst, würde es ihnen sehr helfen, wenn du ihn benutzen würdest, um dorthin zu gelangen und ihn ihnen
zurückzugeben.

Als Sie den Fuß der unaufhaltsamen Lawine von Maschinenteilen erreichen, stellen Sie fest, dass diese bereits einen beachtlichen Haufen bilden. Aber keine
Sorge - eine Gruppe von Elfen ist bereits hier und ordnet die Teile, und sie haben ein System.

Zu Beginn wird jedes Teil in vier Kategorien eingestuft:

- x: Extrem cool aussehend
- m: Musikalisch (es macht ein Geräusch, wenn man es anschlägt)
- a: Aerodynamisch
- s: Glänzend

Anschließend wird jedes Teil durch eine Reihe von Arbeitsabläufen geschickt, die das Teil schließlich akzeptieren oder ablehnen. Jeder Workflow hat einen Namen
und enthält eine Liste von Regeln; jede Regel gibt eine Bedingung an und wohin das Teil geschickt werden soll, wenn die Bedingung erfüllt ist. Die erste Regel,
die auf das betreffende Teil zutrifft, wird sofort angewandt, und das Teil wird an das in der Regel beschriebene Ziel weitergeleitet. (Die letzte Regel in jedem
Arbeitsablauf hat keine Bedingung und wird immer angewendet, wenn sie erreicht wird).

Betrachten wir den Arbeitsablauf ex{x>10:eins,m<20:zwei,a>30:R,A}. Dieser Workflow trägt den Namen ex und enthält vier Regeln. Würde der Workflow ex einen
bestimmten Teil betrachten, würde er die folgenden Schritte in der richtigen Reihenfolge ausführen:

- Regel "x>10:eins": Wenn der Wert x des Teils größer als 10 ist, wird das Teil an den Workflow mit dem Namen eins geschickt.
- Regel "m<20:zwei": Wenn der Wert m des Teils kleiner als 20 ist, wird das Teil an den Arbeitsablauf mit der Bezeichnung zwei gesendet.
- Regel "a>30:R": Andernfalls wird das Teil sofort zurückgewiesen (R), wenn der Wert a des Teils größer als 30 ist.
- Regel "A": Andernfalls wird das Teil sofort angenommen (A), da keine anderen Regeln auf das Teil zutreffen.

Wenn ein Teil an einen anderen Workflow geschickt wird, wechselt es stattdessen sofort an den Anfang dieses Workflows und kehrt nie zurück. Wird ein Teil
angenommen (an A gesendet) oder abgelehnt (an R gesendet), wird die weitere Bearbeitung des Teils sofort eingestellt.

Das System funktioniert, aber es kommt mit der Flut an seltsamen Metallformen nicht zurecht. Die Elfen fragen dich, ob du bei der Sortierung einiger Teile
helfen kannst, und geben dir die Liste der Arbeitsabläufe und einige Teilebewertungen (dein Rätseleinsatz). Zum Beispiel:

```
px{a<2006:qkq,m>2090:A,rfg}
pv{a>1716:R,A}
lnx{m>1548:A,A}
rfg{s<537:gd,x>2440:R,A}
qs{s>3448:A,lnx}
qkq{x<1416:A,crn}
crn{x>2662:A,R}
in{s<1351:px,qqz}
qqz{s>2770:qs,m<1801:hdj,R}
gd{a>3333:R,R}
hdj{m>838:A,pv}

{x=787,m=2655,a=1222,s=2876}
{x=1679,m=44,a=2067,s=496}
{x=2036,m=264,a=79,s=2244}
{x=2461,m=1339,a=466,s=291}
{x=2127,m=1623,a=2188,s=1013}
```

Die Arbeitsabläufe werden zuerst aufgelistet, gefolgt von einer Leerzeile und den Bewertungen der Teile, die die Elfen sortieren möchten. Alle Teile beginnen in
dem Arbeitsablauf, der in genannt wird. In diesem Beispiel durchlaufen die fünf aufgeführten Teile die folgenden Arbeitsabläufe:

- {x=787,m=2655,a=1222,s=2876}: in -> qqz -> qs -> lnx -> A
- {x=1679,m=44,a=2067,s=496}: in -> px -> rfg -> gd -> R
- {x=2036,m=264,a=79,s=2244}: in -> qqz -> hdj -> pv -> A
- {x=2461,m=1339,a=466,s=291}: in -> px -> qkq -> crn -> R
- {x=2127,m=1623,a=2188,s=1013}: in -> px -> rfg -> A

Letztlich werden drei Teile akzeptiert. Die Addition der x-, m-, a- und s-Bewertung für jedes der akzeptierten Teile ergibt 7540 für das Teil mit x=787, 4623
für das Teil mit x=2036 und 6951 für das Teil mit x=2127. Die Addition aller Bewertungen für alle akzeptierten Teile ergibt die Gesamtsumme von 19114.

Sortieren Sie alle Teile, die Sie erhalten haben; was erhalten Sie, wenn Sie alle Bewertungszahlen für alle Teile addieren, die letztendlich akzeptiert werden?