import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tugas_queue
{
    public static void main(String[] args) 
    {
        int i=0;
        Integer angka;
        boolean bool = true;

        Queue<Integer> antrian = new LinkedList<>(); //deklarasi queue
        Scanner pilih = new Scanner(System.in);

        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("Pembayaran Tagihan Air");
        System.out.println("---------------------------");
        System.out.println("");

        do
        {
            System.out.println("1. Masuk Antrian ");
            System.out.println("2. Ambil Antrian Awal ");
            System.out.println("3. Cek Antrian Awal ");
            System.out.println("4. Tampilan Data dalam Queue ");
            System.out.println("5. Jumlah Antrian ");
            System.out.println("6. Apakah Ada Data yang kosong ? ");
            System.out.println("7. Bersihkan Antrian ");
            System.out.println("8. Keluar");
            System.out.print("Masukkan Pilihan [1-8]: ");
            int input=pilih.nextInt();

            switch(input)
            {
            case 1:
            System.out.print("Banyak data yang akan dimasukkan : ");
            i=0;
            int h=pilih.nextInt();

            do
            {
            System.out.print("Masukan angka : ");
            angka=pilih.nextInt();
            antrian.add(angka);
            i++;
            }

            while(i<h);
            System.out.println("Antrian : "+antrian);
            System.out.println("");
            break;


            case 2:
                   System.out.println("Ambil Antrian Awal : "+antrian.poll());
                   System.out.println("");
                   break;

            case 3:
                    System.out.println("Cek Antrian Awal : "+antrian.peek());
                    System.out.println("");
                    break;

            case 4:
                    System.out.println("Tampilan Data dalam Queue : "+antrian);
                    System.out.println("");
                    break;

            case 5:
                    System.out.println("Jumlah Antrian : "+antrian.size());
                    System.out.println("");

            case 6:
                    System.out.println("Apakah Ada Data yang kosong?  "+ "\t" + antrian.isEmpty());
                    System.out.println("");
                    break;
                    
            case 7:
                    antrian.clear();

                    System.out.println("Bersihkan Antrian : "+antrian);
                    System.out.println("");
                    break;

            case 8:
                    System.exit(0);
                    break;
                
            default:
            System.err.println("Pilihan tidak tersedia!");
            System.out.println("");
            }
        }
        while(bool);
    }
}