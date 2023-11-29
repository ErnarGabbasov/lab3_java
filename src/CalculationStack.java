import java.util.Stack;

public class CalculationStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Добавление элемента в стек
        stack.push(5);
        stack.push(10);
        stack.push(15);

        int result = stack.pop(); // Извлечение последнего элемента
        System.out.println("Result: " + result);

        int topElement = stack.peek(); // Получение верхнего элемента без удаления
        System.out.println("Top Element: " + topElement);

        boolean isEmpty = stack.isEmpty(); // Проверка, пустой ли стек
        System.out.println("Is Stack Empty: " + isEmpty);

        int size = stack.size(); // Получение количества элементов в стеке
        System.out.println("Stack size: " + size);

        stack.clear(); // Очистка стека

        isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty: " + isEmpty);
    }
}
