//- open the cabinet
//- install PCB
//- install processor
//- install ram
//- install HDD
//- close the cabnet etc
public abstract  class PCAssembly {

    public void assemble(){
        openCabinet();
        installPCB();
        installRAM();
        installHDD();
        closingCabinet();
    }

    public void openCabinet(){
        System.out.println("Opening the Cabinet");
    }

    public abstract void installPCB();

    public abstract void installRAM();

    public abstract void installHDD();

    public void closingCabinet(){
        System.out.println("Closing the Cabinet");
    }
}
