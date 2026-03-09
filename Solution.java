class Solution
{
    public static void main()
    {
        String word="LeEtcOde";
        String vowel="aeiouAEIOU";
        String vowelString="";
        for(char c:word.toCharArray())
        {
            if(vowel.indexOf(c)!=-1)
            {
                vowelString+=c;
            }
        }
        char Array[]=word.toCharArray();
        char[] s=vowelString.toCharArray();
        for(int i=0;i<s.length-1;i++)
        {
            for(int j=0;j<s.length-1-i;j++)
            {
                if(s[j]>s[j+1]  && vowel.indexOf(s[j])!=-1 && vowel.indexOf(s[j+1])!=-1)
                {
                    char temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<Array.length;i++)
        {
            if(vowel.indexOf(Array[i])!=-1)
            {
                Array[i]=s[count++];
            }
        }
    for(char c:Array)
    {
        System.out.print(c);   
    }
}
}