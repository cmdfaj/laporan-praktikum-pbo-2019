
package tugas;

public class EncapDemo1841720175Fajar {
    private String name;
    private int age;
    public String getNameFajar(){
        return name;
    }
    public void setNamaFajar(String newName){
        name=newName;
    }
    public int getAgeFajar(){
        return age;
    }
    public void setAgeFajar(int newAge){
        if (newAge>30) {
            age=30;
        }else if(newAge<18){
            age=18;
        }else{
            age=newAge;
        }
    }
    
}
