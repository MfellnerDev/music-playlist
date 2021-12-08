package m3b2_Musikstücke;

import java.time.Duration;

/**
 * SEW 3b2.2 - soll ein Musikstück mit Beschreibenden Attributen wie Titel, Interpret (Ersteller) und Länge
 * erstellen, diese Klasse wird in der Klasse Musikalbum verwendet
 *
 * @author Manuel Fellner
 * @version 2021-12-07
 */
public class Musikstueck {
    private String titel;           //titel des Musikstücks
    private String interpret;       //interpret / Ersteller des Musikstücks
    private int laenge;             //länge des Musikstücks in sekunden

    /**
     * Konstruktor - Setzt alle werde mal auf 0 (nicht null!)
     */
    public Musikstueck() {
        this.titel = "";
        this.interpret = "";
        this.laenge = 0;
    }

    /**
     * Formatiert die Dauer des Musikstücks (Sekunden) im mm:ss Format, dies geschieht mit der
     * sehr praktischen Klasse Duration (Src: https://www.baeldung.com/java-period-duration)
     *
     * @return String, alles richtig formatiert
     */
    public String zeigeDauer() {
        /* Erstellt ein neues Duration-Objekt und weist den Wert laenge in Sekunden zu  */
        Duration dauer = Duration.ofSeconds(laenge);
        /* 2x long, mm -> Minuten, ss - > sekunden, formatierung der Werte*/
        long mm = dauer.toMinutesPart();
        long ss = dauer.toSecondsPart();

        return String.format("%02d:%02d", mm, ss);
    }

    /**
     * setter-Methode für this.titel, der titel darf nicht null sein.
     *
     * @param titel, der Titel des Liedes
     */
    public void setTitel(String titel) {
        if (titel != null) {
            this.titel = titel;
        }
    }

    /**
     * setter-Methode für this.interpret, der Interpret darf nicht null sein.
     *
     * @param interpret, der Interpret (also Ersteller des Liedes)
     */
    public void setInterpret(String interpret) {
        if (interpret != null) {
            this.interpret = interpret;
        }
    }

    /**
     * setter-Methode für this.laenge, die Länge des Liedes darf nicht kleiner als 0 sein
     *
     * @param laenge, die Länge des Liedes in sekunden
     */
    public void setLaenge(int laenge) {
        if (laenge > 0) {
            this.laenge = laenge;
        }
    }

    /**
     * getter-Methode für this.titel
     *
     * @return this.titel (String)
     */
    public String getTitel() {
        return this.titel;
    }

    /**
     * getter-Methode für this.interpret
     *
     * @return this.interpret (String)
     */
    public String getInterpret() {
        return this.interpret;
    }

    /**
     * getter-Methode für this.laenge
     *
     * @return this.laenge in Sekunden (int)
     */
    public int getLaenge() {
        return this.laenge;
    }

    /**
     * zeigeDaten - Zeigt das momentane Musikstück geordnet an
     *
     * @return String, das momentane Musikstück geordnet
     */
    public String zeigeDaten() {
        return "\"" + titel + "\"" + " von " + "\"" + interpret + "\"" + " (" + this.zeigeDauer() + ")";
    }

}
