package human;

public class Human {
    private final String skin_color = "Skin Color: Tan";
    private final String eye_color = "Eye Color: Brown";
    private final String gender = "Gender: Girl";
    private final String height = "Height: 155";
    private final String weight = "Weight: 50";
    private final String age = "Age: 19";
    private final String race = "Race: Asian";
    private final String name = "Name: Maria Lara";
       
    public static void main(String[] args) {
       
        Human H = new Human ();
        Children C = new Children();
       
        System.out.println(H.skin_color);
        System.out.println(H.eye_color);
        System.out.println(H.gender);
        System.out.println(H.height);
        System.out.println(H.weight);
        System.out.println(H.age);
        System.out.println(H.race);
        System.out.println(H.name);
        System.out.println(C.intellegience_rating);
        System.out.println(C.mood_rating);
        System.out.println(C.genetic_disease[0]);
        System.out.println(C.wealth_rating);
    }  
}
