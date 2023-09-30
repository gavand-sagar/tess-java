public class RegularPCAssembly extends PCAssembly{
    @Override
    public void installPCB() {
        System.out.println("Regular PCB Added");
    }

    @Override
    public void installRAM() {
        System.out.println("8 GB RAM Added");
    }

    @Override
    public void installHDD() {
        System.out.println("HDD added.");
    }
}
