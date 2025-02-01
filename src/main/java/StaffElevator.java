class StaffElevator extends Elevator {
    public StaffElevator() {
        this.state = ElevatorState.STATIONARY;
    }

    @Override
    public void call(int floor) {
        this.destinationFloor = floor; // Сотрудник может вызывать на любой этаж
        this.state = ElevatorState.MOVING_UP;// Пример: движется вверх
    }
}