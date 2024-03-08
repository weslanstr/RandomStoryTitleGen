/*Silly attempt at a title generator
*
*
Actually made this to help me think of a
title for my third story, hope it helps you too!
Thanks! (≧∇≦)/

Originally wrote in C++
Remade in Java for practice
*
*
*/

import java.util.*;

public class Title
{
    public static void main(String[] args) {
        Title T = new Title();
        T.Titles();
    }

    String adjectives[] = {
            "Ethereal", "Eternal", "Original",
            "Time", "Greatest", "Mystic",
            "Infinite", "Infinity", "Oldest",
            "First", "Forgotten", "Last",
            "Deep", "Dark", "Darkest",
            "Eclipse", "Lone", "Unknowable",
            "Rogue", "Ageless", "Love",
            "Reality", "Solemn", "Timeless",
            "All", "Hopeless", "Ego",
            "God", "Signal", "Forever",
            "Great", "Prime", "Death",
            "End", "Apocalypse", "Grim",
            "Forsaken", "Grave", "Unlimited",
            "Inward", "Wisest", "Fallen",
            "Cosmic", "Stellar", "Star",
            "Myth", "Mystery", "Existence",
            "Youth", "Deepest", "Early",
            "Bliss", "Beautiful", "World",
            "Beauty", "Deadliest", "Enduring",
            "Dream", "Nameless", "Kindest",
            "Mind", "Rage", "Soul"};
    String nouns[] = {
            "Killer", "Whisper", "Hunter",
            "Marker", "Lover", "Jester",
            "Euphoria", "Magician", "Fighter",
            "Writer", "King", "Wizard",
            "Witch", "Master", "Lord",
            "Child", "Teacher", "Walker",
            "Proffessor", "Thinker", "Engineer",
            "Artist", "Dreamer", "Fool",
            "Maker", "Death", "Seeker",
            "Ego", "Crafter", "Mage",
            "Visionary", "Mother", "Father",
            "Sister", "Brother", "Guardian",
            "Horror", "Thing", "Nomad",
            "Queen", "Pioneer", "Ghost",
            "Voyager", "Scientist", "Finder",
            "Reaper", "Soul", "Believer",
            "Myth", "Home", "Destoryer",
            "Spirit", "Witness", "Tracer",
            "Threat", "Heritic", "Eater",
            "Keeper", "Syndicate", "Savior",
            "Runner", "Sage", "Traveller",
            "Taker", "Giver", "Warrior",
            "Sleeper", "Mind", "Weaver",
            "Listener", "Speaker", "Voice",
            "Phantom", "Shadow", "Vision",
            "Priest", "Saint", "Wanderer",
            "Singer", "Dancer", "Pioneer"};

    Title(){
        Random rand = new Random();
        System.out.println("By Wesley Lancaster 11/28/23\n"
                + "-------------------\n");

        for(int i = 0; i < 10; i++){
            System.out.println("The " + adjectives[rand.nextInt(adjectives.length)]
                    + " " + nouns[rand.nextInt(adjectives.length)] + "\n");
        }
        System.out.println("-------------------");
    }

    void Titles(){
        System.out.println("\n" + adjectives.length * nouns.length + " Total Combinations:\n");


        for(int i = adjectives.length-1; i >= 0; i--){
            for(int j = nouns.length-1; j >= 0; j--){
                System.out.println("The " + adjectives[i] + " " +
                        nouns[j]);
            }
            System.out.println("");
        }
    }
}