package objects_task;

public class Student {

    private int potions;
    private int magicHistory;
    private int herbology;
    private int transfigurationlogy;

    public Student(int potions, int magicHistory, int herbology, int transfigurationlogy) {
        this.potions = potions;
        this.magicHistory = magicHistory;
        this.herbology = herbology;
        this.transfigurationlogy = transfigurationlogy;
    }

    public int examScore() {
        return potions + magicHistory + herbology + transfigurationlogy;
    }

}
