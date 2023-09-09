/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import common.algorithm;
import common.Library;
import view.menu;
import Model.element;



public class program extends menu<String> {
    static String[] mc = {"LinearSearch", "BinarySearch", "Exit"};

    protected Library library;
    protected algorithm algorithm;
    protected int[] array;
    protected int size_array;
    
public program(element Element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new algorithm();
        size_array = Element.getSize();
        array = Element.getArray();
}
    
//    @Override
//    public void execute(int n) {
//        System.out.println("Unsorted array: ");
//        library.Display(array);
//        switch (n) {
//            case 1 -> {
//                algorithm.buddleSort(array);
//                System.out.println("\nSorted array by Buddle Sort: ");
//                Library.Display(array);
//                System.out.println("");
//            }
//            case 2 -> {
//                algorithm.quickSort(array, 0, size_array- 1);
//                System.out.println("\nSorted array by Quick Sort: ");
//                Library.Display(array);
//                System.out.println("");
//            }
//            case 3 -> System.exit(0);
//        }
//    }
//}
    @Override
 public synchronized void execute(int n) {
                algorithm.buddleSort(array);
                library.Display(array);
                int value = library.getInt("\nEnter number to find: ", 1, 100);
                switch (n) {
                    case 1:
                        System.out.println("Found value: " + value + "at index: " + algorithm.linearSearch(array, value));
                        break;
                    case 2:
                        System.out.println("Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
  }
