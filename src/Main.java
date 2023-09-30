public class Main {
        public static void main(String[] args) {

                PCAssembly p = new GamingPCAssembly();
                p.assemble();

                System.out.println();
                System.out.println();
                System.out.println("=======================");

                PCAssembly r = new RegularPCAssembly();
                r.assemble();





        }
}