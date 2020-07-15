public class TolgoSpazi {
    public static String tolgoSpazi(String stringa) {       
        int lunghezza = stringa.length();
        int ultimoIndice = lunghezza - 1;        
        String stringaRisultato;
        if (lunghezza == 1 && stringa.charAt(0) != ' ') 
            stringaRisultato = stringa; 
        else if (lunghezza == 1 && stringa.charAt(0) == ' ')
            stringaRisultato = "";
        else if (lunghezza > 1 && stringa.charAt(0) == ' ')
            stringaRisultato = tolgoSpazi(stringa.substring(1));      
        else
            stringaRisultato = stringa.charAt(0) + tolgoSpazi(stringa.substring(1));
        return stringaRisultato;
    }
}
