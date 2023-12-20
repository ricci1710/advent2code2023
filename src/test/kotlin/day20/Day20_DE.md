--- Tag 20: Impulsausbreitung ---
Mit deiner Hilfe gelingt es den Elfen, die richtigen Teile zu finden und alle Maschinen zu reparieren. Jetzt müssen sie nur noch den Befehl zum Hochfahren der
Maschinen geben, damit der Sand wieder fließen kann.

Die Maschinen sind weit voneinander entfernt und mit langen Kabeln miteinander verbunden. Die Kabel sind nicht direkt mit den Maschinen verbunden, sondern mit
Kommunikationsmodulen, die an den Maschinen angebracht sind und verschiedene Initialisierungsaufgaben übernehmen und auch als Kommunikationsrelais fungieren.

Die Module kommunizieren mit Hilfe von Impulsen. Jeder Impuls ist entweder ein High-Impuls oder ein Low-Impuls. Wenn ein Modul einen Impuls sendet, sendet es
diese Art von Impuls an jedes Modul in seiner Liste der Zielmodule.

Es gibt mehrere verschiedene Arten von Modulen:

Flip-Flop-Module (Präfix %) sind entweder ein- oder ausgeschaltet; anfangs sind sie ausgeschaltet. Wenn ein Flipflop-Modul einen hohen Impuls empfängt, wird er
ignoriert und es passiert nichts. Erhält ein Flipflop-Modul jedoch einen Low-Impuls, schaltet es zwischen ein und aus um. Wenn es ausgeschaltet war, schaltet es
sich ein und sendet einen High-Impuls. Wenn es eingeschaltet war, schaltet es sich aus und sendet einen Low-Impuls.

Konjunktionsmodule (Präfix &) speichern den Typ des letzten Impulses, der von jedem ihrer angeschlossenen Eingangsmodule empfangen wurde; standardmäßig
speichern sie zunächst einen niedrigen Impuls für jeden Eingang. Wenn ein Impuls empfangen wird, aktualisiert das Verbindungsmodul zunächst seinen Speicher für
diesen Eingang. Wenn es sich dann an hohe Impulse für alle Eingänge erinnert, sendet es einen niedrigen Impuls; andernfalls sendet es einen hohen Impuls.

Es gibt ein einziges Broadcast-Modul (Broadcaster genannt). Wenn es einen Impuls empfängt, sendet es denselben Impuls an alle seine Zielmodule.

Hier im Hauptquartier von Desert Machine gibt es ein Modul mit einem einzigen Knopf, der passenderweise Knopfmodul genannt wird. Wenn Sie den Knopf drücken,
wird ein einzelner niedriger Impuls direkt an das Sendemodul gesendet.

Nachdem Sie den Knopf gedrückt haben, müssen Sie warten, bis alle Impulse gesendet und vollständig verarbeitet wurden, bevor Sie ihn erneut drücken. Drücken Sie
niemals die Taste, wenn die Module noch Impulse verarbeiten.

Die Impulse werden immer in der Reihenfolge verarbeitet, in der sie gesendet werden. Wenn also ein Impuls an die Module a, b und c gesendet wird und dann Modul
a seinen Impuls verarbeitet und weitere Impulse sendet, müssten die an die Module b und c gesendeten Impulse zuerst verarbeitet werden.

In der Modulkonfiguration (Ihre Rätseleingabe) ist jedes Modul aufgeführt. Dem Namen des Moduls ist ein Symbol vorangestellt, das seinen Typ angibt, falls
vorhanden. Dem Namen folgt ein Pfeil und eine Liste der Zielmodule. Zum Beispiel:

```
broadcaster -> a, b, c
%a -> b
%b -> c
%c -> inv
&inv -> a
```

In dieser Modulkonfiguration hat der Sender drei Zielmodule mit den Namen a, b und c. Jedes dieser Module ist ein Flip-Flop-Modul (gekennzeichnet durch das
Präfix %). a gibt an b aus, das an c ausgibt, das wiederum an ein anderes Modul mit dem Namen inv ausgibt. inv ist ein Konjunktionsmodul (gekennzeichnet durch
das Präfix &), das sich, da es nur einen Eingang hat, wie ein Inverter verhält (es sendet das Gegenteil der Impulsart, die es empfängt); es gibt an a aus.

Durch einmaliges Drücken der Taste werden die folgenden Impulse gesendet:

