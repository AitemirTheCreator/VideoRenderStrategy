package videorender;

public class Main {

    public static void main(String[] args) {

        String video = "MyVideo.mp4";

        VideoRenderer renderer =
                new VideoRenderer(new FastRenderStrategy());

        renderer.renderVideo(video);

        System.out.println("----------------");

        renderer.setStrategy(new QualityRenderStrategy());
        renderer.renderVideo(video);

        System.out.println("----------------");

        renderer.setStrategy(new BalancedRenderStrategy());
        renderer.renderVideo(video);
    }
}
