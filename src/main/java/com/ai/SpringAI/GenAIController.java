package com.ai.SpringAI;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class GenAIController {

    private final ChatService chatService;
    private final ImageService imageService;
    private final  RecipeService recipeService;

    public GenAIController(ChatService chatService, ImageService imageService, RecipeService recipeService) {
        this.chatService = chatService;
        this.imageService = imageService;
        this.recipeService = recipeService;
    }

    @GetMapping("/ask-ai")
    public String getResponse(@RequestParam String prompt){
        return chatService.getResponse(prompt);
    }

    @GetMapping("/ask-ai-options")
    public String getResponseOptions(@RequestParam String prompt){
        return chatService.getResponseOptions(prompt);
    }

    @GetMapping("/generate-image")
    public void generateImages(HttpServletResponse response,
                               @RequestParam String prompt,
                               @RequestParam(defaultValue = "hd") String quality,
                               @RequestParam(defaultValue = "1") int n,
                               @RequestParam(defaultValue = "1024") int width,
                               @RequestParam(defaultValue = "1024") int height) throws IOException {

        ImageResponse imageResponse = imageService.generateImage(prompt, quality, n, width, height);
        String imageUrl = imageResponse.getResult().getOutput().getUrl();
        response.sendRedirect(imageUrl);
    }

    @GetMapping("/recipe-creator")
    public String recipeCreator(@RequestParam String ingredients,
                              @RequestParam(defaultValue = "any") String cuisine,
                              @RequestParam(defaultValue = "none") String dietaryRestrictions){

        return recipeService.createRecipe(ingredients, cuisine, dietaryRestrictions);
    }
}
