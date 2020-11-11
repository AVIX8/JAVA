import java.util.Scanner;

class App {

    public static void Pause(Scanner input) {
        System.out.print("\nPress Enter to continue . . . ");
        input.nextLine();
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("6) ������������������ ������ � �������� ��������;");
        int k = 10;
        Vector2 arr[] = new Vector2[k];
        for (int i = 0; i < k; i++) {
            arr[i] = new Vector2(Math.random() * 20 - 10, Math.random() * 20 - 10,
                    new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
        }

        for (int i = 0; i < k; i++) {
            System.out.printf("vector%d = %s\n", i, arr[i]);
        }

        Pause(input);

        System.out.println("7) ������������������ ������� �������������� �������� �� ������ ����� ��������������� �����;");

        Vector2 v7 = new Vector2(4,5,new Color(128,256,0));
        System.out.printf("RGB sum = %d", v7.color.getRGBSum());

        Pause(input);

        System.out.println("9) ������������������ ��������� ����� (String);");

        for (int i = 0; i < k; i++) {
            StringBuilder sb = new StringBuilder(arr[i].toString().split("\033")[0]).reverse();
            System.out.println(">" + arr[i].color.toString() + sb);
        }

        Pause(input);

        while (true) {
            Vector2 v1 = new Vector2();
            v1.read(input);
            v1.setColor(Color.red);
            System.out.print("v1 = ");
            v1.display();

            Vector2 v2 = new Vector2();
            v2.read(input);
            v2.setColor(Color.green);
            System.out.print("v2 = ");
            v2.display();

            System.out.printf("Angle between v1 and v2 = %.2f degrees\n", Vector2.angle(v1, v2));

            Vector2 sum = v1.add(v2);
            System.out.print("v1 + v2 = ");
            sum.setColor(Color.blue);
            sum.display();

            input.nextLine();
            Pause(input);
        }
    }
}