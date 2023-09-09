
package view;

import common.Library;
import Controller.program;
import Model.element;

public class main {
    public static void main(String[] args) {
        Library library = new Library();
        element element = new element();
        element.setSize(library.getInt("Enter number of array", 1, 100));
        element.setArray(library.CreateArray(element.size));
        new program(element).run();

    }
    
}
