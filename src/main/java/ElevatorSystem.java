import java.util.Random;

class ElevatorSystem {
    private Elevator[] elevators;

    public ElevatorSystem() {
        elevators = new Elevator[7];
        for (int i = 0; i < 3; i++) {
            elevators[i] = new EvenFloorElevator();
        }
        for (int i = 3; i < 6; i++) {
            elevators[i] = new OddFloorElevator();
        }
        elevators[6] = new StaffElevator();
    }

    public void runSimulation() {
        Random random = new Random();
        ElevatorCall elevatorCall = new ElevatorCall(elevators);

        for (int i = 0; i < 10000; i++) {
            if (i % 20 == 0) {
                int requestedFloor = random.nextInt(16) + 1; // Заказ на случайный этаж (от 1 до 16)
                try {
                    elevatorCall.makeCall(requestedFloor);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            for (Elevator elevator : elevators) {
                elevator.step(); // Обработка движения лифтов
            }
        }
    }
}