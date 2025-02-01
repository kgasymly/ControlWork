class StaffElevator extends Elevator {
    public StaffElevator() {
        this.state = ElevatorState.STATIONARY;
    }

    @Override
    public void call(int floor) {
        if (floor % 1 == 0) {
            this.destinationFloor = floor;// Сотрудник может вызывать на любой этаж
            this.state = ElevatorState.MOVING_UP;// Пример: движется вверх
            System.out.println("Лифт поднимается");
        } else if (floor % 1 == 0) {
            this.destinationFloor = floor;
            this.state = ElevatorState.MOVING_DOWN;
            System.out.println("Лифт спускается");
        } else if (floor % 1 == 0) {
            this.destinationFloor = floor;
            this.state = ElevatorState.STATIONARY;
            System.out.println("Лифт бездействует");
        } else {
            throw new IllegalArgumentException("Невозможно вызвать лифт сотрудника, возможно сломан " + " Лифт № " + floor);
        }
    }
}