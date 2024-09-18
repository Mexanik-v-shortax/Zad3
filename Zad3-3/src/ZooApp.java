import java.util.ArrayList;
import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Зоопарка:");
            System.out.println("1. Показать список всех животных");
            System.out.println("2. Добавить животное");
            System.out.println("3. Удалить животное");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить наличие животного");
            System.out.println("6. Выход");
            System.out.print("Введите номер команды: ");

            int command = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер ввода

            switch (command) {
                case 1:
                    printAnimals(animals);
                    break;
                case 2:
                    addAnimal(animals, scanner);
                    break;
                case 3:
                    removeAnimal(animals);
                    break;
                case 4:
                    clearAnimals(animals);
                    break;
                case 5:
                    checkAnimal(animals, scanner);
                    break;
                case 6:
                    System.out.println("До свидания!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Некорректная команда.");
            }
        }
    }

    private static void removeAnimal(ArrayList<String> animals) {
    }

    static void printAnimals(ArrayList<String> animals) {
        if (animals.isEmpty()) {
            System.out.println("В зоопарке пока нет животных.");
        } else {
            System.out.println("Список животных в зоопарке:");
            for (String animal : animals) {
                System.out.println(animal);
            }
        }
    }

    static void addAnimal(ArrayList<String> animals, Scanner scanner) {
        System.out.print("Введите название животного: ");
        String animalName = scanner.nextLine();
        animals.add(animalName);
        System.out.println("Животное " + animalName + " добавлено в список.");
    }

    static void removeAnimal(ArrayList<String> animals, Scanner scanner) {
        if (!animals.isEmpty()) {
            System.out.print("Введите название животного для удаления: ");
            String animalName = scanner.nextLine(); // Читаем строку, чтобы избежать ошибки
            if (animals.remove(animalName)) {
                System.out.println("Животное " + animalName + " удалено из списка.");
            } else {
                System.out.println("Такого животного нет в списке.");
            }
        } else {
            System.out.println("Список животных пуст.");
        }
    }

    static void clearAnimals(ArrayList<String> animals) {
        if (!animals.isEmpty()) {
            animals.clear();
            System.out.println("Список животных очищен.");
        } else {
            System.out.println("Список животных уже пуст.");
        }
    }

    static void checkAnimal(ArrayList<String> animals, Scanner scanner) {
        System.out.print("Введите название животного: ");
        String animalName = scanner.nextLine();
        if (animals.contains(animalName)) {
            System.out.println("Животное " + animalName + " есть в зоопарке.");
        } else {
            System.out.println("Животного " + animalName + " нет в зоопарке.");
        }
    }
}