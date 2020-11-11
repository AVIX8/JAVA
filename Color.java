class Color {
    public static final Color red = new Color(255,0,0);
    public static final Color green = new Color(0,255,0);
    public static final Color blue = new Color(0,0,255);

    private int r;
    private int g;
    private int b;

    public Color()
    {
        this.r = 255;
        this.g = 255;
        this.b = 255;
    }

    public Color(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getRGBSum() {
        return r+g+b;
    }
    
    public String toString(){
        return String.format("\033[48;2;%d;%d;%dm   \033[0m", r, g, b);
    }
}