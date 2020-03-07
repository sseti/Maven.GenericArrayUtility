package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {
    T[] inputArray;

    public ArrayUtility(T[] inputArray) {

        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] array, T value) {
        Integer count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        for (int i = 0; i < this.inputArray.length; i++) {
            if (this.inputArray[i] == value) {
                count++;
            }

        }

        return count;
    }

    public T[] removeValue(T valueToRemove){


        Integer arraySize =0;
        for (int i = 0; i <inputArray.length ; i++) {
            if((inputArray[i]!=valueToRemove)){
                arraySize++;
            }

        }
        T[] answer;
        answer = Arrays.copyOf(inputArray, arraySize);
        Integer count =0;
        for (int i = 0; i <inputArray.length ; i++) {
            if(inputArray[i]!=valueToRemove){
                answer[count] = inputArray[i];
                count++;
            }

        }
        return  answer;
    }
}


