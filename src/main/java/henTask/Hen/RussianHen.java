package henTask.Hen;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 34;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна Россия, я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
