package myproject.arrays;

import java.util.Random;

public class Scenary {
    public static void main(String[] args) {
        // Inițializarea cu o capacitate de 5 elemente
        MyArrayList myList = new MyArrayList(5);

        // Inserarea a 10 elemente aleatoare utilizând metoda add
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            float randomValue = random.nextFloat() * 100; // Generăm o valoare aleatoare între 0 și 100
            myList.add(randomValue);
        }

        // Căutarea a 5 valori aleatoare în vector
        for (int i = 0; i < 5; i++) {
            float randomValue = random.nextFloat() * 100; // Generăm o valoare aleatoare între 0 și 100
            if (myList.contains(randomValue)) {
                System.out.println("Valoarea " + randomValue + " există în vector.");
            } else {
                System.out.println("Valoarea " + randomValue + " nu există în vector.");
            }
        }

        // Eliminarea a 5 valori aleatoare din vector
        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(myList.size()); // Generăm un index aleator între 0 și dimensiunea actuală a listei
            float removedValue = myList.get(randomIndex); // Obținem valoarea de pe poziția aleatoare
            myList.remove(randomIndex); // Eliminăm valoarea de pe poziția aleatoare
            System.out.println("Valoarea " + removedValue + " a fost eliminată din vector.");
        }

        // Afișarea vectorului după eliminare
        System.out.println("Vectorul după eliminare: " + myList);
    }
}
