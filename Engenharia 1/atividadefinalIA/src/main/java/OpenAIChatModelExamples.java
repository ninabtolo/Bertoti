import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.model.StreamingResponseHandler;
import dev.langchain4j.model.openai.OpenAiStreamingChatModel;
import dev.langchain4j.model.output.Response;

public class OpenAIChatModelExamples {

    public static void main(String[] args) {

        OpenAiStreamingChatModel model = OpenAiStreamingChatModel.withApiKey("lm-studio");

        String prompt = "Write a short funny poem about developers and null-pointers, 10 lines maximum";

        System.out.println("Nr of chars: " + prompt.length());
        System.out.println("Nr of tokens: " + model.estimateTokenCount(prompt));

        model.generate(prompt, new StreamingResponseHandler<AiMessage>() {

            @Override
            public void onNext(String token) {
                System.out.print(token);
            }

            @Override
            public void onComplete(Response<AiMessage> response) {
                System.out.println("\n\nDone streaming");
            }

            @Override
            public void onError(Throwable error) {
                System.out.println("Something went wrong: " + error.getMessage());
            }
        });

    }
}