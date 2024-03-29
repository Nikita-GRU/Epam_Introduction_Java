package epam.introduction.module4.task1_4;

//4.  Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте  возможность вывода информации о поезде,  номер которого введен пользователем.
//Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
//назначения должны быть упорядочены по времени отправления.
public class RailwayStation {
    private Train[] trains;

    public RailwayStation(Train[] trains) {
        this.trains = trains;
    }

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }
}
