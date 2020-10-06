import java.util.Scanner;

class main {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        while (true) {
            Vector2 v1 = new Vector2();
            v1.read(input);
            v1.setColor(new Color(255, 255, 0));
            System.out.print("v1 = ");
            v1.display();

            Vector2 v2 = new Vector2();
            v2.read(input);
            v2.setColor(new Color(0, 255, 255));
            System.out.print("v2 = ");
            v2.display();

            System.out.println(
                String.format("Angle between v1 and v2 = %.2f degrees", v1.angle(v2))
            );

            Vector2 sum = v1.add(v2);
            System.out.print("v1 + v2 = ");
            sum.setColor(new Color(255, 0, 255));
            sum.display();
            
            
            System.out.print("\nPress any key to continue . . . ");
            input.nextLine();
            input.nextLine();
            System.out.print("\033[H\033[2J");  
            System.out.flush();
        }
    }

}