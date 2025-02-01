class OddFloorElevator extends Elevator {
    public OddFloorElevator() {
        this.state = ElevatorState.STATIONARY;
    }

    @Override
    public void call(int floor) {
        if (floor % 2 != 0) {
            this.destinationFloor = floor;
            this.state = ElevatorState.MOVING_UP;// Пример: движется вверх
            System.out.println("Лифт поднимается");
        } else if (floor % 2 != 0) {
            this.destinationFloor = floor;
            this.state = ElevatorState.MOVING_DOWN;
            System.out.println("Лифт спускается");
        } else if (floor % 2 != 0) {
            this.destinationFloor = floor;
            this.state = ElevatorState.STATIONARY;
            System.out.println("Лифт бездействует");
        } else {
            throw new IllegalArgumentException("Невозможно вызвать лифт для нечетного этажа на четный этаж." + " Лифт № " + floor);
        }
    }
}