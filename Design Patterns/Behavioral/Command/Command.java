package Behavioral.Command;


// Step 1: Defining the Command interface
interface RemoteCommand {
    void execute();
}

// Step 2: Creating ConcreteCommand classes
class LightOnCommand implements RemoteCommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

class FanOffCommand implements RemoteCommand {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.turnOff();
    }
}

// Step 3: Creating Receiver classes
class Light {
    void turnOn() {
        System.out.println("Light is on");
    }

    void turnOff() {
        System.out.println("Light is off");
    }
}

class Fan {
    void turnOn() {
        System.out.println("Fan is on");
    }

    void turnOff() {
        System.out.println("Fan is off");
    }
}

// Step 4: Creating the Invoker class
class RemoteControl {
    private RemoteCommand command;

    public void setCommand(RemoteCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Step 5: Client code
public class Command {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Fan bedroomFan = new Fan();

        RemoteCommand lightOn = new LightOnCommand(livingRoomLight);
        RemoteCommand fanOff = new FanOffCommand(bedroomFan);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton(); // Turns on the light

        remote.setCommand(fanOff);
        remote.pressButton(); // Turns off the fan
    }
}

