
package ex01truthreyes;

public class Ex01TruthReyes {

    public static void main(String[] args) {
        String obj1 = "Clothing 1";
        String obj2 = "Clothing 2";
        String obj3 = "Clothing 3";
        
        char size1 = 'S';
        char size2 = 'M';
        char size3 = 'L';
        
        String color1 = "Black";
        String color2 = "Pink";
        String color3 = "Beige";
        
        int stocks1 = 23;
        int stocks2 = 71;
        int stocks3 = 12;
        
        boolean sizeCompare = (size1==size2);
        boolean colorCompare = (color1.compareTo(color3)==1);
        int totalStocks = (stocks1 + stocks2 + stocks3);
        
        System.out.printf( "%s %nSize: %c %nColor: %s %nNumber of stocks left: %d%n%n", obj1,size1,color1,stocks1 );
        System.out.printf( "%s %nSize: %c %nColor: %s %nNumber of stocks left: %d%n%n", obj2,size2,color2,stocks2 );
        System.out.printf( "%s %nSize: %c %nColor: %s %nNumber of stocks left: %d%n%n", obj3,size3,color3,stocks3 );
        
        System.out.printf("Is the sizes of Clothing 1 and 2 the same? %b %nIs the color of Clothing 1 the as the color of Clothing 3? %b %nWhat is the total stocks of all the three clothings? %d", sizeCompare, colorCompare, totalStocks);
    }
    
}
