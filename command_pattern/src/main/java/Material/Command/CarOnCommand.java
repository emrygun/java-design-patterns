package Material.Command;

import Material.Car;

public class CarOnCommand implements Command{
    private Car car;

    public CarOnCommand(Car car) {
        this.car = car;
    }

    public void execute() {
        car.drive();
    }
}
