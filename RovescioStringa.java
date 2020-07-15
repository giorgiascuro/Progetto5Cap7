public class RovescioStringa {
    public static String rovescioStringa(String stringa) {       
        int lunghezza = stringa.length();
        int ultimoIndice = lunghezza - 1;
        String stringaRisultato;
        if (lunghezza == 1) 
            stringaRisultato = stringa;     
        else
            stringaRisultato = rovescioStringa(stringa.substring(1)) + stringa.charAt(0);
        return stringaRisultato;
    }
}