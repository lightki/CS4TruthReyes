
package Q1EX04;

public class Song {
    private String name, genre;
    private int timesPlayed = 0;
    
    public void play(){
        timesPlayed = timesPlayed + 1; 
    } 
    
    public int getTimesPlayed(){
        return timesPlayed;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGenre(){
        return genre;
    }
   
    public Song (String n, String g){
        name = n;
        genre = g;
    }
}
