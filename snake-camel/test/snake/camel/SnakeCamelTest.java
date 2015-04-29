package snake.camel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelTest {
	@Test
	public void snakeToCamelcase(){
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected="AraSesPop";
		String actual=snake.snakeToCamelcase("ara_ses_pop");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecase(){
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected="ara_ses_pop";
		String actual=snake.camelToSnakecase("AraSesPop");
		assertThat(actual,is(expected));
	}
	@Test
	public void capitalize(){
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected="Aaaaa";
		String actual=snake.capitalize("aaaaa");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalize(){
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected="aaaaa";
		String actual=snake.uncapitalize("Aaaaa");
		assertThat(actual,is(expected));
	}
}
