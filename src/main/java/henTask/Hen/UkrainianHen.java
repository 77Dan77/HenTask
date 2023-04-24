package henTask.Hen;

public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна Украина, я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
