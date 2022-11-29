import java.util.Random;

public class polymorfisme {
    public static void main(String[]args){
        Kendaraan[] motornya={
                new Honda("Pcx","Pcx 160cc cbs","Mbrr...Mbrr...Mbrr.."),
                new Kawasaki("KLX","Kawasaki KLX 250","Brem...Brem...Breemmmm"),
                new Vespa("Vespa Matic","Vespa Matic S 150cc","Ngeeeeeeng...Ngeeeeng...Ngeeeng")
        };
        Kendaraan pilihKendaraan;
        Random pilih = new Random();
        for (int i =0;1<2;i++){
            pilihKendaraan=
                    motornya[pilih.nextInt(motornya.length)];
            System.out.println("\nPilihan Anda: \n"+pilihKendaraan);
        }
    }
}
