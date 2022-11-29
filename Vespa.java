public class Vespa extends Kendaraan{
    private String nama,jenis,bersuara;
    Vespa(String nama,String jenis,String bersuara){
        super(nama,jenis,bersuara);
    }
    public void ShowHonda(){
        System.out.println("Nama Motor Honda:"+nama);
        System.out.println("Nama Motor Honda:"+jenis);
    }

    public void bersuara(){
        System.out.println("Ngeeeeeeng...Ngeeeeng...Ngeeeng");
    }
}
