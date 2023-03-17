public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
//        ... // У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит
//        на сайт с телефона, ему предлагается скачать приложение с учетом того, какая операционная
//        система у пользователя.
//Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение:
//Для iOS — «Установите версию приложения для iOS по ссылке».
//Для Android — «Установите версию приложения для Android по ссылке».
//Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).

        int clientOS = 1;

        switch (clientOS){
            case '0':
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
//        ... // Пишем код для задачи 2
    }
}