```
button -low-> broadcaster
broadcaster -low-> a
broadcaster -low-> b
broadcaster -low-> c
a -high-> b
b -high-> c
c -high-> inv
inv -low-> a
a -low-> b
b -low-> c
c -low-> inv
inv -high-> a
```

Nach dieser Sequenz sind alle Flip-Flop-Module ausgeschaltet, so dass ein erneutes Drücken des Knopfes die gleiche Sequenz wiederholt.

Hier ist ein noch interessanteres Beispiel:

```
broadcaster -> a
%a -> inv, con
&inv -> b
%b -> con
&con -> output
```

Diese Modulkonfiguration umfasst den Sender, zwei Flipflops (mit den Namen a und b), ein Konjunktionsmodul mit einem Eingang (inv), ein Konjunktionsmodul mit
mehreren Eingängen (con) und ein nicht typisiertes Modul mit dem Namen output (für Testzwecke). Das Konjunktionsmodul mit mehreren Eingängen (con) überwacht die
beiden Flip-Flop-Module und sendet, wenn beide eingeschaltet sind, einen niedrigen Impuls an das Ausgangsmodul.

So sieht es aus, wenn man den Knopf einmal drückt:

```
button -low-> broadcaster
broadcaster -low-> a
a -high-> inv
a -high-> con
inv -low-> b
con -high-> output
b -high-> con
con -low-> output
```

Beide Flipflops schalten sich ein, und ein niedriger Impuls wird an den Ausgang gesendet! Da nun aber beide Flipflops eingeschaltet sind und con von jedem
seiner beiden Eingänge einen hohen Impuls erhält, bewirkt ein zweiter Tastendruck etwas anderes:

```
button -low-> broadcaster
broadcaster -low-> a
a -low-> inv
a -low-> con
inv -high-> b
con -high-> output
```

Flip-Flop a schaltet aus! Jetzt merkt sich con einen Low-Impuls von Modul a und sendet daher nur einen High-Impuls an den Ausgang.

Drücken Sie den Knopf ein drittes Mal:

```
button -low-> broadcaster
broadcaster -low-> a
a -high-> inv
a -high-> con
inv -low-> b
con -low-> output
b -low-> con
con -high-> output
```

Diesmal schaltet sich Flip-Flop a ein, dann schaltet sich Flip-Flop b aus. Bevor sich b jedoch ausschalten kann, wird zuerst der an con gesendete Impuls
verarbeitet, so dass es sich kurzzeitig alle hohen Impulse für seine Eingänge merkt und einen niedrigen Impuls an den Ausgang sendet. Danach schaltet sich das
Flipflop b aus, was dazu führt, dass con seinen Zustand aktualisiert und einen hohen Impuls an den Ausgang sendet.

Zum Schluss, wenn a eingeschaltet und b ausgeschaltet ist, drücken Sie den Knopf ein viertes Mal:

```
button -low-> broadcaster
broadcaster -low-> a
a -low-> inv
a -low-> con
inv -high-> b
con -high-> output
```

Damit ist der Zyklus abgeschlossen: a schaltet sich aus, was dazu führt, dass con sich nur noch an niedrige Impulse erinnert und alle Module in ihren
ursprünglichen Zustand zurückversetzt werden.

Um die Kabel zu erwärmen, haben die Elfen den Knopf 1000 Mal gedrückt. Wie viele Impulse wurden daraufhin gesendet (einschließlich der Impulse, die der Knopf
selbst gesendet hat)?

Im ersten Beispiel passiert jedes Mal, wenn der Knopf gedrückt wird, das Gleiche: 8 niedrige Impulse und 4 hohe Impulse werden gesendet. Nach 1000-maligem
Drücken der Taste werden also 8000 tiefe Impulse und 4000 hohe Impulse gesendet. Multipliziert man diese Werte miteinander, erhält man 32000000.

Im zweiten Beispiel werden nach 1000-maligem Drücken der Taste 4250 Low-Impulse und 2750 High-Impulse gesendet. Die Multiplikation dieser Werte ergibt 11687500.

Konsultieren Sie Ihre Modulkonfiguration; bestimmen Sie die Anzahl der Low-Impulse und High-Impulse, die nach 1000-maligem Drücken der Taste gesendet werden
würden, wobei nach jedem Tastendruck die vollständige Verarbeitung aller Impulse abgewartet wird. Was erhalten Sie, wenn Sie die Gesamtzahl der gesendeten
Low-Impulse mit der Gesamtzahl der gesendeten High-Impulse multiplizieren?




