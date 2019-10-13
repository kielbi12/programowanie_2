package day2;

public class PESELValidator {


//    Rozważmy PESEL osoby urodzonej 8 lipca 1902 roku, płci żeńskiej (parzysta końcówka numeru z serii – 0362). Czyli mamy wówczas 0207080362.
//    Teraz kolejne cyfry należy przemnożyć przez odpowiednie wagi i dodać do siebie.
//    0*1 + 2*3 + 0*7 + 7*9 + 0*1 + 8*3 + 0*7 + 3*9 + 6*1 + 2*3 = 0 + 6 + 0 + 63 + 0 + 24 + 0 + 27 + 6 + 6 = 132
//    Wynik dzielimy modulo przez 10.
//            132 mod 10 = 2
//    A następnie odejmujemy od 10
//            10 - 2 = 8.
//    I wynik dzielimy znów modulo 10
//            8 mod 10 = 8
//    Cyfra kontrolna to 8, zatem nasz prawidłowy numer PESEL to: 02070803628

    public boolean validate(String pesel) {
        if (pesel == null) {
            return false;
        }
        if (pesel.length() != 11) {
            return false;
        }
        char[] tabTmp = pesel.toCharArray();
        int[] intTab = new int[tabTmp.length];
        try {
            for (int i = 0; i < tabTmp.length; i++) {
                intTab[i] = Integer.valueOf(String.valueOf(tabTmp[i]));
            }
        }
        catch(NumberFormatException e){
            return false;
        }

        int score = intTab[0] * 1 + intTab[1] * 3 + intTab[2] * 7 + intTab[3] * 9
                + intTab[4] * 1 + intTab[5] * 3 + intTab[6] * 7 + intTab[7] * 9
                + intTab[8] * 1 + intTab[9] * 3;

        score = score % 10;
        score = 10 - score;
        score = score & 10;

        return score == intTab[10];
    }


}
