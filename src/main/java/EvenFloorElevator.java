class EvenFloorElevator extends Elevator {
    public EvenFloorElevator() {
        this.state = ElevatorState.STATIONARY;
    }

    @Override
    public void call(int floor) {
        if (floor % 2 == 0) {
            this.destinationFloor = floor;
            this.state = ElevatorState.MOVING_UP; // Пример: движется вверх
        } else if (floor % 2 == 0) {
            this.destinationFloor = floor;
            this.state = ElevatorState.MOVING_DOWN; // Пример: движется вниз
        } else {
            throw new IllegalArgumentException("Невозможно вызвать лифт для четного этажа на нечетный этаж." + " Лифт № " + floor);
        }
    }
}