package m3b2_Musikstücke;

/**
 * Musikalbum - ein Musikstück-array worin man ein Album von einen Künster speichern kann
 * (Src: https://elearning.tgm.ac.at/mod/resource/view.php?id=228593)
 *
 * @author Manuel Fellner
 * @version 2021-12-07
 */
public class Musikalbum {

    private String albumName;               //der Name des Albums
    private String albumInterpret;          //der Name des Interprets des Albums (also Ersteller)
    private Musikstueck[] musikstuecke;     ///Musikstücke Array, darin lassen sich mehrere Musikstueck-Objekte speichern

    /**
     * Konstruktor - Erstellt ein Musikalbum und setzt die "meta-daten" fest
     *
     * @param albumTitel, der Titel des Albums, String
     * @param albumInterpret, der Interpret, also Ersteller des Albums, String
     * @param anzahlMusikstuecke, anzahl der Musikstücke die in dem Album (Musikstuecke-Array) gespeichert werden, byte
     */
    public Musikalbum(String albumTitel, String albumInterpret, byte anzahlMusikstuecke)    {
        if (albumTitel != null && albumInterpret != null && anzahlMusikstuecke > 0) {
            this.albumName= albumTitel;
            this.albumInterpret = albumInterpret;
            this.musikstuecke = new Musikstueck[anzahlMusikstuecke];
        }
    }

    /**
     * setter-Methode für this.albumName
     *
     * @param albumName, der Name des Albums, String
     */
    public void setAlbumName(String albumName)  {
        if (albumName != null)  {
            this.albumName = albumName;
        }
    }

    /**
     * setter-Methode für this.albumInterpret
     *
     * @param albumInterpret, der Interpret (Ersteller) des Albums, String
     */
    public void setAlbumInterpret(String albumInterpret)    {
        if (albumInterpret != null) {
            this.albumInterpret = albumInterpret;
        }
    }

    /**
     * setter-Methode für die Anzahl der Musikstuecke, erstellt aber ein neues Array (!)
     *
     * @param musikstuecke, anzahl der Musikstuecke (Array-Elemente), byte
     */
    public void setAnzahllMusikstuecke(byte musikstuecke)  {
        if (musikstuecke > 0) {
            this.musikstuecke = new Musikstueck[musikstuecke];
        }
    }

    /**
     * getter-Methode für this.albumName
     *
     * @return this.albumName, String
     */
    public String getAlbumName()    {
        return this.albumName;
    }

    /**
     * getter-Methode für this.albumInterpret
     *
     * @return this.albumInterpret, String
     */
    public String getAlbumInterpret()   {
        return this.albumInterpret;
    }

    /**
     * getter-Methode für this.musikstuecke (ganzes Album)
     *
     * @return this.musikstuecke, Musikstueck-Array (Musikstueck[])
     */
    public Musikstueck[] getMusikstuecke()   {
        return this.musikstuecke;
    }

    /**
     * Platziert ein Musikstück-Objekt an der ersten freien Stelle im Array
     *
     * @param m, das zu platzierende Musikstueck-Objekt, Musikstueck
     * @return true -> wenn das platzieren erfolgreich war (es war noch ein platz frei)
     *         false -> wenn das platzieren nicht erfolgreich war (kein freier Platz)
     */
    public boolean addMusikstueck(Musikstueck m)   {
        for (int i = 0; i < this.musikstuecke.length; i++)  {
            if (this.musikstuecke[i] == null)   {
                this.musikstuecke[i] = m;
                return true;
            }
        }
        return false;
    }

    /**
     * addMusikstueck überladen, und dass man das Musikstück mit Parameter neu erstellen und hinzufügen kann
     *
     * @param titel, der Titel des Musikstücks, String
     * @param interpret, der Interpret (Ersteller) des Musikstücks, String
     * @param dauer, die dauer in sekunden, int
     */
    public boolean addMusikstueck(String titel, String interpret, int dauer)    {
        Musikstueck mNew = new Musikstueck();
        if (titel != null && interpret != null && dauer > 0) {
            mNew.setTitel(titel);
            mNew.setInterpret(interpret);
            mNew.setLaenge(dauer);
        }
        return this.addMusikstueck(mNew);
    }

    /**
     * rechnet die Gesamtdauer des Albums aus
     * @return die Gesamtdauer des Albums in mm:ss-Formatierung
     */
    public String zeigeDauer()  {
        Musikstueck mS = new Musikstueck();
        int gesamtDauer = 0;
        for (int i = 0; i < this.musikstuecke.length; i++)  {
            if (this.musikstuecke[i] != null) {
                gesamtDauer += this.musikstuecke[i].getLaenge();
            }
        }
        mS.setLaenge(gesamtDauer);
        return mS.zeigeDauer();
    }

    /**
     * Erstellt eine Liste von dem gesamtem musikstuecke-Array und gibt diese aus
     * @return album, liste der gesamten Musikstuecke-Array formatiert, String
     */
    public String listMusikstuecke()    {
        String album = "";
        album += "Album: " + this.albumName + " von " + this.albumInterpret + " mit einer Gesamtdauer von " + this.zeigeDauer();
        for (int i = 0; i < this.musikstuecke.length; i++)  {
            if (this.musikstuecke[i] != null) {
                album += "\n";
                album += (i + 1) + this.musikstuecke[i].zeigeDaten();
            }
        }
        return album;
    }

    /**
     * Entfernt ein Musikstück von einer bestimmtem stelle
     * @return true -> wenn der Wert vorher nicht == null war (das Löschen war sinnvoll) und
     *         false -> wenn der Wert vorher == null war, das löschen war sinnlos
     */
    public boolean removeMusikstueck(int nummertitel)   {
        if (this.musikstuecke[nummertitel] != null) {
            this.musikstuecke[nummertitel] = null;
            return true;
        }
        return false;
    }
}
