package epam.introduction.module4.task1_5;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющий
// получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class DecimalCounterView {
    public DecimalCounterView() {
    }

    public void printValue(DecimalCounter decimalCounter) {
        System.out.println("Current value=" + decimalCounter.getValue());
    }
}