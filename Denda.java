public class Denda {
    private Peminjaman peminjaman;
    private int hariTerlambat;
    private int TARIF_DENDA = 10.000;

    public Denda(Peminjaman peminjaman, int hariTerlambat) throws Exception{

        if(peminjaman.getNamaPeminjaman() == null){
            throw new Exception("Nama peminjam tidak boleh null");
        }

        if(peminjaman.getKodePeminjaman() == null){
            throw new Exception("Kode peminjam tidak boleh null");
        }

        this.peminjaman = peminjaman;
        this.hariTerlambat = int;
        }

        public Peminjaman getPeminjaman(){
            return peminjaman;
        }

        public Tagihan getTagihan(){
            return int;
        }
    }