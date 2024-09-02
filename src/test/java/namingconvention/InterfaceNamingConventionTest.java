package namingconvention;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

@AnalyzeClasses(packages = "com.colak")
public class InterfaceNamingConventionTest {

    // Define a rule that ensures interfaces end with 'Interface'
    @ArchTest
    public static final ArchRule INTERFACE_NAME =
            ArchRuleDefinition.classes()
                    .that().areInterfaces()
                    .should().haveSimpleNameEndingWith("Interface");

    @ArchTest
    public static final ArchRule EXCEPTION_NAME = ArchRuleDefinition.classes().that()
            .areAssignableTo(Exception.class)
            .should()
            .haveSimpleNameEndingWith("Exception");

}
