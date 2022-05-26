public class listProduk {
    private int harga;
    private String nama;

    public int getHarga(){
        return harga;
    }
    public String getNama(){
        return nama;
    }

    protected void setNama(String N){
        this.nama = N;
    }
    protected void setHarga(int H){
        this.harga = H;
    }

    protected void setMinuman(int switchMinuman){
        switch (switchMinuman) {
            case 1:
                this.setNama("Le Minerale");
                this.setHarga(2000);
                break;
            case 2:
                this.setNama("Sprite");
                this.setHarga(4500);
                break;
            case 3:
                this.setNama("Susu Bearbrand");
                this.setHarga(9000);
                break;
            case 4:
                this.setNama("Kopiko Latte");
                this.setHarga(7000);
                break;
            case 5:
                this.setNama("Nu Greentea");
                this.setHarga(5000);
                break;
            case 6:
                this.setNama("Teh Pucuk Harum");
                this.setHarga(2500);
                break;
            case 7:
                this.setNama("Pocari Sweat");
                this.setHarga(6000);
                break;
            case 8:
                this.setNama("Floridina");
                this.setHarga(5500);
                break;
            case 9:
                this.setNama("Ultra Susu UHT");
                this.setHarga(6500);
                break;
        }
    }

}