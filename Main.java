import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("What is your hobby");
        var hobby = userinput.nextLine();
        System.out.println("What is your favorite music genre");
        var genre = userinput.nextLine();
        System.out.println("What is your favorite thing to talk about?");
        var favthing = userinput.nextLine();
        String[] hueylikes = {"Coding","Techno","Cooking"};
        String[] annalikes = {"UI/UX","Sad Music","News"};
        var recommendationtowardhuey = 0;
        var recommendationtowardsanna = 0;
        var hobbyequalshuey = Arrays.stream(hueylikes).anyMatch(hobby::equals);
        var genreequalshuey = Arrays.stream(hueylikes).anyMatch(genre::equals);
        var favthinghuey = Arrays.stream(hueylikes).anyMatch(favthing::equals);
        var hobbyequalsanna = Arrays.stream(annalikes).anyMatch(hobby::equals);
        var genreequalsanna = Arrays.stream(annalikes).anyMatch(genre::equals);
        var favthinganna = Arrays.stream(annalikes).anyMatch(favthing::equals);
        if(favthinganna == true){
            recommendationtowardsanna++;
        }
        if(hobbyequalsanna == true){
            recommendationtowardsanna++;
        }
        if(genreequalsanna == true){
            recommendationtowardsanna++;
        }
        if(hobbyequalshuey == true){
            recommendationtowardhuey++;
        }
        if(genreequalshuey == true){
            recommendationtowardhuey++;
        }
        if(favthinghuey == true){
            recommendationtowardhuey++;
        }
        if(recommendationtowardhuey > recommendationtowardsanna){
            System.out.println("We have found a match: Huey!");
        }
        else{
            System.out.println("We have found a match: Anna!");
        }
    }
}
