package tugas;

public class Barrier1841720175Fajar implements IDestroyable1841720175Fajar {

    private int strength;

    public Barrier1841720175Fajar(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyedFajar() {
        strength = strength - (10 * strength / 100);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getBarrierInfoFajar() {
        String info = "Barrier Strength: " + strength;
        return info;
    }
}
