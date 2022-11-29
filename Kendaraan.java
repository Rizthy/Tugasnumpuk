public class Kendaraan {
    String nama,jenis,bersuara;
    Kendaraan(String nama,String jenis,String bersuara){
        this.nama=nama;
        this.jenis=jenis;
        this.bersuara=bersuara;
    }

    public String toString() {
        return "Tipe motor ini adalah"+jenis+
                "\nNama Motor:"+nama+"\nSuara motornya cocok untuk sunmori:"+""+bersuara;
    }

    public void bersuara(){

    }
}
