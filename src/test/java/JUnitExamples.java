import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Here is beforeAll()");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Here is beforeEach()");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Here is afterEach()");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Here is afterAll()");
    }

    @Test
    void fistTest(){
        System.out.println("Here is fistTest()");
    }

    @Test
    void secondTest(){
        System.out.println("Here is secondTest()");
    }
}
