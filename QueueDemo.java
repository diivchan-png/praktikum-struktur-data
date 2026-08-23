import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> antrean = new LinkedList<>();

        System.out.println("=== PROSES ENQUEUE (Menambahkan Data) ===");
        int[] dataBaru = {15, 23, 42, 8, 16, 4, 99, 71};
        
        for (int data : dataBaru) {
            antrean.add(data);
            System.out.println("Enqueue: " + data + " -> Isi Queue saat ini: " + antrean);
        }

        System.out.println("\n------------------------------------------------");
        System.out.println("Isi Queue SEBELUM Dequeue: " + antrean);
        System.out.println("------------------------------------------------\n");

        System.out.println("=== PROSES DEQUEUE (Menghapus Data) ===");
        for (int i = 1; i <= 3; i++) {
            Integer dataKeluar = antrean.poll(); 
            System.out.println("Dequeue ke-" + i + ": " + dataKeluar + " keluar.");
            System.out.println("Isi Queue saat ini: " + antrean);
        }

        System.out.println("\n------------------------------------------------");
        System.out.println("Isi Queue SESUDAH Dequeue: " + antrean);
        System.out.println("------------------------------------------------");
    }
}