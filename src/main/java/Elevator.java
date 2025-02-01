import java.util.Random;

abstract class Elevator implements ElevatorStatus {
    protected ElevatorState state;
    protected int currentFloor = 1; // Начинаем с 1-го этажа
    protected Integer destinationFloor = null; // Этаж назначения

    public abstract void call(int floor);

    @Override
    public ElevatorState state() {
        return state;
    }

    public void step() {
        switch (state) {
            case MOVING_UP:
                if (currentFloor < destinationFloor) {
                    currentFloor++;
                }
                break;
            case MOVING_DOWN:
                if (currentFloor > destinationFloor) {
                    currentFloor--;
                }
                break;
            case STATIONARY:
            case OUT_OF_ORDER:
                // Ничего не делаем
                break;
        }
    }
}