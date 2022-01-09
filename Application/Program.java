package Application;
import java.util.Scanner;

import boardgame.Position;
public class Program {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Position Row");
        int row = sc.nextInt();
        System.out.println("Enter the Position Column");
        int column = sc.nextInt();
        Position pos = new Position(row,column);
        System.out.println(pos);
        sc.close();
    }
    
}
