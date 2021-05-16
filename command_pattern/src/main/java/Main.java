import Material.Car;
import Material.Command.CarOnCommand;
import Material.Command.LightOnCommand;
import Material.Light;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Car car = new Car();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        CarOnCommand carOnCommand = new CarOnCommand(car);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.setCommand(carOnCommand);

        remoteControl.buttonWasPressed();
    }
}
