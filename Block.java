 class Config{
    static String appName;
    static{
        appName="myapp";
        System.out.println("static block executed...");

    }
    
}
public class Block{
    public static void main(String[] args) {
        System.out.println(Config.appName);
        
    }
}
