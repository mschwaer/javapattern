package at.sma.pattern.pattern;

public class Singleton
{
    private static Singleton oSingletonInstance = new Singleton();
    /**
     * Default-Konstruktor, der nicht außerhalb dieser Klasse
     * aufgerufen werden kann
     */
    private Singleton()
    {
        // Dieser Konstruktor kann nicht verwendet werden
    }
    /**
     * Statische Methode, liefert die einzige Instanz dieser
     * Klasse zurück
     */
    public static Singleton getInstance()
    {
        return oSingletonInstance;
    }

    public static String writeText() {
        return "Oje";
    }
}
