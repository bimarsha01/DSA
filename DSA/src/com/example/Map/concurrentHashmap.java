package com.example.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmap {
    static void main(String[] args) {
        ConcurrentHashMap<String , Integer> concurrentHashMap = new ConcurrentHashMap<>();
// how does this work ? it works on the segment based locking like 16 segments and smaller hashmap are created.
//        only the particular segment is locked like the one where we read or write
//        there is no requirement in the read operation unless we are doing the write operation on the same segment.
//        and later in the java 8 the segmentation is removed completely.
//        it uses compare and swap approaches and ther is no locking and except there is resizing or collision
//        compare and swap approach: thread 1 --> x = 42 ,
//        thread a work --> x to 50
//        if x is still 42 then change it to 50 else don't change and retry
//        map ---> sorted and thread safe
    }
}