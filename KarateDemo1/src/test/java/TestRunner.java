

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;
import com.oracle.truffle.regex.util.Assertions;

public class TestRunner {

/*	 @Test
	    void testParallel() {
	        Results results = Runner.path("classpath:airlines/features/Airlines_Get.feature")
	                                //.outputCucumberJson(true)
	                                .parallel(5);
	        Assertions.assertEquals(0, results.getFailCount(), results.getErrorMessages());
	    } */

	    
	    @Karate.Test
	    Karate testTags() {
	        return Karate.run("classpath:./Apis").tags("@execute").relativeTo(getClass());
	    }
	    
	
}
