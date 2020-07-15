public class SistemoStringa {
    public static String sistemoStringa(String stringa) {
        stringa = stringa.toLowerCase();
        int lunghezza = stringa.length();
        int ultimoIndice = lunghezza - 1;
        for (int indice = 0; indice <= ultimoIndice; indice++) {
            if (stringa.charAt(indice) == '.' || stringa.charAt(indice) == ',')
                stringa = stringa.replace(stringa.charAt(indice), ' ');
            }
        return stringa;
    }
}