package com.work.u2i._4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    private final List<Character> ALPHABET = Arrays.asList(null, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');

    public String solution(int N, String S, String T) {
        //split coordinates of ships
        String[] coordinates = S.split(",");
        String[] shots = T.split(" ");
        int length = coordinates.length;

        ArrayList<ArrayList<String>> shipsPositions = new ArrayList<ArrayList<String>>();

        //split single coordinates, 1 row for one ship and in one row maximum of 4 coordinates
        for (int i = 0; i < length; i++) {
            shipsPositions.add(new ArrayList<String>(Arrays.asList(coordinates[i].split(" "))));
        }

        //add missing positions of ship or delete extra positions
        for (int i = 0; i < length; i++) {
            //check if ship size is == 1 and delete extra position of it
            if (shipsPositions.get(i).get(0).equals(shipsPositions.get(i).get(1))) {
                shipsPositions.get(i).remove(1);
                continue;
            }

            int numberStart, numberEnd, numberMiddle1, numberMiddle2, differenceNumber;
            int letterStart, letterEnd, letterMiddle1, letterMiddle2, differenceLetter;
            String s;

            numberStart = Integer.parseInt(Character.toString(shipsPositions.get(i).get(0).charAt(0)));
            numberEnd = Integer.parseInt(Character.toString(shipsPositions.get(i).get(1).charAt(0)));

            differenceNumber = numberEnd - numberStart;

            letterStart = ALPHABET.indexOf(shipsPositions.get(i).get(0).charAt(1));
            letterEnd = ALPHABET.indexOf(shipsPositions.get(i).get(1).charAt(1));

            differenceLetter = letterEnd - letterStart;

            if (differenceNumber == 2) {
                numberMiddle1 = ++numberStart;
                s = String.valueOf(numberMiddle1) + String.valueOf(ALPHABET.get(letterStart));
                shipsPositions.get(i).add(s);
                continue;
            } else if (differenceNumber == 3) {
                numberMiddle1 = ++numberStart;
                s = String.valueOf(numberMiddle1) + String.valueOf(ALPHABET.get(letterStart));
                shipsPositions.get(i).add(s);

                numberMiddle2 = ++numberMiddle1;
                s = String.valueOf(numberMiddle2) + String.valueOf(ALPHABET.get(letterStart));
                shipsPositions.get(i).add(s);
                continue;
            }

            if (differenceLetter == 2) {
                letterMiddle1 = ++letterStart;
                s = String.valueOf(numberStart) + String.valueOf(ALPHABET.get(letterMiddle1));
                shipsPositions.get(i).add(s);
                continue;
            } else if (differenceLetter == 3) {
                letterMiddle1 = ++letterStart;
                s = String.valueOf(numberStart) + String.valueOf(ALPHABET.get(letterMiddle1));
                shipsPositions.get(i).add(s);

                letterMiddle2 = ++letterMiddle1;
                s = String.valueOf(numberStart) + String.valueOf(ALPHABET.get(letterMiddle2));
                shipsPositions.get(i).add(s);
                continue;
            }

            //condition when ship is 2x2;
            if (differenceNumber == 1 && differenceLetter == 1) {
                letterMiddle1 = 1 + letterStart;
                letterMiddle2 = letterStart;

                numberMiddle1 = numberStart;
                numberMiddle2 = 1 + numberStart;

                s = String.valueOf(numberMiddle1) + String.valueOf(ALPHABET.get(letterMiddle1));
                shipsPositions.get(i).add(s);

                s = String.valueOf(numberMiddle2) + String.valueOf(ALPHABET.get(letterMiddle2));
                shipsPositions.get(i).add(s);
            }
        }

        int[] shipsSize = new int[length];

        for (int i = 0; i < length; i++) {
            shipsSize[i] = shipsPositions.get(i).size();
        }

        //compare shots with ships positions and delete ships positions that overlap with shots
        for (int i = 0; i < shots.length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < shipsPositions.get(j).size(); k++) {
                    if (shipsPositions.get(j).get(k).equals(shots[i])) {
                        shipsPositions.get(j).remove(k);
                    }
                }
            }
        }

        int shipsDestroyed = 0, shipsHit = 0;

        for (int i = 0; i < length; i++) {
            if (shipsSize[i] == shipsPositions.get(i).size())
                continue;
            if ((shipsSize[i]-shipsPositions.get(i).size()) == shipsSize[i]) {
                shipsDestroyed++;
                continue;
            }
            shipsHit++;
        }
        return shipsDestroyed + "," + shipsHit;
    }
}