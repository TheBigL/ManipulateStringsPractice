public class Main
{
    //The canTransform method will determine if it is possible
    public static boolean canTransform(String s1, String s2)
    {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();


        for(int i = 0; i < c1.length; i++)
        {
            if(i != c1.length - 1)
            {
                if(c1[i] == c1[i + 1] && c2[i] != c2[i + 1])
                {
                    return false;
                }
            }

        }
        return true;
    }




    public static void main(String[] args)
    {
       boolean  isTransformable = canTransform("leban", "yusif");

       if(isTransformable)
           System.out.println("You can Transform this String!");
       else
           System.out.println("Sorry, there's no way to transform this string.");
    }

}
