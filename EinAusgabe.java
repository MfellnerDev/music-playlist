package m3b2_Musikstücke;

/**
 * EinAusgabe - Test-Klasse für Musikstueck.java und Musikalbum (siehe UML)
 * @author Manuel Fellner
 * @version 2021-12-07
 */
public class EinAusgabe {
    public static void main(String[]args)   {
        System.out.println("Test: Klasse Musikstueck.java");
        System.out.println("------------------------------------");
        /* Test-Objekt 1*/
        Musikstueck test1 = new Musikstueck();
        test1.setTitel("In meinem Benz");
        test1.setInterpret("AK AUSSERKONTROLLE, Bonez MC");
        test1.setLaenge(146);

        /* Test-Obbjekt 2*/
        Musikstueck test2 = new Musikstueck();
        test2.setTitel("Yummy");
        test2.setInterpret("Money Boy");
        test2.setLaenge(196);

        /* Test-Objekt 3*/
        Musikstueck test3 = new Musikstueck();
        test3.setTitel("Ferrari");
        test3.setInterpret("Yung Hurn");
        test3.setLaenge(201);

        System.out.println(" Test: getter-Methoden: ");

        System.out.println(" Objekt test1: ");
        System.out.println(" getTitel() : ");
        System.out.println(test1.getTitel());
        System.out.println(" getInterpret() : ");
        System.out.println(test1.getInterpret());
        System.out.println(" getLaenge() : ");
        System.out.println(test1.getLaenge());

        System.out.println(" Objekt test2: ");
        System.out.println(" getTitel() : ");
        System.out.println(test2.getTitel());
        System.out.println(" getInterpret() : ");
        System.out.println(test2.getInterpret());
        System.out.println(" getLaenge() : ");
        System.out.println(test2.getLaenge());

        System.out.println(" Objekt test3: ");
        System.out.println(" getTitel() : ");
        System.out.println(test3.getTitel());
        System.out.println(" getInterpret() : ");
        System.out.println(test3.getInterpret());
        System.out.println(" getLaenge() : ");
        System.out.println(test3.getLaenge());
        System.out.println("------------------------------------");

        System.out.println("------------------------------------");
        System.out.println(" Test: Methode: zeigeDaten()");
        System.out.println(test1.zeigeDaten());
        System.out.println(test2.zeigeDaten());
        System.out.println(test3.zeigeDaten());
        System.out.println("------------------------------------");


        System.out.println("------------------------------------");
        System.out.println("Test: Klasse Musikalbum.java ");
        /* Test-Objekt-Array mAlbum wird erstellt und mit ein paar Attributen ausgestattet */
        byte laenge = 3;
        Musikalbum mAlbum = new Musikalbum("Schepper-Lieder", "Manu", laenge);

        mAlbum.addMusikstueck(test1);
        mAlbum.addMusikstueck(test2);
        mAlbum.addMusikstueck(test3);

        System.out.println(" Objekt-Array mAlbum: ");
        System.out.println(" getAlbumName() : ");
        System.out.println(mAlbum.getAlbumName());
        System.out.println(" getInterpret() : ");
        System.out.println(mAlbum.getAlbumInterpret());

        System.out.println("------------------------------------");
        System.out.println(" Test: Methode: listeMusikstuecke()");
        System.out.println(mAlbum.listMusikstuecke());
        System.out.println("------------------------------------");

        System.out.println("------------------------------------");

    }
}
