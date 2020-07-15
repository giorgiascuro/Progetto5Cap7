public class VerificoSePalindroma {
    public static boolean verificoSePalindroma(String frase) {
        frase = SistemoStringa.sistemoStringa(frase);
        frase = TolgoSpazi.tolgoSpazi(frase);
        String fraseRovescia = RovescioStringa.rovescioStringa(frase);
        boolean èPalindroma;
        if (frase.equals(fraseRovescia))
            èPalindroma = true;            
        else
            èPalindroma = false;
        return èPalindroma;
    }
}
        