class ElevatorCall implements Call {
    private Elevator[] elevators;

    public ElevatorCall(Elevator[] elevators) {
        this.elevators = elevators;
    }

    @Override
    public void makeCall(int floor) throws Exception {
        boolean allBusy = true;
        for (Elevator elevator : elevators) {
            if (elevator.state == ElevatorState.STATIONARY) {
                allBusy = false;
                elevator.call(floor);
                return;
            }
        }
        if (allBusy) {
            throw new Exception("Все лифты заняты!");
        } else {}
    }
}
