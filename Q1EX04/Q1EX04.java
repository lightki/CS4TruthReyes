
package Q1EX04;

public class Q1EX04 {

    public static void main(String[] args) {
        
        Song song1 = new Song("505", "Alternative Rock");
        Song song2 = new Song ("Bad Romance", "Pop");
        
        Clothes outfit1 = new Clothes ('s', "White","Mermaid");
        Clothes outfit3 = new Clothes ('l', "black");
        
        Singer singer1 = new Singer("Nana", song1);
        Singer singer2 = new Singer("Jay", song2, singer1);
        
        singer1.changeFavSong(song2);
        singer1.buyOutfit(outfit3);
        
        singer2.performForAudience(singer2.getOtherSinger(), 100);
        singer2.buyOutfit(outfit1);
        
        singer2.performForAudience(20);
        singer1.performForAudience(12);

        System.out.printf("Let's give a round of applause for our singers for today, %s and %s "
                + "They'll perform their favorite song entitled %s %n", singer1.getName(), singer2.getName(), singer2.getFavoriteSong().getName());
        
        System.out.println("Total performances: " + singer1.getTotalPerformances());
        System.out.println("Earnings of " + singer1.getName() + ": P" + singer1.getEarnings());
        System.out.println("Earnings of " + singer2.getName() + ": P" + singer2.getEarnings());
    }
}
