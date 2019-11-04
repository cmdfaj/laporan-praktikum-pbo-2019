package tugas;

public class WalkingZombie1841720175Fajar extends Zombie1841720175Fajar {

    public WalkingZombie1841720175Fajar(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healfajar() {
        switch (level) {
            case 1:
                health = health + (20 * health / 100);
                break;
            case 2:
                health = health + (30 * health / 100);
                break;
            case 3:
                health = health + (40 * health / 100);
                break;
        }
    }

    @Override
    public void destroyedFajar() {
//        health-=health*0.02;
        health = (int) (health - (health * 0.02));
    }

    @Override
    public String getZombieInfoFajar() {
        String info = "Walking Zombie Data: \nHealth = " + health + "\nLevel = " + level;
        return info;
    }
}
