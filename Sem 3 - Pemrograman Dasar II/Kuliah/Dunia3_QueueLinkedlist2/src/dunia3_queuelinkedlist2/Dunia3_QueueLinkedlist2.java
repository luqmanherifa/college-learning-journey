/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_queuelinkedlist2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kyrin
 */
public class Dunia3_QueueLinkedlist2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
		antrian.add("addin");
		antrian.add("jhonny");
		antrian.add("evan");
		antrian.add("david");
		antrian.add("jeremy");
		
		System.out.println("antrian pendaftaran peserta : "+antrian);
		
		String nama = antrian.remove();
		
		System.out.println("menghapus antrian atas nama : "+nama);
		System.out.println("daftar antrian baru : "+antrian);
		
		nama = antrian.poll();
		System.out.println("menghapus antrian : "+nama);
		System.out.println("daftar antrian baru : "+antrian);
	}
}