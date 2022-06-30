package com.bridgelabz;

public class MyHashTableMain {
    public static void main(String[] args) {

        MyHashTable<String, Integer> hashTable = new MyHashTable();
        String paragraph = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] paragraphArray = paragraph.toLowerCase().split(" ");

        for (String word : paragraphArray) {
            Integer value = hashTable.get(word);


            if (value == null)
                value = 1;
            else
                value = value + 1;
            hashTable.add(word, value);
        }
        System.out.println(hashTable);
    }
}
