package myfit.flowmode;

import fit.Fixture;
import fitlibrary.DoFixture;
import myfit.SetupFixtureTest;
import myfit.TestColumnFixture;

import java.util.Arrays;
import java.util.List;

/**
 * author yg
 * description
 * date 2020/11/23
 */
public class DoFixtureFlowTest extends DoFixture {
    public Fixture preparePlayers() {
        return new SetupFixtureTest();
    }

    public List<Player> listPlayers() {
        return PlayerHolder.players;
    }

    public Fixture testQuotient(int numerator) {
        TestColumnFixture testColumnFixture = new TestColumnFixture();
        testColumnFixture.setNumerator(numerator);
        return testColumnFixture;
    }

    public String letters;
    public void fillTimesWith(int count,char c){
        char[] arr=new char[count];
        Arrays.fill(arr,c);
        letters=new String(arr);
    }

    //return boolean mean it will be a test result
    public boolean charAtWith(int position, char c){
        return letters.charAt(position)==c;
    }
    public void setList(char[] array){
        letters=new String(array);
    }
    public char charAt(int position){
        return letters.charAt(position);
    }
}


