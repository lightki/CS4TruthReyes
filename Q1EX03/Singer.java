
package q1ex03;

public class Singer {
    private String name;
    private int noOfPerformances = 0;
    private double earnings = 0;
    private Song favoriteSong;
    private Clothes outfit;
    private static int totalPerformances = 0;
    private Singer otherSinger;
      
    public String getName(){
        return name;
    }
    
    public int getNoOfPerformances(){
        return noOfPerformances;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public Song getFavoriteSong(){
        return favoriteSong;
    }
    
    public Clothes getOutfit(){
        return outfit;
    }
    
    public Singer getOtherSinger(){
        return otherSinger;
    }
    
    public int getTotalPerformances(){
        return totalPerformances;
    }
  
    public Clothes buyOutfit (Clothes noutfit){   // n = new
        outfit = noutfit;
        return outfit;
    }
    
    public Song changeFavSong(Song nsong){
        favoriteSong = nsong;
        return favoriteSong;
    }
    
    public Singer (String n, Song s,Singer o){
        name = n;
        favoriteSong = s;
        otherSinger = o;
    }
    
    public Singer (String n, Song s){
        name = n;
        favoriteSong = s;
    }
    
    public void performForAudience (Singer a, int n){
        this.noOfPerformances ++;
        a.noOfPerformances ++;
        
        totalPerformances += noOfPerformances;
        
        this.earnings = (this.earnings) + (n*100)/2;
        a.earnings = (a.earnings) + (n*100)/2;
        
    }
    
    public void performForAudience (int n){
        noOfPerformances ++;
        totalPerformances += noOfPerformances;
        earnings = earnings + (n*100);
        
    }
}
