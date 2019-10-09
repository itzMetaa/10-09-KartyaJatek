
package pakli;


public class Kartya {
    private KartyaSzin szin;
    private KartyaErtek ertek;
    public Kartya(KartyaSzin szin, KartyaErtek ertek){
        this.szin = szin;
        this.ertek = ertek;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s", this.szin, this.ertek);
    }
}
