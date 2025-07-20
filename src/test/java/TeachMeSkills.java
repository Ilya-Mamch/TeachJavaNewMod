import org.testng.Assert;
import org.testng.annotations.Test;

public class TeachMeSkills {

  public static String checkNumber(int number) {
    if (number % 3 == 0) {
      return "TMS";
    } else if (number % 5 == 0) {
      return "M";
    } else if (number % 3 == 0 && number % 5 == 0) {
      return "T";
    } else {
      return "blablabla";
    }
  }


  @Test
  public void test1(){
    Assert.assertEquals(checkNumber(3), "TMS");
  }

  @Test
  public void test2(){
    Assert.assertEquals(checkNumber(5), "M");
  }

  @Test
  public void test3(){
    Assert.assertEquals(checkNumber(15), "T");
  }

  @Test
  public void test4(){
    Assert.assertEquals(checkNumber(4), "blablabla");
  }


  tetsdagyduf9agufdiuydfag







}


