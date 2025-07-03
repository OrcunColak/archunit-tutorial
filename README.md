Old style

```java

@org.junit.jupiter.api.Test
void servicesShouldNotAccessControllers() {
    JavaClasses importedClasses = new ClassFileImporter().importPackages("com.example");

    ArchRule rule = noClasses()
            .that().resideInAPackage("..service..")
            .should().accessClassesThat().resideInAPackage("..controller..");

    rule.check(importedClasses);
}
```

New style

```java

@AnalyzeClasses(packages = "com.example")
public class ArchitectureTest {

    @ArchTest
    static final ArchRule no_service_access_to_controller =
            noClasses().that().resideInAPackage("..service..")
                    .should().accessClassesThat().resideInAPackage("..controller..");
}
```