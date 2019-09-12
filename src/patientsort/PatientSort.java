/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientsort;

/**
 *
 * @title PatientSort.java
 * @author James Mitchell 92020474
 * @date 12/09/2019
 * 
 */

public class PatientSort {
    
    public static int parseCounter = 0;
    public static int swapCheckCounter = 0;
    
    public void doOptimisedBubbleSort(Patient arr[]) {
        int n = arr.length;
        int lastSwap = arr.length-1;
        for(int i=1; i<arr.length; i++) {
            parseCounter++;
            boolean is_sorted = true;
            int currentSwap = -1;
            
            for(int j=0; j < lastSwap; j++) {
                
                if (arr[j].getDept().compareTo(arr[j+1].getDept()) > 0)
                {
                    if (arr[j].getDays() > arr[j+1].getDays()) {
                        // swap temp and arr[i]
                        Patient temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swapCheckCounter++;
                    }
                }
            }
        }
    }
    
    /* Prints the array */
    void printArray(Patient arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i].getName() + " ");
        System.out.println();
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PatientSort patient = new PatientSort();
        Patient arr[] = {
            new Patient("Joe", 5, "Ortho"),
            new Patient("Jane", 3, "Paediatrics"),
            new Patient("Harry", 6, "Paediatrics"),
            new Patient("Keizer", 2, "Paediatrics"),
            new Patient("Keith", 1, "Ortho"),
            new Patient("Ben", 1, "Ortho"),
            new Patient("Sara", 5, "Paediatrics"),
        };
        
        System.out.println("The Unsorted array of students is");
        patient.printArray(arr);
        
        //apply sort
        patient.doOptimisedBubbleSort(arr);
        System.out.println("The Optimised Bubble Sorted array is");
        patient.printArray(arr);
        
        // parse counter
        System.out.println("The number of times the array was parsed was " + parseCounter);
        
        // swap check counter
        System.out.println("The number of compare operations was " + swapCheckCounter);
    }

}