package tugas;

public class JumpingZombie1841720175Fajar extends Zombie1841720175Fajar {

    public JumpingZombie1841720175Fajar(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healfajar() {
        switch (level) {
            case 1:
                health = health + (30 / 100 * health);
                break;
            case 2:
                health = health + (40 / 100 * health);
                break;
            case 3:
                health = health + (50 / 100 * health);
                break;
        }
    }

    @Override
    public void destroyedFajar() {
//        health-=health*0.01;
        health = (int) (health - (health * 0.01));
    }

    @Override
    public String getZombieInfoFajar() {
        String info = "Jumping Zombie Data: \nHealth = " + health + "\nLevel = " + level;
        return info;
    }

}
