package wordcount;

public class Words
{
    private String word;
   
  

public Words(String word)
{
    this.word = word;
    

}

public String getWord()
{
    return word;
}

public void setWord(String word)
{
    this.word = word;
}

// public int getCount()
// {
//     return count;
// }

// public void setCount(int count)
// {
//    this.count = count;
// }

@Override 
public String toString()
{
    return "words";
}

}