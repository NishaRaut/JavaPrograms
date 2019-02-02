package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		String[] names= {"nisha","sapna","jyotsna","shraddha","pihu","priyanka","sweety","maithli","veena"};
	Utility.MergeSort(names);
	for (String ClassThree : names) {
        System.out.println(ClassThree);
    }
	}

}
