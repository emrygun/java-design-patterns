package Singleton;

public class SingletonManipulator {
    public static void main(String[] args){
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        Thread firstThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                    firstSingleton.setValue(1);
                    System.out.println("Thread1:\nfirstSingleton Value: " + firstSingleton.getValue() +
                            " | secondSingleton Value: " + secondSingleton.getValue() + "\n");
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }); firstThread.start();

        Thread secondThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                    secondSingleton.setValue(2);
                    System.out.println("Thread2:\nfirstSingleton Value: " + firstSingleton.getValue() +
                            " | secondSingleton Value: " + secondSingleton.getValue() + "\n");
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }); secondThread.start();

    }
}
