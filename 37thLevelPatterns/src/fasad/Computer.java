package fasad;

public class Computer {
    CPU cpu = new CPU();
    Memory memory = new Memory();
    HardDrive hardDrive = new HardDrive();
    
    public void run(){
        cpu.calculate();
        memory.allocate();
        hardDrive.storeData();
    }
}
