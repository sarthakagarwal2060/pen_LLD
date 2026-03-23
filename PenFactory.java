public class PenFactory {

    public static Pen getPen(String type, String color, String mechanism) {

        RefillStrategy refill = new SimpleRefill();

        StartStrategy start;

        if(mechanism.equals("with-cap")) start = new Cap();
        else start = new Click();

        if(type.equals("ink-pen")) {
            return new InkPen(color, refill, start);
        }
        else if(type.equals("ball-pen")) {
            return new BallPen(color, refill, start);
        }

        throw new IllegalArgumentException("Unknown pen type");
    }
}