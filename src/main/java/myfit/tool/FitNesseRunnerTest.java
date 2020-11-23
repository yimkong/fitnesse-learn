package myfit.tool;

import fitnesse.junit.FitNesseRunner;
import org.junit.runner.RunWith;

/**
 * author yg
 * description
 * date 2020/11/17
 */
@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("LearningSuit.FlowModeSuitTest.SimplePlayerTest")
@FitNesseRunner.FitnesseDir(value = ".",systemProperty = "C:\\project\\fitnesse-learn\\FitNesseRoot")
@FitNesseRunner.OutputDir("./build/fitnesse-results")
public class FitNesseRunnerTest {
}
