package com.work.u2i._4;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //N - rozmiar boku kwadratu
        //N = [1..26]
        //(1; N)
        int N = 4;

        //pozycje statkow - statki nie sa wieksze niz 4 komorki, czyli pewnie 2x2 lub 1x4 max
        //1B i 2C to lewy gory rog statku i prawy dolny rog statku
        //2D i 4D to gora i dol statku (?!)
        String S = "1B 2C,2D 4D";

        //strzaly (niekoniecznie celne)
        String T = "2B 2D 3D 4D 4A";

        // "1, 1"
        // pierwsza wartosc - ilosc zatopionych statkow
        // druga wartosc - ilosc trafien
        System.out.println("Test 1: " + solution.solution(N, S, T));

        //*********************************************************

        N = 3;
        S = "1A 1B,2C 4C";
        T = "1B";

        //"0, 1" - 1 trafiony, niezatopiony
        System.out.println("Test 2: " + solution.solution(N, S, T));

        //*********************************************************

        N = 12;
        S = "1A 2A,12A 12A";
        T = "12A";

        //"1, 0" - 1 zatopiony
        System.out.println("Test 3: " + solution.solution(N, S, T));

        //*********************************************************

        N = 26;
        S = "2B 5B,22B 22E,12D 13E,4G 4G,16F 17F,11H 11I,23H 23H,4K 4M,16L 19L";
        T = "4B 4C 5B 5C 21B 21C 22B 22C 13C 13D 13E 13F 7K 7L 7M 16I 23H";

        //"1, 3" - 1 zatopiony
        System.out.println("Test 4: " + solution.solution(N, S, T));
    }
}