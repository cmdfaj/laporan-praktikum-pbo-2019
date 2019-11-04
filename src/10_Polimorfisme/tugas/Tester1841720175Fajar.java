package tugas;

public class Tester1841720175Fajar {

    public static void main(String[] args) {
        WalkingZombie1841720175Fajar wz = new WalkingZombie1841720175Fajar(100, 1);
        JumpingZombie1841720175Fajar jz = new JumpingZombie1841720175Fajar(100, 2);
        Barrier1841720175Fajar b = new Barrier1841720175Fajar(100);
        Plant1841720175Fajar p = new Plant1841720175Fajar();
        System.out.println("" + jz.getZombieInfoFajar());
        System.out.println("" + b.getBarrierInfoFajar());
        System.out.println("---------------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroyFajar(wz);
            p.doDestroyFajar(jz);
            p.doDestroyFajar(b);
        }
        System.out.println("" + wz.getZombieInfoFajar());
        System.out.println("" + jz.getZombieInfoFajar());
        System.out.println("" + b.getBarrierInfoFajar());

    }
}
