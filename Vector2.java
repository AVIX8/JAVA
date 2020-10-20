import java.util.Scanner;

class Vector2 {
    double x;
    double y;
    Color color;

    public Vector2() {
        this(0, 0);
    }

    public Vector2(double x, double y) {
        this(x, y, new Color(255,255,255));
    }

    public Vector2(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void init(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(Color _color) {
        this.color = _color;
    }

    public void read(Scanner input) {
        while (true) {
            System.out.print("Enter x and y: ");
            try {
                this.x = input.nextInt();
                this.y = input.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                input.nextLine();
                System.err.print("[!] You have entered incorrect data, please try again.\n");
            }
        }
    }

    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public String toString() {
        return String.format(
            "<Vector2 (x:%f, y:%f), length: %f, color: \033[48;2;%d;%d;%dm   \033[0m>",
            x, y, length(), color.r, color.g, color.b
        );
    }

    public void display() {
        System.out.println(this);
    }

    public double scalar(Vector2 otherVector) {
        return this.x * otherVector.x + this.y * otherVector.y;
    }

    public double angle(Vector2 otherVector) {
        double ang = Math.acos(this.scalar(otherVector) / this.length() / otherVector.length()) / Math.PI * 180;
        return Math.min(ang, 360 - ang);
    }

    public Vector2 add(Vector2 otherVector) {
        return new Vector2(this.x + otherVector.x, this.y + otherVector.y);
    }
}