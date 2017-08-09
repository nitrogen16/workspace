package interfacesSaveUs;

public class ElectricPowerSwitch {
    private Switchable securitySystem;

    public ElectricPowerSwitch(Switchable securitySystem) {
        this.securitySystem = securitySystem;
    }

    public void press() {
        System.out.println("Pressed the power switch.");
        if (securitySystem.isOn()) {
            securitySystem.turnOff();
        } else {
            securitySystem.turnOn();
        }
    }
}