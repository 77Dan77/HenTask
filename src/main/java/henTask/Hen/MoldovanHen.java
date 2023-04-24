package henTask.Hen;

public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 36;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна Молдова, я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
