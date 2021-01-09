package myfit;

import fitlibrary.SequenceFixture;

import java.util.Arrays;

public class SequenceFixtureTest extends SequenceFixture {
    public String letters;
    public void fill(int count,char c){
        char[] arr=new char[count];
        Arrays.fill(arr,c);
        letters=new String(arr);
    }
    public void setList(char[] array){
        letters=new String(array);
    }
    public char charAt(int position){
        return letters.charAt(position);
    }
}
