public class App {
public static void main(String[] args) {
    //comentario inserido na branch main
    System.out.println("\nHello world!");
    String version = System.getProperty("java.version");
    System.out.println("Running Java Version: "+version+"\n");
    String name = System.getProperty("user.name");
    System.out.println("User account name: "+name+"\n");
    String currDir = System.getProperty("user.dir");
    String versaoOs = System.getProperty("os.version");
    String dirHome = System.getProperty("user.home");
    System.out.println("diretorio atual do usuário: "+currDir);
    System.out.println("diretorio home do usuário: "+dirHome);
    System.out.println("versão do OS: "+versaoOs);
    }
}