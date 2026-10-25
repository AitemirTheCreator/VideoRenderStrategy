package videorender;

public class QualityRenderStrategy implements RenderStrategy {

    @Override
    public void render(String videoName) {
        System.out.println("High quality rendering: " + videoName);
        System.out.println("Using maximum quality settings.");
    }
}
