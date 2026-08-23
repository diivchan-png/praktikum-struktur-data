import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> rakBuku = new Stack<>();
        
        System.out.println("=== PROSES PUSH (Memasukkan 8 Data) ===");
        int[] dataInput = {10, 20, 30, 40, 50, 60, 70, 80};
        
        for (int data : dataInput) {
            rakBuku.push(data);
            System.out.println("Push: " + data + " -> Stack saat ini: " + rakBuku);
        }
        
        System.out.println("\n=== KONDISI STACK SEBELUM POP ===");
        System.out.println("Isi Stack: " + rakBuku);
        System.out.println("Data teratas (Top): " + rakBuku.peek());
        
        System.out.println("\n=== PROSES POP (Mengambil Data Teratas) ===");
        int dataDihapus = rakBuku.pop();
        System.out.println("Pop berhasil! Data yang keluar: " + dataDihapus);
        
        int dataDihapusKedua = rakBuku.pop();
        System.out.println("Pop berhasil! Data yang keluar: " + dataDihapusKedua);
        
        System.out.println("\n=== KONDISI STACK SESUDAH POP ===");
        System.out.println("Isi Stack sisa: " + rakBuku);
        if (!rakBuku.isEmpty()) {
            System.out.println("Data teratas (Top) baru: " + rakBuku.peek());
        }
    }
}