package servicedependency;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

public class ServiceControllerDependencyTest {

    @Test
    void servicesShouldNotDependOnControllers() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("com.colak");

        ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..service..")
                .should().dependOnClassesThat().resideInAPackage("..controller..")
                .allowEmptyShould(true)  // This allows the rule to pass even if no matching classes are found
                .check(importedClasses);
    }
}
