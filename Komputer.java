class Komputer{
    public String merk;
    public int kecProsesor, sizeMemory;
    public String jnsProsesor;

    Komputer(){

    }

    Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData(){
        System.out.println("Merk\t: "+merk);
        System.out.println("Kecepatan Prosesor\t: "+kecProsesor+" Ghz");
        System.out.println("Size Memory\t: "+sizeMemory+" GB");
        System.out.println("Jenis Prosesor\t: "+jnsProsesor);
    }
}