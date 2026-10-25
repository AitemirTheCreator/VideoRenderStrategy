package videorender;

public class BalancedRenderStrategy implements RenderStrategy {

    @Override
    public void render(String videoName) {
        System.out.println("Balanced rendering: " + videoName);
        System.out.println("Using balanced speed and quality.");
    }
}

