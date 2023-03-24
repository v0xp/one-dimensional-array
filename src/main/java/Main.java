import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] products = {
                "Хлеб",
                "Сок",
                "Молоко",
                "Картофель",
                "Яблоки"
        };
        int[] prices = {50, 70, 80, 60, 90};


        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i] + " руб/за ед.");
        }
        Scanner scanner = new Scanner(System.in);

        int[] countProducts = new int[5];//хранится выбранное кол-во товара
        int sumProduct = 0;

        while (true) {
            System.out.println("Выберите товар и количество или введите end");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");//метод split делим строку на части
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);

            countProducts[productNumber] += productCount;
        }
        System.out.println("№ " + " Наименование товара " + " Цена/за ед. " + " Количество " + " Общая стомость");
        int p = 0;
        for (int i = 0; i < countProducts.length; i++) {
            if (countProducts[i] != 0) {
                p++;
                sumProduct += (countProducts[i] * prices[i]);
                System.out.println(p + ".   " + products[i] + "                  " + prices[i] + "    " + "      "
                        + countProducts[i] + "              " + (countProducts[i] * prices[i]));
            }
        }
        System.out.println("Всего за покупку: " + sumProduct);
    }
}

