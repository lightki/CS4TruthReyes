
package Q1EX04;

public class Clothes {
    private char size;
    private String color;
    private String type;
    private int price;
    
    public Clothes (char s, String c, String t){
        size = s;
        color = c;
        type = t;
        price = 5000;
    }
    
    public Clothes (char s, String c){
        size = s;
        color = c;
        type = "Gown";
        price = 4500;
    }
    public Clothes (char s){
        size = s;
        color = "Red";
        type = "Gown";
        price = 3500;
        
    }
    public char getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public int getPrice(){
        return price;
    }
}
