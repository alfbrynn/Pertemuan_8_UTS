/**
 * Windows
 */
public class Windows extends Pc{
    public String fitur;

    Windows(){

    }

    Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, ukuranMonitor);
        this.fitur = fitur;
    }

    public void tampilWindows(){
        super.tampilPc();
        System.out.println("Fitur : " + fitur);
    }
}