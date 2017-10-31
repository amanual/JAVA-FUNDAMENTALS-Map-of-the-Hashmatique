import java.util.*;
public class Hashmap{
    public void hashMap(){
        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("The Climb","I can almost see it That dream I am dreaming\n But there's a voice inside my head saying\n You'll never reach it ....");
                                    
        userMap.put("All of me", "What would I do without your smart mouth?\n Drawing me in, and you kicking me out\n You've got my head spinning, no kidding,\n I can't pin you down ....");
                                   
        userMap.put("Glory","One day when the glory comes\n It will be ours, it will be ours\n Oh one day when the war is won\n We will be sure, we will be sure .....");
                                   
        userMap.put("Rise up","You're broken down and tired\n Of living life on a merry go round\n And you can't find the fighter\n But I see it in you so we gonna walk it out....");
                                   
        String song = userMap.get("All of me");
        System.out.println("Lyrics: " + song);
        // for(HashMap.Entry<String, String> entry : userMap.entrySet()){            //this forloop also works and can be used as well instead of userMap.forEach()...
        //     System.out.println("\n" + entry.getKey() + " : " + entry.getValue());
        // }
        userMap.forEach((k,v) -> System.out.println("\n" + k + " : " + v));
    }
    public static void main(String[] args){
        Hashmap newSongs = new Hashmap();
        newSongs.hashMap();
    }
}