class Laptop extends Komputer{
    public String jnsBatrei;

    Laptop(){

    }

    Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Batrei : " + this.jnsBatrei);
    }
}