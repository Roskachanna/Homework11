public class Main {
    public static void main(String[] args) {
        leapYear(2023);

        clientDeviceYear(0,2023);
        clientDeviceYear(1,2014);


        int deliveryDays1 = delivery(15);
        int deliveryDays2 = delivery(77);
        System.out.println("Для растояния 15 км доставка займет " + deliveryDays1);
        System.out.println("Для растояния 77 км доставка займет "  + deliveryDays2);
    }


    public static void leapYear(int year){

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Год " + year + " являестся високосным.");
        }else {
            System.out.println("Год " + year + " является невисокосным");
        }

    }
    public static void clientDeviceYear(int clientsOS, int clientDeviseYear) {

        int clientDeviceYear = 0;
        if (clientsOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static int delivery(int distance) {

        int deliveryDays = 1;
        if (distance > 20 && distance < 60) {
            deliveryDays++;
        }
        if (distance > 60 && distance < 100) {
            deliveryDays++;
        }
        return deliveryDays;
    }

}