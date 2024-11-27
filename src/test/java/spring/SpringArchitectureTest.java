package spring;

public class SpringArchitectureTest {

    // This test ensures that service classes do not directly access controller classes,
    // @Test
    // void servicesShouldNotAccessControllers() {
    //     JavaClasses importedClasses = new ClassFileImporter().importPackages("com.colak");
    //
    //     ArchRuleDefinition.noClasses()
    //             .that().areAnnotatedWith(Service.class)
    //             .should().accessClassesThat().areAnnotatedWith(Controller.class)
    //             .check(importedClasses);
    // }
}
