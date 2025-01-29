public class SearchChar {
    public static void main(String[] args) {
        String name = "Karan";
        char target = 'a';

        boolean ans = findchar(name, target);
        System.out.println(ans);
    }

    static boolean findchar(String name, char target){
        if (name.isEmpty()){
            return false;
        }

        for (int i = 0; i < name.length(); i++){
            if (target == name.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
