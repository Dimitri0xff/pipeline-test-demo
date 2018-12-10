import static org.junit.Assert.assertTrue

import org.junit.*

import com.lesfurets.jenkins.unit.BasePipelineTest

class PipelineTest extends BasePipelineTest {

    @Before
    void setup() {
        super.setUp()
        helper.registerAllowedMethod("jenkins.model.Jenkins.instance.getAllItems", [Map.class], {c -> ['retA', 'retB']})
    }

    @Test
    void should_return_true() {
        def script = loadScript('src/main/groovy/pipeline.groovy')
        script.execute()
        printCallStack()
        assertTrue(true)
    }

}