package org.esurovskiy;

import java.io.File;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                System.out.println("Bye!");
                System.exit(0);
            }
            try {
                String[] split = command.split(" ");
                command = split[0];
                String parameters = split[1];
                switch (command) {
                    case "mkdir":
                        File file = new File(parameters);
                        if (file.mkdir()) {
                            System.out.println("Создан каталог " + file);
                        } else {
                            System.out.println("Ошибка создания каталога " + file);
                        }
                        break;
                    default:
                        System.out.println("Неизвестная команда");
                }
            } catch (Exception e) {
                System.out.println("Ошибка. Повторите ввод команды.");
            }
        }
    }
}
