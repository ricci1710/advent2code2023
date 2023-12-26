**--- Tag 25: Schneelast ---**

Immer noch irgendwie ohne Schnee, gehst du zum letzten Ort, den du nicht überprüft hast: das Zentrum der Schneeinsel, direkt unter dem Wasserfall.

Hier hat offensichtlich jemand versucht, das Problem zu lösen. Überall liegen Hunderte von Wettermaschinen, Almanachen, Kommunikationsmodulen, Hufabdrücken,
Maschinenteilen, Spiegeln, Linsen und so weiter verstreut.

Irgendwie wurde alles zu einem riesigen Schneeproduktionsapparat verkabelt, aber nichts scheint zu funktionieren. Du überprüfst einen winzigen Bildschirm an
einem der Kommunikationsmodule: Fehler 2023. Es steht nicht drauf, was Fehler 2023 bedeutet, aber es ist die Telefonnummer einer Support-Hotline aufgedruckt.

"Hallo, Sie haben Weather Machines And So On, Inc. erreicht. Wie kann ich Ihnen helfen?" Sie erklären die Situation.

"Fehler 2023, sagen Sie? Das ist natürlich ein Überlastungsfehler! Es bedeutet, dass Sie zu viele Komponenten angeschlossen haben. Versuchen Sie, einige
Komponenten abzustecken und..." Sie erklären, dass es hier Hunderte von Bauteilen gibt und Sie es etwas eilig haben.

"Sehen wir mal, wie schlimm es ist. Sehen Sie irgendwo einen großen roten Reset-Knopf? Er sollte sich auf einem eigenen Modul befinden. Wenn du ihn drückst,
wird wahrscheinlich nichts repariert, aber er zeigt an, wie überlastet alles ist." Nach ein oder zwei Minuten finden Sie den Reset-Knopf; er ist so groß, dass
Sie zwei Hände brauchen, um ihn zu drücken. Der Bildschirm zeigt dann an:

SYSTEM ÜBERLASTET!

Die angeschlossenen Komponenten würden
Leistung von mindestens 100 Sternen!

"Moment, wie viele Komponenten sind denn angeschlossen? Mit so vielen Geräten könnte man Schnee für eine ganze..." Sie unterbrechen das Gespräch.

Sie haben nicht annähernd so viele Sterne - Sie müssen einen Weg finden, mindestens die Hälfte der Geräte hier abzustecken, aber es ist bereits Weihnachten! Du
hast nur noch Zeit, drei Drähte abzuschalten.

Zum Glück hat jemand einen Schaltplan hinterlassen (dein Rätselbild), der zeigt, wie die Komponenten angeschlossen sind. Zum Beispiel:

```
jqt: rhn xhk nvd
rsh: frs pzl lsr
xhk: hfx
cmg: qnr nvd lhk bvb
rhn: xhk bvb hfx
bvb: xhk hfx
pzl: lsr hfx nvd
qnr: nvd
ntq: jqt hfx bvb xhk
nvd: lhk
lsr: lhk
rzs: qnr cmg lsr rsh
frs: qnr lhk lsr
```

Jede Zeile enthält den Namen einer Komponente, einen Doppelpunkt und dann eine Liste der anderen Komponenten, mit denen diese Komponente verbunden ist. Die
Verbindungen sind nicht richtungsabhängig; abc: xyz und xyz: abc stellen beide dieselbe Konfiguration dar. Jede Verbindung zwischen zwei Komponenten wird nur
einmal dargestellt, so dass einige Komponenten möglicherweise nur auf der linken oder rechten Seite eines Doppelpunkts erscheinen.

Wenn Sie in diesem Beispiel die Verbindung zwischen hfx/pzl, die Verbindung zwischen bvb/cmg und die Verbindung zwischen nvd/jqt trennen, teilen Sie die
Komponenten in zwei separate, getrennte Gruppen auf:

- 9 Bauteile: cmg, frs, lhk, lsr, nvd, pzl, qnr, rsh, und rzs.
- 6 Komponenten: bvb, hfx, jqt, ntq, rhn, und xhk.

Multipliziert man die Größen dieser Gruppen miteinander, erhält man **54**.

Finden Sie die drei Drähte, die Sie abtrennen müssen, um die Komponenten in zwei separate Gruppen aufzuteilen. Was erhalten Sie, wenn Sie die Größen dieser
beiden Gruppen miteinander multiplizieren?

