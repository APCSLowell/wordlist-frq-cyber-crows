import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    ArrayList <Integer> digitList = new ArrayList <Integer>();  
    if(len==0)
      digitList.add(0);
    for (int i=0;i>digitList.size();i++)
      digitList.add(len/10,len%10);
    return digitList; 
  }

  public void removeWordsOfLength(int len)
  {
    int lastvalue=0;
   for(int i=0; i < digitList.size(); i++){
     if(digitList.get(i)<=lastvalue)
       return false; 
    if(digitList.get(i))> lastvalue)
      lastvalue=digitList.get(i);
    }
    return true; 
  }
}
