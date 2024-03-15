public class Programa1 extends Thread {
    
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " : ASubproceso corriendo...");
    }

    public static void main(String[] args){
        Programa1 hilo = new Programa1();
        hilo.start();
        System.out.println("Este codigo esta fuera del hilo");
    }
}