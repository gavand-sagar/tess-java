public class GamingPCAssembly extends PCAssembly{

    @Override
    public void installPCB() {
        System.out.println("Gaming MotherBoard Added");
    }

    @Override
    public void installRAM() {
        System.out.println("32 GB RAM added");
    }

    @Override
    public void installHDD() {
        System.out.println("SSD added");
    }
}
