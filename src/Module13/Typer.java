package Module13;

class Typer extends Thread {
    private String mes;
    public Typer(String mes) {
        this.mes = mes;
    }

    @Override
    public synchronized void run() {
           /* for (int x = 0; x < mes.length(); x++) {
                System.out.print(mes.charAt(x));
            }*/
        try {
            printer(mes);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static synchronized void printer(String mes) throws InterruptedException {
        for (int x = 0; x < mes.length(); x++) {
            System.out.print(mes.charAt(x));
            Thread.sleep(500);
            Thread.interrupted();
        }
    }
}
