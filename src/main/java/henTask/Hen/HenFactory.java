package henTask.Hen;

public class HenFactory {
    public static Hen getHen(String country) {
        Hen hen = null;
        if (country.equals("Belarusian")) {
            hen = new BelarusianHen();
        }

        if (country.equals("Moldova")) {
            hen = new MoldovanHen();
        }

        if (country.equals("Russian")) {
            hen = new RussianHen();
        }

        if (country.equals("Ukraine")) {
            hen = new UkrainianHen();
        }
        return hen;
    }
}
