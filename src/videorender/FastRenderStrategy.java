package videorender;

public class FastRenderStrategy implements RenderStrategy {

    @Override
    public void render(String videoName) {
        System.out.println("Fast rendering: " + videoName);
        System.out.println("Using low quality for faster speed.");
    }
}
