package com.example.CollectionInterface;

import java.util.HashMap;

public class HashCollisions {
//    Java uses arrays and then mostly uses hash map since this is faster than that of the arraylist
//    but in the hashmap there is generally chance of hash collisions and to prevent that java uses hash
//    some of the technique to prevent that since if the array size is mostly of 16(default)then if there is collision then before java8 there was solely the use of
//    linked list but after java 8 there has been some changes and now java also uses the tree specifically balanced bst
//    to handle the worst case scenario since the LL could get long and if there are more of it then it might create mess and the time it would take will be O(n) that is huge
//    now to prevent that there has been the use of balanced BST that uses this left< node < right thing but also orders it accordingly so it is not skewed
//    now java uses this Balanced BST instead of AVL since this balanced BST is now so tightly strict that is better and although this is slower than AVL it does more operations
//    in terms of the insertion and deletion.

    static void main(String[] args) {
    HashMap<Integer , String> hashMap  = new HashMap<>(10);
    hashMap.put(1,"bimarsha");
    hashMap.put(11,"bimarsha");
    hashMap.put(21,"bimarsha");
    hashMap.put(31,"bimarsha");
    hashMap.put(41,"bimarsha");
    hashMap.put(51,"bimarsha");
    hashMap.put(61,"bimarsha");
    hashMap.put(71,"bimarsha");
    hashMap.put(81,"bimarsha");
    hashMap.put(91,"bimarsha");
    hashMap.put(101,"bimarsha");

hashMap.forEach((key , value) ->{
    System.out.println("key : " + key + " value " + value);
});

    }


}
//the above one is contrieved example to understand the workflow of the hash collision but not a very good one
//since the no. i gave "10" it is not actually 10 java converts it to the ceiling value of 2 to the power of n so the capacity becomes 16 and also uses something like n-1 then the mathematics
// so there could be collision but it is not guaranteed .