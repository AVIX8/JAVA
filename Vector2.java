class Vector2 {
    int x;
    int y;
    Color color;

    public Vector2()
    {
        this(0, 0);
    }

    public Vector2(int x, int y)
    {
        this(x, y, new Color(255,255,255));
    }

    public Vector2(int x, int y, Color color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void Init(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double Length()
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public String toString() {
        return String.format(
            "<Vector2 (x:%d, y:%d), Length: %f, Color: \033[48;2;%d;%d;%dm   \033[0m>",
            x, y, Length(), color.r, color.g, color.b
        );
    }
}