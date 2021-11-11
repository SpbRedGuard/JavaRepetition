package Multithreading;

    // VOLATILE работает только тогда, когда только 1 поток изменяет данные (пишет), а другие потоки только читают.
    public class Ex1 extends Thread {

    volatile boolean b = true; // с помощью volatile переменная помещается в MAIN MEMORY  другой поток может прочитать её мгновенно, миную КЭШ m emory

    public void run () {
        long counter = 0;
        while (b) {
            counter ++;
        }
        System.out.println("Цикл завершен, counter = " + counter);


    }

        public static void main(String[] args) throws InterruptedException {

            Ex1 thread = new Ex1();
            thread.setName("Поток-1");
            thread.start();
            System.out.println("запущен поток - " + thread.getName());
            Thread.sleep(3000); // MAIN поток спит 3 секунды
            System.out.println("После 3 секунд пора просыпаться");
            thread.b = false;
            thread.join(); // MAIN поток дождался окончания потока Ex1
            System.out.println("Конец программы");
        }
}

