package henTask.Hen;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 33;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна Беларусь, я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
