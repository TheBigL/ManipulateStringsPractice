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

    public static void urlify(char[] string, int length)
    {
        int spaceCount = 0, index = 0, i = 0;

        for(i = 0; i < length - 1; i++)
        {
            if(string[i] == ' ')
                spaceCount++;
        }

        index = length + spaceCount * 2;
        if(length < string.length)
        {
            string[index] = '\0';
        }



        for(i = length - 1; i >= 0; i--)
        {
            if(string[i] == ' ')
            {
                string[index - 1] = '0';
                string[index - 2] = '2';
                string[index - 3] = '%';
                index -= 3;
            }

            else
            {
                string[index - 1] = string[i];
                index -= 1;
            }
        }

        System.out.println(string.toString());
    }


    public static int findLastCharacter(char[] string)
    {
        for(int i = string.length - 1; i >= 0; i--)
        {
            if(string[i] == ' ')
            {
                return i;
            }
        }

        return -1;

    }

    public static boolean oneAwayEditInsert(String s1, String s2)
    {
        int index1 = 0;
        int index2 = 0;

        while(index1 < s1.length() && index2 < s2.length())
        {
            if(s1.charAt(index1) != s2.charAt(index2))
            {
                if(index1 != index2)
                    return false;
                else
                {
                    index2++;
                }
            }

            else
            {
                index1++;
                index2++;
            }
        }

        return true;

    }

    public static boolean oneEditAwayReplace(String s1, String s2)
    {

        boolean foundDifference = false;

        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                if(foundDifference)
                {
                    return false;
                }

                foundDifference = true;
            }
        }

        return true;
    }




    public static void main(String[] args)
    {
        String s1 = "leban";
        String s2 = "james";
       boolean  isTransformable = canTransform(s1, s2);

       if(isTransformable)
           System.out.println("You can Transform this String!");
       else
           System.out.println("Sorry, there's no way to transform this string.");
       String query = "Hirokazu Tanaka";
       char[] cQuery = query.toCharArray();
       int realLastChar = findLastCharacter(cQuery) + 1;
       urlify(cQuery, realLastChar);
    }

}
