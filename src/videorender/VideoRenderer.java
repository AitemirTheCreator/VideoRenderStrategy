package videorender;

public class VideoRenderer {

    private RenderStrategy strategy;

    public VideoRenderer(RenderStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RenderStrategy strategy) {
        this.strategy = strategy;
    }

    public void renderVideo(String videoName) {
        strategy.render(videoName);
    }
}
