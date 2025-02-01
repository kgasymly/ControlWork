class ElevatorCall implements Call {
    private Elevator[] elevators;

    public ElevatorCall(Elevator[] elevators) {
        this.elevators = elevators;
    }

    @Override
    public void makeCall(int floor) throws Exception {
        boolean allBusy = true;
        for (Elevator elevator : elevators) {
            if (elevator.state == ElevatorState.STATIONARY || elevator.state == ElevatorState.OUT_OF_ORDER) {
                allBusy = false;
                elevator.call(floor);
                return;
            }
        }
        if (allBusy) {
            throw new Exception("Все лифты заняты!" + " Лифт № " + floor);
        }
    }
}
