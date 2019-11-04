package tugas;

public class Plant1841720175Fajar {

    public void doDestroyFajar(IDestroyable1841720175Fajar d) {
        if (d instanceof WalkingZombie1841720175Fajar) {
            WalkingZombie1841720175Fajar wz = (WalkingZombie1841720175Fajar) d;
            wz.destroyedFajar();
        } else if (d instanceof JumpingZombie1841720175Fajar) {
            JumpingZombie1841720175Fajar jz = (JumpingZombie1841720175Fajar) d;
            jz.destroyedFajar();
        } else if (d instanceof Barrier1841720175Fajar) {
            Barrier1841720175Fajar br = (Barrier1841720175Fajar) d;
            br.destroyedFajar();
        }
    }
}
