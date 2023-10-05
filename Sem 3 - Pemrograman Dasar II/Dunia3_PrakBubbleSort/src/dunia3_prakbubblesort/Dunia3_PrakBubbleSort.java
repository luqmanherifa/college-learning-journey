/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_prakbubblesort;

/**
 *
 * @author Kyrin
 */
public class Dunia3_PrakBubbleSort {

    void bubblesort(int a[]) {
        int n = a.length;
        for(int i=0; i<n-1; i++)
            for(int j=0; j<n-i-1; j++)
                if(a[j]> a[j+1]) {
                    int b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }
    }
    
    void printarray(int a[]) {
        int n = a.length;
        for (int i=0; i<n; ++i)
            System.out.println(a[i]+"");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Dunia3_PrakBubbleSort c = new Dunia3_PrakBubbleSort();
        int a[] = {20, 50, 30, 10, 70, 60, 90};
        c.bubblesort(a);
        System.out.println("Mengurutkan Array");
        c.printarray(a);
    }
}