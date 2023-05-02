package ru.job4j.enumeration;

public class CarService {

    private enum StatusPrivate {
        ACCEPTED,
        IN_WORK,
        WAITING,
        FINISHED
    }

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo);

        System.out.println(System.lineSeparator() + "Создаем объекты");
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order.getNumber() + " на автомобиль " + order.getCar()
                            + ", статус ремонта: " + order.getStatus().getInfo() + ", подробности: " + order.getStatus().getMessage());

        System.out.println(System.lineSeparator() + "Встроенные методы класса Enum");
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }
        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        System.out.println(status);
    }
}
